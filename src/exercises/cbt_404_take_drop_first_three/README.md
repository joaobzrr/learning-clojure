# Take and Drop First Three

In this exercise, you will use `take` and `drop` to manipulate sequences.

## Task

Write a function called `take-drop-three` that takes a sequence and returns a map with two keys:
- `:taken` containing the first 3 elements (using `take`)
- `:dropped` containing the remaining elements (using `drop`)

For example:
```clojure
(take-drop-three [1 2 3 4 5 6])
; => {:taken [1 2 3] :dropped [4 5 6]}
```