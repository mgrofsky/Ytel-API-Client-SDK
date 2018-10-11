# Swagger\Client\UsageApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usageListusage**](UsageApi.md#usageListusage) | **POST** /usage/listusage.json | List Usage


# **usageListusage**
> string usageListusage($product_code, $start_date, $end_date, $include_sub_accounts)

List Usage

Retrieve usage metrics regarding your Ytel account. The results includes inbound/outbound voice calls and inbound/outbound SMS messages as well as carrier lookup requests.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\UsageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$product_code = "0"; // string | Filter usage results by product type.
$start_date = "2016-09-06"; // string | Filter usage objects by start date.
$end_date = "2016-09-06"; // string | Filter usage objects by end date.
$include_sub_accounts = "include_sub_accounts_example"; // string | Will include all subaccount usage data

try {
    $result = $apiInstance->usageListusage($product_code, $start_date, $end_date, $include_sub_accounts);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsageApi->usageListusage: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_code** | **string**| Filter usage results by product type. | [optional] [default to 0]
 **start_date** | **string**| Filter usage objects by start date. | [optional] [default to 2016-09-06]
 **end_date** | **string**| Filter usage objects by end date. | [optional] [default to 2016-09-06]
 **include_sub_accounts** | **string**| Will include all subaccount usage data | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

