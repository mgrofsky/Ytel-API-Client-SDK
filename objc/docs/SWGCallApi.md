# SWGCallApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**callsGroupcall**](SWGCallApi.md#callsgroupcall) | **POST** /calls/groupcall.json | Group Call
[**callsInterruptcalls**](SWGCallApi.md#callsinterruptcalls) | **POST** /calls/interruptcalls.json | Interrupt Call
[**callsListcalls**](SWGCallApi.md#callslistcalls) | **POST** /calls/listcalls.json | List Calls
[**callsMakecall**](SWGCallApi.md#callsmakecall) | **POST** /calls/makecall.json | Make Call
[**callsMakervm**](SWGCallApi.md#callsmakervm) | **POST** /calls/makervm.json | Send RVM
[**callsPlayaudios**](SWGCallApi.md#callsplayaudios) | **POST** /calls/playaudios.json | Play Audio
[**callsRecordcalls**](SWGCallApi.md#callsrecordcalls) | **POST** /calls/recordcalls.json | Record Call
[**callsSenddigits**](SWGCallApi.md#callssenddigits) | **POST** /calls/senddigits.json | Play DTMF
[**callsViewcalldetail**](SWGCallApi.md#callsviewcalldetail) | **POST** /calls/viewcalldetail.json | View Call Details
[**callsViewcalls**](SWGCallApi.md#callsviewcalls) | **POST** /calls/viewcalls.json | View Call
[**callsVoiceeffect**](SWGCallApi.md#callsvoiceeffect) | **POST** /calls/voiceeffect.json | Voice Effect


# **callsGroupcall**
```objc
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
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Group Call

Group Call

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* from = @"from_example"; // This number to display on Caller ID as calling
NSString* to = @"to_example"; // Please enter multiple E164 number. You can add max 10 numbers. Add numbers separated with comma. e.g : 1111111111,2222222222
NSString* url = @"url_example"; // URL requested once the call connects
NSString* groupConfirmKey = @"groupConfirmKey_example"; // Define the DTMF that the called party should send to bridge the call. Allowed Values : 0-9, #, *
NSString* groupConfirmFile = @"groupConfirmFile_example"; // Specify the audio file you want to play when the called party picks up the call
NSString* method = @"method_example"; // Specifies the HTTP method used to request the required URL once call connects. (optional)
NSString* statusCallBackUrl = @"statusCallBackUrl_example"; // URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. (optional)
NSString* statusCallBackMethod = @"statusCallBackMethod_example"; // Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. (optional)
NSString* fallBackUrl = @"fallBackUrl_example"; // URL requested if the initial Url parameter fails or encounters an error (optional)
NSString* fallBackMethod = @"fallBackMethod_example"; // Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional)
NSString* heartBeatUrl = @"heartBeatUrl_example"; // URL that can be requested every 60 seconds during the call to notify of elapsed time and pass other general information. (optional)
NSString* heartBeatMethod = @"heartBeatMethod_example"; // Specifies the HTTP method used to request HeartbeatUrl. (optional)
NSNumber* timeout = @56; // Time (in seconds) we should wait while the call is ringing before canceling the call (optional)
NSString* playDtmf = @"playDtmf_example"; // DTMF Digits to play to the call once it connects. 0-9, #, or * (optional)
NSString* hideCallerId = @"hideCallerId_example"; // Specifies if the caller id will be hidden (optional)
NSNumber* record = @true; // Specifies if the call should be recorded (optional)
NSString* recordCallBackUrl = @"recordCallBackUrl_example"; // Recording parameters will be sent here upon completion (optional)
NSString* recordCallBackMethod = @"recordCallBackMethod_example"; // Method used to request the RecordCallback URL. (optional)
NSNumber* transcribe = @true; // Specifies if the call recording should be transcribed (optional)
NSString* transcribeCallBackUrl = @"transcribeCallBackUrl_example"; // Transcription parameters will be sent here upon completion (optional)

SWGCallApi*apiInstance = [[SWGCallApi alloc] init];

// Group Call
[apiInstance callsGroupcallWithFrom:from
              to:to
              url:url
              groupConfirmKey:groupConfirmKey
              groupConfirmFile:groupConfirmFile
              method:method
              statusCallBackUrl:statusCallBackUrl
              statusCallBackMethod:statusCallBackMethod
              fallBackUrl:fallBackUrl
              fallBackMethod:fallBackMethod
              heartBeatUrl:heartBeatUrl
              heartBeatMethod:heartBeatMethod
              timeout:timeout
              playDtmf:playDtmf
              hideCallerId:hideCallerId
              record:record
              recordCallBackUrl:recordCallBackUrl
              recordCallBackMethod:recordCallBackMethod
              transcribe:transcribe
              transcribeCallBackUrl:transcribeCallBackUrl
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCallApi->callsGroupcall: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **NSString***| This number to display on Caller ID as calling | 
 **to** | **NSString***| Please enter multiple E164 number. You can add max 10 numbers. Add numbers separated with comma. e.g : 1111111111,2222222222 | 
 **url** | **NSString***| URL requested once the call connects | 
 **groupConfirmKey** | **NSString***| Define the DTMF that the called party should send to bridge the call. Allowed Values : 0-9, #, * | 
 **groupConfirmFile** | **NSString***| Specify the audio file you want to play when the called party picks up the call | 
 **method** | **NSString***| Specifies the HTTP method used to request the required URL once call connects. | [optional] 
 **statusCallBackUrl** | **NSString***| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. | [optional] 
 **statusCallBackMethod** | **NSString***| Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. | [optional] 
 **fallBackUrl** | **NSString***| URL requested if the initial Url parameter fails or encounters an error | [optional] 
 **fallBackMethod** | **NSString***| Specifies the HTTP method used to request the required FallbackUrl once call connects. | [optional] 
 **heartBeatUrl** | **NSString***| URL that can be requested every 60 seconds during the call to notify of elapsed time and pass other general information. | [optional] 
 **heartBeatMethod** | **NSString***| Specifies the HTTP method used to request HeartbeatUrl. | [optional] 
 **timeout** | **NSNumber***| Time (in seconds) we should wait while the call is ringing before canceling the call | [optional] 
 **playDtmf** | **NSString***| DTMF Digits to play to the call once it connects. 0-9, #, or * | [optional] 
 **hideCallerId** | **NSString***| Specifies if the caller id will be hidden | [optional] 
 **record** | **NSNumber***| Specifies if the call should be recorded | [optional] 
 **recordCallBackUrl** | **NSString***| Recording parameters will be sent here upon completion | [optional] 
 **recordCallBackMethod** | **NSString***| Method used to request the RecordCallback URL. | [optional] 
 **transcribe** | **NSNumber***| Specifies if the call recording should be transcribed | [optional] 
 **transcribeCallBackUrl** | **NSString***| Transcription parameters will be sent here upon completion | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **callsInterruptcalls**
```objc
-(NSURLSessionTask*) callsInterruptcallsWithCallSid: (NSString*) callSid
    url: (NSString*) url
    method: (NSString*) method
    status: (NSString*) status
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Interrupt Call

Interrupt the Call by Call Sid

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* callSid = @"callSid_example"; // The unique identifier for voice call that is in progress.
NSString* url = @"url_example"; // URL the in-progress call will be redirected to (optional)
NSString* method = @"method_example"; // The method used to request the above Url parameter (optional)
NSString* status = @"status_example"; // Status to set the in-progress call to (optional)

SWGCallApi*apiInstance = [[SWGCallApi alloc] init];

// Interrupt Call
[apiInstance callsInterruptcallsWithCallSid:callSid
              url:url
              method:method
              status:status
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCallApi->callsInterruptcalls: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callSid** | **NSString***| The unique identifier for voice call that is in progress. | 
 **url** | **NSString***| URL the in-progress call will be redirected to | [optional] 
 **method** | **NSString***| The method used to request the above Url parameter | [optional] 
 **status** | **NSString***| Status to set the in-progress call to | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **callsListcalls**
```objc
-(NSURLSessionTask*) callsListcallsWithPage: (NSNumber*) page
    pageSize: (NSNumber*) pageSize
    to: (NSString*) to
    from: (NSString*) from
    dateCreated: (NSString*) dateCreated
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

List Calls

A list of calls associated with your Ytel account

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSNumber* page = @1; // The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) (default to 1)
NSNumber* pageSize = @10; // Number of individual resources listed in the response per page (optional) (default to 10)
NSString* to = @"to_example"; // Filter calls that were sent to this 10-digit number (E.164 format). (optional)
NSString* from = @"from_example"; // Filter calls that were sent from this 10-digit number (E.164 format). (optional)
NSString* dateCreated = @"dateCreated_example"; // Return calls that are from a specified date. (optional)

SWGCallApi*apiInstance = [[SWGCallApi alloc] init];

// List Calls
[apiInstance callsListcallsWithPage:page
              pageSize:pageSize
              to:to
              from:from
              dateCreated:dateCreated
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCallApi->callsListcalls: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **NSNumber***| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pageSize** | **NSNumber***| Number of individual resources listed in the response per page | [optional] [default to 10]
 **to** | **NSString***| Filter calls that were sent to this 10-digit number (E.164 format). | [optional] 
 **from** | **NSString***| Filter calls that were sent from this 10-digit number (E.164 format). | [optional] 
 **dateCreated** | **NSString***| Return calls that are from a specified date. | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **callsMakecall**
```objc
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
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Make Call

You can experiment with initiating a call through Ytel and view the request response generated when doing so and get the response in json

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* from = @"from_example"; // A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call.
NSString* to = @"to_example"; // To number
NSString* url = @"url_example"; // URL requested once the call connects
NSString* method = @"method_example"; // Specifies the HTTP method used to request the required URL once call connects. (optional)
NSString* statusCallBackUrl = @"statusCallBackUrl_example"; // URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. (optional)
NSString* statusCallBackMethod = @"statusCallBackMethod_example"; // Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. (optional)
NSString* fallBackUrl = @"fallBackUrl_example"; // URL requested if the initial Url parameter fails or encounters an error (optional)
NSString* fallBackMethod = @"fallBackMethod_example"; // Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional)
NSString* heartBeatUrl = @"heartBeatUrl_example"; // URL that can be requested every 60 seconds during the call to notify of elapsed tim (optional)
NSString* heartBeatMethod = @"heartBeatMethod_example"; // Specifies the HTTP method used to request HeartbeatUrl. (optional)
NSNumber* timeout = @56; // Time (in seconds) Ytel should wait while the call is ringing before canceling the call (optional)
NSString* playDtmf = @"playDtmf_example"; // DTMF Digits to play to the call once it connects. 0-9, #, or * (optional)
NSNumber* hideCallerId = @true; // Specifies if the caller id will be hidden (optional)
NSNumber* record = @true; // Specifies if the call should be recorded (optional)
NSString* recordCallBackUrl = @"recordCallBackUrl_example"; // Recording parameters will be sent here upon completion (optional)
NSString* recordCallBackMethod = @"recordCallBackMethod_example"; // Method used to request the RecordCallback URL. (optional)
NSNumber* transcribe = @true; // Specifies if the call recording should be transcribed (optional)
NSString* transcribeCallBackUrl = @"transcribeCallBackUrl_example"; // Transcription parameters will be sent here upon completion (optional)
NSString* ifMachine = @"ifMachine_example"; // How Ytel should handle the receiving numbers voicemail machine (optional)
NSString* ifMachineUrl = @"ifMachineUrl_example"; // URL requested when IfMachine=continue (optional)
NSString* ifMachineMethod = @"ifMachineMethod_example"; // Method used to request the IfMachineUrl. (optional)
NSNumber* feedback = @true; // Specify if survey should be enable or not (optional)
NSString* surveyId = @"surveyId_example"; // The unique identifier for the survey. (optional)

SWGCallApi*apiInstance = [[SWGCallApi alloc] init];

// Make Call
[apiInstance callsMakecallWithFrom:from
              to:to
              url:url
              method:method
              statusCallBackUrl:statusCallBackUrl
              statusCallBackMethod:statusCallBackMethod
              fallBackUrl:fallBackUrl
              fallBackMethod:fallBackMethod
              heartBeatUrl:heartBeatUrl
              heartBeatMethod:heartBeatMethod
              timeout:timeout
              playDtmf:playDtmf
              hideCallerId:hideCallerId
              record:record
              recordCallBackUrl:recordCallBackUrl
              recordCallBackMethod:recordCallBackMethod
              transcribe:transcribe
              transcribeCallBackUrl:transcribeCallBackUrl
              ifMachine:ifMachine
              ifMachineUrl:ifMachineUrl
              ifMachineMethod:ifMachineMethod
              feedback:feedback
              surveyId:surveyId
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCallApi->callsMakecall: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **NSString***| A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call. | 
 **to** | **NSString***| To number | 
 **url** | **NSString***| URL requested once the call connects | 
 **method** | **NSString***| Specifies the HTTP method used to request the required URL once call connects. | [optional] 
 **statusCallBackUrl** | **NSString***| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. | [optional] 
 **statusCallBackMethod** | **NSString***| Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. | [optional] 
 **fallBackUrl** | **NSString***| URL requested if the initial Url parameter fails or encounters an error | [optional] 
 **fallBackMethod** | **NSString***| Specifies the HTTP method used to request the required FallbackUrl once call connects. | [optional] 
 **heartBeatUrl** | **NSString***| URL that can be requested every 60 seconds during the call to notify of elapsed tim | [optional] 
 **heartBeatMethod** | **NSString***| Specifies the HTTP method used to request HeartbeatUrl. | [optional] 
 **timeout** | **NSNumber***| Time (in seconds) Ytel should wait while the call is ringing before canceling the call | [optional] 
 **playDtmf** | **NSString***| DTMF Digits to play to the call once it connects. 0-9, #, or * | [optional] 
 **hideCallerId** | **NSNumber***| Specifies if the caller id will be hidden | [optional] 
 **record** | **NSNumber***| Specifies if the call should be recorded | [optional] 
 **recordCallBackUrl** | **NSString***| Recording parameters will be sent here upon completion | [optional] 
 **recordCallBackMethod** | **NSString***| Method used to request the RecordCallback URL. | [optional] 
 **transcribe** | **NSNumber***| Specifies if the call recording should be transcribed | [optional] 
 **transcribeCallBackUrl** | **NSString***| Transcription parameters will be sent here upon completion | [optional] 
 **ifMachine** | **NSString***| How Ytel should handle the receiving numbers voicemail machine | [optional] 
 **ifMachineUrl** | **NSString***| URL requested when IfMachine&#x3D;continue | [optional] 
 **ifMachineMethod** | **NSString***| Method used to request the IfMachineUrl. | [optional] 
 **feedback** | **NSNumber***| Specify if survey should be enable or not | [optional] 
 **surveyId** | **NSString***| The unique identifier for the survey. | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **callsMakervm**
```objc
-(NSURLSessionTask*) callsMakervmWithFrom: (NSString*) from
    rVMCallerId: (NSString*) rVMCallerId
    to: (NSString*) to
    voiceMailURL: (NSString*) voiceMailURL
    method: (NSString*) method
    statusCallBackUrl: (NSString*) statusCallBackUrl
    statsCallBackMethod: (NSString*) statsCallBackMethod
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Send RVM

Initiate an outbound Ringless Voicemail through Ytel.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* from = @"from_example"; // A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call.
NSString* rVMCallerId = @"rVMCallerId_example"; // A required secondary Caller ID for RVM to work.
NSString* to = @"to_example"; // A valid number (E.164 format) that will receive the phone call.
NSString* voiceMailURL = @"voiceMailURL_example"; // The URL requested once the RVM connects. A set of default parameters will be sent here.
NSString* method = @"GET"; // Specifies the HTTP method used to request the required URL once call connects. (optional) (default to GET)
NSString* statusCallBackUrl = @"statusCallBackUrl_example"; // URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. (optional)
NSString* statsCallBackMethod = @"statsCallBackMethod_example"; // Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. (optional)

SWGCallApi*apiInstance = [[SWGCallApi alloc] init];

// Send RVM
[apiInstance callsMakervmWithFrom:from
              rVMCallerId:rVMCallerId
              to:to
              voiceMailURL:voiceMailURL
              method:method
              statusCallBackUrl:statusCallBackUrl
              statsCallBackMethod:statsCallBackMethod
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCallApi->callsMakervm: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **NSString***| A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call. | 
 **rVMCallerId** | **NSString***| A required secondary Caller ID for RVM to work. | 
 **to** | **NSString***| A valid number (E.164 format) that will receive the phone call. | 
 **voiceMailURL** | **NSString***| The URL requested once the RVM connects. A set of default parameters will be sent here. | 
 **method** | **NSString***| Specifies the HTTP method used to request the required URL once call connects. | [optional] [default to GET]
 **statusCallBackUrl** | **NSString***| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. | [optional] 
 **statsCallBackMethod** | **NSString***| Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **callsPlayaudios**
```objc
-(NSURLSessionTask*) callsPlayaudiosWithCallSid: (NSString*) callSid
    audioUrl: (NSString*) audioUrl
    sayText: (NSString*) sayText
    length: (NSNumber*) length
    direction: (NSString*) direction
    mix: (NSNumber*) mix
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Play Audio

Play Audio from a url

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* callSid = @"callSid_example"; // The unique identifier of each call resource
NSString* audioUrl = @"audioUrl_example"; // URL to sound that should be played. You also can add more than one audio file using semicolons e.g. http://example.com/audio1.mp3;http://example.com/audio2.wav
NSString* sayText = @"sayText_example"; // Valid alphanumeric string that should be played to the In-progress call.
NSNumber* length = @56; // Time limit in seconds for audio play back (optional)
NSString* direction = @"direction_example"; // The leg of the call audio will be played to (optional)
NSNumber* mix = @true; // If false, all other audio will be muted (optional)

SWGCallApi*apiInstance = [[SWGCallApi alloc] init];

// Play Audio
[apiInstance callsPlayaudiosWithCallSid:callSid
              audioUrl:audioUrl
              sayText:sayText
              length:length
              direction:direction
              mix:mix
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCallApi->callsPlayaudios: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callSid** | **NSString***| The unique identifier of each call resource | 
 **audioUrl** | **NSString***| URL to sound that should be played. You also can add more than one audio file using semicolons e.g. http://example.com/audio1.mp3;http://example.com/audio2.wav | 
 **sayText** | **NSString***| Valid alphanumeric string that should be played to the In-progress call. | 
 **length** | **NSNumber***| Time limit in seconds for audio play back | [optional] 
 **direction** | **NSString***| The leg of the call audio will be played to | [optional] 
 **mix** | **NSNumber***| If false, all other audio will be muted | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **callsRecordcalls**
```objc
-(NSURLSessionTask*) callsRecordcallsWithCallSid: (NSString*) callSid
    record: (NSNumber*) record
    direction: (NSString*) direction
    timeLimit: (NSNumber*) timeLimit
    callBackUrl: (NSString*) callBackUrl
    fileformat: (NSString*) fileformat
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Record Call

Start or stop recording of an in-progress voice call.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* callSid = @"callSid_example"; // The unique identifier of each call resource
NSNumber* record = @true; // Set true to initiate recording or false to terminate recording
NSString* direction = @"direction_example"; // The leg of the call to record (optional)
NSNumber* timeLimit = @56; // Time in seconds the recording duration should not exceed (optional)
NSString* callBackUrl = @"callBackUrl_example"; // URL consulted after the recording completes (optional)
NSString* fileformat = @"fileformat_example"; // Format of the recording file. Can be .mp3 or .wav (optional)

SWGCallApi*apiInstance = [[SWGCallApi alloc] init];

// Record Call
[apiInstance callsRecordcallsWithCallSid:callSid
              record:record
              direction:direction
              timeLimit:timeLimit
              callBackUrl:callBackUrl
              fileformat:fileformat
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCallApi->callsRecordcalls: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callSid** | **NSString***| The unique identifier of each call resource | 
 **record** | **NSNumber***| Set true to initiate recording or false to terminate recording | 
 **direction** | **NSString***| The leg of the call to record | [optional] 
 **timeLimit** | **NSNumber***| Time in seconds the recording duration should not exceed | [optional] 
 **callBackUrl** | **NSString***| URL consulted after the recording completes | [optional] 
 **fileformat** | **NSString***| Format of the recording file. Can be .mp3 or .wav | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **callsSenddigits**
```objc
-(NSURLSessionTask*) callsSenddigitsWithCallSid: (NSString*) callSid
    playDtmf: (NSString*) playDtmf
    playDtmfDirection: (NSString*) playDtmfDirection
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Play DTMF

Play Dtmf and send the Digit

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* callSid = @"callSid_example"; // The unique identifier of each call resource
NSString* playDtmf = @"playDtmf_example"; // DTMF digits to play to the call. 0-9, #, *, W, or w
NSString* playDtmfDirection = @"playDtmfDirection_example"; // The leg of the call DTMF digits should be sent to (optional)

SWGCallApi*apiInstance = [[SWGCallApi alloc] init];

// Play DTMF
[apiInstance callsSenddigitsWithCallSid:callSid
              playDtmf:playDtmf
              playDtmfDirection:playDtmfDirection
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCallApi->callsSenddigits: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callSid** | **NSString***| The unique identifier of each call resource | 
 **playDtmf** | **NSString***| DTMF digits to play to the call. 0-9, #, *, W, or w | 
 **playDtmfDirection** | **NSString***| The leg of the call DTMF digits should be sent to | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **callsViewcalldetail**
```objc
-(NSURLSessionTask*) callsViewcalldetailWithCallSid: (NSString*) callSid
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

View Call Details

Retrieve a single voice call’s information by its CallSid.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* callSid = @"callSid_example"; // The unique identifier for the voice call.

SWGCallApi*apiInstance = [[SWGCallApi alloc] init];

// View Call Details
[apiInstance callsViewcalldetailWithCallSid:callSid
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCallApi->callsViewcalldetail: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callSid** | **NSString***| The unique identifier for the voice call. | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **callsViewcalls**
```objc
-(NSURLSessionTask*) callsViewcallsWithCallsid: (NSString*) callsid
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

View Call

Retrieve a single voice call’s information by its CallSid.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* callsid = @"callsid_example"; // The unique identifier for the voice call.

SWGCallApi*apiInstance = [[SWGCallApi alloc] init];

// View Call
[apiInstance callsViewcallsWithCallsid:callsid
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCallApi->callsViewcalls: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callsid** | **NSString***| The unique identifier for the voice call. | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **callsVoiceeffect**
```objc
-(NSURLSessionTask*) callsVoiceeffectWithCallSid: (NSString*) callSid
    audioDirection: (NSString*) audioDirection
    pitchSemiTones: (NSNumber*) pitchSemiTones
    pitchOctaves: (NSNumber*) pitchOctaves
    pitch: (NSNumber*) pitch
    rate: (NSNumber*) rate
    tempo: (NSNumber*) tempo
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Voice Effect

Add audio voice effects to the an in-progress voice call.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* callSid = @"callSid_example"; // The unique identifier for the in-progress voice call.
NSString* audioDirection = @"audioDirection_example"; // The direction the audio effect should be placed on. If IN, the effects will occur on the incoming audio stream. If OUT, the effects will occur on the outgoing audio stream. (optional)
NSNumber* pitchSemiTones = @1.2; // Set the pitch in semitone (half-step) intervals. Value between -14 and 14 (optional)
NSNumber* pitchOctaves = @1.2; // Set the pitch in octave intervals.. Value between -1 and 1 (optional)
NSNumber* pitch = @1.2; // Set the pitch (lowness/highness) of the audio. The higher the value, the higher the pitch. Value greater than 0 (optional)
NSNumber* rate = @1.2; // Set the rate for audio. The lower the value, the lower the rate. value greater than 0 (optional)
NSNumber* tempo = @1.2; // Set the tempo (speed) of the audio. A higher value denotes a faster tempo. Value greater than 0 (optional)

SWGCallApi*apiInstance = [[SWGCallApi alloc] init];

// Voice Effect
[apiInstance callsVoiceeffectWithCallSid:callSid
              audioDirection:audioDirection
              pitchSemiTones:pitchSemiTones
              pitchOctaves:pitchOctaves
              pitch:pitch
              rate:rate
              tempo:tempo
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCallApi->callsVoiceeffect: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callSid** | **NSString***| The unique identifier for the in-progress voice call. | 
 **audioDirection** | **NSString***| The direction the audio effect should be placed on. If IN, the effects will occur on the incoming audio stream. If OUT, the effects will occur on the outgoing audio stream. | [optional] 
 **pitchSemiTones** | **NSNumber***| Set the pitch in semitone (half-step) intervals. Value between -14 and 14 | [optional] 
 **pitchOctaves** | **NSNumber***| Set the pitch in octave intervals.. Value between -1 and 1 | [optional] 
 **pitch** | **NSNumber***| Set the pitch (lowness/highness) of the audio. The higher the value, the higher the pitch. Value greater than 0 | [optional] 
 **rate** | **NSNumber***| Set the rate for audio. The lower the value, the lower the rate. value greater than 0 | [optional] 
 **tempo** | **NSNumber***| Set the tempo (speed) of the audio. A higher value denotes a faster tempo. Value greater than 0 | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

