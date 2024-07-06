#import "OAIV1PackagesPackageIdVersionIdJsonGet200Response.h"

@implementation OAIV1PackagesPackageIdVersionIdJsonGet200Response

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"version": @"version", @"assetIndex": @"assetIndex", @"assets": @"assets", @"complianceLevel": @"complianceLevel", @"downloads": @"downloads", @"_id": @"id", @"javaVersion": @"javaVersion", @"mainClass": @"mainClass", @"minimumLauncherVersion": @"minimumLauncherVersion", @"time": @"time", @"releaseTime": @"releaseTime", @"type": @"type" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"version", @"assetIndex", @"assets", @"complianceLevel", @"downloads", @"_id", @"javaVersion", @"mainClass", @"minimumLauncherVersion", @"time", @"releaseTime", @"type"];
  return [optionalProperties containsObject:propertyName];
}

@end
