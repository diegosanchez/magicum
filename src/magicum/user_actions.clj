(ns magicum.user-actions
  (:require [clojure.spec.alpha :as s]
            [clojure.test.check :as tc]))

(s/def ::game-state (s/cat
                     :board (s/coll-of int?)
                     :hand (s/coll-of int?)))

(s/fdef laid-down-card
    :args ::game-state
    :ret nil?
    :fn #(true))

(defn laid-down-card
  [board hand]
  {:board (vector (peek hand))
   :hand (pop hand)})

