#import "SWGCallApi.h"
#import "SWGQueryParamCollection.h"
#import "SWGApiClient.h"


@interface SWGCallApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation SWGCallApi

NSString* kSWGCallApiErrorDomain = @"SWGCallApiErrorDomain";
NSInteger kSWGCallApiMissingParamErrorCode = 234513;

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
/// Group Call
/// Group Call
///  @param from This number to display on Caller ID as calling 
///
///  @param to Please enter multiple E164 number. You can add max 10 numbers. Add numbers separated with comma. e.g : 1111111111,2222222222 
///
///  @param url URL requested once the call connects 
///
///  @param groupConfirmKey Define the DTMF that the called party should send to bridge the call. Allowed Values : 0-9, #, * 
///
///  @param groupConfirmFile Specify the audio file you want to play when the called party picks up the call 
///
///  @param method Specifies the HTTP method used to request the required URL once call connects. (optional)
///
///  @param statusCallBackUrl URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. (optional)
///
///  @param statusCallBackMethod Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. (optional)
///
///  @param fallBackUrl URL requested if the initial Url parameter fails or encounters an error (optional)
///
///  @param fallBackMethod Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional)
///
///  @param heartBeatUrl URL that can be requested every 60 seconds during the call to notify of elapsed time and pass other general information. (optional)
///
///  @param heartBeatMethod Specifies the HTTP method used to request HeartbeatUrl. (optional)
///
///  @param timeout Time (in seconds) we should wait while the call is ringing before canceling the call (optional)
///
///  @param playDtmf DTMF Digits to play to the call once it connects. 0-9, #, or * (optional)
///
///  @param hideCallerId Specifies if the caller id will be hidden (optional)
///
///  @param record Specifies if the call should be recorded (optional)
///
///  @param recordCallBackUrl Recording parameters will be sent here upon completion (optional)
///
///  @param recordCallBackMethod Method used to request the RecordCallback URL. (optional)
///
///  @param transcribe Specifies if the call recording should be transcribed (optional)
///
///  @param transcribeCallBackUrl Transcription parameters will be sent here upon completion (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) callsGroupcallWithFrom: (NSString*) from
    to: (NSString*) to
    url: (NSString*) url
    groupConfirmKey: (NSString*) groupConfirmKey
    groupConfirmFile: (NSString*) groupConfirmFile
    method: (NSString*) method
    statusCallBackUrl: (NSString*) statusCallBackUrl
    statusCallBackMethod: (NSString*) statusCallBackMethod
    fallBackUrl: (NSString*) fallBackUrl
    fallBackMethod: (NSString*) fallBackMethod
    heartBeatUrl: (NSString*) heartBeatUrl
    heartBeatMethod: (NSString*) heartBeatMethod
    timeout: (NSNumber*) timeout
    playDtmf: (NSString*) playDtmf
    hideCallerId: (NSString*) hideCallerId
    record: (NSNumber*) record
    recordCallBackUrl: (NSString*) recordCallBackUrl
    recordCallBackMethod: (NSString*) recordCallBackMethod
    transcribe: (NSNumber*) transcribe
    transcribeCallBackUrl: (NSString*) transcribeCallBackUrl
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'from' is set
    if (from == nil) {
        NSParameterAssert(from);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"from"] };
            NSError* error = [NSError errorWithDomain:kSWGCallApiErrorDomain code:kSWGCallApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'to' is set
    if (to == nil) {
        NSParameterAssert(to);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"to"] };
            NSError* error = [NSError errorWithDomain:kSWGCallApiErrorDomain code:kSWGCallApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'url' is set
    if (url == nil) {
        NSParameterAssert(url);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"url"] };
            NSError* error = [NSError errorWithDomain:kSWGCallApiErrorDomain code:kSWGCallApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'groupConfirmKey' is set
    if (groupConfirmKey == nil) {
        NSParameterAssert(groupConfirmKey);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"groupConfirmKey"] };
            NSError* error = [NSError errorWithDomain:kSWGCallApiErrorDomain code:kSWGCallApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'groupConfirmFile' is set
    if (groupConfirmFile == nil) {
        NSParameterAssert(groupConfirmFile);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"groupConfirmFile"] };
            NSError* error = [NSError errorWithDomain:kSWGCallApiErrorDomain code:kSWGCallApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/calls/groupcall.json"];

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
    if (url) {
        formParams[@"Url"] = url;
    }
    if (groupConfirmKey) {
        formParams[@"GroupConfirmKey"] = groupConfirmKey;
    }
    if (groupConfirmFile) {
        formParams[@"GroupConfirmFile"] = groupConfirmFile;
    }
    if (method) {
        formParams[@"Method"] = method;
    }
    if (statusCallBackUrl) {
        formParams[@"StatusCallBackUrl"] = statusCallBackUrl;
    }
    if (statusCallBackMethod) {
        formParams[@"StatusCallBackMethod"] = statusCallBackMethod;
    }
    if (fallBackUrl) {
        formParams[@"FallBackUrl"] = fallBackUrl;
    }
    if (fallBackMethod) {
        formParams[@"FallBackMethod"] = fallBackMethod;
    }
    if (heartBeatUrl) {
        formParams[@"HeartBeatUrl"] = heartBeatUrl;
    }
    if (heartBeatMethod) {
        formParams[@"HeartBeatMethod"] = heartBeatMethod;
    }
    if (timeout) {
        formParams[@"Timeout"] = timeout;
    }
    if (playDtmf) {
        formParams[@"PlayDtmf"] = playDtmf;
    }
    if (hideCallerId) {
        formParams[@"HideCallerId"] = hideCallerId;
    }
    if (record) {
        formParams[@"Record"] = record;
    }
    if (recordCallBackUrl) {
        formParams[@"RecordCallBackUrl"] = recordCallBackUrl;
    }
    if (recordCallBackMethod) {
        formParams[@"RecordCallBackMethod"] = recordCallBackMethod;
    }
    if (transcribe) {
        formParams[@"Transcribe"] = transcribe;
    }
    if (transcribeCallBackUrl) {
        formParams[@"TranscribeCallBackUrl"] = transcribeCallBackUrl;
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
/// Interrupt Call
/// Interrupt the Call by Call Sid
///  @param callSid The unique identifier for voice call that is in progress. 
///
///  @param url URL the in-progress call will be redirected to (optional)
///
///  @param method The method used to request the above Url parameter (optional)
///
///  @param status Status to set the in-progress call to (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) callsInterruptcallsWithCallSid: (NSString*) callSid
    url: (NSString*) url
    method: (NSString*) method
    status: (NSString*) status
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'callSid' is set
    if (callSid == nil) {
        NSParameterAssert(callSid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"callSid"] };
            NSError* error = [NSError errorWithDomain:kSWGCallApiErrorDomain code:kSWGCallApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/calls/interruptcalls.json"];

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
    if (callSid) {
        formParams[@"CallSid"] = callSid;
    }
    if (url) {
        formParams[@"Url"] = url;
    }
    if (method) {
        formParams[@"Method"] = method;
    }
    if (status) {
        formParams[@"Status"] = status;
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
/// List Calls
/// A list of calls associated with your Ytel account
///  @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
///
///  @param pageSize Number of individual resources listed in the response per page (optional, default to 10)
///
///  @param to Filter calls that were sent to this 10-digit number (E.164 format). (optional)
///
///  @param from Filter calls that were sent from this 10-digit number (E.164 format). (optional)
///
///  @param dateCreated Return calls that are from a specified date. (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) callsListcallsWithPage: (NSNumber*) page
    pageSize: (NSNumber*) pageSize
    to: (NSString*) to
    from: (NSString*) from
    dateCreated: (NSString*) dateCreated
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/calls/listcalls.json"];

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
    if (to) {
        formParams[@"To"] = to;
    }
    if (from) {
        formParams[@"From"] = from;
    }
    if (dateCreated) {
        formParams[@"DateCreated"] = dateCreated;
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
/// Make Call
/// You can experiment with initiating a call through Ytel and view the request response generated when doing so and get the response in json
///  @param from A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call. 
///
///  @param to To number 
///
///  @param url URL requested once the call connects 
///
///  @param method Specifies the HTTP method used to request the required URL once call connects. (optional)
///
///  @param statusCallBackUrl URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. (optional)
///
///  @param statusCallBackMethod Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. (optional)
///
///  @param fallBackUrl URL requested if the initial Url parameter fails or encounters an error (optional)
///
///  @param fallBackMethod Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional)
///
///  @param heartBeatUrl URL that can be requested every 60 seconds during the call to notify of elapsed tim (optional)
///
///  @param heartBeatMethod Specifies the HTTP method used to request HeartbeatUrl. (optional)
///
///  @param timeout Time (in seconds) Ytel should wait while the call is ringing before canceling the call (optional)
///
///  @param playDtmf DTMF Digits to play to the call once it connects. 0-9, #, or * (optional)
///
///  @param hideCallerId Specifies if the caller id will be hidden (optional)
///
///  @param record Specifies if the call should be recorded (optional)
///
///  @param recordCallBackUrl Recording parameters will be sent here upon completion (optional)
///
///  @param recordCallBackMethod Method used to request the RecordCallback URL. (optional)
///
///  @param transcribe Specifies if the call recording should be transcribed (optional)
///
///  @param transcribeCallBackUrl Transcription parameters will be sent here upon completion (optional)
///
///  @param ifMachine How Ytel should handle the receiving numbers voicemail machine (optional)
///
///  @param ifMachineUrl URL requested when IfMachine=continue (optional)
///
///  @param ifMachineMethod Method used to request the IfMachineUrl. (optional)
///
///  @param feedback Specify if survey should be enable or not (optional)
///
///  @param surveyId The unique identifier for the survey. (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) callsMakecallWithFrom: (NSString*) from
    to: (NSString*) to
    url: (NSString*) url
    method: (NSString*) method
    statusCallBackUrl: (NSString*) statusCallBackUrl
    statusCallBackMethod: (NSString*) statusCallBackMethod
    fallBackUrl: (NSString*) fallBackUrl
    fallBackMethod: (NSString*) fallBackMethod
    heartBeatUrl: (NSString*) heartBeatUrl
    heartBeatMethod: (NSString*) heartBeatMethod
    timeout: (NSNumber*) timeout
    playDtmf: (NSString*) playDtmf
    hideCallerId: (NSNumber*) hideCallerId
    record: (NSNumber*) record
    recordCallBackUrl: (NSString*) recordCallBackUrl
    recordCallBackMethod: (NSString*) recordCallBackMethod
    transcribe: (NSNumber*) transcribe
    transcribeCallBackUrl: (NSString*) transcribeCallBackUrl
    ifMachine: (NSString*) ifMachine
    ifMachineUrl: (NSString*) ifMachineUrl
    ifMachineMethod: (NSString*) ifMachineMethod
    feedback: (NSNumber*) feedback
    surveyId: (NSString*) surveyId
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'from' is set
    if (from == nil) {
        NSParameterAssert(from);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"from"] };
            NSError* error = [NSError errorWithDomain:kSWGCallApiErrorDomain code:kSWGCallApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'to' is set
    if (to == nil) {
        NSParameterAssert(to);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"to"] };
            NSError* error = [NSError errorWithDomain:kSWGCallApiErrorDomain code:kSWGCallApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'url' is set
    if (url == nil) {
        NSParameterAssert(url);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"url"] };
            NSError* error = [NSError errorWithDomain:kSWGCallApiErrorDomain code:kSWGCallApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/calls/makecall.json"];

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
    if (url) {
        formParams[@"Url"] = url;
    }
    if (method) {
        formParams[@"Method"] = method;
    }
    if (statusCallBackUrl) {
        formParams[@"StatusCallBackUrl"] = statusCallBackUrl;
    }
    if (statusCallBackMethod) {
        formParams[@"StatusCallBackMethod"] = statusCallBackMethod;
    }
    if (fallBackUrl) {
        formParams[@"FallBackUrl"] = fallBackUrl;
    }
    if (fallBackMethod) {
        formParams[@"FallBackMethod"] = fallBackMethod;
    }
    if (heartBeatUrl) {
        formParams[@"HeartBeatUrl"] = heartBeatUrl;
    }
    if (heartBeatMethod) {
        formParams[@"HeartBeatMethod"] = heartBeatMethod;
    }
    if (timeout) {
        formParams[@"Timeout"] = timeout;
    }
    if (playDtmf) {
        formParams[@"PlayDtmf"] = playDtmf;
    }
    if (hideCallerId) {
        formParams[@"HideCallerId"] = hideCallerId;
    }
    if (record) {
        formParams[@"Record"] = record;
    }
    if (recordCallBackUrl) {
        formParams[@"RecordCallBackUrl"] = recordCallBackUrl;
    }
    if (recordCallBackMethod) {
        formParams[@"RecordCallBackMethod"] = recordCallBackMethod;
    }
    if (transcribe) {
        formParams[@"Transcribe"] = transcribe;
    }
    if (transcribeCallBackUrl) {
        formParams[@"TranscribeCallBackUrl"] = transcribeCallBackUrl;
    }
    if (ifMachine) {
        formParams[@"IfMachine"] = ifMachine;
    }
    if (ifMachineUrl) {
        formParams[@"IfMachineUrl"] = ifMachineUrl;
    }
    if (ifMachineMethod) {
        formParams[@"IfMachineMethod"] = ifMachineMethod;
    }
    if (feedback) {
        formParams[@"Feedback"] = feedback;
    }
    if (surveyId) {
        formParams[@"SurveyId"] = surveyId;
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
/// Send RVM
/// Initiate an outbound Ringless Voicemail through Ytel.
///  @param from A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call. 
///
///  @param rVMCallerId A required secondary Caller ID for RVM to work. 
///
///  @param to A valid number (E.164 format) that will receive the phone call. 
///
///  @param voiceMailURL The URL requested once the RVM connects. A set of default parameters will be sent here. 
///
///  @param method Specifies the HTTP method used to request the required URL once call connects. (optional, default to GET)
///
///  @param statusCallBackUrl URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. (optional)
///
///  @param statsCallBackMethod Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) callsMakervmWithFrom: (NSString*) from
    rVMCallerId: (NSString*) rVMCallerId
    to: (NSString*) to
    voiceMailURL: (NSString*) voiceMailURL
    method: (NSString*) method
    statusCallBackUrl: (NSString*) statusCallBackUrl
    statsCallBackMethod: (NSString*) statsCallBackMethod
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'from' is set
    if (from == nil) {
        NSParameterAssert(from);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"from"] };
            NSError* error = [NSError errorWithDomain:kSWGCallApiErrorDomain code:kSWGCallApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'rVMCallerId' is set
    if (rVMCallerId == nil) {
        NSParameterAssert(rVMCallerId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"rVMCallerId"] };
            NSError* error = [NSError errorWithDomain:kSWGCallApiErrorDomain code:kSWGCallApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'to' is set
    if (to == nil) {
        NSParameterAssert(to);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"to"] };
            NSError* error = [NSError errorWithDomain:kSWGCallApiErrorDomain code:kSWGCallApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'voiceMailURL' is set
    if (voiceMailURL == nil) {
        NSParameterAssert(voiceMailURL);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"voiceMailURL"] };
            NSError* error = [NSError errorWithDomain:kSWGCallApiErrorDomain code:kSWGCallApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/calls/makervm.json"];

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
    if (rVMCallerId) {
        formParams[@"RVMCallerId"] = rVMCallerId;
    }
    if (to) {
        formParams[@"To"] = to;
    }
    if (voiceMailURL) {
        formParams[@"VoiceMailURL"] = voiceMailURL;
    }
    if (method) {
        formParams[@"Method"] = method;
    }
    if (statusCallBackUrl) {
        formParams[@"StatusCallBackUrl"] = statusCallBackUrl;
    }
    if (statsCallBackMethod) {
        formParams[@"StatsCallBackMethod"] = statsCallBackMethod;
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
/// Play Audio
/// Play Audio from a url
///  @param callSid The unique identifier of each call resource 
///
///  @param audioUrl URL to sound that should be played. You also can add more than one audio file using semicolons e.g. http://example.com/audio1.mp3;http://example.com/audio2.wav 
///
///  @param sayText Valid alphanumeric string that should be played to the In-progress call. 
///
///  @param length Time limit in seconds for audio play back (optional)
///
///  @param direction The leg of the call audio will be played to (optional)
///
///  @param mix If false, all other audio will be muted (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) callsPlayaudiosWithCallSid: (NSString*) callSid
    audioUrl: (NSString*) audioUrl
    sayText: (NSString*) sayText
    length: (NSNumber*) length
    direction: (NSString*) direction
    mix: (NSNumber*) mix
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'callSid' is set
    if (callSid == nil) {
        NSParameterAssert(callSid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"callSid"] };
            NSError* error = [NSError errorWithDomain:kSWGCallApiErrorDomain code:kSWGCallApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'audioUrl' is set
    if (audioUrl == nil) {
        NSParameterAssert(audioUrl);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"audioUrl"] };
            NSError* error = [NSError errorWithDomain:kSWGCallApiErrorDomain code:kSWGCallApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'sayText' is set
    if (sayText == nil) {
        NSParameterAssert(sayText);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"sayText"] };
            NSError* error = [NSError errorWithDomain:kSWGCallApiErrorDomain code:kSWGCallApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/calls/playaudios.json"];

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
    if (callSid) {
        formParams[@"CallSid"] = callSid;
    }
    if (audioUrl) {
        formParams[@"AudioUrl"] = audioUrl;
    }
    if (sayText) {
        formParams[@"SayText"] = sayText;
    }
    if (length) {
        formParams[@"Length"] = length;
    }
    if (direction) {
        formParams[@"Direction"] = direction;
    }
    if (mix) {
        formParams[@"Mix"] = mix;
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
/// Record Call
/// Start or stop recording of an in-progress voice call.
///  @param callSid The unique identifier of each call resource 
///
///  @param record Set true to initiate recording or false to terminate recording 
///
///  @param direction The leg of the call to record (optional)
///
///  @param timeLimit Time in seconds the recording duration should not exceed (optional)
///
///  @param callBackUrl URL consulted after the recording completes (optional)
///
///  @param fileformat Format of the recording file. Can be .mp3 or .wav (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) callsRecordcallsWithCallSid: (NSString*) callSid
    record: (NSNumber*) record
    direction: (NSString*) direction
    timeLimit: (NSNumber*) timeLimit
    callBackUrl: (NSString*) callBackUrl
    fileformat: (NSString*) fileformat
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'callSid' is set
    if (callSid == nil) {
        NSParameterAssert(callSid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"callSid"] };
            NSError* error = [NSError errorWithDomain:kSWGCallApiErrorDomain code:kSWGCallApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'record' is set
    if (record == nil) {
        NSParameterAssert(record);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"record"] };
            NSError* error = [NSError errorWithDomain:kSWGCallApiErrorDomain code:kSWGCallApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/calls/recordcalls.json"];

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
    if (callSid) {
        formParams[@"CallSid"] = callSid;
    }
    if (record) {
        formParams[@"Record"] = record;
    }
    if (direction) {
        formParams[@"Direction"] = direction;
    }
    if (timeLimit) {
        formParams[@"TimeLimit"] = timeLimit;
    }
    if (callBackUrl) {
        formParams[@"CallBackUrl"] = callBackUrl;
    }
    if (fileformat) {
        formParams[@"Fileformat"] = fileformat;
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
/// Play DTMF
/// Play Dtmf and send the Digit
///  @param callSid The unique identifier of each call resource 
///
///  @param playDtmf DTMF digits to play to the call. 0-9, #, *, W, or w 
///
///  @param playDtmfDirection The leg of the call DTMF digits should be sent to (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) callsSenddigitsWithCallSid: (NSString*) callSid
    playDtmf: (NSString*) playDtmf
    playDtmfDirection: (NSString*) playDtmfDirection
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'callSid' is set
    if (callSid == nil) {
        NSParameterAssert(callSid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"callSid"] };
            NSError* error = [NSError errorWithDomain:kSWGCallApiErrorDomain code:kSWGCallApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'playDtmf' is set
    if (playDtmf == nil) {
        NSParameterAssert(playDtmf);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"playDtmf"] };
            NSError* error = [NSError errorWithDomain:kSWGCallApiErrorDomain code:kSWGCallApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/calls/senddigits.json"];

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
    if (callSid) {
        formParams[@"CallSid"] = callSid;
    }
    if (playDtmf) {
        formParams[@"PlayDtmf"] = playDtmf;
    }
    if (playDtmfDirection) {
        formParams[@"PlayDtmfDirection"] = playDtmfDirection;
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
/// View Call
/// Retrieve a single voice call’s information by its CallSid.
///  @param callSid The unique identifier for the voice call. 
///
///  @returns NSString*
///
-(NSURLSessionTask*) callsViewcalldetailWithCallSid: (NSString*) callSid
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'callSid' is set
    if (callSid == nil) {
        NSParameterAssert(callSid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"callSid"] };
            NSError* error = [NSError errorWithDomain:kSWGCallApiErrorDomain code:kSWGCallApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/calls/viewcalldetail.json"];

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
    if (callSid) {
        formParams[@"callSid"] = callSid;
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
/// View Call
/// Retrieve a single voice call’s information by its CallSid.
///  @param callsid The unique identifier for the voice call. 
///
///  @returns NSString*
///
-(NSURLSessionTask*) callsViewcallsWithCallsid: (NSString*) callsid
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'callsid' is set
    if (callsid == nil) {
        NSParameterAssert(callsid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"callsid"] };
            NSError* error = [NSError errorWithDomain:kSWGCallApiErrorDomain code:kSWGCallApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/calls/viewcalls.json"];

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
    if (callsid) {
        formParams[@"callsid"] = callsid;
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
/// Voice Effect
/// Add audio voice effects to the an in-progress voice call.
///  @param callSid The unique identifier for the in-progress voice call. 
///
///  @param audioDirection The direction the audio effect should be placed on. If IN, the effects will occur on the incoming audio stream. If OUT, the effects will occur on the outgoing audio stream. (optional)
///
///  @param pitchSemiTones Set the pitch in semitone (half-step) intervals. Value between -14 and 14 (optional)
///
///  @param pitchOctaves Set the pitch in octave intervals.. Value between -1 and 1 (optional)
///
///  @param pitch Set the pitch (lowness/highness) of the audio. The higher the value, the higher the pitch. Value greater than 0 (optional)
///
///  @param rate Set the rate for audio. The lower the value, the lower the rate. value greater than 0 (optional)
///
///  @param tempo Set the tempo (speed) of the audio. A higher value denotes a faster tempo. Value greater than 0 (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) callsVoiceeffectWithCallSid: (NSString*) callSid
    audioDirection: (NSString*) audioDirection
    pitchSemiTones: (NSNumber*) pitchSemiTones
    pitchOctaves: (NSNumber*) pitchOctaves
    pitch: (NSNumber*) pitch
    rate: (NSNumber*) rate
    tempo: (NSNumber*) tempo
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'callSid' is set
    if (callSid == nil) {
        NSParameterAssert(callSid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"callSid"] };
            NSError* error = [NSError errorWithDomain:kSWGCallApiErrorDomain code:kSWGCallApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/calls/voiceeffect.json"];

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
    if (callSid) {
        formParams[@"CallSid"] = callSid;
    }
    if (audioDirection) {
        formParams[@"AudioDirection"] = audioDirection;
    }
    if (pitchSemiTones) {
        formParams[@"PitchSemiTones"] = pitchSemiTones;
    }
    if (pitchOctaves) {
        formParams[@"PitchOctaves"] = pitchOctaves;
    }
    if (pitch) {
        formParams[@"Pitch"] = pitch;
    }
    if (rate) {
        formParams[@"Rate"] = rate;
    }
    if (tempo) {
        formParams[@"Tempo"] = tempo;
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
