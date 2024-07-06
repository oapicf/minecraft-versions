--  
--  SDK for Minecraft versions info
--
--  The version of the OpenAPI document: 0.9.0_pre.0
--  Contact: blah+oapicf@cliffano.com
--
--  NOTE: This package is auto generated by OpenAPI-Generator 7.6.0.
--  https://openapi-generator.tech
--  Do not edit the class manually.

pragma Warnings (Off, "*is not referenced");
with Swagger.Streams;
with Swagger.Servers.Operation;
package body .Skeletons is
   pragma Style_Checks ("-bmrIu");
   pragma Warnings (Off, "*use clause for package*");

   use Swagger.Streams;

   Media_List_1 : aliased constant Swagger.Mime_List := (
     1 => Swagger.Mime_Json);

   package body Skeleton is


      package API_Mc_Game_Version_Manifest_Get is
         new Swagger.Servers.Operation
            (Handler => Mc_Game_Version_Manifest_Get,
             Method  => Swagger.Servers.GET,
             URI     => URI_Prefix & "/mc/game/version_manifest",
             Mimes   => Media_List_1'Access);

      --  Get Minecraft version manifest
      procedure Mc_Game_Version_Manifest_Get
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Result : .Models.McGameVersionManifestGet200Response_Type;
      begin
         
         
         Impl.Mc_Game_Version_Manifest_Get (Result, Context);
         if Context.Get_Status = 200 then
            Context.Set_Description ("A list of Minecraft versions with the latest and snapshot releases");

            Stream.Start_Document;
            Serialize (Stream, "", Result);
            Stream.End_Document;
            return;
         end if;

      end Mc_Game_Version_Manifest_Get;

      package API_V_1Packages_Package_Id_Version_Id_Json_Get is
         new Swagger.Servers.Operation
            (Handler => V_1Packages_Package_Id_Version_Id_Json_Get,
             Method  => Swagger.Servers.GET,
             URI     => URI_Prefix & "/v1/packages/{packageId}/{versionId}.json",
             Mimes   => Media_List_1'Access);

      --  Get Minecraft version package details
      procedure V_1Packages_Package_Id_Version_Id_Json_Get
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Package_Id : Swagger.UString;
         Version_Id : Swagger.UString;
         Result : .Models.V1PackagesPackageIdVersionIdJsonGet200Response_Type;
      begin
         
         
         Package_Id := To_Swagger.UString (Swagger.Servers.Get_Path_Parameter (Req, 1));

         Version_Id := To_Swagger.UString (Swagger.Servers.Get_Path_Parameter (Req, 2));

         Impl.V_1Packages_Package_Id_Version_Id_Json_Get
            (Package_Id,
             Version_Id, Result, Context);
         if Context.Get_Status = 200 then
            Context.Set_Description ("Get package version details");

            Stream.Start_Document;
            Serialize (Stream, "", Result);
            Stream.End_Document;
            return;
         end if;

      end V_1Packages_Package_Id_Version_Id_Json_Get;

      procedure Register (Server : in out Swagger.Servers.Application_Type'Class) is
      begin
         Swagger.Servers.Register (Server, API_Mc_Game_Version_Manifest_Get.Definition);
         Swagger.Servers.Register (Server, API_V_1Packages_Package_Id_Version_Id_Json_Get.Definition);
      end Register;

   end Skeleton;

   package body Shared_Instance is


      --  Get Minecraft version manifest
      procedure Mc_Game_Version_Manifest_Get
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Result : .Models.McGameVersionManifestGet200Response_Type;
      begin

         
         Server.Mc_Game_Version_Manifest_Get (Result, Context);
         if Context.Get_Status = 200 then
            Context.Set_Description ("A list of Minecraft versions with the latest and snapshot releases");

            Stream.Start_Document;
            Serialize (Stream, "", Result);
            Stream.End_Document;
            return;
         end if;

      end Mc_Game_Version_Manifest_Get;

      package API_Mc_Game_Version_Manifest_Get is
         new Swagger.Servers.Operation
            (Handler => Mc_Game_Version_Manifest_Get,
             Method  => Swagger.Servers.GET,
             URI     => URI_Prefix & "/mc/game/version_manifest",
             Mimes   => Media_List_1'Access);


      --  Get Minecraft version package details
      procedure V_1Packages_Package_Id_Version_Id_Json_Get
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Package_Id : Swagger.UString;
         Version_Id : Swagger.UString;
         Result : .Models.V1PackagesPackageIdVersionIdJsonGet200Response_Type;
      begin

         
         Package_Id := To_Swagger.UString (Swagger.Servers.Get_Path_Parameter (Req, 1));

         Version_Id := To_Swagger.UString (Swagger.Servers.Get_Path_Parameter (Req, 2));

         Server.V_1Packages_Package_Id_Version_Id_Json_Get
            (Package_Id,
             Version_Id, Result, Context);
         if Context.Get_Status = 200 then
            Context.Set_Description ("Get package version details");

            Stream.Start_Document;
            Serialize (Stream, "", Result);
            Stream.End_Document;
            return;
         end if;

      end V_1Packages_Package_Id_Version_Id_Json_Get;

      package API_V_1Packages_Package_Id_Version_Id_Json_Get is
         new Swagger.Servers.Operation
            (Handler => V_1Packages_Package_Id_Version_Id_Json_Get,
             Method  => Swagger.Servers.GET,
             URI     => URI_Prefix & "/v1/packages/{packageId}/{versionId}.json",
             Mimes   => Media_List_1'Access);


      procedure Register (Server : in out Swagger.Servers.Application_Type'Class) is
      begin
         Swagger.Servers.Register (Server, API_Mc_Game_Version_Manifest_Get.Definition);
         Swagger.Servers.Register (Server, API_V_1Packages_Package_Id_Version_Id_Json_Get.Definition);
      end Register;

      protected body Server is
         --  Get Minecraft version manifest
         procedure Mc_Game_Version_Manifest_Get (Result : out .Models.McGameVersionManifestGet200Response_Type;
         Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Mc_Game_Version_Manifest_Get (Result, Context);
         end Mc_Game_Version_Manifest_Get;

         --  Get Minecraft version package details
         procedure V_1Packages_Package_Id_Version_Id_Json_Get
            (Package_Id : in Swagger.UString;
             Version_Id : in Swagger.UString;
             Result : out .Models.V1PackagesPackageIdVersionIdJsonGet200Response_Type;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.V_1Packages_Package_Id_Version_Id_Json_Get
               (Package_Id,
                Version_Id,
                Result,
                Context);
         end V_1Packages_Package_Id_Version_Id_Json_Get;

      end Server;

   end Shared_Instance;

end .Skeletons;