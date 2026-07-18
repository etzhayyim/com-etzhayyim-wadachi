(ns wadachi.cells.motion-control.test-state-machine
  "wadachi 轍 motion-control state-machine cljc port."
  (:require [clojure.test :refer [deftest is testing]]
            [wadachi.cells.motion-control.state-machine :as sm]))

(deftest chain-reaches-end-at-100pct
  (let [out (sm/run-chain {})]
    (is (= 100 (get-in out ["motion_state" "completionPct"])))
    (is (= "motion_complete" (get-in out ["motion_state" "phase"])))
    (is (= "end" (get out "next_node")))
    (is (contains? out "motion_record"))))
