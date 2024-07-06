const utils = require('../utils/utils');
const VersionPackageInfo_assetIndex = require('../models/VersionPackageInfo_assetIndex');
const VersionPackageInfo_downloads = require('../models/VersionPackageInfo_downloads');
const VersionPackageInfo_javaVersion = require('../models/VersionPackageInfo_javaVersion');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}version`,
                label: `[${labelPrefix}version]`,
                type: 'string',
            },
            ...VersionPackageInfo_assetIndex.fields(`${keyPrefix}assetIndex`, isInput),
            {
                key: `${keyPrefix}assets`,
                label: `[${labelPrefix}assets]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}complianceLevel`,
                label: `[${labelPrefix}complianceLevel]`,
                type: 'integer',
            },
            ...VersionPackageInfo_downloads.fields(`${keyPrefix}downloads`, isInput),
            {
                key: `${keyPrefix}id`,
                label: `[${labelPrefix}id]`,
                type: 'string',
            },
            ...VersionPackageInfo_javaVersion.fields(`${keyPrefix}javaVersion`, isInput),
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
            'assetIndex': utils.removeIfEmpty(VersionPackageInfo_assetIndex.mapping(bundle, `${keyPrefix}assetIndex`)),
            'assets': bundle.inputData?.[`${keyPrefix}assets`],
            'complianceLevel': bundle.inputData?.[`${keyPrefix}complianceLevel`],
            'downloads': utils.removeIfEmpty(VersionPackageInfo_downloads.mapping(bundle, `${keyPrefix}downloads`)),
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'javaVersion': utils.removeIfEmpty(VersionPackageInfo_javaVersion.mapping(bundle, `${keyPrefix}javaVersion`)),
            'mainClass': bundle.inputData?.[`${keyPrefix}mainClass`],
            'minimumLauncherVersion': bundle.inputData?.[`${keyPrefix}minimumLauncherVersion`],
            'time': bundle.inputData?.[`${keyPrefix}time`],
            'releaseTime': bundle.inputData?.[`${keyPrefix}releaseTime`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
        }
    },
}
