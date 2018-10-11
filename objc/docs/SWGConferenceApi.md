# SWGConferenceApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conferencesAddParticipant**](SWGConferenceApi.md#conferencesaddparticipant) | **POST** /conferences/addParticipant.json | Add Participant
[**conferencesCreateConference**](SWGConferenceApi.md#conferencescreateconference) | **POST** /conferences/createConference.json | Create Conference
[**conferencesDeafMuteParticipant**](SWGConferenceApi.md#conferencesdeafmuteparticipant) | **POST** /conferences/deafMuteParticipant.json | Silence Participant
[**conferencesHangupParticipant**](SWGConferenceApi.md#conferenceshangupparticipant) | **POST** /conferences/hangupParticipant.json | Hangup Participant
[**conferencesListParticipant**](SWGConferenceApi.md#conferenceslistparticipant) | **POST** /conferences/listParticipant.json | List Participants
[**conferencesListconference**](SWGConferenceApi.md#conferenceslistconference) | **POST** /conferences/listconference.json | List Conferences
[**conferencesPlayAudio**](SWGConferenceApi.md#conferencesplayaudio) | **POST** /conferences/playAudio.json | Play Audio
[**conferencesViewParticipant**](SWGConferenceApi.md#conferencesviewparticipant) | **POST** /conferences/viewParticipant.json | View Participant
[**conferencesViewconference**](SWGConferenceApi.md#conferencesviewconference) | **POST** /conferences/viewconference.json | View Conference


# **conferencesAddParticipant**
```objc
-(NSURLSessionTask*) conferencesAddParticipantWithConferenceSid: (NSString*) conferenceSid
    participantNumber: (NSString*) participantNumber
    muted: (NSNumber*) muted
    deaf: (NSNumber*) deaf
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Add Participant

Add Participant in conference 

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* conferenceSid = @"conferenceSid_example"; // The unique identifier for a conference object.
NSString* participantNumber = @"participantNumber_example"; // The phone number of the participant to be added.
NSNumber* muted = @true; // Specifies if participant should be muted. (optional)
NSNumber* deaf = @true; // Specifies if the participant should hear audio in the conference. (optional)

SWGConferenceApi*apiInstance = [[SWGConferenceApi alloc] init];

// Add Participant
[apiInstance conferencesAddParticipantWithConferenceSid:conferenceSid
              participantNumber:participantNumber
              muted:muted
              deaf:deaf
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGConferenceApi->conferencesAddParticipant: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conferenceSid** | **NSString***| The unique identifier for a conference object. | 
 **participantNumber** | **NSString***| The phone number of the participant to be added. | 
 **muted** | **NSNumber***| Specifies if participant should be muted. | [optional] 
 **deaf** | **NSNumber***| Specifies if the participant should hear audio in the conference. | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **conferencesCreateConference**
```objc
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
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Create Conference

Here you can experiment with initiating a conference call through Ytel and view the request response generated when doing so.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* from = @"from_example"; // A valid 10-digit number (E.164 format) that will be initiating the conference call.
NSString* to = @"to_example"; // A valid 10-digit number (E.164 format) that is to receive the conference call.
NSString* url = @"url_example"; // URL requested once the conference connects
NSString* method = @"POST"; // Specifies the HTTP method used to request the required URL once call connects. (optional) (default to POST)
NSString* statusCallBackUrl = @"statusCallBackUrl_example"; // URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the conference is finished. (optional)
NSString* statusCallBackMethod = @"statusCallBackMethod_example"; // Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. (optional)
NSString* fallbackUrl = @"fallbackUrl_example"; // URL requested if the initial Url parameter fails or encounters an error (optional)
NSString* fallbackMethod = @"fallbackMethod_example"; // Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional)
NSNumber* record = @true; // Specifies if the conference should be recorded. (optional)
NSString* recordCallBackUrl = @"recordCallBackUrl_example"; // Recording parameters will be sent here upon completion. (optional)
NSString* recordCallBackMethod = @"recordCallBackMethod_example"; // Specifies the HTTP method used to request the required URL once conference connects. (optional)
NSString* scheduleTime = @"scheduleTime_example"; // Schedule conference in future. Schedule time must be greater than current time (optional)
NSNumber* timeout = @56; // The number of seconds the call stays on the line while waiting for an answer. The max time limit is 999 and the default limit is 60 seconds but lower times can be set. (optional)

SWGConferenceApi*apiInstance = [[SWGConferenceApi alloc] init];

// Create Conference
[apiInstance conferencesCreateConferenceWithFrom:from
              to:to
              url:url
              method:method
              statusCallBackUrl:statusCallBackUrl
              statusCallBackMethod:statusCallBackMethod
              fallbackUrl:fallbackUrl
              fallbackMethod:fallbackMethod
              record:record
              recordCallBackUrl:recordCallBackUrl
              recordCallBackMethod:recordCallBackMethod
              scheduleTime:scheduleTime
              timeout:timeout
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGConferenceApi->conferencesCreateConference: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **NSString***| A valid 10-digit number (E.164 format) that will be initiating the conference call. | 
 **to** | **NSString***| A valid 10-digit number (E.164 format) that is to receive the conference call. | 
 **url** | **NSString***| URL requested once the conference connects | 
 **method** | **NSString***| Specifies the HTTP method used to request the required URL once call connects. | [optional] [default to POST]
 **statusCallBackUrl** | **NSString***| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the conference is finished. | [optional] 
 **statusCallBackMethod** | **NSString***| Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. | [optional] 
 **fallbackUrl** | **NSString***| URL requested if the initial Url parameter fails or encounters an error | [optional] 
 **fallbackMethod** | **NSString***| Specifies the HTTP method used to request the required FallbackUrl once call connects. | [optional] 
 **record** | **NSNumber***| Specifies if the conference should be recorded. | [optional] 
 **recordCallBackUrl** | **NSString***| Recording parameters will be sent here upon completion. | [optional] 
 **recordCallBackMethod** | **NSString***| Specifies the HTTP method used to request the required URL once conference connects. | [optional] 
 **scheduleTime** | **NSString***| Schedule conference in future. Schedule time must be greater than current time | [optional] 
 **timeout** | **NSNumber***| The number of seconds the call stays on the line while waiting for an answer. The max time limit is 999 and the default limit is 60 seconds but lower times can be set. | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **conferencesDeafMuteParticipant**
```objc
-(NSURLSessionTask*) conferencesDeafMuteParticipantWithConferenceSid: (NSString*) conferenceSid
    participantSid: (NSString*) participantSid
    muted: (NSNumber*) muted
    deaf: (NSNumber*) deaf
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Silence Participant

Deaf Mute Participant

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* conferenceSid = @"conferenceSid_example"; // ID of the active conference
NSString* participantSid = @"participantSid_example"; // ID of an active participant
NSNumber* muted = @true; // Mute a participant (optional)
NSNumber* deaf = @true; // Make it so a participant cant hear (optional)

SWGConferenceApi*apiInstance = [[SWGConferenceApi alloc] init];

// Silence Participant
[apiInstance conferencesDeafMuteParticipantWithConferenceSid:conferenceSid
              participantSid:participantSid
              muted:muted
              deaf:deaf
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGConferenceApi->conferencesDeafMuteParticipant: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conferenceSid** | **NSString***| ID of the active conference | 
 **participantSid** | **NSString***| ID of an active participant | 
 **muted** | **NSNumber***| Mute a participant | [optional] 
 **deaf** | **NSNumber***| Make it so a participant cant hear | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **conferencesHangupParticipant**
```objc
-(NSURLSessionTask*) conferencesHangupParticipantWithConferenceSid: (NSString*) conferenceSid
    participantSid: (NSString*) participantSid
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Hangup Participant

Remove a participant from a conference.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* conferenceSid = @"conferenceSid_example"; // The unique identifier for a conference object.
NSString* participantSid = @"participantSid_example"; // The unique identifier for a participant object.

SWGConferenceApi*apiInstance = [[SWGConferenceApi alloc] init];

// Hangup Participant
[apiInstance conferencesHangupParticipantWithConferenceSid:conferenceSid
              participantSid:participantSid
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGConferenceApi->conferencesHangupParticipant: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conferenceSid** | **NSString***| The unique identifier for a conference object. | 
 **participantSid** | **NSString***| The unique identifier for a participant object. | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **conferencesListParticipant**
```objc
-(NSURLSessionTask*) conferencesListParticipantWithConferenceSid: (NSString*) conferenceSid
    page: (NSNumber*) page
    pagesize: (NSNumber*) pagesize
    muted: (NSNumber*) muted
    deaf: (NSNumber*) deaf
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

List Participants

Retrieve a list of participants for an in-progress conference.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* conferenceSid = @"conferenceSid_example"; // The unique identifier for a conference.
NSNumber* page = @1; // The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) (default to 1)
NSNumber* pagesize = @10; // The count of objects to return per page. (optional) (default to 10)
NSNumber* muted = @true; // Specifies if participant should be muted. (optional)
NSNumber* deaf = @true; // Specifies if the participant should hear audio in the conference. (optional)

SWGConferenceApi*apiInstance = [[SWGConferenceApi alloc] init];

// List Participants
[apiInstance conferencesListParticipantWithConferenceSid:conferenceSid
              page:page
              pagesize:pagesize
              muted:muted
              deaf:deaf
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGConferenceApi->conferencesListParticipant: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conferenceSid** | **NSString***| The unique identifier for a conference. | 
 **page** | **NSNumber***| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **NSNumber***| The count of objects to return per page. | [optional] [default to 10]
 **muted** | **NSNumber***| Specifies if participant should be muted. | [optional] 
 **deaf** | **NSNumber***| Specifies if the participant should hear audio in the conference. | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **conferencesListconference**
```objc
-(NSURLSessionTask*) conferencesListconferenceWithPage: (NSNumber*) page
    pagesize: (NSNumber*) pagesize
    friendlyName: (NSString*) friendlyName
    dateCreated: (NSString*) dateCreated
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

List Conferences

Retrieve a list of conference objects.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSNumber* page = @1; // The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) (default to 1)
NSNumber* pagesize = @10; // Number of individual resources listed in the response per page (optional) (default to 10)
NSString* friendlyName = @"friendlyName_example"; // Only return conferences with the specified FriendlyName (optional)
NSString* dateCreated = @"dateCreated_example"; // Conference created date (optional)

SWGConferenceApi*apiInstance = [[SWGConferenceApi alloc] init];

// List Conferences
[apiInstance conferencesListconferenceWithPage:page
              pagesize:pagesize
              friendlyName:friendlyName
              dateCreated:dateCreated
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGConferenceApi->conferencesListconference: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **NSNumber***| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **NSNumber***| Number of individual resources listed in the response per page | [optional] [default to 10]
 **friendlyName** | **NSString***| Only return conferences with the specified FriendlyName | [optional] 
 **dateCreated** | **NSString***| Conference created date | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **conferencesPlayAudio**
```objc
-(NSURLSessionTask*) conferencesPlayAudioWithConferenceSid: (NSString*) conferenceSid
    participantSid: (NSString*) participantSid
    audioUrl: (NSString*) audioUrl
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Play Audio

Play an audio file during a conference.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* conferenceSid = @"conferenceSid_example"; // The unique identifier for a conference object.
NSString* participantSid = @"participantSid_example"; // The unique identifier for a participant object.
NSString* audioUrl = @"audioUrl_example"; // The URL for the audio file that is to be played during the conference. Multiple audio files can be chained by using a semicolon.

SWGConferenceApi*apiInstance = [[SWGConferenceApi alloc] init];

// Play Audio
[apiInstance conferencesPlayAudioWithConferenceSid:conferenceSid
              participantSid:participantSid
              audioUrl:audioUrl
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGConferenceApi->conferencesPlayAudio: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conferenceSid** | **NSString***| The unique identifier for a conference object. | 
 **participantSid** | **NSString***| The unique identifier for a participant object. | 
 **audioUrl** | **NSString***| The URL for the audio file that is to be played during the conference. Multiple audio files can be chained by using a semicolon. | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **conferencesViewParticipant**
```objc
-(NSURLSessionTask*) conferencesViewParticipantWithConferenceSid: (NSString*) conferenceSid
    participantSid: (NSString*) participantSid
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

View Participant

Retrieve information about a participant by its ParticipantSid.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* conferenceSid = @"conferenceSid_example"; // The unique identifier for a conference object.
NSString* participantSid = @"participantSid_example"; // The unique identifier for a participant object.

SWGConferenceApi*apiInstance = [[SWGConferenceApi alloc] init];

// View Participant
[apiInstance conferencesViewParticipantWithConferenceSid:conferenceSid
              participantSid:participantSid
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGConferenceApi->conferencesViewParticipant: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conferenceSid** | **NSString***| The unique identifier for a conference object. | 
 **participantSid** | **NSString***| The unique identifier for a participant object. | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **conferencesViewconference**
```objc
-(NSURLSessionTask*) conferencesViewconferenceWithConferenceSid: (NSString*) conferenceSid
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

View Conference

Retrieve information about a conference by its ConferenceSid.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* conferenceSid = @"conferenceSid_example"; // The unique identifier of each conference resource

SWGConferenceApi*apiInstance = [[SWGConferenceApi alloc] init];

// View Conference
[apiInstance conferencesViewconferenceWithConferenceSid:conferenceSid
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGConferenceApi->conferencesViewconference: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conferenceSid** | **NSString***| The unique identifier of each conference resource | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

