(ns exercises.cbt-414-inventory-sort-test
  (:require [clojure.test :refer :all]
            [exercises.cbt-414-inventory-sort.solution :refer :all]))

(deftest sort-by-value-test
  (let [inventory [{:name "A" :price 10 :quantity 1}
                   {:name "B" :price 5 :quantity 4}
                   {:name "C" :price 2 :quantity 10}]]
    (is (= '({:name "C" :price 2 :quantity 10}
             {:name "B" :price 5 :quantity 4}
             {:name "A" :price 10 :quantity 1})
           (sort-by-value inventory)))))