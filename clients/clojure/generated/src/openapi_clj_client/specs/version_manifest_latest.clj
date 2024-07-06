(ns openapi-clj-client.specs.version-manifest-latest
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def version-manifest-latest-data
  {
   (ds/opt :release) string?
   (ds/opt :snapshot) string?
   })

(def version-manifest-latest-spec
  (ds/spec
    {:name ::version-manifest-latest
     :spec version-manifest-latest-data}))
