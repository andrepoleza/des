(ns des.core-test
  (:require [clojure.test :refer :all]
            [des.core :refer :all]))

(def text "0000000100100011010001010110011110001001101010111100110111101111")
(def k "0001001100110100010101110111100110011011101111001101111111110001")

(deftest encrypt-decrypt
  (= text (decrypt (encrypt text k) k)))

(run-tests)
