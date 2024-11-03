#' Create a new VersionPackageInfoAssetIndex
#'
#' @description
#' VersionPackageInfoAssetIndex Class
#'
#' @docType class
#' @title VersionPackageInfoAssetIndex
#' @description VersionPackageInfoAssetIndex Class
#' @format An \code{R6Class} generator object
#' @field id  character [optional]
#' @field sha1  character [optional]
#' @field size  integer [optional]
#' @field totalSize  integer [optional]
#' @field url  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
VersionPackageInfoAssetIndex <- R6::R6Class(
  "VersionPackageInfoAssetIndex",
  public = list(
    `id` = NULL,
    `sha1` = NULL,
    `size` = NULL,
    `totalSize` = NULL,
    `url` = NULL,

    #' @description
    #' Initialize a new VersionPackageInfoAssetIndex class.
    #'
    #' @param id id
    #' @param sha1 sha1
    #' @param size size
    #' @param totalSize totalSize
    #' @param url url
    #' @param ... Other optional arguments.
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

    #' @description
    #' To JSON String
    #'
    #' @return VersionPackageInfoAssetIndex in JSON format
    toJSON = function() {
      VersionPackageInfoAssetIndexObject <- list()
      if (!is.null(self$`id`)) {
        VersionPackageInfoAssetIndexObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`sha1`)) {
        VersionPackageInfoAssetIndexObject[["sha1"]] <-
          self$`sha1`
      }
      if (!is.null(self$`size`)) {
        VersionPackageInfoAssetIndexObject[["size"]] <-
          self$`size`
      }
      if (!is.null(self$`totalSize`)) {
        VersionPackageInfoAssetIndexObject[["totalSize"]] <-
          self$`totalSize`
      }
      if (!is.null(self$`url`)) {
        VersionPackageInfoAssetIndexObject[["url"]] <-
          self$`url`
      }
      VersionPackageInfoAssetIndexObject
    },

    #' @description
    #' Deserialize JSON string into an instance of VersionPackageInfoAssetIndex
    #'
    #' @param input_json the JSON input
    #' @return the instance of VersionPackageInfoAssetIndex
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

    #' @description
    #' To JSON String
    #'
    #' @return VersionPackageInfoAssetIndex in JSON format
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

    #' @description
    #' Deserialize JSON string into an instance of VersionPackageInfoAssetIndex
    #'
    #' @param input_json the JSON input
    #' @return the instance of VersionPackageInfoAssetIndex
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`sha1` <- this_object$`sha1`
      self$`size` <- this_object$`size`
      self$`totalSize` <- this_object$`totalSize`
      self$`url` <- this_object$`url`
      self
    },

    #' @description
    #' Validate JSON input with respect to VersionPackageInfoAssetIndex and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of VersionPackageInfoAssetIndex
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      invalid_fields
    },

    #' @description
    #' Print the object
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# VersionPackageInfoAssetIndex$unlock()
#
## Below is an example to define the print function
# VersionPackageInfoAssetIndex$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# VersionPackageInfoAssetIndex$lock()

