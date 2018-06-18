#import "SWGSMSApi.h"
#import "SWGQueryParamCollection.h"
#import "SWGApiClient.h"


@interface SWGSMSApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation SWGSMSApi

NSString* kSWGSMSApiErrorDomain = @"SWGSMSApiErrorDomain";
NSInteger kSWGSMSApiMissingParamErrorCode = 234513;

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
/// Retrieve a list of Inbound SMS message objects.
///  @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
///
///  @param pageSize The count of objects to return per page. (optional, default to 10)
///
///  @param from Filter SMS message objects from this valid 10-digit phone number (E.164 format). (optional)
///
///  @param to Filter SMS message objects to this valid 10-digit phone number (E.164 format). (optional)
///
///  @param dateSent Filter sms message objects by this date. (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) smsGetinboundsmsWithPage: (NSNumber*) page
    pageSize: (NSNumber*) pageSize
    from: (NSString*) from
    to: (NSString*) to
    dateSent: (NSString*) dateSent
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/sms/getinboundsms.json"];

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
        formParams[@"Page"] = page;
    }
    if (pageSize) {
        formParams[@"PageSize"] = pageSize;
    }
    if (from) {
        formParams[@"From"] = from;
    }
    if (to) {
        formParams[@"To"] = to;
    }
    if (dateSent) {
        formParams[@"DateSent"] = dateSent;
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
/// Retrieve a list of Outbound SMS message objects.
///  @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
///
///  @param pageSize Number of individual resources listed in the response per page (optional, default to 10)
///
///  @param from Filter SMS message objects from this valid 10-digit phone number (E.164 format). (optional)
///
///  @param to Filter SMS message objects to this valid 10-digit phone number (E.164 format). (optional)
///
///  @param dateSent Only list SMS messages sent in the specified date range (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) smsListsmsWithPage: (NSNumber*) page
    pageSize: (NSNumber*) pageSize
    from: (NSString*) from
    to: (NSString*) to
    dateSent: (NSString*) dateSent
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/sms/listsms.json"];

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
        formParams[@"Page"] = page;
    }
    if (pageSize) {
        formParams[@"PageSize"] = pageSize;
    }
    if (from) {
        formParams[@"From"] = from;
    }
    if (to) {
        formParams[@"To"] = to;
    }
    if (dateSent) {
        formParams[@"DateSent"] = dateSent;
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
/// Send an SMS from a Ytel number
///  @param from The 10-digit SMS-enabled Ytel number (E.164 format) in which the message is sent. 
///
///  @param to The 10-digit phone number (E.164 format) that will receive the message. 
///
///  @param body The body message that is to be sent in the text. 
///
///  @param method Specifies the HTTP method used to request the required URL once SMS sent. (optional)
///
///  @param messageStatusCallback URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished. (optional)
///
///  @param smartsms Check's 'to' number can receive sms or not using Carrier API, if wireless = true then text sms is sent, else wireless = false then call is recieved to end user with audible message. (optional, default to false)
///
///  @param deliveryStatus Delivery reports are a method to tell your system if the message has arrived on the destination phone. (optional, default to false)
///
///  @returns NSString*
///
-(NSURLSessionTask*) smsSendsmsWithFrom: (NSString*) from
    to: (NSString*) to
    body: (NSString*) body
    method: (NSString*) method
    messageStatusCallback: (NSString*) messageStatusCallback
    smartsms: (NSNumber*) smartsms
    deliveryStatus: (NSNumber*) deliveryStatus
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'from' is set
    if (from == nil) {
        NSParameterAssert(from);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"from"] };
            NSError* error = [NSError errorWithDomain:kSWGSMSApiErrorDomain code:kSWGSMSApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'to' is set
    if (to == nil) {
        NSParameterAssert(to);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"to"] };
            NSError* error = [NSError errorWithDomain:kSWGSMSApiErrorDomain code:kSWGSMSApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'body' is set
    if (body == nil) {
        NSParameterAssert(body);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"body"] };
            NSError* error = [NSError errorWithDomain:kSWGSMSApiErrorDomain code:kSWGSMSApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/sms/sendsms.json"];

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
    if (from) {
        formParams[@"From"] = from;
    }
    if (to) {
        formParams[@"To"] = to;
    }
    if (body) {
        formParams[@"Body"] = body;
    }
    if (method) {
        formParams[@"Method"] = method;
    }
    if (messageStatusCallback) {
        formParams[@"MessageStatusCallback"] = messageStatusCallback;
    }
    if (smartsms) {
        formParams[@"Smartsms"] = smartsms;
    }
    if (deliveryStatus) {
        formParams[@"DeliveryStatus"] = deliveryStatus;
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
/// Retrieve a single SMS message object with details by its SmsSid.
///  @param messageSid The unique identifier for a sms message. 
///
///  @returns NSString*
///
-(NSURLSessionTask*) smsViewdetailsmsWithMessageSid: (NSString*) messageSid
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'messageSid' is set
    if (messageSid == nil) {
        NSParameterAssert(messageSid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"messageSid"] };
            NSError* error = [NSError errorWithDomain:kSWGSMSApiErrorDomain code:kSWGSMSApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/sms/viewdetailsms.json"];

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

///
/// View SMS
/// Retrieve a single SMS message object by its SmsSid.
///  @param messageSid The unique identifier for a sms message. 
///
///  @returns NSString*
///
-(NSURLSessionTask*) smsViewsmsWithMessageSid: (NSString*) messageSid
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'messageSid' is set
    if (messageSid == nil) {
        NSParameterAssert(messageSid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"messageSid"] };
            NSError* error = [NSError errorWithDomain:kSWGSMSApiErrorDomain code:kSWGSMSApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/sms/viewsms.json"];

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
