const utils = require('../utils/utils');
const _mc_game_version_manifest_get_200_response_latest = require('../models/_mc_game_version_manifest_get_200_response_latest');
const _mc_game_version_manifest_get_200_response_versions_inner = require('../models/_mc_game_version_manifest_get_200_response_versions_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ..._mc_game_version_manifest_get_200_response_latest.fields(`${keyPrefix}latest`, isInput),
            {
                key: `${keyPrefix}versions`,
                label: `[${labelPrefix}versions]`,
                children: _mc_game_version_manifest_get_200_response_versions_inner.fields(`${keyPrefix}versions${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'latest': utils.removeIfEmpty(_mc_game_version_manifest_get_200_response_latest.mapping(bundle, `${keyPrefix}latest`)),
            'versions': utils.childMapping(bundle.inputData?.[`${keyPrefix}versions`], `${keyPrefix}versions`, _mc_game_version_manifest_get_200_response_versions_inner),
        }
    },
}
