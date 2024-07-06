--  
--  SDK for Minecraft versions info
--  ------------ EDIT NOTE ------------
--  This file was generated with openapi-generator.  You can modify it to implement
--  the server.  After you modify this file, you should add the following line
--  to the .openapi-generator-ignore file:
--
--  src/-servers.ads
--
--  Then, you can drop this edit note comment.
--  ------------ EDIT NOTE ------------
with Swagger.Servers;
with .Models;
with .Skeletons;

package .Servers is
   pragma Warnings (Off, "*use clause for package*");
   use .Models;
   type Server_Type is limited new .Skeletons.Server_Type with null record;


   --  Get Minecraft version manifest
   overriding
   procedure Get_Minecraft_Version_Manifest
      (Server : in out Server_Type
       ;
       Result  : out .Models.GetMinecraftVersionManifest200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get Minecraft version package details
   overriding
   procedure V_1Packages_Package_Id_Version_Id_Json_Get
      (Server : in out Server_Type;
       Package_Id : in Swagger.UString;
       Version_Id : in Swagger.UString;
       Result  : out .Models.V1PackagesPackageIdVersionIdJsonGet200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   package Server_Impl is
      new .Skeletons.Shared_Instance (Server_Type);

end .Servers;
