# CallApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**callsGroupcall**](CallApi.md#callsGroupcall) | **POST** /calls/groupcall.json | Group Call
[**callsInterruptcalls**](CallApi.md#callsInterruptcalls) | **POST** /calls/interruptcalls.json | Interrupt Call
[**callsListcalls**](CallApi.md#callsListcalls) | **POST** /calls/listcalls.json | List Calls
[**callsMakecall**](CallApi.md#callsMakecall) | **POST** /calls/makecall.json | Make Call
[**callsMakervm**](CallApi.md#callsMakervm) | **POST** /calls/makervm.json | Send RVM
[**callsPlayaudios**](CallApi.md#callsPlayaudios) | **POST** /calls/playaudios.json | Play Audio
[**callsRecordcalls**](CallApi.md#callsRecordcalls) | **POST** /calls/recordcalls.json | Record Call
[**callsSenddigits**](CallApi.md#callsSenddigits) | **POST** /calls/senddigits.json | Play DTMF
[**callsViewcalldetail**](CallApi.md#callsViewcalldetail) | **POST** /calls/viewcalldetail.json | View Call
[**callsViewcalls**](CallApi.md#callsViewcalls) | **POST** /calls/viewcalls.json | View Call
[**callsVoiceeffect**](CallApi.md#callsVoiceeffect) | **POST** /calls/voiceeffect.json | Voice Effect


<a name="callsGroupcall"></a>
# **callsGroupcall**
> kotlin.String callsGroupcall(from, to, url, groupConfirmKey, groupConfirmFile, method, statusCallBackUrl, statusCallBackMethod, fallBackUrl, fallBackMethod, heartBeatUrl, heartBeatMethod, timeout, playDtmf, hideCallerId, record, recordCallBackUrl, recordCallBackMethod, transcribe, transcribeCallBackUrl)

Group Call

Group Call

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = CallApi()
val from : kotlin.String = from_example // kotlin.String | This number to display on Caller ID as calling
val to : kotlin.String = to_example // kotlin.String | Please enter multiple E164 number. You can add max 10 numbers. Add numbers separated with comma. e.g : 1111111111,2222222222
val url : kotlin.String = url_example // kotlin.String | URL requested once the call connects
val groupConfirmKey : kotlin.String = groupConfirmKey_example // kotlin.String | Define the DTMF that the called party should send to bridge the call. Allowed Values : 0-9, #, *
val groupConfirmFile : kotlin.String = groupConfirmFile_example // kotlin.String | Specify the audio file you want to play when the called party picks up the call
val method : kotlin.String = method_example // kotlin.String | Specifies the HTTP method used to request the required URL once call connects.
val statusCallBackUrl : kotlin.String = statusCallBackUrl_example // kotlin.String | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
val statusCallBackMethod : kotlin.String = statusCallBackMethod_example // kotlin.String | Specifies the HTTP methodlinkclass used to request StatusCallbackUrl.
val fallBackUrl : kotlin.String = fallBackUrl_example // kotlin.String | URL requested if the initial Url parameter fails or encounters an error
val fallBackMethod : kotlin.String = fallBackMethod_example // kotlin.String | Specifies the HTTP method used to request the required FallbackUrl once call connects.
val heartBeatUrl : kotlin.String = heartBeatUrl_example // kotlin.String | URL that can be requested every 60 seconds during the call to notify of elapsed time and pass other general information.
val heartBeatMethod : kotlin.String = heartBeatMethod_example // kotlin.String | Specifies the HTTP method used to request HeartbeatUrl.
val timeout : kotlin.Int = 56 // kotlin.Int | Time (in seconds) we should wait while the call is ringing before canceling the call
val playDtmf : kotlin.String = playDtmf_example // kotlin.String | DTMF Digits to play to the call once it connects. 0-9, #, or *
val hideCallerId : kotlin.String = hideCallerId_example // kotlin.String | Specifies if the caller id will be hidden
val record : kotlin.Boolean = true // kotlin.Boolean | Specifies if the call should be recorded
val recordCallBackUrl : kotlin.String = recordCallBackUrl_example // kotlin.String | Recording parameters will be sent here upon completion
val recordCallBackMethod : kotlin.String = recordCallBackMethod_example // kotlin.String | Method used to request the RecordCallback URL.
val transcribe : kotlin.Boolean = true // kotlin.Boolean | Specifies if the call recording should be transcribed
val transcribeCallBackUrl : kotlin.String = transcribeCallBackUrl_example // kotlin.String | Transcription parameters will be sent here upon completion
try {
    val result : kotlin.String = apiInstance.callsGroupcall(from, to, url, groupConfirmKey, groupConfirmFile, method, statusCallBackUrl, statusCallBackMethod, fallBackUrl, fallBackMethod, heartBeatUrl, heartBeatMethod, timeout, playDtmf, hideCallerId, record, recordCallBackUrl, recordCallBackMethod, transcribe, transcribeCallBackUrl)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CallApi#callsGroupcall")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CallApi#callsGroupcall")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.String**| This number to display on Caller ID as calling |
 **to** | **kotlin.String**| Please enter multiple E164 number. You can add max 10 numbers. Add numbers separated with comma. e.g : 1111111111,2222222222 |
 **url** | **kotlin.String**| URL requested once the call connects |
 **groupConfirmKey** | **kotlin.String**| Define the DTMF that the called party should send to bridge the call. Allowed Values : 0-9, #, * |
 **groupConfirmFile** | **kotlin.String**| Specify the audio file you want to play when the called party picks up the call | [enum: mp3, wav]
 **method** | **kotlin.String**| Specifies the HTTP method used to request the required URL once call connects. | [optional]
 **statusCallBackUrl** | **kotlin.String**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. | [optional]
 **statusCallBackMethod** | **kotlin.String**| Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. | [optional]
 **fallBackUrl** | **kotlin.String**| URL requested if the initial Url parameter fails or encounters an error | [optional]
 **fallBackMethod** | **kotlin.String**| Specifies the HTTP method used to request the required FallbackUrl once call connects. | [optional]
 **heartBeatUrl** | **kotlin.String**| URL that can be requested every 60 seconds during the call to notify of elapsed time and pass other general information. | [optional]
 **heartBeatMethod** | **kotlin.String**| Specifies the HTTP method used to request HeartbeatUrl. | [optional]
 **timeout** | **kotlin.Int**| Time (in seconds) we should wait while the call is ringing before canceling the call | [optional]
 **playDtmf** | **kotlin.String**| DTMF Digits to play to the call once it connects. 0-9, #, or * | [optional]
 **hideCallerId** | **kotlin.String**| Specifies if the caller id will be hidden | [optional]
 **record** | **kotlin.Boolean**| Specifies if the call should be recorded | [optional]
 **recordCallBackUrl** | **kotlin.String**| Recording parameters will be sent here upon completion | [optional]
 **recordCallBackMethod** | **kotlin.String**| Method used to request the RecordCallback URL. | [optional]
 **transcribe** | **kotlin.Boolean**| Specifies if the call recording should be transcribed | [optional]
 **transcribeCallBackUrl** | **kotlin.String**| Transcription parameters will be sent here upon completion | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="callsInterruptcalls"></a>
# **callsInterruptcalls**
> kotlin.String callsInterruptcalls(callSid, url, method, status)

Interrupt Call

Interrupt the Call by Call Sid

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = CallApi()
val callSid : kotlin.String = callSid_example // kotlin.String | The unique identifier for voice call that is in progress.
val url : kotlin.String = url_example // kotlin.String | URL the in-progress call will be redirected to
val method : kotlin.String = method_example // kotlin.String | The method used to request the above Url parameter
val status : kotlin.String = status_example // kotlin.String | Status to set the in-progress call to
try {
    val result : kotlin.String = apiInstance.callsInterruptcalls(callSid, url, method, status)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CallApi#callsInterruptcalls")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CallApi#callsInterruptcalls")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callSid** | **kotlin.String**| The unique identifier for voice call that is in progress. |
 **url** | **kotlin.String**| URL the in-progress call will be redirected to | [optional]
 **method** | **kotlin.String**| The method used to request the above Url parameter | [optional]
 **status** | **kotlin.String**| Status to set the in-progress call to | [optional] [enum: canceled, completed]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="callsListcalls"></a>
# **callsListcalls**
> kotlin.String callsListcalls(page, pageSize, to, from, dateCreated)

List Calls

A list of calls associated with your Ytel account

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = CallApi()
val page : kotlin.Int = 56 // kotlin.Int | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of individual resources listed in the response per page
val to : kotlin.String = to_example // kotlin.String | Filter calls that were sent to this 10-digit number (E.164 format).
val from : kotlin.String = from_example // kotlin.String | Filter calls that were sent from this 10-digit number (E.164 format).
val dateCreated : kotlin.String = dateCreated_example // kotlin.String | Return calls that are from a specified date.
try {
    val result : kotlin.String = apiInstance.callsListcalls(page, pageSize, to, from, dateCreated)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CallApi#callsListcalls")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CallApi#callsListcalls")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pageSize** | **kotlin.Int**| Number of individual resources listed in the response per page | [optional] [default to 10]
 **to** | **kotlin.String**| Filter calls that were sent to this 10-digit number (E.164 format). | [optional]
 **from** | **kotlin.String**| Filter calls that were sent from this 10-digit number (E.164 format). | [optional]
 **dateCreated** | **kotlin.String**| Return calls that are from a specified date. | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="callsMakecall"></a>
# **callsMakecall**
> kotlin.String callsMakecall(from, to, url, method, statusCallBackUrl, statusCallBackMethod, fallBackUrl, fallBackMethod, heartBeatUrl, heartBeatMethod, timeout, playDtmf, hideCallerId, record, recordCallBackUrl, recordCallBackMethod, transcribe, transcribeCallBackUrl, ifMachine, ifMachineUrl, ifMachineMethod, feedback, surveyId)

Make Call

You can experiment with initiating a call through Ytel and view the request response generated when doing so and get the response in json

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = CallApi()
val from : kotlin.String = from_example // kotlin.String | A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call.
val to : kotlin.String = to_example // kotlin.String | To number
val url : kotlin.String = url_example // kotlin.String | URL requested once the call connects
val method : kotlin.String = method_example // kotlin.String | Specifies the HTTP method used to request the required URL once call connects.
val statusCallBackUrl : kotlin.String = statusCallBackUrl_example // kotlin.String | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
val statusCallBackMethod : kotlin.String = statusCallBackMethod_example // kotlin.String | Specifies the HTTP methodlinkclass used to request StatusCallbackUrl.
val fallBackUrl : kotlin.String = fallBackUrl_example // kotlin.String | URL requested if the initial Url parameter fails or encounters an error
val fallBackMethod : kotlin.String = fallBackMethod_example // kotlin.String | Specifies the HTTP method used to request the required FallbackUrl once call connects.
val heartBeatUrl : kotlin.String = heartBeatUrl_example // kotlin.String | URL that can be requested every 60 seconds during the call to notify of elapsed tim
val heartBeatMethod : kotlin.String = heartBeatMethod_example // kotlin.String | Specifies the HTTP method used to request HeartbeatUrl.
val timeout : kotlin.Int = 56 // kotlin.Int | Time (in seconds) Ytel should wait while the call is ringing before canceling the call
val playDtmf : kotlin.String = playDtmf_example // kotlin.String | DTMF Digits to play to the call once it connects. 0-9, #, or *
val hideCallerId : kotlin.Boolean = true // kotlin.Boolean | Specifies if the caller id will be hidden
val record : kotlin.Boolean = true // kotlin.Boolean | Specifies if the call should be recorded
val recordCallBackUrl : kotlin.String = recordCallBackUrl_example // kotlin.String | Recording parameters will be sent here upon completion
val recordCallBackMethod : kotlin.String = recordCallBackMethod_example // kotlin.String | Method used to request the RecordCallback URL.
val transcribe : kotlin.Boolean = true // kotlin.Boolean | Specifies if the call recording should be transcribed
val transcribeCallBackUrl : kotlin.String = transcribeCallBackUrl_example // kotlin.String | Transcription parameters will be sent here upon completion
val ifMachine : kotlin.String = ifMachine_example // kotlin.String | How Ytel should handle the receiving numbers voicemail machine
val ifMachineUrl : kotlin.String = ifMachineUrl_example // kotlin.String | URL requested when IfMachine=continue
val ifMachineMethod : kotlin.String = ifMachineMethod_example // kotlin.String | Method used to request the IfMachineUrl.
val feedback : kotlin.Boolean = true // kotlin.Boolean | Specify if survey should be enable or not
val surveyId : kotlin.String = surveyId_example // kotlin.String | The unique identifier for the survey.
try {
    val result : kotlin.String = apiInstance.callsMakecall(from, to, url, method, statusCallBackUrl, statusCallBackMethod, fallBackUrl, fallBackMethod, heartBeatUrl, heartBeatMethod, timeout, playDtmf, hideCallerId, record, recordCallBackUrl, recordCallBackMethod, transcribe, transcribeCallBackUrl, ifMachine, ifMachineUrl, ifMachineMethod, feedback, surveyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CallApi#callsMakecall")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CallApi#callsMakecall")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.String**| A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call. |
 **to** | **kotlin.String**| To number |
 **url** | **kotlin.String**| URL requested once the call connects |
 **method** | **kotlin.String**| Specifies the HTTP method used to request the required URL once call connects. | [optional]
 **statusCallBackUrl** | **kotlin.String**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. | [optional]
 **statusCallBackMethod** | **kotlin.String**| Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. | [optional]
 **fallBackUrl** | **kotlin.String**| URL requested if the initial Url parameter fails or encounters an error | [optional]
 **fallBackMethod** | **kotlin.String**| Specifies the HTTP method used to request the required FallbackUrl once call connects. | [optional]
 **heartBeatUrl** | **kotlin.String**| URL that can be requested every 60 seconds during the call to notify of elapsed tim | [optional]
 **heartBeatMethod** | **kotlin.String**| Specifies the HTTP method used to request HeartbeatUrl. | [optional]
 **timeout** | **kotlin.Int**| Time (in seconds) Ytel should wait while the call is ringing before canceling the call | [optional]
 **playDtmf** | **kotlin.String**| DTMF Digits to play to the call once it connects. 0-9, #, or * | [optional]
 **hideCallerId** | **kotlin.Boolean**| Specifies if the caller id will be hidden | [optional]
 **record** | **kotlin.Boolean**| Specifies if the call should be recorded | [optional]
 **recordCallBackUrl** | **kotlin.String**| Recording parameters will be sent here upon completion | [optional]
 **recordCallBackMethod** | **kotlin.String**| Method used to request the RecordCallback URL. | [optional]
 **transcribe** | **kotlin.Boolean**| Specifies if the call recording should be transcribed | [optional]
 **transcribeCallBackUrl** | **kotlin.String**| Transcription parameters will be sent here upon completion | [optional]
 **ifMachine** | **kotlin.String**| How Ytel should handle the receiving numbers voicemail machine | [optional] [enum: continue, hangup]
 **ifMachineUrl** | **kotlin.String**| URL requested when IfMachine&#x3D;continue | [optional]
 **ifMachineMethod** | **kotlin.String**| Method used to request the IfMachineUrl. | [optional]
 **feedback** | **kotlin.Boolean**| Specify if survey should be enable or not | [optional]
 **surveyId** | **kotlin.String**| The unique identifier for the survey. | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="callsMakervm"></a>
# **callsMakervm**
> kotlin.String callsMakervm(from, rVMCallerId, to, voiceMailURL, method, statusCallBackUrl, statsCallBackMethod)

Send RVM

Initiate an outbound Ringless Voicemail through Ytel.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = CallApi()
val from : kotlin.String = from_example // kotlin.String | A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call.
val rVMCallerId : kotlin.String = rVMCallerId_example // kotlin.String | A required secondary Caller ID for RVM to work.
val to : kotlin.String = to_example // kotlin.String | A valid number (E.164 format) that will receive the phone call.
val voiceMailURL : kotlin.String = voiceMailURL_example // kotlin.String | The URL requested once the RVM connects. A set of default parameters will be sent here.
val method : kotlin.String = method_example // kotlin.String | Specifies the HTTP method used to request the required URL once call connects.
val statusCallBackUrl : kotlin.String = statusCallBackUrl_example // kotlin.String | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
val statsCallBackMethod : kotlin.String = statsCallBackMethod_example // kotlin.String | Specifies the HTTP method used to request the required StatusCallBackUrl once call connects.
try {
    val result : kotlin.String = apiInstance.callsMakervm(from, rVMCallerId, to, voiceMailURL, method, statusCallBackUrl, statsCallBackMethod)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CallApi#callsMakervm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CallApi#callsMakervm")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.String**| A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call. |
 **rVMCallerId** | **kotlin.String**| A required secondary Caller ID for RVM to work. |
 **to** | **kotlin.String**| A valid number (E.164 format) that will receive the phone call. |
 **voiceMailURL** | **kotlin.String**| The URL requested once the RVM connects. A set of default parameters will be sent here. |
 **method** | **kotlin.String**| Specifies the HTTP method used to request the required URL once call connects. | [optional] [default to GET]
 **statusCallBackUrl** | **kotlin.String**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. | [optional]
 **statsCallBackMethod** | **kotlin.String**| Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="callsPlayaudios"></a>
# **callsPlayaudios**
> kotlin.String callsPlayaudios(callSid, audioUrl, sayText, length, direction, mix)

Play Audio

Play Audio from a url

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = CallApi()
val callSid : kotlin.String = callSid_example // kotlin.String | The unique identifier of each call resource
val audioUrl : kotlin.String = audioUrl_example // kotlin.String | URL to sound that should be played. You also can add more than one audio file using semicolons e.g. http://example.com/audio1.mp3;http://example.com/audio2.wav
val sayText : kotlin.String = sayText_example // kotlin.String | Valid alphanumeric string that should be played to the In-progress call.
val length : kotlin.Int = 56 // kotlin.Int | Time limit in seconds for audio play back
val direction : kotlin.String = direction_example // kotlin.String | The leg of the call audio will be played to
val mix : kotlin.Boolean = true // kotlin.Boolean | If false, all other audio will be muted
try {
    val result : kotlin.String = apiInstance.callsPlayaudios(callSid, audioUrl, sayText, length, direction, mix)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CallApi#callsPlayaudios")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CallApi#callsPlayaudios")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callSid** | **kotlin.String**| The unique identifier of each call resource |
 **audioUrl** | **kotlin.String**| URL to sound that should be played. You also can add more than one audio file using semicolons e.g. http://example.com/audio1.mp3;http://example.com/audio2.wav |
 **sayText** | **kotlin.String**| Valid alphanumeric string that should be played to the In-progress call. |
 **length** | **kotlin.Int**| Time limit in seconds for audio play back | [optional]
 **direction** | **kotlin.String**| The leg of the call audio will be played to | [optional] [enum: in, out, both]
 **mix** | **kotlin.Boolean**| If false, all other audio will be muted | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="callsRecordcalls"></a>
# **callsRecordcalls**
> kotlin.String callsRecordcalls(callSid, record, direction, timeLimit, callBackUrl, fileformat)

Record Call

Start or stop recording of an in-progress voice call.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = CallApi()
val callSid : kotlin.String = callSid_example // kotlin.String | The unique identifier of each call resource
val record : kotlin.Boolean = true // kotlin.Boolean | Set true to initiate recording or false to terminate recording
val direction : kotlin.String = direction_example // kotlin.String | The leg of the call to record
val timeLimit : kotlin.Int = 56 // kotlin.Int | Time in seconds the recording duration should not exceed
val callBackUrl : kotlin.String = callBackUrl_example // kotlin.String | URL consulted after the recording completes
val fileformat : kotlin.String = fileformat_example // kotlin.String | Format of the recording file. Can be .mp3 or .wav
try {
    val result : kotlin.String = apiInstance.callsRecordcalls(callSid, record, direction, timeLimit, callBackUrl, fileformat)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CallApi#callsRecordcalls")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CallApi#callsRecordcalls")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callSid** | **kotlin.String**| The unique identifier of each call resource |
 **record** | **kotlin.Boolean**| Set true to initiate recording or false to terminate recording |
 **direction** | **kotlin.String**| The leg of the call to record | [optional] [enum: in, out, both]
 **timeLimit** | **kotlin.Int**| Time in seconds the recording duration should not exceed | [optional]
 **callBackUrl** | **kotlin.String**| URL consulted after the recording completes | [optional]
 **fileformat** | **kotlin.String**| Format of the recording file. Can be .mp3 or .wav | [optional] [enum: mp3, wav]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="callsSenddigits"></a>
# **callsSenddigits**
> kotlin.String callsSenddigits(callSid, playDtmf, playDtmfDirection)

Play DTMF

Play Dtmf and send the Digit

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = CallApi()
val callSid : kotlin.String = callSid_example // kotlin.String | The unique identifier of each call resource
val playDtmf : kotlin.String = playDtmf_example // kotlin.String | DTMF digits to play to the call. 0-9, #, *, W, or w
val playDtmfDirection : kotlin.String = playDtmfDirection_example // kotlin.String | The leg of the call DTMF digits should be sent to
try {
    val result : kotlin.String = apiInstance.callsSenddigits(callSid, playDtmf, playDtmfDirection)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CallApi#callsSenddigits")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CallApi#callsSenddigits")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callSid** | **kotlin.String**| The unique identifier of each call resource |
 **playDtmf** | **kotlin.String**| DTMF digits to play to the call. 0-9, #, *, W, or w |
 **playDtmfDirection** | **kotlin.String**| The leg of the call DTMF digits should be sent to | [optional] [enum: in, out, both]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="callsViewcalldetail"></a>
# **callsViewcalldetail**
> kotlin.String callsViewcalldetail(callSid)

View Call

Retrieve a single voice call’s information by its CallSid.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = CallApi()
val callSid : kotlin.String = callSid_example // kotlin.String | The unique identifier for the voice call.
try {
    val result : kotlin.String = apiInstance.callsViewcalldetail(callSid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CallApi#callsViewcalldetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CallApi#callsViewcalldetail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callSid** | **kotlin.String**| The unique identifier for the voice call. |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="callsViewcalls"></a>
# **callsViewcalls**
> kotlin.String callsViewcalls(callsid)

View Call

Retrieve a single voice call’s information by its CallSid.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = CallApi()
val callsid : kotlin.String = callsid_example // kotlin.String | The unique identifier for the voice call.
try {
    val result : kotlin.String = apiInstance.callsViewcalls(callsid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CallApi#callsViewcalls")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CallApi#callsViewcalls")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callsid** | **kotlin.String**| The unique identifier for the voice call. |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="callsVoiceeffect"></a>
# **callsVoiceeffect**
> kotlin.String callsVoiceeffect(callSid, audioDirection, pitchSemiTones, pitchOctaves, pitch, rate, tempo)

Voice Effect

Add audio voice effects to the an in-progress voice call.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = CallApi()
val callSid : kotlin.String = callSid_example // kotlin.String | The unique identifier for the in-progress voice call.
val audioDirection : kotlin.String = audioDirection_example // kotlin.String | The direction the audio effect should be placed on. If IN, the effects will occur on the incoming audio stream. If OUT, the effects will occur on the outgoing audio stream.
val pitchSemiTones : kotlin.Double = 1.2 // kotlin.Double | Set the pitch in semitone (half-step) intervals. Value between -14 and 14
val pitchOctaves : kotlin.Double = 1.2 // kotlin.Double | Set the pitch in octave intervals.. Value between -1 and 1
val pitch : kotlin.Double = 1.2 // kotlin.Double | Set the pitch (lowness/highness) of the audio. The higher the value, the higher the pitch. Value greater than 0
val rate : kotlin.Double = 1.2 // kotlin.Double | Set the rate for audio. The lower the value, the lower the rate. value greater than 0
val tempo : kotlin.Double = 1.2 // kotlin.Double | Set the tempo (speed) of the audio. A higher value denotes a faster tempo. Value greater than 0
try {
    val result : kotlin.String = apiInstance.callsVoiceeffect(callSid, audioDirection, pitchSemiTones, pitchOctaves, pitch, rate, tempo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CallApi#callsVoiceeffect")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CallApi#callsVoiceeffect")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callSid** | **kotlin.String**| The unique identifier for the in-progress voice call. |
 **audioDirection** | **kotlin.String**| The direction the audio effect should be placed on. If IN, the effects will occur on the incoming audio stream. If OUT, the effects will occur on the outgoing audio stream. | [optional] [enum: in, out]
 **pitchSemiTones** | **kotlin.Double**| Set the pitch in semitone (half-step) intervals. Value between -14 and 14 | [optional]
 **pitchOctaves** | **kotlin.Double**| Set the pitch in octave intervals.. Value between -1 and 1 | [optional]
 **pitch** | **kotlin.Double**| Set the pitch (lowness/highness) of the audio. The higher the value, the higher the pitch. Value greater than 0 | [optional]
 **rate** | **kotlin.Double**| Set the rate for audio. The lower the value, the lower the rate. value greater than 0 | [optional]
 **tempo** | **kotlin.Double**| Set the tempo (speed) of the audio. A higher value denotes a faster tempo. Value greater than 0 | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

