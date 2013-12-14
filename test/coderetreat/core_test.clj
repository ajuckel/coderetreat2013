(ns coderetreat.core-test
  (:require [clojure.test :refer :all]
            [coderetreat.core :refer :all]))

(deftest board-test
  (is (not (nil? (board)))))

(deftest empty-board-test
  (is [[0 0 0][0 0 0][0 0 0]] (board [[0 0 0][0 0 0][0 0 0]] )))
