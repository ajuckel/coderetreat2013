(ns coderetreat.core)

(defn next-generation
  [b]
  [[0 0 0] [0 0 0] [0 0 0]])

(defn board
  "Create the initial board"
  ([] [])
  ([b] b)
  ([b generations]
     (if (= generations 0)
       b
       (board (next-generation (board b)) (- generations 1)))))
