# Swagger\Client\TranscriptionApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transcriptionsAudiourltranscription**](TranscriptionApi.md#transcriptionsAudiourltranscription) | **POST** /transcriptions/audiourltranscription.json | Transcribe Audio URL
[**transcriptionsListtranscription**](TranscriptionApi.md#transcriptionsListtranscription) | **POST** /transcriptions/listtranscription.json | List Transcriptions
[**transcriptionsRecordingtranscription**](TranscriptionApi.md#transcriptionsRecordingtranscription) | **POST** /transcriptions/recordingtranscription.json | Transcribe Recording
[**transcriptionsViewtranscription**](TranscriptionApi.md#transcriptionsViewtranscription) | **POST** /transcriptions/viewtranscription.json | View Transcription


# **transcriptionsAudiourltranscription**
> string transcriptionsAudiourltranscription($audiourl)

Transcribe Audio URL

Transcribe an audio recording from a file.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\TranscriptionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$audiourl = "audiourl_example"; // string | URL pointing to the location of the audio file that is to be transcribed.

try {
    $result = $apiInstance->transcriptionsAudiourltranscription($audiourl);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TranscriptionApi->transcriptionsAudiourltranscription: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audiourl** | **string**| URL pointing to the location of the audio file that is to be transcribed. |

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **transcriptionsListtranscription**
> string transcriptionsListtranscription($page, $pagesize, $status, $date_transcribed)

List Transcriptions

Retrieve a list of transcription objects for your Ytel account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\TranscriptionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$page = 1; // int | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
$pagesize = 10; // int | The count of objects to return per page.
$status = "status_example"; // string | The state of the transcription.
$date_transcribed = "date_transcribed_example"; // string | The date the transcription took place.

try {
    $result = $apiInstance->transcriptionsListtranscription($page, $pagesize, $status, $date_transcribed);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TranscriptionApi->transcriptionsListtranscription: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **int**| The count of objects to return per page. | [optional] [default to 10]
 **status** | **string**| The state of the transcription. | [optional]
 **date_transcribed** | **string**| The date the transcription took place. | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **transcriptionsRecordingtranscription**
> string transcriptionsRecordingtranscription($recording_sid)

Transcribe Recording

Transcribe a recording by its RecordingSid.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\TranscriptionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$recording_sid = "recording_sid_example"; // string | The unique identifier for a recording object.

try {
    $result = $apiInstance->transcriptionsRecordingtranscription($recording_sid);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TranscriptionApi->transcriptionsRecordingtranscription: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recording_sid** | **string**| The unique identifier for a recording object. |

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **transcriptionsViewtranscription**
> string transcriptionsViewtranscription($transcriptionsid)

View Transcription

Retrieve information about a transaction by its TranscriptionSid.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\TranscriptionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$transcriptionsid = "transcriptionsid_example"; // string | The unique identifier for a transcription object.

try {
    $result = $apiInstance->transcriptionsViewtranscription($transcriptionsid);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TranscriptionApi->transcriptionsViewtranscription: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transcriptionsid** | **string**| The unique identifier for a transcription object. |

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

