(ns exercises.cbt-405-sort-by-length-test
  (:require [clojure.test :refer :all]
            [exercises.cbt-405-sort-by-length.solution :refer :all]))

(deftest sort-strings-by-length-test
  (is (= ["a" "cc" "bbb"] (sort-strings-by-length ["a" "bbb" "cc"])))
  (is (= ["hi" "hello" "goodbye"] (sort-strings-by-length ["hello" "hi" "goodbye"])))
  (is (= [] (sort-strings-by-length []))))
