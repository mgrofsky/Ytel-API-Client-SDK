# IO.Swagger.Api.ShortCodeApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DedicatedshortcodeGetinboundsms**](ShortCodeApi.md#dedicatedshortcodegetinboundsms) | **POST** /dedicatedshortcode/getinboundsms.json | List Inbound SMS
[**DedicatedshortcodeListshortcode**](ShortCodeApi.md#dedicatedshortcodelistshortcode) | **POST** /dedicatedshortcode/listshortcode.json | List Shortcodes
[**DedicatedshortcodeSendsms**](ShortCodeApi.md#dedicatedshortcodesendsms) | **POST** /dedicatedshortcode/sendsms.json | Send SMS
[**DedicatedshortcodeUpdateshortcode**](ShortCodeApi.md#dedicatedshortcodeupdateshortcode) | **POST** /dedicatedshortcode/updateshortcode.json | Update Shortcode
[**DedicatedshortcodeViewshortcode**](ShortCodeApi.md#dedicatedshortcodeviewshortcode) | **POST** /dedicatedshortcode/viewshortcode.json | View SMS
[**ShortcodeListsms**](ShortCodeApi.md#shortcodelistsms) | **POST** /shortcode/listsms.json | List SMS
[**ShortcodeViewsms**](ShortCodeApi.md#shortcodeviewsms) | **POST** /shortcode/viewsms.json | View SMS


<a name="dedicatedshortcodegetinboundsms"></a>
# **DedicatedshortcodeGetinboundsms**
> string DedicatedshortcodeGetinboundsms (int? page = null, int? pagesize = null, string from = null, string shortcode = null, string datecreated = null)

List Inbound SMS

Retrive a list of inbound Sms Short Code messages associated with your Ytel account.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DedicatedshortcodeGetinboundsmsExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ShortCodeApi();
            var page = 56;  // int? | The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional)  (default to 1)
            var pagesize = 56;  // int? | Number of individual resources listed in the response per page (optional)  (default to 10)
            var from = from_example;  // string | Only list SMS messages sent from this number (optional) 
            var shortcode = shortcode_example;  // string | Only list SMS messages sent to Shortcode (optional) 
            var datecreated = datecreated_example;  // string | Only list SMS messages sent in the specified date MAKE REQUEST (optional) 

            try
            {
                // List Inbound SMS
                string result = apiInstance.DedicatedshortcodeGetinboundsms(page, pagesize, from, shortcode, datecreated);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ShortCodeApi.DedicatedshortcodeGetinboundsms: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int?**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **int?**| Number of individual resources listed in the response per page | [optional] [default to 10]
 **from** | **string**| Only list SMS messages sent from this number | [optional] 
 **shortcode** | **string**| Only list SMS messages sent to Shortcode | [optional] 
 **datecreated** | **string**| Only list SMS messages sent in the specified date MAKE REQUEST | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="dedicatedshortcodelistshortcode"></a>
# **DedicatedshortcodeListshortcode**
> string DedicatedshortcodeListshortcode (string shortcode = null, string page = null, string pagesize = null)

List Shortcodes

Retrieve a list of Short Code assignment associated with your Ytel account.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DedicatedshortcodeListshortcodeExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ShortCodeApi();
            var shortcode = shortcode_example;  // string | Only list Short Code Assignment sent from this Short Code (optional) 
            var page = page_example;  // string | The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) 
            var pagesize = pagesize_example;  // string | The count of objects to return per page. (optional) 

            try
            {
                // List Shortcodes
                string result = apiInstance.DedicatedshortcodeListshortcode(shortcode, page, pagesize);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ShortCodeApi.DedicatedshortcodeListshortcode: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **string**| Only list Short Code Assignment sent from this Short Code | [optional] 
 **page** | **string**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] 
 **pagesize** | **string**| The count of objects to return per page. | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="dedicatedshortcodesendsms"></a>
# **DedicatedshortcodeSendsms**
> string DedicatedshortcodeSendsms (int? shortcode, double? to, string body, string method = null, string messagestatuscallback = null)

Send SMS

Send Dedicated Shortcode

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DedicatedshortcodeSendsmsExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ShortCodeApi();
            var shortcode = 56;  // int? | Your dedicated shortcode
            var to = 1.2;  // double? | The number to send your SMS to
            var body = body_example;  // string | The body of your message
            var method = method_example;  // string | Specifies the HTTP method used to request the required URL once the Short Code message is sent.GET or POST (optional) 
            var messagestatuscallback = messagestatuscallback_example;  // string | URL that can be requested to receive notification when Short Code message was sent. (optional) 

            try
            {
                // Send SMS
                string result = apiInstance.DedicatedshortcodeSendsms(shortcode, to, body, method, messagestatuscallback);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ShortCodeApi.DedicatedshortcodeSendsms: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **int?**| Your dedicated shortcode | 
 **to** | **double?**| The number to send your SMS to | 
 **body** | **string**| The body of your message | 
 **method** | **string**| Specifies the HTTP method used to request the required URL once the Short Code message is sent.GET or POST | [optional] 
 **messagestatuscallback** | **string**| URL that can be requested to receive notification when Short Code message was sent. | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="dedicatedshortcodeupdateshortcode"></a>
# **DedicatedshortcodeUpdateshortcode**
> string DedicatedshortcodeUpdateshortcode (string shortcode, string friendlyName = null, string callbackMethod = null, string callbackUrl = null, string fallbackMethod = null, string fallbackUrl = null)

Update Shortcode

Update a dedicated shortcode.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DedicatedshortcodeUpdateshortcodeExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ShortCodeApi();
            var shortcode = shortcode_example;  // string | List of valid dedicated shortcode to your Ytel account.
            var friendlyName = friendlyName_example;  // string | User generated name of the dedicated shortcode. (optional) 
            var callbackMethod = callbackMethod_example;  // string | Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. (optional) 
            var callbackUrl = callbackUrl_example;  // string | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. (optional) 
            var fallbackMethod = fallbackMethod_example;  // string | Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional) 
            var fallbackUrl = fallbackUrl_example;  // string | URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST. (optional) 

            try
            {
                // Update Shortcode
                string result = apiInstance.DedicatedshortcodeUpdateshortcode(shortcode, friendlyName, callbackMethod, callbackUrl, fallbackMethod, fallbackUrl);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ShortCodeApi.DedicatedshortcodeUpdateshortcode: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **string**| List of valid dedicated shortcode to your Ytel account. | 
 **friendlyName** | **string**| User generated name of the dedicated shortcode. | [optional] 
 **callbackMethod** | **string**| Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. | [optional] 
 **callbackUrl** | **string**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. | [optional] 
 **fallbackMethod** | **string**| Specifies the HTTP method used to request the required FallbackUrl once call connects. | [optional] 
 **fallbackUrl** | **string**| URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST. | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="dedicatedshortcodeviewshortcode"></a>
# **DedicatedshortcodeViewshortcode**
> string DedicatedshortcodeViewshortcode (string shortcode)

View SMS

Retrieve a single Short Code object by its shortcode assignment.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DedicatedshortcodeViewshortcodeExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ShortCodeApi();
            var shortcode = shortcode_example;  // string | List of valid Dedicated Short Code to your Ytel account

            try
            {
                // View SMS
                string result = apiInstance.DedicatedshortcodeViewshortcode(shortcode);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ShortCodeApi.DedicatedshortcodeViewshortcode: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **string**| List of valid Dedicated Short Code to your Ytel account | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="shortcodelistsms"></a>
# **ShortcodeListsms**
> string ShortcodeListsms (string shortcode = null, string to = null, string dateSent = null, int? page = null, int? pageSize = null)

List SMS

Retrieve a list of Short Code messages.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ShortcodeListsmsExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ShortCodeApi();
            var shortcode = shortcode_example;  // string | Only list messages sent from this Short Code (optional) 
            var to = to_example;  // string | Only list messages sent to this number (optional) 
            var dateSent = dateSent_example;  // string | Only list messages sent with the specified date (optional) 
            var page = 56;  // int? | The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional)  (default to 1)
            var pageSize = 56;  // int? | The count of objects to return per page. (optional)  (default to 10)

            try
            {
                // List SMS
                string result = apiInstance.ShortcodeListsms(shortcode, to, dateSent, page, pageSize);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ShortCodeApi.ShortcodeListsms: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **string**| Only list messages sent from this Short Code | [optional] 
 **to** | **string**| Only list messages sent to this number | [optional] 
 **dateSent** | **string**| Only list messages sent with the specified date | [optional] 
 **page** | **int?**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pageSize** | **int?**| The count of objects to return per page. | [optional] [default to 10]

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="shortcodeviewsms"></a>
# **ShortcodeViewsms**
> string ShortcodeViewsms (string messageSid)

View SMS

View a single Sms Short Code message.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ShortcodeViewsmsExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ShortCodeApi();
            var messageSid = messageSid_example;  // string | The unique identifier for the sms resource

            try
            {
                // View SMS
                string result = apiInstance.ShortcodeViewsms(messageSid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ShortCodeApi.ShortcodeViewsms: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageSid** | **string**| The unique identifier for the sms resource | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

