# Dec Maker Function

In this exercise, you will create a function that returns another function, similar to the `inc-maker` function from the chapter.

## Task

Write a function called `dec-maker` that takes a single argument `n` (a number) and returns a new function. The returned function should take a single argument and subtract `n` from it.

For example:
```clojure
(def dec9 (dec-maker 9))
(dec9 10)
; => 1
```