# IO.Swagger.Api.CarrierApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CarrierLookup**](CarrierApi.md#carrierlookup) | **POST** /carrier/lookup.json | Lookup Carrier
[**CarrierLookuplist**](CarrierApi.md#carrierlookuplist) | **POST** /carrier/lookuplist.json | Carrier Results


<a name="carrierlookup"></a>
# **CarrierLookup**
> string CarrierLookup (string phoneNumber)

Lookup Carrier

Get the Carrier Lookup

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CarrierLookupExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new CarrierApi();
            var phoneNumber = phoneNumber_example;  // string | A valid 10-digit number (E.164 format).

            try
            {
                // Lookup Carrier
                string result = apiInstance.CarrierLookup(phoneNumber);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CarrierApi.CarrierLookup: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **string**| A valid 10-digit number (E.164 format). | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="carrierlookuplist"></a>
# **CarrierLookuplist**
> string CarrierLookuplist (int? page = null, int? pageSize = null)

Carrier Results

Retrieve a list of carrier lookup objects.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CarrierLookuplistExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new CarrierApi();
            var page = 56;  // int? | The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional)  (default to 1)
            var pageSize = 56;  // int? | The count of objects to return per page. (optional)  (default to 10)

            try
            {
                // Carrier Results
                string result = apiInstance.CarrierLookuplist(page, pageSize);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CarrierApi.CarrierLookuplist: " + e.Message );
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

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

