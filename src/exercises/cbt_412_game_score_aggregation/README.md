# Game Score Aggregation

You're building a leaderboard for a video game tournament. You have a collection of game results, each represented as a map with `:player` (string) and `:score` (number).

Write a function called `top-player` that takes a sequence of game results and returns the name of the player with the highest total score across all their games. If there's a tie, return any of the top players.

For example:
```clojure
(def results [{:player "Alice" :score 100}
              {:player "Bob" :score 150}
              {:player "Alice" :score 200}
              {:player "Charlie" :score 50}])

(top-player results)
; => "Alice"  (Alice has 300 total, Bob 150, Charlie 50)
```