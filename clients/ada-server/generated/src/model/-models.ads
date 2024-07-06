--  
--  SDK for Minecraft versions info
--
--  The version of the OpenAPI document: 0.9.0_pre.0
--  Contact: blah+oapicf@cliffano.com
--
--  NOTE: This package is auto generated by OpenAPI-Generator 7.6.0.
--  https://openapi-generator.tech
--  Do not edit the class manually.

with Swagger.Streams;
with Ada.Containers.Vectors;
package .Models is
   pragma Style_Checks ("-bmrIu");



   type McGameVersionManifestGet200ResponseLatest_Type is
     record
       Release : Swagger.Nullable_UString;
       Snapshot : Swagger.Nullable_UString;
     end record;


   package McGameVersionManifestGet200ResponseLatest_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => .Models.McGameVersionManifestGet200ResponseLatest_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in .Models.McGameVersionManifestGet200ResponseLatest_Type);
   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in McGameVersionManifestGet200ResponseLatest_Type_Vectors.Vector);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out .Models.McGameVersionManifestGet200ResponseLatest_Type);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out McGameVersionManifestGet200ResponseLatest_Type_Vectors.Vector);



   type McGameVersionManifestGet200ResponseVersionsInner_Type is
     record
       Id : Swagger.Nullable_UString;
       P_Type : Swagger.Nullable_UString;
       Url : Swagger.Nullable_UString;
       Time : Swagger.Nullable_Date;
       Release_Time : Swagger.Nullable_Date;
     end record;


   package McGameVersionManifestGet200ResponseVersionsInner_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => .Models.McGameVersionManifestGet200ResponseVersionsInner_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in .Models.McGameVersionManifestGet200ResponseVersionsInner_Type);
   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in McGameVersionManifestGet200ResponseVersionsInner_Type_Vectors.Vector);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out .Models.McGameVersionManifestGet200ResponseVersionsInner_Type);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out McGameVersionManifestGet200ResponseVersionsInner_Type_Vectors.Vector);



   type V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex_Type is
     record
       Id : Swagger.Nullable_UString;
       Sha_1 : Swagger.Nullable_UString;
       Size : Swagger.Nullable_Integer;
       Total_Size : Swagger.Nullable_Integer;
       Url : Swagger.Nullable_UString;
     end record;


   package V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => .Models.V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in .Models.V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex_Type);
   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex_Type_Vectors.Vector);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out .Models.V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex_Type);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex_Type_Vectors.Vector);



   type V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient_Type is
     record
       Sha_1 : Swagger.Nullable_UString;
       Size : Swagger.Nullable_Integer;
       Url : Swagger.Nullable_UString;
     end record;


   package V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => .Models.V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in .Models.V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient_Type);
   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient_Type_Vectors.Vector);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out .Models.V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient_Type);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient_Type_Vectors.Vector);



   type V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion_Type is
     record
       Component : Swagger.Nullable_UString;
       Major_Version : Swagger.Nullable_Integer;
     end record;


   package V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => .Models.V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in .Models.V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion_Type);
   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion_Type_Vectors.Vector);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out .Models.V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion_Type);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion_Type_Vectors.Vector);



   type V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads_Type is
     record
       Client : .Models.V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient_Type;
       Client_Mappings : .Models.V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient_Type;
       Server : .Models.V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient_Type;
       Server_Mappings : .Models.V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient_Type;
     end record;


   package V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => .Models.V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in .Models.V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads_Type);
   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads_Type_Vectors.Vector);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out .Models.V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads_Type);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads_Type_Vectors.Vector);



   type McGameVersionManifestGet200Response_Type is
     record
       Latest : .Models.McGameVersionManifestGet200ResponseLatest_Type;
       Versions : .Models.McGameVersionManifestGet200ResponseVersionsInner_Type_Vectors.Vector;
     end record;


   package McGameVersionManifestGet200Response_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => .Models.McGameVersionManifestGet200Response_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in .Models.McGameVersionManifestGet200Response_Type);
   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in McGameVersionManifestGet200Response_Type_Vectors.Vector);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out .Models.McGameVersionManifestGet200Response_Type);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out McGameVersionManifestGet200Response_Type_Vectors.Vector);



   type V1PackagesPackageIdVersionIdJsonGet200Response_Type is
     record
       Version : Swagger.Nullable_UString;
       Asset_Index : .Models.V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex_Type;
       Assets : Swagger.Nullable_Integer;
       Compliance_Level : Swagger.Nullable_Integer;
       Downloads : .Models.V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads_Type;
       Id : Swagger.Nullable_UString;
       Java_Version : .Models.V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion_Type;
       Main_Class : Swagger.Nullable_UString;
       Minimum_Launcher_Version : Swagger.Nullable_Integer;
       Time : Swagger.Nullable_Date;
       Release_Time : Swagger.Nullable_Date;
       P_Type : Swagger.Nullable_UString;
     end record;


   package V1PackagesPackageIdVersionIdJsonGet200Response_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => .Models.V1PackagesPackageIdVersionIdJsonGet200Response_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in .Models.V1PackagesPackageIdVersionIdJsonGet200Response_Type);
   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in V1PackagesPackageIdVersionIdJsonGet200Response_Type_Vectors.Vector);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out .Models.V1PackagesPackageIdVersionIdJsonGet200Response_Type);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out V1PackagesPackageIdVersionIdJsonGet200Response_Type_Vectors.Vector);


end .Models;