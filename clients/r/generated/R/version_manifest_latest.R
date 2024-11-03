#' Create a new VersionManifestLatest
#'
#' @description
#' VersionManifestLatest Class
#'
#' @docType class
#' @title VersionManifestLatest
#' @description VersionManifestLatest Class
#' @format An \code{R6Class} generator object
#' @field release  character [optional]
#' @field snapshot  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
VersionManifestLatest <- R6::R6Class(
  "VersionManifestLatest",
  public = list(
    `release` = NULL,
    `snapshot` = NULL,

    #' @description
    #' Initialize a new VersionManifestLatest class.
    #'
    #' @param release release
    #' @param snapshot snapshot
    #' @param ... Other optional arguments.
    initialize = function(`release` = NULL, `snapshot` = NULL, ...) {
      if (!is.null(`release`)) {
        if (!(is.character(`release`) && length(`release`) == 1)) {
          stop(paste("Error! Invalid data for `release`. Must be a string:", `release`))
        }
        self$`release` <- `release`
      }
      if (!is.null(`snapshot`)) {
        if (!(is.character(`snapshot`) && length(`snapshot`) == 1)) {
          stop(paste("Error! Invalid data for `snapshot`. Must be a string:", `snapshot`))
        }
        self$`snapshot` <- `snapshot`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return VersionManifestLatest in JSON format
    toJSON = function() {
      VersionManifestLatestObject <- list()
      if (!is.null(self$`release`)) {
        VersionManifestLatestObject[["release"]] <-
          self$`release`
      }
      if (!is.null(self$`snapshot`)) {
        VersionManifestLatestObject[["snapshot"]] <-
          self$`snapshot`
      }
      VersionManifestLatestObject
    },

    #' @description
    #' Deserialize JSON string into an instance of VersionManifestLatest
    #'
    #' @param input_json the JSON input
    #' @return the instance of VersionManifestLatest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`release`)) {
        self$`release` <- this_object$`release`
      }
      if (!is.null(this_object$`snapshot`)) {
        self$`snapshot` <- this_object$`snapshot`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return VersionManifestLatest in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`release`)) {
          sprintf(
          '"release":
            "%s"
                    ',
          self$`release`
          )
        },
        if (!is.null(self$`snapshot`)) {
          sprintf(
          '"snapshot":
            "%s"
                    ',
          self$`snapshot`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of VersionManifestLatest
    #'
    #' @param input_json the JSON input
    #' @return the instance of VersionManifestLatest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`release` <- this_object$`release`
      self$`snapshot` <- this_object$`snapshot`
      self
    },

    #' @description
    #' Validate JSON input with respect to VersionManifestLatest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of VersionManifestLatest
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
# VersionManifestLatest$unlock()
#
## Below is an example to define the print function
# VersionManifestLatest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# VersionManifestLatest$lock()

