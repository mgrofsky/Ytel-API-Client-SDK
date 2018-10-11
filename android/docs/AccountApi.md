# AccountApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountsViewaccount**](AccountApi.md#accountsViewaccount) | **POST** /accounts/viewaccount.json | View Account


<a name="accountsViewaccount"></a>
# **accountsViewaccount**
> String accountsViewaccount(date)

View Account

Retrieve information regarding your Ytel account by a specific date. The response object will contain data such as account status, balance, and account usage totals.

### Example
```java
// Import classes:
//import io.swagger.client.api.AccountApi;

AccountApi apiInstance = new AccountApi();
String date = "date_example"; // String | Filter account information based on date.
try {
    String result = apiInstance.accountsViewaccount(date);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountsViewaccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **String**| Filter account information based on date. |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

