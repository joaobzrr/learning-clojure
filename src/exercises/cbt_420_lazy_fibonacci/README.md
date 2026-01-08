# Lazy Fibonacci

You're exploring mathematical sequences. Create a lazy Fibonacci sequence and find the first Fibonacci number greater than 1000.

Write a function called `first-fib-over` that takes a threshold and returns the first Fibonacci number greater than that threshold.

Fibonacci: 1, 1, 2, 3, 5, 8, 13, ...

For example:
```clojure
(first-fib-over 1000)
; => 1597  (since 987 < 1000 < 1597)
```