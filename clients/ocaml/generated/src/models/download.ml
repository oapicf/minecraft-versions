(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 *)

type t = {
    sha1: string option [@default None];
    size: int32 option [@default None];
    url: string option [@default None];
} [@@deriving yojson { strict = false }, show ];;

let create () : t = {
    sha1 = None;
    size = None;
    url = None;
}
