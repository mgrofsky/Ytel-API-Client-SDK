#import "SWGPhoneNumberApi.h"
#import "SWGQueryParamCollection.h"
#import "SWGApiClient.h"


@interface SWGPhoneNumberApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation SWGPhoneNumberApi

NSString* kSWGPhoneNumberApiErrorDomain = @"SWGPhoneNumberApiErrorDomain";
NSInteger kSWGPhoneNumberApiMissingParamErrorCode = 234513;

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
/// Available Numbers
/// Retrieve a list of available phone numbers that can be purchased and used for your Ytel account.
///  @param numbertype Number type either SMS,Voice or all 
///
///  @param areacode Specifies the area code for the returned list of available numbers. Only available for North American numbers. 
///
///  @param pagesize The count of objects to return. (optional, default to 10)
///
///  @returns NSString*
///
-(NSURLSessionTask*) incomingphoneAvailablenumberWithNumbertype: (NSString*) numbertype
    areacode: (NSString*) areacode
    pagesize: (NSNumber*) pagesize
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'numbertype' is set
    if (numbertype == nil) {
        NSParameterAssert(numbertype);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"numbertype"] };
            NSError* error = [NSError errorWithDomain:kSWGPhoneNumberApiErrorDomain code:kSWGPhoneNumberApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'areacode' is set
    if (areacode == nil) {
        NSParameterAssert(areacode);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"areacode"] };
            NSError* error = [NSError errorWithDomain:kSWGPhoneNumberApiErrorDomain code:kSWGPhoneNumberApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/incomingphone/availablenumber.json"];

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
    if (numbertype) {
        formParams[@"numbertype"] = numbertype;
    }
    if (areacode) {
        formParams[@"areacode"] = areacode;
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
/// Bulk Buy Numbers
/// Purchase a selected number of DID's from specific area codes to be used with your Ytel account.
///  @param numberType The capability the number supports. 
///
///  @param areaCode Specifies the area code for the returned list of available numbers. Only available for North American numbers. 
///
///  @param quantity A positive integer that tells how many number you want to buy at a time. 
///
///  @param leftover If desired quantity is unavailable purchase what is available . (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) incomingphoneBulkbuyWithNumberType: (NSString*) numberType
    areaCode: (NSString*) areaCode
    quantity: (NSString*) quantity
    leftover: (NSString*) leftover
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'numberType' is set
    if (numberType == nil) {
        NSParameterAssert(numberType);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"numberType"] };
            NSError* error = [NSError errorWithDomain:kSWGPhoneNumberApiErrorDomain code:kSWGPhoneNumberApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'areaCode' is set
    if (areaCode == nil) {
        NSParameterAssert(areaCode);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"areaCode"] };
            NSError* error = [NSError errorWithDomain:kSWGPhoneNumberApiErrorDomain code:kSWGPhoneNumberApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'quantity' is set
    if (quantity == nil) {
        NSParameterAssert(quantity);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"quantity"] };
            NSError* error = [NSError errorWithDomain:kSWGPhoneNumberApiErrorDomain code:kSWGPhoneNumberApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/incomingphone/bulkbuy.json"];

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
    if (numberType) {
        formParams[@"NumberType"] = numberType;
    }
    if (areaCode) {
        formParams[@"AreaCode"] = areaCode;
    }
    if (quantity) {
        formParams[@"Quantity"] = quantity;
    }
    if (leftover) {
        formParams[@"Leftover"] = leftover;
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
/// Purchase Number
/// Purchase a phone number to be used with your Ytel account
///  @param phoneNumber A valid 10-digit Ytel number (E.164 format). 
///
///  @returns NSString*
///
-(NSURLSessionTask*) incomingphoneBuynumberWithPhoneNumber: (NSString*) phoneNumber
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'phoneNumber' is set
    if (phoneNumber == nil) {
        NSParameterAssert(phoneNumber);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"phoneNumber"] };
            NSError* error = [NSError errorWithDomain:kSWGPhoneNumberApiErrorDomain code:kSWGPhoneNumberApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/incomingphone/buynumber.json"];

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
    if (phoneNumber) {
        formParams[@"PhoneNumber"] = phoneNumber;
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
/// Get DID Score
/// Get DID Score Number
///  @param phonenumber Specifies the multiple phone numbers for check updated spamscore . 
///
///  @returns NSString*
///
-(NSURLSessionTask*) incomingphoneGetdidscoreWithPhonenumber: (NSString*) phonenumber
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'phonenumber' is set
    if (phonenumber == nil) {
        NSParameterAssert(phonenumber);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"phonenumber"] };
            NSError* error = [NSError errorWithDomain:kSWGPhoneNumberApiErrorDomain code:kSWGPhoneNumberApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/incomingphone/getdidscore.json"];

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
    if (phonenumber) {
        formParams[@"Phonenumber"] = phonenumber;
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
/// List Numbers
/// Retrieve a list of purchased phones numbers associated with your Ytel account.
///  @param page Which page of the overall response will be returned. Page indexing starts at 1. (optional, default to 1)
///
///  @param pageSize The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 10)
///
///  @param numberType The capability supported by the number.Number type either SMS,Voice or all (optional)
///
///  @param friendlyName A human-readable label added to the number object. (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) incomingphoneListnumberWithPage: (NSNumber*) page
    pageSize: (NSNumber*) pageSize
    numberType: (NSString*) numberType
    friendlyName: (NSString*) friendlyName
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/incomingphone/listnumber.json"];

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
    if (numberType) {
        formParams[@"NumberType"] = numberType;
    }
    if (friendlyName) {
        formParams[@"FriendlyName"] = friendlyName;
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
/// Bulk Release
/// Remove a purchased Ytel number from your account.
///  @param phoneNumber A valid Ytel comma separated numbers (E.164 format). 
///
///  @returns NSString*
///
-(NSURLSessionTask*) incomingphoneMassreleasenumberWithPhoneNumber: (NSString*) phoneNumber
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'phoneNumber' is set
    if (phoneNumber == nil) {
        NSParameterAssert(phoneNumber);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"phoneNumber"] };
            NSError* error = [NSError errorWithDomain:kSWGPhoneNumberApiErrorDomain code:kSWGPhoneNumberApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/incomingphone/massreleasenumber.json"];

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
    if (phoneNumber) {
        formParams[@"PhoneNumber"] = phoneNumber;
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
/// Bulk Update Numbers
/// Update properties for a Ytel numbers that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.
///  @param phoneNumber A valid comma(,) separated Ytel numbers. (E.164 format). 
///
///  @param voiceUrl The URL returning InboundXML incoming calls should execute when connected. 
///
///  @param friendlyName A human-readable value for labeling the number. (optional)
///
///  @param voiceMethod Specifies the HTTP method used to request the VoiceUrl once incoming call connects. (optional)
///
///  @param voiceFallbackUrl URL used if any errors occur during execution of InboundXML on a call or at initial request of the voice url (optional)
///
///  @param voiceFallbackMethod Specifies the HTTP method used to request the VoiceFallbackUrl once incoming call connects. (optional)
///
///  @param hangupCallback URL that can be requested to receive notification when and how incoming call has ended. (optional)
///
///  @param hangupCallbackMethod The HTTP method Ytel will use when requesting the HangupCallback URL. (optional)
///
///  @param heartbeatUrl URL that can be used to monitor the phone number. (optional)
///
///  @param heartbeatMethod The HTTP method Ytel will use when requesting the HeartbeatUrl. (optional)
///
///  @param smsUrl URL requested when an SMS is received. (optional)
///
///  @param smsMethod The HTTP method Ytel will use when requesting the SmsUrl. (optional)
///
///  @param smsFallbackUrl URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl. (optional)
///
///  @param smsFallbackMethod The HTTP method Ytel will use when URL requested if the SmsUrl is not available. (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) incomingphoneMassupdatenumberWithPhoneNumber: (NSString*) phoneNumber
    voiceUrl: (NSString*) voiceUrl
    friendlyName: (NSString*) friendlyName
    voiceMethod: (NSString*) voiceMethod
    voiceFallbackUrl: (NSString*) voiceFallbackUrl
    voiceFallbackMethod: (NSString*) voiceFallbackMethod
    hangupCallback: (NSString*) hangupCallback
    hangupCallbackMethod: (NSString*) hangupCallbackMethod
    heartbeatUrl: (NSString*) heartbeatUrl
    heartbeatMethod: (NSString*) heartbeatMethod
    smsUrl: (NSString*) smsUrl
    smsMethod: (NSString*) smsMethod
    smsFallbackUrl: (NSString*) smsFallbackUrl
    smsFallbackMethod: (NSString*) smsFallbackMethod
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'phoneNumber' is set
    if (phoneNumber == nil) {
        NSParameterAssert(phoneNumber);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"phoneNumber"] };
            NSError* error = [NSError errorWithDomain:kSWGPhoneNumberApiErrorDomain code:kSWGPhoneNumberApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'voiceUrl' is set
    if (voiceUrl == nil) {
        NSParameterAssert(voiceUrl);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"voiceUrl"] };
            NSError* error = [NSError errorWithDomain:kSWGPhoneNumberApiErrorDomain code:kSWGPhoneNumberApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/incomingphone/massupdatenumber.json"];

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
    if (phoneNumber) {
        formParams[@"PhoneNumber"] = phoneNumber;
    }
    if (voiceUrl) {
        formParams[@"VoiceUrl"] = voiceUrl;
    }
    if (friendlyName) {
        formParams[@"FriendlyName"] = friendlyName;
    }
    if (voiceMethod) {
        formParams[@"VoiceMethod"] = voiceMethod;
    }
    if (voiceFallbackUrl) {
        formParams[@"VoiceFallbackUrl"] = voiceFallbackUrl;
    }
    if (voiceFallbackMethod) {
        formParams[@"VoiceFallbackMethod"] = voiceFallbackMethod;
    }
    if (hangupCallback) {
        formParams[@"HangupCallback"] = hangupCallback;
    }
    if (hangupCallbackMethod) {
        formParams[@"HangupCallbackMethod"] = hangupCallbackMethod;
    }
    if (heartbeatUrl) {
        formParams[@"HeartbeatUrl"] = heartbeatUrl;
    }
    if (heartbeatMethod) {
        formParams[@"HeartbeatMethod"] = heartbeatMethod;
    }
    if (smsUrl) {
        formParams[@"SmsUrl"] = smsUrl;
    }
    if (smsMethod) {
        formParams[@"SmsMethod"] = smsMethod;
    }
    if (smsFallbackUrl) {
        formParams[@"SmsFallbackUrl"] = smsFallbackUrl;
    }
    if (smsFallbackMethod) {
        formParams[@"SmsFallbackMethod"] = smsFallbackMethod;
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
/// Release Number
/// Remove a purchased Ytel number from your account.
///  @param phoneNumber A valid 10-digit Ytel number (E.164 format). 
///
///  @returns NSString*
///
-(NSURLSessionTask*) incomingphoneReleasenumberByResponseTypePostWithPhoneNumber: (NSString*) phoneNumber
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'phoneNumber' is set
    if (phoneNumber == nil) {
        NSParameterAssert(phoneNumber);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"phoneNumber"] };
            NSError* error = [NSError errorWithDomain:kSWGPhoneNumberApiErrorDomain code:kSWGPhoneNumberApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/incomingphone/releasenumber.json"];

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
    if (phoneNumber) {
        formParams[@"PhoneNumber"] = phoneNumber;
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
/// Move Number
/// Transfer phone number that has been purchased for from one account to another account.
///  @param phonenumber A valid 10-digit Ytel number (E.164 format). 
///
///  @param fromaccountsid A specific Accountsid from where Number is getting transfer. 
///
///  @param toaccountsid A specific Accountsid to which Number is getting transfer. 
///
///  @returns NSString*
///
-(NSURLSessionTask*) incomingphoneTransferphonenumbersWithPhonenumber: (NSString*) phonenumber
    fromaccountsid: (NSString*) fromaccountsid
    toaccountsid: (NSString*) toaccountsid
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'phonenumber' is set
    if (phonenumber == nil) {
        NSParameterAssert(phonenumber);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"phonenumber"] };
            NSError* error = [NSError errorWithDomain:kSWGPhoneNumberApiErrorDomain code:kSWGPhoneNumberApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'fromaccountsid' is set
    if (fromaccountsid == nil) {
        NSParameterAssert(fromaccountsid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"fromaccountsid"] };
            NSError* error = [NSError errorWithDomain:kSWGPhoneNumberApiErrorDomain code:kSWGPhoneNumberApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'toaccountsid' is set
    if (toaccountsid == nil) {
        NSParameterAssert(toaccountsid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"toaccountsid"] };
            NSError* error = [NSError errorWithDomain:kSWGPhoneNumberApiErrorDomain code:kSWGPhoneNumberApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/incomingphone/transferphonenumbers.json"];

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
    if (phonenumber) {
        formParams[@"phonenumber"] = phonenumber;
    }
    if (fromaccountsid) {
        formParams[@"fromaccountsid"] = fromaccountsid;
    }
    if (toaccountsid) {
        formParams[@"toaccountsid"] = toaccountsid;
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
/// Update Number
/// Update properties for a Ytel number that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.
///  @param phoneNumber A valid Ytel number (E.164 format). 
///
///  @param voiceUrl URL requested once the call connects 
///
///  @param friendlyName Phone number friendly name description (optional)
///
///  @param voiceMethod Post or Get (optional)
///
///  @param voiceFallbackUrl URL requested if the voice URL is not available (optional)
///
///  @param voiceFallbackMethod Post or Get (optional)
///
///  @param hangupCallback callback url after a hangup occurs (optional)
///
///  @param hangupCallbackMethod Post or Get (optional)
///
///  @param heartbeatUrl URL requested once the call connects (optional)
///
///  @param heartbeatMethod URL that can be requested every 60 seconds during the call to notify of elapsed time (optional)
///
///  @param smsUrl URL requested when an SMS is received (optional)
///
///  @param smsMethod Post or Get (optional)
///
///  @param smsFallbackUrl URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl. (optional)
///
///  @param smsFallbackMethod The HTTP method Ytel will use when URL requested if the SmsUrl is not available. (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) incomingphoneUpdatenumberWithPhoneNumber: (NSString*) phoneNumber
    voiceUrl: (NSString*) voiceUrl
    friendlyName: (NSString*) friendlyName
    voiceMethod: (NSString*) voiceMethod
    voiceFallbackUrl: (NSString*) voiceFallbackUrl
    voiceFallbackMethod: (NSString*) voiceFallbackMethod
    hangupCallback: (NSString*) hangupCallback
    hangupCallbackMethod: (NSString*) hangupCallbackMethod
    heartbeatUrl: (NSString*) heartbeatUrl
    heartbeatMethod: (NSString*) heartbeatMethod
    smsUrl: (NSString*) smsUrl
    smsMethod: (NSString*) smsMethod
    smsFallbackUrl: (NSString*) smsFallbackUrl
    smsFallbackMethod: (NSString*) smsFallbackMethod
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'phoneNumber' is set
    if (phoneNumber == nil) {
        NSParameterAssert(phoneNumber);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"phoneNumber"] };
            NSError* error = [NSError errorWithDomain:kSWGPhoneNumberApiErrorDomain code:kSWGPhoneNumberApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'voiceUrl' is set
    if (voiceUrl == nil) {
        NSParameterAssert(voiceUrl);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"voiceUrl"] };
            NSError* error = [NSError errorWithDomain:kSWGPhoneNumberApiErrorDomain code:kSWGPhoneNumberApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/incomingphone/updatenumber.json"];

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
    if (phoneNumber) {
        formParams[@"PhoneNumber"] = phoneNumber;
    }
    if (voiceUrl) {
        formParams[@"VoiceUrl"] = voiceUrl;
    }
    if (friendlyName) {
        formParams[@"FriendlyName"] = friendlyName;
    }
    if (voiceMethod) {
        formParams[@"VoiceMethod"] = voiceMethod;
    }
    if (voiceFallbackUrl) {
        formParams[@"VoiceFallbackUrl"] = voiceFallbackUrl;
    }
    if (voiceFallbackMethod) {
        formParams[@"VoiceFallbackMethod"] = voiceFallbackMethod;
    }
    if (hangupCallback) {
        formParams[@"HangupCallback"] = hangupCallback;
    }
    if (hangupCallbackMethod) {
        formParams[@"HangupCallbackMethod"] = hangupCallbackMethod;
    }
    if (heartbeatUrl) {
        formParams[@"HeartbeatUrl"] = heartbeatUrl;
    }
    if (heartbeatMethod) {
        formParams[@"HeartbeatMethod"] = heartbeatMethod;
    }
    if (smsUrl) {
        formParams[@"SmsUrl"] = smsUrl;
    }
    if (smsMethod) {
        formParams[@"SmsMethod"] = smsMethod;
    }
    if (smsFallbackUrl) {
        formParams[@"SmsFallbackUrl"] = smsFallbackUrl;
    }
    if (smsFallbackMethod) {
        formParams[@"SmsFallbackMethod"] = smsFallbackMethod;
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
/// View Details
/// Retrieve the details for a phone number by its number.
///  @param phoneNumber A valid Ytel 10-digit phone number (E.164 format). 
///
///  @returns NSString*
///
-(NSURLSessionTask*) incomingphoneViewnumberWithPhoneNumber: (NSString*) phoneNumber
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'phoneNumber' is set
    if (phoneNumber == nil) {
        NSParameterAssert(phoneNumber);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"phoneNumber"] };
            NSError* error = [NSError errorWithDomain:kSWGPhoneNumberApiErrorDomain code:kSWGPhoneNumberApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/incomingphone/viewnumber.json"];

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
    if (phoneNumber) {
        formParams[@"PhoneNumber"] = phoneNumber;
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
