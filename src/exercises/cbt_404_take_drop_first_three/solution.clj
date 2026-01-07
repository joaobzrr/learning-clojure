(ns exercises.cbt-404-take-drop-first-three.solution)

(defn take-drop-three [coll]
  {:taken (take 3 coll)
   :dropped (drop 3 coll)})
