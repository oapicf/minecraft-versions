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
    #' Initialize a new VersionManifest class.
    #'
    #' @description
    #' Initialize a new VersionManifest class.
    #'
    #' @param latest latest
    #' @param versions versions
    #' @param ... Other optional arguments.
    #' @export
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
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return VersionManifest in JSON format
    #' @export
    toJSON = function() {
      VersionManifestObject <- list()
      if (!is.null(self$`latest`)) {
        VersionManifestObject[["latest"]] <-
          self$`latest`$toJSON()
      }
      if (!is.null(self$`versions`)) {
        VersionManifestObject[["versions"]] <-
          lapply(self$`versions`, function(x) x$toJSON())
      }
      VersionManifestObject
    },
    #' Deserialize JSON string into an instance of VersionManifest
    #'
    #' @description
    #' Deserialize JSON string into an instance of VersionManifest
    #'
    #' @param input_json the JSON input
    #' @return the instance of VersionManifest
    #' @export
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
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return VersionManifest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`latest`)) {
          sprintf(
          '"latest":
          %s
          ',
          jsonlite::toJSON(self$`latest`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`versions`)) {
          sprintf(
          '"versions":
          [%s]
',
          paste(sapply(self$`versions`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of VersionManifest
    #'
    #' @description
    #' Deserialize JSON string into an instance of VersionManifest
    #'
    #' @param input_json the JSON input
    #' @return the instance of VersionManifest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`latest` <- VersionManifestLatest$new()$fromJSON(jsonlite::toJSON(this_object$`latest`, auto_unbox = TRUE, digits = NA))
      self$`versions` <- ApiClient$new()$deserializeObj(this_object$`versions`, "array[Version]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to VersionManifest
    #'
    #' @description
    #' Validate JSON input with respect to VersionManifest and throw an exception if invalid
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
    #' @return String representation of VersionManifest
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
# VersionManifest$unlock()
#
## Below is an example to define the print function
# VersionManifest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# VersionManifest$lock()

