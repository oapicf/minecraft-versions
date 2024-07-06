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
    #' Initialize a new VersionPackageInfoDownloads class.
    #'
    #' @description
    #' Initialize a new VersionPackageInfoDownloads class.
    #'
    #' @param client client
    #' @param client_mappings client_mappings
    #' @param server server
    #' @param server_mappings server_mappings
    #' @param ... Other optional arguments.
    #' @export
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
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return VersionPackageInfoDownloads in JSON format
    #' @export
    toJSON = function() {
      VersionPackageInfoDownloadsObject <- list()
      if (!is.null(self$`client`)) {
        VersionPackageInfoDownloadsObject[["client"]] <-
          self$`client`$toJSON()
      }
      if (!is.null(self$`client_mappings`)) {
        VersionPackageInfoDownloadsObject[["client_mappings"]] <-
          self$`client_mappings`$toJSON()
      }
      if (!is.null(self$`server`)) {
        VersionPackageInfoDownloadsObject[["server"]] <-
          self$`server`$toJSON()
      }
      if (!is.null(self$`server_mappings`)) {
        VersionPackageInfoDownloadsObject[["server_mappings"]] <-
          self$`server_mappings`$toJSON()
      }
      VersionPackageInfoDownloadsObject
    },
    #' Deserialize JSON string into an instance of VersionPackageInfoDownloads
    #'
    #' @description
    #' Deserialize JSON string into an instance of VersionPackageInfoDownloads
    #'
    #' @param input_json the JSON input
    #' @return the instance of VersionPackageInfoDownloads
    #' @export
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
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return VersionPackageInfoDownloads in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`client`)) {
          sprintf(
          '"client":
          %s
          ',
          jsonlite::toJSON(self$`client`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`client_mappings`)) {
          sprintf(
          '"client_mappings":
          %s
          ',
          jsonlite::toJSON(self$`client_mappings`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`server`)) {
          sprintf(
          '"server":
          %s
          ',
          jsonlite::toJSON(self$`server`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`server_mappings`)) {
          sprintf(
          '"server_mappings":
          %s
          ',
          jsonlite::toJSON(self$`server_mappings`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of VersionPackageInfoDownloads
    #'
    #' @description
    #' Deserialize JSON string into an instance of VersionPackageInfoDownloads
    #'
    #' @param input_json the JSON input
    #' @return the instance of VersionPackageInfoDownloads
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`client` <- Download$new()$fromJSON(jsonlite::toJSON(this_object$`client`, auto_unbox = TRUE, digits = NA))
      self$`client_mappings` <- Download$new()$fromJSON(jsonlite::toJSON(this_object$`client_mappings`, auto_unbox = TRUE, digits = NA))
      self$`server` <- Download$new()$fromJSON(jsonlite::toJSON(this_object$`server`, auto_unbox = TRUE, digits = NA))
      self$`server_mappings` <- Download$new()$fromJSON(jsonlite::toJSON(this_object$`server_mappings`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to VersionPackageInfoDownloads
    #'
    #' @description
    #' Validate JSON input with respect to VersionPackageInfoDownloads and throw an exception if invalid
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
    #' @return String representation of VersionPackageInfoDownloads
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
# VersionPackageInfoDownloads$unlock()
#
## Below is an example to define the print function
# VersionPackageInfoDownloads$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# VersionPackageInfoDownloads$lock()

