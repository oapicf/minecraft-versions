(ns openapi-clj-client.api.default
  (:require [openapi-clj-client.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]
            [openapi-clj-client.specs.-v1-packages-package-id-version-id-json-get-200-response-asset-index :refer :all]
            [openapi-clj-client.specs.-v1-packages-package-id-version-id-json-get-200-response-downloads :refer :all]
            [openapi-clj-client.specs.-v1-packages-package-id-version-id-json-get-200-response-downloads-client :refer :all]
            [openapi-clj-client.specs.-v1-packages-package-id-version-id-json-get-200-response-java-version :refer :all]
            [openapi-clj-client.specs.-mc-game-version-manifest-get-200-response-versions-inner :refer :all]
            [openapi-clj-client.specs.-v1-packages-package-id-version-id-json-get-200-response :refer :all]
            [openapi-clj-client.specs.-mc-game-version-manifest-get-200-response-latest :refer :all]
            [openapi-clj-client.specs.-mc-game-version-manifest-get-200-response :refer :all]
            )
  (:import (java.io File)))


(defn-spec mc-game-version-manifest-get-with-http-info any?
  "Get Minecraft version manifest"
  []
  (call-api "/mc/game/version_manifest" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec mc-game-version-manifest-get -mc-game-version-manifest-get-200-response-spec
  "Get Minecraft version manifest"
  []
  (let [res (:data (mc-game-version-manifest-get-with-http-info))]
    (if (:decode-models *api-context*)
       (st/decode -mc-game-version-manifest-get-200-response-spec res st/string-transformer)
       res)))


(defn-spec v1-packages-package-id-version-id-json-get-with-http-info any?
  "Get Minecraft version package details"
  [packageId string?, versionId string?]
  (check-required-params packageId versionId)
  (call-api "/v1/packages/{packageId}/{versionId}.json" :get
            {:path-params   {"packageId" packageId "versionId" versionId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec v1-packages-package-id-version-id-json-get -v1-packages-package-id-version-id-json-get-200-response-spec
  "Get Minecraft version package details"
  [packageId string?, versionId string?]
  (let [res (:data (v1-packages-package-id-version-id-json-get-with-http-info packageId versionId))]
    (if (:decode-models *api-context*)
       (st/decode -v1-packages-package-id-version-id-json-get-200-response-spec res st/string-transformer)
       res)))


