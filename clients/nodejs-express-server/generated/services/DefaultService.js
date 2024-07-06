/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get Minecraft version manifest
*
* returns VersionManifest
* */
const getMinecraftVersionManifest = () => new Promise(
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
* Get Minecraft version package info
*
* packageId String 
* versionId String 
* returns VersionPackageInfo
* */
const getMinecraftVersionPackageInfo = ({ packageId, versionId }) => new Promise(
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
  getMinecraftVersionManifest,
  getMinecraftVersionPackageInfo,
};
