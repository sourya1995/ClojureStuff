(if (even? 5)
  (do (println "even")
      true)
  (do (println "odd")
      false))

(when (neg? x)
  (throw (RuntimeException. (str "x must be positive"))))

(let [x 5]
  (cond
    (< x 2) "x is less than 2"
    (< x 10) "x is less than 10")
  :else "x is seomething else")

(dotimes [i 3]
  (println i))

(doseq [n (range 3)]
  (println n))

(for [letter [:a :b]
      number (range 3)]; list of 0, 1, 2
  [letter number])

(defn increase[i]
  (if (< i 10)
    (recur (inc i))))

(try
  (/ 2 1)
  (catch ArithmeticException e "divide by zero")
  (finally (println "cleanup")))

(try
  (throw (Exception. "Something went wrong"))
  (catch Exception e(.getMessage e)))

(with-open [f (clojure.java.io/writer  "/tmp/new")]
  (.write f "some text"))