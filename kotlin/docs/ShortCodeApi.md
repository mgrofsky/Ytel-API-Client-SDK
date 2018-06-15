# ShortCodeApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dedicatedshortcodeGetinboundsms**](ShortCodeApi.md#dedicatedshortcodeGetinboundsms) | **POST** /dedicatedshortcode/getinboundsms.json | List Inbound SMS
[**dedicatedshortcodeListshortcode**](ShortCodeApi.md#dedicatedshortcodeListshortcode) | **POST** /dedicatedshortcode/listshortcode.json | List Shortcodes
[**dedicatedshortcodeSendsms**](ShortCodeApi.md#dedicatedshortcodeSendsms) | **POST** /dedicatedshortcode/sendsms.json | Send SMS
[**dedicatedshortcodeUpdateshortcode**](ShortCodeApi.md#dedicatedshortcodeUpdateshortcode) | **POST** /dedicatedshortcode/updateshortcode.json | Update Shortcode
[**dedicatedshortcodeViewshortcode**](ShortCodeApi.md#dedicatedshortcodeViewshortcode) | **POST** /dedicatedshortcode/viewshortcode.json | View SMS
[**shortcodeListsms**](ShortCodeApi.md#shortcodeListsms) | **POST** /shortcode/listsms.json | List SMS
[**shortcodeViewsms**](ShortCodeApi.md#shortcodeViewsms) | **POST** /shortcode/viewsms.json | View SMS


<a name="dedicatedshortcodeGetinboundsms"></a>
# **dedicatedshortcodeGetinboundsms**
> kotlin.String dedicatedshortcodeGetinboundsms(page, pagesize, from, shortcode, datecreated)

List Inbound SMS

Retrive a list of inbound Sms Short Code messages associated with your Ytel account.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ShortCodeApi()
val page : kotlin.Int = 56 // kotlin.Int | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
val pagesize : kotlin.Int = 56 // kotlin.Int | Number of individual resources listed in the response per page
val from : kotlin.String = from_example // kotlin.String | Only list SMS messages sent from this number
val shortcode : kotlin.String = shortcode_example // kotlin.String | Only list SMS messages sent to Shortcode
val datecreated : kotlin.String = datecreated_example // kotlin.String | Only list SMS messages sent in the specified date MAKE REQUEST
try {
    val result : kotlin.String = apiInstance.dedicatedshortcodeGetinboundsms(page, pagesize, from, shortcode, datecreated)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShortCodeApi#dedicatedshortcodeGetinboundsms")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShortCodeApi#dedicatedshortcodeGetinboundsms")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **kotlin.Int**| Number of individual resources listed in the response per page | [optional] [default to 10]
 **from** | **kotlin.String**| Only list SMS messages sent from this number | [optional]
 **shortcode** | **kotlin.String**| Only list SMS messages sent to Shortcode | [optional]
 **datecreated** | **kotlin.String**| Only list SMS messages sent in the specified date MAKE REQUEST | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="dedicatedshortcodeListshortcode"></a>
# **dedicatedshortcodeListshortcode**
> kotlin.String dedicatedshortcodeListshortcode(shortcode, page, pagesize)

List Shortcodes

Retrieve a list of Short Code assignment associated with your Ytel account.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ShortCodeApi()
val shortcode : kotlin.String = shortcode_example // kotlin.String | Only list Short Code Assignment sent from this Short Code
val page : kotlin.String = page_example // kotlin.String | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
val pagesize : kotlin.String = pagesize_example // kotlin.String | The count of objects to return per page.
try {
    val result : kotlin.String = apiInstance.dedicatedshortcodeListshortcode(shortcode, page, pagesize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShortCodeApi#dedicatedshortcodeListshortcode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShortCodeApi#dedicatedshortcodeListshortcode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **kotlin.String**| Only list Short Code Assignment sent from this Short Code | [optional]
 **page** | **kotlin.String**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional]
 **pagesize** | **kotlin.String**| The count of objects to return per page. | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="dedicatedshortcodeSendsms"></a>
# **dedicatedshortcodeSendsms**
> kotlin.String dedicatedshortcodeSendsms(shortcode, to, body, method, messagestatuscallback)

Send SMS

Send Dedicated Shortcode

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ShortCodeApi()
val shortcode : kotlin.Int = 56 // kotlin.Int | Your dedicated shortcode
val to : kotlin.Double = 1.2 // kotlin.Double | The number to send your SMS to
val body : kotlin.String = body_example // kotlin.String | The body of your message
val method : kotlin.String = method_example // kotlin.String | Specifies the HTTP method used to request the required URL once the Short Code message is sent.GET or POST
val messagestatuscallback : kotlin.String = messagestatuscallback_example // kotlin.String | URL that can be requested to receive notification when Short Code message was sent.
try {
    val result : kotlin.String = apiInstance.dedicatedshortcodeSendsms(shortcode, to, body, method, messagestatuscallback)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShortCodeApi#dedicatedshortcodeSendsms")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShortCodeApi#dedicatedshortcodeSendsms")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **kotlin.Int**| Your dedicated shortcode |
 **to** | **kotlin.Double**| The number to send your SMS to |
 **body** | **kotlin.String**| The body of your message |
 **method** | **kotlin.String**| Specifies the HTTP method used to request the required URL once the Short Code message is sent.GET or POST | [optional]
 **messagestatuscallback** | **kotlin.String**| URL that can be requested to receive notification when Short Code message was sent. | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="dedicatedshortcodeUpdateshortcode"></a>
# **dedicatedshortcodeUpdateshortcode**
> kotlin.String dedicatedshortcodeUpdateshortcode(shortcode, friendlyName, callbackMethod, callbackUrl, fallbackMethod, fallbackUrl)

Update Shortcode

Update a dedicated shortcode.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ShortCodeApi()
val shortcode : kotlin.String = shortcode_example // kotlin.String | List of valid dedicated shortcode to your Ytel account.
val friendlyName : kotlin.String = friendlyName_example // kotlin.String | User generated name of the dedicated shortcode.
val callbackMethod : kotlin.String = callbackMethod_example // kotlin.String | Specifies the HTTP method used to request the required StatusCallBackUrl once call connects.
val callbackUrl : kotlin.String = callbackUrl_example // kotlin.String | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
val fallbackMethod : kotlin.String = fallbackMethod_example // kotlin.String | Specifies the HTTP method used to request the required FallbackUrl once call connects.
val fallbackUrl : kotlin.String = fallbackUrl_example // kotlin.String | URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST.
try {
    val result : kotlin.String = apiInstance.dedicatedshortcodeUpdateshortcode(shortcode, friendlyName, callbackMethod, callbackUrl, fallbackMethod, fallbackUrl)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShortCodeApi#dedicatedshortcodeUpdateshortcode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShortCodeApi#dedicatedshortcodeUpdateshortcode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **kotlin.String**| List of valid dedicated shortcode to your Ytel account. |
 **friendlyName** | **kotlin.String**| User generated name of the dedicated shortcode. | [optional]
 **callbackMethod** | **kotlin.String**| Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. | [optional]
 **callbackUrl** | **kotlin.String**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. | [optional]
 **fallbackMethod** | **kotlin.String**| Specifies the HTTP method used to request the required FallbackUrl once call connects. | [optional]
 **fallbackUrl** | **kotlin.String**| URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST. | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="dedicatedshortcodeViewshortcode"></a>
# **dedicatedshortcodeViewshortcode**
> kotlin.String dedicatedshortcodeViewshortcode(shortcode)

View SMS

Retrieve a single Short Code object by its shortcode assignment.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ShortCodeApi()
val shortcode : kotlin.String = shortcode_example // kotlin.String | List of valid Dedicated Short Code to your Ytel account
try {
    val result : kotlin.String = apiInstance.dedicatedshortcodeViewshortcode(shortcode)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShortCodeApi#dedicatedshortcodeViewshortcode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShortCodeApi#dedicatedshortcodeViewshortcode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **kotlin.String**| List of valid Dedicated Short Code to your Ytel account |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="shortcodeListsms"></a>
# **shortcodeListsms**
> kotlin.String shortcodeListsms(shortcode, to, dateSent, page, pageSize)

List SMS

Retrieve a list of Short Code messages.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ShortCodeApi()
val shortcode : kotlin.String = shortcode_example // kotlin.String | Only list messages sent from this Short Code
val to : kotlin.String = to_example // kotlin.String | Only list messages sent to this number
val dateSent : kotlin.String = dateSent_example // kotlin.String | Only list messages sent with the specified date
val page : kotlin.Int = 56 // kotlin.Int | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
val pageSize : kotlin.Int = 56 // kotlin.Int | The count of objects to return per page.
try {
    val result : kotlin.String = apiInstance.shortcodeListsms(shortcode, to, dateSent, page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShortCodeApi#shortcodeListsms")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShortCodeApi#shortcodeListsms")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **kotlin.String**| Only list messages sent from this Short Code | [optional]
 **to** | **kotlin.String**| Only list messages sent to this number | [optional]
 **dateSent** | **kotlin.String**| Only list messages sent with the specified date | [optional]
 **page** | **kotlin.Int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pageSize** | **kotlin.Int**| The count of objects to return per page. | [optional] [default to 10]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="shortcodeViewsms"></a>
# **shortcodeViewsms**
> kotlin.String shortcodeViewsms(messageSid)

View SMS

View a single Sms Short Code message.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ShortCodeApi()
val messageSid : kotlin.String = messageSid_example // kotlin.String | The unique identifier for the sms resource
try {
    val result : kotlin.String = apiInstance.shortcodeViewsms(messageSid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShortCodeApi#shortcodeViewsms")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShortCodeApi#shortcodeViewsms")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageSid** | **kotlin.String**| The unique identifier for the sms resource |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

