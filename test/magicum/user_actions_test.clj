(ns magicum.user-actions-test
  (:require [clojure.test :refer :all]
            [magicum.user-actions :refer :all]))

(deftest laid-down-card-test
  (testing "Old fashioned way"
    (is (= [2]
           (:board (laid-down-card [] [1 2]))))))
