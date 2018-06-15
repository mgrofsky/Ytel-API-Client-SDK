# Swagger\Client\EmailApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**emailAddunsubscribesemail**](EmailApi.md#emailAddunsubscribesemail) | **POST** /email/addunsubscribesemail.json | Add Email Unsubscribe
[**emailDeleteblocksemail**](EmailApi.md#emailDeleteblocksemail) | **POST** /email/deleteblocksemail.json | Remove Blocked Address
[**emailDeletebouncesemail**](EmailApi.md#emailDeletebouncesemail) | **POST** /email/deletebouncesemail.json | Remove Bounced Email
[**emailDeleteinvalidemail**](EmailApi.md#emailDeleteinvalidemail) | **POST** /email/deleteinvalidemail.json | Remove Invalid Email
[**emailDeletespamemail**](EmailApi.md#emailDeletespamemail) | **POST** /email/deletespamemail.json | Remove Spam Address
[**emailDeleteunsubscribedemail**](EmailApi.md#emailDeleteunsubscribedemail) | **POST** /email/deleteunsubscribedemail.json | Remove Unsubscribed Email
[**emailListblockemail**](EmailApi.md#emailListblockemail) | **POST** /email/listblockemail.json | Blocked Emails
[**emailListbounceemail**](EmailApi.md#emailListbounceemail) | **POST** /email/listbounceemail.json | Bounced Emails
[**emailListinvalidemail**](EmailApi.md#emailListinvalidemail) | **POST** /email/listinvalidemail.json | Invalid Emails
[**emailListspamemail**](EmailApi.md#emailListspamemail) | **POST** /email/listspamemail.json | Spam Emails
[**emailListunsubscribedemail**](EmailApi.md#emailListunsubscribedemail) | **POST** /email/listunsubscribedemail.json | List Unsubscribed Emails
[**emailSendemails**](EmailApi.md#emailSendemails) | **POST** /email/sendemails.json | Send Email


# **emailAddunsubscribesemail**
> string emailAddunsubscribesemail($email)

Add Email Unsubscribe

Add an email to the unsubscribe list

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\EmailApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$email = "email_example"; // string | A valid email address that is to be added to the unsubscribe list

try {
    $result = $apiInstance->emailAddunsubscribesemail($email);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EmailApi->emailAddunsubscribesemail: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **string**| A valid email address that is to be added to the unsubscribe list |

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **emailDeleteblocksemail**
> string emailDeleteblocksemail($email)

Remove Blocked Address

Remove an email from blocked emails list.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\EmailApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$email = "email_example"; // string | The email address to be remove from the blocked list.

try {
    $result = $apiInstance->emailDeleteblocksemail($email);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EmailApi->emailDeleteblocksemail: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **string**| The email address to be remove from the blocked list. |

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **emailDeletebouncesemail**
> string emailDeletebouncesemail($email)

Remove Bounced Email

Remove an email address from the bounced list.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\EmailApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$email = "email_example"; // string | The email address to be remove from the bounced email list.

try {
    $result = $apiInstance->emailDeletebouncesemail($email);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EmailApi->emailDeletebouncesemail: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **string**| The email address to be remove from the bounced email list. |

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **emailDeleteinvalidemail**
> string emailDeleteinvalidemail($email)

Remove Invalid Email

Remove an email from the invalid email list.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\EmailApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$email = "email_example"; // string | A valid email address that is to be remove from the invalid email list.

try {
    $result = $apiInstance->emailDeleteinvalidemail($email);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EmailApi->emailDeleteinvalidemail: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **string**| A valid email address that is to be remove from the invalid email list. |

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **emailDeletespamemail**
> string emailDeletespamemail($email)

Remove Spam Address

Remove an email from the spam email list.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\EmailApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$email = "email_example"; // string | A valid email address that is to be remove from the spam list.

try {
    $result = $apiInstance->emailDeletespamemail($email);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EmailApi->emailDeletespamemail: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **string**| A valid email address that is to be remove from the spam list. |

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **emailDeleteunsubscribedemail**
> string emailDeleteunsubscribedemail($email)

Remove Unsubscribed Email

Remove an email address from the list of unsubscribed emails.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\EmailApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$email = "email_example"; // string | A valid email address that is to be remove from the unsubscribe list.

try {
    $result = $apiInstance->emailDeleteunsubscribedemail($email);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EmailApi->emailDeleteunsubscribedemail: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **string**| A valid email address that is to be remove from the unsubscribe list. |

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **emailListblockemail**
> string emailListblockemail($offset, $limit)

Blocked Emails

Retrieve a list of emails that have been blocked.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\EmailApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$offset = "offset_example"; // string | The starting point of the list of blocked emails that should be returned.
$limit = "limit_example"; // string | The count of results that should be returned.

try {
    $result = $apiInstance->emailListblockemail($offset, $limit);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EmailApi->emailListblockemail: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **string**| The starting point of the list of blocked emails that should be returned. | [optional]
 **limit** | **string**| The count of results that should be returned. | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **emailListbounceemail**
> string emailListbounceemail($offset, $limit)

Bounced Emails

Retrieve a list of emails that have bounced.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\EmailApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$offset = "offset_example"; // string | The starting point of the list of bounced emails that should be returned.
$limit = "limit_example"; // string | The count of results that should be returned.

try {
    $result = $apiInstance->emailListbounceemail($offset, $limit);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EmailApi->emailListbounceemail: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **string**| The starting point of the list of bounced emails that should be returned. | [optional]
 **limit** | **string**| The count of results that should be returned. | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **emailListinvalidemail**
> string emailListinvalidemail($offset, $limit)

Invalid Emails

Retrieve a list of invalid email addresses.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\EmailApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$offset = "offset_example"; // string | The starting point of the list of invalid emails that should be returned.
$limit = "limit_example"; // string | The count of results that should be returned.

try {
    $result = $apiInstance->emailListinvalidemail($offset, $limit);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EmailApi->emailListinvalidemail: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **string**| The starting point of the list of invalid emails that should be returned. | [optional]
 **limit** | **string**| The count of results that should be returned. | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **emailListspamemail**
> string emailListspamemail($offset, $limit)

Spam Emails

Retrieve a list of emails that are on the spam list.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\EmailApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$offset = "offset_example"; // string | The starting point of the list of spam emails that should be returned.
$limit = "limit_example"; // string | The count of results that should be returned.

try {
    $result = $apiInstance->emailListspamemail($offset, $limit);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EmailApi->emailListspamemail: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **string**| The starting point of the list of spam emails that should be returned. | [optional]
 **limit** | **string**| The count of results that should be returned. | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **emailListunsubscribedemail**
> string emailListunsubscribedemail($offset, $limit)

List Unsubscribed Emails

Retrieve a list of email addresses from the unsubscribe list.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\EmailApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$offset = "offset_example"; // string | The starting point of the list of unsubscribed emails that should be returned.
$limit = "limit_example"; // string | The count of results that should be returned.

try {
    $result = $apiInstance->emailListunsubscribedemail($offset, $limit);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EmailApi->emailListunsubscribedemail: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **string**| The starting point of the list of unsubscribed emails that should be returned. | [optional]
 **limit** | **string**| The count of results that should be returned. | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **emailSendemails**
> string emailSendemails($to, $type, $subject, $message, $from, $cc, $bcc, $attachment)

Send Email

Create and submit an email message to one or more email addresses.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\EmailApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$to = "to_example"; // string | A valid address that will receive the email. Multiple addresses can be separated by using commas.
$type = "type_example"; // string | Specifies the type of email to be sent
$subject = "subject_example"; // string | The subject of the mail. Must be a valid string.
$message = "message_example"; // string | The email message that is to be sent in the text.
$from = "from_example"; // string | A valid address that will send the email.
$cc = "cc_example"; // string | Carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas.
$bcc = "bcc_example"; // string | Blind carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas.
$attachment = "attachment_example"; // string | A file that is attached to the email. Must be less than 7 MB in size.

try {
    $result = $apiInstance->emailSendemails($to, $type, $subject, $message, $from, $cc, $bcc, $attachment);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EmailApi->emailSendemails: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **to** | **string**| A valid address that will receive the email. Multiple addresses can be separated by using commas. |
 **type** | **string**| Specifies the type of email to be sent |
 **subject** | **string**| The subject of the mail. Must be a valid string. |
 **message** | **string**| The email message that is to be sent in the text. |
 **from** | **string**| A valid address that will send the email. | [optional]
 **cc** | **string**| Carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas. | [optional]
 **bcc** | **string**| Blind carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas. | [optional]
 **attachment** | **string**| A file that is attached to the email. Must be less than 7 MB in size. | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

