(ns exercises.cbt-413-lazy-sequence-take-test
  (:require [clojure.test :refer :all]
            [exercises.cbt-413-lazy-sequence-take.solution :refer :all]))

(deftest recent-posts-test
  (let [posts [{:content "A" :timestamp 100}
               {:content "B" :timestamp 200}
               {:content "C" :timestamp 300}
               {:content "D" :timestamp 400}]]
    (is (= '({:content "A" :timestamp 100}
             {:content "B" :timestamp 200}
             {:content "C" :timestamp 300})
           (recent-posts posts 350)))
    (is (= '({:content "A" :timestamp 100})
           (recent-posts posts 150)))
    (is (= '() (recent-posts posts 50)))))