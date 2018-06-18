# SharedShortCodeApi

All URIs are relative to *https://api.message360.com/api/v3/*

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


<a name="keywordLists"></a>
# **keywordLists**
> String keywordLists(page, pagesize, keyword, shortcode)

List Keywords

Retrieve a list of keywords associated with your Ytel account.

### Example
```java
// Import classes:
//import io.swagger.client.api.SharedShortCodeApi;

SharedShortCodeApi apiInstance = new SharedShortCodeApi();
Integer page = 1; // Integer | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
Integer pagesize = 10; // Integer | Number of individual resources listed in the response per page
String keyword = "keyword_example"; // String | Only list keywords of keyword
Integer shortcode = 56; // Integer | Only list keywords of shortcode
try {
    String result = apiInstance.keywordLists(page, pagesize, keyword, shortcode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SharedShortCodeApi#keywordLists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **Integer**| Number of individual resources listed in the response per page | [optional] [default to 10]
 **keyword** | **String**| Only list keywords of keyword | [optional]
 **shortcode** | **Integer**| Only list keywords of shortcode | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="keywordView"></a>
# **keywordView**
> String keywordView(keywordid)

View Keyword

View a set of properties for a single keyword.

### Example
```java
// Import classes:
//import io.swagger.client.api.SharedShortCodeApi;

SharedShortCodeApi apiInstance = new SharedShortCodeApi();
String keywordid = "keywordid_example"; // String | The unique identifier of each keyword
try {
    String result = apiInstance.keywordView(keywordid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SharedShortCodeApi#keywordView");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keywordid** | **String**| The unique identifier of each keyword |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="shortcodeGetinboundsms"></a>
# **shortcodeGetinboundsms**
> String shortcodeGetinboundsms(page, pagesize, from, shortcode, datecreated)

List Inbound SMS

List All Inbound ShortCode

### Example
```java
// Import classes:
//import io.swagger.client.api.SharedShortCodeApi;

SharedShortCodeApi apiInstance = new SharedShortCodeApi();
Integer page = 1; // Integer | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
Integer pagesize = 10; // Integer | Number of individual resources listed in the response per page
String from = "from_example"; // String | From Number to Inbound ShortCode
String shortcode = "shortcode_example"; // String | Only list messages sent to this Short Code
String datecreated = "datecreated_example"; // String | Only list messages sent with the specified date
try {
    String result = apiInstance.shortcodeGetinboundsms(page, pagesize, from, shortcode, datecreated);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SharedShortCodeApi#shortcodeGetinboundsms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **Integer**| Number of individual resources listed in the response per page | [optional] [default to 10]
 **from** | **String**| From Number to Inbound ShortCode | [optional]
 **shortcode** | **String**| Only list messages sent to this Short Code | [optional]
 **datecreated** | **String**| Only list messages sent with the specified date | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="shortcodeListshortcode"></a>
# **shortcodeListshortcode**
> String shortcodeListshortcode(page, pagesize, shortcode)

List Shortcodes

Retrieve a list of shortcode assignment associated with your Ytel account.

### Example
```java
// Import classes:
//import io.swagger.client.api.SharedShortCodeApi;

SharedShortCodeApi apiInstance = new SharedShortCodeApi();
Integer page = 1; // Integer | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
Integer pagesize = 10; // Integer | Number of individual resources listed in the response per page
String shortcode = "shortcode_example"; // String | Only list keywords of shortcode
try {
    String result = apiInstance.shortcodeListshortcode(page, pagesize, shortcode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SharedShortCodeApi#shortcodeListshortcode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **Integer**| Number of individual resources listed in the response per page | [optional] [default to 10]
 **shortcode** | **String**| Only list keywords of shortcode | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="shortcodeSendsms"></a>
# **shortcodeSendsms**
> String shortcodeSendsms(shortcode, to, templateid, data, method, messageStatusCallback)

Send SMS

Send an SMS from a Ytel ShortCode

### Example
```java
// Import classes:
//import io.swagger.client.api.SharedShortCodeApi;

SharedShortCodeApi apiInstance = new SharedShortCodeApi();
String shortcode = "shortcode_example"; // String | The Short Code number that is the sender of this message
String to = "to_example"; // String | A valid 10-digit number that should receive the message
UUID templateid = new UUID(); // UUID | The unique identifier for the template used for the message
String data = "data_example"; // String | format of your data, example: {companyname}:test,{otpcode}:1234
String method = "GET"; // String | Specifies the HTTP method used to request the required URL once the Short Code message is sent.
String messageStatusCallback = "messageStatusCallback_example"; // String | URL that can be requested to receive notification when Short Code message was sent.
try {
    String result = apiInstance.shortcodeSendsms(shortcode, to, templateid, data, method, messageStatusCallback);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SharedShortCodeApi#shortcodeSendsms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **String**| The Short Code number that is the sender of this message |
 **to** | **String**| A valid 10-digit number that should receive the message |
 **templateid** | **UUID**| The unique identifier for the template used for the message |
 **data** | **String**| format of your data, example: {companyname}:test,{otpcode}:1234 |
 **method** | **String**| Specifies the HTTP method used to request the required URL once the Short Code message is sent. | [optional] [default to GET]
 **messageStatusCallback** | **String**| URL that can be requested to receive notification when Short Code message was sent. | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="shortcodeUpdateshortcode"></a>
# **shortcodeUpdateshortcode**
> String shortcodeUpdateshortcode(shortcode, friendlyName, callbackUrl, callbackMethod, fallbackUrl, fallbackUrlMethod)

Update Shortcode

Update Assignment

### Example
```java
// Import classes:
//import io.swagger.client.api.SharedShortCodeApi;

SharedShortCodeApi apiInstance = new SharedShortCodeApi();
String shortcode = "shortcode_example"; // String | List of valid shortcode to your Ytel account
String friendlyName = "friendlyName_example"; // String | User generated name of the shortcode
String callbackUrl = "callbackUrl_example"; // String | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
String callbackMethod = "callbackMethod_example"; // String | Specifies the HTTP method used to request the required StatusCallBackUrl once call connects.
String fallbackUrl = "fallbackUrl_example"; // String | URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST.
String fallbackUrlMethod = "fallbackUrlMethod_example"; // String | Specifies the HTTP method used to request the required FallbackUrl once call connects.
try {
    String result = apiInstance.shortcodeUpdateshortcode(shortcode, friendlyName, callbackUrl, callbackMethod, fallbackUrl, fallbackUrlMethod);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SharedShortCodeApi#shortcodeUpdateshortcode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **String**| List of valid shortcode to your Ytel account |
 **friendlyName** | **String**| User generated name of the shortcode | [optional]
 **callbackUrl** | **String**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. | [optional]
 **callbackMethod** | **String**| Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. | [optional]
 **fallbackUrl** | **String**| URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST. | [optional]
 **fallbackUrlMethod** | **String**| Specifies the HTTP method used to request the required FallbackUrl once call connects. | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="shortcodeViewshortcode"></a>
# **shortcodeViewshortcode**
> String shortcodeViewshortcode(shortcode)

View Shortcode

The response returned here contains all resource properties associated with the given Shortcode.

### Example
```java
// Import classes:
//import io.swagger.client.api.SharedShortCodeApi;

SharedShortCodeApi apiInstance = new SharedShortCodeApi();
String shortcode = "shortcode_example"; // String | List of valid Shortcode to your Ytel account
try {
    String result = apiInstance.shortcodeViewshortcode(shortcode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SharedShortCodeApi#shortcodeViewshortcode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **String**| List of valid Shortcode to your Ytel account |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="templateLists"></a>
# **templateLists**
> String templateLists(type, page, pagesize, shortcode)

List Templates

List Shortcode Templates by Type

### Example
```java
// Import classes:
//import io.swagger.client.api.SharedShortCodeApi;

SharedShortCodeApi apiInstance = new SharedShortCodeApi();
String type = "authorization"; // String | The type (category) of template Valid values: marketing, authorization
Integer page = 1; // Integer | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
Integer pagesize = 10; // Integer | The count of objects to return per page.
String shortcode = "shortcode_example"; // String | Only list templates of type
try {
    String result = apiInstance.templateLists(type, page, pagesize, shortcode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SharedShortCodeApi#templateLists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| The type (category) of template Valid values: marketing, authorization | [optional] [default to authorization]
 **page** | **Integer**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **Integer**| The count of objects to return per page. | [optional] [default to 10]
 **shortcode** | **String**| Only list templates of type | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="templateView"></a>
# **templateView**
> String templateView(templateId)

View Template

View a Shared ShortCode Template

### Example
```java
// Import classes:
//import io.swagger.client.api.SharedShortCodeApi;

SharedShortCodeApi apiInstance = new SharedShortCodeApi();
UUID templateId = new UUID(); // UUID | The unique identifier for a template object
try {
    String result = apiInstance.templateView(templateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SharedShortCodeApi#templateView");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **UUID**| The unique identifier for a template object |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

