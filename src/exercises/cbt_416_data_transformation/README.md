# Data Transformation

You're processing user data for a database migration. You have a sequence of user maps with `:id`, `:name`, `:email`.

Write a function called `index-users` that transforms the sequence into a map where keys are user IDs and values are the user maps (without :id).

For example:
```clojure
(def users [{:id 1 :name "Alice" :email "alice@example.com"}
            {:id 2 :name "Bob" :email "bob@example.com"}])

(index-users users)
; => {1 {:name "Alice" :email "alice@example.com"}
      2 {:name "Bob" :email "bob@example.com"}}
```