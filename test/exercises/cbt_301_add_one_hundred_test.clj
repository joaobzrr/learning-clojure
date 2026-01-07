(ns exercises.cbt-301-add-one-hundred-test
  (:require [clojure.test :refer :all]
            [exercises.cbt-301-add-one-hundred.solution :refer :all]))

(deftest add-100-test
  (is (= 105 (add-100 5)) "Should add 100 to 5")
  (is (= 200 (add-100 100)) "Should add 100 to 100")
  (is (= 0 (add-100 -100)) "Should add 100 to -100"))
