const utils = require('../utils/utils');
const Version = require('../models/Version');
const VersionManifest_latest = require('../models/VersionManifest_latest');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...VersionManifest_latest.fields(`${keyPrefix}latest`, isInput),
            {
                key: `${keyPrefix}versions`,
                label: `[${labelPrefix}versions]`,
                children: Version.fields(`${keyPrefix}versions${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'latest': utils.removeIfEmpty(VersionManifest_latest.mapping(bundle, `${keyPrefix}latest`)),
            'versions': utils.childMapping(bundle.inputData?.[`${keyPrefix}versions`], `${keyPrefix}versions`, Version),
        }
    },
}
