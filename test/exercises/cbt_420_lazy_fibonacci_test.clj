(ns exercises.cbt-420-lazy-fibonacci-test
  (:require [clojure.test :refer :all]
            [exercises.cbt-420-lazy-fibonacci.solution :refer :all]))

(deftest first-fib-over-test
  (is (= 13 (first-fib-over 10)))
  (is (= 21 (first-fib-over 13)))
  (is (= 1597 (first-fib-over 1000))))