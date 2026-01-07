(ns exercises.cbt-409-apply-sum-test
  (:require [clojure.test :refer :all]
            [exercises.cbt-409-apply-sum.solution :refer :all]))

(deftest sum-with-apply-test
  (is (= 10 (sum-with-apply [1 2 3 4])))
  (is (= 0 (sum-with-apply [])))
  (is (= 5 (sum-with-apply [5]))))
