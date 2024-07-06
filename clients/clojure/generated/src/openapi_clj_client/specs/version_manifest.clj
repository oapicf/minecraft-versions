(ns openapi-clj-client.specs.version-manifest
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [openapi-clj-client.specs.version-manifest-latest :refer :all]
            [openapi-clj-client.specs.version :refer :all]
            )
  (:import (java.io File)))


(def version-manifest-data
  {
   (ds/opt :latest) version-manifest-latest-spec
   (ds/opt :versions) (s/coll-of version-spec)
   })

(def version-manifest-spec
  (ds/spec
    {:name ::version-manifest
     :spec version-manifest-data}))
