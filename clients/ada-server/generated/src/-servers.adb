--  
--  SDK for Minecraft versions info
--  ------------ EDIT NOTE ------------
--  This file was generated with openapi-generator.  You can modify it to implement
--  the server.  After you modify this file, you should add the following line
--  to the .openapi-generator-ignore file:
--
--  src/-servers.adb
--
--  Then, you can drop this edit note comment.
--  ------------ EDIT NOTE ------------
package body .Servers is


   --  Get Minecraft version manifest
   overriding
   procedure Get_Minecraft_Version_Manifest
      (Server : in out Server_Type
       ;
       Result  : out .Models.VersionManifest_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Minecraft_Version_Manifest;

   --  Get Minecraft version package info
   overriding
   procedure Get_Minecraft_Version_Package_Info
      (Server : in out Server_Type;
       Package_Id : in Swagger.UString;
       Version_Id : in Swagger.UString;
       Result  : out .Models.VersionPackageInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Minecraft_Version_Package_Info;

end .Servers;
