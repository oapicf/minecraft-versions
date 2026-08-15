//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'version_package_info_asset_index.g.dart';

/// VersionPackageInfoAssetIndex
///
/// Properties:
/// * [id] 
/// * [sha1] 
/// * [size] 
/// * [totalSize] 
/// * [url] 
@BuiltValue()
abstract class VersionPackageInfoAssetIndex implements Built<VersionPackageInfoAssetIndex, VersionPackageInfoAssetIndexBuilder> {
  @BuiltValueField(wireName: r'id')
  String? get id;

  @BuiltValueField(wireName: r'sha1')
  String? get sha1;

  @BuiltValueField(wireName: r'size')
  int? get size;

  @BuiltValueField(wireName: r'totalSize')
  int? get totalSize;

  @BuiltValueField(wireName: r'url')
  String? get url;

  VersionPackageInfoAssetIndex._();

  factory VersionPackageInfoAssetIndex([void updates(VersionPackageInfoAssetIndexBuilder b)]) = _$VersionPackageInfoAssetIndex;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(VersionPackageInfoAssetIndexBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<VersionPackageInfoAssetIndex> get serializer => _$VersionPackageInfoAssetIndexSerializer();
}

class _$VersionPackageInfoAssetIndexSerializer implements PrimitiveSerializer<VersionPackageInfoAssetIndex> {
  @override
  final Iterable<Type> types = const [VersionPackageInfoAssetIndex, _$VersionPackageInfoAssetIndex];

  @override
  final String wireName = r'VersionPackageInfoAssetIndex';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    VersionPackageInfoAssetIndex object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.sha1 != null) {
      yield r'sha1';
      yield serializers.serialize(
        object.sha1,
        specifiedType: const FullType(String),
      );
    }
    if (object.size != null) {
      yield r'size';
      yield serializers.serialize(
        object.size,
        specifiedType: const FullType(int),
      );
    }
    if (object.totalSize != null) {
      yield r'totalSize';
      yield serializers.serialize(
        object.totalSize,
        specifiedType: const FullType(int),
      );
    }
    if (object.url != null) {
      yield r'url';
      yield serializers.serialize(
        object.url,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    VersionPackageInfoAssetIndex object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required VersionPackageInfoAssetIndexBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.id = valueDes;
          break;
        case r'sha1':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.sha1 = valueDes;
          break;
        case r'size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.size = valueDes;
          break;
        case r'totalSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.totalSize = valueDes;
          break;
        case r'url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.url = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  VersionPackageInfoAssetIndex deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = VersionPackageInfoAssetIndexBuilder();
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

