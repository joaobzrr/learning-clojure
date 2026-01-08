(ns exercises.cbt-417-partial-discount-test
  (:require [clojure.test :refer :all]
            [exercises.cbt-417-partial-discount.solution :refer :all]))

(deftest create-discounters-test
  (let [discounters (create-discounters)
        ten-off (:ten-percent discounters)
        twenty-off (:twenty-percent discounters)]
    (is (= 90.0 (ten-off 100)))
    (is (= 160.0 (twenty-off 200)))))