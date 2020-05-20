(ns macchiato-test.core
  (:require [taoensso.timbre :refer [info]]))

(defn server []
  (info "Hey I am running now!"))