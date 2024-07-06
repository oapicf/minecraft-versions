#' Create a new Version
#'
#' @description
#' Version Class
#'
#' @docType class
#' @title Version
#' @description Version Class
#' @format An \code{R6Class} generator object
#' @field id  character [optional]
#' @field type  character [optional]
#' @field url  character [optional]
#' @field time  character [optional]
#' @field releaseTime  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Version <- R6::R6Class(
  "Version",
  public = list(
    `id` = NULL,
    `type` = NULL,
    `url` = NULL,
    `time` = NULL,
    `releaseTime` = NULL,
    #' Initialize a new Version class.
    #'
    #' @description
    #' Initialize a new Version class.
    #'
    #' @param id id
    #' @param type type
    #' @param url url
    #' @param time time
    #' @param releaseTime releaseTime
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id` = NULL, `type` = NULL, `url` = NULL, `time` = NULL, `releaseTime` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`type`)) {
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!is.null(`url`)) {
        if (!(is.character(`url`) && length(`url`) == 1)) {
          stop(paste("Error! Invalid data for `url`. Must be a string:", `url`))
        }
        self$`url` <- `url`
      }
      if (!is.null(`time`)) {
        if (!is.character(`time`)) {
          stop(paste("Error! Invalid data for `time`. Must be a string:", `time`))
        }
        self$`time` <- `time`
      }
      if (!is.null(`releaseTime`)) {
        if (!is.character(`releaseTime`)) {
          stop(paste("Error! Invalid data for `releaseTime`. Must be a string:", `releaseTime`))
        }
        self$`releaseTime` <- `releaseTime`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return Version in JSON format
    #' @export
    toJSON = function() {
      VersionObject <- list()
      if (!is.null(self$`id`)) {
        VersionObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`type`)) {
        VersionObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`url`)) {
        VersionObject[["url"]] <-
          self$`url`
      }
      if (!is.null(self$`time`)) {
        VersionObject[["time"]] <-
          self$`time`
      }
      if (!is.null(self$`releaseTime`)) {
        VersionObject[["releaseTime"]] <-
          self$`releaseTime`
      }
      VersionObject
    },
    #' Deserialize JSON string into an instance of Version
    #'
    #' @description
    #' Deserialize JSON string into an instance of Version
    #'
    #' @param input_json the JSON input
    #' @return the instance of Version
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`type`)) {
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`url`)) {
        self$`url` <- this_object$`url`
      }
      if (!is.null(this_object$`time`)) {
        self$`time` <- this_object$`time`
      }
      if (!is.null(this_object$`releaseTime`)) {
        self$`releaseTime` <- this_object$`releaseTime`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return Version in JSON format
    #' @export
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
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
            "%s"
                    ',
          self$`type`
          )
        },
        if (!is.null(self$`url`)) {
          sprintf(
          '"url":
            "%s"
                    ',
          self$`url`
          )
        },
        if (!is.null(self$`time`)) {
          sprintf(
          '"time":
            "%s"
                    ',
          self$`time`
          )
        },
        if (!is.null(self$`releaseTime`)) {
          sprintf(
          '"releaseTime":
            "%s"
                    ',
          self$`releaseTime`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of Version
    #'
    #' @description
    #' Deserialize JSON string into an instance of Version
    #'
    #' @param input_json the JSON input
    #' @return the instance of Version
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`type` <- this_object$`type`
      self$`url` <- this_object$`url`
      self$`time` <- this_object$`time`
      self$`releaseTime` <- this_object$`releaseTime`
      self
    },
    #' Validate JSON input with respect to Version
    #'
    #' @description
    #' Validate JSON input with respect to Version and throw an exception if invalid
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
    #' @return String representation of Version
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
# Version$unlock()
#
## Below is an example to define the print function
# Version$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# Version$lock()

