(ns exercises.cbt-401-basic-map-usage.solution)

(defn double-all [coll]
  (map #(* % 2) coll))

(double-all [1, 2, 3])
