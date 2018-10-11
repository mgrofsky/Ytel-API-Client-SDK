# SwaggerClient::RecordingApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**recording_deleterecording**](RecordingApi.md#recording_deleterecording) | **POST** /recording/deleterecording.json | Delete Recording
[**recording_listrecording**](RecordingApi.md#recording_listrecording) | **POST** /recording/listrecording.json | List Recordings
[**recording_viewrecording**](RecordingApi.md#recording_viewrecording) | **POST** /recording/viewrecording.json | View Recording


# **recording_deleterecording**
> String recording_deleterecording(recordingsid)

Delete Recording

Remove a recording from your Ytel account.

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

api_instance = SwaggerClient::RecordingApi.new

recordingsid = "recordingsid_example" # String | The unique identifier for a recording.


begin
  #Delete Recording
  result = api_instance.recording_deleterecording(recordingsid)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling RecordingApi->recording_deleterecording: #{e}"
end
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



# **recording_listrecording**
> String recording_listrecording(opts)

List Recordings

Retrieve a list of recording objects.

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

api_instance = SwaggerClient::RecordingApi.new

opts = { 
  page: 1, # Integer | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
  pagesize: 10, # Integer | The count of objects to return per page.
  datecreated: "datecreated_example", # String | Filter results by creation date
  callsid: "callsid_example" # String | The unique identifier for a call.
}

begin
  #List Recordings
  result = api_instance.recording_listrecording(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling RecordingApi->recording_listrecording: #{e}"
end
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



# **recording_viewrecording**
> String recording_viewrecording(recordingsid)

View Recording

Retrieve the recording of a call by its RecordingSid. This resource will return information regarding the call such as start time, end time, duration, and so forth.

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

api_instance = SwaggerClient::RecordingApi.new

recordingsid = "recordingsid_example" # String | The unique identifier for the recording.


begin
  #View Recording
  result = api_instance.recording_viewrecording(recordingsid)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling RecordingApi->recording_viewrecording: #{e}"
end
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



