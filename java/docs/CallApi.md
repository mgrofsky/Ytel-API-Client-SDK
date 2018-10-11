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
> String callsGroupcall(from, to, url, groupConfirmKey, groupConfirmFile, method, statusCallBackUrl, statusCallBackMethod, fallBackUrl, fallBackMethod, heartBeatUrl, heartBeatMethod, timeout, playDtmf, hideCallerId, record, recordCallBackUrl, recordCallBackMethod, transcribe, transcribeCallBackUrl)

Group Call

Group Call

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

CallApi apiInstance = new CallApi();
String from = "from_example"; // String | This number to display on Caller ID as calling
String to = "to_example"; // String | Please enter multiple E164 number. You can add max 10 numbers. Add numbers separated with comma. e.g : 1111111111,2222222222
String url = "url_example"; // String | URL requested once the call connects
String groupConfirmKey = "groupConfirmKey_example"; // String | Define the DTMF that the called party should send to bridge the call. Allowed Values : 0-9, #, *
String groupConfirmFile = "groupConfirmFile_example"; // String | Specify the audio file you want to play when the called party picks up the call
String method = "method_example"; // String | Specifies the HTTP method used to request the required URL once call connects.
String statusCallBackUrl = "statusCallBackUrl_example"; // String | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
String statusCallBackMethod = "statusCallBackMethod_example"; // String | Specifies the HTTP methodlinkclass used to request StatusCallbackUrl.
String fallBackUrl = "fallBackUrl_example"; // String | URL requested if the initial Url parameter fails or encounters an error
String fallBackMethod = "fallBackMethod_example"; // String | Specifies the HTTP method used to request the required FallbackUrl once call connects.
String heartBeatUrl = "heartBeatUrl_example"; // String | URL that can be requested every 60 seconds during the call to notify of elapsed time and pass other general information.
String heartBeatMethod = "heartBeatMethod_example"; // String | Specifies the HTTP method used to request HeartbeatUrl.
Integer timeout = 56; // Integer | Time (in seconds) we should wait while the call is ringing before canceling the call
String playDtmf = "playDtmf_example"; // String | DTMF Digits to play to the call once it connects. 0-9, #, or *
String hideCallerId = "hideCallerId_example"; // String | Specifies if the caller id will be hidden
Boolean record = true; // Boolean | Specifies if the call should be recorded
String recordCallBackUrl = "recordCallBackUrl_example"; // String | Recording parameters will be sent here upon completion
String recordCallBackMethod = "recordCallBackMethod_example"; // String | Method used to request the RecordCallback URL.
Boolean transcribe = true; // Boolean | Specifies if the call recording should be transcribed
String transcribeCallBackUrl = "transcribeCallBackUrl_example"; // String | Transcription parameters will be sent here upon completion
try {
    String result = apiInstance.callsGroupcall(from, to, url, groupConfirmKey, groupConfirmFile, method, statusCallBackUrl, statusCallBackMethod, fallBackUrl, fallBackMethod, heartBeatUrl, heartBeatMethod, timeout, playDtmf, hideCallerId, record, recordCallBackUrl, recordCallBackMethod, transcribe, transcribeCallBackUrl);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallApi#callsGroupcall");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **String**| This number to display on Caller ID as calling |
 **to** | **String**| Please enter multiple E164 number. You can add max 10 numbers. Add numbers separated with comma. e.g : 1111111111,2222222222 |
 **url** | **String**| URL requested once the call connects |
 **groupConfirmKey** | **String**| Define the DTMF that the called party should send to bridge the call. Allowed Values : 0-9, #, * |
 **groupConfirmFile** | **String**| Specify the audio file you want to play when the called party picks up the call | [enum: mp3, wav]
 **method** | **String**| Specifies the HTTP method used to request the required URL once call connects. | [optional]
 **statusCallBackUrl** | **String**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. | [optional]
 **statusCallBackMethod** | **String**| Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. | [optional]
 **fallBackUrl** | **String**| URL requested if the initial Url parameter fails or encounters an error | [optional]
 **fallBackMethod** | **String**| Specifies the HTTP method used to request the required FallbackUrl once call connects. | [optional]
 **heartBeatUrl** | **String**| URL that can be requested every 60 seconds during the call to notify of elapsed time and pass other general information. | [optional]
 **heartBeatMethod** | **String**| Specifies the HTTP method used to request HeartbeatUrl. | [optional]
 **timeout** | **Integer**| Time (in seconds) we should wait while the call is ringing before canceling the call | [optional]
 **playDtmf** | **String**| DTMF Digits to play to the call once it connects. 0-9, #, or * | [optional]
 **hideCallerId** | **String**| Specifies if the caller id will be hidden | [optional]
 **record** | **Boolean**| Specifies if the call should be recorded | [optional]
 **recordCallBackUrl** | **String**| Recording parameters will be sent here upon completion | [optional]
 **recordCallBackMethod** | **String**| Method used to request the RecordCallback URL. | [optional]
 **transcribe** | **Boolean**| Specifies if the call recording should be transcribed | [optional]
 **transcribeCallBackUrl** | **String**| Transcription parameters will be sent here upon completion | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="callsInterruptcalls"></a>
# **callsInterruptcalls**
> String callsInterruptcalls(callSid, url, method, status)

Interrupt Call

Interrupt the Call by Call Sid

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

CallApi apiInstance = new CallApi();
String callSid = "callSid_example"; // String | The unique identifier for voice call that is in progress.
String url = "url_example"; // String | URL the in-progress call will be redirected to
String method = "method_example"; // String | The method used to request the above Url parameter
String status = "status_example"; // String | Status to set the in-progress call to
try {
    String result = apiInstance.callsInterruptcalls(callSid, url, method, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallApi#callsInterruptcalls");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callSid** | **String**| The unique identifier for voice call that is in progress. |
 **url** | **String**| URL the in-progress call will be redirected to | [optional]
 **method** | **String**| The method used to request the above Url parameter | [optional]
 **status** | **String**| Status to set the in-progress call to | [optional] [enum: canceled, completed]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="callsListcalls"></a>
# **callsListcalls**
> String callsListcalls(page, pageSize, to, from, dateCreated)

List Calls

A list of calls associated with your Ytel account

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

CallApi apiInstance = new CallApi();
Integer page = 1; // Integer | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
Integer pageSize = 10; // Integer | Number of individual resources listed in the response per page
String to = "to_example"; // String | Filter calls that were sent to this 10-digit number (E.164 format).
String from = "from_example"; // String | Filter calls that were sent from this 10-digit number (E.164 format).
String dateCreated = "dateCreated_example"; // String | Return calls that are from a specified date.
try {
    String result = apiInstance.callsListcalls(page, pageSize, to, from, dateCreated);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallApi#callsListcalls");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pageSize** | **Integer**| Number of individual resources listed in the response per page | [optional] [default to 10]
 **to** | **String**| Filter calls that were sent to this 10-digit number (E.164 format). | [optional]
 **from** | **String**| Filter calls that were sent from this 10-digit number (E.164 format). | [optional]
 **dateCreated** | **String**| Return calls that are from a specified date. | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="callsMakecall"></a>
# **callsMakecall**
> String callsMakecall(from, to, url, method, statusCallBackUrl, statusCallBackMethod, fallBackUrl, fallBackMethod, heartBeatUrl, heartBeatMethod, timeout, playDtmf, hideCallerId, record, recordCallBackUrl, recordCallBackMethod, transcribe, transcribeCallBackUrl, ifMachine, ifMachineUrl, ifMachineMethod, feedback, surveyId)

Make Call

You can experiment with initiating a call through Ytel and view the request response generated when doing so and get the response in json

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

CallApi apiInstance = new CallApi();
String from = "from_example"; // String | A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call.
String to = "to_example"; // String | To number
String url = "url_example"; // String | URL requested once the call connects
String method = "method_example"; // String | Specifies the HTTP method used to request the required URL once call connects.
String statusCallBackUrl = "statusCallBackUrl_example"; // String | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
String statusCallBackMethod = "statusCallBackMethod_example"; // String | Specifies the HTTP methodlinkclass used to request StatusCallbackUrl.
String fallBackUrl = "fallBackUrl_example"; // String | URL requested if the initial Url parameter fails or encounters an error
String fallBackMethod = "fallBackMethod_example"; // String | Specifies the HTTP method used to request the required FallbackUrl once call connects.
String heartBeatUrl = "heartBeatUrl_example"; // String | URL that can be requested every 60 seconds during the call to notify of elapsed tim
String heartBeatMethod = "heartBeatMethod_example"; // String | Specifies the HTTP method used to request HeartbeatUrl.
Integer timeout = 56; // Integer | Time (in seconds) Ytel should wait while the call is ringing before canceling the call
String playDtmf = "playDtmf_example"; // String | DTMF Digits to play to the call once it connects. 0-9, #, or *
Boolean hideCallerId = true; // Boolean | Specifies if the caller id will be hidden
Boolean record = true; // Boolean | Specifies if the call should be recorded
String recordCallBackUrl = "recordCallBackUrl_example"; // String | Recording parameters will be sent here upon completion
String recordCallBackMethod = "recordCallBackMethod_example"; // String | Method used to request the RecordCallback URL.
Boolean transcribe = true; // Boolean | Specifies if the call recording should be transcribed
String transcribeCallBackUrl = "transcribeCallBackUrl_example"; // String | Transcription parameters will be sent here upon completion
String ifMachine = "ifMachine_example"; // String | How Ytel should handle the receiving numbers voicemail machine
String ifMachineUrl = "ifMachineUrl_example"; // String | URL requested when IfMachine=continue
String ifMachineMethod = "ifMachineMethod_example"; // String | Method used to request the IfMachineUrl.
Boolean feedback = true; // Boolean | Specify if survey should be enable or not
String surveyId = "surveyId_example"; // String | The unique identifier for the survey.
try {
    String result = apiInstance.callsMakecall(from, to, url, method, statusCallBackUrl, statusCallBackMethod, fallBackUrl, fallBackMethod, heartBeatUrl, heartBeatMethod, timeout, playDtmf, hideCallerId, record, recordCallBackUrl, recordCallBackMethod, transcribe, transcribeCallBackUrl, ifMachine, ifMachineUrl, ifMachineMethod, feedback, surveyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallApi#callsMakecall");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **String**| A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call. |
 **to** | **String**| To number |
 **url** | **String**| URL requested once the call connects |
 **method** | **String**| Specifies the HTTP method used to request the required URL once call connects. | [optional]
 **statusCallBackUrl** | **String**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. | [optional]
 **statusCallBackMethod** | **String**| Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. | [optional]
 **fallBackUrl** | **String**| URL requested if the initial Url parameter fails or encounters an error | [optional]
 **fallBackMethod** | **String**| Specifies the HTTP method used to request the required FallbackUrl once call connects. | [optional]
 **heartBeatUrl** | **String**| URL that can be requested every 60 seconds during the call to notify of elapsed tim | [optional]
 **heartBeatMethod** | **String**| Specifies the HTTP method used to request HeartbeatUrl. | [optional]
 **timeout** | **Integer**| Time (in seconds) Ytel should wait while the call is ringing before canceling the call | [optional]
 **playDtmf** | **String**| DTMF Digits to play to the call once it connects. 0-9, #, or * | [optional]
 **hideCallerId** | **Boolean**| Specifies if the caller id will be hidden | [optional]
 **record** | **Boolean**| Specifies if the call should be recorded | [optional]
 **recordCallBackUrl** | **String**| Recording parameters will be sent here upon completion | [optional]
 **recordCallBackMethod** | **String**| Method used to request the RecordCallback URL. | [optional]
 **transcribe** | **Boolean**| Specifies if the call recording should be transcribed | [optional]
 **transcribeCallBackUrl** | **String**| Transcription parameters will be sent here upon completion | [optional]
 **ifMachine** | **String**| How Ytel should handle the receiving numbers voicemail machine | [optional] [enum: continue, hangup]
 **ifMachineUrl** | **String**| URL requested when IfMachine&#x3D;continue | [optional]
 **ifMachineMethod** | **String**| Method used to request the IfMachineUrl. | [optional]
 **feedback** | **Boolean**| Specify if survey should be enable or not | [optional]
 **surveyId** | **String**| The unique identifier for the survey. | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="callsMakervm"></a>
# **callsMakervm**
> String callsMakervm(from, rvMCallerId, to, voiceMailURL, method, statusCallBackUrl, statsCallBackMethod)

Send RVM

Initiate an outbound Ringless Voicemail through Ytel.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

CallApi apiInstance = new CallApi();
String from = "from_example"; // String | A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call.
String rvMCallerId = "rvMCallerId_example"; // String | A required secondary Caller ID for RVM to work.
String to = "to_example"; // String | A valid number (E.164 format) that will receive the phone call.
String voiceMailURL = "voiceMailURL_example"; // String | The URL requested once the RVM connects. A set of default parameters will be sent here.
String method = "GET"; // String | Specifies the HTTP method used to request the required URL once call connects.
String statusCallBackUrl = "statusCallBackUrl_example"; // String | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
String statsCallBackMethod = "statsCallBackMethod_example"; // String | Specifies the HTTP method used to request the required StatusCallBackUrl once call connects.
try {
    String result = apiInstance.callsMakervm(from, rvMCallerId, to, voiceMailURL, method, statusCallBackUrl, statsCallBackMethod);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallApi#callsMakervm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **String**| A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call. |
 **rvMCallerId** | **String**| A required secondary Caller ID for RVM to work. |
 **to** | **String**| A valid number (E.164 format) that will receive the phone call. |
 **voiceMailURL** | **String**| The URL requested once the RVM connects. A set of default parameters will be sent here. |
 **method** | **String**| Specifies the HTTP method used to request the required URL once call connects. | [optional] [default to GET]
 **statusCallBackUrl** | **String**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. | [optional]
 **statsCallBackMethod** | **String**| Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="callsPlayaudios"></a>
# **callsPlayaudios**
> String callsPlayaudios(callSid, audioUrl, sayText, length, direction, mix)

Play Audio

Play Audio from a url

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

CallApi apiInstance = new CallApi();
String callSid = "callSid_example"; // String | The unique identifier of each call resource
String audioUrl = "audioUrl_example"; // String | URL to sound that should be played. You also can add more than one audio file using semicolons e.g. http://example.com/audio1.mp3;http://example.com/audio2.wav
String sayText = "sayText_example"; // String | Valid alphanumeric string that should be played to the In-progress call.
Integer length = 56; // Integer | Time limit in seconds for audio play back
String direction = "direction_example"; // String | The leg of the call audio will be played to
Boolean mix = true; // Boolean | If false, all other audio will be muted
try {
    String result = apiInstance.callsPlayaudios(callSid, audioUrl, sayText, length, direction, mix);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallApi#callsPlayaudios");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callSid** | **String**| The unique identifier of each call resource |
 **audioUrl** | **String**| URL to sound that should be played. You also can add more than one audio file using semicolons e.g. http://example.com/audio1.mp3;http://example.com/audio2.wav |
 **sayText** | **String**| Valid alphanumeric string that should be played to the In-progress call. |
 **length** | **Integer**| Time limit in seconds for audio play back | [optional]
 **direction** | **String**| The leg of the call audio will be played to | [optional] [enum: in, out, both]
 **mix** | **Boolean**| If false, all other audio will be muted | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="callsRecordcalls"></a>
# **callsRecordcalls**
> String callsRecordcalls(callSid, record, direction, timeLimit, callBackUrl, fileformat)

Record Call

Start or stop recording of an in-progress voice call.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

CallApi apiInstance = new CallApi();
String callSid = "callSid_example"; // String | The unique identifier of each call resource
Boolean record = true; // Boolean | Set true to initiate recording or false to terminate recording
String direction = "direction_example"; // String | The leg of the call to record
Integer timeLimit = 56; // Integer | Time in seconds the recording duration should not exceed
String callBackUrl = "callBackUrl_example"; // String | URL consulted after the recording completes
String fileformat = "fileformat_example"; // String | Format of the recording file. Can be .mp3 or .wav
try {
    String result = apiInstance.callsRecordcalls(callSid, record, direction, timeLimit, callBackUrl, fileformat);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallApi#callsRecordcalls");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callSid** | **String**| The unique identifier of each call resource |
 **record** | **Boolean**| Set true to initiate recording or false to terminate recording |
 **direction** | **String**| The leg of the call to record | [optional] [enum: in, out, both]
 **timeLimit** | **Integer**| Time in seconds the recording duration should not exceed | [optional]
 **callBackUrl** | **String**| URL consulted after the recording completes | [optional]
 **fileformat** | **String**| Format of the recording file. Can be .mp3 or .wav | [optional] [enum: mp3, wav]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="callsSenddigits"></a>
# **callsSenddigits**
> String callsSenddigits(callSid, playDtmf, playDtmfDirection)

Play DTMF

Play Dtmf and send the Digit

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

CallApi apiInstance = new CallApi();
String callSid = "callSid_example"; // String | The unique identifier of each call resource
String playDtmf = "playDtmf_example"; // String | DTMF digits to play to the call. 0-9, #, *, W, or w
String playDtmfDirection = "playDtmfDirection_example"; // String | The leg of the call DTMF digits should be sent to
try {
    String result = apiInstance.callsSenddigits(callSid, playDtmf, playDtmfDirection);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallApi#callsSenddigits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callSid** | **String**| The unique identifier of each call resource |
 **playDtmf** | **String**| DTMF digits to play to the call. 0-9, #, *, W, or w |
 **playDtmfDirection** | **String**| The leg of the call DTMF digits should be sent to | [optional] [enum: in, out, both]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="callsViewcalldetail"></a>
# **callsViewcalldetail**
> String callsViewcalldetail(callSid)

View Call

Retrieve a single voice call’s information by its CallSid.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

CallApi apiInstance = new CallApi();
String callSid = "callSid_example"; // String | The unique identifier for the voice call.
try {
    String result = apiInstance.callsViewcalldetail(callSid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallApi#callsViewcalldetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callSid** | **String**| The unique identifier for the voice call. |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="callsViewcalls"></a>
# **callsViewcalls**
> String callsViewcalls(callsid)

View Call

Retrieve a single voice call’s information by its CallSid.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

CallApi apiInstance = new CallApi();
String callsid = "callsid_example"; // String | The unique identifier for the voice call.
try {
    String result = apiInstance.callsViewcalls(callsid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallApi#callsViewcalls");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callsid** | **String**| The unique identifier for the voice call. |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="callsVoiceeffect"></a>
# **callsVoiceeffect**
> String callsVoiceeffect(callSid, audioDirection, pitchSemiTones, pitchOctaves, pitch, rate, tempo)

Voice Effect

Add audio voice effects to the an in-progress voice call.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CallApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

CallApi apiInstance = new CallApi();
String callSid = "callSid_example"; // String | The unique identifier for the in-progress voice call.
String audioDirection = "audioDirection_example"; // String | The direction the audio effect should be placed on. If IN, the effects will occur on the incoming audio stream. If OUT, the effects will occur on the outgoing audio stream.
Double pitchSemiTones = 3.4D; // Double | Set the pitch in semitone (half-step) intervals. Value between -14 and 14
Double pitchOctaves = 3.4D; // Double | Set the pitch in octave intervals.. Value between -1 and 1
Double pitch = 3.4D; // Double | Set the pitch (lowness/highness) of the audio. The higher the value, the higher the pitch. Value greater than 0
Double rate = 3.4D; // Double | Set the rate for audio. The lower the value, the lower the rate. value greater than 0
Double tempo = 3.4D; // Double | Set the tempo (speed) of the audio. A higher value denotes a faster tempo. Value greater than 0
try {
    String result = apiInstance.callsVoiceeffect(callSid, audioDirection, pitchSemiTones, pitchOctaves, pitch, rate, tempo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallApi#callsVoiceeffect");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callSid** | **String**| The unique identifier for the in-progress voice call. |
 **audioDirection** | **String**| The direction the audio effect should be placed on. If IN, the effects will occur on the incoming audio stream. If OUT, the effects will occur on the outgoing audio stream. | [optional] [enum: in, out]
 **pitchSemiTones** | **Double**| Set the pitch in semitone (half-step) intervals. Value between -14 and 14 | [optional]
 **pitchOctaves** | **Double**| Set the pitch in octave intervals.. Value between -1 and 1 | [optional]
 **pitch** | **Double**| Set the pitch (lowness/highness) of the audio. The higher the value, the higher the pitch. Value greater than 0 | [optional]
 **rate** | **Double**| Set the rate for audio. The lower the value, the lower the rate. value greater than 0 | [optional]
 **tempo** | **Double**| Set the tempo (speed) of the audio. A higher value denotes a faster tempo. Value greater than 0 | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

