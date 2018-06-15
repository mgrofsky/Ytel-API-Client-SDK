# IO.Swagger.Api.TranscriptionApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**TranscriptionsAudiourltranscription**](TranscriptionApi.md#transcriptionsaudiourltranscription) | **POST** /transcriptions/audiourltranscription.json | Transcribe Audio URL
[**TranscriptionsListtranscription**](TranscriptionApi.md#transcriptionslisttranscription) | **POST** /transcriptions/listtranscription.json | List Transcriptions
[**TranscriptionsRecordingtranscription**](TranscriptionApi.md#transcriptionsrecordingtranscription) | **POST** /transcriptions/recordingtranscription.json | Transcribe Recording
[**TranscriptionsViewtranscription**](TranscriptionApi.md#transcriptionsviewtranscription) | **POST** /transcriptions/viewtranscription.json | View Transcription


<a name="transcriptionsaudiourltranscription"></a>
# **TranscriptionsAudiourltranscription**
> string TranscriptionsAudiourltranscription (string audiourl)

Transcribe Audio URL

Transcribe an audio recording from a file.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class TranscriptionsAudiourltranscriptionExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new TranscriptionApi();
            var audiourl = audiourl_example;  // string | URL pointing to the location of the audio file that is to be transcribed.

            try
            {
                // Transcribe Audio URL
                string result = apiInstance.TranscriptionsAudiourltranscription(audiourl);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TranscriptionApi.TranscriptionsAudiourltranscription: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audiourl** | **string**| URL pointing to the location of the audio file that is to be transcribed. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="transcriptionslisttranscription"></a>
# **TranscriptionsListtranscription**
> string TranscriptionsListtranscription (int? page = null, int? pagesize = null, string status = null, string dateTranscribed = null)

List Transcriptions

Retrieve a list of transcription objects for your Ytel account.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class TranscriptionsListtranscriptionExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new TranscriptionApi();
            var page = 56;  // int? | The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional)  (default to 1)
            var pagesize = 56;  // int? | The count of objects to return per page. (optional)  (default to 10)
            var status = status_example;  // string | The state of the transcription. (optional) 
            var dateTranscribed = dateTranscribed_example;  // string | The date the transcription took place. (optional) 

            try
            {
                // List Transcriptions
                string result = apiInstance.TranscriptionsListtranscription(page, pagesize, status, dateTranscribed);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TranscriptionApi.TranscriptionsListtranscription: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int?**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **int?**| The count of objects to return per page. | [optional] [default to 10]
 **status** | **string**| The state of the transcription. | [optional] 
 **dateTranscribed** | **string**| The date the transcription took place. | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="transcriptionsrecordingtranscription"></a>
# **TranscriptionsRecordingtranscription**
> string TranscriptionsRecordingtranscription (string recordingSid)

Transcribe Recording

Transcribe a recording by its RecordingSid.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class TranscriptionsRecordingtranscriptionExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new TranscriptionApi();
            var recordingSid = recordingSid_example;  // string | The unique identifier for a recording object.

            try
            {
                // Transcribe Recording
                string result = apiInstance.TranscriptionsRecordingtranscription(recordingSid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TranscriptionApi.TranscriptionsRecordingtranscription: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordingSid** | **string**| The unique identifier for a recording object. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="transcriptionsviewtranscription"></a>
# **TranscriptionsViewtranscription**
> string TranscriptionsViewtranscription (string transcriptionsid)

View Transcription

Retrieve information about a transaction by its TranscriptionSid.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class TranscriptionsViewtranscriptionExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new TranscriptionApi();
            var transcriptionsid = transcriptionsid_example;  // string | The unique identifier for a transcription object.

            try
            {
                // View Transcription
                string result = apiInstance.TranscriptionsViewtranscription(transcriptionsid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TranscriptionApi.TranscriptionsViewtranscription: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transcriptionsid** | **string**| The unique identifier for a transcription object. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

