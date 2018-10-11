# SMSApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**smsGetinboundsms**](SMSApi.md#smsGetinboundsms) | **POST** /sms/getinboundsms.json | List Inbound SMS
[**smsListsms**](SMSApi.md#smsListsms) | **POST** /sms/listsms.json | List SMS
[**smsSendsms**](SMSApi.md#smsSendsms) | **POST** /sms/sendsms.json | Send SMS
[**smsViewdetailsms**](SMSApi.md#smsViewdetailsms) | **POST** /sms/viewdetailsms.json | View SMS
[**smsViewsms**](SMSApi.md#smsViewsms) | **POST** /sms/viewsms.json | View SMS


<a name="smsGetinboundsms"></a>
# **smsGetinboundsms**
> kotlin.String smsGetinboundsms(page, pageSize, from, to, dateSent)

List Inbound SMS

Retrieve a list of Inbound SMS message objects.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SMSApi()
val page : kotlin.Int = 56 // kotlin.Int | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
val pageSize : kotlin.Int = 56 // kotlin.Int | The count of objects to return per page.
val from : kotlin.String = from_example // kotlin.String | Filter SMS message objects from this valid 10-digit phone number (E.164 format).
val to : kotlin.String = to_example // kotlin.String | Filter SMS message objects to this valid 10-digit phone number (E.164 format).
val dateSent : kotlin.String = dateSent_example // kotlin.String | Filter sms message objects by this date.
try {
    val result : kotlin.String = apiInstance.smsGetinboundsms(page, pageSize, from, to, dateSent)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SMSApi#smsGetinboundsms")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SMSApi#smsGetinboundsms")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pageSize** | **kotlin.Int**| The count of objects to return per page. | [optional] [default to 10]
 **from** | **kotlin.String**| Filter SMS message objects from this valid 10-digit phone number (E.164 format). | [optional]
 **to** | **kotlin.String**| Filter SMS message objects to this valid 10-digit phone number (E.164 format). | [optional]
 **dateSent** | **kotlin.String**| Filter sms message objects by this date. | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="smsListsms"></a>
# **smsListsms**
> kotlin.String smsListsms(page, pageSize, from, to, dateSent)

List SMS

Retrieve a list of Outbound SMS message objects.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SMSApi()
val page : kotlin.Int = 56 // kotlin.Int | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of individual resources listed in the response per page
val from : kotlin.String = from_example // kotlin.String | Filter SMS message objects from this valid 10-digit phone number (E.164 format).
val to : kotlin.String = to_example // kotlin.String | Filter SMS message objects to this valid 10-digit phone number (E.164 format).
val dateSent : kotlin.String = dateSent_example // kotlin.String | Only list SMS messages sent in the specified date range
try {
    val result : kotlin.String = apiInstance.smsListsms(page, pageSize, from, to, dateSent)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SMSApi#smsListsms")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SMSApi#smsListsms")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pageSize** | **kotlin.Int**| Number of individual resources listed in the response per page | [optional] [default to 10]
 **from** | **kotlin.String**| Filter SMS message objects from this valid 10-digit phone number (E.164 format). | [optional]
 **to** | **kotlin.String**| Filter SMS message objects to this valid 10-digit phone number (E.164 format). | [optional]
 **dateSent** | **kotlin.String**| Only list SMS messages sent in the specified date range | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="smsSendsms"></a>
# **smsSendsms**
> kotlin.String smsSendsms(from, to, body, method, messageStatusCallback, smartsms, deliveryStatus)

Send SMS

Send an SMS from a Ytel number

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SMSApi()
val from : kotlin.String = from_example // kotlin.String | The 10-digit SMS-enabled Ytel number (E.164 format) in which the message is sent.
val to : kotlin.String = to_example // kotlin.String | The 10-digit phone number (E.164 format) that will receive the message.
val body : kotlin.String = body_example // kotlin.String | The body message that is to be sent in the text.
val method : kotlin.String = method_example // kotlin.String | Specifies the HTTP method used to request the required URL once SMS sent.
val messageStatusCallback : kotlin.String = messageStatusCallback_example // kotlin.String | URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished.
val smartsms : kotlin.Boolean = true // kotlin.Boolean | Check's 'to' number can receive sms or not using Carrier API, if wireless = true then text sms is sent, else wireless = false then call is recieved to end user with audible message.
val deliveryStatus : kotlin.Boolean = true // kotlin.Boolean | Delivery reports are a method to tell your system if the message has arrived on the destination phone.
try {
    val result : kotlin.String = apiInstance.smsSendsms(from, to, body, method, messageStatusCallback, smartsms, deliveryStatus)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SMSApi#smsSendsms")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SMSApi#smsSendsms")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.String**| The 10-digit SMS-enabled Ytel number (E.164 format) in which the message is sent. |
 **to** | **kotlin.String**| The 10-digit phone number (E.164 format) that will receive the message. |
 **body** | **kotlin.String**| The body message that is to be sent in the text. |
 **method** | **kotlin.String**| Specifies the HTTP method used to request the required URL once SMS sent. | [optional]
 **messageStatusCallback** | **kotlin.String**| URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished. | [optional]
 **smartsms** | **kotlin.Boolean**| Check&#39;s &#39;to&#39; number can receive sms or not using Carrier API, if wireless &#x3D; true then text sms is sent, else wireless &#x3D; false then call is recieved to end user with audible message. | [optional] [default to false]
 **deliveryStatus** | **kotlin.Boolean**| Delivery reports are a method to tell your system if the message has arrived on the destination phone. | [optional] [default to false]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="smsViewdetailsms"></a>
# **smsViewdetailsms**
> kotlin.String smsViewdetailsms(messageSid)

View SMS

Retrieve a single SMS message object with details by its SmsSid.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SMSApi()
val messageSid : kotlin.String = messageSid_example // kotlin.String | The unique identifier for a sms message.
try {
    val result : kotlin.String = apiInstance.smsViewdetailsms(messageSid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SMSApi#smsViewdetailsms")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SMSApi#smsViewdetailsms")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageSid** | **kotlin.String**| The unique identifier for a sms message. |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="smsViewsms"></a>
# **smsViewsms**
> kotlin.String smsViewsms(messageSid)

View SMS

Retrieve a single SMS message object by its SmsSid.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SMSApi()
val messageSid : kotlin.String = messageSid_example // kotlin.String | The unique identifier for a sms message.
try {
    val result : kotlin.String = apiInstance.smsViewsms(messageSid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SMSApi#smsViewsms")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SMSApi#smsViewsms")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageSid** | **kotlin.String**| The unique identifier for a sms message. |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

