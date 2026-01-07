(ns exercises.cbt-406-concat-sequences-test
  (:require [clojure.test :refer :all]
            [exercises.cbt-406-concat-sequences.solution :refer :all]))

(deftest concat-two-test
  (is (= '(1 2 3 4) (concat-two [1 2] [3 4])))
  (is (= '(a b c d) (concat-two '(a b) '(c d))))
  (is (= '(1) (concat-two [1] []))))
