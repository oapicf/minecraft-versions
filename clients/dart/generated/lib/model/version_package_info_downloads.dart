//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class VersionPackageInfoDownloads {
  /// Returns a new [VersionPackageInfoDownloads] instance.
  VersionPackageInfoDownloads({
    this.client,
    this.clientMappings,
    this.server,
    this.serverMappings,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  Download? client;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  Download? clientMappings;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  Download? server;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  Download? serverMappings;

  @override
  bool operator ==(Object other) => identical(this, other) || other is VersionPackageInfoDownloads &&
    other.client == client &&
    other.clientMappings == clientMappings &&
    other.server == server &&
    other.serverMappings == serverMappings;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (client == null ? 0 : client!.hashCode) +
    (clientMappings == null ? 0 : clientMappings!.hashCode) +
    (server == null ? 0 : server!.hashCode) +
    (serverMappings == null ? 0 : serverMappings!.hashCode);

  @override
  String toString() => 'VersionPackageInfoDownloads[client=$client, clientMappings=$clientMappings, server=$server, serverMappings=$serverMappings]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.client != null) {
      json[r'client'] = this.client;
    } else {
      json[r'client'] = null;
    }
    if (this.clientMappings != null) {
      json[r'client_mappings'] = this.clientMappings;
    } else {
      json[r'client_mappings'] = null;
    }
    if (this.server != null) {
      json[r'server'] = this.server;
    } else {
      json[r'server'] = null;
    }
    if (this.serverMappings != null) {
      json[r'server_mappings'] = this.serverMappings;
    } else {
      json[r'server_mappings'] = null;
    }
    return json;
  }

  /// Returns a new [VersionPackageInfoDownloads] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static VersionPackageInfoDownloads? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return VersionPackageInfoDownloads(
        client: Download.fromJson(json[r'client']),
        clientMappings: Download.fromJson(json[r'client_mappings']),
        server: Download.fromJson(json[r'server']),
        serverMappings: Download.fromJson(json[r'server_mappings']),
      );
    }
    return null;
  }

  static List<VersionPackageInfoDownloads> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <VersionPackageInfoDownloads>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = VersionPackageInfoDownloads.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, VersionPackageInfoDownloads> mapFromJson(dynamic json) {
    final map = <String, VersionPackageInfoDownloads>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = VersionPackageInfoDownloads.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of VersionPackageInfoDownloads-objects as value to a dart map
  static Map<String, List<VersionPackageInfoDownloads>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<VersionPackageInfoDownloads>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = VersionPackageInfoDownloads.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

