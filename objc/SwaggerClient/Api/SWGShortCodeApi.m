#import "SWGShortCodeApi.h"
#import "SWGQueryParamCollection.h"
#import "SWGApiClient.h"


@interface SWGShortCodeApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation SWGShortCodeApi

NSString* kSWGShortCodeApiErrorDomain = @"SWGShortCodeApiErrorDomain";
NSInteger kSWGShortCodeApiMissingParamErrorCode = 234513;

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
/// List Inbound SMS
/// Retrive a list of inbound Sms Short Code messages associated with your Ytel account.
///  @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
///
///  @param pagesize Number of individual resources listed in the response per page (optional, default to 10)
///
///  @param from Only list SMS messages sent from this number (optional)
///
///  @param shortcode Only list SMS messages sent to Shortcode (optional)
///
///  @param datecreated Only list SMS messages sent in the specified date MAKE REQUEST (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) dedicatedshortcodeGetinboundsmsWithPage: (NSNumber*) page
    pagesize: (NSNumber*) pagesize
    from: (NSString*) from
    shortcode: (NSString*) shortcode
    datecreated: (NSString*) datecreated
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/dedicatedshortcode/getinboundsms.json"];

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
    if (from) {
        formParams[@"From"] = from;
    }
    if (shortcode) {
        formParams[@"Shortcode"] = shortcode;
    }
    if (datecreated) {
        formParams[@"Datecreated"] = datecreated;
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
/// Retrieve a list of Short Code assignment associated with your Ytel account.
///  @param shortcode Only list Short Code Assignment sent from this Short Code (optional)
///
///  @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional)
///
///  @param pagesize The count of objects to return per page. (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) dedicatedshortcodeListshortcodeWithShortcode: (NSString*) shortcode
    page: (NSString*) page
    pagesize: (NSString*) pagesize
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/dedicatedshortcode/listshortcode.json"];

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
/// Send Dedicated Shortcode
///  @param shortcode Your dedicated shortcode 
///
///  @param to The number to send your SMS to 
///
///  @param body The body of your message 
///
///  @param method Specifies the HTTP method used to request the required URL once the Short Code message is sent.GET or POST (optional)
///
///  @param messagestatuscallback URL that can be requested to receive notification when Short Code message was sent. (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) dedicatedshortcodeSendsmsWithShortcode: (NSNumber*) shortcode
    to: (NSNumber*) to
    body: (NSString*) body
    method: (NSString*) method
    messagestatuscallback: (NSString*) messagestatuscallback
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'shortcode' is set
    if (shortcode == nil) {
        NSParameterAssert(shortcode);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"shortcode"] };
            NSError* error = [NSError errorWithDomain:kSWGShortCodeApiErrorDomain code:kSWGShortCodeApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'to' is set
    if (to == nil) {
        NSParameterAssert(to);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"to"] };
            NSError* error = [NSError errorWithDomain:kSWGShortCodeApiErrorDomain code:kSWGShortCodeApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'body' is set
    if (body == nil) {
        NSParameterAssert(body);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"body"] };
            NSError* error = [NSError errorWithDomain:kSWGShortCodeApiErrorDomain code:kSWGShortCodeApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/dedicatedshortcode/sendsms.json"];

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
    if (body) {
        formParams[@"body"] = body;
    }
    if (method) {
        formParams[@"method"] = method;
    }
    if (messagestatuscallback) {
        formParams[@"messagestatuscallback"] = messagestatuscallback;
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
/// Update a dedicated shortcode.
///  @param shortcode List of valid dedicated shortcode to your Ytel account. 
///
///  @param friendlyName User generated name of the dedicated shortcode. (optional)
///
///  @param callbackMethod Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. (optional)
///
///  @param callbackUrl URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. (optional)
///
///  @param fallbackMethod Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional)
///
///  @param fallbackUrl URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST. (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) dedicatedshortcodeUpdateshortcodeWithShortcode: (NSString*) shortcode
    friendlyName: (NSString*) friendlyName
    callbackMethod: (NSString*) callbackMethod
    callbackUrl: (NSString*) callbackUrl
    fallbackMethod: (NSString*) fallbackMethod
    fallbackUrl: (NSString*) fallbackUrl
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'shortcode' is set
    if (shortcode == nil) {
        NSParameterAssert(shortcode);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"shortcode"] };
            NSError* error = [NSError errorWithDomain:kSWGShortCodeApiErrorDomain code:kSWGShortCodeApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/dedicatedshortcode/updateshortcode.json"];

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
    if (callbackMethod) {
        formParams[@"CallbackMethod"] = callbackMethod;
    }
    if (callbackUrl) {
        formParams[@"CallbackUrl"] = callbackUrl;
    }
    if (fallbackMethod) {
        formParams[@"FallbackMethod"] = fallbackMethod;
    }
    if (fallbackUrl) {
        formParams[@"FallbackUrl"] = fallbackUrl;
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
/// View SMS
/// Retrieve a single Short Code object by its shortcode assignment.
///  @param shortcode List of valid Dedicated Short Code to your Ytel account 
///
///  @returns NSString*
///
-(NSURLSessionTask*) dedicatedshortcodeViewshortcodeWithShortcode: (NSString*) shortcode
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'shortcode' is set
    if (shortcode == nil) {
        NSParameterAssert(shortcode);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"shortcode"] };
            NSError* error = [NSError errorWithDomain:kSWGShortCodeApiErrorDomain code:kSWGShortCodeApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/dedicatedshortcode/viewshortcode.json"];

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
/// List SMS
/// Retrieve a list of Short Code messages.
///  @param shortcode Only list messages sent from this Short Code (optional)
///
///  @param to Only list messages sent to this number (optional)
///
///  @param dateSent Only list messages sent with the specified date (optional)
///
///  @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
///
///  @param pageSize The count of objects to return per page. (optional, default to 10)
///
///  @returns NSString*
///
-(NSURLSessionTask*) shortcodeListsmsWithShortcode: (NSString*) shortcode
    to: (NSString*) to
    dateSent: (NSString*) dateSent
    page: (NSNumber*) page
    pageSize: (NSNumber*) pageSize
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/shortcode/listsms.json"];

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
    if (to) {
        formParams[@"To"] = to;
    }
    if (dateSent) {
        formParams[@"DateSent"] = dateSent;
    }
    if (page) {
        formParams[@"Page"] = page;
    }
    if (pageSize) {
        formParams[@"PageSize"] = pageSize;
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
/// View SMS
/// View a single Sms Short Code message.
///  @param messageSid The unique identifier for the sms resource 
///
///  @returns NSString*
///
-(NSURLSessionTask*) shortcodeViewsmsWithMessageSid: (NSString*) messageSid
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'messageSid' is set
    if (messageSid == nil) {
        NSParameterAssert(messageSid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"messageSid"] };
            NSError* error = [NSError errorWithDomain:kSWGShortCodeApiErrorDomain code:kSWGShortCodeApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/shortcode/viewsms.json"];

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
    if (messageSid) {
        formParams[@"MessageSid"] = messageSid;
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
