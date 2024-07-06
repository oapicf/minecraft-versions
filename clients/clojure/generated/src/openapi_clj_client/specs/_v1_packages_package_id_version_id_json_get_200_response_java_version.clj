(ns openapi-clj-client.specs.-v1-packages-package-id-version-id-json-get-200-response-java-version
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def -v1-packages-package-id-version-id-json-get-200-response-java-version-data
  {
   (ds/opt :component) string?
   (ds/opt :majorVersion) int?
   })

(def -v1-packages-package-id-version-id-json-get-200-response-java-version-spec
  (ds/spec
    {:name ::-v1-packages-package-id-version-id-json-get-200-response-java-version
     :spec -v1-packages-package-id-version-id-json-get-200-response-java-version-data}))
