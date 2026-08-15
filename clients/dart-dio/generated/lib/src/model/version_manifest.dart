//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/version_manifest_latest.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/version.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'version_manifest.g.dart';

/// VersionManifest
///
/// Properties:
/// * [latest] 
/// * [versions] 
@BuiltValue()
abstract class VersionManifest implements Built<VersionManifest, VersionManifestBuilder> {
  @BuiltValueField(wireName: r'latest')
  VersionManifestLatest? get latest;

  @BuiltValueField(wireName: r'versions')
  BuiltList<Version>? get versions;

  VersionManifest._();

  factory VersionManifest([void updates(VersionManifestBuilder b)]) = _$VersionManifest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(VersionManifestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<VersionManifest> get serializer => _$VersionManifestSerializer();
}

class _$VersionManifestSerializer implements PrimitiveSerializer<VersionManifest> {
  @override
  final Iterable<Type> types = const [VersionManifest, _$VersionManifest];

  @override
  final String wireName = r'VersionManifest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    VersionManifest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.latest != null) {
      yield r'latest';
      yield serializers.serialize(
        object.latest,
        specifiedType: const FullType(VersionManifestLatest),
      );
    }
    if (object.versions != null) {
      yield r'versions';
      yield serializers.serialize(
        object.versions,
        specifiedType: const FullType(BuiltList, [FullType(Version)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    VersionManifest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required VersionManifestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'latest':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(VersionManifestLatest),
          ) as VersionManifestLatest?;
          if (valueDes == null) continue;
          result.latest.replace(valueDes);
          break;
        case r'versions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(Version)]),
          ) as BuiltList<Version>?;
          if (valueDes == null) continue;
          result.versions.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  VersionManifest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = VersionManifestBuilder();
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

