(ns exercises.cbt-411-library-book-filter-test
  (:require [clojure.test :refer :all]
            [exercises.cbt-411-library-book-filter.solution :refer :all]))

(deftest filter-books-test
  (let [books [{:title "1984" :author "Orwell" :year 1949 :genre "Dystopian"}
               {:title "Brave New World" :author "Huxley" :year 1932 :genre "Dystopian"}
               {:title "To Kill a Mockingbird" :author "Lee" :year 1960 :genre "Fiction"}
               {:title "Fahrenheit 451" :author "Bradbury" :year 1953 :genre "Dystopian"}]]
    (is (= '({:title "Brave New World" :author "Huxley" :year 1932 :genre "Dystopian"}
             {:title "1984" :author "Orwell" :year 1949 :genre "Dystopian"}
             {:title "Fahrenheit 451" :author "Bradbury" :year 1953 :genre "Dystopian"})
           (filter-books books "Dystopian" 1930)))
    (is (= '({:title "1984" :author "Orwell" :year 1949 :genre "Dystopian"}
             {:title "Fahrenheit 451" :author "Bradbury" :year 1953 :genre "Dystopian"})
           (filter-books books "Dystopian" 1940)))
    (is (= '() (filter-books books "Romance" 1900)))))