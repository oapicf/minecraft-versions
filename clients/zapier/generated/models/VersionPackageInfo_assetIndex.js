const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `[${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}sha1`,
                label: `[${labelPrefix}sha1]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}size`,
                label: `[${labelPrefix}size]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}totalSize`,
                label: `[${labelPrefix}totalSize]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}url`,
                label: `[${labelPrefix}url]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'sha1': bundle.inputData?.[`${keyPrefix}sha1`],
            'size': bundle.inputData?.[`${keyPrefix}size`],
            'totalSize': bundle.inputData?.[`${keyPrefix}totalSize`],
            'url': bundle.inputData?.[`${keyPrefix}url`],
        }
    },
}
