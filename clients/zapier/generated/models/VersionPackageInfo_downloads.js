const utils = require('../utils/utils');
const Download = require('../models/Download');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...Download.fields(`${keyPrefix}client`, isInput),
            ...Download.fields(`${keyPrefix}client_mappings`, isInput),
            ...Download.fields(`${keyPrefix}server`, isInput),
            ...Download.fields(`${keyPrefix}server_mappings`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'client': utils.removeIfEmpty(Download.mapping(bundle, `${keyPrefix}client`)),
            'client_mappings': utils.removeIfEmpty(Download.mapping(bundle, `${keyPrefix}client_mappings`)),
            'server': utils.removeIfEmpty(Download.mapping(bundle, `${keyPrefix}server`)),
            'server_mappings': utils.removeIfEmpty(Download.mapping(bundle, `${keyPrefix}server_mappings`)),
        }
    },
}
