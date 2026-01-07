# Process Vampire Data

In this exercise, you will process a collection of vampire records using multiple sequence functions.

## Task

You are given a sequence of maps, each representing a vampire with keys `:name`, `:blood-puns` (number), and `:critter-consumption` (number).

Write a function called `find-best-vampire` that finds the vampire with the highest combined score of `blood-puns + critter-consumption`. If there are ties, return any one.

Use sequence functions like `map`, `reduce`, `filter`, etc. to process the data.

Example data:
```clojure
(def vampires [{:name "Dracula" :blood-puns 10 :critter-consumption 5}
               {:name "Edward" :blood-puns 5 :critter-consumption 10}
               {:name "Nosferatu" :blood-puns 8 :critter-consumption 8}])
```

In this case, Edward has the highest score (15).