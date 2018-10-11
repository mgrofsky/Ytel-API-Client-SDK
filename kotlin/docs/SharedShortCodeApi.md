# SharedShortCodeApi

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


<a name="keywordLists"></a>
# **keywordLists**
> kotlin.String keywordLists(page, pagesize, keyword, shortcode)

List Keywords

Retrieve a list of keywords associated with your Ytel account.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SharedShortCodeApi()
val page : kotlin.Int = 56 // kotlin.Int | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
val pagesize : kotlin.Int = 56 // kotlin.Int | Number of individual resources listed in the response per page
val keyword : kotlin.String = keyword_example // kotlin.String | Only list keywords of keyword
val shortcode : kotlin.Int = 56 // kotlin.Int | Only list keywords of shortcode
try {
    val result : kotlin.String = apiInstance.keywordLists(page, pagesize, keyword, shortcode)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharedShortCodeApi#keywordLists")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharedShortCodeApi#keywordLists")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **kotlin.Int**| Number of individual resources listed in the response per page | [optional] [default to 10]
 **keyword** | **kotlin.String**| Only list keywords of keyword | [optional]
 **shortcode** | **kotlin.Int**| Only list keywords of shortcode | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="keywordView"></a>
# **keywordView**
> kotlin.String keywordView(keywordid)

View Keyword

View a set of properties for a single keyword.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SharedShortCodeApi()
val keywordid : kotlin.String = keywordid_example // kotlin.String | The unique identifier of each keyword
try {
    val result : kotlin.String = apiInstance.keywordView(keywordid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharedShortCodeApi#keywordView")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharedShortCodeApi#keywordView")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keywordid** | **kotlin.String**| The unique identifier of each keyword |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="shortcodeGetinboundsms"></a>
# **shortcodeGetinboundsms**
> kotlin.String shortcodeGetinboundsms(page, pagesize, from, shortcode, datecreated)

List Inbound SMS

List All Inbound ShortCode

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SharedShortCodeApi()
val page : kotlin.Int = 56 // kotlin.Int | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
val pagesize : kotlin.Int = 56 // kotlin.Int | Number of individual resources listed in the response per page
val from : kotlin.String = from_example // kotlin.String | From Number to Inbound ShortCode
val shortcode : kotlin.String = shortcode_example // kotlin.String | Only list messages sent to this Short Code
val datecreated : kotlin.String = datecreated_example // kotlin.String | Only list messages sent with the specified date
try {
    val result : kotlin.String = apiInstance.shortcodeGetinboundsms(page, pagesize, from, shortcode, datecreated)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharedShortCodeApi#shortcodeGetinboundsms")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharedShortCodeApi#shortcodeGetinboundsms")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **kotlin.Int**| Number of individual resources listed in the response per page | [optional] [default to 10]
 **from** | **kotlin.String**| From Number to Inbound ShortCode | [optional]
 **shortcode** | **kotlin.String**| Only list messages sent to this Short Code | [optional]
 **datecreated** | **kotlin.String**| Only list messages sent with the specified date | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="shortcodeListshortcode"></a>
# **shortcodeListshortcode**
> kotlin.String shortcodeListshortcode(page, pagesize, shortcode)

List Shortcodes

Retrieve a list of shortcode assignment associated with your Ytel account.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SharedShortCodeApi()
val page : kotlin.Int = 56 // kotlin.Int | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
val pagesize : kotlin.Int = 56 // kotlin.Int | Number of individual resources listed in the response per page
val shortcode : kotlin.String = shortcode_example // kotlin.String | Only list keywords of shortcode
try {
    val result : kotlin.String = apiInstance.shortcodeListshortcode(page, pagesize, shortcode)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharedShortCodeApi#shortcodeListshortcode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharedShortCodeApi#shortcodeListshortcode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **kotlin.Int**| Number of individual resources listed in the response per page | [optional] [default to 10]
 **shortcode** | **kotlin.String**| Only list keywords of shortcode | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="shortcodeSendsms"></a>
# **shortcodeSendsms**
> kotlin.String shortcodeSendsms(shortcode, to, templateid, `data`, method, messageStatusCallback)

Send SMS

Send an SMS from a Ytel ShortCode

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SharedShortCodeApi()
val shortcode : kotlin.String = shortcode_example // kotlin.String | The Short Code number that is the sender of this message
val to : kotlin.String = to_example // kotlin.String | A valid 10-digit number that should receive the message
val templateid : java.util.UUID =  // java.util.UUID | The unique identifier for the template used for the message
val `data` : kotlin.String = `data`_example // kotlin.String | format of your data, example: {companyname}:test,{otpcode}:1234
val method : kotlin.String = method_example // kotlin.String | Specifies the HTTP method used to request the required URL once the Short Code message is sent.
val messageStatusCallback : kotlin.String = messageStatusCallback_example // kotlin.String | URL that can be requested to receive notification when Short Code message was sent.
try {
    val result : kotlin.String = apiInstance.shortcodeSendsms(shortcode, to, templateid, `data`, method, messageStatusCallback)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharedShortCodeApi#shortcodeSendsms")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharedShortCodeApi#shortcodeSendsms")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **kotlin.String**| The Short Code number that is the sender of this message |
 **to** | **kotlin.String**| A valid 10-digit number that should receive the message |
 **templateid** | [**java.util.UUID**](.md)| The unique identifier for the template used for the message |
 **&#x60;data&#x60;** | **kotlin.String**| format of your data, example: {companyname}:test,{otpcode}:1234 |
 **method** | **kotlin.String**| Specifies the HTTP method used to request the required URL once the Short Code message is sent. | [optional] [default to GET]
 **messageStatusCallback** | **kotlin.String**| URL that can be requested to receive notification when Short Code message was sent. | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="shortcodeUpdateshortcode"></a>
# **shortcodeUpdateshortcode**
> kotlin.String shortcodeUpdateshortcode(shortcode, friendlyName, callbackUrl, callbackMethod, fallbackUrl, fallbackUrlMethod)

Update Shortcode

Update Assignment

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SharedShortCodeApi()
val shortcode : kotlin.String = shortcode_example // kotlin.String | List of valid shortcode to your Ytel account
val friendlyName : kotlin.String = friendlyName_example // kotlin.String | User generated name of the shortcode
val callbackUrl : kotlin.String = callbackUrl_example // kotlin.String | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
val callbackMethod : kotlin.String = callbackMethod_example // kotlin.String | Specifies the HTTP method used to request the required StatusCallBackUrl once call connects.
val fallbackUrl : kotlin.String = fallbackUrl_example // kotlin.String | URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST.
val fallbackUrlMethod : kotlin.String = fallbackUrlMethod_example // kotlin.String | Specifies the HTTP method used to request the required FallbackUrl once call connects.
try {
    val result : kotlin.String = apiInstance.shortcodeUpdateshortcode(shortcode, friendlyName, callbackUrl, callbackMethod, fallbackUrl, fallbackUrlMethod)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharedShortCodeApi#shortcodeUpdateshortcode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharedShortCodeApi#shortcodeUpdateshortcode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **kotlin.String**| List of valid shortcode to your Ytel account |
 **friendlyName** | **kotlin.String**| User generated name of the shortcode | [optional]
 **callbackUrl** | **kotlin.String**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. | [optional]
 **callbackMethod** | **kotlin.String**| Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. | [optional]
 **fallbackUrl** | **kotlin.String**| URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST. | [optional]
 **fallbackUrlMethod** | **kotlin.String**| Specifies the HTTP method used to request the required FallbackUrl once call connects. | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="shortcodeViewshortcode"></a>
# **shortcodeViewshortcode**
> kotlin.String shortcodeViewshortcode(shortcode)

View Shortcode

The response returned here contains all resource properties associated with the given Shortcode.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SharedShortCodeApi()
val shortcode : kotlin.String = shortcode_example // kotlin.String | List of valid Shortcode to your Ytel account
try {
    val result : kotlin.String = apiInstance.shortcodeViewshortcode(shortcode)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharedShortCodeApi#shortcodeViewshortcode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharedShortCodeApi#shortcodeViewshortcode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **kotlin.String**| List of valid Shortcode to your Ytel account |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="templateLists"></a>
# **templateLists**
> kotlin.String templateLists(type, page, pagesize, shortcode)

List Templates

List Shortcode Templates by Type

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SharedShortCodeApi()
val type : kotlin.String = type_example // kotlin.String | The type (category) of template Valid values: marketing, authorization
val page : kotlin.Int = 56 // kotlin.Int | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
val pagesize : kotlin.Int = 56 // kotlin.Int | The count of objects to return per page.
val shortcode : kotlin.String = shortcode_example // kotlin.String | Only list templates of type
try {
    val result : kotlin.String = apiInstance.templateLists(type, page, pagesize, shortcode)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharedShortCodeApi#templateLists")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharedShortCodeApi#templateLists")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **kotlin.String**| The type (category) of template Valid values: marketing, authorization | [optional] [default to authorization]
 **page** | **kotlin.Int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **kotlin.Int**| The count of objects to return per page. | [optional] [default to 10]
 **shortcode** | **kotlin.String**| Only list templates of type | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="templateView"></a>
# **templateView**
> kotlin.String templateView(templateId)

View Template

View a Shared ShortCode Template

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SharedShortCodeApi()
val templateId : java.util.UUID =  // java.util.UUID | The unique identifier for a template object
try {
    val result : kotlin.String = apiInstance.templateView(templateId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharedShortCodeApi#templateView")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharedShortCodeApi#templateView")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | [**java.util.UUID**](.md)| The unique identifier for a template object |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

