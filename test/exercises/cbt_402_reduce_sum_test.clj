(ns exercises.cbt-402-reduce-sum-test
  (:require [clojure.test :refer :all]
            [exercises.cbt-402-reduce-sum.solution :refer :all]))

(deftest sum-all-test
  (is (= 10 (sum-all [1 2 3 4])))
  (is (= 0 (sum-all [])))
  (is (= 5 (sum-all [5]))))
