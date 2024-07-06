(ns openapi-clj-client.specs.-v1-packages-package-id-version-id-json-get-200-response-downloads-client
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def -v1-packages-package-id-version-id-json-get-200-response-downloads-client-data
  {
   (ds/opt :sha1) string?
   (ds/opt :size) int?
   (ds/opt :url) string?
   })

(def -v1-packages-package-id-version-id-json-get-200-response-downloads-client-spec
  (ds/spec
    {:name ::-v1-packages-package-id-version-id-json-get-200-response-downloads-client
     :spec -v1-packages-package-id-version-id-json-get-200-response-downloads-client-data}))
