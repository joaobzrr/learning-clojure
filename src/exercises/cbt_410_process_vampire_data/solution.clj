(ns exercises.cbt-410-process-vampire-data.solution)

(defn score [vampire]
  (+ (:blood-puns vampire) (:critter-consumption vampire)))

(defn find-best-vampire [vampires]
  (reduce (fn [best current] (if (> (score current) (score best))
                                current
                                best))
          vampires))
