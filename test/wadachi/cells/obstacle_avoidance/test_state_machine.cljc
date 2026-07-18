(ns wadachi.cells.obstacle-avoidance.test-state-machine
  "wadachi 轍 obstacle-avoidance state-machine cljc port."
  (:require [clojure.test :refer [deftest is testing]]
            [wadachi.cells.obstacle-avoidance.state-machine :as sm]))

(deftest chain-reaches-end-at-100pct
  (let [out (sm/run-chain {})]
    (is (= 100 (get-in out ["obstacle_state" "completionPct"])))
    (is (= "avoidance_complete" (get-in out ["obstacle_state" "phase"])))
    (is (= "end" (get out "next_node")))
    (is (contains? out "avoidance_record"))))
