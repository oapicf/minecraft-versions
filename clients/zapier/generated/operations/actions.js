const DefaultApi = require('../apis/DefaultApi');
const { searchMiddleware, hasSearchRequisites, isSearchAction } = require('../utils/utils');

const actions = {
    [DefaultApi.mcGameVersionManifestGet.key]: DefaultApi.mcGameVersionManifestGet,
    [DefaultApi.v1PackagesPackageIdVersionIdJsonGet.key]: DefaultApi.v1PackagesPackageIdVersionIdJsonGet,
}

module.exports = {
    searchActions: () => Object.entries(actions).reduce((actions, [key, value]) => isSearchAction(key) && hasSearchRequisites(value) ? {...actions, [key]: searchMiddleware(value)} : actions, {}),
    createActions: () => Object.entries(actions).reduce((actions, [key, value]) => !isSearchAction(key) ? {...actions, [key]: value} : actions, {}),
}