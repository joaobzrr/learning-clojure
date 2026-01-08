(ns exercises.cbt-412-game-score-aggregation.solution)

(defn top-player [results]
  (let [totals (reduce (fn [totals result]
                         (let [player (:player result)
                               score (:score result)]
                           (assoc totals
                                  player
                                  (+ (get totals player 0)
                                     score))))
                       {}
                       results)]
    (when (seq totals)
      (key (apply max-key val totals)))))
