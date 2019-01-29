(defproject markov-elear "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [overtone/at-at "1.2.0"]
                 [twitter-api "0.7.8"]
                 [environ "1.0.0"]]
  :plugins [[lein-environ "1.0.0"]]
  :repl-options {:init-ns markov-elear.generator}
  :profiles {:dev {:plugins [[com.jakemccrary/lein-test-refresh "0.7.0"]]}}
  :main markov-elear.generator)
