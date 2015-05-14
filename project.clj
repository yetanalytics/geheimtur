(defproject geheimtur "0.1.5"
  :description "a secret door to your Pedestal application"
  :url "http://github.com/propan/geheimtur"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [io.pedestal/pedestal.service "0.4.0"]
                 [org.mindrot/jbcrypt "0.3m"]
                 [commons-codec "1.10"]
                 [clj-http "1.1.2"]
                 [ring/ring-codec "1.0.0"]
                 ;; integration tests
                 [javax.servlet/javax.servlet-api "3.1.0" :scope "test"]
                 [org.slf4j/slf4j-nop "1.7.12" :scope "test"]])
