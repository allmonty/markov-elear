(ns markov-elear.generator)

(def example "And the Golden Grouse And the Pobble who")

(def words (clojure.string/split example #" "))

(def word-transitions (partition-all 3 1 words))

(defn word-chain [word-transitions]
  (reduce
   (fn [r t] (merge-with clojure.set/union r
                         (let [[a b c] t]
                           {[a b] (if c #{c} #{})})))
   {}
   word-transitions
   )
  )
