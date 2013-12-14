(ns coderetreat.core)

(defn next-generation
  [b]
  b)

(defn get-row
  [i b]
  (nth b i))
(defn board
  "Create the initial board"
  ([] [])
  ([b] b)
  ([b generations]
     (if (<= generations 0)
       b
       (board (next-generation (board b)) (- generations 1)))))
