(ns openapi-clj-client.specs.-mc-game-version-manifest-get-200-response-latest
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def -mc-game-version-manifest-get-200-response-latest-data
  {
   (ds/opt :release) string?
   (ds/opt :snapshot) string?
   })

(def -mc-game-version-manifest-get-200-response-latest-spec
  (ds/spec
    {:name ::-mc-game-version-manifest-get-200-response-latest
     :spec -mc-game-version-manifest-get-200-response-latest-data}))
