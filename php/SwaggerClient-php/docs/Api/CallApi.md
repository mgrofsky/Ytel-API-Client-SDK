# Swagger\Client\CallApi

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
[**callsViewcalldetail**](CallApi.md#callsViewcalldetail) | **POST** /calls/viewcalldetail.json | View Call Details
[**callsViewcalls**](CallApi.md#callsViewcalls) | **POST** /calls/viewcalls.json | View Call
[**callsVoiceeffect**](CallApi.md#callsVoiceeffect) | **POST** /calls/voiceeffect.json | Voice Effect


# **callsGroupcall**
> string callsGroupcall($from, $to, $url, $group_confirm_key, $group_confirm_file, $method, $status_call_back_url, $status_call_back_method, $fall_back_url, $fall_back_method, $heart_beat_url, $heart_beat_method, $timeout, $play_dtmf, $hide_caller_id, $record, $record_call_back_url, $record_call_back_method, $transcribe, $transcribe_call_back_url)

Group Call

Group Call

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\CallApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$from = "from_example"; // string | This number to display on Caller ID as calling
$to = "to_example"; // string | Please enter multiple E164 number. You can add max 10 numbers. Add numbers separated with comma. e.g : 1111111111,2222222222
$url = "url_example"; // string | URL requested once the call connects
$group_confirm_key = "group_confirm_key_example"; // string | Define the DTMF that the called party should send to bridge the call. Allowed Values : 0-9, #, *
$group_confirm_file = "group_confirm_file_example"; // string | Specify the audio file you want to play when the called party picks up the call
$method = "method_example"; // string | Specifies the HTTP method used to request the required URL once call connects.
$status_call_back_url = "status_call_back_url_example"; // string | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
$status_call_back_method = "status_call_back_method_example"; // string | Specifies the HTTP methodlinkclass used to request StatusCallbackUrl.
$fall_back_url = "fall_back_url_example"; // string | URL requested if the initial Url parameter fails or encounters an error
$fall_back_method = "fall_back_method_example"; // string | Specifies the HTTP method used to request the required FallbackUrl once call connects.
$heart_beat_url = "heart_beat_url_example"; // string | URL that can be requested every 60 seconds during the call to notify of elapsed time and pass other general information.
$heart_beat_method = "heart_beat_method_example"; // string | Specifies the HTTP method used to request HeartbeatUrl.
$timeout = 56; // int | Time (in seconds) we should wait while the call is ringing before canceling the call
$play_dtmf = "play_dtmf_example"; // string | DTMF Digits to play to the call once it connects. 0-9, #, or *
$hide_caller_id = "hide_caller_id_example"; // string | Specifies if the caller id will be hidden
$record = true; // bool | Specifies if the call should be recorded
$record_call_back_url = "record_call_back_url_example"; // string | Recording parameters will be sent here upon completion
$record_call_back_method = "record_call_back_method_example"; // string | Method used to request the RecordCallback URL.
$transcribe = true; // bool | Specifies if the call recording should be transcribed
$transcribe_call_back_url = "transcribe_call_back_url_example"; // string | Transcription parameters will be sent here upon completion

try {
    $result = $apiInstance->callsGroupcall($from, $to, $url, $group_confirm_key, $group_confirm_file, $method, $status_call_back_url, $status_call_back_method, $fall_back_url, $fall_back_method, $heart_beat_url, $heart_beat_method, $timeout, $play_dtmf, $hide_caller_id, $record, $record_call_back_url, $record_call_back_method, $transcribe, $transcribe_call_back_url);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CallApi->callsGroupcall: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **string**| This number to display on Caller ID as calling |
 **to** | **string**| Please enter multiple E164 number. You can add max 10 numbers. Add numbers separated with comma. e.g : 1111111111,2222222222 |
 **url** | **string**| URL requested once the call connects |
 **group_confirm_key** | **string**| Define the DTMF that the called party should send to bridge the call. Allowed Values : 0-9, #, * |
 **group_confirm_file** | **string**| Specify the audio file you want to play when the called party picks up the call |
 **method** | **string**| Specifies the HTTP method used to request the required URL once call connects. | [optional]
 **status_call_back_url** | **string**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. | [optional]
 **status_call_back_method** | **string**| Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. | [optional]
 **fall_back_url** | **string**| URL requested if the initial Url parameter fails or encounters an error | [optional]
 **fall_back_method** | **string**| Specifies the HTTP method used to request the required FallbackUrl once call connects. | [optional]
 **heart_beat_url** | **string**| URL that can be requested every 60 seconds during the call to notify of elapsed time and pass other general information. | [optional]
 **heart_beat_method** | **string**| Specifies the HTTP method used to request HeartbeatUrl. | [optional]
 **timeout** | **int**| Time (in seconds) we should wait while the call is ringing before canceling the call | [optional]
 **play_dtmf** | **string**| DTMF Digits to play to the call once it connects. 0-9, #, or * | [optional]
 **hide_caller_id** | **string**| Specifies if the caller id will be hidden | [optional]
 **record** | **bool**| Specifies if the call should be recorded | [optional]
 **record_call_back_url** | **string**| Recording parameters will be sent here upon completion | [optional]
 **record_call_back_method** | **string**| Method used to request the RecordCallback URL. | [optional]
 **transcribe** | **bool**| Specifies if the call recording should be transcribed | [optional]
 **transcribe_call_back_url** | **string**| Transcription parameters will be sent here upon completion | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **callsInterruptcalls**
> string callsInterruptcalls($call_sid, $url, $method, $status)

Interrupt Call

Interrupt the Call by Call Sid

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\CallApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$call_sid = "call_sid_example"; // string | The unique identifier for voice call that is in progress.
$url = "url_example"; // string | URL the in-progress call will be redirected to
$method = "method_example"; // string | The method used to request the above Url parameter
$status = "status_example"; // string | Status to set the in-progress call to

try {
    $result = $apiInstance->callsInterruptcalls($call_sid, $url, $method, $status);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CallApi->callsInterruptcalls: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **call_sid** | **string**| The unique identifier for voice call that is in progress. |
 **url** | **string**| URL the in-progress call will be redirected to | [optional]
 **method** | **string**| The method used to request the above Url parameter | [optional]
 **status** | **string**| Status to set the in-progress call to | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **callsListcalls**
> string callsListcalls($page, $page_size, $to, $from, $date_created)

List Calls

A list of calls associated with your Ytel account

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\CallApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$page = 1; // int | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
$page_size = 10; // int | Number of individual resources listed in the response per page
$to = "to_example"; // string | Filter calls that were sent to this 10-digit number (E.164 format).
$from = "from_example"; // string | Filter calls that were sent from this 10-digit number (E.164 format).
$date_created = "date_created_example"; // string | Return calls that are from a specified date.

try {
    $result = $apiInstance->callsListcalls($page, $page_size, $to, $from, $date_created);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CallApi->callsListcalls: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **page_size** | **int**| Number of individual resources listed in the response per page | [optional] [default to 10]
 **to** | **string**| Filter calls that were sent to this 10-digit number (E.164 format). | [optional]
 **from** | **string**| Filter calls that were sent from this 10-digit number (E.164 format). | [optional]
 **date_created** | **string**| Return calls that are from a specified date. | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **callsMakecall**
> string callsMakecall($from, $to, $url, $method, $status_call_back_url, $status_call_back_method, $fall_back_url, $fall_back_method, $heart_beat_url, $heart_beat_method, $timeout, $play_dtmf, $hide_caller_id, $record, $record_call_back_url, $record_call_back_method, $transcribe, $transcribe_call_back_url, $if_machine, $if_machine_url, $if_machine_method, $feedback, $survey_id)

Make Call

You can experiment with initiating a call through Ytel and view the request response generated when doing so and get the response in json

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\CallApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$from = "from_example"; // string | A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call.
$to = "to_example"; // string | To number
$url = "url_example"; // string | URL requested once the call connects
$method = "method_example"; // string | Specifies the HTTP method used to request the required URL once call connects.
$status_call_back_url = "status_call_back_url_example"; // string | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
$status_call_back_method = "status_call_back_method_example"; // string | Specifies the HTTP methodlinkclass used to request StatusCallbackUrl.
$fall_back_url = "fall_back_url_example"; // string | URL requested if the initial Url parameter fails or encounters an error
$fall_back_method = "fall_back_method_example"; // string | Specifies the HTTP method used to request the required FallbackUrl once call connects.
$heart_beat_url = "heart_beat_url_example"; // string | URL that can be requested every 60 seconds during the call to notify of elapsed tim
$heart_beat_method = "heart_beat_method_example"; // string | Specifies the HTTP method used to request HeartbeatUrl.
$timeout = 56; // int | Time (in seconds) Ytel should wait while the call is ringing before canceling the call
$play_dtmf = "play_dtmf_example"; // string | DTMF Digits to play to the call once it connects. 0-9, #, or *
$hide_caller_id = true; // bool | Specifies if the caller id will be hidden
$record = true; // bool | Specifies if the call should be recorded
$record_call_back_url = "record_call_back_url_example"; // string | Recording parameters will be sent here upon completion
$record_call_back_method = "record_call_back_method_example"; // string | Method used to request the RecordCallback URL.
$transcribe = true; // bool | Specifies if the call recording should be transcribed
$transcribe_call_back_url = "transcribe_call_back_url_example"; // string | Transcription parameters will be sent here upon completion
$if_machine = "if_machine_example"; // string | How Ytel should handle the receiving numbers voicemail machine
$if_machine_url = "if_machine_url_example"; // string | URL requested when IfMachine=continue
$if_machine_method = "if_machine_method_example"; // string | Method used to request the IfMachineUrl.
$feedback = true; // bool | Specify if survey should be enable or not
$survey_id = "survey_id_example"; // string | The unique identifier for the survey.

try {
    $result = $apiInstance->callsMakecall($from, $to, $url, $method, $status_call_back_url, $status_call_back_method, $fall_back_url, $fall_back_method, $heart_beat_url, $heart_beat_method, $timeout, $play_dtmf, $hide_caller_id, $record, $record_call_back_url, $record_call_back_method, $transcribe, $transcribe_call_back_url, $if_machine, $if_machine_url, $if_machine_method, $feedback, $survey_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CallApi->callsMakecall: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **string**| A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call. |
 **to** | **string**| To number |
 **url** | **string**| URL requested once the call connects |
 **method** | **string**| Specifies the HTTP method used to request the required URL once call connects. | [optional]
 **status_call_back_url** | **string**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. | [optional]
 **status_call_back_method** | **string**| Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. | [optional]
 **fall_back_url** | **string**| URL requested if the initial Url parameter fails or encounters an error | [optional]
 **fall_back_method** | **string**| Specifies the HTTP method used to request the required FallbackUrl once call connects. | [optional]
 **heart_beat_url** | **string**| URL that can be requested every 60 seconds during the call to notify of elapsed tim | [optional]
 **heart_beat_method** | **string**| Specifies the HTTP method used to request HeartbeatUrl. | [optional]
 **timeout** | **int**| Time (in seconds) Ytel should wait while the call is ringing before canceling the call | [optional]
 **play_dtmf** | **string**| DTMF Digits to play to the call once it connects. 0-9, #, or * | [optional]
 **hide_caller_id** | **bool**| Specifies if the caller id will be hidden | [optional]
 **record** | **bool**| Specifies if the call should be recorded | [optional]
 **record_call_back_url** | **string**| Recording parameters will be sent here upon completion | [optional]
 **record_call_back_method** | **string**| Method used to request the RecordCallback URL. | [optional]
 **transcribe** | **bool**| Specifies if the call recording should be transcribed | [optional]
 **transcribe_call_back_url** | **string**| Transcription parameters will be sent here upon completion | [optional]
 **if_machine** | **string**| How Ytel should handle the receiving numbers voicemail machine | [optional]
 **if_machine_url** | **string**| URL requested when IfMachine&#x3D;continue | [optional]
 **if_machine_method** | **string**| Method used to request the IfMachineUrl. | [optional]
 **feedback** | **bool**| Specify if survey should be enable or not | [optional]
 **survey_id** | **string**| The unique identifier for the survey. | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **callsMakervm**
> string callsMakervm($from, $rvm_caller_id, $to, $voice_mail_url, $method, $status_call_back_url, $stats_call_back_method)

Send RVM

Initiate an outbound Ringless Voicemail through Ytel.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\CallApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$from = "from_example"; // string | A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call.
$rvm_caller_id = "rvm_caller_id_example"; // string | A required secondary Caller ID for RVM to work.
$to = "to_example"; // string | A valid number (E.164 format) that will receive the phone call.
$voice_mail_url = "voice_mail_url_example"; // string | The URL requested once the RVM connects. A set of default parameters will be sent here.
$method = "GET"; // string | Specifies the HTTP method used to request the required URL once call connects.
$status_call_back_url = "status_call_back_url_example"; // string | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
$stats_call_back_method = "stats_call_back_method_example"; // string | Specifies the HTTP method used to request the required StatusCallBackUrl once call connects.

try {
    $result = $apiInstance->callsMakervm($from, $rvm_caller_id, $to, $voice_mail_url, $method, $status_call_back_url, $stats_call_back_method);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CallApi->callsMakervm: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **string**| A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call. |
 **rvm_caller_id** | **string**| A required secondary Caller ID for RVM to work. |
 **to** | **string**| A valid number (E.164 format) that will receive the phone call. |
 **voice_mail_url** | **string**| The URL requested once the RVM connects. A set of default parameters will be sent here. |
 **method** | **string**| Specifies the HTTP method used to request the required URL once call connects. | [optional] [default to GET]
 **status_call_back_url** | **string**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. | [optional]
 **stats_call_back_method** | **string**| Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **callsPlayaudios**
> string callsPlayaudios($call_sid, $audio_url, $say_text, $length, $direction, $mix)

Play Audio

Play Audio from a url

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\CallApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$call_sid = "call_sid_example"; // string | The unique identifier of each call resource
$audio_url = "audio_url_example"; // string | URL to sound that should be played. You also can add more than one audio file using semicolons e.g. http://example.com/audio1.mp3;http://example.com/audio2.wav
$say_text = "say_text_example"; // string | Valid alphanumeric string that should be played to the In-progress call.
$length = 56; // int | Time limit in seconds for audio play back
$direction = "direction_example"; // string | The leg of the call audio will be played to
$mix = true; // bool | If false, all other audio will be muted

try {
    $result = $apiInstance->callsPlayaudios($call_sid, $audio_url, $say_text, $length, $direction, $mix);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CallApi->callsPlayaudios: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **call_sid** | **string**| The unique identifier of each call resource |
 **audio_url** | **string**| URL to sound that should be played. You also can add more than one audio file using semicolons e.g. http://example.com/audio1.mp3;http://example.com/audio2.wav |
 **say_text** | **string**| Valid alphanumeric string that should be played to the In-progress call. |
 **length** | **int**| Time limit in seconds for audio play back | [optional]
 **direction** | **string**| The leg of the call audio will be played to | [optional]
 **mix** | **bool**| If false, all other audio will be muted | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **callsRecordcalls**
> string callsRecordcalls($call_sid, $record, $direction, $time_limit, $call_back_url, $fileformat)

Record Call

Start or stop recording of an in-progress voice call.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\CallApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$call_sid = "call_sid_example"; // string | The unique identifier of each call resource
$record = true; // bool | Set true to initiate recording or false to terminate recording
$direction = "direction_example"; // string | The leg of the call to record
$time_limit = 56; // int | Time in seconds the recording duration should not exceed
$call_back_url = "call_back_url_example"; // string | URL consulted after the recording completes
$fileformat = "fileformat_example"; // string | Format of the recording file. Can be .mp3 or .wav

try {
    $result = $apiInstance->callsRecordcalls($call_sid, $record, $direction, $time_limit, $call_back_url, $fileformat);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CallApi->callsRecordcalls: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **call_sid** | **string**| The unique identifier of each call resource |
 **record** | **bool**| Set true to initiate recording or false to terminate recording |
 **direction** | **string**| The leg of the call to record | [optional]
 **time_limit** | **int**| Time in seconds the recording duration should not exceed | [optional]
 **call_back_url** | **string**| URL consulted after the recording completes | [optional]
 **fileformat** | **string**| Format of the recording file. Can be .mp3 or .wav | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **callsSenddigits**
> string callsSenddigits($call_sid, $play_dtmf, $play_dtmf_direction)

Play DTMF

Play Dtmf and send the Digit

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\CallApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$call_sid = "call_sid_example"; // string | The unique identifier of each call resource
$play_dtmf = "play_dtmf_example"; // string | DTMF digits to play to the call. 0-9, #, *, W, or w
$play_dtmf_direction = "play_dtmf_direction_example"; // string | The leg of the call DTMF digits should be sent to

try {
    $result = $apiInstance->callsSenddigits($call_sid, $play_dtmf, $play_dtmf_direction);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CallApi->callsSenddigits: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **call_sid** | **string**| The unique identifier of each call resource |
 **play_dtmf** | **string**| DTMF digits to play to the call. 0-9, #, *, W, or w |
 **play_dtmf_direction** | **string**| The leg of the call DTMF digits should be sent to | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **callsViewcalldetail**
> string callsViewcalldetail($call_sid)

View Call Details

Retrieve a single voice call’s information by its CallSid.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\CallApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$call_sid = "call_sid_example"; // string | The unique identifier for the voice call.

try {
    $result = $apiInstance->callsViewcalldetail($call_sid);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CallApi->callsViewcalldetail: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **call_sid** | **string**| The unique identifier for the voice call. |

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **callsViewcalls**
> string callsViewcalls($callsid)

View Call

Retrieve a single voice call’s information by its CallSid.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\CallApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$callsid = "callsid_example"; // string | The unique identifier for the voice call.

try {
    $result = $apiInstance->callsViewcalls($callsid);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CallApi->callsViewcalls: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callsid** | **string**| The unique identifier for the voice call. |

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **callsVoiceeffect**
> string callsVoiceeffect($call_sid, $audio_direction, $pitch_semi_tones, $pitch_octaves, $pitch, $rate, $tempo)

Voice Effect

Add audio voice effects to the an in-progress voice call.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\CallApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$call_sid = "call_sid_example"; // string | The unique identifier for the in-progress voice call.
$audio_direction = "audio_direction_example"; // string | The direction the audio effect should be placed on. If IN, the effects will occur on the incoming audio stream. If OUT, the effects will occur on the outgoing audio stream.
$pitch_semi_tones = 1.2; // double | Set the pitch in semitone (half-step) intervals. Value between -14 and 14
$pitch_octaves = 1.2; // double | Set the pitch in octave intervals.. Value between -1 and 1
$pitch = 1.2; // double | Set the pitch (lowness/highness) of the audio. The higher the value, the higher the pitch. Value greater than 0
$rate = 1.2; // double | Set the rate for audio. The lower the value, the lower the rate. value greater than 0
$tempo = 1.2; // double | Set the tempo (speed) of the audio. A higher value denotes a faster tempo. Value greater than 0

try {
    $result = $apiInstance->callsVoiceeffect($call_sid, $audio_direction, $pitch_semi_tones, $pitch_octaves, $pitch, $rate, $tempo);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CallApi->callsVoiceeffect: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **call_sid** | **string**| The unique identifier for the in-progress voice call. |
 **audio_direction** | **string**| The direction the audio effect should be placed on. If IN, the effects will occur on the incoming audio stream. If OUT, the effects will occur on the outgoing audio stream. | [optional]
 **pitch_semi_tones** | **double**| Set the pitch in semitone (half-step) intervals. Value between -14 and 14 | [optional]
 **pitch_octaves** | **double**| Set the pitch in octave intervals.. Value between -1 and 1 | [optional]
 **pitch** | **double**| Set the pitch (lowness/highness) of the audio. The higher the value, the higher the pitch. Value greater than 0 | [optional]
 **rate** | **double**| Set the rate for audio. The lower the value, the lower the rate. value greater than 0 | [optional]
 **tempo** | **double**| Set the tempo (speed) of the audio. A higher value denotes a faster tempo. Value greater than 0 | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

