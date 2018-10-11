# IO.Swagger.Api.CallApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CallsGroupcall**](CallApi.md#callsgroupcall) | **POST** /calls/groupcall.json | Group Call
[**CallsInterruptcalls**](CallApi.md#callsinterruptcalls) | **POST** /calls/interruptcalls.json | Interrupt Call
[**CallsListcalls**](CallApi.md#callslistcalls) | **POST** /calls/listcalls.json | List Calls
[**CallsMakecall**](CallApi.md#callsmakecall) | **POST** /calls/makecall.json | Make Call
[**CallsMakervm**](CallApi.md#callsmakervm) | **POST** /calls/makervm.json | Send RVM
[**CallsPlayaudios**](CallApi.md#callsplayaudios) | **POST** /calls/playaudios.json | Play Audio
[**CallsRecordcalls**](CallApi.md#callsrecordcalls) | **POST** /calls/recordcalls.json | Record Call
[**CallsSenddigits**](CallApi.md#callssenddigits) | **POST** /calls/senddigits.json | Play DTMF
[**CallsViewcalldetail**](CallApi.md#callsviewcalldetail) | **POST** /calls/viewcalldetail.json | View Call
[**CallsViewcalls**](CallApi.md#callsviewcalls) | **POST** /calls/viewcalls.json | View Call
[**CallsVoiceeffect**](CallApi.md#callsvoiceeffect) | **POST** /calls/voiceeffect.json | Voice Effect


<a name="callsgroupcall"></a>
# **CallsGroupcall**
> string CallsGroupcall (string from, string to, string url, string groupConfirmKey, string groupConfirmFile, string method = null, string statusCallBackUrl = null, string statusCallBackMethod = null, string fallBackUrl = null, string fallBackMethod = null, string heartBeatUrl = null, string heartBeatMethod = null, int? timeout = null, string playDtmf = null, string hideCallerId = null, bool? record = null, string recordCallBackUrl = null, string recordCallBackMethod = null, bool? transcribe = null, string transcribeCallBackUrl = null)

Group Call

Group Call

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CallsGroupcallExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new CallApi();
            var from = from_example;  // string | This number to display on Caller ID as calling
            var to = to_example;  // string | Please enter multiple E164 number. You can add max 10 numbers. Add numbers separated with comma. e.g : 1111111111,2222222222
            var url = url_example;  // string | URL requested once the call connects
            var groupConfirmKey = groupConfirmKey_example;  // string | Define the DTMF that the called party should send to bridge the call. Allowed Values : 0-9, #, *
            var groupConfirmFile = groupConfirmFile_example;  // string | Specify the audio file you want to play when the called party picks up the call
            var method = method_example;  // string | Specifies the HTTP method used to request the required URL once call connects. (optional) 
            var statusCallBackUrl = statusCallBackUrl_example;  // string | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. (optional) 
            var statusCallBackMethod = statusCallBackMethod_example;  // string | Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. (optional) 
            var fallBackUrl = fallBackUrl_example;  // string | URL requested if the initial Url parameter fails or encounters an error (optional) 
            var fallBackMethod = fallBackMethod_example;  // string | Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional) 
            var heartBeatUrl = heartBeatUrl_example;  // string | URL that can be requested every 60 seconds during the call to notify of elapsed time and pass other general information. (optional) 
            var heartBeatMethod = heartBeatMethod_example;  // string | Specifies the HTTP method used to request HeartbeatUrl. (optional) 
            var timeout = 56;  // int? | Time (in seconds) we should wait while the call is ringing before canceling the call (optional) 
            var playDtmf = playDtmf_example;  // string | DTMF Digits to play to the call once it connects. 0-9, #, or * (optional) 
            var hideCallerId = hideCallerId_example;  // string | Specifies if the caller id will be hidden (optional) 
            var record = true;  // bool? | Specifies if the call should be recorded (optional) 
            var recordCallBackUrl = recordCallBackUrl_example;  // string | Recording parameters will be sent here upon completion (optional) 
            var recordCallBackMethod = recordCallBackMethod_example;  // string | Method used to request the RecordCallback URL. (optional) 
            var transcribe = true;  // bool? | Specifies if the call recording should be transcribed (optional) 
            var transcribeCallBackUrl = transcribeCallBackUrl_example;  // string | Transcription parameters will be sent here upon completion (optional) 

            try
            {
                // Group Call
                string result = apiInstance.CallsGroupcall(from, to, url, groupConfirmKey, groupConfirmFile, method, statusCallBackUrl, statusCallBackMethod, fallBackUrl, fallBackMethod, heartBeatUrl, heartBeatMethod, timeout, playDtmf, hideCallerId, record, recordCallBackUrl, recordCallBackMethod, transcribe, transcribeCallBackUrl);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CallApi.CallsGroupcall: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **string**| This number to display on Caller ID as calling | 
 **to** | **string**| Please enter multiple E164 number. You can add max 10 numbers. Add numbers separated with comma. e.g : 1111111111,2222222222 | 
 **url** | **string**| URL requested once the call connects | 
 **groupConfirmKey** | **string**| Define the DTMF that the called party should send to bridge the call. Allowed Values : 0-9, #, * | 
 **groupConfirmFile** | **string**| Specify the audio file you want to play when the called party picks up the call | 
 **method** | **string**| Specifies the HTTP method used to request the required URL once call connects. | [optional] 
 **statusCallBackUrl** | **string**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. | [optional] 
 **statusCallBackMethod** | **string**| Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. | [optional] 
 **fallBackUrl** | **string**| URL requested if the initial Url parameter fails or encounters an error | [optional] 
 **fallBackMethod** | **string**| Specifies the HTTP method used to request the required FallbackUrl once call connects. | [optional] 
 **heartBeatUrl** | **string**| URL that can be requested every 60 seconds during the call to notify of elapsed time and pass other general information. | [optional] 
 **heartBeatMethod** | **string**| Specifies the HTTP method used to request HeartbeatUrl. | [optional] 
 **timeout** | **int?**| Time (in seconds) we should wait while the call is ringing before canceling the call | [optional] 
 **playDtmf** | **string**| DTMF Digits to play to the call once it connects. 0-9, #, or * | [optional] 
 **hideCallerId** | **string**| Specifies if the caller id will be hidden | [optional] 
 **record** | **bool?**| Specifies if the call should be recorded | [optional] 
 **recordCallBackUrl** | **string**| Recording parameters will be sent here upon completion | [optional] 
 **recordCallBackMethod** | **string**| Method used to request the RecordCallback URL. | [optional] 
 **transcribe** | **bool?**| Specifies if the call recording should be transcribed | [optional] 
 **transcribeCallBackUrl** | **string**| Transcription parameters will be sent here upon completion | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="callsinterruptcalls"></a>
# **CallsInterruptcalls**
> string CallsInterruptcalls (string callSid, string url = null, string method = null, string status = null)

Interrupt Call

Interrupt the Call by Call Sid

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CallsInterruptcallsExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new CallApi();
            var callSid = callSid_example;  // string | The unique identifier for voice call that is in progress.
            var url = url_example;  // string | URL the in-progress call will be redirected to (optional) 
            var method = method_example;  // string | The method used to request the above Url parameter (optional) 
            var status = status_example;  // string | Status to set the in-progress call to (optional) 

            try
            {
                // Interrupt Call
                string result = apiInstance.CallsInterruptcalls(callSid, url, method, status);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CallApi.CallsInterruptcalls: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callSid** | **string**| The unique identifier for voice call that is in progress. | 
 **url** | **string**| URL the in-progress call will be redirected to | [optional] 
 **method** | **string**| The method used to request the above Url parameter | [optional] 
 **status** | **string**| Status to set the in-progress call to | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="callslistcalls"></a>
# **CallsListcalls**
> string CallsListcalls (int? page = null, int? pageSize = null, string to = null, string from = null, string dateCreated = null)

List Calls

A list of calls associated with your Ytel account

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CallsListcallsExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new CallApi();
            var page = 56;  // int? | The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional)  (default to 1)
            var pageSize = 56;  // int? | Number of individual resources listed in the response per page (optional)  (default to 10)
            var to = to_example;  // string | Filter calls that were sent to this 10-digit number (E.164 format). (optional) 
            var from = from_example;  // string | Filter calls that were sent from this 10-digit number (E.164 format). (optional) 
            var dateCreated = dateCreated_example;  // string | Return calls that are from a specified date. (optional) 

            try
            {
                // List Calls
                string result = apiInstance.CallsListcalls(page, pageSize, to, from, dateCreated);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CallApi.CallsListcalls: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int?**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pageSize** | **int?**| Number of individual resources listed in the response per page | [optional] [default to 10]
 **to** | **string**| Filter calls that were sent to this 10-digit number (E.164 format). | [optional] 
 **from** | **string**| Filter calls that were sent from this 10-digit number (E.164 format). | [optional] 
 **dateCreated** | **string**| Return calls that are from a specified date. | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="callsmakecall"></a>
# **CallsMakecall**
> string CallsMakecall (string from, string to, string url, string method = null, string statusCallBackUrl = null, string statusCallBackMethod = null, string fallBackUrl = null, string fallBackMethod = null, string heartBeatUrl = null, string heartBeatMethod = null, int? timeout = null, string playDtmf = null, bool? hideCallerId = null, bool? record = null, string recordCallBackUrl = null, string recordCallBackMethod = null, bool? transcribe = null, string transcribeCallBackUrl = null, string ifMachine = null, string ifMachineUrl = null, string ifMachineMethod = null, bool? feedback = null, string surveyId = null)

Make Call

You can experiment with initiating a call through Ytel and view the request response generated when doing so and get the response in json

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CallsMakecallExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new CallApi();
            var from = from_example;  // string | A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call.
            var to = to_example;  // string | To number
            var url = url_example;  // string | URL requested once the call connects
            var method = method_example;  // string | Specifies the HTTP method used to request the required URL once call connects. (optional) 
            var statusCallBackUrl = statusCallBackUrl_example;  // string | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. (optional) 
            var statusCallBackMethod = statusCallBackMethod_example;  // string | Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. (optional) 
            var fallBackUrl = fallBackUrl_example;  // string | URL requested if the initial Url parameter fails or encounters an error (optional) 
            var fallBackMethod = fallBackMethod_example;  // string | Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional) 
            var heartBeatUrl = heartBeatUrl_example;  // string | URL that can be requested every 60 seconds during the call to notify of elapsed tim (optional) 
            var heartBeatMethod = heartBeatMethod_example;  // string | Specifies the HTTP method used to request HeartbeatUrl. (optional) 
            var timeout = 56;  // int? | Time (in seconds) Ytel should wait while the call is ringing before canceling the call (optional) 
            var playDtmf = playDtmf_example;  // string | DTMF Digits to play to the call once it connects. 0-9, #, or * (optional) 
            var hideCallerId = true;  // bool? | Specifies if the caller id will be hidden (optional) 
            var record = true;  // bool? | Specifies if the call should be recorded (optional) 
            var recordCallBackUrl = recordCallBackUrl_example;  // string | Recording parameters will be sent here upon completion (optional) 
            var recordCallBackMethod = recordCallBackMethod_example;  // string | Method used to request the RecordCallback URL. (optional) 
            var transcribe = true;  // bool? | Specifies if the call recording should be transcribed (optional) 
            var transcribeCallBackUrl = transcribeCallBackUrl_example;  // string | Transcription parameters will be sent here upon completion (optional) 
            var ifMachine = ifMachine_example;  // string | How Ytel should handle the receiving numbers voicemail machine (optional) 
            var ifMachineUrl = ifMachineUrl_example;  // string | URL requested when IfMachine=continue (optional) 
            var ifMachineMethod = ifMachineMethod_example;  // string | Method used to request the IfMachineUrl. (optional) 
            var feedback = true;  // bool? | Specify if survey should be enable or not (optional) 
            var surveyId = surveyId_example;  // string | The unique identifier for the survey. (optional) 

            try
            {
                // Make Call
                string result = apiInstance.CallsMakecall(from, to, url, method, statusCallBackUrl, statusCallBackMethod, fallBackUrl, fallBackMethod, heartBeatUrl, heartBeatMethod, timeout, playDtmf, hideCallerId, record, recordCallBackUrl, recordCallBackMethod, transcribe, transcribeCallBackUrl, ifMachine, ifMachineUrl, ifMachineMethod, feedback, surveyId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CallApi.CallsMakecall: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **string**| A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call. | 
 **to** | **string**| To number | 
 **url** | **string**| URL requested once the call connects | 
 **method** | **string**| Specifies the HTTP method used to request the required URL once call connects. | [optional] 
 **statusCallBackUrl** | **string**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. | [optional] 
 **statusCallBackMethod** | **string**| Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. | [optional] 
 **fallBackUrl** | **string**| URL requested if the initial Url parameter fails or encounters an error | [optional] 
 **fallBackMethod** | **string**| Specifies the HTTP method used to request the required FallbackUrl once call connects. | [optional] 
 **heartBeatUrl** | **string**| URL that can be requested every 60 seconds during the call to notify of elapsed tim | [optional] 
 **heartBeatMethod** | **string**| Specifies the HTTP method used to request HeartbeatUrl. | [optional] 
 **timeout** | **int?**| Time (in seconds) Ytel should wait while the call is ringing before canceling the call | [optional] 
 **playDtmf** | **string**| DTMF Digits to play to the call once it connects. 0-9, #, or * | [optional] 
 **hideCallerId** | **bool?**| Specifies if the caller id will be hidden | [optional] 
 **record** | **bool?**| Specifies if the call should be recorded | [optional] 
 **recordCallBackUrl** | **string**| Recording parameters will be sent here upon completion | [optional] 
 **recordCallBackMethod** | **string**| Method used to request the RecordCallback URL. | [optional] 
 **transcribe** | **bool?**| Specifies if the call recording should be transcribed | [optional] 
 **transcribeCallBackUrl** | **string**| Transcription parameters will be sent here upon completion | [optional] 
 **ifMachine** | **string**| How Ytel should handle the receiving numbers voicemail machine | [optional] 
 **ifMachineUrl** | **string**| URL requested when IfMachine&#x3D;continue | [optional] 
 **ifMachineMethod** | **string**| Method used to request the IfMachineUrl. | [optional] 
 **feedback** | **bool?**| Specify if survey should be enable or not | [optional] 
 **surveyId** | **string**| The unique identifier for the survey. | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="callsmakervm"></a>
# **CallsMakervm**
> string CallsMakervm (string from, string rVMCallerId, string to, string voiceMailURL, string method = null, string statusCallBackUrl = null, string statsCallBackMethod = null)

Send RVM

Initiate an outbound Ringless Voicemail through Ytel.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CallsMakervmExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new CallApi();
            var from = from_example;  // string | A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call.
            var rVMCallerId = rVMCallerId_example;  // string | A required secondary Caller ID for RVM to work.
            var to = to_example;  // string | A valid number (E.164 format) that will receive the phone call.
            var voiceMailURL = voiceMailURL_example;  // string | The URL requested once the RVM connects. A set of default parameters will be sent here.
            var method = method_example;  // string | Specifies the HTTP method used to request the required URL once call connects. (optional)  (default to GET)
            var statusCallBackUrl = statusCallBackUrl_example;  // string | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. (optional) 
            var statsCallBackMethod = statsCallBackMethod_example;  // string | Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. (optional) 

            try
            {
                // Send RVM
                string result = apiInstance.CallsMakervm(from, rVMCallerId, to, voiceMailURL, method, statusCallBackUrl, statsCallBackMethod);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CallApi.CallsMakervm: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **string**| A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call. | 
 **rVMCallerId** | **string**| A required secondary Caller ID for RVM to work. | 
 **to** | **string**| A valid number (E.164 format) that will receive the phone call. | 
 **voiceMailURL** | **string**| The URL requested once the RVM connects. A set of default parameters will be sent here. | 
 **method** | **string**| Specifies the HTTP method used to request the required URL once call connects. | [optional] [default to GET]
 **statusCallBackUrl** | **string**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. | [optional] 
 **statsCallBackMethod** | **string**| Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="callsplayaudios"></a>
# **CallsPlayaudios**
> string CallsPlayaudios (string callSid, string audioUrl, string sayText, int? length = null, string direction = null, bool? mix = null)

Play Audio

Play Audio from a url

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CallsPlayaudiosExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new CallApi();
            var callSid = callSid_example;  // string | The unique identifier of each call resource
            var audioUrl = audioUrl_example;  // string | URL to sound that should be played. You also can add more than one audio file using semicolons e.g. http://example.com/audio1.mp3;http://example.com/audio2.wav
            var sayText = sayText_example;  // string | Valid alphanumeric string that should be played to the In-progress call.
            var length = 56;  // int? | Time limit in seconds for audio play back (optional) 
            var direction = direction_example;  // string | The leg of the call audio will be played to (optional) 
            var mix = true;  // bool? | If false, all other audio will be muted (optional) 

            try
            {
                // Play Audio
                string result = apiInstance.CallsPlayaudios(callSid, audioUrl, sayText, length, direction, mix);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CallApi.CallsPlayaudios: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callSid** | **string**| The unique identifier of each call resource | 
 **audioUrl** | **string**| URL to sound that should be played. You also can add more than one audio file using semicolons e.g. http://example.com/audio1.mp3;http://example.com/audio2.wav | 
 **sayText** | **string**| Valid alphanumeric string that should be played to the In-progress call. | 
 **length** | **int?**| Time limit in seconds for audio play back | [optional] 
 **direction** | **string**| The leg of the call audio will be played to | [optional] 
 **mix** | **bool?**| If false, all other audio will be muted | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="callsrecordcalls"></a>
# **CallsRecordcalls**
> string CallsRecordcalls (string callSid, bool? record, string direction = null, int? timeLimit = null, string callBackUrl = null, string fileformat = null)

Record Call

Start or stop recording of an in-progress voice call.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CallsRecordcallsExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new CallApi();
            var callSid = callSid_example;  // string | The unique identifier of each call resource
            var record = true;  // bool? | Set true to initiate recording or false to terminate recording
            var direction = direction_example;  // string | The leg of the call to record (optional) 
            var timeLimit = 56;  // int? | Time in seconds the recording duration should not exceed (optional) 
            var callBackUrl = callBackUrl_example;  // string | URL consulted after the recording completes (optional) 
            var fileformat = fileformat_example;  // string | Format of the recording file. Can be .mp3 or .wav (optional) 

            try
            {
                // Record Call
                string result = apiInstance.CallsRecordcalls(callSid, record, direction, timeLimit, callBackUrl, fileformat);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CallApi.CallsRecordcalls: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callSid** | **string**| The unique identifier of each call resource | 
 **record** | **bool?**| Set true to initiate recording or false to terminate recording | 
 **direction** | **string**| The leg of the call to record | [optional] 
 **timeLimit** | **int?**| Time in seconds the recording duration should not exceed | [optional] 
 **callBackUrl** | **string**| URL consulted after the recording completes | [optional] 
 **fileformat** | **string**| Format of the recording file. Can be .mp3 or .wav | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="callssenddigits"></a>
# **CallsSenddigits**
> string CallsSenddigits (string callSid, string playDtmf, string playDtmfDirection = null)

Play DTMF

Play Dtmf and send the Digit

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CallsSenddigitsExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new CallApi();
            var callSid = callSid_example;  // string | The unique identifier of each call resource
            var playDtmf = playDtmf_example;  // string | DTMF digits to play to the call. 0-9, #, *, W, or w
            var playDtmfDirection = playDtmfDirection_example;  // string | The leg of the call DTMF digits should be sent to (optional) 

            try
            {
                // Play DTMF
                string result = apiInstance.CallsSenddigits(callSid, playDtmf, playDtmfDirection);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CallApi.CallsSenddigits: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callSid** | **string**| The unique identifier of each call resource | 
 **playDtmf** | **string**| DTMF digits to play to the call. 0-9, #, *, W, or w | 
 **playDtmfDirection** | **string**| The leg of the call DTMF digits should be sent to | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="callsviewcalldetail"></a>
# **CallsViewcalldetail**
> string CallsViewcalldetail (string callSid)

View Call

Retrieve a single voice call’s information by its CallSid.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CallsViewcalldetailExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new CallApi();
            var callSid = callSid_example;  // string | The unique identifier for the voice call.

            try
            {
                // View Call
                string result = apiInstance.CallsViewcalldetail(callSid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CallApi.CallsViewcalldetail: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callSid** | **string**| The unique identifier for the voice call. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="callsviewcalls"></a>
# **CallsViewcalls**
> string CallsViewcalls (string callsid)

View Call

Retrieve a single voice call’s information by its CallSid.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CallsViewcallsExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new CallApi();
            var callsid = callsid_example;  // string | The unique identifier for the voice call.

            try
            {
                // View Call
                string result = apiInstance.CallsViewcalls(callsid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CallApi.CallsViewcalls: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callsid** | **string**| The unique identifier for the voice call. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="callsvoiceeffect"></a>
# **CallsVoiceeffect**
> string CallsVoiceeffect (string callSid, string audioDirection = null, double? pitchSemiTones = null, double? pitchOctaves = null, double? pitch = null, double? rate = null, double? tempo = null)

Voice Effect

Add audio voice effects to the an in-progress voice call.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CallsVoiceeffectExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new CallApi();
            var callSid = callSid_example;  // string | The unique identifier for the in-progress voice call.
            var audioDirection = audioDirection_example;  // string | The direction the audio effect should be placed on. If IN, the effects will occur on the incoming audio stream. If OUT, the effects will occur on the outgoing audio stream. (optional) 
            var pitchSemiTones = 1.2;  // double? | Set the pitch in semitone (half-step) intervals. Value between -14 and 14 (optional) 
            var pitchOctaves = 1.2;  // double? | Set the pitch in octave intervals.. Value between -1 and 1 (optional) 
            var pitch = 1.2;  // double? | Set the pitch (lowness/highness) of the audio. The higher the value, the higher the pitch. Value greater than 0 (optional) 
            var rate = 1.2;  // double? | Set the rate for audio. The lower the value, the lower the rate. value greater than 0 (optional) 
            var tempo = 1.2;  // double? | Set the tempo (speed) of the audio. A higher value denotes a faster tempo. Value greater than 0 (optional) 

            try
            {
                // Voice Effect
                string result = apiInstance.CallsVoiceeffect(callSid, audioDirection, pitchSemiTones, pitchOctaves, pitch, rate, tempo);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CallApi.CallsVoiceeffect: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callSid** | **string**| The unique identifier for the in-progress voice call. | 
 **audioDirection** | **string**| The direction the audio effect should be placed on. If IN, the effects will occur on the incoming audio stream. If OUT, the effects will occur on the outgoing audio stream. | [optional] 
 **pitchSemiTones** | **double?**| Set the pitch in semitone (half-step) intervals. Value between -14 and 14 | [optional] 
 **pitchOctaves** | **double?**| Set the pitch in octave intervals.. Value between -1 and 1 | [optional] 
 **pitch** | **double?**| Set the pitch (lowness/highness) of the audio. The higher the value, the higher the pitch. Value greater than 0 | [optional] 
 **rate** | **double?**| Set the rate for audio. The lower the value, the lower the rate. value greater than 0 | [optional] 
 **tempo** | **double?**| Set the tempo (speed) of the audio. A higher value denotes a faster tempo. Value greater than 0 | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

