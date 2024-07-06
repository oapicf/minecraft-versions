const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}component`,
                label: `[${labelPrefix}component]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}majorVersion`,
                label: `[${labelPrefix}majorVersion]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'component': bundle.inputData?.[`${keyPrefix}component`],
            'majorVersion': bundle.inputData?.[`${keyPrefix}majorVersion`],
        }
    },
}
