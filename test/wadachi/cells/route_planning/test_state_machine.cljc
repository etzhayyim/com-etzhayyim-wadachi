(ns wadachi.cells.route-planning.test-state-machine
  "wadachi 轍 route-planning state-machine cljc port."
  (:require [clojure.test :refer [deftest is testing]]
            [wadachi.cells.route-planning.state-machine :as sm]))

(deftest chain-reaches-end-at-100pct
  (let [out (sm/run-chain {})]
    (is (= 100 (get-in out ["route_state" "completionPct"])))
    (is (= "trajectory_planned" (get-in out ["route_state" "phase"])))
    (is (= "end" (get out "next_node")))
    (is (contains? out "trajectory_record"))))
