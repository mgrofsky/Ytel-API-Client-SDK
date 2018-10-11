# Swagger\Client\ConferenceApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conferencesAddParticipant**](ConferenceApi.md#conferencesAddParticipant) | **POST** /conferences/addParticipant.json | Add Participant
[**conferencesCreateConference**](ConferenceApi.md#conferencesCreateConference) | **POST** /conferences/createConference.json | Create Conference
[**conferencesDeafMuteParticipant**](ConferenceApi.md#conferencesDeafMuteParticipant) | **POST** /conferences/deafMuteParticipant.json | Silence Participant
[**conferencesHangupParticipant**](ConferenceApi.md#conferencesHangupParticipant) | **POST** /conferences/hangupParticipant.json | Hangup Participant
[**conferencesListParticipant**](ConferenceApi.md#conferencesListParticipant) | **POST** /conferences/listParticipant.json | List Participants
[**conferencesListconference**](ConferenceApi.md#conferencesListconference) | **POST** /conferences/listconference.json | List Conferences
[**conferencesPlayAudio**](ConferenceApi.md#conferencesPlayAudio) | **POST** /conferences/playAudio.json | Play Audio
[**conferencesViewParticipant**](ConferenceApi.md#conferencesViewParticipant) | **POST** /conferences/viewParticipant.json | View Participant
[**conferencesViewconference**](ConferenceApi.md#conferencesViewconference) | **POST** /conferences/viewconference.json | View Conference


# **conferencesAddParticipant**
> string conferencesAddParticipant($conference_sid, $participant_number, $muted, $deaf)

Add Participant

Add Participant in conference

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\ConferenceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$conference_sid = "conference_sid_example"; // string | The unique identifier for a conference object.
$participant_number = "participant_number_example"; // string | The phone number of the participant to be added.
$muted = true; // bool | Specifies if participant should be muted.
$deaf = true; // bool | Specifies if the participant should hear audio in the conference.

try {
    $result = $apiInstance->conferencesAddParticipant($conference_sid, $participant_number, $muted, $deaf);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConferenceApi->conferencesAddParticipant: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conference_sid** | **string**| The unique identifier for a conference object. |
 **participant_number** | **string**| The phone number of the participant to be added. |
 **muted** | **bool**| Specifies if participant should be muted. | [optional]
 **deaf** | **bool**| Specifies if the participant should hear audio in the conference. | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **conferencesCreateConference**
> string conferencesCreateConference($from, $to, $url, $method, $status_call_back_url, $status_call_back_method, $fallback_url, $fallback_method, $record, $record_call_back_url, $record_call_back_method, $schedule_time, $timeout)

Create Conference

Here you can experiment with initiating a conference call through Ytel and view the request response generated when doing so.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\ConferenceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$from = "from_example"; // string | A valid 10-digit number (E.164 format) that will be initiating the conference call.
$to = "to_example"; // string | A valid 10-digit number (E.164 format) that is to receive the conference call.
$url = "url_example"; // string | URL requested once the conference connects
$method = "POST"; // string | Specifies the HTTP method used to request the required URL once call connects.
$status_call_back_url = "status_call_back_url_example"; // string | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the conference is finished.
$status_call_back_method = "status_call_back_method_example"; // string | Specifies the HTTP methodlinkclass used to request StatusCallbackUrl.
$fallback_url = "fallback_url_example"; // string | URL requested if the initial Url parameter fails or encounters an error
$fallback_method = "fallback_method_example"; // string | Specifies the HTTP method used to request the required FallbackUrl once call connects.
$record = true; // bool | Specifies if the conference should be recorded.
$record_call_back_url = "record_call_back_url_example"; // string | Recording parameters will be sent here upon completion.
$record_call_back_method = "record_call_back_method_example"; // string | Specifies the HTTP method used to request the required URL once conference connects.
$schedule_time = "schedule_time_example"; // string | Schedule conference in future. Schedule time must be greater than current time
$timeout = 56; // int | The number of seconds the call stays on the line while waiting for an answer. The max time limit is 999 and the default limit is 60 seconds but lower times can be set.

try {
    $result = $apiInstance->conferencesCreateConference($from, $to, $url, $method, $status_call_back_url, $status_call_back_method, $fallback_url, $fallback_method, $record, $record_call_back_url, $record_call_back_method, $schedule_time, $timeout);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConferenceApi->conferencesCreateConference: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **string**| A valid 10-digit number (E.164 format) that will be initiating the conference call. |
 **to** | **string**| A valid 10-digit number (E.164 format) that is to receive the conference call. |
 **url** | **string**| URL requested once the conference connects |
 **method** | **string**| Specifies the HTTP method used to request the required URL once call connects. | [optional] [default to POST]
 **status_call_back_url** | **string**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the conference is finished. | [optional]
 **status_call_back_method** | **string**| Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. | [optional]
 **fallback_url** | **string**| URL requested if the initial Url parameter fails or encounters an error | [optional]
 **fallback_method** | **string**| Specifies the HTTP method used to request the required FallbackUrl once call connects. | [optional]
 **record** | **bool**| Specifies if the conference should be recorded. | [optional]
 **record_call_back_url** | **string**| Recording parameters will be sent here upon completion. | [optional]
 **record_call_back_method** | **string**| Specifies the HTTP method used to request the required URL once conference connects. | [optional]
 **schedule_time** | **string**| Schedule conference in future. Schedule time must be greater than current time | [optional]
 **timeout** | **int**| The number of seconds the call stays on the line while waiting for an answer. The max time limit is 999 and the default limit is 60 seconds but lower times can be set. | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **conferencesDeafMuteParticipant**
> string conferencesDeafMuteParticipant($conference_sid, $participant_sid, $muted, $deaf)

Silence Participant

Deaf Mute Participant

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\ConferenceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$conference_sid = "conference_sid_example"; // string | ID of the active conference
$participant_sid = "participant_sid_example"; // string | ID of an active participant
$muted = true; // bool | Mute a participant
$deaf = true; // bool | Make it so a participant cant hear

try {
    $result = $apiInstance->conferencesDeafMuteParticipant($conference_sid, $participant_sid, $muted, $deaf);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConferenceApi->conferencesDeafMuteParticipant: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conference_sid** | **string**| ID of the active conference |
 **participant_sid** | **string**| ID of an active participant |
 **muted** | **bool**| Mute a participant | [optional]
 **deaf** | **bool**| Make it so a participant cant hear | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **conferencesHangupParticipant**
> string conferencesHangupParticipant($conference_sid, $participant_sid)

Hangup Participant

Remove a participant from a conference.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\ConferenceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$conference_sid = "conference_sid_example"; // string | The unique identifier for a conference object.
$participant_sid = "participant_sid_example"; // string | The unique identifier for a participant object.

try {
    $result = $apiInstance->conferencesHangupParticipant($conference_sid, $participant_sid);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConferenceApi->conferencesHangupParticipant: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conference_sid** | **string**| The unique identifier for a conference object. |
 **participant_sid** | **string**| The unique identifier for a participant object. |

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **conferencesListParticipant**
> string conferencesListParticipant($conference_sid, $page, $pagesize, $muted, $deaf)

List Participants

Retrieve a list of participants for an in-progress conference.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\ConferenceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$conference_sid = "conference_sid_example"; // string | The unique identifier for a conference.
$page = 1; // int | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
$pagesize = 10; // int | The count of objects to return per page.
$muted = true; // bool | Specifies if participant should be muted.
$deaf = true; // bool | Specifies if the participant should hear audio in the conference.

try {
    $result = $apiInstance->conferencesListParticipant($conference_sid, $page, $pagesize, $muted, $deaf);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConferenceApi->conferencesListParticipant: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conference_sid** | **string**| The unique identifier for a conference. |
 **page** | **int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **int**| The count of objects to return per page. | [optional] [default to 10]
 **muted** | **bool**| Specifies if participant should be muted. | [optional]
 **deaf** | **bool**| Specifies if the participant should hear audio in the conference. | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **conferencesListconference**
> string conferencesListconference($page, $pagesize, $friendly_name, $date_created)

List Conferences

Retrieve a list of conference objects.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\ConferenceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$page = 1; // int | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
$pagesize = 10; // int | Number of individual resources listed in the response per page
$friendly_name = "friendly_name_example"; // string | Only return conferences with the specified FriendlyName
$date_created = "date_created_example"; // string | Conference created date

try {
    $result = $apiInstance->conferencesListconference($page, $pagesize, $friendly_name, $date_created);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConferenceApi->conferencesListconference: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **int**| Number of individual resources listed in the response per page | [optional] [default to 10]
 **friendly_name** | **string**| Only return conferences with the specified FriendlyName | [optional]
 **date_created** | **string**| Conference created date | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **conferencesPlayAudio**
> string conferencesPlayAudio($conference_sid, $participant_sid, $audio_url)

Play Audio

Play an audio file during a conference.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\ConferenceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$conference_sid = "conference_sid_example"; // string | The unique identifier for a conference object.
$participant_sid = "participant_sid_example"; // string | The unique identifier for a participant object.
$audio_url = "audio_url_example"; // string | The URL for the audio file that is to be played during the conference. Multiple audio files can be chained by using a semicolon.

try {
    $result = $apiInstance->conferencesPlayAudio($conference_sid, $participant_sid, $audio_url);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConferenceApi->conferencesPlayAudio: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conference_sid** | **string**| The unique identifier for a conference object. |
 **participant_sid** | **string**| The unique identifier for a participant object. |
 **audio_url** | **string**| The URL for the audio file that is to be played during the conference. Multiple audio files can be chained by using a semicolon. |

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **conferencesViewParticipant**
> string conferencesViewParticipant($conference_sid, $participant_sid)

View Participant

Retrieve information about a participant by its ParticipantSid.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\ConferenceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$conference_sid = "conference_sid_example"; // string | The unique identifier for a conference object.
$participant_sid = "participant_sid_example"; // string | The unique identifier for a participant object.

try {
    $result = $apiInstance->conferencesViewParticipant($conference_sid, $participant_sid);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConferenceApi->conferencesViewParticipant: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conference_sid** | **string**| The unique identifier for a conference object. |
 **participant_sid** | **string**| The unique identifier for a participant object. |

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **conferencesViewconference**
> string conferencesViewconference($conference_sid)

View Conference

Retrieve information about a conference by its ConferenceSid.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\ConferenceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$conference_sid = "conference_sid_example"; // string | The unique identifier of each conference resource

try {
    $result = $apiInstance->conferencesViewconference($conference_sid);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConferenceApi->conferencesViewconference: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conference_sid** | **string**| The unique identifier of each conference resource |

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

