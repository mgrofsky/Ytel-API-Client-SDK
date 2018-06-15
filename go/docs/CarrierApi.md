# \CarrierApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CarrierLookup**](CarrierApi.md#CarrierLookup) | **Post** /carrier/lookup.json | Lookup Carrier
[**CarrierLookuplist**](CarrierApi.md#CarrierLookuplist) | **Post** /carrier/lookuplist.json | Carrier Results


# **CarrierLookup**
> string CarrierLookup(ctx, phoneNumber)
Lookup Carrier

Get the Carrier Lookup

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **phoneNumber** | **string**| A valid 10-digit number (E.164 format). | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CarrierLookuplist**
> string CarrierLookuplist(ctx, optional)
Carrier Results

Retrieve a list of carrier lookup objects.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int32**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [default to 1]
 **pageSize** | **int32**| The count of objects to return per page. | [default to 10]

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

