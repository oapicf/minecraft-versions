const samples = require('../samples/DefaultApi');
const _mc_game_version_manifest_get_200_response = require('../models/_mc_game_version_manifest_get_200_response');
const _v1_packages__packageId___versionId__json_get_200_response = require('../models/_v1_packages__packageId___versionId__json_get_200_response');
const utils = require('../utils/utils');

module.exports = {
    mcGameVersionManifestGet: {
        key: 'mcGameVersionManifestGet',
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
                ..._mc_game_version_manifest_get_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://launchermeta.mojang.com/mc/game/version_manifest'),
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
            sample: samples['_mc_game_version_manifest_get_200_responseSample']
        }
    },
    v1PackagesPackageIdVersionIdJsonGet: {
        key: 'v1PackagesPackageIdVersionIdJsonGet',
        noun: 'default',
        display: {
            label: 'Get Minecraft version package details',
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
                ..._v1_packages__packageId___versionId__json_get_200_response.fields('', false),
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
            sample: samples['_v1_packages__packageId___versionId__json_get_200_responseSample']
        }
    },
}