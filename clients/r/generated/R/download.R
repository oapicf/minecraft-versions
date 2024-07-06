#' Create a new Download
#'
#' @description
#' Download Class
#'
#' @docType class
#' @title Download
#' @description Download Class
#' @format An \code{R6Class} generator object
#' @field sha1  character [optional]
#' @field size  integer [optional]
#' @field url  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Download <- R6::R6Class(
  "Download",
  public = list(
    `sha1` = NULL,
    `size` = NULL,
    `url` = NULL,
    #' Initialize a new Download class.
    #'
    #' @description
    #' Initialize a new Download class.
    #'
    #' @param sha1 sha1
    #' @param size size
    #' @param url url
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`sha1` = NULL, `size` = NULL, `url` = NULL, ...) {
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
    #' @return Download in JSON format
    #' @export
    toJSON = function() {
      DownloadObject <- list()
      if (!is.null(self$`sha1`)) {
        DownloadObject[["sha1"]] <-
          self$`sha1`
      }
      if (!is.null(self$`size`)) {
        DownloadObject[["size"]] <-
          self$`size`
      }
      if (!is.null(self$`url`)) {
        DownloadObject[["url"]] <-
          self$`url`
      }
      DownloadObject
    },
    #' Deserialize JSON string into an instance of Download
    #'
    #' @description
    #' Deserialize JSON string into an instance of Download
    #'
    #' @param input_json the JSON input
    #' @return the instance of Download
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`sha1`)) {
        self$`sha1` <- this_object$`sha1`
      }
      if (!is.null(this_object$`size`)) {
        self$`size` <- this_object$`size`
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
    #' @return Download in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
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
    #' Deserialize JSON string into an instance of Download
    #'
    #' @description
    #' Deserialize JSON string into an instance of Download
    #'
    #' @param input_json the JSON input
    #' @return the instance of Download
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`sha1` <- this_object$`sha1`
      self$`size` <- this_object$`size`
      self$`url` <- this_object$`url`
      self
    },
    #' Validate JSON input with respect to Download
    #'
    #' @description
    #' Validate JSON input with respect to Download and throw an exception if invalid
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
    #' @return String representation of Download
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
# Download$unlock()
#
## Below is an example to define the print function
# Download$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# Download$lock()

