# RecordingApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**recordingDeleterecording**](RecordingApi.md#recordingDeleterecording) | **POST** /recording/deleterecording.json | Delete Recording
[**recordingListrecording**](RecordingApi.md#recordingListrecording) | **POST** /recording/listrecording.json | List Recordings
[**recordingViewrecording**](RecordingApi.md#recordingViewrecording) | **POST** /recording/viewrecording.json | View Recording


<a name="recordingDeleterecording"></a>
# **recordingDeleterecording**
> kotlin.String recordingDeleterecording(recordingsid)

Delete Recording

Remove a recording from your Ytel account.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = RecordingApi()
val recordingsid : kotlin.String = recordingsid_example // kotlin.String | The unique identifier for a recording.
try {
    val result : kotlin.String = apiInstance.recordingDeleterecording(recordingsid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RecordingApi#recordingDeleterecording")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecordingApi#recordingDeleterecording")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordingsid** | **kotlin.String**| The unique identifier for a recording. |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="recordingListrecording"></a>
# **recordingListrecording**
> kotlin.String recordingListrecording(page, pagesize, datecreated, callsid)

List Recordings

Retrieve a list of recording objects.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = RecordingApi()
val page : kotlin.Int = 56 // kotlin.Int | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
val pagesize : kotlin.Int = 56 // kotlin.Int | The count of objects to return per page.
val datecreated : kotlin.String = datecreated_example // kotlin.String | Filter results by creation date
val callsid : kotlin.String = callsid_example // kotlin.String | The unique identifier for a call.
try {
    val result : kotlin.String = apiInstance.recordingListrecording(page, pagesize, datecreated, callsid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RecordingApi#recordingListrecording")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecordingApi#recordingListrecording")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **kotlin.Int**| The count of objects to return per page. | [optional] [default to 10]
 **datecreated** | **kotlin.String**| Filter results by creation date | [optional]
 **callsid** | **kotlin.String**| The unique identifier for a call. | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="recordingViewrecording"></a>
# **recordingViewrecording**
> kotlin.String recordingViewrecording(recordingsid)

View Recording

Retrieve the recording of a call by its RecordingSid. This resource will return information regarding the call such as start time, end time, duration, and so forth.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = RecordingApi()
val recordingsid : kotlin.String = recordingsid_example // kotlin.String | The unique identifier for the recording.
try {
    val result : kotlin.String = apiInstance.recordingViewrecording(recordingsid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RecordingApi#recordingViewrecording")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecordingApi#recordingViewrecording")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordingsid** | **kotlin.String**| The unique identifier for the recording. |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

