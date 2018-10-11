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
> String conferencesAddParticipant(conferenceSid, participantNumber, muted, deaf)

Add Participant

Add Participant in conference 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConferenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

ConferenceApi apiInstance = new ConferenceApi();
String conferenceSid = "conferenceSid_example"; // String | The unique identifier for a conference object.
String participantNumber = "participantNumber_example"; // String | The phone number of the participant to be added.
Boolean muted = true; // Boolean | Specifies if participant should be muted.
Boolean deaf = true; // Boolean | Specifies if the participant should hear audio in the conference.
try {
    String result = apiInstance.conferencesAddParticipant(conferenceSid, participantNumber, muted, deaf);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConferenceApi#conferencesAddParticipant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conferenceSid** | **String**| The unique identifier for a conference object. |
 **participantNumber** | **String**| The phone number of the participant to be added. |
 **muted** | **Boolean**| Specifies if participant should be muted. | [optional]
 **deaf** | **Boolean**| Specifies if the participant should hear audio in the conference. | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="conferencesCreateConference"></a>
# **conferencesCreateConference**
> String conferencesCreateConference(from, to, url, method, statusCallBackUrl, statusCallBackMethod, fallbackUrl, fallbackMethod, record, recordCallBackUrl, recordCallBackMethod, scheduleTime, timeout)

Create Conference

Here you can experiment with initiating a conference call through Ytel and view the request response generated when doing so.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConferenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

ConferenceApi apiInstance = new ConferenceApi();
String from = "from_example"; // String | A valid 10-digit number (E.164 format) that will be initiating the conference call.
String to = "to_example"; // String | A valid 10-digit number (E.164 format) that is to receive the conference call.
String url = "url_example"; // String | URL requested once the conference connects
String method = "POST"; // String | Specifies the HTTP method used to request the required URL once call connects.
String statusCallBackUrl = "statusCallBackUrl_example"; // String | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the conference is finished.
String statusCallBackMethod = "statusCallBackMethod_example"; // String | Specifies the HTTP methodlinkclass used to request StatusCallbackUrl.
String fallbackUrl = "fallbackUrl_example"; // String | URL requested if the initial Url parameter fails or encounters an error
String fallbackMethod = "fallbackMethod_example"; // String | Specifies the HTTP method used to request the required FallbackUrl once call connects.
Boolean record = true; // Boolean | Specifies if the conference should be recorded.
String recordCallBackUrl = "recordCallBackUrl_example"; // String | Recording parameters will be sent here upon completion.
String recordCallBackMethod = "recordCallBackMethod_example"; // String | Specifies the HTTP method used to request the required URL once conference connects.
String scheduleTime = "scheduleTime_example"; // String | Schedule conference in future. Schedule time must be greater than current time
Integer timeout = 56; // Integer | The number of seconds the call stays on the line while waiting for an answer. The max time limit is 999 and the default limit is 60 seconds but lower times can be set.
try {
    String result = apiInstance.conferencesCreateConference(from, to, url, method, statusCallBackUrl, statusCallBackMethod, fallbackUrl, fallbackMethod, record, recordCallBackUrl, recordCallBackMethod, scheduleTime, timeout);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConferenceApi#conferencesCreateConference");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **String**| A valid 10-digit number (E.164 format) that will be initiating the conference call. |
 **to** | **String**| A valid 10-digit number (E.164 format) that is to receive the conference call. |
 **url** | **String**| URL requested once the conference connects |
 **method** | **String**| Specifies the HTTP method used to request the required URL once call connects. | [optional] [default to POST]
 **statusCallBackUrl** | **String**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the conference is finished. | [optional]
 **statusCallBackMethod** | **String**| Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. | [optional]
 **fallbackUrl** | **String**| URL requested if the initial Url parameter fails or encounters an error | [optional]
 **fallbackMethod** | **String**| Specifies the HTTP method used to request the required FallbackUrl once call connects. | [optional]
 **record** | **Boolean**| Specifies if the conference should be recorded. | [optional]
 **recordCallBackUrl** | **String**| Recording parameters will be sent here upon completion. | [optional]
 **recordCallBackMethod** | **String**| Specifies the HTTP method used to request the required URL once conference connects. | [optional]
 **scheduleTime** | **String**| Schedule conference in future. Schedule time must be greater than current time | [optional]
 **timeout** | **Integer**| The number of seconds the call stays on the line while waiting for an answer. The max time limit is 999 and the default limit is 60 seconds but lower times can be set. | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="conferencesDeafMuteParticipant"></a>
# **conferencesDeafMuteParticipant**
> String conferencesDeafMuteParticipant(conferenceSid, participantSid, muted, deaf)

Silence Participant

Deaf Mute Participant

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConferenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

ConferenceApi apiInstance = new ConferenceApi();
String conferenceSid = "conferenceSid_example"; // String | ID of the active conference
String participantSid = "participantSid_example"; // String | ID of an active participant
Boolean muted = true; // Boolean | Mute a participant
Boolean deaf = true; // Boolean | Make it so a participant cant hear
try {
    String result = apiInstance.conferencesDeafMuteParticipant(conferenceSid, participantSid, muted, deaf);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConferenceApi#conferencesDeafMuteParticipant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conferenceSid** | **String**| ID of the active conference |
 **participantSid** | **String**| ID of an active participant |
 **muted** | **Boolean**| Mute a participant | [optional]
 **deaf** | **Boolean**| Make it so a participant cant hear | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="conferencesHangupParticipant"></a>
# **conferencesHangupParticipant**
> String conferencesHangupParticipant(conferenceSid, participantSid)

Hangup Participant

Remove a participant from a conference.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConferenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

ConferenceApi apiInstance = new ConferenceApi();
String conferenceSid = "conferenceSid_example"; // String | The unique identifier for a conference object.
String participantSid = "participantSid_example"; // String | The unique identifier for a participant object.
try {
    String result = apiInstance.conferencesHangupParticipant(conferenceSid, participantSid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConferenceApi#conferencesHangupParticipant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conferenceSid** | **String**| The unique identifier for a conference object. |
 **participantSid** | **String**| The unique identifier for a participant object. |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="conferencesListParticipant"></a>
# **conferencesListParticipant**
> String conferencesListParticipant(conferenceSid, page, pagesize, muted, deaf)

List Participants

Retrieve a list of participants for an in-progress conference.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConferenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

ConferenceApi apiInstance = new ConferenceApi();
String conferenceSid = "conferenceSid_example"; // String | The unique identifier for a conference.
Integer page = 1; // Integer | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
Integer pagesize = 10; // Integer | The count of objects to return per page.
Boolean muted = true; // Boolean | Specifies if participant should be muted.
Boolean deaf = true; // Boolean | Specifies if the participant should hear audio in the conference.
try {
    String result = apiInstance.conferencesListParticipant(conferenceSid, page, pagesize, muted, deaf);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConferenceApi#conferencesListParticipant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conferenceSid** | **String**| The unique identifier for a conference. |
 **page** | **Integer**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **Integer**| The count of objects to return per page. | [optional] [default to 10]
 **muted** | **Boolean**| Specifies if participant should be muted. | [optional]
 **deaf** | **Boolean**| Specifies if the participant should hear audio in the conference. | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="conferencesListconference"></a>
# **conferencesListconference**
> String conferencesListconference(page, pagesize, friendlyName, dateCreated)

List Conferences

Retrieve a list of conference objects.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConferenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

ConferenceApi apiInstance = new ConferenceApi();
Integer page = 1; // Integer | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
Integer pagesize = 10; // Integer | Number of individual resources listed in the response per page
String friendlyName = "friendlyName_example"; // String | Only return conferences with the specified FriendlyName
String dateCreated = "dateCreated_example"; // String | Conference created date
try {
    String result = apiInstance.conferencesListconference(page, pagesize, friendlyName, dateCreated);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConferenceApi#conferencesListconference");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **Integer**| Number of individual resources listed in the response per page | [optional] [default to 10]
 **friendlyName** | **String**| Only return conferences with the specified FriendlyName | [optional]
 **dateCreated** | **String**| Conference created date | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="conferencesPlayAudio"></a>
# **conferencesPlayAudio**
> String conferencesPlayAudio(conferenceSid, participantSid, audioUrl)

Play Audio

Play an audio file during a conference.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConferenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

ConferenceApi apiInstance = new ConferenceApi();
String conferenceSid = "conferenceSid_example"; // String | The unique identifier for a conference object.
String participantSid = "participantSid_example"; // String | The unique identifier for a participant object.
String audioUrl = "audioUrl_example"; // String | The URL for the audio file that is to be played during the conference. Multiple audio files can be chained by using a semicolon.
try {
    String result = apiInstance.conferencesPlayAudio(conferenceSid, participantSid, audioUrl);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConferenceApi#conferencesPlayAudio");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conferenceSid** | **String**| The unique identifier for a conference object. |
 **participantSid** | **String**| The unique identifier for a participant object. |
 **audioUrl** | **String**| The URL for the audio file that is to be played during the conference. Multiple audio files can be chained by using a semicolon. | [enum: mp3, wav]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="conferencesViewParticipant"></a>
# **conferencesViewParticipant**
> String conferencesViewParticipant(conferenceSid, participantSid)

View Participant

Retrieve information about a participant by its ParticipantSid.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConferenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

ConferenceApi apiInstance = new ConferenceApi();
String conferenceSid = "conferenceSid_example"; // String | The unique identifier for a conference object.
String participantSid = "participantSid_example"; // String | The unique identifier for a participant object.
try {
    String result = apiInstance.conferencesViewParticipant(conferenceSid, participantSid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConferenceApi#conferencesViewParticipant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conferenceSid** | **String**| The unique identifier for a conference object. |
 **participantSid** | **String**| The unique identifier for a participant object. |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="conferencesViewconference"></a>
# **conferencesViewconference**
> String conferencesViewconference(conferenceSid)

View Conference

Retrieve information about a conference by its ConferenceSid.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConferenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

ConferenceApi apiInstance = new ConferenceApi();
String conferenceSid = "conferenceSid_example"; // String | The unique identifier of each conference resource
try {
    String result = apiInstance.conferencesViewconference(conferenceSid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConferenceApi#conferencesViewconference");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conferenceSid** | **String**| The unique identifier of each conference resource |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

