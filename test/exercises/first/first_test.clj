(ns exercises.first.first-test
  (:require [clojure.test :refer :all]
            [exercises.first.solution :as sol]))

(deftest answer-test
  (testing "answer returns the correct sum"
    (is (= 6 (sol/answer)))))
