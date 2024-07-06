(ns openapi-clj-client.specs.download
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def download-data
  {
   (ds/opt :sha1) string?
   (ds/opt :size) int?
   (ds/opt :url) string?
   })

(def download-spec
  (ds/spec
    {:name ::download
     :spec download-data}))
