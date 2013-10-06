(defproject helloworld "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "MIT"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [ring/ring-jetty-adapter "1.1.6"]]
  :uberjar-name "helloworld-standalone.jar"
  :min-lein-version "2.0.0"
  :main helloworld.core
  :aot [helloworld.core])
