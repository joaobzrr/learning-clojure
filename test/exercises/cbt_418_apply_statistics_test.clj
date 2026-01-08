(ns exercises.cbt-418-apply-statistics-test
  (:require [clojure.test :refer :all]
            [exercises.cbt-418-apply-statistics.solution :refer :all]))

(deftest overall-max-test
  (is (= 9 (overall-max [[1 5 3] [7 2 9] [4 8 6]])))
  (is (= 10 (overall-max [[10]])))
  (is (= -1 (overall-max [[-1 -2] [-3 -4]]))))