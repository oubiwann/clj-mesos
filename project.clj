(defproject oubiwann/clj-mesos "0.25.0-SNAPSHOT"
  :description "A fully-featured Mesos binding for Clojure"
  :url "http://github.com/dgrnbrg/clj-mesos"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [com.google.protobuf/protobuf-java "2.5.0"]
                 [org.clojure/tools.logging "0.3.1"]
                 [org.apache.mesos/mesos "0.25.0"]]
  :global-vars {*warn-on-reflection* true}
  :jvm-opts ["-XX:-OmitStackTraceInFastThrow" "-Xcheck:jni"]
  :deploy-repositories  [["releases" :clojars]]
  :repositories {"apache-releases" "http://repository.apache.org/content/repositories/releases/"})
