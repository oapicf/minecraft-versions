(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 *)

type t = {
    component: string option [@default None];
    major_version: int32 option [@default None];
} [@@deriving yojson { strict = false }, show ];;

let create () : t = {
    component = None;
    major_version = None;
}

