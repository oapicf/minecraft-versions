const utils = require('../utils/utils');
const _v1_packages__packageId___versionId__json_get_200_response_assetIndex = require('../models/_v1_packages__packageId___versionId__json_get_200_response_assetIndex');
const _v1_packages__packageId___versionId__json_get_200_response_downloads = require('../models/_v1_packages__packageId___versionId__json_get_200_response_downloads');
const _v1_packages__packageId___versionId__json_get_200_response_javaVersion = require('../models/_v1_packages__packageId___versionId__json_get_200_response_javaVersion');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}version`,
                label: `[${labelPrefix}version]`,
                type: 'string',
            },
            ..._v1_packages__packageId___versionId__json_get_200_response_assetIndex.fields(`${keyPrefix}assetIndex`, isInput),
            {
                key: `${keyPrefix}assets`,
                label: `[${labelPrefix}assets]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}complianceLevel`,
                label: `[${labelPrefix}complianceLevel]`,
                type: 'integer',
            },
            ..._v1_packages__packageId___versionId__json_get_200_response_downloads.fields(`${keyPrefix}downloads`, isInput),
            {
                key: `${keyPrefix}id`,
                label: `[${labelPrefix}id]`,
                type: 'string',
            },
            ..._v1_packages__packageId___versionId__json_get_200_response_javaVersion.fields(`${keyPrefix}javaVersion`, isInput),
            {
                key: `${keyPrefix}mainClass`,
                label: `[${labelPrefix}mainClass]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}minimumLauncherVersion`,
                label: `[${labelPrefix}minimumLauncherVersion]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}time`,
                label: `[${labelPrefix}time]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}releaseTime`,
                label: `[${labelPrefix}releaseTime]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}type`,
                label: `[${labelPrefix}type]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'version': bundle.inputData?.[`${keyPrefix}version`],
            'assetIndex': utils.removeIfEmpty(_v1_packages__packageId___versionId__json_get_200_response_assetIndex.mapping(bundle, `${keyPrefix}assetIndex`)),
            'assets': bundle.inputData?.[`${keyPrefix}assets`],
            'complianceLevel': bundle.inputData?.[`${keyPrefix}complianceLevel`],
            'downloads': utils.removeIfEmpty(_v1_packages__packageId___versionId__json_get_200_response_downloads.mapping(bundle, `${keyPrefix}downloads`)),
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'javaVersion': utils.removeIfEmpty(_v1_packages__packageId___versionId__json_get_200_response_javaVersion.mapping(bundle, `${keyPrefix}javaVersion`)),
            'mainClass': bundle.inputData?.[`${keyPrefix}mainClass`],
            'minimumLauncherVersion': bundle.inputData?.[`${keyPrefix}minimumLauncherVersion`],
            'time': bundle.inputData?.[`${keyPrefix}time`],
            'releaseTime': bundle.inputData?.[`${keyPrefix}releaseTime`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
        }
    },
}
