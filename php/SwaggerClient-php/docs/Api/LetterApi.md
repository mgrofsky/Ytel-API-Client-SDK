# Swagger\Client\LetterApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**letterCreate**](LetterApi.md#letterCreate) | **POST** /letter/create.json | Create Letter
[**letterDelete**](LetterApi.md#letterDelete) | **POST** /letter/delete.json | Delete Letter
[**letterListsletter**](LetterApi.md#letterListsletter) | **POST** /letter/listsletter.json | List Letters
[**letterViewletter**](LetterApi.md#letterViewletter) | **POST** /letter/viewletter.json | View Letter


# **letterCreate**
> string letterCreate($to, $from, $attachbyid, $file, $color, $description, $extraservice, $doublesided, $template, $htmldata)

Create Letter

Create, print, and mail a letter to an address. The letter file must be supplied as a PDF or an HTML string.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\LetterApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$to = "to_example"; // string | The AddressId or an object structured when creating an address by addresses/Create.
$from = "from_example"; // string | The AddressId or an object structured when creating an address by addresses/Create.
$attachbyid = "attachbyid_example"; // string | Set an existing letter by attaching its LetterId.
$file = "file_example"; // string | File can be a 8.5\"x11\" PDF uploaded file or URL that links to a file.
$color = "color_example"; // string | Specify if letter should be printed in color.
$description = "description_example"; // string | A description for the letter.
$extraservice = "extraservice_example"; // string | Add an extra service to your letter. Options are \"certified\" or \"registered\". Certified provides tracking and delivery confirmation for domestic destinations and is an additional $5.00. Registered provides tracking and confirmation for international addresses and is an additional $16.50.
$doublesided = "doublesided_example"; // string | Specify if letter should be printed on both sides.
$template = "template_example"; // string | Boolean that defaults to true. When set to false, this specifies that your letter does not follow the m360 address template. In this case, a blank address page will be inserted at the beginning of your file and you will be charged for the extra page.
$htmldata = "htmldata_example"; // string | A string value that contains HTML markup.

try {
    $result = $apiInstance->letterCreate($to, $from, $attachbyid, $file, $color, $description, $extraservice, $doublesided, $template, $htmldata);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LetterApi->letterCreate: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **to** | **string**| The AddressId or an object structured when creating an address by addresses/Create. |
 **from** | **string**| The AddressId or an object structured when creating an address by addresses/Create. |
 **attachbyid** | **string**| Set an existing letter by attaching its LetterId. |
 **file** | **string**| File can be a 8.5\&quot;x11\&quot; PDF uploaded file or URL that links to a file. |
 **color** | **string**| Specify if letter should be printed in color. |
 **description** | **string**| A description for the letter. | [optional]
 **extraservice** | **string**| Add an extra service to your letter. Options are \&quot;certified\&quot; or \&quot;registered\&quot;. Certified provides tracking and delivery confirmation for domestic destinations and is an additional $5.00. Registered provides tracking and confirmation for international addresses and is an additional $16.50. | [optional]
 **doublesided** | **string**| Specify if letter should be printed on both sides. | [optional]
 **template** | **string**| Boolean that defaults to true. When set to false, this specifies that your letter does not follow the m360 address template. In this case, a blank address page will be inserted at the beginning of your file and you will be charged for the extra page. | [optional]
 **htmldata** | **string**| A string value that contains HTML markup. | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **letterDelete**
> string letterDelete($lettersid)

Delete Letter

Remove a letter object by its LetterId.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\LetterApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$lettersid = "lettersid_example"; // string | The unique identifier for a letter object.

try {
    $result = $apiInstance->letterDelete($lettersid);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LetterApi->letterDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lettersid** | **string**| The unique identifier for a letter object. |

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **letterListsletter**
> string letterListsletter($page, $pagesize, $lettersid, $date_created)

List Letters

Retrieve a list of letter objects. The letter objects are sorted by creation date, with the most recently created letters appearing first.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\LetterApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$page = 1; // int | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
$pagesize = 10; // int | The count of objects to return per page.
$lettersid = "lettersid_example"; // string | The unique identifier for a letter object.
$date_created = "date_created_example"; // string | The date the letter was created.

try {
    $result = $apiInstance->letterListsletter($page, $pagesize, $lettersid, $date_created);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LetterApi->letterListsletter: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **int**| The count of objects to return per page. | [optional] [default to 10]
 **lettersid** | **string**| The unique identifier for a letter object. | [optional]
 **date_created** | **string**| The date the letter was created. | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **letterViewletter**
> string letterViewletter($lettersid)

View Letter

Retrieve a letter object by its LetterSid.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\LetterApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$lettersid = "lettersid_example"; // string | The unique identifier for a letter object.

try {
    $result = $apiInstance->letterViewletter($lettersid);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LetterApi->letterViewletter: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lettersid** | **string**| The unique identifier for a letter object. |

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

