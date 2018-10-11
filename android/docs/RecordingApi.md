# RecordingApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**recordingDeleterecording**](RecordingApi.md#recordingDeleterecording) | **POST** /recording/deleterecording.json | Delete Recording
[**recordingListrecording**](RecordingApi.md#recordingListrecording) | **POST** /recording/listrecording.json | List Recordings
[**recordingViewrecording**](RecordingApi.md#recordingViewrecording) | **POST** /recording/viewrecording.json | View Recording


<a name="recordingDeleterecording"></a>
# **recordingDeleterecording**
> String recordingDeleterecording(recordingsid)

Delete Recording

Remove a recording from your Ytel account.

### Example
```java
// Import classes:
//import io.swagger.client.api.RecordingApi;

RecordingApi apiInstance = new RecordingApi();
String recordingsid = "recordingsid_example"; // String | The unique identifier for a recording.
try {
    String result = apiInstance.recordingDeleterecording(recordingsid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#recordingDeleterecording");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordingsid** | **String**| The unique identifier for a recording. |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="recordingListrecording"></a>
# **recordingListrecording**
> String recordingListrecording(page, pagesize, datecreated, callsid)

List Recordings

Retrieve a list of recording objects.

### Example
```java
// Import classes:
//import io.swagger.client.api.RecordingApi;

RecordingApi apiInstance = new RecordingApi();
Integer page = 1; // Integer | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
Integer pagesize = 10; // Integer | The count of objects to return per page.
String datecreated = "datecreated_example"; // String | Filter results by creation date
String callsid = "callsid_example"; // String | The unique identifier for a call.
try {
    String result = apiInstance.recordingListrecording(page, pagesize, datecreated, callsid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#recordingListrecording");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **Integer**| The count of objects to return per page. | [optional] [default to 10]
 **datecreated** | **String**| Filter results by creation date | [optional]
 **callsid** | **String**| The unique identifier for a call. | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="recordingViewrecording"></a>
# **recordingViewrecording**
> String recordingViewrecording(recordingsid)

View Recording

Retrieve the recording of a call by its RecordingSid. This resource will return information regarding the call such as start time, end time, duration, and so forth.

### Example
```java
// Import classes:
//import io.swagger.client.api.RecordingApi;

RecordingApi apiInstance = new RecordingApi();
String recordingsid = "recordingsid_example"; // String | The unique identifier for the recording.
try {
    String result = apiInstance.recordingViewrecording(recordingsid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#recordingViewrecording");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordingsid** | **String**| The unique identifier for the recording. |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

