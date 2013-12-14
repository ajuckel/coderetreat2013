(ns coderetreat.core-test
  (:require [clojure.test :refer :all]
            [coderetreat.core :refer :all]))

(deftest board-test
  (is (not (nil? (board)))))

(deftest empty-board-test
  (is [[0 0 0][0 0 0][0 0 0]] (board [[0 0 0][0 0 0][0 0 0]] )))

(deftest lonley-board-test
  (is [[0 0 0][0 1 0][0 0 0]] (board [[0 0 0][0 1 0][0 0 0]] )))

(deftest a-day-on-the-empty-board-test
  (is [[0 0 0][0 0 0][0 0 0]] (board [[0 0 0][0 0 0][0 0 0]] 1)))

(deftest get-row-test
  (is [1 1 1] (get-row 2 [[0 0 0][1 1 1][0 0 0]])))

(deftest get-first-cell-test
  (is [1] (get-cell [0 0] [[1 0 0][0 0 0][0 0 0]])))

(deftest check-if-alive-test
  (is true (alive get-cell [0 0] [[1 0 0][0 0 0][0 0 0]])))
