# Apply Statistics

You're analyzing survey data with multiple response sets. Each set is a sequence of numbers.

Write a function called `overall-max` that takes a sequence of sequences and returns the maximum value across all sequences.

Use `apply` to achieve this.

For example:
```clojure
(def responses [[1 5 3] [7 2 9] [4 8 6]])

(overall-max responses)
; => 9
```