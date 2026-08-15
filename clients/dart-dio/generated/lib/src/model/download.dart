//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'download.g.dart';

/// Download
///
/// Properties:
/// * [sha1] 
/// * [size] 
/// * [url] 
@BuiltValue()
abstract class Download implements Built<Download, DownloadBuilder> {
  @BuiltValueField(wireName: r'sha1')
  String? get sha1;

  @BuiltValueField(wireName: r'size')
  int? get size;

  @BuiltValueField(wireName: r'url')
  String? get url;

  Download._();

  factory Download([void updates(DownloadBuilder b)]) = _$Download;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DownloadBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<Download> get serializer => _$DownloadSerializer();
}

class _$DownloadSerializer implements PrimitiveSerializer<Download> {
  @override
  final Iterable<Type> types = const [Download, _$Download];

  @override
  final String wireName = r'Download';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    Download object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
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
    Download object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DownloadBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
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
  Download deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DownloadBuilder();
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

