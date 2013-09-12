(ns gershwin.demo.shell.deps
  (:require [cemerick.pomegranate :refer [add-dependencies]]
            [cemerick.pomegranate.aether :refer [maven-central]]))

: add-dependencies [deps-vectors --]
  #(add-dependencies :coordinates %
                     :repositories (merge maven-central
                                          {"clojars" "http://clojars.org/repo"})) .
