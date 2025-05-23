#' Create a new VersionManifest
#'
#' @description
#' VersionManifest Class
#'
#' @docType class
#' @title VersionManifest
#' @description VersionManifest Class
#' @format An \code{R6Class} generator object
#' @field latest  \link{VersionManifestLatest} [optional]
#' @field versions  list(\link{Version}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
VersionManifest <- R6::R6Class(
  "VersionManifest",
  public = list(
    `latest` = NULL,
    `versions` = NULL,

    #' @description
    #' Initialize a new VersionManifest class.
    #'
    #' @param latest latest
    #' @param versions versions
    #' @param ... Other optional arguments.
    initialize = function(`latest` = NULL, `versions` = NULL, ...) {
      if (!is.null(`latest`)) {
        stopifnot(R6::is.R6(`latest`))
        self$`latest` <- `latest`
      }
      if (!is.null(`versions`)) {
        stopifnot(is.vector(`versions`), length(`versions`) != 0)
        sapply(`versions`, function(x) stopifnot(R6::is.R6(x)))
        self$`versions` <- `versions`
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
    #' @return VersionManifest as a base R list.
    #' @examples
    #' # convert array of VersionManifest (x) to a data frame
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
    #' Convert VersionManifest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      VersionManifestObject <- list()
      if (!is.null(self$`latest`)) {
        VersionManifestObject[["latest"]] <-
          self$`latest`$toSimpleType()
      }
      if (!is.null(self$`versions`)) {
        VersionManifestObject[["versions"]] <-
          lapply(self$`versions`, function(x) x$toSimpleType())
      }
      return(VersionManifestObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of VersionManifest
    #'
    #' @param input_json the JSON input
    #' @return the instance of VersionManifest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`latest`)) {
        `latest_object` <- VersionManifestLatest$new()
        `latest_object`$fromJSON(jsonlite::toJSON(this_object$`latest`, auto_unbox = TRUE, digits = NA))
        self$`latest` <- `latest_object`
      }
      if (!is.null(this_object$`versions`)) {
        self$`versions` <- ApiClient$new()$deserializeObj(this_object$`versions`, "array[Version]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return VersionManifest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of VersionManifest
    #'
    #' @param input_json the JSON input
    #' @return the instance of VersionManifest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`latest` <- VersionManifestLatest$new()$fromJSON(jsonlite::toJSON(this_object$`latest`, auto_unbox = TRUE, digits = NA))
      self$`versions` <- ApiClient$new()$deserializeObj(this_object$`versions`, "array[Version]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to VersionManifest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of VersionManifest
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
# VersionManifest$unlock()
#
## Below is an example to define the print function
# VersionManifest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# VersionManifest$lock()

