//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class VersionPackageInfoAssetIndex {
  /// Returns a new [VersionPackageInfoAssetIndex] instance.
  VersionPackageInfoAssetIndex({
    this.id,
    this.sha1,
    this.size,
    this.totalSize,
    this.url,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? sha1;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? size;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? totalSize;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? url;

  @override
  bool operator ==(Object other) => identical(this, other) || other is VersionPackageInfoAssetIndex &&
    other.id == id &&
    other.sha1 == sha1 &&
    other.size == size &&
    other.totalSize == totalSize &&
    other.url == url;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (sha1 == null ? 0 : sha1!.hashCode) +
    (size == null ? 0 : size!.hashCode) +
    (totalSize == null ? 0 : totalSize!.hashCode) +
    (url == null ? 0 : url!.hashCode);

  @override
  String toString() => 'VersionPackageInfoAssetIndex[id=$id, sha1=$sha1, size=$size, totalSize=$totalSize, url=$url]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.sha1 != null) {
      json[r'sha1'] = this.sha1;
    } else {
      json[r'sha1'] = null;
    }
    if (this.size != null) {
      json[r'size'] = this.size;
    } else {
      json[r'size'] = null;
    }
    if (this.totalSize != null) {
      json[r'totalSize'] = this.totalSize;
    } else {
      json[r'totalSize'] = null;
    }
    if (this.url != null) {
      json[r'url'] = this.url;
    } else {
      json[r'url'] = null;
    }
    return json;
  }

  /// Returns a new [VersionPackageInfoAssetIndex] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static VersionPackageInfoAssetIndex? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return VersionPackageInfoAssetIndex(
        id: mapValueOfType<String>(json, r'id'),
        sha1: mapValueOfType<String>(json, r'sha1'),
        size: mapValueOfType<int>(json, r'size'),
        totalSize: mapValueOfType<int>(json, r'totalSize'),
        url: mapValueOfType<String>(json, r'url'),
      );
    }
    return null;
  }

  static List<VersionPackageInfoAssetIndex> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <VersionPackageInfoAssetIndex>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = VersionPackageInfoAssetIndex.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, VersionPackageInfoAssetIndex> mapFromJson(dynamic json) {
    final map = <String, VersionPackageInfoAssetIndex>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = VersionPackageInfoAssetIndex.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of VersionPackageInfoAssetIndex-objects as value to a dart map
  static Map<String, List<VersionPackageInfoAssetIndex>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<VersionPackageInfoAssetIndex>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = VersionPackageInfoAssetIndex.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

