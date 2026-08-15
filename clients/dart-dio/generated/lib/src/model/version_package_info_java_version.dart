//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'version_package_info_java_version.g.dart';

/// VersionPackageInfoJavaVersion
///
/// Properties:
/// * [component] 
/// * [majorVersion] 
@BuiltValue()
abstract class VersionPackageInfoJavaVersion implements Built<VersionPackageInfoJavaVersion, VersionPackageInfoJavaVersionBuilder> {
  @BuiltValueField(wireName: r'component')
  String? get component;

  @BuiltValueField(wireName: r'majorVersion')
  int? get majorVersion;

  VersionPackageInfoJavaVersion._();

  factory VersionPackageInfoJavaVersion([void updates(VersionPackageInfoJavaVersionBuilder b)]) = _$VersionPackageInfoJavaVersion;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(VersionPackageInfoJavaVersionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<VersionPackageInfoJavaVersion> get serializer => _$VersionPackageInfoJavaVersionSerializer();
}

class _$VersionPackageInfoJavaVersionSerializer implements PrimitiveSerializer<VersionPackageInfoJavaVersion> {
  @override
  final Iterable<Type> types = const [VersionPackageInfoJavaVersion, _$VersionPackageInfoJavaVersion];

  @override
  final String wireName = r'VersionPackageInfoJavaVersion';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    VersionPackageInfoJavaVersion object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.component != null) {
      yield r'component';
      yield serializers.serialize(
        object.component,
        specifiedType: const FullType(String),
      );
    }
    if (object.majorVersion != null) {
      yield r'majorVersion';
      yield serializers.serialize(
        object.majorVersion,
        specifiedType: const FullType(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    VersionPackageInfoJavaVersion object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required VersionPackageInfoJavaVersionBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'component':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.component = valueDes;
          break;
        case r'majorVersion':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.majorVersion = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  VersionPackageInfoJavaVersion deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = VersionPackageInfoJavaVersionBuilder();
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

