(ns exercises.cbt-407-into-vector.solution)

(defn filter-into-vector [numbers]
  (into [] (filter even? numbers)))

(filter-into-vector [1 2 3 4 5 6 7 8 9])
