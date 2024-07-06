const samples = require('../samples/DefaultApi');
const VersionManifest = require('../models/VersionManifest');
const VersionPackageInfo = require('../models/VersionPackageInfo');
const utils = require('../utils/utils');

module.exports = {
    getMinecraftVersionManifest: {
        key: 'getMinecraftVersionManifest',
        noun: 'default',
        display: {
            label: 'Get Minecraft version manifest',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
            ],
            outputFields: [
                ...VersionManifest.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://launchermeta.mojang.com/mc/game/version_manifest.json'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['VersionManifestSample']
        }
    },
    getMinecraftVersionPackageInfo: {
        key: 'getMinecraftVersionPackageInfo',
        noun: 'default',
        display: {
            label: 'Get Minecraft version package info',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'packageId',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'versionId',
                    label: '',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...VersionPackageInfo.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://launchermeta.mojang.com/v1/packages/{packageId}/{versionId}.json'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['VersionPackageInfoSample']
        }
    },
}
