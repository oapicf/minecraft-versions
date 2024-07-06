#' Create a new V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
#'
#' @description
#' V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex Class
#'
#' @docType class
#' @title V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
#' @description V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex Class
#' @format An \code{R6Class} generator object
#' @field id  character [optional]
#' @field sha1  character [optional]
#' @field size  integer [optional]
#' @field totalSize  integer [optional]
#' @field url  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex <- R6::R6Class(
  "V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex",
  public = list(
    `id` = NULL,
    `sha1` = NULL,
    `size` = NULL,
    `totalSize` = NULL,
    `url` = NULL,
    #' Initialize a new V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex class.
    #'
    #' @description
    #' Initialize a new V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex class.
    #'
    #' @param id id
    #' @param sha1 sha1
    #' @param size size
    #' @param totalSize totalSize
    #' @param url url
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id` = NULL, `sha1` = NULL, `size` = NULL, `totalSize` = NULL, `url` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`sha1`)) {
        if (!(is.character(`sha1`) && length(`sha1`) == 1)) {
          stop(paste("Error! Invalid data for `sha1`. Must be a string:", `sha1`))
        }
        self$`sha1` <- `sha1`
      }
      if (!is.null(`size`)) {
        if (!(is.numeric(`size`) && length(`size`) == 1)) {
          stop(paste("Error! Invalid data for `size`. Must be an integer:", `size`))
        }
        self$`size` <- `size`
      }
      if (!is.null(`totalSize`)) {
        if (!(is.numeric(`totalSize`) && length(`totalSize`) == 1)) {
          stop(paste("Error! Invalid data for `totalSize`. Must be an integer:", `totalSize`))
        }
        self$`totalSize` <- `totalSize`
      }
      if (!is.null(`url`)) {
        if (!(is.character(`url`) && length(`url`) == 1)) {
          stop(paste("Error! Invalid data for `url`. Must be a string:", `url`))
        }
        self$`url` <- `url`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex in JSON format
    #' @export
    toJSON = function() {
      V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndexObject <- list()
      if (!is.null(self$`id`)) {
        V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndexObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`sha1`)) {
        V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndexObject[["sha1"]] <-
          self$`sha1`
      }
      if (!is.null(self$`size`)) {
        V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndexObject[["size"]] <-
          self$`size`
      }
      if (!is.null(self$`totalSize`)) {
        V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndexObject[["totalSize"]] <-
          self$`totalSize`
      }
      if (!is.null(self$`url`)) {
        V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndexObject[["url"]] <-
          self$`url`
      }
      V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndexObject
    },
    #' Deserialize JSON string into an instance of V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
    #'
    #' @description
    #' Deserialize JSON string into an instance of V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
    #'
    #' @param input_json the JSON input
    #' @return the instance of V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`sha1`)) {
        self$`sha1` <- this_object$`sha1`
      }
      if (!is.null(this_object$`size`)) {
        self$`size` <- this_object$`size`
      }
      if (!is.null(this_object$`totalSize`)) {
        self$`totalSize` <- this_object$`totalSize`
      }
      if (!is.null(this_object$`url`)) {
        self$`url` <- this_object$`url`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`sha1`)) {
          sprintf(
          '"sha1":
            "%s"
                    ',
          self$`sha1`
          )
        },
        if (!is.null(self$`size`)) {
          sprintf(
          '"size":
            %d
                    ',
          self$`size`
          )
        },
        if (!is.null(self$`totalSize`)) {
          sprintf(
          '"totalSize":
            %d
                    ',
          self$`totalSize`
          )
        },
        if (!is.null(self$`url`)) {
          sprintf(
          '"url":
            "%s"
                    ',
          self$`url`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
    #'
    #' @description
    #' Deserialize JSON string into an instance of V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
    #'
    #' @param input_json the JSON input
    #' @return the instance of V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`sha1` <- this_object$`sha1`
      self$`size` <- this_object$`size`
      self$`totalSize` <- this_object$`totalSize`
      self$`url` <- this_object$`url`
      self
    },
    #' Validate JSON input with respect to V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
    #'
    #' @description
    #' Validate JSON input with respect to V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex and throw an exception if invalid
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
    #' @return String representation of V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
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
# V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex$unlock()
#
## Below is an example to define the print function
# V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex$lock()

