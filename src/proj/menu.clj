(ns proj.menu
  (:gen-class))

(defn userInterface []
  (println "*** Sales Menu ***")
  (println "-------------------")
  (println)
  (println "1. Display Customer Table")
  (println "2. Display Product Table")
  (println "3. Display Sales Table")
  (println "4. Total Sales for Customer")
  (println "5. Total Count for Product")
  (println "6. Exit")
  (println)
  (println "Enter an option?")
  (def choice (read-line)))