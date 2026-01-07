(ns exercises.cbt-303-mapset-function.solution)

(defn mapset [f coll]
  (into #{} (map f coll)))

(mapset inc [1 1 2 2])
