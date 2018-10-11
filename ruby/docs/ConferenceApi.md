# SwaggerClient::ConferenceApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conferences_add_participant**](ConferenceApi.md#conferences_add_participant) | **POST** /conferences/addParticipant.json | Add Participant
[**conferences_create_conference**](ConferenceApi.md#conferences_create_conference) | **POST** /conferences/createConference.json | Create Conference
[**conferences_deaf_mute_participant**](ConferenceApi.md#conferences_deaf_mute_participant) | **POST** /conferences/deafMuteParticipant.json | Silence Participant
[**conferences_hangup_participant**](ConferenceApi.md#conferences_hangup_participant) | **POST** /conferences/hangupParticipant.json | Hangup Participant
[**conferences_list_participant**](ConferenceApi.md#conferences_list_participant) | **POST** /conferences/listParticipant.json | List Participants
[**conferences_listconference**](ConferenceApi.md#conferences_listconference) | **POST** /conferences/listconference.json | List Conferences
[**conferences_play_audio**](ConferenceApi.md#conferences_play_audio) | **POST** /conferences/playAudio.json | Play Audio
[**conferences_view_participant**](ConferenceApi.md#conferences_view_participant) | **POST** /conferences/viewParticipant.json | View Participant
[**conferences_viewconference**](ConferenceApi.md#conferences_viewconference) | **POST** /conferences/viewconference.json | View Conference


# **conferences_add_participant**
> String conferences_add_participant(conference_sid, participant_number, opts)

Add Participant

Add Participant in conference 

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

api_instance = SwaggerClient::ConferenceApi.new

conference_sid = "conference_sid_example" # String | The unique identifier for a conference object.

participant_number = "participant_number_example" # String | The phone number of the participant to be added.

opts = { 
  muted: true, # BOOLEAN | Specifies if participant should be muted.
  deaf: true # BOOLEAN | Specifies if the participant should hear audio in the conference.
}

begin
  #Add Participant
  result = api_instance.conferences_add_participant(conference_sid, participant_number, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ConferenceApi->conferences_add_participant: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conference_sid** | **String**| The unique identifier for a conference object. | 
 **participant_number** | **String**| The phone number of the participant to be added. | 
 **muted** | **BOOLEAN**| Specifies if participant should be muted. | [optional] 
 **deaf** | **BOOLEAN**| Specifies if the participant should hear audio in the conference. | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **conferences_create_conference**
> String conferences_create_conference(from, to, url, opts)

Create Conference

Here you can experiment with initiating a conference call through Ytel and view the request response generated when doing so.

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

api_instance = SwaggerClient::ConferenceApi.new

from = "from_example" # String | A valid 10-digit number (E.164 format) that will be initiating the conference call.

to = "to_example" # String | A valid 10-digit number (E.164 format) that is to receive the conference call.

url = "url_example" # String | URL requested once the conference connects

opts = { 
  method: "POST", # String | Specifies the HTTP method used to request the required URL once call connects.
  status_call_back_url: "status_call_back_url_example", # String | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the conference is finished.
  status_call_back_method: "status_call_back_method_example", # String | Specifies the HTTP methodlinkclass used to request StatusCallbackUrl.
  fallback_url: "fallback_url_example", # String | URL requested if the initial Url parameter fails or encounters an error
  fallback_method: "fallback_method_example", # String | Specifies the HTTP method used to request the required FallbackUrl once call connects.
  record: true, # BOOLEAN | Specifies if the conference should be recorded.
  record_call_back_url: "record_call_back_url_example", # String | Recording parameters will be sent here upon completion.
  record_call_back_method: "record_call_back_method_example", # String | Specifies the HTTP method used to request the required URL once conference connects.
  schedule_time: "schedule_time_example", # String | Schedule conference in future. Schedule time must be greater than current time
  timeout: 56 # Integer | The number of seconds the call stays on the line while waiting for an answer. The max time limit is 999 and the default limit is 60 seconds but lower times can be set.
}

begin
  #Create Conference
  result = api_instance.conferences_create_conference(from, to, url, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ConferenceApi->conferences_create_conference: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **String**| A valid 10-digit number (E.164 format) that will be initiating the conference call. | 
 **to** | **String**| A valid 10-digit number (E.164 format) that is to receive the conference call. | 
 **url** | **String**| URL requested once the conference connects | 
 **method** | **String**| Specifies the HTTP method used to request the required URL once call connects. | [optional] [default to POST]
 **status_call_back_url** | **String**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the conference is finished. | [optional] 
 **status_call_back_method** | **String**| Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. | [optional] 
 **fallback_url** | **String**| URL requested if the initial Url parameter fails or encounters an error | [optional] 
 **fallback_method** | **String**| Specifies the HTTP method used to request the required FallbackUrl once call connects. | [optional] 
 **record** | **BOOLEAN**| Specifies if the conference should be recorded. | [optional] 
 **record_call_back_url** | **String**| Recording parameters will be sent here upon completion. | [optional] 
 **record_call_back_method** | **String**| Specifies the HTTP method used to request the required URL once conference connects. | [optional] 
 **schedule_time** | **String**| Schedule conference in future. Schedule time must be greater than current time | [optional] 
 **timeout** | **Integer**| The number of seconds the call stays on the line while waiting for an answer. The max time limit is 999 and the default limit is 60 seconds but lower times can be set. | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **conferences_deaf_mute_participant**
> String conferences_deaf_mute_participant(conference_sid, participant_sid, opts)

Silence Participant

Deaf Mute Participant

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

api_instance = SwaggerClient::ConferenceApi.new

conference_sid = "conference_sid_example" # String | ID of the active conference

participant_sid = "participant_sid_example" # String | ID of an active participant

opts = { 
  muted: true, # BOOLEAN | Mute a participant
  deaf: true # BOOLEAN | Make it so a participant cant hear
}

begin
  #Silence Participant
  result = api_instance.conferences_deaf_mute_participant(conference_sid, participant_sid, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ConferenceApi->conferences_deaf_mute_participant: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conference_sid** | **String**| ID of the active conference | 
 **participant_sid** | **String**| ID of an active participant | 
 **muted** | **BOOLEAN**| Mute a participant | [optional] 
 **deaf** | **BOOLEAN**| Make it so a participant cant hear | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **conferences_hangup_participant**
> String conferences_hangup_participant(conference_sid, participant_sid)

Hangup Participant

Remove a participant from a conference.

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

api_instance = SwaggerClient::ConferenceApi.new

conference_sid = "conference_sid_example" # String | The unique identifier for a conference object.

participant_sid = "participant_sid_example" # String | The unique identifier for a participant object.


begin
  #Hangup Participant
  result = api_instance.conferences_hangup_participant(conference_sid, participant_sid)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ConferenceApi->conferences_hangup_participant: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conference_sid** | **String**| The unique identifier for a conference object. | 
 **participant_sid** | **String**| The unique identifier for a participant object. | 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **conferences_list_participant**
> String conferences_list_participant(conference_sid, opts)

List Participants

Retrieve a list of participants for an in-progress conference.

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

api_instance = SwaggerClient::ConferenceApi.new

conference_sid = "conference_sid_example" # String | The unique identifier for a conference.

opts = { 
  page: 1, # Integer | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
  pagesize: 10, # Integer | The count of objects to return per page.
  muted: true, # BOOLEAN | Specifies if participant should be muted.
  deaf: true # BOOLEAN | Specifies if the participant should hear audio in the conference.
}

begin
  #List Participants
  result = api_instance.conferences_list_participant(conference_sid, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ConferenceApi->conferences_list_participant: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conference_sid** | **String**| The unique identifier for a conference. | 
 **page** | **Integer**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **Integer**| The count of objects to return per page. | [optional] [default to 10]
 **muted** | **BOOLEAN**| Specifies if participant should be muted. | [optional] 
 **deaf** | **BOOLEAN**| Specifies if the participant should hear audio in the conference. | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **conferences_listconference**
> String conferences_listconference(opts)

List Conferences

Retrieve a list of conference objects.

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

api_instance = SwaggerClient::ConferenceApi.new

opts = { 
  page: 1, # Integer | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
  pagesize: 10, # Integer | Number of individual resources listed in the response per page
  friendly_name: "friendly_name_example", # String | Only return conferences with the specified FriendlyName
  date_created: "date_created_example" # String | Conference created date
}

begin
  #List Conferences
  result = api_instance.conferences_listconference(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ConferenceApi->conferences_listconference: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **Integer**| Number of individual resources listed in the response per page | [optional] [default to 10]
 **friendly_name** | **String**| Only return conferences with the specified FriendlyName | [optional] 
 **date_created** | **String**| Conference created date | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **conferences_play_audio**
> String conferences_play_audio(conference_sid, participant_sid, audio_url)

Play Audio

Play an audio file during a conference.

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

api_instance = SwaggerClient::ConferenceApi.new

conference_sid = "conference_sid_example" # String | The unique identifier for a conference object.

participant_sid = "participant_sid_example" # String | The unique identifier for a participant object.

audio_url = "audio_url_example" # String | The URL for the audio file that is to be played during the conference. Multiple audio files can be chained by using a semicolon.


begin
  #Play Audio
  result = api_instance.conferences_play_audio(conference_sid, participant_sid, audio_url)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ConferenceApi->conferences_play_audio: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conference_sid** | **String**| The unique identifier for a conference object. | 
 **participant_sid** | **String**| The unique identifier for a participant object. | 
 **audio_url** | **String**| The URL for the audio file that is to be played during the conference. Multiple audio files can be chained by using a semicolon. | 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **conferences_view_participant**
> String conferences_view_participant(conference_sid, participant_sid)

View Participant

Retrieve information about a participant by its ParticipantSid.

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

api_instance = SwaggerClient::ConferenceApi.new

conference_sid = "conference_sid_example" # String | The unique identifier for a conference object.

participant_sid = "participant_sid_example" # String | The unique identifier for a participant object.


begin
  #View Participant
  result = api_instance.conferences_view_participant(conference_sid, participant_sid)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ConferenceApi->conferences_view_participant: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conference_sid** | **String**| The unique identifier for a conference object. | 
 **participant_sid** | **String**| The unique identifier for a participant object. | 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **conferences_viewconference**
> String conferences_viewconference(conference_sid)

View Conference

Retrieve information about a conference by its ConferenceSid.

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

api_instance = SwaggerClient::ConferenceApi.new

conference_sid = "conference_sid_example" # String | The unique identifier of each conference resource


begin
  #View Conference
  result = api_instance.conferences_viewconference(conference_sid)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ConferenceApi->conferences_viewconference: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conference_sid** | **String**| The unique identifier of each conference resource | 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



