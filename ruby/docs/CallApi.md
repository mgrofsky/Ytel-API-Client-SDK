# SwaggerClient::CallApi

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
> String calls_groupcall(from, to, url, group_confirm_key, group_confirm_file, opts)

Group Call

Group Call

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: auth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::CallApi.new

from = "from_example" # String | This number to display on Caller ID as calling

to = "to_example" # String | Please enter multiple E164 number. You can add max 10 numbers. Add numbers separated with comma. e.g : 1111111111,2222222222

url = "url_example" # String | URL requested once the call connects

group_confirm_key = "group_confirm_key_example" # String | Define the DTMF that the called party should send to bridge the call. Allowed Values : 0-9, #, *

group_confirm_file = "group_confirm_file_example" # String | Specify the audio file you want to play when the called party picks up the call

opts = { 
  method: "method_example", # String | Specifies the HTTP method used to request the required URL once call connects.
  status_call_back_url: "status_call_back_url_example", # String | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
  status_call_back_method: "status_call_back_method_example", # String | Specifies the HTTP methodlinkclass used to request StatusCallbackUrl.
  fall_back_url: "fall_back_url_example", # String | URL requested if the initial Url parameter fails or encounters an error
  fall_back_method: "fall_back_method_example", # String | Specifies the HTTP method used to request the required FallbackUrl once call connects.
  heart_beat_url: "heart_beat_url_example", # String | URL that can be requested every 60 seconds during the call to notify of elapsed time and pass other general information.
  heart_beat_method: "heart_beat_method_example", # String | Specifies the HTTP method used to request HeartbeatUrl.
  timeout: 56, # Integer | Time (in seconds) we should wait while the call is ringing before canceling the call
  play_dtmf: "play_dtmf_example", # String | DTMF Digits to play to the call once it connects. 0-9, #, or *
  hide_caller_id: "hide_caller_id_example", # String | Specifies if the caller id will be hidden
  record: true, # BOOLEAN | Specifies if the call should be recorded
  record_call_back_url: "record_call_back_url_example", # String | Recording parameters will be sent here upon completion
  record_call_back_method: "record_call_back_method_example", # String | Method used to request the RecordCallback URL.
  transcribe: true, # BOOLEAN | Specifies if the call recording should be transcribed
  transcribe_call_back_url: "transcribe_call_back_url_example" # String | Transcription parameters will be sent here upon completion
}

begin
  #Group Call
  result = api_instance.calls_groupcall(from, to, url, group_confirm_key, group_confirm_file, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CallApi->calls_groupcall: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **String**| This number to display on Caller ID as calling | 
 **to** | **String**| Please enter multiple E164 number. You can add max 10 numbers. Add numbers separated with comma. e.g : 1111111111,2222222222 | 
 **url** | **String**| URL requested once the call connects | 
 **group_confirm_key** | **String**| Define the DTMF that the called party should send to bridge the call. Allowed Values : 0-9, #, * | 
 **group_confirm_file** | **String**| Specify the audio file you want to play when the called party picks up the call | 
 **method** | **String**| Specifies the HTTP method used to request the required URL once call connects. | [optional] 
 **status_call_back_url** | **String**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. | [optional] 
 **status_call_back_method** | **String**| Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. | [optional] 
 **fall_back_url** | **String**| URL requested if the initial Url parameter fails or encounters an error | [optional] 
 **fall_back_method** | **String**| Specifies the HTTP method used to request the required FallbackUrl once call connects. | [optional] 
 **heart_beat_url** | **String**| URL that can be requested every 60 seconds during the call to notify of elapsed time and pass other general information. | [optional] 
 **heart_beat_method** | **String**| Specifies the HTTP method used to request HeartbeatUrl. | [optional] 
 **timeout** | **Integer**| Time (in seconds) we should wait while the call is ringing before canceling the call | [optional] 
 **play_dtmf** | **String**| DTMF Digits to play to the call once it connects. 0-9, #, or * | [optional] 
 **hide_caller_id** | **String**| Specifies if the caller id will be hidden | [optional] 
 **record** | **BOOLEAN**| Specifies if the call should be recorded | [optional] 
 **record_call_back_url** | **String**| Recording parameters will be sent here upon completion | [optional] 
 **record_call_back_method** | **String**| Method used to request the RecordCallback URL. | [optional] 
 **transcribe** | **BOOLEAN**| Specifies if the call recording should be transcribed | [optional] 
 **transcribe_call_back_url** | **String**| Transcription parameters will be sent here upon completion | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **calls_interruptcalls**
> String calls_interruptcalls(call_sid, opts)

Interrupt Call

Interrupt the Call by Call Sid

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: auth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::CallApi.new

call_sid = "call_sid_example" # String | The unique identifier for voice call that is in progress.

opts = { 
  url: "url_example", # String | URL the in-progress call will be redirected to
  method: "method_example", # String | The method used to request the above Url parameter
  status: "status_example" # String | Status to set the in-progress call to
}

begin
  #Interrupt Call
  result = api_instance.calls_interruptcalls(call_sid, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CallApi->calls_interruptcalls: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **call_sid** | **String**| The unique identifier for voice call that is in progress. | 
 **url** | **String**| URL the in-progress call will be redirected to | [optional] 
 **method** | **String**| The method used to request the above Url parameter | [optional] 
 **status** | **String**| Status to set the in-progress call to | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **calls_listcalls**
> String calls_listcalls(opts)

List Calls

A list of calls associated with your Ytel account

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: auth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::CallApi.new

opts = { 
  page: 1, # Integer | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
  page_size: 10, # Integer | Number of individual resources listed in the response per page
  to: "to_example", # String | Filter calls that were sent to this 10-digit number (E.164 format).
  from: "from_example", # String | Filter calls that were sent from this 10-digit number (E.164 format).
  date_created: "date_created_example" # String | Return calls that are from a specified date.
}

begin
  #List Calls
  result = api_instance.calls_listcalls(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CallApi->calls_listcalls: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **page_size** | **Integer**| Number of individual resources listed in the response per page | [optional] [default to 10]
 **to** | **String**| Filter calls that were sent to this 10-digit number (E.164 format). | [optional] 
 **from** | **String**| Filter calls that were sent from this 10-digit number (E.164 format). | [optional] 
 **date_created** | **String**| Return calls that are from a specified date. | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **calls_makecall**
> String calls_makecall(from, to, url, opts)

Make Call

You can experiment with initiating a call through Ytel and view the request response generated when doing so and get the response in json

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: auth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::CallApi.new

from = "from_example" # String | A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call.

to = "to_example" # String | To number

url = "url_example" # String | URL requested once the call connects

opts = { 
  method: "method_example", # String | Specifies the HTTP method used to request the required URL once call connects.
  status_call_back_url: "status_call_back_url_example", # String | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
  status_call_back_method: "status_call_back_method_example", # String | Specifies the HTTP methodlinkclass used to request StatusCallbackUrl.
  fall_back_url: "fall_back_url_example", # String | URL requested if the initial Url parameter fails or encounters an error
  fall_back_method: "fall_back_method_example", # String | Specifies the HTTP method used to request the required FallbackUrl once call connects.
  heart_beat_url: "heart_beat_url_example", # String | URL that can be requested every 60 seconds during the call to notify of elapsed tim
  heart_beat_method: "heart_beat_method_example", # String | Specifies the HTTP method used to request HeartbeatUrl.
  timeout: 56, # Integer | Time (in seconds) Ytel should wait while the call is ringing before canceling the call
  play_dtmf: "play_dtmf_example", # String | DTMF Digits to play to the call once it connects. 0-9, #, or *
  hide_caller_id: true, # BOOLEAN | Specifies if the caller id will be hidden
  record: true, # BOOLEAN | Specifies if the call should be recorded
  record_call_back_url: "record_call_back_url_example", # String | Recording parameters will be sent here upon completion
  record_call_back_method: "record_call_back_method_example", # String | Method used to request the RecordCallback URL.
  transcribe: true, # BOOLEAN | Specifies if the call recording should be transcribed
  transcribe_call_back_url: "transcribe_call_back_url_example", # String | Transcription parameters will be sent here upon completion
  if_machine: "if_machine_example", # String | How Ytel should handle the receiving numbers voicemail machine
  if_machine_url: "if_machine_url_example", # String | URL requested when IfMachine=continue
  if_machine_method: "if_machine_method_example", # String | Method used to request the IfMachineUrl.
  feedback: true, # BOOLEAN | Specify if survey should be enable or not
  survey_id: "survey_id_example" # String | The unique identifier for the survey.
}

begin
  #Make Call
  result = api_instance.calls_makecall(from, to, url, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CallApi->calls_makecall: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **String**| A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call. | 
 **to** | **String**| To number | 
 **url** | **String**| URL requested once the call connects | 
 **method** | **String**| Specifies the HTTP method used to request the required URL once call connects. | [optional] 
 **status_call_back_url** | **String**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. | [optional] 
 **status_call_back_method** | **String**| Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. | [optional] 
 **fall_back_url** | **String**| URL requested if the initial Url parameter fails or encounters an error | [optional] 
 **fall_back_method** | **String**| Specifies the HTTP method used to request the required FallbackUrl once call connects. | [optional] 
 **heart_beat_url** | **String**| URL that can be requested every 60 seconds during the call to notify of elapsed tim | [optional] 
 **heart_beat_method** | **String**| Specifies the HTTP method used to request HeartbeatUrl. | [optional] 
 **timeout** | **Integer**| Time (in seconds) Ytel should wait while the call is ringing before canceling the call | [optional] 
 **play_dtmf** | **String**| DTMF Digits to play to the call once it connects. 0-9, #, or * | [optional] 
 **hide_caller_id** | **BOOLEAN**| Specifies if the caller id will be hidden | [optional] 
 **record** | **BOOLEAN**| Specifies if the call should be recorded | [optional] 
 **record_call_back_url** | **String**| Recording parameters will be sent here upon completion | [optional] 
 **record_call_back_method** | **String**| Method used to request the RecordCallback URL. | [optional] 
 **transcribe** | **BOOLEAN**| Specifies if the call recording should be transcribed | [optional] 
 **transcribe_call_back_url** | **String**| Transcription parameters will be sent here upon completion | [optional] 
 **if_machine** | **String**| How Ytel should handle the receiving numbers voicemail machine | [optional] 
 **if_machine_url** | **String**| URL requested when IfMachine&#x3D;continue | [optional] 
 **if_machine_method** | **String**| Method used to request the IfMachineUrl. | [optional] 
 **feedback** | **BOOLEAN**| Specify if survey should be enable or not | [optional] 
 **survey_id** | **String**| The unique identifier for the survey. | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **calls_makervm**
> String calls_makervm(from, rvm_caller_id, to, voice_mail_url, opts)

Send RVM

Initiate an outbound Ringless Voicemail through Ytel.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: auth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::CallApi.new

from = "from_example" # String | A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call.

rvm_caller_id = "rvm_caller_id_example" # String | A required secondary Caller ID for RVM to work.

to = "to_example" # String | A valid number (E.164 format) that will receive the phone call.

voice_mail_url = "voice_mail_url_example" # String | The URL requested once the RVM connects. A set of default parameters will be sent here.

opts = { 
  method: "GET", # String | Specifies the HTTP method used to request the required URL once call connects.
  status_call_back_url: "status_call_back_url_example", # String | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
  stats_call_back_method: "stats_call_back_method_example" # String | Specifies the HTTP method used to request the required StatusCallBackUrl once call connects.
}

begin
  #Send RVM
  result = api_instance.calls_makervm(from, rvm_caller_id, to, voice_mail_url, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CallApi->calls_makervm: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **String**| A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call. | 
 **rvm_caller_id** | **String**| A required secondary Caller ID for RVM to work. | 
 **to** | **String**| A valid number (E.164 format) that will receive the phone call. | 
 **voice_mail_url** | **String**| The URL requested once the RVM connects. A set of default parameters will be sent here. | 
 **method** | **String**| Specifies the HTTP method used to request the required URL once call connects. | [optional] [default to GET]
 **status_call_back_url** | **String**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. | [optional] 
 **stats_call_back_method** | **String**| Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **calls_playaudios**
> String calls_playaudios(call_sid, audio_url, say_text, opts)

Play Audio

Play Audio from a url

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: auth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::CallApi.new

call_sid = "call_sid_example" # String | The unique identifier of each call resource

audio_url = "audio_url_example" # String | URL to sound that should be played. You also can add more than one audio file using semicolons e.g. http://example.com/audio1.mp3;http://example.com/audio2.wav

say_text = "say_text_example" # String | Valid alphanumeric string that should be played to the In-progress call.

opts = { 
  length: 56, # Integer | Time limit in seconds for audio play back
  direction: "direction_example", # String | The leg of the call audio will be played to
  mix: true # BOOLEAN | If false, all other audio will be muted
}

begin
  #Play Audio
  result = api_instance.calls_playaudios(call_sid, audio_url, say_text, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CallApi->calls_playaudios: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **call_sid** | **String**| The unique identifier of each call resource | 
 **audio_url** | **String**| URL to sound that should be played. You also can add more than one audio file using semicolons e.g. http://example.com/audio1.mp3;http://example.com/audio2.wav | 
 **say_text** | **String**| Valid alphanumeric string that should be played to the In-progress call. | 
 **length** | **Integer**| Time limit in seconds for audio play back | [optional] 
 **direction** | **String**| The leg of the call audio will be played to | [optional] 
 **mix** | **BOOLEAN**| If false, all other audio will be muted | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **calls_recordcalls**
> String calls_recordcalls(call_sid, record, opts)

Record Call

Start or stop recording of an in-progress voice call.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: auth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::CallApi.new

call_sid = "call_sid_example" # String | The unique identifier of each call resource

record = true # BOOLEAN | Set true to initiate recording or false to terminate recording

opts = { 
  direction: "direction_example", # String | The leg of the call to record
  time_limit: 56, # Integer | Time in seconds the recording duration should not exceed
  call_back_url: "call_back_url_example", # String | URL consulted after the recording completes
  fileformat: "fileformat_example" # String | Format of the recording file. Can be .mp3 or .wav
}

begin
  #Record Call
  result = api_instance.calls_recordcalls(call_sid, record, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CallApi->calls_recordcalls: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **call_sid** | **String**| The unique identifier of each call resource | 
 **record** | **BOOLEAN**| Set true to initiate recording or false to terminate recording | 
 **direction** | **String**| The leg of the call to record | [optional] 
 **time_limit** | **Integer**| Time in seconds the recording duration should not exceed | [optional] 
 **call_back_url** | **String**| URL consulted after the recording completes | [optional] 
 **fileformat** | **String**| Format of the recording file. Can be .mp3 or .wav | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **calls_senddigits**
> String calls_senddigits(call_sid, play_dtmf, opts)

Play DTMF

Play Dtmf and send the Digit

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: auth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::CallApi.new

call_sid = "call_sid_example" # String | The unique identifier of each call resource

play_dtmf = "play_dtmf_example" # String | DTMF digits to play to the call. 0-9, #, *, W, or w

opts = { 
  play_dtmf_direction: "play_dtmf_direction_example" # String | The leg of the call DTMF digits should be sent to
}

begin
  #Play DTMF
  result = api_instance.calls_senddigits(call_sid, play_dtmf, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CallApi->calls_senddigits: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **call_sid** | **String**| The unique identifier of each call resource | 
 **play_dtmf** | **String**| DTMF digits to play to the call. 0-9, #, *, W, or w | 
 **play_dtmf_direction** | **String**| The leg of the call DTMF digits should be sent to | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **calls_viewcalldetail**
> String calls_viewcalldetail(call_sid)

View Call

Retrieve a single voice call’s information by its CallSid.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: auth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::CallApi.new

call_sid = "call_sid_example" # String | The unique identifier for the voice call.


begin
  #View Call
  result = api_instance.calls_viewcalldetail(call_sid)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CallApi->calls_viewcalldetail: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **call_sid** | **String**| The unique identifier for the voice call. | 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **calls_viewcalls**
> String calls_viewcalls(callsid)

View Call

Retrieve a single voice call’s information by its CallSid.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: auth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::CallApi.new

callsid = "callsid_example" # String | The unique identifier for the voice call.


begin
  #View Call
  result = api_instance.calls_viewcalls(callsid)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CallApi->calls_viewcalls: #{e}"
end
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



# **calls_voiceeffect**
> String calls_voiceeffect(call_sid, opts)

Voice Effect

Add audio voice effects to the an in-progress voice call.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: auth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::CallApi.new

call_sid = "call_sid_example" # String | The unique identifier for the in-progress voice call.

opts = { 
  audio_direction: "audio_direction_example", # String | The direction the audio effect should be placed on. If IN, the effects will occur on the incoming audio stream. If OUT, the effects will occur on the outgoing audio stream.
  pitch_semi_tones: 1.2, # Float | Set the pitch in semitone (half-step) intervals. Value between -14 and 14
  pitch_octaves: 1.2, # Float | Set the pitch in octave intervals.. Value between -1 and 1
  pitch: 1.2, # Float | Set the pitch (lowness/highness) of the audio. The higher the value, the higher the pitch. Value greater than 0
  rate: 1.2, # Float | Set the rate for audio. The lower the value, the lower the rate. value greater than 0
  tempo: 1.2 # Float | Set the tempo (speed) of the audio. A higher value denotes a faster tempo. Value greater than 0
}

begin
  #Voice Effect
  result = api_instance.calls_voiceeffect(call_sid, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CallApi->calls_voiceeffect: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **call_sid** | **String**| The unique identifier for the in-progress voice call. | 
 **audio_direction** | **String**| The direction the audio effect should be placed on. If IN, the effects will occur on the incoming audio stream. If OUT, the effects will occur on the outgoing audio stream. | [optional] 
 **pitch_semi_tones** | **Float**| Set the pitch in semitone (half-step) intervals. Value between -14 and 14 | [optional] 
 **pitch_octaves** | **Float**| Set the pitch in octave intervals.. Value between -1 and 1 | [optional] 
 **pitch** | **Float**| Set the pitch (lowness/highness) of the audio. The higher the value, the higher the pitch. Value greater than 0 | [optional] 
 **rate** | **Float**| Set the rate for audio. The lower the value, the lower the rate. value greater than 0 | [optional] 
 **tempo** | **Float**| Set the tempo (speed) of the audio. A higher value denotes a faster tempo. Value greater than 0 | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



