(ns exercises.cbt-412-game-score-aggregation-test
  (:require [clojure.test :refer :all]
            [exercises.cbt-412-game-score-aggregation.solution :refer :all]))

(deftest top-player-test
  (let [results [{:player "Alice" :score 100}
                 {:player "Bob" :score 150}
                 {:player "Alice" :score 200}
                 {:player "Charlie" :score 50}]]
    (is (= "Alice" (top-player results))))
  (let [results [{:player "A" :score 10}
                 {:player "B" :score 20}
                 {:player "A" :score 30}]]
    (is (= "A" (top-player results))))
  (let [results []]
    (is (= "" (top-player results)))))