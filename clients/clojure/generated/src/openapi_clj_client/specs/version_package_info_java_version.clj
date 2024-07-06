(ns openapi-clj-client.specs.version-package-info-java-version
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def version-package-info-java-version-data
  {
   (ds/opt :component) string?
   (ds/opt :majorVersion) int?
   })

(def version-package-info-java-version-spec
  (ds/spec
    {:name ::version-package-info-java-version
     :spec version-package-info-java-version-data}))
