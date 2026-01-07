(ns run
  (:gen-class))

(defn -main [& args]
  (let [exercise (first args)
        ns-sym (symbol (str "exercises." exercise ".solution"))]
    (try
      (require ns-sym)
      (if-let [f (resolve (symbol (str ns-sym "/run")))]
        (f)
        (println "No run function found in" ns-sym))
      (catch Exception e
        (println "Error loading namespace" ns-sym ":" (.getMessage e))))))
