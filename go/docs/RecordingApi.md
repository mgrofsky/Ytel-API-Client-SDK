# \RecordingApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**RecordingDeleterecording**](RecordingApi.md#RecordingDeleterecording) | **Post** /recording/deleterecording.json | Delete Recording
[**RecordingListrecording**](RecordingApi.md#RecordingListrecording) | **Post** /recording/listrecording.json | List Recordings
[**RecordingViewrecording**](RecordingApi.md#RecordingViewrecording) | **Post** /recording/viewrecording.json | View Recording


# **RecordingDeleterecording**
> string RecordingDeleterecording(ctx, recordingsid)
Delete Recording

Remove a recording from your Ytel account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for logging, tracing, authentication, etc.
  **recordingsid** | **string**| The unique identifier for a recording. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **RecordingListrecording**
> string RecordingListrecording(ctx, optional)
List Recordings

Retrieve a list of recording objects.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for logging, tracing, authentication, etc.
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int32**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [default to 1]
 **pagesize** | **int32**| The count of objects to return per page. | [default to 10]
 **datecreated** | **string**| Filter results by creation date | 
 **callsid** | **string**| The unique identifier for a call. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **RecordingViewrecording**
> string RecordingViewrecording(ctx, recordingsid)
View Recording

Retrieve the recording of a call by its RecordingSid. This resource will return information regarding the call such as start time, end time, duration, and so forth.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for logging, tracing, authentication, etc.
  **recordingsid** | **string**| The unique identifier for the recording. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

