(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 *)

type t = {
    id: string option [@default None];
    _type: string option [@default None];
    url: string option [@default None];
    time: string option [@default None];
    release_time: string option [@default None];
} [@@deriving yojson { strict = false }, show ];;

let create () : t = {
    id = None;
    _type = None;
    url = None;
    time = None;
    release_time = None;
}
