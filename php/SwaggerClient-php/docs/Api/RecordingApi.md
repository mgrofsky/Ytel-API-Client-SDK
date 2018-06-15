# Swagger\Client\RecordingApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**recordingDeleterecording**](RecordingApi.md#recordingDeleterecording) | **POST** /recording/deleterecording.json | Delete Recording
[**recordingListrecording**](RecordingApi.md#recordingListrecording) | **POST** /recording/listrecording.json | List Recordings
[**recordingViewrecording**](RecordingApi.md#recordingViewrecording) | **POST** /recording/viewrecording.json | View Recording


# **recordingDeleterecording**
> string recordingDeleterecording($recordingsid)

Delete Recording

Remove a recording from your Ytel account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\RecordingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$recordingsid = "recordingsid_example"; // string | The unique identifier for a recording.

try {
    $result = $apiInstance->recordingDeleterecording($recordingsid);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RecordingApi->recordingDeleterecording: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordingsid** | **string**| The unique identifier for a recording. |

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **recordingListrecording**
> string recordingListrecording($page, $pagesize, $datecreated, $callsid)

List Recordings

Retrieve a list of recording objects.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\RecordingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$page = 1; // int | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
$pagesize = 10; // int | The count of objects to return per page.
$datecreated = "datecreated_example"; // string | Filter results by creation date
$callsid = "callsid_example"; // string | The unique identifier for a call.

try {
    $result = $apiInstance->recordingListrecording($page, $pagesize, $datecreated, $callsid);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RecordingApi->recordingListrecording: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **int**| The count of objects to return per page. | [optional] [default to 10]
 **datecreated** | **string**| Filter results by creation date | [optional]
 **callsid** | **string**| The unique identifier for a call. | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **recordingViewrecording**
> string recordingViewrecording($recordingsid)

View Recording

Retrieve the recording of a call by its RecordingSid. This resource will return information regarding the call such as start time, end time, duration, and so forth.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\RecordingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$recordingsid = "recordingsid_example"; // string | The unique identifier for the recording.

try {
    $result = $apiInstance->recordingViewrecording($recordingsid);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RecordingApi->recordingViewrecording: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordingsid** | **string**| The unique identifier for the recording. |

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

