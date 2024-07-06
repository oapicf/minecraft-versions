(ns openapi-clj-client.specs.version-package-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [openapi-clj-client.specs.version-package-info-asset-index :refer :all]
            [openapi-clj-client.specs.version-package-info-downloads :refer :all]
            [openapi-clj-client.specs.version-package-info-java-version :refer :all]
            )
  (:import (java.io File)))


(def version-package-info-data
  {
   (ds/opt :version) string?
   (ds/opt :assetIndex) version-package-info-asset-index-spec
   (ds/opt :assets) string?
   (ds/opt :complianceLevel) int?
   (ds/opt :downloads) version-package-info-downloads-spec
   (ds/opt :id) string?
   (ds/opt :javaVersion) version-package-info-java-version-spec
   (ds/opt :mainClass) string?
   (ds/opt :minimumLauncherVersion) int?
   (ds/opt :time) inst?
   (ds/opt :releaseTime) inst?
   (ds/opt :type) string?
   })

(def version-package-info-spec
  (ds/spec
    {:name ::version-package-info
     :spec version-package-info-data}))
