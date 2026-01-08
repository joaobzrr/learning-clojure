# Inventory Sort

You're managing a store's inventory. Each item has `:name`, `:price`, and `:quantity`.

Write a function called `sort-by-value` that sorts the inventory by total value (price × quantity), with highest value first.

For example:
```clojure
(def inventory [{:name "Widget" :price 10 :quantity 5}
                {:name "Gadget" :price 20 :quantity 2}
                {:name "Doohickey" :price 5 :quantity 10}])

(sort-by-value inventory)
; => ({:name "Doohickey" :price 5 :quantity 10}  ; 50
      {:name "Gadget" :price 20 :quantity 2}     ; 40
      {:name "Widget" :price 10 :quantity 5})    ; 50, but Doohickey first if stable sort
```