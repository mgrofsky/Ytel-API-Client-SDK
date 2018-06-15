# IO.Swagger.Api.AccountApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AccountsViewaccount**](AccountApi.md#accountsviewaccount) | **POST** /accounts/viewaccount.json | View Account


<a name="accountsviewaccount"></a>
# **AccountsViewaccount**
> string AccountsViewaccount (string date)

View Account

Retrieve information regarding your Ytel account by a specific date. The response object will contain data such as account status, balance, and account usage totals.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class AccountsViewaccountExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new AccountApi();
            var date = date_example;  // string | Filter account information based on date.

            try
            {
                // View Account
                string result = apiInstance.AccountsViewaccount(date);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AccountApi.AccountsViewaccount: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **string**| Filter account information based on date. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

