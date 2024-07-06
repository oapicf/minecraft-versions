goog.provide('API.Client.VersionManifest');

/**
 * @record
 */
API.Client.VersionManifest = function() {}

/**
 * @type {!API.Client.VersionManifest_latest}
 * @export
 */
API.Client.VersionManifest.prototype.latest;

/**
 * @type {!Array<!API.Client.Version>}
 * @export
 */
API.Client.VersionManifest.prototype.versions;

