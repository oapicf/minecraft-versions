//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class VersionManifestLatest {
  /// Returns a new [VersionManifestLatest] instance.
  VersionManifestLatest({
    this.release,
    this.snapshot,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? release;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? snapshot;

  @override
  bool operator ==(Object other) => identical(this, other) || other is VersionManifestLatest &&
    other.release == release &&
    other.snapshot == snapshot;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (release == null ? 0 : release!.hashCode) +
    (snapshot == null ? 0 : snapshot!.hashCode);

  @override
  String toString() => 'VersionManifestLatest[release=$release, snapshot=$snapshot]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.release != null) {
      json[r'release'] = this.release;
    } else {
      json[r'release'] = null;
    }
    if (this.snapshot != null) {
      json[r'snapshot'] = this.snapshot;
    } else {
      json[r'snapshot'] = null;
    }
    return json;
  }

  /// Returns a new [VersionManifestLatest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static VersionManifestLatest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return VersionManifestLatest(
        release: mapValueOfType<String>(json, r'release'),
        snapshot: mapValueOfType<String>(json, r'snapshot'),
      );
    }
    return null;
  }

  static List<VersionManifestLatest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <VersionManifestLatest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = VersionManifestLatest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, VersionManifestLatest> mapFromJson(dynamic json) {
    final map = <String, VersionManifestLatest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = VersionManifestLatest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of VersionManifestLatest-objects as value to a dart map
  static Map<String, List<VersionManifestLatest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<VersionManifestLatest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = VersionManifestLatest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

