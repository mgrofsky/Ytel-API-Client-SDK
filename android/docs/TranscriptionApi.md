# TranscriptionApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transcriptionsAudiourltranscription**](TranscriptionApi.md#transcriptionsAudiourltranscription) | **POST** /transcriptions/audiourltranscription.json | Transcribe Audio URL
[**transcriptionsListtranscription**](TranscriptionApi.md#transcriptionsListtranscription) | **POST** /transcriptions/listtranscription.json | List Transcriptions
[**transcriptionsRecordingtranscription**](TranscriptionApi.md#transcriptionsRecordingtranscription) | **POST** /transcriptions/recordingtranscription.json | Transcribe Recording
[**transcriptionsViewtranscription**](TranscriptionApi.md#transcriptionsViewtranscription) | **POST** /transcriptions/viewtranscription.json | View Transcription


<a name="transcriptionsAudiourltranscription"></a>
# **transcriptionsAudiourltranscription**
> String transcriptionsAudiourltranscription(audiourl)

Transcribe Audio URL

Transcribe an audio recording from a file.

### Example
```java
// Import classes:
//import io.swagger.client.api.TranscriptionApi;

TranscriptionApi apiInstance = new TranscriptionApi();
String audiourl = "audiourl_example"; // String | URL pointing to the location of the audio file that is to be transcribed.
try {
    String result = apiInstance.transcriptionsAudiourltranscription(audiourl);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TranscriptionApi#transcriptionsAudiourltranscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audiourl** | **String**| URL pointing to the location of the audio file that is to be transcribed. |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="transcriptionsListtranscription"></a>
# **transcriptionsListtranscription**
> String transcriptionsListtranscription(page, pagesize, status, dateTranscribed)

List Transcriptions

Retrieve a list of transcription objects for your Ytel account.

### Example
```java
// Import classes:
//import io.swagger.client.api.TranscriptionApi;

TranscriptionApi apiInstance = new TranscriptionApi();
Integer page = 1; // Integer | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
Integer pagesize = 10; // Integer | The count of objects to return per page.
String status = "status_example"; // String | The state of the transcription.
String dateTranscribed = "dateTranscribed_example"; // String | The date the transcription took place.
try {
    String result = apiInstance.transcriptionsListtranscription(page, pagesize, status, dateTranscribed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TranscriptionApi#transcriptionsListtranscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **Integer**| The count of objects to return per page. | [optional] [default to 10]
 **status** | **String**| The state of the transcription. | [optional] [enum: inprogress, success, failure]
 **dateTranscribed** | **String**| The date the transcription took place. | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="transcriptionsRecordingtranscription"></a>
# **transcriptionsRecordingtranscription**
> String transcriptionsRecordingtranscription(recordingSid)

Transcribe Recording

Transcribe a recording by its RecordingSid.

### Example
```java
// Import classes:
//import io.swagger.client.api.TranscriptionApi;

TranscriptionApi apiInstance = new TranscriptionApi();
String recordingSid = "recordingSid_example"; // String | The unique identifier for a recording object.
try {
    String result = apiInstance.transcriptionsRecordingtranscription(recordingSid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TranscriptionApi#transcriptionsRecordingtranscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordingSid** | **String**| The unique identifier for a recording object. |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="transcriptionsViewtranscription"></a>
# **transcriptionsViewtranscription**
> String transcriptionsViewtranscription(transcriptionsid)

View Transcription

Retrieve information about a transaction by its TranscriptionSid.

### Example
```java
// Import classes:
//import io.swagger.client.api.TranscriptionApi;

TranscriptionApi apiInstance = new TranscriptionApi();
String transcriptionsid = "transcriptionsid_example"; // String | The unique identifier for a transcription object.
try {
    String result = apiInstance.transcriptionsViewtranscription(transcriptionsid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TranscriptionApi#transcriptionsViewtranscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transcriptionsid** | **String**| The unique identifier for a transcription object. |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

