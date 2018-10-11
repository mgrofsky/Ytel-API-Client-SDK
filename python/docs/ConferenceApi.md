# swagger_client.ConferenceApi

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
> str conferences_add_participant(conference_sid, participant_number, muted=muted, deaf=deaf)

Add Participant

Add Participant in conference 

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
api_instance = swagger_client.ConferenceApi(swagger_client.ApiClient(configuration))
conference_sid = 'conference_sid_example' # str | The unique identifier for a conference object.
participant_number = 'participant_number_example' # str | The phone number of the participant to be added.
muted = true # bool | Specifies if participant should be muted. (optional)
deaf = true # bool | Specifies if the participant should hear audio in the conference. (optional)

try:
    # Add Participant
    api_response = api_instance.conferences_add_participant(conference_sid, participant_number, muted=muted, deaf=deaf)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConferenceApi->conferences_add_participant: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conference_sid** | **str**| The unique identifier for a conference object. | 
 **participant_number** | **str**| The phone number of the participant to be added. | 
 **muted** | **bool**| Specifies if participant should be muted. | [optional] 
 **deaf** | **bool**| Specifies if the participant should hear audio in the conference. | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **conferences_create_conference**
> str conferences_create_conference(_from, to, url, method=method, status_call_back_url=status_call_back_url, status_call_back_method=status_call_back_method, fallback_url=fallback_url, fallback_method=fallback_method, record=record, record_call_back_url=record_call_back_url, record_call_back_method=record_call_back_method, schedule_time=schedule_time, timeout=timeout)

Create Conference

Here you can experiment with initiating a conference call through Ytel and view the request response generated when doing so.

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
api_instance = swagger_client.ConferenceApi(swagger_client.ApiClient(configuration))
_from = '_from_example' # str | A valid 10-digit number (E.164 format) that will be initiating the conference call.
to = 'to_example' # str | A valid 10-digit number (E.164 format) that is to receive the conference call.
url = 'url_example' # str | URL requested once the conference connects
method = 'POST' # str | Specifies the HTTP method used to request the required URL once call connects. (optional) (default to POST)
status_call_back_url = 'status_call_back_url_example' # str | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the conference is finished. (optional)
status_call_back_method = 'status_call_back_method_example' # str | Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. (optional)
fallback_url = 'fallback_url_example' # str | URL requested if the initial Url parameter fails or encounters an error (optional)
fallback_method = 'fallback_method_example' # str | Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional)
record = true # bool | Specifies if the conference should be recorded. (optional)
record_call_back_url = 'record_call_back_url_example' # str | Recording parameters will be sent here upon completion. (optional)
record_call_back_method = 'record_call_back_method_example' # str | Specifies the HTTP method used to request the required URL once conference connects. (optional)
schedule_time = 'schedule_time_example' # str | Schedule conference in future. Schedule time must be greater than current time (optional)
timeout = 56 # int | The number of seconds the call stays on the line while waiting for an answer. The max time limit is 999 and the default limit is 60 seconds but lower times can be set. (optional)

try:
    # Create Conference
    api_response = api_instance.conferences_create_conference(_from, to, url, method=method, status_call_back_url=status_call_back_url, status_call_back_method=status_call_back_method, fallback_url=fallback_url, fallback_method=fallback_method, record=record, record_call_back_url=record_call_back_url, record_call_back_method=record_call_back_method, schedule_time=schedule_time, timeout=timeout)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConferenceApi->conferences_create_conference: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_from** | **str**| A valid 10-digit number (E.164 format) that will be initiating the conference call. | 
 **to** | **str**| A valid 10-digit number (E.164 format) that is to receive the conference call. | 
 **url** | **str**| URL requested once the conference connects | 
 **method** | **str**| Specifies the HTTP method used to request the required URL once call connects. | [optional] [default to POST]
 **status_call_back_url** | **str**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the conference is finished. | [optional] 
 **status_call_back_method** | **str**| Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. | [optional] 
 **fallback_url** | **str**| URL requested if the initial Url parameter fails or encounters an error | [optional] 
 **fallback_method** | **str**| Specifies the HTTP method used to request the required FallbackUrl once call connects. | [optional] 
 **record** | **bool**| Specifies if the conference should be recorded. | [optional] 
 **record_call_back_url** | **str**| Recording parameters will be sent here upon completion. | [optional] 
 **record_call_back_method** | **str**| Specifies the HTTP method used to request the required URL once conference connects. | [optional] 
 **schedule_time** | **str**| Schedule conference in future. Schedule time must be greater than current time | [optional] 
 **timeout** | **int**| The number of seconds the call stays on the line while waiting for an answer. The max time limit is 999 and the default limit is 60 seconds but lower times can be set. | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **conferences_deaf_mute_participant**
> str conferences_deaf_mute_participant(conference_sid, participant_sid, muted=muted, deaf=deaf)

Silence Participant

Deaf Mute Participant

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
api_instance = swagger_client.ConferenceApi(swagger_client.ApiClient(configuration))
conference_sid = 'conference_sid_example' # str | ID of the active conference
participant_sid = 'participant_sid_example' # str | ID of an active participant
muted = true # bool | Mute a participant (optional)
deaf = true # bool | Make it so a participant cant hear (optional)

try:
    # Silence Participant
    api_response = api_instance.conferences_deaf_mute_participant(conference_sid, participant_sid, muted=muted, deaf=deaf)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConferenceApi->conferences_deaf_mute_participant: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conference_sid** | **str**| ID of the active conference | 
 **participant_sid** | **str**| ID of an active participant | 
 **muted** | **bool**| Mute a participant | [optional] 
 **deaf** | **bool**| Make it so a participant cant hear | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **conferences_hangup_participant**
> str conferences_hangup_participant(conference_sid, participant_sid)

Hangup Participant

Remove a participant from a conference.

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
api_instance = swagger_client.ConferenceApi(swagger_client.ApiClient(configuration))
conference_sid = 'conference_sid_example' # str | The unique identifier for a conference object.
participant_sid = 'participant_sid_example' # str | The unique identifier for a participant object.

try:
    # Hangup Participant
    api_response = api_instance.conferences_hangup_participant(conference_sid, participant_sid)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConferenceApi->conferences_hangup_participant: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conference_sid** | **str**| The unique identifier for a conference object. | 
 **participant_sid** | **str**| The unique identifier for a participant object. | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **conferences_list_participant**
> str conferences_list_participant(conference_sid, page=page, pagesize=pagesize, muted=muted, deaf=deaf)

List Participants

Retrieve a list of participants for an in-progress conference.

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
api_instance = swagger_client.ConferenceApi(swagger_client.ApiClient(configuration))
conference_sid = 'conference_sid_example' # str | The unique identifier for a conference.
page = 1 # int | The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) (default to 1)
pagesize = 10 # int | The count of objects to return per page. (optional) (default to 10)
muted = true # bool | Specifies if participant should be muted. (optional)
deaf = true # bool | Specifies if the participant should hear audio in the conference. (optional)

try:
    # List Participants
    api_response = api_instance.conferences_list_participant(conference_sid, page=page, pagesize=pagesize, muted=muted, deaf=deaf)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConferenceApi->conferences_list_participant: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conference_sid** | **str**| The unique identifier for a conference. | 
 **page** | **int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **int**| The count of objects to return per page. | [optional] [default to 10]
 **muted** | **bool**| Specifies if participant should be muted. | [optional] 
 **deaf** | **bool**| Specifies if the participant should hear audio in the conference. | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **conferences_listconference**
> str conferences_listconference(page=page, pagesize=pagesize, friendly_name=friendly_name, date_created=date_created)

List Conferences

Retrieve a list of conference objects.

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
api_instance = swagger_client.ConferenceApi(swagger_client.ApiClient(configuration))
page = 1 # int | The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) (default to 1)
pagesize = 10 # int | Number of individual resources listed in the response per page (optional) (default to 10)
friendly_name = 'friendly_name_example' # str | Only return conferences with the specified FriendlyName (optional)
date_created = 'date_created_example' # str | Conference created date (optional)

try:
    # List Conferences
    api_response = api_instance.conferences_listconference(page=page, pagesize=pagesize, friendly_name=friendly_name, date_created=date_created)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConferenceApi->conferences_listconference: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **int**| Number of individual resources listed in the response per page | [optional] [default to 10]
 **friendly_name** | **str**| Only return conferences with the specified FriendlyName | [optional] 
 **date_created** | **str**| Conference created date | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **conferences_play_audio**
> str conferences_play_audio(conference_sid, participant_sid, audio_url)

Play Audio

Play an audio file during a conference.

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
api_instance = swagger_client.ConferenceApi(swagger_client.ApiClient(configuration))
conference_sid = 'conference_sid_example' # str | The unique identifier for a conference object.
participant_sid = 'participant_sid_example' # str | The unique identifier for a participant object.
audio_url = 'audio_url_example' # str | The URL for the audio file that is to be played during the conference. Multiple audio files can be chained by using a semicolon.

try:
    # Play Audio
    api_response = api_instance.conferences_play_audio(conference_sid, participant_sid, audio_url)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConferenceApi->conferences_play_audio: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conference_sid** | **str**| The unique identifier for a conference object. | 
 **participant_sid** | **str**| The unique identifier for a participant object. | 
 **audio_url** | **str**| The URL for the audio file that is to be played during the conference. Multiple audio files can be chained by using a semicolon. | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **conferences_view_participant**
> str conferences_view_participant(conference_sid, participant_sid)

View Participant

Retrieve information about a participant by its ParticipantSid.

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
api_instance = swagger_client.ConferenceApi(swagger_client.ApiClient(configuration))
conference_sid = 'conference_sid_example' # str | The unique identifier for a conference object.
participant_sid = 'participant_sid_example' # str | The unique identifier for a participant object.

try:
    # View Participant
    api_response = api_instance.conferences_view_participant(conference_sid, participant_sid)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConferenceApi->conferences_view_participant: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conference_sid** | **str**| The unique identifier for a conference object. | 
 **participant_sid** | **str**| The unique identifier for a participant object. | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **conferences_viewconference**
> str conferences_viewconference(conference_sid)

View Conference

Retrieve information about a conference by its ConferenceSid.

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
api_instance = swagger_client.ConferenceApi(swagger_client.ApiClient(configuration))
conference_sid = 'conference_sid_example' # str | The unique identifier of each conference resource

try:
    # View Conference
    api_response = api_instance.conferences_viewconference(conference_sid)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConferenceApi->conferences_viewconference: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conference_sid** | **str**| The unique identifier of each conference resource | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

