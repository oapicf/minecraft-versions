--  
--  SDK for Minecraft versions info
--
--  The version of the OpenAPI document: 0.9.0_pre.0
--  Contact: blah+oapicf@cliffano.com
--
--  NOTE: This package is auto generated by OpenAPI-Generator 7.6.0.
--  https://openapi-generator.tech
--  Do not edit the class manually.

package body .Models is
   pragma Style_Checks ("-bmrIu");

   pragma Warnings (Off, "*use clause for package*");

   use Swagger.Streams;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in .Models.Download_Type) is
   begin
      Into.Start_Entity (Name);
      if not Value.Sha_1.Is_Null then
         Into.Write_Entity ("sha1", Value.Sha_1);
      end if;
      if not Value.Size.Is_Null then
         Into.Write_Entity ("size", Value.Size);
      end if;
      if not Value.Url.Is_Null then
         Into.Write_Entity ("url", Value.Url);
      end if;
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Download_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out .Models.Download_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "sha1", Value.Sha_1);
      Swagger.Streams.Deserialize (Object, "size", Value.Size);
      Swagger.Streams.Deserialize (Object, "url", Value.Url);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out Download_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : .Models.Download_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in .Models.VersionManifestLatest_Type) is
   begin
      Into.Start_Entity (Name);
      if not Value.Release.Is_Null then
         Into.Write_Entity ("release", Value.Release);
      end if;
      if not Value.Snapshot.Is_Null then
         Into.Write_Entity ("snapshot", Value.Snapshot);
      end if;
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VersionManifestLatest_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out .Models.VersionManifestLatest_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "release", Value.Release);
      Swagger.Streams.Deserialize (Object, "snapshot", Value.Snapshot);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out VersionManifestLatest_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : .Models.VersionManifestLatest_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in .Models.VersionPackageInfoAssetIndex_Type) is
   begin
      Into.Start_Entity (Name);
      if not Value.Id.Is_Null then
         Into.Write_Entity ("id", Value.Id);
      end if;
      if not Value.Sha_1.Is_Null then
         Into.Write_Entity ("sha1", Value.Sha_1);
      end if;
      if not Value.Size.Is_Null then
         Into.Write_Entity ("size", Value.Size);
      end if;
      if not Value.Total_Size.Is_Null then
         Into.Write_Entity ("totalSize", Value.Total_Size);
      end if;
      if not Value.Url.Is_Null then
         Into.Write_Entity ("url", Value.Url);
      end if;
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VersionPackageInfoAssetIndex_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out .Models.VersionPackageInfoAssetIndex_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
      Swagger.Streams.Deserialize (Object, "sha1", Value.Sha_1);
      Swagger.Streams.Deserialize (Object, "size", Value.Size);
      Swagger.Streams.Deserialize (Object, "totalSize", Value.Total_Size);
      Swagger.Streams.Deserialize (Object, "url", Value.Url);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out VersionPackageInfoAssetIndex_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : .Models.VersionPackageInfoAssetIndex_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in .Models.VersionPackageInfoJavaVersion_Type) is
   begin
      Into.Start_Entity (Name);
      if not Value.Component.Is_Null then
         Into.Write_Entity ("component", Value.Component);
      end if;
      if not Value.Major_Version.Is_Null then
         Into.Write_Entity ("majorVersion", Value.Major_Version);
      end if;
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VersionPackageInfoJavaVersion_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out .Models.VersionPackageInfoJavaVersion_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "component", Value.Component);
      Swagger.Streams.Deserialize (Object, "majorVersion", Value.Major_Version);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out VersionPackageInfoJavaVersion_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : .Models.VersionPackageInfoJavaVersion_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in .Models.Version_Type) is
   begin
      Into.Start_Entity (Name);
      if not Value.Id.Is_Null then
         Into.Write_Entity ("id", Value.Id);
      end if;
      if not Value.P_Type.Is_Null then
         Into.Write_Entity ("type", Value.P_Type);
      end if;
      if not Value.Url.Is_Null then
         Into.Write_Entity ("url", Value.Url);
      end if;
      if not Value.Time.Is_Null then
         Into.Write_Entity ("time", Value.Time);
      end if;
      if not Value.Release_Time.Is_Null then
         Into.Write_Entity ("releaseTime", Value.Release_Time);
      end if;
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Version_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out .Models.Version_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
      Swagger.Streams.Deserialize (Object, "type", Value.P_Type);
      Swagger.Streams.Deserialize (Object, "url", Value.Url);
      Swagger.Streams.Deserialize (Object, "time", Value.Time);
      Swagger.Streams.Deserialize (Object, "releaseTime", Value.Release_Time);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out Version_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : .Models.Version_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in .Models.VersionPackageInfoDownloads_Type) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "client", Value.Client);
      Serialize (Into, "client_mappings", Value.Client_Mappings);
      Serialize (Into, "server", Value.Server);
      Serialize (Into, "server_mappings", Value.Server_Mappings);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VersionPackageInfoDownloads_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out .Models.VersionPackageInfoDownloads_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Deserialize (Object, "client", Value.Client);
      Deserialize (Object, "client_mappings", Value.Client_Mappings);
      Deserialize (Object, "server", Value.Server);
      Deserialize (Object, "server_mappings", Value.Server_Mappings);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out VersionPackageInfoDownloads_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : .Models.VersionPackageInfoDownloads_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in .Models.VersionManifest_Type) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "latest", Value.Latest);
      Serialize (Into, "versions", Value.Versions);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VersionManifest_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out .Models.VersionManifest_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Deserialize (Object, "latest", Value.Latest);
      Deserialize (Object, "versions", Value.Versions);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out VersionManifest_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : .Models.VersionManifest_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in .Models.VersionPackageInfo_Type) is
   begin
      Into.Start_Entity (Name);
      if not Value.Version.Is_Null then
         Into.Write_Entity ("version", Value.Version);
      end if;
      Serialize (Into, "assetIndex", Value.Asset_Index);
      if not Value.Assets.Is_Null then
         Into.Write_Entity ("assets", Value.Assets);
      end if;
      if not Value.Compliance_Level.Is_Null then
         Into.Write_Entity ("complianceLevel", Value.Compliance_Level);
      end if;
      Serialize (Into, "downloads", Value.Downloads);
      if not Value.Id.Is_Null then
         Into.Write_Entity ("id", Value.Id);
      end if;
      Serialize (Into, "javaVersion", Value.Java_Version);
      if not Value.Main_Class.Is_Null then
         Into.Write_Entity ("mainClass", Value.Main_Class);
      end if;
      if not Value.Minimum_Launcher_Version.Is_Null then
         Into.Write_Entity ("minimumLauncherVersion", Value.Minimum_Launcher_Version);
      end if;
      if not Value.Time.Is_Null then
         Into.Write_Entity ("time", Value.Time);
      end if;
      if not Value.Release_Time.Is_Null then
         Into.Write_Entity ("releaseTime", Value.Release_Time);
      end if;
      if not Value.P_Type.Is_Null then
         Into.Write_Entity ("type", Value.P_Type);
      end if;
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VersionPackageInfo_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out .Models.VersionPackageInfo_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "version", Value.Version);
      Deserialize (Object, "assetIndex", Value.Asset_Index);
      Swagger.Streams.Deserialize (Object, "assets", Value.Assets);
      Swagger.Streams.Deserialize (Object, "complianceLevel", Value.Compliance_Level);
      Deserialize (Object, "downloads", Value.Downloads);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
      Deserialize (Object, "javaVersion", Value.Java_Version);
      Swagger.Streams.Deserialize (Object, "mainClass", Value.Main_Class);
      Swagger.Streams.Deserialize (Object, "minimumLauncherVersion", Value.Minimum_Launcher_Version);
      Swagger.Streams.Deserialize (Object, "time", Value.Time);
      Swagger.Streams.Deserialize (Object, "releaseTime", Value.Release_Time);
      Swagger.Streams.Deserialize (Object, "type", Value.P_Type);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out VersionPackageInfo_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : .Models.VersionPackageInfo_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;


end .Models;
