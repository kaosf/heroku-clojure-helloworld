(ns helloworld.core
  (:require [ring.adapter.jetty :as jetty])
  (:gen-class))

(defn app [req]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body "Hello, world"})

(defn -main [port]
  (jetty/run-jetty app {:port (Integer. port) :join? false}))
