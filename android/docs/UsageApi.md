# UsageApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usageListusage**](UsageApi.md#usageListusage) | **POST** /usage/listusage.json | List Usage


<a name="usageListusage"></a>
# **usageListusage**
> String usageListusage(productCode, startDate, endDate, includeSubAccounts)

List Usage

Retrieve usage metrics regarding your Ytel account. The results includes inbound/outbound voice calls and inbound/outbound SMS messages as well as carrier lookup requests.

### Example
```java
// Import classes:
//import io.swagger.client.api.UsageApi;

UsageApi apiInstance = new UsageApi();
String productCode = "0"; // String | Filter usage results by product type.
String startDate = "2016-09-06"; // String | Filter usage objects by start date.
String endDate = "2016-09-06"; // String | Filter usage objects by end date.
String includeSubAccounts = "includeSubAccounts_example"; // String | Will include all subaccount usage data
try {
    String result = apiInstance.usageListusage(productCode, startDate, endDate, includeSubAccounts);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsageApi#usageListusage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productCode** | **String**| Filter usage results by product type. | [optional] [default to 0] [enum: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]
 **startDate** | **String**| Filter usage objects by start date. | [optional] [default to 2016-09-06]
 **endDate** | **String**| Filter usage objects by end date. | [optional] [default to 2016-09-06]
 **includeSubAccounts** | **String**| Will include all subaccount usage data | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

