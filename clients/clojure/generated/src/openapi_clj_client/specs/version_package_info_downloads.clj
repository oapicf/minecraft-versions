(ns openapi-clj-client.specs.version-package-info-downloads
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [openapi-clj-client.specs.download :refer :all]
            [openapi-clj-client.specs.download :refer :all]
            [openapi-clj-client.specs.download :refer :all]
            [openapi-clj-client.specs.download :refer :all]
            )
  (:import (java.io File)))


(def version-package-info-downloads-data
  {
   (ds/opt :client) download-spec
   (ds/opt :client_mappings) download-spec
   (ds/opt :server) download-spec
   (ds/opt :server_mappings) download-spec
   })

(def version-package-info-downloads-spec
  (ds/spec
    {:name ::version-package-info-downloads
     :spec version-package-info-downloads-data}))
