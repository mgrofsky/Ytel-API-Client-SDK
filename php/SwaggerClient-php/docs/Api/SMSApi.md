# Swagger\Client\SMSApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**smsGetinboundsms**](SMSApi.md#smsGetinboundsms) | **POST** /sms/getinboundsms.json | List Inbound SMS
[**smsListsms**](SMSApi.md#smsListsms) | **POST** /sms/listsms.json | List SMS
[**smsSendsms**](SMSApi.md#smsSendsms) | **POST** /sms/sendsms.json | Send SMS
[**smsViewdetailsms**](SMSApi.md#smsViewdetailsms) | **POST** /sms/viewdetailsms.json | View SMS
[**smsViewsms**](SMSApi.md#smsViewsms) | **POST** /sms/viewsms.json | View SMS


# **smsGetinboundsms**
> string smsGetinboundsms($page, $page_size, $from, $to, $date_sent)

List Inbound SMS

Retrieve a list of Inbound SMS message objects.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\SMSApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$page = 1; // int | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
$page_size = 10; // int | The count of objects to return per page.
$from = "from_example"; // string | Filter SMS message objects from this valid 10-digit phone number (E.164 format).
$to = "to_example"; // string | Filter SMS message objects to this valid 10-digit phone number (E.164 format).
$date_sent = "date_sent_example"; // string | Filter sms message objects by this date.

try {
    $result = $apiInstance->smsGetinboundsms($page, $page_size, $from, $to, $date_sent);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SMSApi->smsGetinboundsms: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **page_size** | **int**| The count of objects to return per page. | [optional] [default to 10]
 **from** | **string**| Filter SMS message objects from this valid 10-digit phone number (E.164 format). | [optional]
 **to** | **string**| Filter SMS message objects to this valid 10-digit phone number (E.164 format). | [optional]
 **date_sent** | **string**| Filter sms message objects by this date. | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **smsListsms**
> string smsListsms($page, $page_size, $from, $to, $date_sent)

List SMS

Retrieve a list of Outbound SMS message objects.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\SMSApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$page = 1; // int | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
$page_size = 10; // int | Number of individual resources listed in the response per page
$from = "from_example"; // string | Filter SMS message objects from this valid 10-digit phone number (E.164 format).
$to = "to_example"; // string | Filter SMS message objects to this valid 10-digit phone number (E.164 format).
$date_sent = "date_sent_example"; // string | Only list SMS messages sent in the specified date range

try {
    $result = $apiInstance->smsListsms($page, $page_size, $from, $to, $date_sent);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SMSApi->smsListsms: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **page_size** | **int**| Number of individual resources listed in the response per page | [optional] [default to 10]
 **from** | **string**| Filter SMS message objects from this valid 10-digit phone number (E.164 format). | [optional]
 **to** | **string**| Filter SMS message objects to this valid 10-digit phone number (E.164 format). | [optional]
 **date_sent** | **string**| Only list SMS messages sent in the specified date range | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **smsSendsms**
> string smsSendsms($from, $to, $body, $method, $message_status_callback, $smartsms, $delivery_status)

Send SMS

Send an SMS from a Ytel number

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\SMSApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$from = "from_example"; // string | The 10-digit SMS-enabled Ytel number (E.164 format) in which the message is sent.
$to = "to_example"; // string | The 10-digit phone number (E.164 format) that will receive the message.
$body = "body_example"; // string | The body message that is to be sent in the text.
$method = "method_example"; // string | Specifies the HTTP method used to request the required URL once SMS sent.
$message_status_callback = "message_status_callback_example"; // string | URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished.
$smartsms = false; // bool | Check's 'to' number can receive sms or not using Carrier API, if wireless = true then text sms is sent, else wireless = false then call is recieved to end user with audible message.
$delivery_status = false; // bool | Delivery reports are a method to tell your system if the message has arrived on the destination phone.

try {
    $result = $apiInstance->smsSendsms($from, $to, $body, $method, $message_status_callback, $smartsms, $delivery_status);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SMSApi->smsSendsms: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **string**| The 10-digit SMS-enabled Ytel number (E.164 format) in which the message is sent. |
 **to** | **string**| The 10-digit phone number (E.164 format) that will receive the message. |
 **body** | **string**| The body message that is to be sent in the text. |
 **method** | **string**| Specifies the HTTP method used to request the required URL once SMS sent. | [optional]
 **message_status_callback** | **string**| URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished. | [optional]
 **smartsms** | **bool**| Check&#39;s &#39;to&#39; number can receive sms or not using Carrier API, if wireless &#x3D; true then text sms is sent, else wireless &#x3D; false then call is recieved to end user with audible message. | [optional] [default to false]
 **delivery_status** | **bool**| Delivery reports are a method to tell your system if the message has arrived on the destination phone. | [optional] [default to false]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **smsViewdetailsms**
> string smsViewdetailsms($message_sid)

View SMS

Retrieve a single SMS message object with details by its SmsSid.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\SMSApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$message_sid = "message_sid_example"; // string | The unique identifier for a sms message.

try {
    $result = $apiInstance->smsViewdetailsms($message_sid);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SMSApi->smsViewdetailsms: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message_sid** | **string**| The unique identifier for a sms message. |

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **smsViewsms**
> string smsViewsms($message_sid)

View SMS

Retrieve a single SMS message object by its SmsSid.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\SMSApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$message_sid = "message_sid_example"; // string | The unique identifier for a sms message.

try {
    $result = $apiInstance->smsViewsms($message_sid);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SMSApi->smsViewsms: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message_sid** | **string**| The unique identifier for a sms message. |

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

