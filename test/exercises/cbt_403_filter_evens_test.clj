(ns exercises.cbt-403-filter-evens-test
  (:require [clojure.test :refer :all]
            [exercises.cbt-403-filter-evens.solution :refer :all]))

(deftest filter-evens-test
  (is (= '(2 4 6) (filter-evens [1 2 3 4 5 6])))
  (is (= '() (filter-evens [1 3 5])))
  (is (= '(2) (filter-evens [2]))))
