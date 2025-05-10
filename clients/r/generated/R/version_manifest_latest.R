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
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return VersionManifestLatest as a base R list.
    #' @examples
    #' # convert array of VersionManifestLatest (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert VersionManifestLatest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      VersionManifestLatestObject <- list()
      if (!is.null(self$`release`)) {
        VersionManifestLatestObject[["release"]] <-
          self$`release`
      }
      if (!is.null(self$`snapshot`)) {
        VersionManifestLatestObject[["snapshot"]] <-
          self$`snapshot`
      }
      return(VersionManifestLatestObject)
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
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return VersionManifestLatest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
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

