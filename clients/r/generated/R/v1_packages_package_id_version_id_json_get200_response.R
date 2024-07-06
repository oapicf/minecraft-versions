#' Create a new V1PackagesPackageIdVersionIdJsonGet200Response
#'
#' @description
#' V1PackagesPackageIdVersionIdJsonGet200Response Class
#'
#' @docType class
#' @title V1PackagesPackageIdVersionIdJsonGet200Response
#' @description V1PackagesPackageIdVersionIdJsonGet200Response Class
#' @format An \code{R6Class} generator object
#' @field version  character [optional]
#' @field assetIndex  \link{V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex} [optional]
#' @field assets  integer [optional]
#' @field complianceLevel  integer [optional]
#' @field downloads  \link{V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads} [optional]
#' @field id  character [optional]
#' @field javaVersion  \link{V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion} [optional]
#' @field mainClass  character [optional]
#' @field minimumLauncherVersion  integer [optional]
#' @field time  character [optional]
#' @field releaseTime  character [optional]
#' @field type  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
V1PackagesPackageIdVersionIdJsonGet200Response <- R6::R6Class(
  "V1PackagesPackageIdVersionIdJsonGet200Response",
  public = list(
    `version` = NULL,
    `assetIndex` = NULL,
    `assets` = NULL,
    `complianceLevel` = NULL,
    `downloads` = NULL,
    `id` = NULL,
    `javaVersion` = NULL,
    `mainClass` = NULL,
    `minimumLauncherVersion` = NULL,
    `time` = NULL,
    `releaseTime` = NULL,
    `type` = NULL,
    #' Initialize a new V1PackagesPackageIdVersionIdJsonGet200Response class.
    #'
    #' @description
    #' Initialize a new V1PackagesPackageIdVersionIdJsonGet200Response class.
    #'
    #' @param version version
    #' @param assetIndex assetIndex
    #' @param assets assets
    #' @param complianceLevel complianceLevel
    #' @param downloads downloads
    #' @param id id
    #' @param javaVersion javaVersion
    #' @param mainClass mainClass
    #' @param minimumLauncherVersion minimumLauncherVersion
    #' @param time time
    #' @param releaseTime releaseTime
    #' @param type type
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`version` = NULL, `assetIndex` = NULL, `assets` = NULL, `complianceLevel` = NULL, `downloads` = NULL, `id` = NULL, `javaVersion` = NULL, `mainClass` = NULL, `minimumLauncherVersion` = NULL, `time` = NULL, `releaseTime` = NULL, `type` = NULL, ...) {
      if (!is.null(`version`)) {
        if (!(is.character(`version`) && length(`version`) == 1)) {
          stop(paste("Error! Invalid data for `version`. Must be a string:", `version`))
        }
        self$`version` <- `version`
      }
      if (!is.null(`assetIndex`)) {
        stopifnot(R6::is.R6(`assetIndex`))
        self$`assetIndex` <- `assetIndex`
      }
      if (!is.null(`assets`)) {
        if (!(is.numeric(`assets`) && length(`assets`) == 1)) {
          stop(paste("Error! Invalid data for `assets`. Must be an integer:", `assets`))
        }
        self$`assets` <- `assets`
      }
      if (!is.null(`complianceLevel`)) {
        if (!(is.numeric(`complianceLevel`) && length(`complianceLevel`) == 1)) {
          stop(paste("Error! Invalid data for `complianceLevel`. Must be an integer:", `complianceLevel`))
        }
        self$`complianceLevel` <- `complianceLevel`
      }
      if (!is.null(`downloads`)) {
        stopifnot(R6::is.R6(`downloads`))
        self$`downloads` <- `downloads`
      }
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`javaVersion`)) {
        stopifnot(R6::is.R6(`javaVersion`))
        self$`javaVersion` <- `javaVersion`
      }
      if (!is.null(`mainClass`)) {
        if (!(is.character(`mainClass`) && length(`mainClass`) == 1)) {
          stop(paste("Error! Invalid data for `mainClass`. Must be a string:", `mainClass`))
        }
        self$`mainClass` <- `mainClass`
      }
      if (!is.null(`minimumLauncherVersion`)) {
        if (!(is.numeric(`minimumLauncherVersion`) && length(`minimumLauncherVersion`) == 1)) {
          stop(paste("Error! Invalid data for `minimumLauncherVersion`. Must be an integer:", `minimumLauncherVersion`))
        }
        self$`minimumLauncherVersion` <- `minimumLauncherVersion`
      }
      if (!is.null(`time`)) {
        if (!is.character(`time`)) {
          stop(paste("Error! Invalid data for `time`. Must be a string:", `time`))
        }
        self$`time` <- `time`
      }
      if (!is.null(`releaseTime`)) {
        if (!is.character(`releaseTime`)) {
          stop(paste("Error! Invalid data for `releaseTime`. Must be a string:", `releaseTime`))
        }
        self$`releaseTime` <- `releaseTime`
      }
      if (!is.null(`type`)) {
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return V1PackagesPackageIdVersionIdJsonGet200Response in JSON format
    #' @export
    toJSON = function() {
      V1PackagesPackageIdVersionIdJsonGet200ResponseObject <- list()
      if (!is.null(self$`version`)) {
        V1PackagesPackageIdVersionIdJsonGet200ResponseObject[["version"]] <-
          self$`version`
      }
      if (!is.null(self$`assetIndex`)) {
        V1PackagesPackageIdVersionIdJsonGet200ResponseObject[["assetIndex"]] <-
          self$`assetIndex`$toJSON()
      }
      if (!is.null(self$`assets`)) {
        V1PackagesPackageIdVersionIdJsonGet200ResponseObject[["assets"]] <-
          self$`assets`
      }
      if (!is.null(self$`complianceLevel`)) {
        V1PackagesPackageIdVersionIdJsonGet200ResponseObject[["complianceLevel"]] <-
          self$`complianceLevel`
      }
      if (!is.null(self$`downloads`)) {
        V1PackagesPackageIdVersionIdJsonGet200ResponseObject[["downloads"]] <-
          self$`downloads`$toJSON()
      }
      if (!is.null(self$`id`)) {
        V1PackagesPackageIdVersionIdJsonGet200ResponseObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`javaVersion`)) {
        V1PackagesPackageIdVersionIdJsonGet200ResponseObject[["javaVersion"]] <-
          self$`javaVersion`$toJSON()
      }
      if (!is.null(self$`mainClass`)) {
        V1PackagesPackageIdVersionIdJsonGet200ResponseObject[["mainClass"]] <-
          self$`mainClass`
      }
      if (!is.null(self$`minimumLauncherVersion`)) {
        V1PackagesPackageIdVersionIdJsonGet200ResponseObject[["minimumLauncherVersion"]] <-
          self$`minimumLauncherVersion`
      }
      if (!is.null(self$`time`)) {
        V1PackagesPackageIdVersionIdJsonGet200ResponseObject[["time"]] <-
          self$`time`
      }
      if (!is.null(self$`releaseTime`)) {
        V1PackagesPackageIdVersionIdJsonGet200ResponseObject[["releaseTime"]] <-
          self$`releaseTime`
      }
      if (!is.null(self$`type`)) {
        V1PackagesPackageIdVersionIdJsonGet200ResponseObject[["type"]] <-
          self$`type`
      }
      V1PackagesPackageIdVersionIdJsonGet200ResponseObject
    },
    #' Deserialize JSON string into an instance of V1PackagesPackageIdVersionIdJsonGet200Response
    #'
    #' @description
    #' Deserialize JSON string into an instance of V1PackagesPackageIdVersionIdJsonGet200Response
    #'
    #' @param input_json the JSON input
    #' @return the instance of V1PackagesPackageIdVersionIdJsonGet200Response
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`version`)) {
        self$`version` <- this_object$`version`
      }
      if (!is.null(this_object$`assetIndex`)) {
        `assetindex_object` <- V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex$new()
        `assetindex_object`$fromJSON(jsonlite::toJSON(this_object$`assetIndex`, auto_unbox = TRUE, digits = NA))
        self$`assetIndex` <- `assetindex_object`
      }
      if (!is.null(this_object$`assets`)) {
        self$`assets` <- this_object$`assets`
      }
      if (!is.null(this_object$`complianceLevel`)) {
        self$`complianceLevel` <- this_object$`complianceLevel`
      }
      if (!is.null(this_object$`downloads`)) {
        `downloads_object` <- V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads$new()
        `downloads_object`$fromJSON(jsonlite::toJSON(this_object$`downloads`, auto_unbox = TRUE, digits = NA))
        self$`downloads` <- `downloads_object`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`javaVersion`)) {
        `javaversion_object` <- V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion$new()
        `javaversion_object`$fromJSON(jsonlite::toJSON(this_object$`javaVersion`, auto_unbox = TRUE, digits = NA))
        self$`javaVersion` <- `javaversion_object`
      }
      if (!is.null(this_object$`mainClass`)) {
        self$`mainClass` <- this_object$`mainClass`
      }
      if (!is.null(this_object$`minimumLauncherVersion`)) {
        self$`minimumLauncherVersion` <- this_object$`minimumLauncherVersion`
      }
      if (!is.null(this_object$`time`)) {
        self$`time` <- this_object$`time`
      }
      if (!is.null(this_object$`releaseTime`)) {
        self$`releaseTime` <- this_object$`releaseTime`
      }
      if (!is.null(this_object$`type`)) {
        self$`type` <- this_object$`type`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return V1PackagesPackageIdVersionIdJsonGet200Response in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`version`)) {
          sprintf(
          '"version":
            "%s"
                    ',
          self$`version`
          )
        },
        if (!is.null(self$`assetIndex`)) {
          sprintf(
          '"assetIndex":
          %s
          ',
          jsonlite::toJSON(self$`assetIndex`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`assets`)) {
          sprintf(
          '"assets":
            %d
                    ',
          self$`assets`
          )
        },
        if (!is.null(self$`complianceLevel`)) {
          sprintf(
          '"complianceLevel":
            %d
                    ',
          self$`complianceLevel`
          )
        },
        if (!is.null(self$`downloads`)) {
          sprintf(
          '"downloads":
          %s
          ',
          jsonlite::toJSON(self$`downloads`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`javaVersion`)) {
          sprintf(
          '"javaVersion":
          %s
          ',
          jsonlite::toJSON(self$`javaVersion`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`mainClass`)) {
          sprintf(
          '"mainClass":
            "%s"
                    ',
          self$`mainClass`
          )
        },
        if (!is.null(self$`minimumLauncherVersion`)) {
          sprintf(
          '"minimumLauncherVersion":
            %d
                    ',
          self$`minimumLauncherVersion`
          )
        },
        if (!is.null(self$`time`)) {
          sprintf(
          '"time":
            "%s"
                    ',
          self$`time`
          )
        },
        if (!is.null(self$`releaseTime`)) {
          sprintf(
          '"releaseTime":
            "%s"
                    ',
          self$`releaseTime`
          )
        },
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
            "%s"
                    ',
          self$`type`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of V1PackagesPackageIdVersionIdJsonGet200Response
    #'
    #' @description
    #' Deserialize JSON string into an instance of V1PackagesPackageIdVersionIdJsonGet200Response
    #'
    #' @param input_json the JSON input
    #' @return the instance of V1PackagesPackageIdVersionIdJsonGet200Response
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`version` <- this_object$`version`
      self$`assetIndex` <- V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex$new()$fromJSON(jsonlite::toJSON(this_object$`assetIndex`, auto_unbox = TRUE, digits = NA))
      self$`assets` <- this_object$`assets`
      self$`complianceLevel` <- this_object$`complianceLevel`
      self$`downloads` <- V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads$new()$fromJSON(jsonlite::toJSON(this_object$`downloads`, auto_unbox = TRUE, digits = NA))
      self$`id` <- this_object$`id`
      self$`javaVersion` <- V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion$new()$fromJSON(jsonlite::toJSON(this_object$`javaVersion`, auto_unbox = TRUE, digits = NA))
      self$`mainClass` <- this_object$`mainClass`
      self$`minimumLauncherVersion` <- this_object$`minimumLauncherVersion`
      self$`time` <- this_object$`time`
      self$`releaseTime` <- this_object$`releaseTime`
      self$`type` <- this_object$`type`
      self
    },
    #' Validate JSON input with respect to V1PackagesPackageIdVersionIdJsonGet200Response
    #'
    #' @description
    #' Validate JSON input with respect to V1PackagesPackageIdVersionIdJsonGet200Response and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of V1PackagesPackageIdVersionIdJsonGet200Response
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# V1PackagesPackageIdVersionIdJsonGet200Response$unlock()
#
## Below is an example to define the print function
# V1PackagesPackageIdVersionIdJsonGet200Response$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# V1PackagesPackageIdVersionIdJsonGet200Response$lock()

