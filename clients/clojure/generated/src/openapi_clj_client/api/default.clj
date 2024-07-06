(ns openapi-clj-client.api.default
  (:require [openapi-clj-client.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]
            [openapi-clj-client.specs.version-package-info-java-version :refer :all]
            [openapi-clj-client.specs.download :refer :all]
            [openapi-clj-client.specs.version-manifest-latest :refer :all]
            [openapi-clj-client.specs.version-manifest :refer :all]
            [openapi-clj-client.specs.version-package-info :refer :all]
            [openapi-clj-client.specs.version-package-info-downloads :refer :all]
            [openapi-clj-client.specs.version :refer :all]
            [openapi-clj-client.specs.version-package-info-asset-index :refer :all]
            )
  (:import (java.io File)))


(defn-spec get-minecraft-version-manifest-with-http-info any?
  "Get Minecraft version manifest"
  []
  (call-api "/mc/game/version_manifest.json" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-minecraft-version-manifest version-manifest-spec
  "Get Minecraft version manifest"
  []
  (let [res (:data (get-minecraft-version-manifest-with-http-info))]
    (if (:decode-models *api-context*)
       (st/decode version-manifest-spec res st/string-transformer)
       res)))


(defn-spec get-minecraft-version-package-info-with-http-info any?
  "Get Minecraft version package info"
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

(defn-spec get-minecraft-version-package-info version-package-info-spec
  "Get Minecraft version package info"
  [packageId string?, versionId string?]
  (let [res (:data (get-minecraft-version-package-info-with-http-info packageId versionId))]
    (if (:decode-models *api-context*)
       (st/decode version-package-info-spec res st/string-transformer)
       res)))


