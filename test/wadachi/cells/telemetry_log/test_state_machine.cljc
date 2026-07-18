(ns wadachi.cells.telemetry-log.test-state-machine
  "wadachi 轍 telemetry-log state-machine cljc port."
  (:require [clojure.test :refer [deftest is testing]]
            [wadachi.cells.telemetry-log.state-machine :as sm]))

(deftest chain-reaches-end-at-100pct
  (let [out (sm/run-chain {})]
    (is (= 100 (get-in out ["telemetry_state" "completionPct"])))
    (is (= "logged" (get-in out ["telemetry_state" "phase"])))
    (is (= "end" (get out "next_node")))
    (is (contains? out "mission_complete_record"))))
