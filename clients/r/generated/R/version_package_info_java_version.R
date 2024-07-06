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
    #' Initialize a new VersionPackageInfoJavaVersion class.
    #'
    #' @description
    #' Initialize a new VersionPackageInfoJavaVersion class.
    #'
    #' @param component component
    #' @param majorVersion majorVersion
    #' @param ... Other optional arguments.
    #' @export
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
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return VersionPackageInfoJavaVersion in JSON format
    #' @export
    toJSON = function() {
      VersionPackageInfoJavaVersionObject <- list()
      if (!is.null(self$`component`)) {
        VersionPackageInfoJavaVersionObject[["component"]] <-
          self$`component`
      }
      if (!is.null(self$`majorVersion`)) {
        VersionPackageInfoJavaVersionObject[["majorVersion"]] <-
          self$`majorVersion`
      }
      VersionPackageInfoJavaVersionObject
    },
    #' Deserialize JSON string into an instance of VersionPackageInfoJavaVersion
    #'
    #' @description
    #' Deserialize JSON string into an instance of VersionPackageInfoJavaVersion
    #'
    #' @param input_json the JSON input
    #' @return the instance of VersionPackageInfoJavaVersion
    #' @export
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
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return VersionPackageInfoJavaVersion in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`component`)) {
          sprintf(
          '"component":
            "%s"
                    ',
          self$`component`
          )
        },
        if (!is.null(self$`majorVersion`)) {
          sprintf(
          '"majorVersion":
            %d
                    ',
          self$`majorVersion`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of VersionPackageInfoJavaVersion
    #'
    #' @description
    #' Deserialize JSON string into an instance of VersionPackageInfoJavaVersion
    #'
    #' @param input_json the JSON input
    #' @return the instance of VersionPackageInfoJavaVersion
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`component` <- this_object$`component`
      self$`majorVersion` <- this_object$`majorVersion`
      self
    },
    #' Validate JSON input with respect to VersionPackageInfoJavaVersion
    #'
    #' @description
    #' Validate JSON input with respect to VersionPackageInfoJavaVersion and throw an exception if invalid
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
    #' @return String representation of VersionPackageInfoJavaVersion
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
# VersionPackageInfoJavaVersion$unlock()
#
## Below is an example to define the print function
# VersionPackageInfoJavaVersion$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# VersionPackageInfoJavaVersion$lock()

