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
> String smsGetinboundsms(page, pageSize, from, to, dateSent)

List Inbound SMS

Retrieve a list of Inbound SMS message objects.

### Example
```java
// Import classes:
//import io.swagger.client.api.SMSApi;

SMSApi apiInstance = new SMSApi();
Integer page = 1; // Integer | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
Integer pageSize = 10; // Integer | The count of objects to return per page.
String from = "from_example"; // String | Filter SMS message objects from this valid 10-digit phone number (E.164 format).
String to = "to_example"; // String | Filter SMS message objects to this valid 10-digit phone number (E.164 format).
String dateSent = "dateSent_example"; // String | Filter sms message objects by this date.
try {
    String result = apiInstance.smsGetinboundsms(page, pageSize, from, to, dateSent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SMSApi#smsGetinboundsms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pageSize** | **Integer**| The count of objects to return per page. | [optional] [default to 10]
 **from** | **String**| Filter SMS message objects from this valid 10-digit phone number (E.164 format). | [optional]
 **to** | **String**| Filter SMS message objects to this valid 10-digit phone number (E.164 format). | [optional]
 **dateSent** | **String**| Filter sms message objects by this date. | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="smsListsms"></a>
# **smsListsms**
> String smsListsms(page, pageSize, from, to, dateSent)

List SMS

Retrieve a list of Outbound SMS message objects.

### Example
```java
// Import classes:
//import io.swagger.client.api.SMSApi;

SMSApi apiInstance = new SMSApi();
Integer page = 1; // Integer | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
Integer pageSize = 10; // Integer | Number of individual resources listed in the response per page
String from = "from_example"; // String | Filter SMS message objects from this valid 10-digit phone number (E.164 format).
String to = "to_example"; // String | Filter SMS message objects to this valid 10-digit phone number (E.164 format).
String dateSent = "dateSent_example"; // String | Only list SMS messages sent in the specified date range
try {
    String result = apiInstance.smsListsms(page, pageSize, from, to, dateSent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SMSApi#smsListsms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pageSize** | **Integer**| Number of individual resources listed in the response per page | [optional] [default to 10]
 **from** | **String**| Filter SMS message objects from this valid 10-digit phone number (E.164 format). | [optional]
 **to** | **String**| Filter SMS message objects to this valid 10-digit phone number (E.164 format). | [optional]
 **dateSent** | **String**| Only list SMS messages sent in the specified date range | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="smsSendsms"></a>
# **smsSendsms**
> String smsSendsms(from, to, body, method, messageStatusCallback, smartsms, deliveryStatus)

Send SMS

Send an SMS from a Ytel number

### Example
```java
// Import classes:
//import io.swagger.client.api.SMSApi;

SMSApi apiInstance = new SMSApi();
String from = "from_example"; // String | The 10-digit SMS-enabled Ytel number (E.164 format) in which the message is sent.
String to = "to_example"; // String | The 10-digit phone number (E.164 format) that will receive the message.
String body = "body_example"; // String | The body message that is to be sent in the text.
String method = "method_example"; // String | Specifies the HTTP method used to request the required URL once SMS sent.
String messageStatusCallback = "messageStatusCallback_example"; // String | URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished.
Boolean smartsms = false; // Boolean | Check's 'to' number can receive sms or not using Carrier API, if wireless = true then text sms is sent, else wireless = false then call is recieved to end user with audible message.
Boolean deliveryStatus = false; // Boolean | Delivery reports are a method to tell your system if the message has arrived on the destination phone.
try {
    String result = apiInstance.smsSendsms(from, to, body, method, messageStatusCallback, smartsms, deliveryStatus);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SMSApi#smsSendsms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **String**| The 10-digit SMS-enabled Ytel number (E.164 format) in which the message is sent. |
 **to** | **String**| The 10-digit phone number (E.164 format) that will receive the message. |
 **body** | **String**| The body message that is to be sent in the text. |
 **method** | **String**| Specifies the HTTP method used to request the required URL once SMS sent. | [optional]
 **messageStatusCallback** | **String**| URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished. | [optional]
 **smartsms** | **Boolean**| Check&#39;s &#39;to&#39; number can receive sms or not using Carrier API, if wireless &#x3D; true then text sms is sent, else wireless &#x3D; false then call is recieved to end user with audible message. | [optional] [default to false]
 **deliveryStatus** | **Boolean**| Delivery reports are a method to tell your system if the message has arrived on the destination phone. | [optional] [default to false]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="smsViewdetailsms"></a>
# **smsViewdetailsms**
> String smsViewdetailsms(messageSid)

View SMS

Retrieve a single SMS message object with details by its SmsSid.

### Example
```java
// Import classes:
//import io.swagger.client.api.SMSApi;

SMSApi apiInstance = new SMSApi();
String messageSid = "messageSid_example"; // String | The unique identifier for a sms message.
try {
    String result = apiInstance.smsViewdetailsms(messageSid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SMSApi#smsViewdetailsms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageSid** | **String**| The unique identifier for a sms message. |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="smsViewsms"></a>
# **smsViewsms**
> String smsViewsms(messageSid)

View SMS

Retrieve a single SMS message object by its SmsSid.

### Example
```java
// Import classes:
//import io.swagger.client.api.SMSApi;

SMSApi apiInstance = new SMSApi();
String messageSid = "messageSid_example"; // String | The unique identifier for a sms message.
try {
    String result = apiInstance.smsViewsms(messageSid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SMSApi#smsViewsms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageSid** | **String**| The unique identifier for a sms message. |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

