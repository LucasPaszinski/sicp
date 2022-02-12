(ns sicp.exercises.1.11)

(defn f-recur [n]
  (if (> n 3)
    (+
     (f-recur (- n 1))
     (* 2 (f-recur (- n 2)))
     (* 3 (f-recur (- n 3))))
    n))


(f-recur 5)


(defn- ftrp [n cn n1 n2 n3]
  (if (= n cn)
    (+ n1 (* n2 2) (* n3 3))
    (ftrp n (inc cn) (+ n1 (* n2 2) (* n3 3)) n1 n2)))

(defn f-tail-recur [n] (if (<= n 3) n (ftrp n 4 3 2 1)))

(f-tail-recur 5)