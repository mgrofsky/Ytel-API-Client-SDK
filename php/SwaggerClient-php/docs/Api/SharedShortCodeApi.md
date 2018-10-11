# Swagger\Client\SharedShortCodeApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**keywordLists**](SharedShortCodeApi.md#keywordLists) | **POST** /keyword/lists.json | List Keywords
[**keywordView**](SharedShortCodeApi.md#keywordView) | **POST** /keyword/view.json | View Keyword
[**shortcodeGetinboundsms**](SharedShortCodeApi.md#shortcodeGetinboundsms) | **POST** /shortcode/getinboundsms.json | List Inbound SMS
[**shortcodeListshortcode**](SharedShortCodeApi.md#shortcodeListshortcode) | **POST** /shortcode/listshortcode.json | List Shortcodes
[**shortcodeSendsms**](SharedShortCodeApi.md#shortcodeSendsms) | **POST** /shortcode/sendsms.json | Send SMS
[**shortcodeUpdateshortcode**](SharedShortCodeApi.md#shortcodeUpdateshortcode) | **POST** /shortcode/updateshortcode.json | Update Shortcode
[**shortcodeViewshortcode**](SharedShortCodeApi.md#shortcodeViewshortcode) | **POST** /shortcode/viewshortcode.json | View Shortcode
[**templateLists**](SharedShortCodeApi.md#templateLists) | **POST** /template/lists.json | List Templates
[**templateView**](SharedShortCodeApi.md#templateView) | **POST** /template/view.json | View Template


# **keywordLists**
> string keywordLists($page, $pagesize, $keyword, $shortcode)

List Keywords

Retrieve a list of keywords associated with your Ytel account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\SharedShortCodeApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$page = 1; // int | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
$pagesize = 10; // int | Number of individual resources listed in the response per page
$keyword = "keyword_example"; // string | Only list keywords of keyword
$shortcode = 56; // int | Only list keywords of shortcode

try {
    $result = $apiInstance->keywordLists($page, $pagesize, $keyword, $shortcode);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SharedShortCodeApi->keywordLists: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **int**| Number of individual resources listed in the response per page | [optional] [default to 10]
 **keyword** | **string**| Only list keywords of keyword | [optional]
 **shortcode** | **int**| Only list keywords of shortcode | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **keywordView**
> string keywordView($keywordid)

View Keyword

View a set of properties for a single keyword.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\SharedShortCodeApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$keywordid = "keywordid_example"; // string | The unique identifier of each keyword

try {
    $result = $apiInstance->keywordView($keywordid);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SharedShortCodeApi->keywordView: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keywordid** | **string**| The unique identifier of each keyword |

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **shortcodeGetinboundsms**
> string shortcodeGetinboundsms($page, $pagesize, $from, $shortcode, $datecreated)

List Inbound SMS

List All Inbound ShortCode

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\SharedShortCodeApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$page = 1; // int | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
$pagesize = 10; // int | Number of individual resources listed in the response per page
$from = "from_example"; // string | From Number to Inbound ShortCode
$shortcode = "shortcode_example"; // string | Only list messages sent to this Short Code
$datecreated = "datecreated_example"; // string | Only list messages sent with the specified date

try {
    $result = $apiInstance->shortcodeGetinboundsms($page, $pagesize, $from, $shortcode, $datecreated);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SharedShortCodeApi->shortcodeGetinboundsms: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **int**| Number of individual resources listed in the response per page | [optional] [default to 10]
 **from** | **string**| From Number to Inbound ShortCode | [optional]
 **shortcode** | **string**| Only list messages sent to this Short Code | [optional]
 **datecreated** | **string**| Only list messages sent with the specified date | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **shortcodeListshortcode**
> string shortcodeListshortcode($page, $pagesize, $shortcode)

List Shortcodes

Retrieve a list of shortcode assignment associated with your Ytel account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\SharedShortCodeApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$page = 1; // int | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
$pagesize = 10; // int | Number of individual resources listed in the response per page
$shortcode = "shortcode_example"; // string | Only list keywords of shortcode

try {
    $result = $apiInstance->shortcodeListshortcode($page, $pagesize, $shortcode);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SharedShortCodeApi->shortcodeListshortcode: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **int**| Number of individual resources listed in the response per page | [optional] [default to 10]
 **shortcode** | **string**| Only list keywords of shortcode | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **shortcodeSendsms**
> string shortcodeSendsms($shortcode, $to, $templateid, $data, $method, $message_status_callback)

Send SMS

Send an SMS from a Ytel ShortCode

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\SharedShortCodeApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$shortcode = "shortcode_example"; // string | The Short Code number that is the sender of this message
$to = "to_example"; // string | A valid 10-digit number that should receive the message
$templateid = "templateid_example"; // string | The unique identifier for the template used for the message
$data = "data_example"; // string | format of your data, example: {companyname}:test,{otpcode}:1234
$method = "GET"; // string | Specifies the HTTP method used to request the required URL once the Short Code message is sent.
$message_status_callback = "message_status_callback_example"; // string | URL that can be requested to receive notification when Short Code message was sent.

try {
    $result = $apiInstance->shortcodeSendsms($shortcode, $to, $templateid, $data, $method, $message_status_callback);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SharedShortCodeApi->shortcodeSendsms: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **string**| The Short Code number that is the sender of this message |
 **to** | **string**| A valid 10-digit number that should receive the message |
 **templateid** | [**string**](../Model/.md)| The unique identifier for the template used for the message |
 **data** | **string**| format of your data, example: {companyname}:test,{otpcode}:1234 |
 **method** | **string**| Specifies the HTTP method used to request the required URL once the Short Code message is sent. | [optional] [default to GET]
 **message_status_callback** | **string**| URL that can be requested to receive notification when Short Code message was sent. | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **shortcodeUpdateshortcode**
> string shortcodeUpdateshortcode($shortcode, $friendly_name, $callback_url, $callback_method, $fallback_url, $fallback_url_method)

Update Shortcode

Update Assignment

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\SharedShortCodeApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$shortcode = "shortcode_example"; // string | List of valid shortcode to your Ytel account
$friendly_name = "friendly_name_example"; // string | User generated name of the shortcode
$callback_url = "callback_url_example"; // string | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
$callback_method = "callback_method_example"; // string | Specifies the HTTP method used to request the required StatusCallBackUrl once call connects.
$fallback_url = "fallback_url_example"; // string | URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST.
$fallback_url_method = "fallback_url_method_example"; // string | Specifies the HTTP method used to request the required FallbackUrl once call connects.

try {
    $result = $apiInstance->shortcodeUpdateshortcode($shortcode, $friendly_name, $callback_url, $callback_method, $fallback_url, $fallback_url_method);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SharedShortCodeApi->shortcodeUpdateshortcode: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **string**| List of valid shortcode to your Ytel account |
 **friendly_name** | **string**| User generated name of the shortcode | [optional]
 **callback_url** | **string**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. | [optional]
 **callback_method** | **string**| Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. | [optional]
 **fallback_url** | **string**| URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST. | [optional]
 **fallback_url_method** | **string**| Specifies the HTTP method used to request the required FallbackUrl once call connects. | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **shortcodeViewshortcode**
> string shortcodeViewshortcode($shortcode)

View Shortcode

The response returned here contains all resource properties associated with the given Shortcode.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\SharedShortCodeApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$shortcode = "shortcode_example"; // string | List of valid Shortcode to your Ytel account

try {
    $result = $apiInstance->shortcodeViewshortcode($shortcode);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SharedShortCodeApi->shortcodeViewshortcode: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **string**| List of valid Shortcode to your Ytel account |

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **templateLists**
> string templateLists($type, $page, $pagesize, $shortcode)

List Templates

List Shortcode Templates by Type

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\SharedShortCodeApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$type = "authorization"; // string | The type (category) of template Valid values: marketing, authorization
$page = 1; // int | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
$pagesize = 10; // int | The count of objects to return per page.
$shortcode = "shortcode_example"; // string | Only list templates of type

try {
    $result = $apiInstance->templateLists($type, $page, $pagesize, $shortcode);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SharedShortCodeApi->templateLists: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **string**| The type (category) of template Valid values: marketing, authorization | [optional] [default to authorization]
 **page** | **int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **int**| The count of objects to return per page. | [optional] [default to 10]
 **shortcode** | **string**| Only list templates of type | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **templateView**
> string templateView($template_id)

View Template

View a Shared ShortCode Template

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\SharedShortCodeApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$template_id = "template_id_example"; // string | The unique identifier for a template object

try {
    $result = $apiInstance->templateView($template_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SharedShortCodeApi->templateView: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_id** | [**string**](../Model/.md)| The unique identifier for a template object |

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

