(ns clojure-project.main
  (:require [clojure.pprint :as pp]))

(defn run [opts]
  (pp/pprint opts)
  (println "Hello, World!"))

(run {:bruh 69})
