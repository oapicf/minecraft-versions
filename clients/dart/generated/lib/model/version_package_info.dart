//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class VersionPackageInfo {
  /// Returns a new [VersionPackageInfo] instance.
  VersionPackageInfo({
    this.version,
    this.assetIndex,
    this.assets,
    this.complianceLevel,
    this.downloads,
    this.id,
    this.javaVersion,
    this.mainClass,
    this.minimumLauncherVersion,
    this.time,
    this.releaseTime,
    this.type,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? version;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  VersionPackageInfoAssetIndex? assetIndex;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? assets;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? complianceLevel;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  VersionPackageInfoDownloads? downloads;

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
  VersionPackageInfoJavaVersion? javaVersion;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? mainClass;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? minimumLauncherVersion;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? time;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? releaseTime;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? type;

  @override
  bool operator ==(Object other) => identical(this, other) || other is VersionPackageInfo &&
    other.version == version &&
    other.assetIndex == assetIndex &&
    other.assets == assets &&
    other.complianceLevel == complianceLevel &&
    other.downloads == downloads &&
    other.id == id &&
    other.javaVersion == javaVersion &&
    other.mainClass == mainClass &&
    other.minimumLauncherVersion == minimumLauncherVersion &&
    other.time == time &&
    other.releaseTime == releaseTime &&
    other.type == type;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (version == null ? 0 : version!.hashCode) +
    (assetIndex == null ? 0 : assetIndex!.hashCode) +
    (assets == null ? 0 : assets!.hashCode) +
    (complianceLevel == null ? 0 : complianceLevel!.hashCode) +
    (downloads == null ? 0 : downloads!.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (javaVersion == null ? 0 : javaVersion!.hashCode) +
    (mainClass == null ? 0 : mainClass!.hashCode) +
    (minimumLauncherVersion == null ? 0 : minimumLauncherVersion!.hashCode) +
    (time == null ? 0 : time!.hashCode) +
    (releaseTime == null ? 0 : releaseTime!.hashCode) +
    (type == null ? 0 : type!.hashCode);

  @override
  String toString() => 'VersionPackageInfo[version=$version, assetIndex=$assetIndex, assets=$assets, complianceLevel=$complianceLevel, downloads=$downloads, id=$id, javaVersion=$javaVersion, mainClass=$mainClass, minimumLauncherVersion=$minimumLauncherVersion, time=$time, releaseTime=$releaseTime, type=$type]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.version != null) {
      json[r'version'] = this.version;
    } else {
      json[r'version'] = null;
    }
    if (this.assetIndex != null) {
      json[r'assetIndex'] = this.assetIndex;
    } else {
      json[r'assetIndex'] = null;
    }
    if (this.assets != null) {
      json[r'assets'] = this.assets;
    } else {
      json[r'assets'] = null;
    }
    if (this.complianceLevel != null) {
      json[r'complianceLevel'] = this.complianceLevel;
    } else {
      json[r'complianceLevel'] = null;
    }
    if (this.downloads != null) {
      json[r'downloads'] = this.downloads;
    } else {
      json[r'downloads'] = null;
    }
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.javaVersion != null) {
      json[r'javaVersion'] = this.javaVersion;
    } else {
      json[r'javaVersion'] = null;
    }
    if (this.mainClass != null) {
      json[r'mainClass'] = this.mainClass;
    } else {
      json[r'mainClass'] = null;
    }
    if (this.minimumLauncherVersion != null) {
      json[r'minimumLauncherVersion'] = this.minimumLauncherVersion;
    } else {
      json[r'minimumLauncherVersion'] = null;
    }
    if (this.time != null) {
      json[r'time'] = this.time!.toUtc().toIso8601String();
    } else {
      json[r'time'] = null;
    }
    if (this.releaseTime != null) {
      json[r'releaseTime'] = this.releaseTime!.toUtc().toIso8601String();
    } else {
      json[r'releaseTime'] = null;
    }
    if (this.type != null) {
      json[r'type'] = this.type;
    } else {
      json[r'type'] = null;
    }
    return json;
  }

  /// Returns a new [VersionPackageInfo] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static VersionPackageInfo? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return VersionPackageInfo(
        version: mapValueOfType<String>(json, r'version'),
        assetIndex: VersionPackageInfoAssetIndex.fromJson(json[r'assetIndex']),
        assets: mapValueOfType<String>(json, r'assets'),
        complianceLevel: mapValueOfType<int>(json, r'complianceLevel'),
        downloads: VersionPackageInfoDownloads.fromJson(json[r'downloads']),
        id: mapValueOfType<String>(json, r'id'),
        javaVersion: VersionPackageInfoJavaVersion.fromJson(json[r'javaVersion']),
        mainClass: mapValueOfType<String>(json, r'mainClass'),
        minimumLauncherVersion: mapValueOfType<int>(json, r'minimumLauncherVersion'),
        time: mapDateTime(json, r'time', r''),
        releaseTime: mapDateTime(json, r'releaseTime', r''),
        type: mapValueOfType<String>(json, r'type'),
      );
    }
    return null;
  }

  static List<VersionPackageInfo> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <VersionPackageInfo>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = VersionPackageInfo.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, VersionPackageInfo> mapFromJson(dynamic json) {
    final map = <String, VersionPackageInfo>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = VersionPackageInfo.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of VersionPackageInfo-objects as value to a dart map
  static Map<String, List<VersionPackageInfo>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<VersionPackageInfo>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = VersionPackageInfo.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

