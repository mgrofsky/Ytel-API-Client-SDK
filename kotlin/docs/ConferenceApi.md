# ConferenceApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conferencesAddParticipant**](ConferenceApi.md#conferencesAddParticipant) | **POST** /conferences/addParticipant.json | Add Participant
[**conferencesCreateConference**](ConferenceApi.md#conferencesCreateConference) | **POST** /conferences/createConference.json | Create Conference
[**conferencesDeafMuteParticipant**](ConferenceApi.md#conferencesDeafMuteParticipant) | **POST** /conferences/deafMuteParticipant.json | Silence Participant
[**conferencesHangupParticipant**](ConferenceApi.md#conferencesHangupParticipant) | **POST** /conferences/hangupParticipant.json | Hangup Participant
[**conferencesListParticipant**](ConferenceApi.md#conferencesListParticipant) | **POST** /conferences/listParticipant.json | List Participants
[**conferencesListconference**](ConferenceApi.md#conferencesListconference) | **POST** /conferences/listconference.json | List Conferences
[**conferencesPlayAudio**](ConferenceApi.md#conferencesPlayAudio) | **POST** /conferences/playAudio.json | Play Audio
[**conferencesViewParticipant**](ConferenceApi.md#conferencesViewParticipant) | **POST** /conferences/viewParticipant.json | View Participant
[**conferencesViewconference**](ConferenceApi.md#conferencesViewconference) | **POST** /conferences/viewconference.json | View Conference


<a name="conferencesAddParticipant"></a>
# **conferencesAddParticipant**
> kotlin.String conferencesAddParticipant(conferenceSid, participantNumber, muted, deaf)

Add Participant

Add Participant in conference 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ConferenceApi()
val conferenceSid : kotlin.String = conferenceSid_example // kotlin.String | The unique identifier for a conference object.
val participantNumber : kotlin.String = participantNumber_example // kotlin.String | The phone number of the participant to be added.
val muted : kotlin.Boolean = true // kotlin.Boolean | Specifies if participant should be muted.
val deaf : kotlin.Boolean = true // kotlin.Boolean | Specifies if the participant should hear audio in the conference.
try {
    val result : kotlin.String = apiInstance.conferencesAddParticipant(conferenceSid, participantNumber, muted, deaf)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConferenceApi#conferencesAddParticipant")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConferenceApi#conferencesAddParticipant")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conferenceSid** | **kotlin.String**| The unique identifier for a conference object. |
 **participantNumber** | **kotlin.String**| The phone number of the participant to be added. |
 **muted** | **kotlin.Boolean**| Specifies if participant should be muted. | [optional]
 **deaf** | **kotlin.Boolean**| Specifies if the participant should hear audio in the conference. | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="conferencesCreateConference"></a>
# **conferencesCreateConference**
> kotlin.String conferencesCreateConference(from, to, url, method, statusCallBackUrl, statusCallBackMethod, fallbackUrl, fallbackMethod, record, recordCallBackUrl, recordCallBackMethod, scheduleTime, timeout)

Create Conference

Here you can experiment with initiating a conference call through Ytel and view the request response generated when doing so.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ConferenceApi()
val from : kotlin.String = from_example // kotlin.String | A valid 10-digit number (E.164 format) that will be initiating the conference call.
val to : kotlin.String = to_example // kotlin.String | A valid 10-digit number (E.164 format) that is to receive the conference call.
val url : kotlin.String = url_example // kotlin.String | URL requested once the conference connects
val method : kotlin.String = method_example // kotlin.String | Specifies the HTTP method used to request the required URL once call connects.
val statusCallBackUrl : kotlin.String = statusCallBackUrl_example // kotlin.String | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the conference is finished.
val statusCallBackMethod : kotlin.String = statusCallBackMethod_example // kotlin.String | Specifies the HTTP methodlinkclass used to request StatusCallbackUrl.
val fallbackUrl : kotlin.String = fallbackUrl_example // kotlin.String | URL requested if the initial Url parameter fails or encounters an error
val fallbackMethod : kotlin.String = fallbackMethod_example // kotlin.String | Specifies the HTTP method used to request the required FallbackUrl once call connects.
val record : kotlin.Boolean = true // kotlin.Boolean | Specifies if the conference should be recorded.
val recordCallBackUrl : kotlin.String = recordCallBackUrl_example // kotlin.String | Recording parameters will be sent here upon completion.
val recordCallBackMethod : kotlin.String = recordCallBackMethod_example // kotlin.String | Specifies the HTTP method used to request the required URL once conference connects.
val scheduleTime : kotlin.String = scheduleTime_example // kotlin.String | Schedule conference in future. Schedule time must be greater than current time
val timeout : kotlin.Int = 56 // kotlin.Int | The number of seconds the call stays on the line while waiting for an answer. The max time limit is 999 and the default limit is 60 seconds but lower times can be set.
try {
    val result : kotlin.String = apiInstance.conferencesCreateConference(from, to, url, method, statusCallBackUrl, statusCallBackMethod, fallbackUrl, fallbackMethod, record, recordCallBackUrl, recordCallBackMethod, scheduleTime, timeout)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConferenceApi#conferencesCreateConference")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConferenceApi#conferencesCreateConference")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.String**| A valid 10-digit number (E.164 format) that will be initiating the conference call. |
 **to** | **kotlin.String**| A valid 10-digit number (E.164 format) that is to receive the conference call. |
 **url** | **kotlin.String**| URL requested once the conference connects |
 **method** | **kotlin.String**| Specifies the HTTP method used to request the required URL once call connects. | [optional] [default to POST]
 **statusCallBackUrl** | **kotlin.String**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the conference is finished. | [optional]
 **statusCallBackMethod** | **kotlin.String**| Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. | [optional]
 **fallbackUrl** | **kotlin.String**| URL requested if the initial Url parameter fails or encounters an error | [optional]
 **fallbackMethod** | **kotlin.String**| Specifies the HTTP method used to request the required FallbackUrl once call connects. | [optional]
 **record** | **kotlin.Boolean**| Specifies if the conference should be recorded. | [optional]
 **recordCallBackUrl** | **kotlin.String**| Recording parameters will be sent here upon completion. | [optional]
 **recordCallBackMethod** | **kotlin.String**| Specifies the HTTP method used to request the required URL once conference connects. | [optional]
 **scheduleTime** | **kotlin.String**| Schedule conference in future. Schedule time must be greater than current time | [optional]
 **timeout** | **kotlin.Int**| The number of seconds the call stays on the line while waiting for an answer. The max time limit is 999 and the default limit is 60 seconds but lower times can be set. | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="conferencesDeafMuteParticipant"></a>
# **conferencesDeafMuteParticipant**
> kotlin.String conferencesDeafMuteParticipant(conferenceSid, participantSid, muted, deaf)

Silence Participant

Deaf Mute Participant

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ConferenceApi()
val conferenceSid : kotlin.String = conferenceSid_example // kotlin.String | ID of the active conference
val participantSid : kotlin.String = participantSid_example // kotlin.String | ID of an active participant
val muted : kotlin.Boolean = true // kotlin.Boolean | Mute a participant
val deaf : kotlin.Boolean = true // kotlin.Boolean | Make it so a participant cant hear
try {
    val result : kotlin.String = apiInstance.conferencesDeafMuteParticipant(conferenceSid, participantSid, muted, deaf)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConferenceApi#conferencesDeafMuteParticipant")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConferenceApi#conferencesDeafMuteParticipant")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conferenceSid** | **kotlin.String**| ID of the active conference |
 **participantSid** | **kotlin.String**| ID of an active participant |
 **muted** | **kotlin.Boolean**| Mute a participant | [optional]
 **deaf** | **kotlin.Boolean**| Make it so a participant cant hear | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="conferencesHangupParticipant"></a>
# **conferencesHangupParticipant**
> kotlin.String conferencesHangupParticipant(conferenceSid, participantSid)

Hangup Participant

Remove a participant from a conference.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ConferenceApi()
val conferenceSid : kotlin.String = conferenceSid_example // kotlin.String | The unique identifier for a conference object.
val participantSid : kotlin.String = participantSid_example // kotlin.String | The unique identifier for a participant object.
try {
    val result : kotlin.String = apiInstance.conferencesHangupParticipant(conferenceSid, participantSid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConferenceApi#conferencesHangupParticipant")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConferenceApi#conferencesHangupParticipant")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conferenceSid** | **kotlin.String**| The unique identifier for a conference object. |
 **participantSid** | **kotlin.String**| The unique identifier for a participant object. |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="conferencesListParticipant"></a>
# **conferencesListParticipant**
> kotlin.String conferencesListParticipant(conferenceSid, page, pagesize, muted, deaf)

List Participants

Retrieve a list of participants for an in-progress conference.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ConferenceApi()
val conferenceSid : kotlin.String = conferenceSid_example // kotlin.String | The unique identifier for a conference.
val page : kotlin.Int = 56 // kotlin.Int | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
val pagesize : kotlin.Int = 56 // kotlin.Int | The count of objects to return per page.
val muted : kotlin.Boolean = true // kotlin.Boolean | Specifies if participant should be muted.
val deaf : kotlin.Boolean = true // kotlin.Boolean | Specifies if the participant should hear audio in the conference.
try {
    val result : kotlin.String = apiInstance.conferencesListParticipant(conferenceSid, page, pagesize, muted, deaf)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConferenceApi#conferencesListParticipant")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConferenceApi#conferencesListParticipant")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conferenceSid** | **kotlin.String**| The unique identifier for a conference. |
 **page** | **kotlin.Int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **kotlin.Int**| The count of objects to return per page. | [optional] [default to 10]
 **muted** | **kotlin.Boolean**| Specifies if participant should be muted. | [optional]
 **deaf** | **kotlin.Boolean**| Specifies if the participant should hear audio in the conference. | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="conferencesListconference"></a>
# **conferencesListconference**
> kotlin.String conferencesListconference(page, pagesize, friendlyName, dateCreated)

List Conferences

Retrieve a list of conference objects.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ConferenceApi()
val page : kotlin.Int = 56 // kotlin.Int | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
val pagesize : kotlin.Int = 56 // kotlin.Int | Number of individual resources listed in the response per page
val friendlyName : kotlin.String = friendlyName_example // kotlin.String | Only return conferences with the specified FriendlyName
val dateCreated : kotlin.String = dateCreated_example // kotlin.String | Conference created date
try {
    val result : kotlin.String = apiInstance.conferencesListconference(page, pagesize, friendlyName, dateCreated)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConferenceApi#conferencesListconference")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConferenceApi#conferencesListconference")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **kotlin.Int**| Number of individual resources listed in the response per page | [optional] [default to 10]
 **friendlyName** | **kotlin.String**| Only return conferences with the specified FriendlyName | [optional]
 **dateCreated** | **kotlin.String**| Conference created date | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="conferencesPlayAudio"></a>
# **conferencesPlayAudio**
> kotlin.String conferencesPlayAudio(conferenceSid, participantSid, audioUrl)

Play Audio

Play an audio file during a conference.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ConferenceApi()
val conferenceSid : kotlin.String = conferenceSid_example // kotlin.String | The unique identifier for a conference object.
val participantSid : kotlin.String = participantSid_example // kotlin.String | The unique identifier for a participant object.
val audioUrl : kotlin.String = audioUrl_example // kotlin.String | The URL for the audio file that is to be played during the conference. Multiple audio files can be chained by using a semicolon.
try {
    val result : kotlin.String = apiInstance.conferencesPlayAudio(conferenceSid, participantSid, audioUrl)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConferenceApi#conferencesPlayAudio")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConferenceApi#conferencesPlayAudio")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conferenceSid** | **kotlin.String**| The unique identifier for a conference object. |
 **participantSid** | **kotlin.String**| The unique identifier for a participant object. |
 **audioUrl** | **kotlin.String**| The URL for the audio file that is to be played during the conference. Multiple audio files can be chained by using a semicolon. | [enum: mp3, wav]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="conferencesViewParticipant"></a>
# **conferencesViewParticipant**
> kotlin.String conferencesViewParticipant(conferenceSid, participantSid)

View Participant

Retrieve information about a participant by its ParticipantSid.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ConferenceApi()
val conferenceSid : kotlin.String = conferenceSid_example // kotlin.String | The unique identifier for a conference object.
val participantSid : kotlin.String = participantSid_example // kotlin.String | The unique identifier for a participant object.
try {
    val result : kotlin.String = apiInstance.conferencesViewParticipant(conferenceSid, participantSid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConferenceApi#conferencesViewParticipant")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConferenceApi#conferencesViewParticipant")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conferenceSid** | **kotlin.String**| The unique identifier for a conference object. |
 **participantSid** | **kotlin.String**| The unique identifier for a participant object. |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="conferencesViewconference"></a>
# **conferencesViewconference**
> kotlin.String conferencesViewconference(conferenceSid)

View Conference

Retrieve information about a conference by its ConferenceSid.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ConferenceApi()
val conferenceSid : kotlin.String = conferenceSid_example // kotlin.String | The unique identifier of each conference resource
try {
    val result : kotlin.String = apiInstance.conferencesViewconference(conferenceSid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConferenceApi#conferencesViewconference")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConferenceApi#conferencesViewconference")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conferenceSid** | **kotlin.String**| The unique identifier of each conference resource |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

