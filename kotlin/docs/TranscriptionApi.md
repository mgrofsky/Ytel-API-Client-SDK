# TranscriptionApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transcriptionsAudiourltranscription**](TranscriptionApi.md#transcriptionsAudiourltranscription) | **POST** /transcriptions/audiourltranscription.json | Transcribe Audio URL
[**transcriptionsListtranscription**](TranscriptionApi.md#transcriptionsListtranscription) | **POST** /transcriptions/listtranscription.json | List Transcriptions
[**transcriptionsRecordingtranscription**](TranscriptionApi.md#transcriptionsRecordingtranscription) | **POST** /transcriptions/recordingtranscription.json | Transcribe Recording
[**transcriptionsViewtranscription**](TranscriptionApi.md#transcriptionsViewtranscription) | **POST** /transcriptions/viewtranscription.json | View Transcription


<a name="transcriptionsAudiourltranscription"></a>
# **transcriptionsAudiourltranscription**
> kotlin.String transcriptionsAudiourltranscription(audiourl)

Transcribe Audio URL

Transcribe an audio recording from a file.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = TranscriptionApi()
val audiourl : kotlin.String = audiourl_example // kotlin.String | URL pointing to the location of the audio file that is to be transcribed.
try {
    val result : kotlin.String = apiInstance.transcriptionsAudiourltranscription(audiourl)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TranscriptionApi#transcriptionsAudiourltranscription")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TranscriptionApi#transcriptionsAudiourltranscription")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audiourl** | **kotlin.String**| URL pointing to the location of the audio file that is to be transcribed. |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="transcriptionsListtranscription"></a>
# **transcriptionsListtranscription**
> kotlin.String transcriptionsListtranscription(page, pagesize, status, dateTranscribed)

List Transcriptions

Retrieve a list of transcription objects for your Ytel account.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = TranscriptionApi()
val page : kotlin.Int = 56 // kotlin.Int | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
val pagesize : kotlin.Int = 56 // kotlin.Int | The count of objects to return per page.
val status : kotlin.String = status_example // kotlin.String | The state of the transcription.
val dateTranscribed : kotlin.String = dateTranscribed_example // kotlin.String | The date the transcription took place.
try {
    val result : kotlin.String = apiInstance.transcriptionsListtranscription(page, pagesize, status, dateTranscribed)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TranscriptionApi#transcriptionsListtranscription")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TranscriptionApi#transcriptionsListtranscription")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **kotlin.Int**| The count of objects to return per page. | [optional] [default to 10]
 **status** | **kotlin.String**| The state of the transcription. | [optional] [enum: inprogress, success, failure]
 **dateTranscribed** | **kotlin.String**| The date the transcription took place. | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="transcriptionsRecordingtranscription"></a>
# **transcriptionsRecordingtranscription**
> kotlin.String transcriptionsRecordingtranscription(recordingSid)

Transcribe Recording

Transcribe a recording by its RecordingSid.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = TranscriptionApi()
val recordingSid : kotlin.String = recordingSid_example // kotlin.String | The unique identifier for a recording object.
try {
    val result : kotlin.String = apiInstance.transcriptionsRecordingtranscription(recordingSid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TranscriptionApi#transcriptionsRecordingtranscription")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TranscriptionApi#transcriptionsRecordingtranscription")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordingSid** | **kotlin.String**| The unique identifier for a recording object. |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="transcriptionsViewtranscription"></a>
# **transcriptionsViewtranscription**
> kotlin.String transcriptionsViewtranscription(transcriptionsid)

View Transcription

Retrieve information about a transaction by its TranscriptionSid.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = TranscriptionApi()
val transcriptionsid : kotlin.String = transcriptionsid_example // kotlin.String | The unique identifier for a transcription object.
try {
    val result : kotlin.String = apiInstance.transcriptionsViewtranscription(transcriptionsid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TranscriptionApi#transcriptionsViewtranscription")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TranscriptionApi#transcriptionsViewtranscription")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transcriptionsid** | **kotlin.String**| The unique identifier for a transcription object. |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

