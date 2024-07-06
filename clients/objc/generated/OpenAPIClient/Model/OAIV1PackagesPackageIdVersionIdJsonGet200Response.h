#import <Foundation/Foundation.h>
#import "OAIObject.h"

/**
* 
* SDK for Minecraft versions info
*
* The version of the OpenAPI document: 0.9.0-pre.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#import "OAIV1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.h"
#import "OAIV1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.h"
#import "OAIV1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion.h"
@protocol OAIV1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex;
@class OAIV1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex;
@protocol OAIV1PackagesPackageIdVersionIdJsonGet200ResponseDownloads;
@class OAIV1PackagesPackageIdVersionIdJsonGet200ResponseDownloads;
@protocol OAIV1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion;
@class OAIV1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion;



@protocol OAIV1PackagesPackageIdVersionIdJsonGet200Response
@end

@interface OAIV1PackagesPackageIdVersionIdJsonGet200Response : OAIObject


@property(nonatomic) NSString* version;

@property(nonatomic) OAIV1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex* assetIndex;

@property(nonatomic) NSNumber* assets;

@property(nonatomic) NSNumber* complianceLevel;

@property(nonatomic) OAIV1PackagesPackageIdVersionIdJsonGet200ResponseDownloads* downloads;

@property(nonatomic) NSString* _id;

@property(nonatomic) OAIV1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion* javaVersion;

@property(nonatomic) NSString* mainClass;

@property(nonatomic) NSNumber* minimumLauncherVersion;

@property(nonatomic) NSDate* time;

@property(nonatomic) NSDate* releaseTime;

@property(nonatomic) NSString* type;

@end