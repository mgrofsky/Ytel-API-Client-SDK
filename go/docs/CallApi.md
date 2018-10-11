# \CallApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CallsGroupcall**](CallApi.md#CallsGroupcall) | **Post** /calls/groupcall.json | Group Call
[**CallsInterruptcalls**](CallApi.md#CallsInterruptcalls) | **Post** /calls/interruptcalls.json | Interrupt Call
[**CallsListcalls**](CallApi.md#CallsListcalls) | **Post** /calls/listcalls.json | List Calls
[**CallsMakecall**](CallApi.md#CallsMakecall) | **Post** /calls/makecall.json | Make Call
[**CallsMakervm**](CallApi.md#CallsMakervm) | **Post** /calls/makervm.json | Send RVM
[**CallsPlayaudios**](CallApi.md#CallsPlayaudios) | **Post** /calls/playaudios.json | Play Audio
[**CallsRecordcalls**](CallApi.md#CallsRecordcalls) | **Post** /calls/recordcalls.json | Record Call
[**CallsSenddigits**](CallApi.md#CallsSenddigits) | **Post** /calls/senddigits.json | Play DTMF
[**CallsViewcalldetail**](CallApi.md#CallsViewcalldetail) | **Post** /calls/viewcalldetail.json | View Call
[**CallsViewcalls**](CallApi.md#CallsViewcalls) | **Post** /calls/viewcalls.json | View Call
[**CallsVoiceeffect**](CallApi.md#CallsVoiceeffect) | **Post** /calls/voiceeffect.json | Voice Effect


# **CallsGroupcall**
> string CallsGroupcall(ctx, from, to, url, groupConfirmKey, groupConfirmFile, optional)
Group Call

Group Call

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for logging, tracing, authentication, etc.
  **from** | **string**| This number to display on Caller ID as calling | 
  **to** | **string**| Please enter multiple E164 number. You can add max 10 numbers. Add numbers separated with comma. e.g : 1111111111,2222222222 | 
  **url** | **string**| URL requested once the call connects | 
  **groupConfirmKey** | **string**| Define the DTMF that the called party should send to bridge the call. Allowed Values : 0-9, #, * | 
  **groupConfirmFile** | **string**| Specify the audio file you want to play when the called party picks up the call | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **string**| This number to display on Caller ID as calling | 
 **to** | **string**| Please enter multiple E164 number. You can add max 10 numbers. Add numbers separated with comma. e.g : 1111111111,2222222222 | 
 **url** | **string**| URL requested once the call connects | 
 **groupConfirmKey** | **string**| Define the DTMF that the called party should send to bridge the call. Allowed Values : 0-9, #, * | 
 **groupConfirmFile** | **string**| Specify the audio file you want to play when the called party picks up the call | 
 **method** | **string**| Specifies the HTTP method used to request the required URL once call connects. | 
 **statusCallBackUrl** | **string**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. | 
 **statusCallBackMethod** | **string**| Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. | 
 **fallBackUrl** | **string**| URL requested if the initial Url parameter fails or encounters an error | 
 **fallBackMethod** | **string**| Specifies the HTTP method used to request the required FallbackUrl once call connects. | 
 **heartBeatUrl** | **string**| URL that can be requested every 60 seconds during the call to notify of elapsed time and pass other general information. | 
 **heartBeatMethod** | **string**| Specifies the HTTP method used to request HeartbeatUrl. | 
 **timeout** | **int32**| Time (in seconds) we should wait while the call is ringing before canceling the call | 
 **playDtmf** | **string**| DTMF Digits to play to the call once it connects. 0-9, #, or * | 
 **hideCallerId** | **string**| Specifies if the caller id will be hidden | 
 **record** | **bool**| Specifies if the call should be recorded | 
 **recordCallBackUrl** | **string**| Recording parameters will be sent here upon completion | 
 **recordCallBackMethod** | **string**| Method used to request the RecordCallback URL. | 
 **transcribe** | **bool**| Specifies if the call recording should be transcribed | 
 **transcribeCallBackUrl** | **string**| Transcription parameters will be sent here upon completion | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CallsInterruptcalls**
> string CallsInterruptcalls(ctx, callSid, optional)
Interrupt Call

Interrupt the Call by Call Sid

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for logging, tracing, authentication, etc.
  **callSid** | **string**| The unique identifier for voice call that is in progress. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callSid** | **string**| The unique identifier for voice call that is in progress. | 
 **url** | **string**| URL the in-progress call will be redirected to | 
 **method** | **string**| The method used to request the above Url parameter | 
 **status** | **string**| Status to set the in-progress call to | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CallsListcalls**
> string CallsListcalls(ctx, optional)
List Calls

A list of calls associated with your Ytel account

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for logging, tracing, authentication, etc.
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int32**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [default to 1]
 **pageSize** | **int32**| Number of individual resources listed in the response per page | [default to 10]
 **to** | **string**| Filter calls that were sent to this 10-digit number (E.164 format). | 
 **from** | **string**| Filter calls that were sent from this 10-digit number (E.164 format). | 
 **dateCreated** | **string**| Return calls that are from a specified date. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CallsMakecall**
> string CallsMakecall(ctx, from, to, url, optional)
Make Call

You can experiment with initiating a call through Ytel and view the request response generated when doing so and get the response in json

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for logging, tracing, authentication, etc.
  **from** | **string**| A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call. | 
  **to** | **string**| To number | 
  **url** | **string**| URL requested once the call connects | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **string**| A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call. | 
 **to** | **string**| To number | 
 **url** | **string**| URL requested once the call connects | 
 **method** | **string**| Specifies the HTTP method used to request the required URL once call connects. | 
 **statusCallBackUrl** | **string**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. | 
 **statusCallBackMethod** | **string**| Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. | 
 **fallBackUrl** | **string**| URL requested if the initial Url parameter fails or encounters an error | 
 **fallBackMethod** | **string**| Specifies the HTTP method used to request the required FallbackUrl once call connects. | 
 **heartBeatUrl** | **string**| URL that can be requested every 60 seconds during the call to notify of elapsed tim | 
 **heartBeatMethod** | **string**| Specifies the HTTP method used to request HeartbeatUrl. | 
 **timeout** | **int32**| Time (in seconds) Ytel should wait while the call is ringing before canceling the call | 
 **playDtmf** | **string**| DTMF Digits to play to the call once it connects. 0-9, #, or * | 
 **hideCallerId** | **bool**| Specifies if the caller id will be hidden | 
 **record** | **bool**| Specifies if the call should be recorded | 
 **recordCallBackUrl** | **string**| Recording parameters will be sent here upon completion | 
 **recordCallBackMethod** | **string**| Method used to request the RecordCallback URL. | 
 **transcribe** | **bool**| Specifies if the call recording should be transcribed | 
 **transcribeCallBackUrl** | **string**| Transcription parameters will be sent here upon completion | 
 **ifMachine** | **string**| How Ytel should handle the receiving numbers voicemail machine | 
 **ifMachineUrl** | **string**| URL requested when IfMachine&#x3D;continue | 
 **ifMachineMethod** | **string**| Method used to request the IfMachineUrl. | 
 **feedback** | **bool**| Specify if survey should be enable or not | 
 **surveyId** | **string**| The unique identifier for the survey. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CallsMakervm**
> string CallsMakervm(ctx, from, rVMCallerId, to, voiceMailURL, optional)
Send RVM

Initiate an outbound Ringless Voicemail through Ytel.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for logging, tracing, authentication, etc.
  **from** | **string**| A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call. | 
  **rVMCallerId** | **string**| A required secondary Caller ID for RVM to work. | 
  **to** | **string**| A valid number (E.164 format) that will receive the phone call. | 
  **voiceMailURL** | **string**| The URL requested once the RVM connects. A set of default parameters will be sent here. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **string**| A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call. | 
 **rVMCallerId** | **string**| A required secondary Caller ID for RVM to work. | 
 **to** | **string**| A valid number (E.164 format) that will receive the phone call. | 
 **voiceMailURL** | **string**| The URL requested once the RVM connects. A set of default parameters will be sent here. | 
 **method** | **string**| Specifies the HTTP method used to request the required URL once call connects. | [default to GET]
 **statusCallBackUrl** | **string**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. | 
 **statsCallBackMethod** | **string**| Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CallsPlayaudios**
> string CallsPlayaudios(ctx, callSid, audioUrl, sayText, optional)
Play Audio

Play Audio from a url

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for logging, tracing, authentication, etc.
  **callSid** | **string**| The unique identifier of each call resource | 
  **audioUrl** | **string**| URL to sound that should be played. You also can add more than one audio file using semicolons e.g. http://example.com/audio1.mp3;http://example.com/audio2.wav | 
  **sayText** | **string**| Valid alphanumeric string that should be played to the In-progress call. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callSid** | **string**| The unique identifier of each call resource | 
 **audioUrl** | **string**| URL to sound that should be played. You also can add more than one audio file using semicolons e.g. http://example.com/audio1.mp3;http://example.com/audio2.wav | 
 **sayText** | **string**| Valid alphanumeric string that should be played to the In-progress call. | 
 **length** | **int32**| Time limit in seconds for audio play back | 
 **direction** | **string**| The leg of the call audio will be played to | 
 **mix** | **bool**| If false, all other audio will be muted | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CallsRecordcalls**
> string CallsRecordcalls(ctx, callSid, record, optional)
Record Call

Start or stop recording of an in-progress voice call.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for logging, tracing, authentication, etc.
  **callSid** | **string**| The unique identifier of each call resource | 
  **record** | **bool**| Set true to initiate recording or false to terminate recording | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callSid** | **string**| The unique identifier of each call resource | 
 **record** | **bool**| Set true to initiate recording or false to terminate recording | 
 **direction** | **string**| The leg of the call to record | 
 **timeLimit** | **int32**| Time in seconds the recording duration should not exceed | 
 **callBackUrl** | **string**| URL consulted after the recording completes | 
 **fileformat** | **string**| Format of the recording file. Can be .mp3 or .wav | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CallsSenddigits**
> string CallsSenddigits(ctx, callSid, playDtmf, optional)
Play DTMF

Play Dtmf and send the Digit

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for logging, tracing, authentication, etc.
  **callSid** | **string**| The unique identifier of each call resource | 
  **playDtmf** | **string**| DTMF digits to play to the call. 0-9, #, *, W, or w | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callSid** | **string**| The unique identifier of each call resource | 
 **playDtmf** | **string**| DTMF digits to play to the call. 0-9, #, *, W, or w | 
 **playDtmfDirection** | **string**| The leg of the call DTMF digits should be sent to | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CallsViewcalldetail**
> string CallsViewcalldetail(ctx, callSid)
View Call

Retrieve a single voice call’s information by its CallSid.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for logging, tracing, authentication, etc.
  **callSid** | **string**| The unique identifier for the voice call. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CallsViewcalls**
> string CallsViewcalls(ctx, callsid)
View Call

Retrieve a single voice call’s information by its CallSid.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for logging, tracing, authentication, etc.
  **callsid** | **string**| The unique identifier for the voice call. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CallsVoiceeffect**
> string CallsVoiceeffect(ctx, callSid, optional)
Voice Effect

Add audio voice effects to the an in-progress voice call.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for logging, tracing, authentication, etc.
  **callSid** | **string**| The unique identifier for the in-progress voice call. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callSid** | **string**| The unique identifier for the in-progress voice call. | 
 **audioDirection** | **string**| The direction the audio effect should be placed on. If IN, the effects will occur on the incoming audio stream. If OUT, the effects will occur on the outgoing audio stream. | 
 **pitchSemiTones** | **float64**| Set the pitch in semitone (half-step) intervals. Value between -14 and 14 | 
 **pitchOctaves** | **float64**| Set the pitch in octave intervals.. Value between -1 and 1 | 
 **pitch** | **float64**| Set the pitch (lowness/highness) of the audio. The higher the value, the higher the pitch. Value greater than 0 | 
 **rate** | **float64**| Set the rate for audio. The lower the value, the lower the rate. value greater than 0 | 
 **tempo** | **float64**| Set the tempo (speed) of the audio. A higher value denotes a faster tempo. Value greater than 0 | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

