(ns exercises.cbt-302-dec-maker-function-test
  (:require [clojure.test :refer :all]
            [exercises.cbt-302-dec-maker-function.solution :refer :all]))

(deftest dec-maker-test
  (let [dec5 (dec-maker 5)]
    (is (= 0 (dec5 5)) "Should subtract 5 from 5")
    (is (= -5 (dec5 0)) "Should subtract 5 from 0"))
  (let [dec9 (dec-maker 9)]
    (is (= 1 (dec9 10)) "Should subtract 9 from 10")))
