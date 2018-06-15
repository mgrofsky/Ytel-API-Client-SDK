# IO.Swagger.Api.SharedShortCodeApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**KeywordLists**](SharedShortCodeApi.md#keywordlists) | **POST** /keyword/lists.json | List Keywords
[**KeywordView**](SharedShortCodeApi.md#keywordview) | **POST** /keyword/view.json | View Keyword
[**ShortcodeGetinboundsms**](SharedShortCodeApi.md#shortcodegetinboundsms) | **POST** /shortcode/getinboundsms.json | List Inbound SMS
[**ShortcodeListshortcode**](SharedShortCodeApi.md#shortcodelistshortcode) | **POST** /shortcode/listshortcode.json | List Shortcodes
[**ShortcodeSendsms**](SharedShortCodeApi.md#shortcodesendsms) | **POST** /shortcode/sendsms.json | Send SMS
[**ShortcodeUpdateshortcode**](SharedShortCodeApi.md#shortcodeupdateshortcode) | **POST** /shortcode/updateshortcode.json | Update Shortcode
[**ShortcodeViewshortcode**](SharedShortCodeApi.md#shortcodeviewshortcode) | **POST** /shortcode/viewshortcode.json | View Shortcode
[**TemplateLists**](SharedShortCodeApi.md#templatelists) | **POST** /template/lists.json | List Templates
[**TemplateView**](SharedShortCodeApi.md#templateview) | **POST** /template/view.json | View Template


<a name="keywordlists"></a>
# **KeywordLists**
> string KeywordLists (int? page = null, int? pagesize = null, string keyword = null, int? shortcode = null)

List Keywords

Retrieve a list of keywords associated with your Ytel account.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class KeywordListsExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SharedShortCodeApi();
            var page = 56;  // int? | The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional)  (default to 1)
            var pagesize = 56;  // int? | Number of individual resources listed in the response per page (optional)  (default to 10)
            var keyword = keyword_example;  // string | Only list keywords of keyword (optional) 
            var shortcode = 56;  // int? | Only list keywords of shortcode (optional) 

            try
            {
                // List Keywords
                string result = apiInstance.KeywordLists(page, pagesize, keyword, shortcode);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SharedShortCodeApi.KeywordLists: " + e.Message );
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
 **keyword** | **string**| Only list keywords of keyword | [optional] 
 **shortcode** | **int?**| Only list keywords of shortcode | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="keywordview"></a>
# **KeywordView**
> string KeywordView (string keywordid)

View Keyword

View a set of properties for a single keyword.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class KeywordViewExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SharedShortCodeApi();
            var keywordid = keywordid_example;  // string | The unique identifier of each keyword

            try
            {
                // View Keyword
                string result = apiInstance.KeywordView(keywordid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SharedShortCodeApi.KeywordView: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keywordid** | **string**| The unique identifier of each keyword | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="shortcodegetinboundsms"></a>
# **ShortcodeGetinboundsms**
> string ShortcodeGetinboundsms (int? page = null, int? pagesize = null, string from = null, string shortcode = null, string datecreated = null)

List Inbound SMS

List All Inbound ShortCode

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ShortcodeGetinboundsmsExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SharedShortCodeApi();
            var page = 56;  // int? | The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional)  (default to 1)
            var pagesize = 56;  // int? | Number of individual resources listed in the response per page (optional)  (default to 10)
            var from = from_example;  // string | From Number to Inbound ShortCode (optional) 
            var shortcode = shortcode_example;  // string | Only list messages sent to this Short Code (optional) 
            var datecreated = datecreated_example;  // string | Only list messages sent with the specified date (optional) 

            try
            {
                // List Inbound SMS
                string result = apiInstance.ShortcodeGetinboundsms(page, pagesize, from, shortcode, datecreated);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SharedShortCodeApi.ShortcodeGetinboundsms: " + e.Message );
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
 **from** | **string**| From Number to Inbound ShortCode | [optional] 
 **shortcode** | **string**| Only list messages sent to this Short Code | [optional] 
 **datecreated** | **string**| Only list messages sent with the specified date | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="shortcodelistshortcode"></a>
# **ShortcodeListshortcode**
> string ShortcodeListshortcode (int? page = null, int? pagesize = null, string shortcode = null)

List Shortcodes

Retrieve a list of shortcode assignment associated with your Ytel account.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ShortcodeListshortcodeExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SharedShortCodeApi();
            var page = 56;  // int? | The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional)  (default to 1)
            var pagesize = 56;  // int? | Number of individual resources listed in the response per page (optional)  (default to 10)
            var shortcode = shortcode_example;  // string | Only list keywords of shortcode (optional) 

            try
            {
                // List Shortcodes
                string result = apiInstance.ShortcodeListshortcode(page, pagesize, shortcode);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SharedShortCodeApi.ShortcodeListshortcode: " + e.Message );
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
 **shortcode** | **string**| Only list keywords of shortcode | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="shortcodesendsms"></a>
# **ShortcodeSendsms**
> string ShortcodeSendsms (string shortcode, string to, Guid? templateid, string data, string method = null, string messageStatusCallback = null)

Send SMS

Send an SMS from a Ytel ShortCode

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ShortcodeSendsmsExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SharedShortCodeApi();
            var shortcode = shortcode_example;  // string | The Short Code number that is the sender of this message
            var to = to_example;  // string | A valid 10-digit number that should receive the message
            var templateid = templateid_example;  // Guid? | The unique identifier for the template used for the message
            var data = data_example;  // string | format of your data, example: {companyname}:test,{otpcode}:1234
            var method = method_example;  // string | Specifies the HTTP method used to request the required URL once the Short Code message is sent. (optional)  (default to GET)
            var messageStatusCallback = messageStatusCallback_example;  // string | URL that can be requested to receive notification when Short Code message was sent. (optional) 

            try
            {
                // Send SMS
                string result = apiInstance.ShortcodeSendsms(shortcode, to, templateid, data, method, messageStatusCallback);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SharedShortCodeApi.ShortcodeSendsms: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **string**| The Short Code number that is the sender of this message | 
 **to** | **string**| A valid 10-digit number that should receive the message | 
 **templateid** | **Guid?**| The unique identifier for the template used for the message | 
 **data** | **string**| format of your data, example: {companyname}:test,{otpcode}:1234 | 
 **method** | **string**| Specifies the HTTP method used to request the required URL once the Short Code message is sent. | [optional] [default to GET]
 **messageStatusCallback** | **string**| URL that can be requested to receive notification when Short Code message was sent. | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="shortcodeupdateshortcode"></a>
# **ShortcodeUpdateshortcode**
> string ShortcodeUpdateshortcode (string shortcode, string friendlyName = null, string callbackUrl = null, string callbackMethod = null, string fallbackUrl = null, string fallbackUrlMethod = null)

Update Shortcode

Update Assignment

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ShortcodeUpdateshortcodeExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SharedShortCodeApi();
            var shortcode = shortcode_example;  // string | List of valid shortcode to your Ytel account
            var friendlyName = friendlyName_example;  // string | User generated name of the shortcode (optional) 
            var callbackUrl = callbackUrl_example;  // string | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. (optional) 
            var callbackMethod = callbackMethod_example;  // string | Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. (optional) 
            var fallbackUrl = fallbackUrl_example;  // string | URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST. (optional) 
            var fallbackUrlMethod = fallbackUrlMethod_example;  // string | Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional) 

            try
            {
                // Update Shortcode
                string result = apiInstance.ShortcodeUpdateshortcode(shortcode, friendlyName, callbackUrl, callbackMethod, fallbackUrl, fallbackUrlMethod);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SharedShortCodeApi.ShortcodeUpdateshortcode: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **string**| List of valid shortcode to your Ytel account | 
 **friendlyName** | **string**| User generated name of the shortcode | [optional] 
 **callbackUrl** | **string**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. | [optional] 
 **callbackMethod** | **string**| Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. | [optional] 
 **fallbackUrl** | **string**| URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST. | [optional] 
 **fallbackUrlMethod** | **string**| Specifies the HTTP method used to request the required FallbackUrl once call connects. | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="shortcodeviewshortcode"></a>
# **ShortcodeViewshortcode**
> string ShortcodeViewshortcode (string shortcode)

View Shortcode

The response returned here contains all resource properties associated with the given Shortcode.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ShortcodeViewshortcodeExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SharedShortCodeApi();
            var shortcode = shortcode_example;  // string | List of valid Shortcode to your Ytel account

            try
            {
                // View Shortcode
                string result = apiInstance.ShortcodeViewshortcode(shortcode);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SharedShortCodeApi.ShortcodeViewshortcode: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **string**| List of valid Shortcode to your Ytel account | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="templatelists"></a>
# **TemplateLists**
> string TemplateLists (string type = null, int? page = null, int? pagesize = null, string shortcode = null)

List Templates

List Shortcode Templates by Type

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class TemplateListsExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SharedShortCodeApi();
            var type = type_example;  // string | The type (category) of template Valid values: marketing, authorization (optional)  (default to authorization)
            var page = 56;  // int? | The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional)  (default to 1)
            var pagesize = 56;  // int? | The count of objects to return per page. (optional)  (default to 10)
            var shortcode = shortcode_example;  // string | Only list templates of type (optional) 

            try
            {
                // List Templates
                string result = apiInstance.TemplateLists(type, page, pagesize, shortcode);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SharedShortCodeApi.TemplateLists: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **string**| The type (category) of template Valid values: marketing, authorization | [optional] [default to authorization]
 **page** | **int?**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **int?**| The count of objects to return per page. | [optional] [default to 10]
 **shortcode** | **string**| Only list templates of type | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="templateview"></a>
# **TemplateView**
> string TemplateView (Guid? templateId)

View Template

View a Shared ShortCode Template

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class TemplateViewExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SharedShortCodeApi();
            var templateId = templateId_example;  // Guid? | The unique identifier for a template object

            try
            {
                // View Template
                string result = apiInstance.TemplateView(templateId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SharedShortCodeApi.TemplateView: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **Guid?**| The unique identifier for a template object | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

