# Playlist Concat

You're merging two music playlists for a party. Each playlist is a sequence of songs with `:title`, `:artist`, `:duration` (in seconds).

Write a function called `merge-playlists` that concatenates the playlists and returns only songs longer than 180 seconds (3 minutes), sorted by duration descending.

For example:
```clojure
(def playlist1 [{:title "Song A" :artist "Band X" :duration 200}
                {:title "Song B" :artist "Band Y" :duration 150}])
(def playlist2 [{:title "Song C" :artist "Band Z" :duration 250}
                {:title "Song D" :artist "Band W" :duration 100}])

(merge-playlists playlist1 playlist2)
; => ({:title "Song C" :artist "Band Z" :duration 250}
      {:title "Song A" :artist "Band X" :duration 200})
```