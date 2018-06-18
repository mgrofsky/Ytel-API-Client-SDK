#import "SWGUsageApi.h"
#import "SWGQueryParamCollection.h"
#import "SWGApiClient.h"


@interface SWGUsageApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation SWGUsageApi

NSString* kSWGUsageApiErrorDomain = @"SWGUsageApiErrorDomain";
NSInteger kSWGUsageApiMissingParamErrorCode = 234513;

@synthesize apiClient = _apiClient;

#pragma mark - Initialize methods

- (instancetype) init {
    return [self initWithApiClient:[SWGApiClient sharedClient]];
}


-(instancetype) initWithApiClient:(SWGApiClient *)apiClient {
    self = [super init];
    if (self) {
        _apiClient = apiClient;
        _mutableDefaultHeaders = [NSMutableDictionary dictionary];
    }
    return self;
}

#pragma mark -

-(NSString*) defaultHeaderForKey:(NSString*)key {
    return self.mutableDefaultHeaders[key];
}

-(void) setDefaultHeaderValue:(NSString*) value forKey:(NSString*)key {
    [self.mutableDefaultHeaders setValue:value forKey:key];
}

-(NSDictionary *)defaultHeaders {
    return self.mutableDefaultHeaders;
}

#pragma mark - Api Methods

///
/// List Usage
/// Retrieve usage metrics regarding your Ytel account. The results includes inbound/outbound voice calls and inbound/outbound SMS messages as well as carrier lookup requests.
///  @param productCode Filter usage results by product type. (optional, default to 0)
///
///  @param startDate Filter usage objects by start date. (optional, default to 2016-09-06)
///
///  @param endDate Filter usage objects by end date. (optional, default to 2016-09-06)
///
///  @param includeSubAccounts Will include all subaccount usage data (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) usageListusageWithProductCode: (NSString*) productCode
    startDate: (NSString*) startDate
    endDate: (NSString*) endDate
    includeSubAccounts: (NSString*) includeSubAccounts
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/usage/listusage.json"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[@"auth"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    if (productCode) {
        formParams[@"ProductCode"] = productCode;
    }
    if (startDate) {
        formParams[@"startDate"] = startDate;
    }
    if (endDate) {
        formParams[@"endDate"] = endDate;
    }
    if (includeSubAccounts) {
        formParams[@"IncludeSubAccounts"] = includeSubAccounts;
    }

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"NSString*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSString*)data, error);
                                }
                            }];
}



@end
