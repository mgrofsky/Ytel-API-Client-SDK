# IO.Swagger.Api.AreaMailApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AreamailCreate**](AreaMailApi.md#areamailcreate) | **POST** /areamail/create.json | Create AreaMail
[**AreamailDelete**](AreaMailApi.md#areamaildelete) | **POST** /areamail/delete.json | Delete AreaMail
[**AreamailLists**](AreaMailApi.md#areamaillists) | **POST** /areamail/lists.json | List AreaMails
[**AreamailView**](AreaMailApi.md#areamailview) | **POST** /areamail/view.json | View AreaMail


<a name="areamailcreate"></a>
# **AreamailCreate**
> string AreamailCreate (string routes, string attachbyid, string front, string back, string description = null, string targettype = null, string htmldata = null)

Create AreaMail

Create a new AreaMail object.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class AreamailCreateExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new AreaMailApi();
            var routes = routes_example;  // string | List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route.List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route. A carrier route is in the form of 92610-C043 where the carrier route is composed of 5 numbers for zipcode, 1 letter for carrier route type, and 3 numbers for carrier route code. Delivery can be sent to mutliple routes by separating them with a commas. Valid Values: 92656, 92610-C043
            var attachbyid = attachbyid_example;  // string | Set an existing areamail by attaching its AreamailId.
            var front = front_example;  // string | The front of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. Back required
            var back = back_example;  // string | The back of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG.
            var description = description_example;  // string | A string value to use as a description for this AreaMail item. (optional) 
            var targettype = targettype_example;  // string | The delivery location type. (optional) 
            var htmldata = htmldata_example;  // string | A string value that contains HTML markup. (optional) 

            try
            {
                // Create AreaMail
                string result = apiInstance.AreamailCreate(routes, attachbyid, front, back, description, targettype, htmldata);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AreaMailApi.AreamailCreate: " + e.Message );
            }
        }
    }
}
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

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="areamaildelete"></a>
# **AreamailDelete**
> string AreamailDelete (string areamailid)

Delete AreaMail

Remove an AreaMail object by its AreaMailId.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class AreamailDeleteExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new AreaMailApi();
            var areamailid = areamailid_example;  // string | The unique identifier for an AreaMail object.

            try
            {
                // Delete AreaMail
                string result = apiInstance.AreamailDelete(areamailid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AreaMailApi.AreamailDelete: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **areamailid** | **string**| The unique identifier for an AreaMail object. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="areamaillists"></a>
# **AreamailLists**
> string AreamailLists (int? page = null, int? pagesize = null, string areamailsid = null, string dateCreated = null)

List AreaMails

Retrieve a list of AreaMail objects.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class AreamailListsExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new AreaMailApi();
            var page = 56;  // int? | The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional)  (default to 1)
            var pagesize = 56;  // int? | The count of objects to return per page. (optional)  (default to 10)
            var areamailsid = areamailsid_example;  // string | The unique identifier for an AreaMail object. (optional) 
            var dateCreated = dateCreated_example;  // string | The date the AreaMail was created. (optional) 

            try
            {
                // List AreaMails
                string result = apiInstance.AreamailLists(page, pagesize, areamailsid, dateCreated);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AreaMailApi.AreamailLists: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int?**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **int?**| The count of objects to return per page. | [optional] [default to 10]
 **areamailsid** | **string**| The unique identifier for an AreaMail object. | [optional] 
 **dateCreated** | **string**| The date the AreaMail was created. | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="areamailview"></a>
# **AreamailView**
> string AreamailView (string areamailid)

View AreaMail

Retrieve an AreaMail object by its AreaMailId.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class AreamailViewExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new AreaMailApi();
            var areamailid = areamailid_example;  // string | The unique identifier for an AreaMail object.

            try
            {
                // View AreaMail
                string result = apiInstance.AreamailView(areamailid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AreaMailApi.AreamailView: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **areamailid** | **string**| The unique identifier for an AreaMail object. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

