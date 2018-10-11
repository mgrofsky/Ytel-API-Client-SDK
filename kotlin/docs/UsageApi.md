# UsageApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usageListusage**](UsageApi.md#usageListusage) | **POST** /usage/listusage.json | List Usage


<a name="usageListusage"></a>
# **usageListusage**
> kotlin.String usageListusage(productCode, startDate, endDate, includeSubAccounts)

List Usage

Retrieve usage metrics regarding your Ytel account. The results includes inbound/outbound voice calls and inbound/outbound SMS messages as well as carrier lookup requests.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = UsageApi()
val productCode : kotlin.String = productCode_example // kotlin.String | Filter usage results by product type.
val startDate : kotlin.String = startDate_example // kotlin.String | Filter usage objects by start date.
val endDate : kotlin.String = endDate_example // kotlin.String | Filter usage objects by end date.
val includeSubAccounts : kotlin.String = includeSubAccounts_example // kotlin.String | Will include all subaccount usage data
try {
    val result : kotlin.String = apiInstance.usageListusage(productCode, startDate, endDate, includeSubAccounts)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsageApi#usageListusage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsageApi#usageListusage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productCode** | **kotlin.String**| Filter usage results by product type. | [optional] [default to 0] [enum: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]
 **startDate** | **kotlin.String**| Filter usage objects by start date. | [optional] [default to 2016-09-06]
 **endDate** | **kotlin.String**| Filter usage objects by end date. | [optional] [default to 2016-09-06]
 **includeSubAccounts** | **kotlin.String**| Will include all subaccount usage data | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

