(ns exercises.cbt-407-into-vector-test
  (:require [clojure.test :refer :all]
            [exercises.cbt-407-into-vector.solution :refer :all]))

(deftest filter-into-vector-test
  (is (= [2 4 6] (filter-into-vector [1 2 3 4 5 6])))
  (is (= [] (filter-into-vector [1 3 5])))
  (is (= [2] (filter-into-vector [2]))))
