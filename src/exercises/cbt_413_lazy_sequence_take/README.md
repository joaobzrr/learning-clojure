# Lazy Sequence Take

You're building a social media dashboard that shows recent posts. You have a lazy sequence of posts, each with a `:timestamp` (number representing seconds since epoch).

Write a function called `recent-posts` that takes a lazy sequence of posts and a cutoff timestamp, returning all posts with timestamps less than the cutoff (i.e., older than the cutoff, assuming higher numbers are newer).

Use lazy operations to efficiently handle potentially large sequences.

For example:
```clojure
(def posts [{:content "Hello" :timestamp 100}
            {:content "World" :timestamp 200}
            {:content "Clojure" :timestamp 300}
            {:content "Fun" :timestamp 400}])

(recent-posts posts 350)
; => ({:content "Hello" :timestamp 100}
      {:content "World" :timestamp 200}
      {:content "Clojure" :timestamp 300})
```