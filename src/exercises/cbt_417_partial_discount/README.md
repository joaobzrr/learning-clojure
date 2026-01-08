# Partial Discount

You're building an e-commerce discount system. You have a base discount function that takes a percentage and a price.

Write a function called `create-discounters` that returns a map with keys `:ten-percent` and `:twenty-percent`, each mapping to a function that applies the respective discount to a price.

Then, use these to discount a list of prices.

For example:
```clojure
(def prices [100 200 300])

(def discounters (create-discounters))

(map (:ten-percent discounters) prices)
; => (90.0 180.0 270.0)
```