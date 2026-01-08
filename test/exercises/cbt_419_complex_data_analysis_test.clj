(ns exercises.cbt-419-complex-data-analysis-test
  (:require [clojure.test :refer :all]
            [exercises.cbt-419-complex-data-analysis.solution :refer :all]))

(deftest analyze-sales-test
  (let [sales [{:date "2023-01-10" :category "Electronics" :amount 100}
               {:date "2023-02-15" :category "Electronics" :amount 200}
               {:date "2023-04-01" :category "Books" :amount 50}]]
    (is (= {:electronics-q1-total 300 :top-month 2}
           (analyze-sales sales)))))