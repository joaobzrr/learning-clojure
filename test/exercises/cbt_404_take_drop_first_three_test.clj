(ns exercises.cbt-404-take-drop-first-three-test
  (:require [clojure.test :refer :all]
            [exercises.cbt-404-take-drop-first-three.solution :refer :all]))

(deftest take-drop-three-test
  (is (= {:taken [1 2 3] :dropped [4 5 6]} (take-drop-three [1 2 3 4 5 6])))
  (is (= {:taken [1 2] :dropped []} (take-drop-three [1 2])))
  (is (= {:taken [] :dropped []} (take-drop-three []))))
