#' Create a new VersionPackageInfoJavaVersion
#'
#' @description
#' VersionPackageInfoJavaVersion Class
#'
#' @docType class
#' @title VersionPackageInfoJavaVersion
#' @description VersionPackageInfoJavaVersion Class
#' @format An \code{R6Class} generator object
#' @field component  character [optional]
#' @field majorVersion  integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
VersionPackageInfoJavaVersion <- R6::R6Class(
  "VersionPackageInfoJavaVersion",
  public = list(
    `component` = NULL,
    `majorVersion` = NULL,

    #' @description
    #' Initialize a new VersionPackageInfoJavaVersion class.
    #'
    #' @param component component
    #' @param majorVersion majorVersion
    #' @param ... Other optional arguments.
    initialize = function(`component` = NULL, `majorVersion` = NULL, ...) {
      if (!is.null(`component`)) {
        if (!(is.character(`component`) && length(`component`) == 1)) {
          stop(paste("Error! Invalid data for `component`. Must be a string:", `component`))
        }
        self$`component` <- `component`
      }
      if (!is.null(`majorVersion`)) {
        if (!(is.numeric(`majorVersion`) && length(`majorVersion`) == 1)) {
          stop(paste("Error! Invalid data for `majorVersion`. Must be an integer:", `majorVersion`))
        }
        self$`majorVersion` <- `majorVersion`
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
    #' @return VersionPackageInfoJavaVersion as a base R list.
    #' @examples
    #' # convert array of VersionPackageInfoJavaVersion (x) to a data frame
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
    #' Convert VersionPackageInfoJavaVersion to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      VersionPackageInfoJavaVersionObject <- list()
      if (!is.null(self$`component`)) {
        VersionPackageInfoJavaVersionObject[["component"]] <-
          self$`component`
      }
      if (!is.null(self$`majorVersion`)) {
        VersionPackageInfoJavaVersionObject[["majorVersion"]] <-
          self$`majorVersion`
      }
      return(VersionPackageInfoJavaVersionObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of VersionPackageInfoJavaVersion
    #'
    #' @param input_json the JSON input
    #' @return the instance of VersionPackageInfoJavaVersion
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`component`)) {
        self$`component` <- this_object$`component`
      }
      if (!is.null(this_object$`majorVersion`)) {
        self$`majorVersion` <- this_object$`majorVersion`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return VersionPackageInfoJavaVersion in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of VersionPackageInfoJavaVersion
    #'
    #' @param input_json the JSON input
    #' @return the instance of VersionPackageInfoJavaVersion
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`component` <- this_object$`component`
      self$`majorVersion` <- this_object$`majorVersion`
      self
    },

    #' @description
    #' Validate JSON input with respect to VersionPackageInfoJavaVersion and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of VersionPackageInfoJavaVersion
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
# VersionPackageInfoJavaVersion$unlock()
#
## Below is an example to define the print function
# VersionPackageInfoJavaVersion$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# VersionPackageInfoJavaVersion$lock()

