# AccountApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountsViewaccount**](AccountApi.md#accountsViewaccount) | **POST** /accounts/viewaccount.json | View Account


<a name="accountsViewaccount"></a>
# **accountsViewaccount**
> kotlin.String accountsViewaccount(date)

View Account

Retrieve information regarding your Ytel account by a specific date. The response object will contain data such as account status, balance, and account usage totals.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = AccountApi()
val date : kotlin.String = date_example // kotlin.String | Filter account information based on date.
try {
    val result : kotlin.String = apiInstance.accountsViewaccount(date)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#accountsViewaccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#accountsViewaccount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **kotlin.String**| Filter account information based on date. |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

