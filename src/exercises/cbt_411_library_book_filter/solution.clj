(ns exercises.cbt-411-library-book-filter.solution)

(defn filter-books [books genre min-year]
  (sort-by :year
           (filter (fn [book]
                     (and (= (:genre book) genre)
                          (>= (:year book) min-year)))
                   books)))
