#' Create a new VersionPackageInfoDownloads
#'
#' @description
#' VersionPackageInfoDownloads Class
#'
#' @docType class
#' @title VersionPackageInfoDownloads
#' @description VersionPackageInfoDownloads Class
#' @format An \code{R6Class} generator object
#' @field client  \link{Download} [optional]
#' @field client_mappings  \link{Download} [optional]
#' @field server  \link{Download} [optional]
#' @field server_mappings  \link{Download} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
VersionPackageInfoDownloads <- R6::R6Class(
  "VersionPackageInfoDownloads",
  public = list(
    `client` = NULL,
    `client_mappings` = NULL,
    `server` = NULL,
    `server_mappings` = NULL,

    #' @description
    #' Initialize a new VersionPackageInfoDownloads class.
    #'
    #' @param client client
    #' @param client_mappings client_mappings
    #' @param server server
    #' @param server_mappings server_mappings
    #' @param ... Other optional arguments.
    initialize = function(`client` = NULL, `client_mappings` = NULL, `server` = NULL, `server_mappings` = NULL, ...) {
      if (!is.null(`client`)) {
        stopifnot(R6::is.R6(`client`))
        self$`client` <- `client`
      }
      if (!is.null(`client_mappings`)) {
        stopifnot(R6::is.R6(`client_mappings`))
        self$`client_mappings` <- `client_mappings`
      }
      if (!is.null(`server`)) {
        stopifnot(R6::is.R6(`server`))
        self$`server` <- `server`
      }
      if (!is.null(`server_mappings`)) {
        stopifnot(R6::is.R6(`server_mappings`))
        self$`server_mappings` <- `server_mappings`
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
    #' @return VersionPackageInfoDownloads as a base R list.
    #' @examples
    #' # convert array of VersionPackageInfoDownloads (x) to a data frame
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
    #' Convert VersionPackageInfoDownloads to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      VersionPackageInfoDownloadsObject <- list()
      if (!is.null(self$`client`)) {
        VersionPackageInfoDownloadsObject[["client"]] <-
          self$`client`$toSimpleType()
      }
      if (!is.null(self$`client_mappings`)) {
        VersionPackageInfoDownloadsObject[["client_mappings"]] <-
          self$`client_mappings`$toSimpleType()
      }
      if (!is.null(self$`server`)) {
        VersionPackageInfoDownloadsObject[["server"]] <-
          self$`server`$toSimpleType()
      }
      if (!is.null(self$`server_mappings`)) {
        VersionPackageInfoDownloadsObject[["server_mappings"]] <-
          self$`server_mappings`$toSimpleType()
      }
      return(VersionPackageInfoDownloadsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of VersionPackageInfoDownloads
    #'
    #' @param input_json the JSON input
    #' @return the instance of VersionPackageInfoDownloads
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`client`)) {
        `client_object` <- Download$new()
        `client_object`$fromJSON(jsonlite::toJSON(this_object$`client`, auto_unbox = TRUE, digits = NA))
        self$`client` <- `client_object`
      }
      if (!is.null(this_object$`client_mappings`)) {
        `client_mappings_object` <- Download$new()
        `client_mappings_object`$fromJSON(jsonlite::toJSON(this_object$`client_mappings`, auto_unbox = TRUE, digits = NA))
        self$`client_mappings` <- `client_mappings_object`
      }
      if (!is.null(this_object$`server`)) {
        `server_object` <- Download$new()
        `server_object`$fromJSON(jsonlite::toJSON(this_object$`server`, auto_unbox = TRUE, digits = NA))
        self$`server` <- `server_object`
      }
      if (!is.null(this_object$`server_mappings`)) {
        `server_mappings_object` <- Download$new()
        `server_mappings_object`$fromJSON(jsonlite::toJSON(this_object$`server_mappings`, auto_unbox = TRUE, digits = NA))
        self$`server_mappings` <- `server_mappings_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return VersionPackageInfoDownloads in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of VersionPackageInfoDownloads
    #'
    #' @param input_json the JSON input
    #' @return the instance of VersionPackageInfoDownloads
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`client` <- Download$new()$fromJSON(jsonlite::toJSON(this_object$`client`, auto_unbox = TRUE, digits = NA))
      self$`client_mappings` <- Download$new()$fromJSON(jsonlite::toJSON(this_object$`client_mappings`, auto_unbox = TRUE, digits = NA))
      self$`server` <- Download$new()$fromJSON(jsonlite::toJSON(this_object$`server`, auto_unbox = TRUE, digits = NA))
      self$`server_mappings` <- Download$new()$fromJSON(jsonlite::toJSON(this_object$`server_mappings`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to VersionPackageInfoDownloads and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of VersionPackageInfoDownloads
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
# VersionPackageInfoDownloads$unlock()
#
## Below is an example to define the print function
# VersionPackageInfoDownloads$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# VersionPackageInfoDownloads$lock()

