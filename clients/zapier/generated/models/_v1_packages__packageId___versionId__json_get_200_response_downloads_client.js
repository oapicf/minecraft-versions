const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
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
                key: `${keyPrefix}url`,
                label: `[${labelPrefix}url]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'sha1': bundle.inputData?.[`${keyPrefix}sha1`],
            'size': bundle.inputData?.[`${keyPrefix}size`],
            'url': bundle.inputData?.[`${keyPrefix}url`],
        }
    },
}
