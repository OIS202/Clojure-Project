(ns proj.app
  (:gen-class)
  (:require [proj.db :refer :all])
  (:require [proj.menu :refer :all]))

;; This program displays Hello World
(defn LoadCustomerData []
  (def string1 (slurp "cust.txt"))
  (def customerList(clojure.string/split string1 #"\|")))

(defn LoadProductData []
  (def string2 (slurp "prod.txt"))
  (def productList (clojure.string/split string2 #"\|")))

(defn LoadSalesData []
  (def string3 (slurp "sales.txt"))
  (def salesList (clojure.string/split string3 #"\|")))



(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (LoadCustomerData)
  (LoadProductData)
  (LoadSalesData)
  (while (not= choice  "")
    (userInterface)
    (processHandle choice productList customerList salesList)))
  ;(loop [x (count productList)]
     ;(when (> x -1)
       ;(println (get productList x))
       ;(recur (- x 1)))))
