# Swagger\Client\AddressApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addressCreateaddress**](AddressApi.md#addressCreateaddress) | **POST** /address/createaddress.json | Create Address
[**addressDeleteaddress**](AddressApi.md#addressDeleteaddress) | **POST** /address/deleteaddress.json | Delete Address
[**addressListaddress**](AddressApi.md#addressListaddress) | **POST** /address/listaddress.json | List Addresses
[**addressVerifyaddress**](AddressApi.md#addressVerifyaddress) | **POST** /address/verifyaddress.json | Verify Address
[**addressViewaddress**](AddressApi.md#addressViewaddress) | **POST** /address/viewaddress.json | View Address


# **addressCreateaddress**
> string addressCreateaddress($name, $address, $country, $state, $city, $zip, $description, $email, $phone)

Create Address

To add an address to your address book, you create a new address object. You can retrieve and delete individual addresses as well as get a list of addresses. Addresses are identified by a unique random ID.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\AddressApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$name = "name_example"; // string | Name of user
$address = "address_example"; // string | Address of user.
$country = "country_example"; // string | Must be a 2 letter country short-name code (ISO 3166)
$state = "state_example"; // string | Must be a 2 letter State eg. CA for US. For Some Countries it can be greater than 2 letters.
$city = "city_example"; // string | City Name.
$zip = "zip_example"; // string | Zip code of city.
$description = "description_example"; // string | Description of addresses.
$email = "email_example"; // string | Email Id of user.
$phone = "phone_example"; // string | Phone number of user.

try {
    $result = $apiInstance->addressCreateaddress($name, $address, $country, $state, $city, $zip, $description, $email, $phone);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AddressApi->addressCreateaddress: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **string**| Name of user |
 **address** | **string**| Address of user. |
 **country** | **string**| Must be a 2 letter country short-name code (ISO 3166) |
 **state** | **string**| Must be a 2 letter State eg. CA for US. For Some Countries it can be greater than 2 letters. |
 **city** | **string**| City Name. |
 **zip** | **string**| Zip code of city. |
 **description** | **string**| Description of addresses. | [optional]
 **email** | **string**| Email Id of user. | [optional]
 **phone** | **string**| Phone number of user. | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **addressDeleteaddress**
> string addressDeleteaddress($addressid)

Delete Address

To delete Address to your address book

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\AddressApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$addressid = "addressid_example"; // string | The identifier of the address to be deleted.

try {
    $result = $apiInstance->addressDeleteaddress($addressid);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AddressApi->addressDeleteaddress: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addressid** | **string**| The identifier of the address to be deleted. |

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **addressListaddress**
> string addressListaddress($page, $pagesize, $addressid, $date_created)

List Addresses

List All Address

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\AddressApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$page = 1; // int | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
$pagesize = 10; // int | How many results to return, default is 10, max is 100, must be an integer
$addressid = "addressid_example"; // string | addresses Sid
$date_created = "date_created_example"; // string | date created address.

try {
    $result = $apiInstance->addressListaddress($page, $pagesize, $addressid, $date_created);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AddressApi->addressListaddress: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **int**| How many results to return, default is 10, max is 100, must be an integer | [optional] [default to 10]
 **addressid** | **string**| addresses Sid | [optional]
 **date_created** | **string**| date created address. | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **addressVerifyaddress**
> string addressVerifyaddress($addressid)

Verify Address

Validates an address given.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\AddressApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$addressid = "addressid_example"; // string | The identifier of the address to be verified.

try {
    $result = $apiInstance->addressVerifyaddress($addressid);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AddressApi->addressVerifyaddress: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addressid** | **string**| The identifier of the address to be verified. |

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **addressViewaddress**
> string addressViewaddress($addressid)

View Address

View Address Specific address Book by providing the address id

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\AddressApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$addressid = "addressid_example"; // string | The identifier of the address to be retrieved.

try {
    $result = $apiInstance->addressViewaddress($addressid);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AddressApi->addressViewaddress: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addressid** | **string**| The identifier of the address to be retrieved. |

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

