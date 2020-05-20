(ns macchiato-test.core
  (:require [taoensso.timbre :refer [info]]
            [macchiato.server :as http]))

(defn handler
  [request callback]
  (callback {:status 200
             :body "Hello Macchiato"}))

(defn server []
  (info "Hey I am running now!")
  (let [host "127.0.0.1"
        port 3000]
    (http/start
      {:handler    handler
       :host       host
       :port       port
       :on-success #(info "macchiato-test started on" host ":" port)})))