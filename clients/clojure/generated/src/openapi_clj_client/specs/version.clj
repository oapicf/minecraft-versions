(ns openapi-clj-client.specs.version
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def version-data
  {
   (ds/opt :id) string?
   (ds/opt :type) string?
   (ds/opt :url) string?
   (ds/opt :time) inst?
   (ds/opt :releaseTime) inst?
   })

(def version-spec
  (ds/spec
    {:name ::version
     :spec version-data}))
