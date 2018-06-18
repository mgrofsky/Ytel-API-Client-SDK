#import "SWGConferenceApi.h"
#import "SWGQueryParamCollection.h"
#import "SWGApiClient.h"


@interface SWGConferenceApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation SWGConferenceApi

NSString* kSWGConferenceApiErrorDomain = @"SWGConferenceApiErrorDomain";
NSInteger kSWGConferenceApiMissingParamErrorCode = 234513;

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
/// Add Participant
/// Add Participant in conference 
///  @param conferenceSid The unique identifier for a conference object. 
///
///  @param participantNumber The phone number of the participant to be added. 
///
///  @param muted Specifies if participant should be muted. (optional)
///
///  @param deaf Specifies if the participant should hear audio in the conference. (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) conferencesAddParticipantWithConferenceSid: (NSString*) conferenceSid
    participantNumber: (NSString*) participantNumber
    muted: (NSNumber*) muted
    deaf: (NSNumber*) deaf
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'conferenceSid' is set
    if (conferenceSid == nil) {
        NSParameterAssert(conferenceSid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"conferenceSid"] };
            NSError* error = [NSError errorWithDomain:kSWGConferenceApiErrorDomain code:kSWGConferenceApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'participantNumber' is set
    if (participantNumber == nil) {
        NSParameterAssert(participantNumber);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"participantNumber"] };
            NSError* error = [NSError errorWithDomain:kSWGConferenceApiErrorDomain code:kSWGConferenceApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/conferences/addParticipant.json"];

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
    if (conferenceSid) {
        formParams[@"ConferenceSid"] = conferenceSid;
    }
    if (participantNumber) {
        formParams[@"ParticipantNumber"] = participantNumber;
    }
    if (muted) {
        formParams[@"Muted"] = muted;
    }
    if (deaf) {
        formParams[@"Deaf"] = deaf;
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
/// Create Conference
/// Here you can experiment with initiating a conference call through Ytel and view the request response generated when doing so.
///  @param from A valid 10-digit number (E.164 format) that will be initiating the conference call. 
///
///  @param to A valid 10-digit number (E.164 format) that is to receive the conference call. 
///
///  @param url URL requested once the conference connects 
///
///  @param method Specifies the HTTP method used to request the required URL once call connects. (optional, default to POST)
///
///  @param statusCallBackUrl URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the conference is finished. (optional)
///
///  @param statusCallBackMethod Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. (optional)
///
///  @param fallbackUrl URL requested if the initial Url parameter fails or encounters an error (optional)
///
///  @param fallbackMethod Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional)
///
///  @param record Specifies if the conference should be recorded. (optional)
///
///  @param recordCallBackUrl Recording parameters will be sent here upon completion. (optional)
///
///  @param recordCallBackMethod Specifies the HTTP method used to request the required URL once conference connects. (optional)
///
///  @param scheduleTime Schedule conference in future. Schedule time must be greater than current time (optional)
///
///  @param timeout The number of seconds the call stays on the line while waiting for an answer. The max time limit is 999 and the default limit is 60 seconds but lower times can be set. (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) conferencesCreateConferenceWithFrom: (NSString*) from
    to: (NSString*) to
    url: (NSString*) url
    method: (NSString*) method
    statusCallBackUrl: (NSString*) statusCallBackUrl
    statusCallBackMethod: (NSString*) statusCallBackMethod
    fallbackUrl: (NSString*) fallbackUrl
    fallbackMethod: (NSString*) fallbackMethod
    record: (NSNumber*) record
    recordCallBackUrl: (NSString*) recordCallBackUrl
    recordCallBackMethod: (NSString*) recordCallBackMethod
    scheduleTime: (NSString*) scheduleTime
    timeout: (NSNumber*) timeout
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'from' is set
    if (from == nil) {
        NSParameterAssert(from);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"from"] };
            NSError* error = [NSError errorWithDomain:kSWGConferenceApiErrorDomain code:kSWGConferenceApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'to' is set
    if (to == nil) {
        NSParameterAssert(to);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"to"] };
            NSError* error = [NSError errorWithDomain:kSWGConferenceApiErrorDomain code:kSWGConferenceApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'url' is set
    if (url == nil) {
        NSParameterAssert(url);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"url"] };
            NSError* error = [NSError errorWithDomain:kSWGConferenceApiErrorDomain code:kSWGConferenceApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/conferences/createConference.json"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (url != nil) {
        queryParams[@"Url"] = url;
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
    if (from) {
        formParams[@"From"] = from;
    }
    if (to) {
        formParams[@"To"] = to;
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
    if (fallbackUrl) {
        formParams[@"FallbackUrl"] = fallbackUrl;
    }
    if (fallbackMethod) {
        formParams[@"FallbackMethod"] = fallbackMethod;
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
    if (scheduleTime) {
        formParams[@"ScheduleTime"] = scheduleTime;
    }
    if (timeout) {
        formParams[@"Timeout"] = timeout;
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
/// Silence Participant
/// Deaf Mute Participant
///  @param conferenceSid ID of the active conference 
///
///  @param participantSid ID of an active participant 
///
///  @param muted Mute a participant (optional)
///
///  @param deaf Make it so a participant cant hear (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) conferencesDeafMuteParticipantWithConferenceSid: (NSString*) conferenceSid
    participantSid: (NSString*) participantSid
    muted: (NSNumber*) muted
    deaf: (NSNumber*) deaf
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'conferenceSid' is set
    if (conferenceSid == nil) {
        NSParameterAssert(conferenceSid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"conferenceSid"] };
            NSError* error = [NSError errorWithDomain:kSWGConferenceApiErrorDomain code:kSWGConferenceApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'participantSid' is set
    if (participantSid == nil) {
        NSParameterAssert(participantSid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"participantSid"] };
            NSError* error = [NSError errorWithDomain:kSWGConferenceApiErrorDomain code:kSWGConferenceApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/conferences/deafMuteParticipant.json"];

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
    if (conferenceSid) {
        formParams[@"conferenceSid"] = conferenceSid;
    }
    if (participantSid) {
        formParams[@"ParticipantSid"] = participantSid;
    }
    if (muted) {
        formParams[@"Muted"] = muted;
    }
    if (deaf) {
        formParams[@"Deaf"] = deaf;
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
/// Hangup Participant
/// Remove a participant from a conference.
///  @param conferenceSid The unique identifier for a conference object. 
///
///  @param participantSid The unique identifier for a participant object. 
///
///  @returns NSString*
///
-(NSURLSessionTask*) conferencesHangupParticipantWithConferenceSid: (NSString*) conferenceSid
    participantSid: (NSString*) participantSid
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'conferenceSid' is set
    if (conferenceSid == nil) {
        NSParameterAssert(conferenceSid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"conferenceSid"] };
            NSError* error = [NSError errorWithDomain:kSWGConferenceApiErrorDomain code:kSWGConferenceApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'participantSid' is set
    if (participantSid == nil) {
        NSParameterAssert(participantSid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"participantSid"] };
            NSError* error = [NSError errorWithDomain:kSWGConferenceApiErrorDomain code:kSWGConferenceApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/conferences/hangupParticipant.json"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (participantSid != nil) {
        queryParams[@"ParticipantSid"] = participantSid;
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
    if (conferenceSid) {
        formParams[@"ConferenceSid"] = conferenceSid;
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
/// List Participants
/// Retrieve a list of participants for an in-progress conference.
///  @param conferenceSid The unique identifier for a conference. 
///
///  @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
///
///  @param pagesize The count of objects to return per page. (optional, default to 10)
///
///  @param muted Specifies if participant should be muted. (optional)
///
///  @param deaf Specifies if the participant should hear audio in the conference. (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) conferencesListParticipantWithConferenceSid: (NSString*) conferenceSid
    page: (NSNumber*) page
    pagesize: (NSNumber*) pagesize
    muted: (NSNumber*) muted
    deaf: (NSNumber*) deaf
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'conferenceSid' is set
    if (conferenceSid == nil) {
        NSParameterAssert(conferenceSid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"conferenceSid"] };
            NSError* error = [NSError errorWithDomain:kSWGConferenceApiErrorDomain code:kSWGConferenceApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/conferences/listParticipant.json"];

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
    if (conferenceSid) {
        formParams[@"ConferenceSid"] = conferenceSid;
    }
    if (page) {
        formParams[@"Page"] = page;
    }
    if (pagesize) {
        formParams[@"Pagesize"] = pagesize;
    }
    if (muted) {
        formParams[@"Muted"] = muted;
    }
    if (deaf) {
        formParams[@"Deaf"] = deaf;
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
/// List Conferences
/// Retrieve a list of conference objects.
///  @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
///
///  @param pagesize Number of individual resources listed in the response per page (optional, default to 10)
///
///  @param friendlyName Only return conferences with the specified FriendlyName (optional)
///
///  @param dateCreated Conference created date (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) conferencesListconferenceWithPage: (NSNumber*) page
    pagesize: (NSNumber*) pagesize
    friendlyName: (NSString*) friendlyName
    dateCreated: (NSString*) dateCreated
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/conferences/listconference.json"];

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
    if (friendlyName) {
        formParams[@"FriendlyName"] = friendlyName;
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
/// Play Audio
/// Play an audio file during a conference.
///  @param conferenceSid The unique identifier for a conference object. 
///
///  @param participantSid The unique identifier for a participant object. 
///
///  @param audioUrl The URL for the audio file that is to be played during the conference. Multiple audio files can be chained by using a semicolon. 
///
///  @returns NSString*
///
-(NSURLSessionTask*) conferencesPlayAudioWithConferenceSid: (NSString*) conferenceSid
    participantSid: (NSString*) participantSid
    audioUrl: (NSString*) audioUrl
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'conferenceSid' is set
    if (conferenceSid == nil) {
        NSParameterAssert(conferenceSid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"conferenceSid"] };
            NSError* error = [NSError errorWithDomain:kSWGConferenceApiErrorDomain code:kSWGConferenceApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'participantSid' is set
    if (participantSid == nil) {
        NSParameterAssert(participantSid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"participantSid"] };
            NSError* error = [NSError errorWithDomain:kSWGConferenceApiErrorDomain code:kSWGConferenceApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'audioUrl' is set
    if (audioUrl == nil) {
        NSParameterAssert(audioUrl);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"audioUrl"] };
            NSError* error = [NSError errorWithDomain:kSWGConferenceApiErrorDomain code:kSWGConferenceApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/conferences/playAudio.json"];

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
    if (conferenceSid) {
        formParams[@"ConferenceSid"] = conferenceSid;
    }
    if (participantSid) {
        formParams[@"ParticipantSid"] = participantSid;
    }
    if (audioUrl) {
        formParams[@"AudioUrl"] = audioUrl;
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
/// View Participant
/// Retrieve information about a participant by its ParticipantSid.
///  @param conferenceSid The unique identifier for a conference object. 
///
///  @param participantSid The unique identifier for a participant object. 
///
///  @returns NSString*
///
-(NSURLSessionTask*) conferencesViewParticipantWithConferenceSid: (NSString*) conferenceSid
    participantSid: (NSString*) participantSid
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'conferenceSid' is set
    if (conferenceSid == nil) {
        NSParameterAssert(conferenceSid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"conferenceSid"] };
            NSError* error = [NSError errorWithDomain:kSWGConferenceApiErrorDomain code:kSWGConferenceApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'participantSid' is set
    if (participantSid == nil) {
        NSParameterAssert(participantSid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"participantSid"] };
            NSError* error = [NSError errorWithDomain:kSWGConferenceApiErrorDomain code:kSWGConferenceApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/conferences/viewParticipant.json"];

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
    if (conferenceSid) {
        formParams[@"ConferenceSid"] = conferenceSid;
    }
    if (participantSid) {
        formParams[@"ParticipantSid"] = participantSid;
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
/// View Conference
/// Retrieve information about a conference by its ConferenceSid.
///  @param conferenceSid The unique identifier of each conference resource 
///
///  @returns NSString*
///
-(NSURLSessionTask*) conferencesViewconferenceWithConferenceSid: (NSString*) conferenceSid
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'conferenceSid' is set
    if (conferenceSid == nil) {
        NSParameterAssert(conferenceSid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"conferenceSid"] };
            NSError* error = [NSError errorWithDomain:kSWGConferenceApiErrorDomain code:kSWGConferenceApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/conferences/viewconference.json"];

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
    if (conferenceSid) {
        formParams[@"ConferenceSid"] = conferenceSid;
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
