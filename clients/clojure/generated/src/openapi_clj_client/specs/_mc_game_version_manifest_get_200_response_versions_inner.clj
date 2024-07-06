(ns openapi-clj-client.specs.-mc-game-version-manifest-get-200-response-versions-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def -mc-game-version-manifest-get-200-response-versions-inner-data
  {
   (ds/opt :id) string?
   (ds/opt :type) string?
   (ds/opt :url) string?
   (ds/opt :time) inst?
   (ds/opt :releaseTime) inst?
   })

(def -mc-game-version-manifest-get-200-response-versions-inner-spec
  (ds/spec
    {:name ::-mc-game-version-manifest-get-200-response-versions-inner
     :spec -mc-game-version-manifest-get-200-response-versions-inner-data}))
