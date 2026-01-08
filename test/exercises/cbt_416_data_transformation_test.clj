(ns exercises.cbt-416-data-transformation-test
  (:require [clojure.test :refer :all]
            [exercises.cbt-416-data-transformation.solution :refer :all]))

(deftest index-users-test
  (let [users [{:id 1 :name "A" :email "a@x.com"}
               {:id 2 :name "B" :email "b@x.com"}]]
    (is (= {1 {:name "A" :email "a@x.com"}
            2 {:name "B" :email "b@x.com"}}
           (index-users users)))))