(ns wadachi.cells.safety-monitoring.test-state-machine
  "wadachi 轍 safety-monitoring state-machine cljc port."
  (:require [clojure.test :refer [deftest is testing]]
            [wadachi.cells.safety-monitoring.state-machine :as sm]))

(deftest chain-reaches-end-at-100pct
  (let [out (sm/run-chain {})]
    (is (= 100 (get-in out ["safety_state" "completionPct"])))
    (is (= "safety_verified" (get-in out ["safety_state" "phase"])))
    (is (= "end" (get out "next_node")))
    (is (contains? out "safety_record"))))
