const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}release`,
                label: `[${labelPrefix}release]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}snapshot`,
                label: `[${labelPrefix}snapshot]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'release': bundle.inputData?.[`${keyPrefix}release`],
            'snapshot': bundle.inputData?.[`${keyPrefix}snapshot`],
        }
    },
}
