# \TranscriptionApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**TranscriptionsAudiourltranscription**](TranscriptionApi.md#TranscriptionsAudiourltranscription) | **Post** /transcriptions/audiourltranscription.json | Transcribe Audio URL
[**TranscriptionsListtranscription**](TranscriptionApi.md#TranscriptionsListtranscription) | **Post** /transcriptions/listtranscription.json | List Transcriptions
[**TranscriptionsRecordingtranscription**](TranscriptionApi.md#TranscriptionsRecordingtranscription) | **Post** /transcriptions/recordingtranscription.json | Transcribe Recording
[**TranscriptionsViewtranscription**](TranscriptionApi.md#TranscriptionsViewtranscription) | **Post** /transcriptions/viewtranscription.json | View Transcription


# **TranscriptionsAudiourltranscription**
> string TranscriptionsAudiourltranscription(ctx, audiourl)
Transcribe Audio URL

Transcribe an audio recording from a file.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **audiourl** | **string**| URL pointing to the location of the audio file that is to be transcribed. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TranscriptionsListtranscription**
> string TranscriptionsListtranscription(ctx, optional)
List Transcriptions

Retrieve a list of transcription objects for your Ytel account.

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
 **pagesize** | **int32**| The count of objects to return per page. | [default to 10]
 **status** | **string**| The state of the transcription. | 
 **dateTranscribed** | **string**| The date the transcription took place. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TranscriptionsRecordingtranscription**
> string TranscriptionsRecordingtranscription(ctx, recordingSid)
Transcribe Recording

Transcribe a recording by its RecordingSid.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **recordingSid** | **string**| The unique identifier for a recording object. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TranscriptionsViewtranscription**
> string TranscriptionsViewtranscription(ctx, transcriptionsid)
View Transcription

Retrieve information about a transaction by its TranscriptionSid.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **transcriptionsid** | **string**| The unique identifier for a transcription object. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

