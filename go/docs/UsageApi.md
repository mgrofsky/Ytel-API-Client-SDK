# \UsageApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**UsageListusage**](UsageApi.md#UsageListusage) | **Post** /usage/listusage.json | List Usage


# **UsageListusage**
> string UsageListusage(ctx, optional)
List Usage

Retrieve usage metrics regarding your Ytel account. The results includes inbound/outbound voice calls and inbound/outbound SMS messages as well as carrier lookup requests.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productCode** | **string**| Filter usage results by product type. | [default to 0]
 **startDate** | **string**| Filter usage objects by start date. | [default to 2016-09-06]
 **endDate** | **string**| Filter usage objects by end date. | [default to 2016-09-06]
 **includeSubAccounts** | **string**| Will include all subaccount usage data | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

