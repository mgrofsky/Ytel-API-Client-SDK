# SwaggerClient::TranscriptionApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transcriptions_audiourltranscription**](TranscriptionApi.md#transcriptions_audiourltranscription) | **POST** /transcriptions/audiourltranscription.json | Transcribe Audio URL
[**transcriptions_listtranscription**](TranscriptionApi.md#transcriptions_listtranscription) | **POST** /transcriptions/listtranscription.json | List Transcriptions
[**transcriptions_recordingtranscription**](TranscriptionApi.md#transcriptions_recordingtranscription) | **POST** /transcriptions/recordingtranscription.json | Transcribe Recording
[**transcriptions_viewtranscription**](TranscriptionApi.md#transcriptions_viewtranscription) | **POST** /transcriptions/viewtranscription.json | View Transcription


# **transcriptions_audiourltranscription**
> String transcriptions_audiourltranscription(audiourl)

Transcribe Audio URL

Transcribe an audio recording from a file.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: auth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::TranscriptionApi.new

audiourl = "audiourl_example" # String | URL pointing to the location of the audio file that is to be transcribed.


begin
  #Transcribe Audio URL
  result = api_instance.transcriptions_audiourltranscription(audiourl)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling TranscriptionApi->transcriptions_audiourltranscription: #{e}"
end
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



# **transcriptions_listtranscription**
> String transcriptions_listtranscription(opts)

List Transcriptions

Retrieve a list of transcription objects for your Ytel account.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: auth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::TranscriptionApi.new

opts = { 
  page: 1, # Integer | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
  pagesize: 10, # Integer | The count of objects to return per page.
  status: "status_example", # String | The state of the transcription.
  date_transcribed: "date_transcribed_example" # String | The date the transcription took place.
}

begin
  #List Transcriptions
  result = api_instance.transcriptions_listtranscription(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling TranscriptionApi->transcriptions_listtranscription: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **Integer**| The count of objects to return per page. | [optional] [default to 10]
 **status** | **String**| The state of the transcription. | [optional] 
 **date_transcribed** | **String**| The date the transcription took place. | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **transcriptions_recordingtranscription**
> String transcriptions_recordingtranscription(recording_sid)

Transcribe Recording

Transcribe a recording by its RecordingSid.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: auth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::TranscriptionApi.new

recording_sid = "recording_sid_example" # String | The unique identifier for a recording object.


begin
  #Transcribe Recording
  result = api_instance.transcriptions_recordingtranscription(recording_sid)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling TranscriptionApi->transcriptions_recordingtranscription: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recording_sid** | **String**| The unique identifier for a recording object. | 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **transcriptions_viewtranscription**
> String transcriptions_viewtranscription(transcriptionsid)

View Transcription

Retrieve information about a transaction by its TranscriptionSid.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: auth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::TranscriptionApi.new

transcriptionsid = "transcriptionsid_example" # String | The unique identifier for a transcription object.


begin
  #View Transcription
  result = api_instance.transcriptions_viewtranscription(transcriptionsid)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling TranscriptionApi->transcriptions_viewtranscription: #{e}"
end
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



