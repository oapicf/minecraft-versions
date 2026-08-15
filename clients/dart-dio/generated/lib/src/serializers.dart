//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_import

import 'package:one_of_serializer/any_of_serializer.dart';
import 'package:one_of_serializer/one_of_serializer.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/serializer.dart';
import 'package:built_value/standard_json_plugin.dart';
import 'package:built_value/iso_8601_date_time_serializer.dart';
import 'package:openapi/src/date_serializer.dart';
import 'package:openapi/src/model/date.dart';

import 'package:openapi/src/model/download.dart';
import 'package:openapi/src/model/version.dart';
import 'package:openapi/src/model/version_manifest.dart';
import 'package:openapi/src/model/version_manifest_latest.dart';
import 'package:openapi/src/model/version_package_info.dart';
import 'package:openapi/src/model/version_package_info_asset_index.dart';
import 'package:openapi/src/model/version_package_info_downloads.dart';
import 'package:openapi/src/model/version_package_info_java_version.dart';

part 'serializers.g.dart';

@SerializersFor([
  Download,
  Version,
  VersionManifest,
  VersionManifestLatest,
  VersionPackageInfo,
  VersionPackageInfoAssetIndex,
  VersionPackageInfoDownloads,
  VersionPackageInfoJavaVersion,
])
Serializers serializers = (_$serializers.toBuilder()
      ..addBuilderFactory(
        const FullType(BuiltList, [FullType(Version)]),
        () => ListBuilder<Version>(),
      )
      ..add(const OneOfSerializer())
      ..add(const AnyOfSerializer())
      ..add(const DateSerializer())
      ..add(Iso8601DateTimeSerializer())
    ).build();

Serializers standardSerializers =
    (serializers.toBuilder()..addPlugin(StandardJsonPlugin())).build();
