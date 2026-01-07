(ns exercises.cbt-410-process-vampire-data-test
  (:require [clojure.test :refer :all]
            [exercises.cbt-410-process-vampire-data.solution :refer :all]))

(deftest find-best-vampire-test
  (let [vampires [{:name "Dracula" :blood-puns 10 :critter-consumption 5}
                  {:name "Edward" :blood-puns 5 :critter-consumption 10}
                  {:name "Nosferatu" :blood-puns 8 :critter-consumption 8}]]
    (is (= {:name "Nosferatu" :blood-puns 8 :critter-consumption 8}
           (find-best-vampire vampires))))

  (let [vampires [{:name "A" :blood-puns 1 :critter-consumption 1}
                  {:name "B" :blood-puns 2 :critter-consumption 2}]]
    (is (= {:name "B" :blood-puns 2 :critter-consumption 2}
           (find-best-vampire vampires)))))
