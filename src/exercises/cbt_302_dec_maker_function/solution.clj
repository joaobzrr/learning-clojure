(ns exercises.cbt-302-dec-maker-function.solution)

(defn dec-maker [value]
  #(- % value))
