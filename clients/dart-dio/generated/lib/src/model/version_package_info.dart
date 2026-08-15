//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/version_package_info_downloads.dart';
import 'package:openapi/src/model/version_package_info_asset_index.dart';
import 'package:openapi/src/model/version_package_info_java_version.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'version_package_info.g.dart';

/// VersionPackageInfo
///
/// Properties:
/// * [version] 
/// * [assetIndex] 
/// * [assets] 
/// * [complianceLevel] 
/// * [downloads] 
/// * [id] 
/// * [javaVersion] 
/// * [mainClass] 
/// * [minimumLauncherVersion] 
/// * [time] 
/// * [releaseTime] 
/// * [type] 
@BuiltValue()
abstract class VersionPackageInfo implements Built<VersionPackageInfo, VersionPackageInfoBuilder> {
  @BuiltValueField(wireName: r'version')
  String? get version;

  @BuiltValueField(wireName: r'assetIndex')
  VersionPackageInfoAssetIndex? get assetIndex;

  @BuiltValueField(wireName: r'assets')
  String? get assets;

  @BuiltValueField(wireName: r'complianceLevel')
  int? get complianceLevel;

  @BuiltValueField(wireName: r'downloads')
  VersionPackageInfoDownloads? get downloads;

  @BuiltValueField(wireName: r'id')
  String? get id;

  @BuiltValueField(wireName: r'javaVersion')
  VersionPackageInfoJavaVersion? get javaVersion;

  @BuiltValueField(wireName: r'mainClass')
  String? get mainClass;

  @BuiltValueField(wireName: r'minimumLauncherVersion')
  int? get minimumLauncherVersion;

  @BuiltValueField(wireName: r'time')
  DateTime? get time;

  @BuiltValueField(wireName: r'releaseTime')
  DateTime? get releaseTime;

  @BuiltValueField(wireName: r'type')
  String? get type;

  VersionPackageInfo._();

  factory VersionPackageInfo([void updates(VersionPackageInfoBuilder b)]) = _$VersionPackageInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(VersionPackageInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<VersionPackageInfo> get serializer => _$VersionPackageInfoSerializer();
}

class _$VersionPackageInfoSerializer implements PrimitiveSerializer<VersionPackageInfo> {
  @override
  final Iterable<Type> types = const [VersionPackageInfo, _$VersionPackageInfo];

  @override
  final String wireName = r'VersionPackageInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    VersionPackageInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.version != null) {
      yield r'version';
      yield serializers.serialize(
        object.version,
        specifiedType: const FullType(String),
      );
    }
    if (object.assetIndex != null) {
      yield r'assetIndex';
      yield serializers.serialize(
        object.assetIndex,
        specifiedType: const FullType(VersionPackageInfoAssetIndex),
      );
    }
    if (object.assets != null) {
      yield r'assets';
      yield serializers.serialize(
        object.assets,
        specifiedType: const FullType(String),
      );
    }
    if (object.complianceLevel != null) {
      yield r'complianceLevel';
      yield serializers.serialize(
        object.complianceLevel,
        specifiedType: const FullType(int),
      );
    }
    if (object.downloads != null) {
      yield r'downloads';
      yield serializers.serialize(
        object.downloads,
        specifiedType: const FullType(VersionPackageInfoDownloads),
      );
    }
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.javaVersion != null) {
      yield r'javaVersion';
      yield serializers.serialize(
        object.javaVersion,
        specifiedType: const FullType(VersionPackageInfoJavaVersion),
      );
    }
    if (object.mainClass != null) {
      yield r'mainClass';
      yield serializers.serialize(
        object.mainClass,
        specifiedType: const FullType(String),
      );
    }
    if (object.minimumLauncherVersion != null) {
      yield r'minimumLauncherVersion';
      yield serializers.serialize(
        object.minimumLauncherVersion,
        specifiedType: const FullType(int),
      );
    }
    if (object.time != null) {
      yield r'time';
      yield serializers.serialize(
        object.time,
        specifiedType: const FullType(DateTime),
      );
    }
    if (object.releaseTime != null) {
      yield r'releaseTime';
      yield serializers.serialize(
        object.releaseTime,
        specifiedType: const FullType(DateTime),
      );
    }
    if (object.type != null) {
      yield r'type';
      yield serializers.serialize(
        object.type,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    VersionPackageInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required VersionPackageInfoBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'version':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.version = valueDes;
          break;
        case r'assetIndex':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(VersionPackageInfoAssetIndex),
          ) as VersionPackageInfoAssetIndex?;
          if (valueDes == null) continue;
          result.assetIndex.replace(valueDes);
          break;
        case r'assets':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.assets = valueDes;
          break;
        case r'complianceLevel':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.complianceLevel = valueDes;
          break;
        case r'downloads':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(VersionPackageInfoDownloads),
          ) as VersionPackageInfoDownloads?;
          if (valueDes == null) continue;
          result.downloads.replace(valueDes);
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.id = valueDes;
          break;
        case r'javaVersion':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(VersionPackageInfoJavaVersion),
          ) as VersionPackageInfoJavaVersion?;
          if (valueDes == null) continue;
          result.javaVersion.replace(valueDes);
          break;
        case r'mainClass':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.mainClass = valueDes;
          break;
        case r'minimumLauncherVersion':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.minimumLauncherVersion = valueDes;
          break;
        case r'time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(DateTime),
          ) as DateTime?;
          if (valueDes == null) continue;
          result.time = valueDes;
          break;
        case r'releaseTime':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(DateTime),
          ) as DateTime?;
          if (valueDes == null) continue;
          result.releaseTime = valueDes;
          break;
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.type = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  VersionPackageInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = VersionPackageInfoBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

