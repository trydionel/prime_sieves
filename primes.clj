(use '(clojure.contrib math profile))

(defn odds-below [x]
  (let 
    [lower-bound 3
     upper-bound (+ (floor x) 1)
     step 2]
    (range lower-bound upper-bound step)))
  

(defn prime? [x]
  (if (= x 2)
    true
    (if (or (< x 3) (even? x))
      false
      (every?
        #(not (= (mod x %1) 0))
        (odds-below (sqrt x))))))

(defn primes-below [x]
  (prof :primes
    (filter
      #(prime? %1)
      (range 1 x))))
  
 
;(println (primes-below 100))   
(profile (dotimes [i 5] (last (primes-below 100000))))