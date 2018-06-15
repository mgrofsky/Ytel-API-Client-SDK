# swagger_client.CallApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calls_groupcall**](CallApi.md#calls_groupcall) | **POST** /calls/groupcall.json | Group Call
[**calls_interruptcalls**](CallApi.md#calls_interruptcalls) | **POST** /calls/interruptcalls.json | Interrupt Call
[**calls_listcalls**](CallApi.md#calls_listcalls) | **POST** /calls/listcalls.json | List Calls
[**calls_makecall**](CallApi.md#calls_makecall) | **POST** /calls/makecall.json | Make Call
[**calls_makervm**](CallApi.md#calls_makervm) | **POST** /calls/makervm.json | Send RVM
[**calls_playaudios**](CallApi.md#calls_playaudios) | **POST** /calls/playaudios.json | Play Audio
[**calls_recordcalls**](CallApi.md#calls_recordcalls) | **POST** /calls/recordcalls.json | Record Call
[**calls_senddigits**](CallApi.md#calls_senddigits) | **POST** /calls/senddigits.json | Play DTMF
[**calls_viewcalldetail**](CallApi.md#calls_viewcalldetail) | **POST** /calls/viewcalldetail.json | View Call
[**calls_viewcalls**](CallApi.md#calls_viewcalls) | **POST** /calls/viewcalls.json | View Call
[**calls_voiceeffect**](CallApi.md#calls_voiceeffect) | **POST** /calls/voiceeffect.json | Voice Effect


# **calls_groupcall**
> str calls_groupcall(_from, to, url, group_confirm_key, group_confirm_file, method=method, status_call_back_url=status_call_back_url, status_call_back_method=status_call_back_method, fall_back_url=fall_back_url, fall_back_method=fall_back_method, heart_beat_url=heart_beat_url, heart_beat_method=heart_beat_method, timeout=timeout, play_dtmf=play_dtmf, hide_caller_id=hide_caller_id, record=record, record_call_back_url=record_call_back_url, record_call_back_method=record_call_back_method, transcribe=transcribe, transcribe_call_back_url=transcribe_call_back_url)

Group Call

Group Call

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: auth
configuration = swagger_client.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swagger_client.CallApi(swagger_client.ApiClient(configuration))
_from = '_from_example' # str | This number to display on Caller ID as calling
to = 'to_example' # str | Please enter multiple E164 number. You can add max 10 numbers. Add numbers separated with comma. e.g : 1111111111,2222222222
url = 'url_example' # str | URL requested once the call connects
group_confirm_key = 'group_confirm_key_example' # str | Define the DTMF that the called party should send to bridge the call. Allowed Values : 0-9, #, *
group_confirm_file = 'group_confirm_file_example' # str | Specify the audio file you want to play when the called party picks up the call
method = 'method_example' # str | Specifies the HTTP method used to request the required URL once call connects. (optional)
status_call_back_url = 'status_call_back_url_example' # str | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. (optional)
status_call_back_method = 'status_call_back_method_example' # str | Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. (optional)
fall_back_url = 'fall_back_url_example' # str | URL requested if the initial Url parameter fails or encounters an error (optional)
fall_back_method = 'fall_back_method_example' # str | Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional)
heart_beat_url = 'heart_beat_url_example' # str | URL that can be requested every 60 seconds during the call to notify of elapsed time and pass other general information. (optional)
heart_beat_method = 'heart_beat_method_example' # str | Specifies the HTTP method used to request HeartbeatUrl. (optional)
timeout = 56 # int | Time (in seconds) we should wait while the call is ringing before canceling the call (optional)
play_dtmf = 'play_dtmf_example' # str | DTMF Digits to play to the call once it connects. 0-9, #, or * (optional)
hide_caller_id = 'hide_caller_id_example' # str | Specifies if the caller id will be hidden (optional)
record = true # bool | Specifies if the call should be recorded (optional)
record_call_back_url = 'record_call_back_url_example' # str | Recording parameters will be sent here upon completion (optional)
record_call_back_method = 'record_call_back_method_example' # str | Method used to request the RecordCallback URL. (optional)
transcribe = true # bool | Specifies if the call recording should be transcribed (optional)
transcribe_call_back_url = 'transcribe_call_back_url_example' # str | Transcription parameters will be sent here upon completion (optional)

try:
    # Group Call
    api_response = api_instance.calls_groupcall(_from, to, url, group_confirm_key, group_confirm_file, method=method, status_call_back_url=status_call_back_url, status_call_back_method=status_call_back_method, fall_back_url=fall_back_url, fall_back_method=fall_back_method, heart_beat_url=heart_beat_url, heart_beat_method=heart_beat_method, timeout=timeout, play_dtmf=play_dtmf, hide_caller_id=hide_caller_id, record=record, record_call_back_url=record_call_back_url, record_call_back_method=record_call_back_method, transcribe=transcribe, transcribe_call_back_url=transcribe_call_back_url)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CallApi->calls_groupcall: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_from** | **str**| This number to display on Caller ID as calling | 
 **to** | **str**| Please enter multiple E164 number. You can add max 10 numbers. Add numbers separated with comma. e.g : 1111111111,2222222222 | 
 **url** | **str**| URL requested once the call connects | 
 **group_confirm_key** | **str**| Define the DTMF that the called party should send to bridge the call. Allowed Values : 0-9, #, * | 
 **group_confirm_file** | **str**| Specify the audio file you want to play when the called party picks up the call | 
 **method** | **str**| Specifies the HTTP method used to request the required URL once call connects. | [optional] 
 **status_call_back_url** | **str**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. | [optional] 
 **status_call_back_method** | **str**| Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. | [optional] 
 **fall_back_url** | **str**| URL requested if the initial Url parameter fails or encounters an error | [optional] 
 **fall_back_method** | **str**| Specifies the HTTP method used to request the required FallbackUrl once call connects. | [optional] 
 **heart_beat_url** | **str**| URL that can be requested every 60 seconds during the call to notify of elapsed time and pass other general information. | [optional] 
 **heart_beat_method** | **str**| Specifies the HTTP method used to request HeartbeatUrl. | [optional] 
 **timeout** | **int**| Time (in seconds) we should wait while the call is ringing before canceling the call | [optional] 
 **play_dtmf** | **str**| DTMF Digits to play to the call once it connects. 0-9, #, or * | [optional] 
 **hide_caller_id** | **str**| Specifies if the caller id will be hidden | [optional] 
 **record** | **bool**| Specifies if the call should be recorded | [optional] 
 **record_call_back_url** | **str**| Recording parameters will be sent here upon completion | [optional] 
 **record_call_back_method** | **str**| Method used to request the RecordCallback URL. | [optional] 
 **transcribe** | **bool**| Specifies if the call recording should be transcribed | [optional] 
 **transcribe_call_back_url** | **str**| Transcription parameters will be sent here upon completion | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **calls_interruptcalls**
> str calls_interruptcalls(call_sid, url=url, method=method, status=status)

Interrupt Call

Interrupt the Call by Call Sid

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: auth
configuration = swagger_client.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swagger_client.CallApi(swagger_client.ApiClient(configuration))
call_sid = 'call_sid_example' # str | The unique identifier for voice call that is in progress.
url = 'url_example' # str | URL the in-progress call will be redirected to (optional)
method = 'method_example' # str | The method used to request the above Url parameter (optional)
status = 'status_example' # str | Status to set the in-progress call to (optional)

try:
    # Interrupt Call
    api_response = api_instance.calls_interruptcalls(call_sid, url=url, method=method, status=status)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CallApi->calls_interruptcalls: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **call_sid** | **str**| The unique identifier for voice call that is in progress. | 
 **url** | **str**| URL the in-progress call will be redirected to | [optional] 
 **method** | **str**| The method used to request the above Url parameter | [optional] 
 **status** | **str**| Status to set the in-progress call to | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **calls_listcalls**
> str calls_listcalls(page=page, page_size=page_size, to=to, _from=_from, date_created=date_created)

List Calls

A list of calls associated with your Ytel account

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: auth
configuration = swagger_client.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swagger_client.CallApi(swagger_client.ApiClient(configuration))
page = 1 # int | The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) (default to 1)
page_size = 10 # int | Number of individual resources listed in the response per page (optional) (default to 10)
to = 'to_example' # str | Filter calls that were sent to this 10-digit number (E.164 format). (optional)
_from = '_from_example' # str | Filter calls that were sent from this 10-digit number (E.164 format). (optional)
date_created = 'date_created_example' # str | Return calls that are from a specified date. (optional)

try:
    # List Calls
    api_response = api_instance.calls_listcalls(page=page, page_size=page_size, to=to, _from=_from, date_created=date_created)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CallApi->calls_listcalls: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **page_size** | **int**| Number of individual resources listed in the response per page | [optional] [default to 10]
 **to** | **str**| Filter calls that were sent to this 10-digit number (E.164 format). | [optional] 
 **_from** | **str**| Filter calls that were sent from this 10-digit number (E.164 format). | [optional] 
 **date_created** | **str**| Return calls that are from a specified date. | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **calls_makecall**
> str calls_makecall(_from, to, url, method=method, status_call_back_url=status_call_back_url, status_call_back_method=status_call_back_method, fall_back_url=fall_back_url, fall_back_method=fall_back_method, heart_beat_url=heart_beat_url, heart_beat_method=heart_beat_method, timeout=timeout, play_dtmf=play_dtmf, hide_caller_id=hide_caller_id, record=record, record_call_back_url=record_call_back_url, record_call_back_method=record_call_back_method, transcribe=transcribe, transcribe_call_back_url=transcribe_call_back_url, if_machine=if_machine, if_machine_url=if_machine_url, if_machine_method=if_machine_method, feedback=feedback, survey_id=survey_id)

Make Call

You can experiment with initiating a call through Ytel and view the request response generated when doing so and get the response in json

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: auth
configuration = swagger_client.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swagger_client.CallApi(swagger_client.ApiClient(configuration))
_from = '_from_example' # str | A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call.
to = 'to_example' # str | To number
url = 'url_example' # str | URL requested once the call connects
method = 'method_example' # str | Specifies the HTTP method used to request the required URL once call connects. (optional)
status_call_back_url = 'status_call_back_url_example' # str | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. (optional)
status_call_back_method = 'status_call_back_method_example' # str | Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. (optional)
fall_back_url = 'fall_back_url_example' # str | URL requested if the initial Url parameter fails or encounters an error (optional)
fall_back_method = 'fall_back_method_example' # str | Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional)
heart_beat_url = 'heart_beat_url_example' # str | URL that can be requested every 60 seconds during the call to notify of elapsed tim (optional)
heart_beat_method = 'heart_beat_method_example' # str | Specifies the HTTP method used to request HeartbeatUrl. (optional)
timeout = 56 # int | Time (in seconds) Ytel should wait while the call is ringing before canceling the call (optional)
play_dtmf = 'play_dtmf_example' # str | DTMF Digits to play to the call once it connects. 0-9, #, or * (optional)
hide_caller_id = true # bool | Specifies if the caller id will be hidden (optional)
record = true # bool | Specifies if the call should be recorded (optional)
record_call_back_url = 'record_call_back_url_example' # str | Recording parameters will be sent here upon completion (optional)
record_call_back_method = 'record_call_back_method_example' # str | Method used to request the RecordCallback URL. (optional)
transcribe = true # bool | Specifies if the call recording should be transcribed (optional)
transcribe_call_back_url = 'transcribe_call_back_url_example' # str | Transcription parameters will be sent here upon completion (optional)
if_machine = 'if_machine_example' # str | How Ytel should handle the receiving numbers voicemail machine (optional)
if_machine_url = 'if_machine_url_example' # str | URL requested when IfMachine=continue (optional)
if_machine_method = 'if_machine_method_example' # str | Method used to request the IfMachineUrl. (optional)
feedback = true # bool | Specify if survey should be enable or not (optional)
survey_id = 'survey_id_example' # str | The unique identifier for the survey. (optional)

try:
    # Make Call
    api_response = api_instance.calls_makecall(_from, to, url, method=method, status_call_back_url=status_call_back_url, status_call_back_method=status_call_back_method, fall_back_url=fall_back_url, fall_back_method=fall_back_method, heart_beat_url=heart_beat_url, heart_beat_method=heart_beat_method, timeout=timeout, play_dtmf=play_dtmf, hide_caller_id=hide_caller_id, record=record, record_call_back_url=record_call_back_url, record_call_back_method=record_call_back_method, transcribe=transcribe, transcribe_call_back_url=transcribe_call_back_url, if_machine=if_machine, if_machine_url=if_machine_url, if_machine_method=if_machine_method, feedback=feedback, survey_id=survey_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CallApi->calls_makecall: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_from** | **str**| A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call. | 
 **to** | **str**| To number | 
 **url** | **str**| URL requested once the call connects | 
 **method** | **str**| Specifies the HTTP method used to request the required URL once call connects. | [optional] 
 **status_call_back_url** | **str**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. | [optional] 
 **status_call_back_method** | **str**| Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. | [optional] 
 **fall_back_url** | **str**| URL requested if the initial Url parameter fails or encounters an error | [optional] 
 **fall_back_method** | **str**| Specifies the HTTP method used to request the required FallbackUrl once call connects. | [optional] 
 **heart_beat_url** | **str**| URL that can be requested every 60 seconds during the call to notify of elapsed tim | [optional] 
 **heart_beat_method** | **str**| Specifies the HTTP method used to request HeartbeatUrl. | [optional] 
 **timeout** | **int**| Time (in seconds) Ytel should wait while the call is ringing before canceling the call | [optional] 
 **play_dtmf** | **str**| DTMF Digits to play to the call once it connects. 0-9, #, or * | [optional] 
 **hide_caller_id** | **bool**| Specifies if the caller id will be hidden | [optional] 
 **record** | **bool**| Specifies if the call should be recorded | [optional] 
 **record_call_back_url** | **str**| Recording parameters will be sent here upon completion | [optional] 
 **record_call_back_method** | **str**| Method used to request the RecordCallback URL. | [optional] 
 **transcribe** | **bool**| Specifies if the call recording should be transcribed | [optional] 
 **transcribe_call_back_url** | **str**| Transcription parameters will be sent here upon completion | [optional] 
 **if_machine** | **str**| How Ytel should handle the receiving numbers voicemail machine | [optional] 
 **if_machine_url** | **str**| URL requested when IfMachine&#x3D;continue | [optional] 
 **if_machine_method** | **str**| Method used to request the IfMachineUrl. | [optional] 
 **feedback** | **bool**| Specify if survey should be enable or not | [optional] 
 **survey_id** | **str**| The unique identifier for the survey. | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **calls_makervm**
> str calls_makervm(_from, rvm_caller_id, to, voice_mail_url, method=method, status_call_back_url=status_call_back_url, stats_call_back_method=stats_call_back_method)

Send RVM

Initiate an outbound Ringless Voicemail through Ytel.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: auth
configuration = swagger_client.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swagger_client.CallApi(swagger_client.ApiClient(configuration))
_from = '_from_example' # str | A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call.
rvm_caller_id = 'rvm_caller_id_example' # str | A required secondary Caller ID for RVM to work.
to = 'to_example' # str | A valid number (E.164 format) that will receive the phone call.
voice_mail_url = 'voice_mail_url_example' # str | The URL requested once the RVM connects. A set of default parameters will be sent here.
method = 'GET' # str | Specifies the HTTP method used to request the required URL once call connects. (optional) (default to GET)
status_call_back_url = 'status_call_back_url_example' # str | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. (optional)
stats_call_back_method = 'stats_call_back_method_example' # str | Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. (optional)

try:
    # Send RVM
    api_response = api_instance.calls_makervm(_from, rvm_caller_id, to, voice_mail_url, method=method, status_call_back_url=status_call_back_url, stats_call_back_method=stats_call_back_method)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CallApi->calls_makervm: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_from** | **str**| A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call. | 
 **rvm_caller_id** | **str**| A required secondary Caller ID for RVM to work. | 
 **to** | **str**| A valid number (E.164 format) that will receive the phone call. | 
 **voice_mail_url** | **str**| The URL requested once the RVM connects. A set of default parameters will be sent here. | 
 **method** | **str**| Specifies the HTTP method used to request the required URL once call connects. | [optional] [default to GET]
 **status_call_back_url** | **str**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. | [optional] 
 **stats_call_back_method** | **str**| Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **calls_playaudios**
> str calls_playaudios(call_sid, audio_url, say_text, length=length, direction=direction, mix=mix)

Play Audio

Play Audio from a url

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: auth
configuration = swagger_client.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swagger_client.CallApi(swagger_client.ApiClient(configuration))
call_sid = 'call_sid_example' # str | The unique identifier of each call resource
audio_url = 'audio_url_example' # str | URL to sound that should be played. You also can add more than one audio file using semicolons e.g. http://example.com/audio1.mp3;http://example.com/audio2.wav
say_text = 'say_text_example' # str | Valid alphanumeric string that should be played to the In-progress call.
length = 56 # int | Time limit in seconds for audio play back (optional)
direction = 'direction_example' # str | The leg of the call audio will be played to (optional)
mix = true # bool | If false, all other audio will be muted (optional)

try:
    # Play Audio
    api_response = api_instance.calls_playaudios(call_sid, audio_url, say_text, length=length, direction=direction, mix=mix)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CallApi->calls_playaudios: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **call_sid** | **str**| The unique identifier of each call resource | 
 **audio_url** | **str**| URL to sound that should be played. You also can add more than one audio file using semicolons e.g. http://example.com/audio1.mp3;http://example.com/audio2.wav | 
 **say_text** | **str**| Valid alphanumeric string that should be played to the In-progress call. | 
 **length** | **int**| Time limit in seconds for audio play back | [optional] 
 **direction** | **str**| The leg of the call audio will be played to | [optional] 
 **mix** | **bool**| If false, all other audio will be muted | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **calls_recordcalls**
> str calls_recordcalls(call_sid, record, direction=direction, time_limit=time_limit, call_back_url=call_back_url, fileformat=fileformat)

Record Call

Start or stop recording of an in-progress voice call.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: auth
configuration = swagger_client.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swagger_client.CallApi(swagger_client.ApiClient(configuration))
call_sid = 'call_sid_example' # str | The unique identifier of each call resource
record = true # bool | Set true to initiate recording or false to terminate recording
direction = 'direction_example' # str | The leg of the call to record (optional)
time_limit = 56 # int | Time in seconds the recording duration should not exceed (optional)
call_back_url = 'call_back_url_example' # str | URL consulted after the recording completes (optional)
fileformat = 'fileformat_example' # str | Format of the recording file. Can be .mp3 or .wav (optional)

try:
    # Record Call
    api_response = api_instance.calls_recordcalls(call_sid, record, direction=direction, time_limit=time_limit, call_back_url=call_back_url, fileformat=fileformat)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CallApi->calls_recordcalls: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **call_sid** | **str**| The unique identifier of each call resource | 
 **record** | **bool**| Set true to initiate recording or false to terminate recording | 
 **direction** | **str**| The leg of the call to record | [optional] 
 **time_limit** | **int**| Time in seconds the recording duration should not exceed | [optional] 
 **call_back_url** | **str**| URL consulted after the recording completes | [optional] 
 **fileformat** | **str**| Format of the recording file. Can be .mp3 or .wav | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **calls_senddigits**
> str calls_senddigits(call_sid, play_dtmf, play_dtmf_direction=play_dtmf_direction)

Play DTMF

Play Dtmf and send the Digit

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: auth
configuration = swagger_client.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swagger_client.CallApi(swagger_client.ApiClient(configuration))
call_sid = 'call_sid_example' # str | The unique identifier of each call resource
play_dtmf = 'play_dtmf_example' # str | DTMF digits to play to the call. 0-9, #, *, W, or w
play_dtmf_direction = 'play_dtmf_direction_example' # str | The leg of the call DTMF digits should be sent to (optional)

try:
    # Play DTMF
    api_response = api_instance.calls_senddigits(call_sid, play_dtmf, play_dtmf_direction=play_dtmf_direction)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CallApi->calls_senddigits: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **call_sid** | **str**| The unique identifier of each call resource | 
 **play_dtmf** | **str**| DTMF digits to play to the call. 0-9, #, *, W, or w | 
 **play_dtmf_direction** | **str**| The leg of the call DTMF digits should be sent to | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **calls_viewcalldetail**
> str calls_viewcalldetail(call_sid)

View Call

Retrieve a single voice call’s information by its CallSid.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: auth
configuration = swagger_client.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swagger_client.CallApi(swagger_client.ApiClient(configuration))
call_sid = 'call_sid_example' # str | The unique identifier for the voice call.

try:
    # View Call
    api_response = api_instance.calls_viewcalldetail(call_sid)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CallApi->calls_viewcalldetail: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **call_sid** | **str**| The unique identifier for the voice call. | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **calls_viewcalls**
> str calls_viewcalls(callsid)

View Call

Retrieve a single voice call’s information by its CallSid.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: auth
configuration = swagger_client.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swagger_client.CallApi(swagger_client.ApiClient(configuration))
callsid = 'callsid_example' # str | The unique identifier for the voice call.

try:
    # View Call
    api_response = api_instance.calls_viewcalls(callsid)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CallApi->calls_viewcalls: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callsid** | **str**| The unique identifier for the voice call. | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **calls_voiceeffect**
> str calls_voiceeffect(call_sid, audio_direction=audio_direction, pitch_semi_tones=pitch_semi_tones, pitch_octaves=pitch_octaves, pitch=pitch, rate=rate, tempo=tempo)

Voice Effect

Add audio voice effects to the an in-progress voice call.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: auth
configuration = swagger_client.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swagger_client.CallApi(swagger_client.ApiClient(configuration))
call_sid = 'call_sid_example' # str | The unique identifier for the in-progress voice call.
audio_direction = 'audio_direction_example' # str | The direction the audio effect should be placed on. If IN, the effects will occur on the incoming audio stream. If OUT, the effects will occur on the outgoing audio stream. (optional)
pitch_semi_tones = 1.2 # float | Set the pitch in semitone (half-step) intervals. Value between -14 and 14 (optional)
pitch_octaves = 1.2 # float | Set the pitch in octave intervals.. Value between -1 and 1 (optional)
pitch = 1.2 # float | Set the pitch (lowness/highness) of the audio. The higher the value, the higher the pitch. Value greater than 0 (optional)
rate = 1.2 # float | Set the rate for audio. The lower the value, the lower the rate. value greater than 0 (optional)
tempo = 1.2 # float | Set the tempo (speed) of the audio. A higher value denotes a faster tempo. Value greater than 0 (optional)

try:
    # Voice Effect
    api_response = api_instance.calls_voiceeffect(call_sid, audio_direction=audio_direction, pitch_semi_tones=pitch_semi_tones, pitch_octaves=pitch_octaves, pitch=pitch, rate=rate, tempo=tempo)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CallApi->calls_voiceeffect: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **call_sid** | **str**| The unique identifier for the in-progress voice call. | 
 **audio_direction** | **str**| The direction the audio effect should be placed on. If IN, the effects will occur on the incoming audio stream. If OUT, the effects will occur on the outgoing audio stream. | [optional] 
 **pitch_semi_tones** | **float**| Set the pitch in semitone (half-step) intervals. Value between -14 and 14 | [optional] 
 **pitch_octaves** | **float**| Set the pitch in octave intervals.. Value between -1 and 1 | [optional] 
 **pitch** | **float**| Set the pitch (lowness/highness) of the audio. The higher the value, the higher the pitch. Value greater than 0 | [optional] 
 **rate** | **float**| Set the rate for audio. The lower the value, the lower the rate. value greater than 0 | [optional] 
 **tempo** | **float**| Set the tempo (speed) of the audio. A higher value denotes a faster tempo. Value greater than 0 | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

