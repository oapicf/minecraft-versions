(ns openapi-clj-client.specs.-mc-game-version-manifest-get-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [openapi-clj-client.specs.-mc-game-version-manifest-get-200-response-latest :refer :all]
            [openapi-clj-client.specs.-mc-game-version-manifest-get-200-response-versions-inner :refer :all]
            )
  (:import (java.io File)))


(def -mc-game-version-manifest-get-200-response-data
  {
   (ds/opt :latest) -mc-game-version-manifest-get-200-response-latest-spec
   (ds/opt :versions) (s/coll-of -mc-game-version-manifest-get-200-response-versions-inner-spec)
   })

(def -mc-game-version-manifest-get-200-response-spec
  (ds/spec
    {:name ::-mc-game-version-manifest-get-200-response
     :spec -mc-game-version-manifest-get-200-response-data}))
