const utils = require('../utils/utils');
const _v1_packages__packageId___versionId__json_get_200_response_downloads_client = require('../models/_v1_packages__packageId___versionId__json_get_200_response_downloads_client');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ..._v1_packages__packageId___versionId__json_get_200_response_downloads_client.fields(`${keyPrefix}client`, isInput),
            ..._v1_packages__packageId___versionId__json_get_200_response_downloads_client.fields(`${keyPrefix}client_mappings`, isInput),
            ..._v1_packages__packageId___versionId__json_get_200_response_downloads_client.fields(`${keyPrefix}server`, isInput),
            ..._v1_packages__packageId___versionId__json_get_200_response_downloads_client.fields(`${keyPrefix}server_mappings`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'client': utils.removeIfEmpty(_v1_packages__packageId___versionId__json_get_200_response_downloads_client.mapping(bundle, `${keyPrefix}client`)),
            'client_mappings': utils.removeIfEmpty(_v1_packages__packageId___versionId__json_get_200_response_downloads_client.mapping(bundle, `${keyPrefix}client_mappings`)),
            'server': utils.removeIfEmpty(_v1_packages__packageId___versionId__json_get_200_response_downloads_client.mapping(bundle, `${keyPrefix}server`)),
            'server_mappings': utils.removeIfEmpty(_v1_packages__packageId___versionId__json_get_200_response_downloads_client.mapping(bundle, `${keyPrefix}server_mappings`)),
        }
    },
}
