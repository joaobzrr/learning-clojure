(ns exercises.cbt-408-partial-add-test
  (:require [clojure.test :refer :all]
            [exercises.cbt-408-partial-add.solution :refer :all]))

(deftest add-ten-test
  (let [adder (add-ten)]
    (is (= 15 (adder 5)))
    (is (= 20 (adder 10)))
    (is (= 10 (adder 0)))))
