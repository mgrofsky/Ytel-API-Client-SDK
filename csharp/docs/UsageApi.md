# IO.Swagger.Api.UsageApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**UsageListusage**](UsageApi.md#usagelistusage) | **POST** /usage/listusage.json | List Usage


<a name="usagelistusage"></a>
# **UsageListusage**
> string UsageListusage (string productCode = null, string startDate = null, string endDate = null, string includeSubAccounts = null)

List Usage

Retrieve usage metrics regarding your Ytel account. The results includes inbound/outbound voice calls and inbound/outbound SMS messages as well as carrier lookup requests.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UsageListusageExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new UsageApi();
            var productCode = productCode_example;  // string | Filter usage results by product type. (optional)  (default to 0)
            var startDate = startDate_example;  // string | Filter usage objects by start date. (optional)  (default to 2016-09-06)
            var endDate = endDate_example;  // string | Filter usage objects by end date. (optional)  (default to 2016-09-06)
            var includeSubAccounts = includeSubAccounts_example;  // string | Will include all subaccount usage data (optional) 

            try
            {
                // List Usage
                string result = apiInstance.UsageListusage(productCode, startDate, endDate, includeSubAccounts);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UsageApi.UsageListusage: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productCode** | **string**| Filter usage results by product type. | [optional] [default to 0]
 **startDate** | **string**| Filter usage objects by start date. | [optional] [default to 2016-09-06]
 **endDate** | **string**| Filter usage objects by end date. | [optional] [default to 2016-09-06]
 **includeSubAccounts** | **string**| Will include all subaccount usage data | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

