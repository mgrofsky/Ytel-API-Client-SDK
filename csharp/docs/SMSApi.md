# IO.Swagger.Api.SMSApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SmsGetinboundsms**](SMSApi.md#smsgetinboundsms) | **POST** /sms/getinboundsms.json | List Inbound SMS
[**SmsListsms**](SMSApi.md#smslistsms) | **POST** /sms/listsms.json | List SMS
[**SmsSendsms**](SMSApi.md#smssendsms) | **POST** /sms/sendsms.json | Send SMS
[**SmsViewdetailsms**](SMSApi.md#smsviewdetailsms) | **POST** /sms/viewdetailsms.json | View SMS
[**SmsViewsms**](SMSApi.md#smsviewsms) | **POST** /sms/viewsms.json | View SMS


<a name="smsgetinboundsms"></a>
# **SmsGetinboundsms**
> string SmsGetinboundsms (int? page = null, int? pageSize = null, string from = null, string to = null, string dateSent = null)

List Inbound SMS

Retrieve a list of Inbound SMS message objects.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class SmsGetinboundsmsExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SMSApi();
            var page = 56;  // int? | The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional)  (default to 1)
            var pageSize = 56;  // int? | The count of objects to return per page. (optional)  (default to 10)
            var from = from_example;  // string | Filter SMS message objects from this valid 10-digit phone number (E.164 format). (optional) 
            var to = to_example;  // string | Filter SMS message objects to this valid 10-digit phone number (E.164 format). (optional) 
            var dateSent = dateSent_example;  // string | Filter sms message objects by this date. (optional) 

            try
            {
                // List Inbound SMS
                string result = apiInstance.SmsGetinboundsms(page, pageSize, from, to, dateSent);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SMSApi.SmsGetinboundsms: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int?**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pageSize** | **int?**| The count of objects to return per page. | [optional] [default to 10]
 **from** | **string**| Filter SMS message objects from this valid 10-digit phone number (E.164 format). | [optional] 
 **to** | **string**| Filter SMS message objects to this valid 10-digit phone number (E.164 format). | [optional] 
 **dateSent** | **string**| Filter sms message objects by this date. | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="smslistsms"></a>
# **SmsListsms**
> string SmsListsms (int? page = null, int? pageSize = null, string from = null, string to = null, string dateSent = null)

List SMS

Retrieve a list of Outbound SMS message objects.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class SmsListsmsExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SMSApi();
            var page = 56;  // int? | The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional)  (default to 1)
            var pageSize = 56;  // int? | Number of individual resources listed in the response per page (optional)  (default to 10)
            var from = from_example;  // string | Filter SMS message objects from this valid 10-digit phone number (E.164 format). (optional) 
            var to = to_example;  // string | Filter SMS message objects to this valid 10-digit phone number (E.164 format). (optional) 
            var dateSent = dateSent_example;  // string | Only list SMS messages sent in the specified date range (optional) 

            try
            {
                // List SMS
                string result = apiInstance.SmsListsms(page, pageSize, from, to, dateSent);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SMSApi.SmsListsms: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int?**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pageSize** | **int?**| Number of individual resources listed in the response per page | [optional] [default to 10]
 **from** | **string**| Filter SMS message objects from this valid 10-digit phone number (E.164 format). | [optional] 
 **to** | **string**| Filter SMS message objects to this valid 10-digit phone number (E.164 format). | [optional] 
 **dateSent** | **string**| Only list SMS messages sent in the specified date range | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="smssendsms"></a>
# **SmsSendsms**
> string SmsSendsms (string from, string to, string body, string method = null, string messageStatusCallback = null, bool? smartsms = null, bool? deliveryStatus = null)

Send SMS

Send an SMS from a Ytel number

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class SmsSendsmsExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SMSApi();
            var from = from_example;  // string | The 10-digit SMS-enabled Ytel number (E.164 format) in which the message is sent.
            var to = to_example;  // string | The 10-digit phone number (E.164 format) that will receive the message.
            var body = body_example;  // string | The body message that is to be sent in the text.
            var method = method_example;  // string | Specifies the HTTP method used to request the required URL once SMS sent. (optional) 
            var messageStatusCallback = messageStatusCallback_example;  // string | URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished. (optional) 
            var smartsms = true;  // bool? | Check's 'to' number can receive sms or not using Carrier API, if wireless = true then text sms is sent, else wireless = false then call is recieved to end user with audible message. (optional)  (default to false)
            var deliveryStatus = true;  // bool? | Delivery reports are a method to tell your system if the message has arrived on the destination phone. (optional)  (default to false)

            try
            {
                // Send SMS
                string result = apiInstance.SmsSendsms(from, to, body, method, messageStatusCallback, smartsms, deliveryStatus);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SMSApi.SmsSendsms: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **string**| The 10-digit SMS-enabled Ytel number (E.164 format) in which the message is sent. | 
 **to** | **string**| The 10-digit phone number (E.164 format) that will receive the message. | 
 **body** | **string**| The body message that is to be sent in the text. | 
 **method** | **string**| Specifies the HTTP method used to request the required URL once SMS sent. | [optional] 
 **messageStatusCallback** | **string**| URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished. | [optional] 
 **smartsms** | **bool?**| Check&#39;s &#39;to&#39; number can receive sms or not using Carrier API, if wireless &#x3D; true then text sms is sent, else wireless &#x3D; false then call is recieved to end user with audible message. | [optional] [default to false]
 **deliveryStatus** | **bool?**| Delivery reports are a method to tell your system if the message has arrived on the destination phone. | [optional] [default to false]

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="smsviewdetailsms"></a>
# **SmsViewdetailsms**
> string SmsViewdetailsms (string messageSid)

View SMS

Retrieve a single SMS message object with details by its SmsSid.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class SmsViewdetailsmsExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SMSApi();
            var messageSid = messageSid_example;  // string | The unique identifier for a sms message.

            try
            {
                // View SMS
                string result = apiInstance.SmsViewdetailsms(messageSid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SMSApi.SmsViewdetailsms: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageSid** | **string**| The unique identifier for a sms message. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="smsviewsms"></a>
# **SmsViewsms**
> string SmsViewsms (string messageSid)

View SMS

Retrieve a single SMS message object by its SmsSid.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class SmsViewsmsExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SMSApi();
            var messageSid = messageSid_example;  // string | The unique identifier for a sms message.

            try
            {
                // View SMS
                string result = apiInstance.SmsViewsms(messageSid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SMSApi.SmsViewsms: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageSid** | **string**| The unique identifier for a sms message. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

