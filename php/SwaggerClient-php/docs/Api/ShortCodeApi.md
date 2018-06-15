# Swagger\Client\ShortCodeApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dedicatedshortcodeGetinboundsms**](ShortCodeApi.md#dedicatedshortcodeGetinboundsms) | **POST** /dedicatedshortcode/getinboundsms.json | List Inbound SMS
[**dedicatedshortcodeListshortcode**](ShortCodeApi.md#dedicatedshortcodeListshortcode) | **POST** /dedicatedshortcode/listshortcode.json | List Shortcodes
[**dedicatedshortcodeSendsms**](ShortCodeApi.md#dedicatedshortcodeSendsms) | **POST** /dedicatedshortcode/sendsms.json | Send SMS
[**dedicatedshortcodeUpdateshortcode**](ShortCodeApi.md#dedicatedshortcodeUpdateshortcode) | **POST** /dedicatedshortcode/updateshortcode.json | Update Shortcode
[**dedicatedshortcodeViewshortcode**](ShortCodeApi.md#dedicatedshortcodeViewshortcode) | **POST** /dedicatedshortcode/viewshortcode.json | View SMS
[**shortcodeListsms**](ShortCodeApi.md#shortcodeListsms) | **POST** /shortcode/listsms.json | List SMS
[**shortcodeViewsms**](ShortCodeApi.md#shortcodeViewsms) | **POST** /shortcode/viewsms.json | View SMS


# **dedicatedshortcodeGetinboundsms**
> string dedicatedshortcodeGetinboundsms($page, $pagesize, $from, $shortcode, $datecreated)

List Inbound SMS

Retrive a list of inbound Sms Short Code messages associated with your Ytel account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\ShortCodeApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$page = 1; // int | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
$pagesize = 10; // int | Number of individual resources listed in the response per page
$from = "from_example"; // string | Only list SMS messages sent from this number
$shortcode = "shortcode_example"; // string | Only list SMS messages sent to Shortcode
$datecreated = "datecreated_example"; // string | Only list SMS messages sent in the specified date MAKE REQUEST

try {
    $result = $apiInstance->dedicatedshortcodeGetinboundsms($page, $pagesize, $from, $shortcode, $datecreated);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ShortCodeApi->dedicatedshortcodeGetinboundsms: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **int**| Number of individual resources listed in the response per page | [optional] [default to 10]
 **from** | **string**| Only list SMS messages sent from this number | [optional]
 **shortcode** | **string**| Only list SMS messages sent to Shortcode | [optional]
 **datecreated** | **string**| Only list SMS messages sent in the specified date MAKE REQUEST | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **dedicatedshortcodeListshortcode**
> string dedicatedshortcodeListshortcode($shortcode, $page, $pagesize)

List Shortcodes

Retrieve a list of Short Code assignment associated with your Ytel account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\ShortCodeApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$shortcode = "shortcode_example"; // string | Only list Short Code Assignment sent from this Short Code
$page = "page_example"; // string | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
$pagesize = "pagesize_example"; // string | The count of objects to return per page.

try {
    $result = $apiInstance->dedicatedshortcodeListshortcode($shortcode, $page, $pagesize);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ShortCodeApi->dedicatedshortcodeListshortcode: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **string**| Only list Short Code Assignment sent from this Short Code | [optional]
 **page** | **string**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional]
 **pagesize** | **string**| The count of objects to return per page. | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **dedicatedshortcodeSendsms**
> string dedicatedshortcodeSendsms($shortcode, $to, $body, $method, $messagestatuscallback)

Send SMS

Send Dedicated Shortcode

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\ShortCodeApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$shortcode = 56; // int | Your dedicated shortcode
$to = 1.2; // double | The number to send your SMS to
$body = "body_example"; // string | The body of your message
$method = "method_example"; // string | Specifies the HTTP method used to request the required URL once the Short Code message is sent.GET or POST
$messagestatuscallback = "messagestatuscallback_example"; // string | URL that can be requested to receive notification when Short Code message was sent.

try {
    $result = $apiInstance->dedicatedshortcodeSendsms($shortcode, $to, $body, $method, $messagestatuscallback);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ShortCodeApi->dedicatedshortcodeSendsms: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **int**| Your dedicated shortcode |
 **to** | **double**| The number to send your SMS to |
 **body** | **string**| The body of your message |
 **method** | **string**| Specifies the HTTP method used to request the required URL once the Short Code message is sent.GET or POST | [optional]
 **messagestatuscallback** | **string**| URL that can be requested to receive notification when Short Code message was sent. | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **dedicatedshortcodeUpdateshortcode**
> string dedicatedshortcodeUpdateshortcode($shortcode, $friendly_name, $callback_method, $callback_url, $fallback_method, $fallback_url)

Update Shortcode

Update a dedicated shortcode.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\ShortCodeApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$shortcode = "shortcode_example"; // string | List of valid dedicated shortcode to your Ytel account.
$friendly_name = "friendly_name_example"; // string | User generated name of the dedicated shortcode.
$callback_method = "callback_method_example"; // string | Specifies the HTTP method used to request the required StatusCallBackUrl once call connects.
$callback_url = "callback_url_example"; // string | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
$fallback_method = "fallback_method_example"; // string | Specifies the HTTP method used to request the required FallbackUrl once call connects.
$fallback_url = "fallback_url_example"; // string | URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST.

try {
    $result = $apiInstance->dedicatedshortcodeUpdateshortcode($shortcode, $friendly_name, $callback_method, $callback_url, $fallback_method, $fallback_url);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ShortCodeApi->dedicatedshortcodeUpdateshortcode: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **string**| List of valid dedicated shortcode to your Ytel account. |
 **friendly_name** | **string**| User generated name of the dedicated shortcode. | [optional]
 **callback_method** | **string**| Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. | [optional]
 **callback_url** | **string**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. | [optional]
 **fallback_method** | **string**| Specifies the HTTP method used to request the required FallbackUrl once call connects. | [optional]
 **fallback_url** | **string**| URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST. | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **dedicatedshortcodeViewshortcode**
> string dedicatedshortcodeViewshortcode($shortcode)

View SMS

Retrieve a single Short Code object by its shortcode assignment.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\ShortCodeApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$shortcode = "shortcode_example"; // string | List of valid Dedicated Short Code to your Ytel account

try {
    $result = $apiInstance->dedicatedshortcodeViewshortcode($shortcode);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ShortCodeApi->dedicatedshortcodeViewshortcode: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **string**| List of valid Dedicated Short Code to your Ytel account |

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **shortcodeListsms**
> string shortcodeListsms($shortcode, $to, $date_sent, $page, $page_size)

List SMS

Retrieve a list of Short Code messages.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\ShortCodeApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$shortcode = "shortcode_example"; // string | Only list messages sent from this Short Code
$to = "to_example"; // string | Only list messages sent to this number
$date_sent = "date_sent_example"; // string | Only list messages sent with the specified date
$page = 1; // int | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
$page_size = 10; // int | The count of objects to return per page.

try {
    $result = $apiInstance->shortcodeListsms($shortcode, $to, $date_sent, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ShortCodeApi->shortcodeListsms: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **string**| Only list messages sent from this Short Code | [optional]
 **to** | **string**| Only list messages sent to this number | [optional]
 **date_sent** | **string**| Only list messages sent with the specified date | [optional]
 **page** | **int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **page_size** | **int**| The count of objects to return per page. | [optional] [default to 10]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **shortcodeViewsms**
> string shortcodeViewsms($message_sid)

View SMS

View a single Sms Short Code message.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\ShortCodeApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$message_sid = "message_sid_example"; // string | The unique identifier for the sms resource

try {
    $result = $apiInstance->shortcodeViewsms($message_sid);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ShortCodeApi->shortcodeViewsms: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message_sid** | **string**| The unique identifier for the sms resource |

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

