(ns coderetreat.core-test
  (:require [clojure.test :refer :all]
            [coderetreat.core :refer :all]))

(deftest board-test
  (is (not (nil? (board)))))
