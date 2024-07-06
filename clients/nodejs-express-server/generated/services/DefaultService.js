/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get Minecraft version manifest
*
* returns _mc_game_version_manifest_get_200_response
* */
const mcGameVersionManifestGET = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get Minecraft version package details
*
* packageId String 
* versionId String 
* returns _v1_packages__packageId___versionId__json_get_200_response
* */
const v1PackagesPackageIdVersionIdJsonGET = ({ packageId, versionId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        packageId,
        versionId,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  mcGameVersionManifestGET,
  v1PackagesPackageIdVersionIdJsonGET,
};
