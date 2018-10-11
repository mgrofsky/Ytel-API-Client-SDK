# swagger_client.TranscriptionApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transcriptions_audiourltranscription**](TranscriptionApi.md#transcriptions_audiourltranscription) | **POST** /transcriptions/audiourltranscription.json | Transcribe Audio URL
[**transcriptions_listtranscription**](TranscriptionApi.md#transcriptions_listtranscription) | **POST** /transcriptions/listtranscription.json | List Transcriptions
[**transcriptions_recordingtranscription**](TranscriptionApi.md#transcriptions_recordingtranscription) | **POST** /transcriptions/recordingtranscription.json | Transcribe Recording
[**transcriptions_viewtranscription**](TranscriptionApi.md#transcriptions_viewtranscription) | **POST** /transcriptions/viewtranscription.json | View Transcription


# **transcriptions_audiourltranscription**
> str transcriptions_audiourltranscription(audiourl)

Transcribe Audio URL

Transcribe an audio recording from a file.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: auth
configuration = swagger_client.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swagger_client.TranscriptionApi(swagger_client.ApiClient(configuration))
audiourl = 'audiourl_example' # str | URL pointing to the location of the audio file that is to be transcribed.

try:
    # Transcribe Audio URL
    api_response = api_instance.transcriptions_audiourltranscription(audiourl)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TranscriptionApi->transcriptions_audiourltranscription: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audiourl** | **str**| URL pointing to the location of the audio file that is to be transcribed. | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **transcriptions_listtranscription**
> str transcriptions_listtranscription(page=page, pagesize=pagesize, status=status, date_transcribed=date_transcribed)

List Transcriptions

Retrieve a list of transcription objects for your Ytel account.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: auth
configuration = swagger_client.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swagger_client.TranscriptionApi(swagger_client.ApiClient(configuration))
page = 1 # int | The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) (default to 1)
pagesize = 10 # int | The count of objects to return per page. (optional) (default to 10)
status = 'status_example' # str | The state of the transcription. (optional)
date_transcribed = 'date_transcribed_example' # str | The date the transcription took place. (optional)

try:
    # List Transcriptions
    api_response = api_instance.transcriptions_listtranscription(page=page, pagesize=pagesize, status=status, date_transcribed=date_transcribed)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TranscriptionApi->transcriptions_listtranscription: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **int**| The count of objects to return per page. | [optional] [default to 10]
 **status** | **str**| The state of the transcription. | [optional] 
 **date_transcribed** | **str**| The date the transcription took place. | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **transcriptions_recordingtranscription**
> str transcriptions_recordingtranscription(recording_sid)

Transcribe Recording

Transcribe a recording by its RecordingSid.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: auth
configuration = swagger_client.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swagger_client.TranscriptionApi(swagger_client.ApiClient(configuration))
recording_sid = 'recording_sid_example' # str | The unique identifier for a recording object.

try:
    # Transcribe Recording
    api_response = api_instance.transcriptions_recordingtranscription(recording_sid)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TranscriptionApi->transcriptions_recordingtranscription: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recording_sid** | **str**| The unique identifier for a recording object. | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **transcriptions_viewtranscription**
> str transcriptions_viewtranscription(transcriptionsid)

View Transcription

Retrieve information about a transaction by its TranscriptionSid.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: auth
configuration = swagger_client.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swagger_client.TranscriptionApi(swagger_client.ApiClient(configuration))
transcriptionsid = 'transcriptionsid_example' # str | The unique identifier for a transcription object.

try:
    # View Transcription
    api_response = api_instance.transcriptions_viewtranscription(transcriptionsid)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TranscriptionApi->transcriptions_viewtranscription: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transcriptionsid** | **str**| The unique identifier for a transcription object. | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

