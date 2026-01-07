(ns exercises.cbt-303-mapset-function-test
  (:require [clojure.test :refer :all]
            [exercises.cbt-303-mapset-function.solution :refer :all]))

(deftest mapset-test
  (is (= #{2 3} (mapset inc [1 1 2 2])) "Should apply inc and return set")
  (is (= #{"HELLO" "WORLD"} (mapset clojure.string/upper-case ["hello" "world"])) "Should work with strings")
  (is (= #{0} (mapset identity [0 0 0])) "Should handle duplicates"))
