# Mapset Function

In this exercise, you will create a function that combines the behavior of `map` and set creation.

## Task

Write a function called `mapset` that takes two arguments: a function `f` and a collection `coll`. It should apply `f` to each element in `coll` and return the results as a set.

For example:
```clojure
(mapset inc [1 1 2 2])
; => #{2 3}
```

Note that duplicates are removed because sets don't contain duplicate elements.