(ns openapi-clj-client.specs.version-package-info-asset-index
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def version-package-info-asset-index-data
  {
   (ds/opt :id) string?
   (ds/opt :sha1) string?
   (ds/opt :size) int?
   (ds/opt :totalSize) int?
   (ds/opt :url) string?
   })

(def version-package-info-asset-index-spec
  (ds/spec
    {:name ::version-package-info-asset-index
     :spec version-package-info-asset-index-data}))
