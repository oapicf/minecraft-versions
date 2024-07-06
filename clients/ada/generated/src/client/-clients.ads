--  
--  SDK for Minecraft versions info
--
--  The version of the OpenAPI document: 0.9.0_pre.0
--  Contact: blah+oapicf@cliffano.com
--
--  NOTE: This package is auto generated by OpenAPI-Generator 7.6.0.
--  https://openapi-generator.tech
--  Do not edit the class manually.

with .Models;
with Swagger.Clients;
package .Clients is
   pragma Style_Checks ("-bmrIu");

   type Client_Type is new Swagger.Clients.Client_Type with null record;

   --  Get Minecraft version manifest
   procedure Get_Minecraft_Version_Manifest
      (Client : in out Client_Type;
       Result : out .Models.GetMinecraftVersionManifest200Response_Type);

   --  Get Minecraft version package details
   procedure V_1Packages_Package_Id_Version_Id_Json_Get
      (Client : in out Client_Type;
       Package_Id : in Swagger.UString;
       Version_Id : in Swagger.UString;
       Result : out .Models.V1PackagesPackageIdVersionIdJsonGet200Response_Type);

end .Clients;