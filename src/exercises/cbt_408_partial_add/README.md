# Partial Add

In this exercise, you will use `partial` to create a new function by partially applying arguments to an existing function.

## Task

Write a function called `add-ten` that returns a new function which adds 10 to its argument. Use `partial` to create this function.

For example:
```clojure
((add-ten) 5)
; => 15
```