# Swagger\Client\PhoneNumberApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**incomingphoneAvailablenumber**](PhoneNumberApi.md#incomingphoneAvailablenumber) | **POST** /incomingphone/availablenumber.json | Available Numbers
[**incomingphoneBulkbuy**](PhoneNumberApi.md#incomingphoneBulkbuy) | **POST** /incomingphone/bulkbuy.json | Bulk Buy Numbers
[**incomingphoneBuynumber**](PhoneNumberApi.md#incomingphoneBuynumber) | **POST** /incomingphone/buynumber.json | Purchase Number
[**incomingphoneGetdidscore**](PhoneNumberApi.md#incomingphoneGetdidscore) | **POST** /incomingphone/getdidscore.json | Get DID Score
[**incomingphoneListnumber**](PhoneNumberApi.md#incomingphoneListnumber) | **POST** /incomingphone/listnumber.json | List Numbers
[**incomingphoneMassreleasenumber**](PhoneNumberApi.md#incomingphoneMassreleasenumber) | **POST** /incomingphone/massreleasenumber.json | Bulk Release
[**incomingphoneMassupdatenumber**](PhoneNumberApi.md#incomingphoneMassupdatenumber) | **POST** /incomingphone/massupdatenumber.json | Bulk Update Numbers
[**incomingphoneReleasenumberByResponseTypePost**](PhoneNumberApi.md#incomingphoneReleasenumberByResponseTypePost) | **POST** /incomingphone/releasenumber.json | Release Number
[**incomingphoneTransferphonenumbers**](PhoneNumberApi.md#incomingphoneTransferphonenumbers) | **POST** /incomingphone/transferphonenumbers.json | Move Number
[**incomingphoneUpdatenumber**](PhoneNumberApi.md#incomingphoneUpdatenumber) | **POST** /incomingphone/updatenumber.json | Update Number
[**incomingphoneViewnumber**](PhoneNumberApi.md#incomingphoneViewnumber) | **POST** /incomingphone/viewnumber.json | View Details


# **incomingphoneAvailablenumber**
> string incomingphoneAvailablenumber($numbertype, $areacode, $pagesize)

Available Numbers

Retrieve a list of available phone numbers that can be purchased and used for your Ytel account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\PhoneNumberApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$numbertype = "numbertype_example"; // string | Number type either SMS,Voice or all
$areacode = "areacode_example"; // string | Specifies the area code for the returned list of available numbers. Only available for North American numbers.
$pagesize = 10; // int | The count of objects to return.

try {
    $result = $apiInstance->incomingphoneAvailablenumber($numbertype, $areacode, $pagesize);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PhoneNumberApi->incomingphoneAvailablenumber: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **numbertype** | **string**| Number type either SMS,Voice or all |
 **areacode** | **string**| Specifies the area code for the returned list of available numbers. Only available for North American numbers. |
 **pagesize** | **int**| The count of objects to return. | [optional] [default to 10]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **incomingphoneBulkbuy**
> string incomingphoneBulkbuy($number_type, $area_code, $quantity, $leftover)

Bulk Buy Numbers

Purchase a selected number of DID's from specific area codes to be used with your Ytel account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\PhoneNumberApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$number_type = "number_type_example"; // string | The capability the number supports.
$area_code = "area_code_example"; // string | Specifies the area code for the returned list of available numbers. Only available for North American numbers.
$quantity = "quantity_example"; // string | A positive integer that tells how many number you want to buy at a time.
$leftover = "leftover_example"; // string | If desired quantity is unavailable purchase what is available .

try {
    $result = $apiInstance->incomingphoneBulkbuy($number_type, $area_code, $quantity, $leftover);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PhoneNumberApi->incomingphoneBulkbuy: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number_type** | **string**| The capability the number supports. |
 **area_code** | **string**| Specifies the area code for the returned list of available numbers. Only available for North American numbers. |
 **quantity** | **string**| A positive integer that tells how many number you want to buy at a time. |
 **leftover** | **string**| If desired quantity is unavailable purchase what is available . | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **incomingphoneBuynumber**
> string incomingphoneBuynumber($phone_number)

Purchase Number

Purchase a phone number to be used with your Ytel account

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\PhoneNumberApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$phone_number = "phone_number_example"; // string | A valid 10-digit Ytel number (E.164 format).

try {
    $result = $apiInstance->incomingphoneBuynumber($phone_number);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PhoneNumberApi->incomingphoneBuynumber: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone_number** | **string**| A valid 10-digit Ytel number (E.164 format). |

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **incomingphoneGetdidscore**
> string incomingphoneGetdidscore($phonenumber)

Get DID Score

Get DID Score Number

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\PhoneNumberApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$phonenumber = "phonenumber_example"; // string | Specifies the multiple phone numbers for check updated spamscore .

try {
    $result = $apiInstance->incomingphoneGetdidscore($phonenumber);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PhoneNumberApi->incomingphoneGetdidscore: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phonenumber** | **string**| Specifies the multiple phone numbers for check updated spamscore . |

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **incomingphoneListnumber**
> string incomingphoneListnumber($page, $page_size, $number_type, $friendly_name)

List Numbers

Retrieve a list of purchased phones numbers associated with your Ytel account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\PhoneNumberApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$page = 1; // int | Which page of the overall response will be returned. Page indexing starts at 1.
$page_size = 10; // int | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
$number_type = "number_type_example"; // string | The capability supported by the number.Number type either SMS,Voice or all
$friendly_name = "friendly_name_example"; // string | A human-readable label added to the number object.

try {
    $result = $apiInstance->incomingphoneListnumber($page, $page_size, $number_type, $friendly_name);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PhoneNumberApi->incomingphoneListnumber: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| Which page of the overall response will be returned. Page indexing starts at 1. | [optional] [default to 1]
 **page_size** | **int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 10]
 **number_type** | **string**| The capability supported by the number.Number type either SMS,Voice or all | [optional]
 **friendly_name** | **string**| A human-readable label added to the number object. | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **incomingphoneMassreleasenumber**
> string incomingphoneMassreleasenumber($phone_number)

Bulk Release

Remove a purchased Ytel number from your account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\PhoneNumberApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$phone_number = "phone_number_example"; // string | A valid Ytel comma separated numbers (E.164 format).

try {
    $result = $apiInstance->incomingphoneMassreleasenumber($phone_number);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PhoneNumberApi->incomingphoneMassreleasenumber: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone_number** | **string**| A valid Ytel comma separated numbers (E.164 format). |

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **incomingphoneMassupdatenumber**
> string incomingphoneMassupdatenumber($phone_number, $voice_url, $friendly_name, $voice_method, $voice_fallback_url, $voice_fallback_method, $hangup_callback, $hangup_callback_method, $heartbeat_url, $heartbeat_method, $sms_url, $sms_method, $sms_fallback_url, $sms_fallback_method)

Bulk Update Numbers

Update properties for a Ytel numbers that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\PhoneNumberApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$phone_number = "phone_number_example"; // string | A valid comma(,) separated Ytel numbers. (E.164 format).
$voice_url = "voice_url_example"; // string | The URL returning InboundXML incoming calls should execute when connected.
$friendly_name = "friendly_name_example"; // string | A human-readable value for labeling the number.
$voice_method = "voice_method_example"; // string | Specifies the HTTP method used to request the VoiceUrl once incoming call connects.
$voice_fallback_url = "voice_fallback_url_example"; // string | URL used if any errors occur during execution of InboundXML on a call or at initial request of the voice url
$voice_fallback_method = "voice_fallback_method_example"; // string | Specifies the HTTP method used to request the VoiceFallbackUrl once incoming call connects.
$hangup_callback = "hangup_callback_example"; // string | URL that can be requested to receive notification when and how incoming call has ended.
$hangup_callback_method = "hangup_callback_method_example"; // string | The HTTP method Ytel will use when requesting the HangupCallback URL.
$heartbeat_url = "heartbeat_url_example"; // string | URL that can be used to monitor the phone number.
$heartbeat_method = "heartbeat_method_example"; // string | The HTTP method Ytel will use when requesting the HeartbeatUrl.
$sms_url = "sms_url_example"; // string | URL requested when an SMS is received.
$sms_method = "sms_method_example"; // string | The HTTP method Ytel will use when requesting the SmsUrl.
$sms_fallback_url = "sms_fallback_url_example"; // string | URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl.
$sms_fallback_method = "sms_fallback_method_example"; // string | The HTTP method Ytel will use when URL requested if the SmsUrl is not available.

try {
    $result = $apiInstance->incomingphoneMassupdatenumber($phone_number, $voice_url, $friendly_name, $voice_method, $voice_fallback_url, $voice_fallback_method, $hangup_callback, $hangup_callback_method, $heartbeat_url, $heartbeat_method, $sms_url, $sms_method, $sms_fallback_url, $sms_fallback_method);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PhoneNumberApi->incomingphoneMassupdatenumber: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone_number** | **string**| A valid comma(,) separated Ytel numbers. (E.164 format). |
 **voice_url** | **string**| The URL returning InboundXML incoming calls should execute when connected. |
 **friendly_name** | **string**| A human-readable value for labeling the number. | [optional]
 **voice_method** | **string**| Specifies the HTTP method used to request the VoiceUrl once incoming call connects. | [optional]
 **voice_fallback_url** | **string**| URL used if any errors occur during execution of InboundXML on a call or at initial request of the voice url | [optional]
 **voice_fallback_method** | **string**| Specifies the HTTP method used to request the VoiceFallbackUrl once incoming call connects. | [optional]
 **hangup_callback** | **string**| URL that can be requested to receive notification when and how incoming call has ended. | [optional]
 **hangup_callback_method** | **string**| The HTTP method Ytel will use when requesting the HangupCallback URL. | [optional]
 **heartbeat_url** | **string**| URL that can be used to monitor the phone number. | [optional]
 **heartbeat_method** | **string**| The HTTP method Ytel will use when requesting the HeartbeatUrl. | [optional]
 **sms_url** | **string**| URL requested when an SMS is received. | [optional]
 **sms_method** | **string**| The HTTP method Ytel will use when requesting the SmsUrl. | [optional]
 **sms_fallback_url** | **string**| URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl. | [optional]
 **sms_fallback_method** | **string**| The HTTP method Ytel will use when URL requested if the SmsUrl is not available. | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **incomingphoneReleasenumberByResponseTypePost**
> string incomingphoneReleasenumberByResponseTypePost($phone_number, $response_type)

Release Number

Remove a purchased Ytel number from your account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\PhoneNumberApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$phone_number = "phone_number_example"; // string | A valid 10-digit Ytel number (E.164 format).
$response_type = "response_type_example"; // string | Response type format xml or json

try {
    $result = $apiInstance->incomingphoneReleasenumberByResponseTypePost($phone_number, $response_type);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PhoneNumberApi->incomingphoneReleasenumberByResponseTypePost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone_number** | **string**| A valid 10-digit Ytel number (E.164 format). |
 **response_type** | **string**| Response type format xml or json |

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **incomingphoneTransferphonenumbers**
> string incomingphoneTransferphonenumbers($phonenumber, $fromaccountsid, $toaccountsid)

Move Number

Transfer phone number that has been purchased for from one account to another account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\PhoneNumberApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$phonenumber = "phonenumber_example"; // string | A valid 10-digit Ytel number (E.164 format).
$fromaccountsid = "fromaccountsid_example"; // string | A specific Accountsid from where Number is getting transfer.
$toaccountsid = "toaccountsid_example"; // string | A specific Accountsid to which Number is getting transfer.

try {
    $result = $apiInstance->incomingphoneTransferphonenumbers($phonenumber, $fromaccountsid, $toaccountsid);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PhoneNumberApi->incomingphoneTransferphonenumbers: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phonenumber** | **string**| A valid 10-digit Ytel number (E.164 format). |
 **fromaccountsid** | **string**| A specific Accountsid from where Number is getting transfer. |
 **toaccountsid** | **string**| A specific Accountsid to which Number is getting transfer. |

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **incomingphoneUpdatenumber**
> string incomingphoneUpdatenumber($phone_number, $voice_url, $friendly_name, $voice_method, $voice_fallback_url, $voice_fallback_method, $hangup_callback, $hangup_callback_method, $heartbeat_url, $heartbeat_method, $sms_url, $sms_method, $sms_fallback_url, $sms_fallback_method)

Update Number

Update properties for a Ytel number that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\PhoneNumberApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$phone_number = "phone_number_example"; // string | A valid Ytel number (E.164 format).
$voice_url = "voice_url_example"; // string | URL requested once the call connects
$friendly_name = "friendly_name_example"; // string | Phone number friendly name description
$voice_method = "voice_method_example"; // string | Post or Get
$voice_fallback_url = "voice_fallback_url_example"; // string | URL requested if the voice URL is not available
$voice_fallback_method = "voice_fallback_method_example"; // string | Post or Get
$hangup_callback = "hangup_callback_example"; // string | callback url after a hangup occurs
$hangup_callback_method = "hangup_callback_method_example"; // string | Post or Get
$heartbeat_url = "heartbeat_url_example"; // string | URL requested once the call connects
$heartbeat_method = "heartbeat_method_example"; // string | URL that can be requested every 60 seconds during the call to notify of elapsed time
$sms_url = "sms_url_example"; // string | URL requested when an SMS is received
$sms_method = "sms_method_example"; // string | Post or Get
$sms_fallback_url = "sms_fallback_url_example"; // string | URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl.
$sms_fallback_method = "sms_fallback_method_example"; // string | The HTTP method Ytel will use when URL requested if the SmsUrl is not available.

try {
    $result = $apiInstance->incomingphoneUpdatenumber($phone_number, $voice_url, $friendly_name, $voice_method, $voice_fallback_url, $voice_fallback_method, $hangup_callback, $hangup_callback_method, $heartbeat_url, $heartbeat_method, $sms_url, $sms_method, $sms_fallback_url, $sms_fallback_method);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PhoneNumberApi->incomingphoneUpdatenumber: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone_number** | **string**| A valid Ytel number (E.164 format). |
 **voice_url** | **string**| URL requested once the call connects |
 **friendly_name** | **string**| Phone number friendly name description | [optional]
 **voice_method** | **string**| Post or Get | [optional]
 **voice_fallback_url** | **string**| URL requested if the voice URL is not available | [optional]
 **voice_fallback_method** | **string**| Post or Get | [optional]
 **hangup_callback** | **string**| callback url after a hangup occurs | [optional]
 **hangup_callback_method** | **string**| Post or Get | [optional]
 **heartbeat_url** | **string**| URL requested once the call connects | [optional]
 **heartbeat_method** | **string**| URL that can be requested every 60 seconds during the call to notify of elapsed time | [optional]
 **sms_url** | **string**| URL requested when an SMS is received | [optional]
 **sms_method** | **string**| Post or Get | [optional]
 **sms_fallback_url** | **string**| URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl. | [optional]
 **sms_fallback_method** | **string**| The HTTP method Ytel will use when URL requested if the SmsUrl is not available. | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **incomingphoneViewnumber**
> string incomingphoneViewnumber($phone_number)

View Details

Retrieve the details for a phone number by its number.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\PhoneNumberApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$phone_number = "phone_number_example"; // string | A valid Ytel 10-digit phone number (E.164 format).

try {
    $result = $apiInstance->incomingphoneViewnumber($phone_number);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PhoneNumberApi->incomingphoneViewnumber: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone_number** | **string**| A valid Ytel 10-digit phone number (E.164 format). |

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

