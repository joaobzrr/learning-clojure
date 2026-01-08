(ns exercises.cbt-415-playlist-concat-test
  (:require [clojure.test :refer :all]
            [exercises.cbt-415-playlist-concat.solution :refer :all]))

(deftest merge-playlists-test
  (let [p1 [{:title "A" :artist "X" :duration 200}]
        p2 [{:title "B" :artist "Y" :duration 250}]]
    (is (= '({:title "B" :artist "Y" :duration 250}
             {:title "A" :artist "X" :duration 200})
           (merge-playlists p1 p2)))))