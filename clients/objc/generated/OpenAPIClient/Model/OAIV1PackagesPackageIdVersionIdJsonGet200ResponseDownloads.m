#import "OAIV1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.h"

@implementation OAIV1PackagesPackageIdVersionIdJsonGet200ResponseDownloads

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"client": @"client", @"clientMappings": @"client_mappings", @"server": @"server", @"serverMappings": @"server_mappings" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"client", @"clientMappings", @"server", @"serverMappings"];
  return [optionalProperties containsObject:propertyName];
}

@end
