//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/download.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'version_package_info_downloads.g.dart';

/// VersionPackageInfoDownloads
///
/// Properties:
/// * [client] 
/// * [clientMappings] 
/// * [server] 
/// * [serverMappings] 
@BuiltValue()
abstract class VersionPackageInfoDownloads implements Built<VersionPackageInfoDownloads, VersionPackageInfoDownloadsBuilder> {
  @BuiltValueField(wireName: r'client')
  Download? get client;

  @BuiltValueField(wireName: r'client_mappings')
  Download? get clientMappings;

  @BuiltValueField(wireName: r'server')
  Download? get server;

  @BuiltValueField(wireName: r'server_mappings')
  Download? get serverMappings;

  VersionPackageInfoDownloads._();

  factory VersionPackageInfoDownloads([void updates(VersionPackageInfoDownloadsBuilder b)]) = _$VersionPackageInfoDownloads;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(VersionPackageInfoDownloadsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<VersionPackageInfoDownloads> get serializer => _$VersionPackageInfoDownloadsSerializer();
}

class _$VersionPackageInfoDownloadsSerializer implements PrimitiveSerializer<VersionPackageInfoDownloads> {
  @override
  final Iterable<Type> types = const [VersionPackageInfoDownloads, _$VersionPackageInfoDownloads];

  @override
  final String wireName = r'VersionPackageInfoDownloads';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    VersionPackageInfoDownloads object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.client != null) {
      yield r'client';
      yield serializers.serialize(
        object.client,
        specifiedType: const FullType(Download),
      );
    }
    if (object.clientMappings != null) {
      yield r'client_mappings';
      yield serializers.serialize(
        object.clientMappings,
        specifiedType: const FullType(Download),
      );
    }
    if (object.server != null) {
      yield r'server';
      yield serializers.serialize(
        object.server,
        specifiedType: const FullType(Download),
      );
    }
    if (object.serverMappings != null) {
      yield r'server_mappings';
      yield serializers.serialize(
        object.serverMappings,
        specifiedType: const FullType(Download),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    VersionPackageInfoDownloads object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required VersionPackageInfoDownloadsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'client':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(Download),
          ) as Download?;
          if (valueDes == null) continue;
          result.client.replace(valueDes);
          break;
        case r'client_mappings':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(Download),
          ) as Download?;
          if (valueDes == null) continue;
          result.clientMappings.replace(valueDes);
          break;
        case r'server':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(Download),
          ) as Download?;
          if (valueDes == null) continue;
          result.server.replace(valueDes);
          break;
        case r'server_mappings':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(Download),
          ) as Download?;
          if (valueDes == null) continue;
          result.serverMappings.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  VersionPackageInfoDownloads deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = VersionPackageInfoDownloadsBuilder();
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

