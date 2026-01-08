# Complex Data Analysis

You're analyzing sales data for a store. Each sale is a map with `:date` (string like "2023-01-15"), `:category`, `:amount`.

Write a function called `analyze-sales` that takes a sequence of sales and returns a map with:
- `:electronics-q1-total`: total sales for "Electronics" category in January-March
- `:top-month`: the month (1-12) with the highest total sales

For example:
```clojure
(def sales [{:date "2023-01-10" :category "Electronics" :amount 100}
            {:date "2023-02-15" :category "Electronics" :amount 200}
            {:date "2023-04-01" :category "Books" :amount 50}])

(analyze-sales sales)
; => {:electronics-q1-total 300 :top-month 2}
```