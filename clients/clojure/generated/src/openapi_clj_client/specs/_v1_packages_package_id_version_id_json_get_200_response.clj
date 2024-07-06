(ns openapi-clj-client.specs.-v1-packages-package-id-version-id-json-get-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [openapi-clj-client.specs.-v1-packages-package-id-version-id-json-get-200-response-asset-index :refer :all]
            [openapi-clj-client.specs.-v1-packages-package-id-version-id-json-get-200-response-downloads :refer :all]
            [openapi-clj-client.specs.-v1-packages-package-id-version-id-json-get-200-response-java-version :refer :all]
            )
  (:import (java.io File)))


(def -v1-packages-package-id-version-id-json-get-200-response-data
  {
   (ds/opt :version) string?
   (ds/opt :assetIndex) -v1-packages-package-id-version-id-json-get-200-response-asset-index-spec
   (ds/opt :assets) int?
   (ds/opt :complianceLevel) int?
   (ds/opt :downloads) -v1-packages-package-id-version-id-json-get-200-response-downloads-spec
   (ds/opt :id) string?
   (ds/opt :javaVersion) -v1-packages-package-id-version-id-json-get-200-response-java-version-spec
   (ds/opt :mainClass) string?
   (ds/opt :minimumLauncherVersion) int?
   (ds/opt :time) inst?
   (ds/opt :releaseTime) inst?
   (ds/opt :type) string?
   })

(def -v1-packages-package-id-version-id-json-get-200-response-spec
  (ds/spec
    {:name ::-v1-packages-package-id-version-id-json-get-200-response
     :spec -v1-packages-package-id-version-id-json-get-200-response-data}))
