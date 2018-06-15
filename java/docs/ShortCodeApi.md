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
> String dedicatedshortcodeGetinboundsms(page, pagesize, from, shortcode, datecreated)

List Inbound SMS

Retrive a list of inbound Sms Short Code messages associated with your Ytel account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ShortCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

ShortCodeApi apiInstance = new ShortCodeApi();
Integer page = 1; // Integer | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
Integer pagesize = 10; // Integer | Number of individual resources listed in the response per page
String from = "from_example"; // String | Only list SMS messages sent from this number
String shortcode = "shortcode_example"; // String | Only list SMS messages sent to Shortcode
String datecreated = "datecreated_example"; // String | Only list SMS messages sent in the specified date MAKE REQUEST
try {
    String result = apiInstance.dedicatedshortcodeGetinboundsms(page, pagesize, from, shortcode, datecreated);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShortCodeApi#dedicatedshortcodeGetinboundsms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **Integer**| Number of individual resources listed in the response per page | [optional] [default to 10]
 **from** | **String**| Only list SMS messages sent from this number | [optional]
 **shortcode** | **String**| Only list SMS messages sent to Shortcode | [optional]
 **datecreated** | **String**| Only list SMS messages sent in the specified date MAKE REQUEST | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="dedicatedshortcodeListshortcode"></a>
# **dedicatedshortcodeListshortcode**
> String dedicatedshortcodeListshortcode(shortcode, page, pagesize)

List Shortcodes

Retrieve a list of Short Code assignment associated with your Ytel account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ShortCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

ShortCodeApi apiInstance = new ShortCodeApi();
String shortcode = "shortcode_example"; // String | Only list Short Code Assignment sent from this Short Code
String page = "page_example"; // String | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
String pagesize = "pagesize_example"; // String | The count of objects to return per page.
try {
    String result = apiInstance.dedicatedshortcodeListshortcode(shortcode, page, pagesize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShortCodeApi#dedicatedshortcodeListshortcode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **String**| Only list Short Code Assignment sent from this Short Code | [optional]
 **page** | **String**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional]
 **pagesize** | **String**| The count of objects to return per page. | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="dedicatedshortcodeSendsms"></a>
# **dedicatedshortcodeSendsms**
> String dedicatedshortcodeSendsms(shortcode, to, body, method, messagestatuscallback)

Send SMS

Send Dedicated Shortcode

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ShortCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

ShortCodeApi apiInstance = new ShortCodeApi();
Integer shortcode = 56; // Integer | Your dedicated shortcode
Double to = 3.4D; // Double | The number to send your SMS to
String body = "body_example"; // String | The body of your message
String method = "method_example"; // String | Specifies the HTTP method used to request the required URL once the Short Code message is sent.GET or POST
String messagestatuscallback = "messagestatuscallback_example"; // String | URL that can be requested to receive notification when Short Code message was sent.
try {
    String result = apiInstance.dedicatedshortcodeSendsms(shortcode, to, body, method, messagestatuscallback);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShortCodeApi#dedicatedshortcodeSendsms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **Integer**| Your dedicated shortcode |
 **to** | **Double**| The number to send your SMS to |
 **body** | **String**| The body of your message |
 **method** | **String**| Specifies the HTTP method used to request the required URL once the Short Code message is sent.GET or POST | [optional]
 **messagestatuscallback** | **String**| URL that can be requested to receive notification when Short Code message was sent. | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="dedicatedshortcodeUpdateshortcode"></a>
# **dedicatedshortcodeUpdateshortcode**
> String dedicatedshortcodeUpdateshortcode(shortcode, friendlyName, callbackMethod, callbackUrl, fallbackMethod, fallbackUrl)

Update Shortcode

Update a dedicated shortcode.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ShortCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

ShortCodeApi apiInstance = new ShortCodeApi();
String shortcode = "shortcode_example"; // String | List of valid dedicated shortcode to your Ytel account.
String friendlyName = "friendlyName_example"; // String | User generated name of the dedicated shortcode.
String callbackMethod = "callbackMethod_example"; // String | Specifies the HTTP method used to request the required StatusCallBackUrl once call connects.
String callbackUrl = "callbackUrl_example"; // String | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
String fallbackMethod = "fallbackMethod_example"; // String | Specifies the HTTP method used to request the required FallbackUrl once call connects.
String fallbackUrl = "fallbackUrl_example"; // String | URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST.
try {
    String result = apiInstance.dedicatedshortcodeUpdateshortcode(shortcode, friendlyName, callbackMethod, callbackUrl, fallbackMethod, fallbackUrl);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShortCodeApi#dedicatedshortcodeUpdateshortcode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **String**| List of valid dedicated shortcode to your Ytel account. |
 **friendlyName** | **String**| User generated name of the dedicated shortcode. | [optional]
 **callbackMethod** | **String**| Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. | [optional]
 **callbackUrl** | **String**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. | [optional]
 **fallbackMethod** | **String**| Specifies the HTTP method used to request the required FallbackUrl once call connects. | [optional]
 **fallbackUrl** | **String**| URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST. | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="dedicatedshortcodeViewshortcode"></a>
# **dedicatedshortcodeViewshortcode**
> String dedicatedshortcodeViewshortcode(shortcode)

View SMS

Retrieve a single Short Code object by its shortcode assignment.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ShortCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

ShortCodeApi apiInstance = new ShortCodeApi();
String shortcode = "shortcode_example"; // String | List of valid Dedicated Short Code to your Ytel account
try {
    String result = apiInstance.dedicatedshortcodeViewshortcode(shortcode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShortCodeApi#dedicatedshortcodeViewshortcode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **String**| List of valid Dedicated Short Code to your Ytel account |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="shortcodeListsms"></a>
# **shortcodeListsms**
> String shortcodeListsms(shortcode, to, dateSent, page, pageSize)

List SMS

Retrieve a list of Short Code messages.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ShortCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

ShortCodeApi apiInstance = new ShortCodeApi();
String shortcode = "shortcode_example"; // String | Only list messages sent from this Short Code
String to = "to_example"; // String | Only list messages sent to this number
String dateSent = "dateSent_example"; // String | Only list messages sent with the specified date
Integer page = 1; // Integer | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
Integer pageSize = 10; // Integer | The count of objects to return per page.
try {
    String result = apiInstance.shortcodeListsms(shortcode, to, dateSent, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShortCodeApi#shortcodeListsms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **String**| Only list messages sent from this Short Code | [optional]
 **to** | **String**| Only list messages sent to this number | [optional]
 **dateSent** | **String**| Only list messages sent with the specified date | [optional]
 **page** | **Integer**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pageSize** | **Integer**| The count of objects to return per page. | [optional] [default to 10]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="shortcodeViewsms"></a>
# **shortcodeViewsms**
> String shortcodeViewsms(messageSid)

View SMS

View a single Sms Short Code message.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ShortCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

ShortCodeApi apiInstance = new ShortCodeApi();
String messageSid = "messageSid_example"; // String | The unique identifier for the sms resource
try {
    String result = apiInstance.shortcodeViewsms(messageSid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShortCodeApi#shortcodeViewsms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageSid** | **String**| The unique identifier for the sms resource |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

