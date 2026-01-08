# Library Book Filter

You work at a library and need to help patrons find books based on their preferences. You're given a collection of books, each represented as a map with keys `:title`, `:author`, `:year`, and `:genre`.

Write a function called `filter-books` that takes three arguments:
- A sequence of book maps
- A target genre (string)
- A minimum publication year

The function should return only the books that match the genre and were published in or after the minimum year, sorted by publication year (oldest first).

For example:
```clojure
(def books [{:title "1984" :author "Orwell" :year 1949 :genre "Dystopian"}
            {:title "Brave New World" :author "Huxley" :year 1932 :genre "Dystopian"}
            {:title "To Kill a Mockingbird" :author "Lee" :year 1960 :genre "Fiction"}])

(filter-books books "Dystopian" 1940)
; => ({:title "1984" :author "Orwell" :year 1949 :genre "Dystopian"})
```