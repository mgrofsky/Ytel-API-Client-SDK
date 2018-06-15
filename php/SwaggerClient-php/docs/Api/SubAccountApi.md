# Swagger\Client\SubAccountApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userCreatesubaccount**](SubAccountApi.md#userCreatesubaccount) | **POST** /user/createsubaccount.json | Create Subaccount
[**userDeletesubaccount**](SubAccountApi.md#userDeletesubaccount) | **POST** /user/deletesubaccount.json | Delete Subaccount
[**userSubaccountactivation**](SubAccountApi.md#userSubaccountactivation) | **POST** /user/subaccountactivation.json | Toggle Subaccount Status


# **userCreatesubaccount**
> string userCreatesubaccount($first_name, $last_name, $email, $friendly_name, $password)

Create Subaccount

Create a sub user account under the parent account

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\SubAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$first_name = "first_name_example"; // string | Sub account user first name
$last_name = "last_name_example"; // string | sub account user last name
$email = "email_example"; // string | Sub account email address
$friendly_name = "friendly_name_example"; // string | Descriptive name of the sub account
$password = "password_example"; // string | The password of the sub account.  Please make sure to make as password that is at least 8 characters long, contain a symbol, uppercase and a number.

try {
    $result = $apiInstance->userCreatesubaccount($first_name, $last_name, $email, $friendly_name, $password);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SubAccountApi->userCreatesubaccount: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **first_name** | **string**| Sub account user first name |
 **last_name** | **string**| sub account user last name |
 **email** | **string**| Sub account email address |
 **friendly_name** | **string**| Descriptive name of the sub account |
 **password** | **string**| The password of the sub account.  Please make sure to make as password that is at least 8 characters long, contain a symbol, uppercase and a number. |

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **userDeletesubaccount**
> string userDeletesubaccount($sub_account_sid, $merge_number)

Delete Subaccount

Delete sub account or merge numbers into parent

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\SubAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$sub_account_sid = "sub_account_sid_example"; // string | The SubaccountSid to be deleted
$merge_number = "merge_number_example"; // string | 0 to delete or 1 to merge numbers to parent account.

try {
    $result = $apiInstance->userDeletesubaccount($sub_account_sid, $merge_number);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SubAccountApi->userDeletesubaccount: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sub_account_sid** | **string**| The SubaccountSid to be deleted |
 **merge_number** | **string**| 0 to delete or 1 to merge numbers to parent account. |

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **userSubaccountactivation**
> string userSubaccountactivation($sub_account_sid, $activate)

Toggle Subaccount Status

Suspend or unsuspend

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\SubAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$sub_account_sid = "sub_account_sid_example"; // string | The SubaccountSid to be activated or suspended
$activate = "activate_example"; // string | 0 to suspend or 1 to activate

try {
    $result = $apiInstance->userSubaccountactivation($sub_account_sid, $activate);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SubAccountApi->userSubaccountactivation: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sub_account_sid** | **string**| The SubaccountSid to be activated or suspended |
 **activate** | **string**| 0 to suspend or 1 to activate |

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

