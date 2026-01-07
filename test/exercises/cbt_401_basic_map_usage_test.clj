(ns exercises.cbt-401-basic-map-usage-test
  (:require [clojure.test :refer :all]
            [exercises.cbt-401-basic-map-usage.solution :refer :all]))

(deftest double-all-test
  (is (= '(2 4 6) (double-all [1 2 3])))
  (is (= '(0 2 4) (double-all [0 1 2])))
  (is (= '() (double-all []))))
