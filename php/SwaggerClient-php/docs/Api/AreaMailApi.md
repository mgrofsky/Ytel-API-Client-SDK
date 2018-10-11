# Swagger\Client\AreaMailApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**areamailCreate**](AreaMailApi.md#areamailCreate) | **POST** /areamail/create.json | Create AreaMail
[**areamailDelete**](AreaMailApi.md#areamailDelete) | **POST** /areamail/delete.json | Delete AreaMail
[**areamailLists**](AreaMailApi.md#areamailLists) | **POST** /areamail/lists.json | List AreaMails
[**areamailView**](AreaMailApi.md#areamailView) | **POST** /areamail/view.json | View AreaMail


# **areamailCreate**
> string areamailCreate($routes, $attachbyid, $front, $back, $description, $targettype, $htmldata)

Create AreaMail

Create a new AreaMail object.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\AreaMailApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$routes = "routes_example"; // string | List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route.List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route. A carrier route is in the form of 92610-C043 where the carrier route is composed of 5 numbers for zipcode, 1 letter for carrier route type, and 3 numbers for carrier route code. Delivery can be sent to mutliple routes by separating them with a commas. Valid Values: 92656, 92610-C043
$attachbyid = "attachbyid_example"; // string | Set an existing areamail by attaching its AreamailId.
$front = "front_example"; // string | The front of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. Back required
$back = "back_example"; // string | The back of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG.
$description = "description_example"; // string | A string value to use as a description for this AreaMail item.
$targettype = "targettype_example"; // string | The delivery location type.
$htmldata = "htmldata_example"; // string | A string value that contains HTML markup.

try {
    $result = $apiInstance->areamailCreate($routes, $attachbyid, $front, $back, $description, $targettype, $htmldata);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AreaMailApi->areamailCreate: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routes** | **string**| List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route.List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route. A carrier route is in the form of 92610-C043 where the carrier route is composed of 5 numbers for zipcode, 1 letter for carrier route type, and 3 numbers for carrier route code. Delivery can be sent to mutliple routes by separating them with a commas. Valid Values: 92656, 92610-C043 |
 **attachbyid** | **string**| Set an existing areamail by attaching its AreamailId. |
 **front** | **string**| The front of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. Back required |
 **back** | **string**| The back of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. |
 **description** | **string**| A string value to use as a description for this AreaMail item. | [optional]
 **targettype** | **string**| The delivery location type. | [optional]
 **htmldata** | **string**| A string value that contains HTML markup. | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **areamailDelete**
> string areamailDelete($areamailid)

Delete AreaMail

Remove an AreaMail object by its AreaMailId.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\AreaMailApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$areamailid = "areamailid_example"; // string | The unique identifier for an AreaMail object.

try {
    $result = $apiInstance->areamailDelete($areamailid);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AreaMailApi->areamailDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **areamailid** | **string**| The unique identifier for an AreaMail object. |

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **areamailLists**
> string areamailLists($page, $pagesize, $areamailsid, $date_created)

List AreaMails

Retrieve a list of AreaMail objects.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\AreaMailApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$page = 1; // int | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
$pagesize = 10; // int | The count of objects to return per page.
$areamailsid = "areamailsid_example"; // string | The unique identifier for an AreaMail object.
$date_created = "date_created_example"; // string | The date the AreaMail was created.

try {
    $result = $apiInstance->areamailLists($page, $pagesize, $areamailsid, $date_created);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AreaMailApi->areamailLists: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **int**| The count of objects to return per page. | [optional] [default to 10]
 **areamailsid** | **string**| The unique identifier for an AreaMail object. | [optional]
 **date_created** | **string**| The date the AreaMail was created. | [optional]

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **areamailView**
> string areamailView($areamailid)

View AreaMail

Retrieve an AreaMail object by its AreaMailId.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\AreaMailApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$areamailid = "areamailid_example"; // string | The unique identifier for an AreaMail object.

try {
    $result = $apiInstance->areamailView($areamailid);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AreaMailApi->areamailView: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **areamailid** | **string**| The unique identifier for an AreaMail object. |

### Return type

**string**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

