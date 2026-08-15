//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'version_manifest_latest.g.dart';

/// VersionManifestLatest
///
/// Properties:
/// * [release] 
/// * [snapshot] 
@BuiltValue()
abstract class VersionManifestLatest implements Built<VersionManifestLatest, VersionManifestLatestBuilder> {
  @BuiltValueField(wireName: r'release')
  String? get release;

  @BuiltValueField(wireName: r'snapshot')
  String? get snapshot;

  VersionManifestLatest._();

  factory VersionManifestLatest([void updates(VersionManifestLatestBuilder b)]) = _$VersionManifestLatest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(VersionManifestLatestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<VersionManifestLatest> get serializer => _$VersionManifestLatestSerializer();
}

class _$VersionManifestLatestSerializer implements PrimitiveSerializer<VersionManifestLatest> {
  @override
  final Iterable<Type> types = const [VersionManifestLatest, _$VersionManifestLatest];

  @override
  final String wireName = r'VersionManifestLatest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    VersionManifestLatest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.release != null) {
      yield r'release';
      yield serializers.serialize(
        object.release,
        specifiedType: const FullType(String),
      );
    }
    if (object.snapshot != null) {
      yield r'snapshot';
      yield serializers.serialize(
        object.snapshot,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    VersionManifestLatest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required VersionManifestLatestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'release':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.release = valueDes;
          break;
        case r'snapshot':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.snapshot = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  VersionManifestLatest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = VersionManifestLatestBuilder();
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

