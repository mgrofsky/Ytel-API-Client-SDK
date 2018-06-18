#import "SWGSharedShortCodeApi.h"
#import "SWGQueryParamCollection.h"
#import "SWGApiClient.h"


@interface SWGSharedShortCodeApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation SWGSharedShortCodeApi

NSString* kSWGSharedShortCodeApiErrorDomain = @"SWGSharedShortCodeApiErrorDomain";
NSInteger kSWGSharedShortCodeApiMissingParamErrorCode = 234513;

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
/// List Keywords
/// Retrieve a list of keywords associated with your Ytel account.
///  @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
///
///  @param pagesize Number of individual resources listed in the response per page (optional, default to 10)
///
///  @param keyword Only list keywords of keyword (optional)
///
///  @param shortcode Only list keywords of shortcode (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) keywordListsWithPage: (NSNumber*) page
    pagesize: (NSNumber*) pagesize
    keyword: (NSString*) keyword
    shortcode: (NSNumber*) shortcode
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/keyword/lists.json"];

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
    if (page) {
        formParams[@"page"] = page;
    }
    if (pagesize) {
        formParams[@"pagesize"] = pagesize;
    }
    if (keyword) {
        formParams[@"Keyword"] = keyword;
    }
    if (shortcode) {
        formParams[@"Shortcode"] = shortcode;
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

///
/// View Keyword
/// View a set of properties for a single keyword.
///  @param keywordid The unique identifier of each keyword 
///
///  @returns NSString*
///
-(NSURLSessionTask*) keywordViewWithKeywordid: (NSString*) keywordid
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'keywordid' is set
    if (keywordid == nil) {
        NSParameterAssert(keywordid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"keywordid"] };
            NSError* error = [NSError errorWithDomain:kSWGSharedShortCodeApiErrorDomain code:kSWGSharedShortCodeApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/keyword/view.json"];

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
    if (keywordid) {
        formParams[@"Keywordid"] = keywordid;
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

///
/// List Inbound SMS
/// List All Inbound ShortCode
///  @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
///
///  @param pagesize Number of individual resources listed in the response per page (optional, default to 10)
///
///  @param from From Number to Inbound ShortCode (optional)
///
///  @param shortcode Only list messages sent to this Short Code (optional)
///
///  @param datecreated Only list messages sent with the specified date (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) shortcodeGetinboundsmsWithPage: (NSNumber*) page
    pagesize: (NSNumber*) pagesize
    from: (NSString*) from
    shortcode: (NSString*) shortcode
    datecreated: (NSString*) datecreated
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/shortcode/getinboundsms.json"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (datecreated != nil) {
        queryParams[@"Datecreated"] = datecreated;
    }
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
    if (page) {
        formParams[@"page"] = page;
    }
    if (pagesize) {
        formParams[@"pagesize"] = pagesize;
    }
    if (from) {
        formParams[@"from"] = from;
    }
    if (shortcode) {
        formParams[@"Shortcode"] = shortcode;
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

///
/// List Shortcodes
/// Retrieve a list of shortcode assignment associated with your Ytel account.
///  @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
///
///  @param pagesize Number of individual resources listed in the response per page (optional, default to 10)
///
///  @param shortcode Only list keywords of shortcode (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) shortcodeListshortcodeWithPage: (NSNumber*) page
    pagesize: (NSNumber*) pagesize
    shortcode: (NSString*) shortcode
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/shortcode/listshortcode.json"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (shortcode != nil) {
        queryParams[@"Shortcode"] = shortcode;
    }
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
    if (page) {
        formParams[@"page"] = page;
    }
    if (pagesize) {
        formParams[@"pagesize"] = pagesize;
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

///
/// Send SMS
/// Send an SMS from a Ytel ShortCode
///  @param shortcode The Short Code number that is the sender of this message 
///
///  @param to A valid 10-digit number that should receive the message 
///
///  @param templateid The unique identifier for the template used for the message 
///
///  @param data format of your data, example: {companyname}:test,{otpcode}:1234 
///
///  @param method Specifies the HTTP method used to request the required URL once the Short Code message is sent. (optional, default to GET)
///
///  @param messageStatusCallback URL that can be requested to receive notification when Short Code message was sent. (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) shortcodeSendsmsWithShortcode: (NSString*) shortcode
    to: (NSString*) to
    templateid: (NSString*) templateid
    data: (NSString*) data
    method: (NSString*) method
    messageStatusCallback: (NSString*) messageStatusCallback
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'shortcode' is set
    if (shortcode == nil) {
        NSParameterAssert(shortcode);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"shortcode"] };
            NSError* error = [NSError errorWithDomain:kSWGSharedShortCodeApiErrorDomain code:kSWGSharedShortCodeApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'to' is set
    if (to == nil) {
        NSParameterAssert(to);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"to"] };
            NSError* error = [NSError errorWithDomain:kSWGSharedShortCodeApiErrorDomain code:kSWGSharedShortCodeApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'templateid' is set
    if (templateid == nil) {
        NSParameterAssert(templateid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"templateid"] };
            NSError* error = [NSError errorWithDomain:kSWGSharedShortCodeApiErrorDomain code:kSWGSharedShortCodeApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'data' is set
    if (data == nil) {
        NSParameterAssert(data);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"data"] };
            NSError* error = [NSError errorWithDomain:kSWGSharedShortCodeApiErrorDomain code:kSWGSharedShortCodeApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/shortcode/sendsms.json"];

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
    if (shortcode) {
        formParams[@"shortcode"] = shortcode;
    }
    if (to) {
        formParams[@"to"] = to;
    }
    if (templateid) {
        formParams[@"templateid"] = templateid;
    }
    if (data) {
        formParams[@"data"] = data;
    }
    if (method) {
        formParams[@"Method"] = method;
    }
    if (messageStatusCallback) {
        formParams[@"MessageStatusCallback"] = messageStatusCallback;
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

///
/// Update Shortcode
/// Update Assignment
///  @param shortcode List of valid shortcode to your Ytel account 
///
///  @param friendlyName User generated name of the shortcode (optional)
///
///  @param callbackUrl URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. (optional)
///
///  @param callbackMethod Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. (optional)
///
///  @param fallbackUrl URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST. (optional)
///
///  @param fallbackUrlMethod Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) shortcodeUpdateshortcodeWithShortcode: (NSString*) shortcode
    friendlyName: (NSString*) friendlyName
    callbackUrl: (NSString*) callbackUrl
    callbackMethod: (NSString*) callbackMethod
    fallbackUrl: (NSString*) fallbackUrl
    fallbackUrlMethod: (NSString*) fallbackUrlMethod
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'shortcode' is set
    if (shortcode == nil) {
        NSParameterAssert(shortcode);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"shortcode"] };
            NSError* error = [NSError errorWithDomain:kSWGSharedShortCodeApiErrorDomain code:kSWGSharedShortCodeApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/shortcode/updateshortcode.json"];

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
    if (shortcode) {
        formParams[@"Shortcode"] = shortcode;
    }
    if (friendlyName) {
        formParams[@"FriendlyName"] = friendlyName;
    }
    if (callbackUrl) {
        formParams[@"CallbackUrl"] = callbackUrl;
    }
    if (callbackMethod) {
        formParams[@"CallbackMethod"] = callbackMethod;
    }
    if (fallbackUrl) {
        formParams[@"FallbackUrl"] = fallbackUrl;
    }
    if (fallbackUrlMethod) {
        formParams[@"FallbackUrlMethod"] = fallbackUrlMethod;
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

///
/// View Shortcode
/// The response returned here contains all resource properties associated with the given Shortcode.
///  @param shortcode List of valid Shortcode to your Ytel account 
///
///  @returns NSString*
///
-(NSURLSessionTask*) shortcodeViewshortcodeWithShortcode: (NSString*) shortcode
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'shortcode' is set
    if (shortcode == nil) {
        NSParameterAssert(shortcode);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"shortcode"] };
            NSError* error = [NSError errorWithDomain:kSWGSharedShortCodeApiErrorDomain code:kSWGSharedShortCodeApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/shortcode/viewshortcode.json"];

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
    if (shortcode) {
        formParams[@"Shortcode"] = shortcode;
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

///
/// List Templates
/// List Shortcode Templates by Type
///  @param type The type (category) of template Valid values: marketing, authorization (optional, default to authorization)
///
///  @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
///
///  @param pagesize The count of objects to return per page. (optional, default to 10)
///
///  @param shortcode Only list templates of type (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) templateListsWithType: (NSString*) type
    page: (NSNumber*) page
    pagesize: (NSNumber*) pagesize
    shortcode: (NSString*) shortcode
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/template/lists.json"];

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
    if (type) {
        formParams[@"type"] = type;
    }
    if (page) {
        formParams[@"page"] = page;
    }
    if (pagesize) {
        formParams[@"pagesize"] = pagesize;
    }
    if (shortcode) {
        formParams[@"Shortcode"] = shortcode;
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

///
/// View Template
/// View a Shared ShortCode Template
///  @param templateId The unique identifier for a template object 
///
///  @returns NSString*
///
-(NSURLSessionTask*) templateViewWithTemplateId: (NSString*) templateId
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'templateId' is set
    if (templateId == nil) {
        NSParameterAssert(templateId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"templateId"] };
            NSError* error = [NSError errorWithDomain:kSWGSharedShortCodeApiErrorDomain code:kSWGSharedShortCodeApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/template/view.json"];

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
    if (templateId) {
        formParams[@"TemplateId"] = templateId;
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
