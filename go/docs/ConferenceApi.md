# \ConferenceApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ConferencesAddParticipant**](ConferenceApi.md#ConferencesAddParticipant) | **Post** /conferences/addParticipant.json | Add Participant
[**ConferencesCreateConference**](ConferenceApi.md#ConferencesCreateConference) | **Post** /conferences/createConference.json | Create Conference
[**ConferencesDeafMuteParticipant**](ConferenceApi.md#ConferencesDeafMuteParticipant) | **Post** /conferences/deafMuteParticipant.json | Silence Participant
[**ConferencesHangupParticipant**](ConferenceApi.md#ConferencesHangupParticipant) | **Post** /conferences/hangupParticipant.json | Hangup Participant
[**ConferencesListParticipant**](ConferenceApi.md#ConferencesListParticipant) | **Post** /conferences/listParticipant.json | List Participants
[**ConferencesListconference**](ConferenceApi.md#ConferencesListconference) | **Post** /conferences/listconference.json | List Conferences
[**ConferencesPlayAudio**](ConferenceApi.md#ConferencesPlayAudio) | **Post** /conferences/playAudio.json | Play Audio
[**ConferencesViewParticipant**](ConferenceApi.md#ConferencesViewParticipant) | **Post** /conferences/viewParticipant.json | View Participant
[**ConferencesViewconference**](ConferenceApi.md#ConferencesViewconference) | **Post** /conferences/viewconference.json | View Conference


# **ConferencesAddParticipant**
> string ConferencesAddParticipant(ctx, conferenceSid, participantNumber, optional)
Add Participant

Add Participant in conference 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **conferenceSid** | **string**| The unique identifier for a conference object. | 
  **participantNumber** | **string**| The phone number of the participant to be added. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conferenceSid** | **string**| The unique identifier for a conference object. | 
 **participantNumber** | **string**| The phone number of the participant to be added. | 
 **muted** | **bool**| Specifies if participant should be muted. | 
 **deaf** | **bool**| Specifies if the participant should hear audio in the conference. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConferencesCreateConference**
> string ConferencesCreateConference(ctx, from, to, url, optional)
Create Conference

Here you can experiment with initiating a conference call through Ytel and view the request response generated when doing so.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **from** | **string**| A valid 10-digit number (E.164 format) that will be initiating the conference call. | 
  **to** | **string**| A valid 10-digit number (E.164 format) that is to receive the conference call. | 
  **url** | **string**| URL requested once the conference connects | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **string**| A valid 10-digit number (E.164 format) that will be initiating the conference call. | 
 **to** | **string**| A valid 10-digit number (E.164 format) that is to receive the conference call. | 
 **url** | **string**| URL requested once the conference connects | 
 **method** | **string**| Specifies the HTTP method used to request the required URL once call connects. | [default to POST]
 **statusCallBackUrl** | **string**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the conference is finished. | 
 **statusCallBackMethod** | **string**| Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. | 
 **fallbackUrl** | **string**| URL requested if the initial Url parameter fails or encounters an error | 
 **fallbackMethod** | **string**| Specifies the HTTP method used to request the required FallbackUrl once call connects. | 
 **record** | **bool**| Specifies if the conference should be recorded. | 
 **recordCallBackUrl** | **string**| Recording parameters will be sent here upon completion. | 
 **recordCallBackMethod** | **string**| Specifies the HTTP method used to request the required URL once conference connects. | 
 **scheduleTime** | **string**| Schedule conference in future. Schedule time must be greater than current time | 
 **timeout** | **int32**| The number of seconds the call stays on the line while waiting for an answer. The max time limit is 999 and the default limit is 60 seconds but lower times can be set. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConferencesDeafMuteParticipant**
> string ConferencesDeafMuteParticipant(ctx, conferenceSid, participantSid, optional)
Silence Participant

Deaf Mute Participant

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **conferenceSid** | **string**| ID of the active conference | 
  **participantSid** | **string**| ID of an active participant | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conferenceSid** | **string**| ID of the active conference | 
 **participantSid** | **string**| ID of an active participant | 
 **muted** | **bool**| Mute a participant | 
 **deaf** | **bool**| Make it so a participant cant hear | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConferencesHangupParticipant**
> string ConferencesHangupParticipant(ctx, conferenceSid, participantSid)
Hangup Participant

Remove a participant from a conference.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **conferenceSid** | **string**| The unique identifier for a conference object. | 
  **participantSid** | **string**| The unique identifier for a participant object. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConferencesListParticipant**
> string ConferencesListParticipant(ctx, conferenceSid, optional)
List Participants

Retrieve a list of participants for an in-progress conference.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **conferenceSid** | **string**| The unique identifier for a conference. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conferenceSid** | **string**| The unique identifier for a conference. | 
 **page** | **int32**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [default to 1]
 **pagesize** | **int32**| The count of objects to return per page. | [default to 10]
 **muted** | **bool**| Specifies if participant should be muted. | 
 **deaf** | **bool**| Specifies if the participant should hear audio in the conference. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConferencesListconference**
> string ConferencesListconference(ctx, optional)
List Conferences

Retrieve a list of conference objects.

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
 **pagesize** | **int32**| Number of individual resources listed in the response per page | [default to 10]
 **friendlyName** | **string**| Only return conferences with the specified FriendlyName | 
 **dateCreated** | **string**| Conference created date | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConferencesPlayAudio**
> string ConferencesPlayAudio(ctx, conferenceSid, participantSid, audioUrl)
Play Audio

Play an audio file during a conference.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **conferenceSid** | **string**| The unique identifier for a conference object. | 
  **participantSid** | **string**| The unique identifier for a participant object. | 
  **audioUrl** | **string**| The URL for the audio file that is to be played during the conference. Multiple audio files can be chained by using a semicolon. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConferencesViewParticipant**
> string ConferencesViewParticipant(ctx, conferenceSid, participantSid)
View Participant

Retrieve information about a participant by its ParticipantSid.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **conferenceSid** | **string**| The unique identifier for a conference object. | 
  **participantSid** | **string**| The unique identifier for a participant object. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConferencesViewconference**
> string ConferencesViewconference(ctx, conferenceSid)
View Conference

Retrieve information about a conference by its ConferenceSid.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **conferenceSid** | **string**| The unique identifier of each conference resource | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

