(= (list 1 2 3) (vector 1 2 3 ))
(= '(1 2 3) [1 2 3])
(= '(1 2 3) #{1 2 3})
{:aa 2 :bb 2 :cc 300}
(get {:a 1 :b 2} :c 3)
(assoc {1 "January"} 2 "February")
(keys {2010 "Vancouver", 2014 "Sochi", 2006 "Torino"})
(sort '(1 2 4 5 6 ))
(sort '("a" "e" "c" ))
(sort '([1 4] [3 2] [1 1] [1] [2 3]))
(multiply-by-ten 2)
(defn multiply-by-ten [n]
  (* 10 n))
(multiply-by-ten 2)
((fn [n] (* 7 n)) 6)
(#(* 7 %) 6)
((fn [] (* 3 4) ))
(= 20 ((fn [f] (f 4 5)) * ))
(fn [f] (f 4 5))
((fn [f] (f 4 5)) +)
((fn [f] (f 5))(fn [n] (* n n)))
(fn [f] (f 5))
(fn [n] (* n n))
(= 25 ((fn [f] (f 5)) (fn [n] (* n n))))
(defn square [n] (* n n))
(= 25 ( (fn [f] (f 5)) square))
(= :b (if (false? (= 4 5)) :a :b))
(if false "apple" "banana" )
(if (> 4 5) [])
(nil? nil)
(false? (> 4 1))
(false? nil)
(true? 1)
(let [x 6] (cond (= x 2 ) :road-not-taken (= x 6) :another-road-not-taken  (> x 4) :saden-road))
((fn [n] (+ n 2)) 4 )
(+ 1 2)
(#(+ 300 %1 %3) 2 3 4)
(= 30  (#(* 15 %2) 1 2))
(#(* 15 %2) 1 2)
(= 15)
(= 15 15 )
(= nil)
(= false)
(= 9 (((fn [] (fn [a b] (+ a b)))) 4 5))
(fn [a b] (+ a b))
(reduce + 300 [2 3 5 6 7 8])
(fn [vect] (reduce + 300 vect))
((fn [vect] (reduce + 300 vect)) [2 3 5 6 7 8])
(defn add300 [vect] (reduce + 300 vect))
(add300 [2 3 5 6 7 8])
(reduce - [3 4])
(let [x 5] (= :your-road (cond (= x 2 ) :road-not-taken (= x 1) :another-road-not-taken :else :your-road )))
(if-not (zero? 0 ) 'doom 'doom)
(if-not (zero? 1 ) 'happy 'doom)
(defn explain-defcon-level [exercise-term]
     (case exercise-term
           :fade-out          :you-and-what-army
           :double-take       :call-me-when-its-important
           :round-house       :o-rly
           :fast-pace         :thats-pretty-bad
           :cocked-pistol     :sirens
           :say-what?))
(explain-defcon-level :cocked-)
(explain-defcon-level :cocked-pistol)
(map (fn [x] (* x 4 x)) [1 2 3 5 6])
(= '(4 8 12) (map (fn [x] (* 4 x)) [1 2 3]))
(+ 1 2)
'(+ 1 2)
(= '(1 4 9 16 25) (map (fn [x] (* x x)) [1 2 3 4 5]))
(map (fn [x] (* x x)) [1 2 3 4 5])
(= '(1 4 9 16 25) [1 4 9 16 25])
(list [1 4 9 16 25])
(defn is-vowel [test]
  (case test
        :a :vowel
        :e :vowel
        :i :vowel
        :o :vowel
        :u :vowel
        :consonant))
(is-vowel :k)
(= 0 nil?)
[:a :b nil :c :d]
(= (list false false true false false)  (map nil? [:a :b nil :c :d]))
(map nil? [:a :b nil :c :d])
'(false false true false false)
'(1 2 3 4 5)
(+ 1 2)
(fn [x] false)
(filter  number? [1 2 3 + > :sade "a" true false nil])
(defn foo [a b] (if (< 3 4) b a))
(foo :bar :baz)
(< 3 4)
(= "longest" (reduce (fn [a b] (if (< 3 4 ) b a)) ["which" "word" "is" "longest"]))
(= "longest" (reduce (fn [a b] (if (< 300 400) b a)) ["which" "word" "is" "longest" "hello"]))
(reduce (fn [a b] (if true b a)) ["which" "word" "is" "longest" "hello"])
(> (count "longest") (count "short"))
(count "longest")
(defn idontkw
  [] "hello")
(str "koans,.fdgd" "sad" (idontkw) "bad")
;this is a comment
;http://clojurescriptkoans.com/#runtime-polymorphism/3


