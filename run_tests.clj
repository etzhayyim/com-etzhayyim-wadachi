(require '[clojure.test :as t])

(def test-namespaces
  '[wadachi.murakumo-test
    wadachi.methods.test-agent
    wadachi.cells.route-planning.test-state-machine
    wadachi.cells.motion-control.test-state-machine
    wadachi.cells.obstacle-avoidance.test-state-machine
    wadachi.cells.safety-monitoring.test-state-machine
    wadachi.cells.telemetry-log.test-state-machine])

(doseq [ns-sym test-namespaces] (require ns-sym))
(let [result (apply t/run-tests test-namespaces)]
  (when-not (zero? (+ (:fail result) (:error result)))
    (System/exit 1)))
