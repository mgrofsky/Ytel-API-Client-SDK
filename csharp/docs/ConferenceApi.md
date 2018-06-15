# IO.Swagger.Api.ConferenceApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ConferencesAddParticipant**](ConferenceApi.md#conferencesaddparticipant) | **POST** /conferences/addParticipant.json | Add Participant
[**ConferencesCreateConference**](ConferenceApi.md#conferencescreateconference) | **POST** /conferences/createConference.json | Create Conference
[**ConferencesDeafMuteParticipant**](ConferenceApi.md#conferencesdeafmuteparticipant) | **POST** /conferences/deafMuteParticipant.json | Silence Participant
[**ConferencesHangupParticipant**](ConferenceApi.md#conferenceshangupparticipant) | **POST** /conferences/hangupParticipant.json | Hangup Participant
[**ConferencesListParticipant**](ConferenceApi.md#conferenceslistparticipant) | **POST** /conferences/listParticipant.json | List Participants
[**ConferencesListconference**](ConferenceApi.md#conferenceslistconference) | **POST** /conferences/listconference.json | List Conferences
[**ConferencesPlayAudio**](ConferenceApi.md#conferencesplayaudio) | **POST** /conferences/playAudio.json | Play Audio
[**ConferencesViewParticipant**](ConferenceApi.md#conferencesviewparticipant) | **POST** /conferences/viewParticipant.json | View Participant
[**ConferencesViewconference**](ConferenceApi.md#conferencesviewconference) | **POST** /conferences/viewconference.json | View Conference


<a name="conferencesaddparticipant"></a>
# **ConferencesAddParticipant**
> string ConferencesAddParticipant (string conferenceSid, string participantNumber, bool? muted = null, bool? deaf = null)

Add Participant

Add Participant in conference 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ConferencesAddParticipantExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ConferenceApi();
            var conferenceSid = conferenceSid_example;  // string | The unique identifier for a conference object.
            var participantNumber = participantNumber_example;  // string | The phone number of the participant to be added.
            var muted = true;  // bool? | Specifies if participant should be muted. (optional) 
            var deaf = true;  // bool? | Specifies if the participant should hear audio in the conference. (optional) 

            try
            {
                // Add Participant
                string result = apiInstance.ConferencesAddParticipant(conferenceSid, participantNumber, muted, deaf);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ConferenceApi.ConferencesAddParticipant: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conferenceSid** | **string**| The unique identifier for a conference object. | 
 **participantNumber** | **string**| The phone number of the participant to be added. | 
 **muted** | **bool?**| Specifies if participant should be muted. | [optional] 
 **deaf** | **bool?**| Specifies if the participant should hear audio in the conference. | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="conferencescreateconference"></a>
# **ConferencesCreateConference**
> string ConferencesCreateConference (string from, string to, string url, string method = null, string statusCallBackUrl = null, string statusCallBackMethod = null, string fallbackUrl = null, string fallbackMethod = null, bool? record = null, string recordCallBackUrl = null, string recordCallBackMethod = null, string scheduleTime = null, int? timeout = null)

Create Conference

Here you can experiment with initiating a conference call through Ytel and view the request response generated when doing so.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ConferencesCreateConferenceExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ConferenceApi();
            var from = from_example;  // string | A valid 10-digit number (E.164 format) that will be initiating the conference call.
            var to = to_example;  // string | A valid 10-digit number (E.164 format) that is to receive the conference call.
            var url = url_example;  // string | URL requested once the conference connects
            var method = method_example;  // string | Specifies the HTTP method used to request the required URL once call connects. (optional)  (default to POST)
            var statusCallBackUrl = statusCallBackUrl_example;  // string | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the conference is finished. (optional) 
            var statusCallBackMethod = statusCallBackMethod_example;  // string | Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. (optional) 
            var fallbackUrl = fallbackUrl_example;  // string | URL requested if the initial Url parameter fails or encounters an error (optional) 
            var fallbackMethod = fallbackMethod_example;  // string | Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional) 
            var record = true;  // bool? | Specifies if the conference should be recorded. (optional) 
            var recordCallBackUrl = recordCallBackUrl_example;  // string | Recording parameters will be sent here upon completion. (optional) 
            var recordCallBackMethod = recordCallBackMethod_example;  // string | Specifies the HTTP method used to request the required URL once conference connects. (optional) 
            var scheduleTime = scheduleTime_example;  // string | Schedule conference in future. Schedule time must be greater than current time (optional) 
            var timeout = 56;  // int? | The number of seconds the call stays on the line while waiting for an answer. The max time limit is 999 and the default limit is 60 seconds but lower times can be set. (optional) 

            try
            {
                // Create Conference
                string result = apiInstance.ConferencesCreateConference(from, to, url, method, statusCallBackUrl, statusCallBackMethod, fallbackUrl, fallbackMethod, record, recordCallBackUrl, recordCallBackMethod, scheduleTime, timeout);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ConferenceApi.ConferencesCreateConference: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **string**| A valid 10-digit number (E.164 format) that will be initiating the conference call. | 
 **to** | **string**| A valid 10-digit number (E.164 format) that is to receive the conference call. | 
 **url** | **string**| URL requested once the conference connects | 
 **method** | **string**| Specifies the HTTP method used to request the required URL once call connects. | [optional] [default to POST]
 **statusCallBackUrl** | **string**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the conference is finished. | [optional] 
 **statusCallBackMethod** | **string**| Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. | [optional] 
 **fallbackUrl** | **string**| URL requested if the initial Url parameter fails or encounters an error | [optional] 
 **fallbackMethod** | **string**| Specifies the HTTP method used to request the required FallbackUrl once call connects. | [optional] 
 **record** | **bool?**| Specifies if the conference should be recorded. | [optional] 
 **recordCallBackUrl** | **string**| Recording parameters will be sent here upon completion. | [optional] 
 **recordCallBackMethod** | **string**| Specifies the HTTP method used to request the required URL once conference connects. | [optional] 
 **scheduleTime** | **string**| Schedule conference in future. Schedule time must be greater than current time | [optional] 
 **timeout** | **int?**| The number of seconds the call stays on the line while waiting for an answer. The max time limit is 999 and the default limit is 60 seconds but lower times can be set. | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="conferencesdeafmuteparticipant"></a>
# **ConferencesDeafMuteParticipant**
> string ConferencesDeafMuteParticipant (string conferenceSid, string participantSid, bool? muted = null, bool? deaf = null)

Silence Participant

Deaf Mute Participant

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ConferencesDeafMuteParticipantExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ConferenceApi();
            var conferenceSid = conferenceSid_example;  // string | ID of the active conference
            var participantSid = participantSid_example;  // string | ID of an active participant
            var muted = true;  // bool? | Mute a participant (optional) 
            var deaf = true;  // bool? | Make it so a participant cant hear (optional) 

            try
            {
                // Silence Participant
                string result = apiInstance.ConferencesDeafMuteParticipant(conferenceSid, participantSid, muted, deaf);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ConferenceApi.ConferencesDeafMuteParticipant: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conferenceSid** | **string**| ID of the active conference | 
 **participantSid** | **string**| ID of an active participant | 
 **muted** | **bool?**| Mute a participant | [optional] 
 **deaf** | **bool?**| Make it so a participant cant hear | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="conferenceshangupparticipant"></a>
# **ConferencesHangupParticipant**
> string ConferencesHangupParticipant (string conferenceSid, string participantSid)

Hangup Participant

Remove a participant from a conference.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ConferencesHangupParticipantExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ConferenceApi();
            var conferenceSid = conferenceSid_example;  // string | The unique identifier for a conference object.
            var participantSid = participantSid_example;  // string | The unique identifier for a participant object.

            try
            {
                // Hangup Participant
                string result = apiInstance.ConferencesHangupParticipant(conferenceSid, participantSid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ConferenceApi.ConferencesHangupParticipant: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="conferenceslistparticipant"></a>
# **ConferencesListParticipant**
> string ConferencesListParticipant (string conferenceSid, int? page = null, int? pagesize = null, bool? muted = null, bool? deaf = null)

List Participants

Retrieve a list of participants for an in-progress conference.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ConferencesListParticipantExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ConferenceApi();
            var conferenceSid = conferenceSid_example;  // string | The unique identifier for a conference.
            var page = 56;  // int? | The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional)  (default to 1)
            var pagesize = 56;  // int? | The count of objects to return per page. (optional)  (default to 10)
            var muted = true;  // bool? | Specifies if participant should be muted. (optional) 
            var deaf = true;  // bool? | Specifies if the participant should hear audio in the conference. (optional) 

            try
            {
                // List Participants
                string result = apiInstance.ConferencesListParticipant(conferenceSid, page, pagesize, muted, deaf);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ConferenceApi.ConferencesListParticipant: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conferenceSid** | **string**| The unique identifier for a conference. | 
 **page** | **int?**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **int?**| The count of objects to return per page. | [optional] [default to 10]
 **muted** | **bool?**| Specifies if participant should be muted. | [optional] 
 **deaf** | **bool?**| Specifies if the participant should hear audio in the conference. | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="conferenceslistconference"></a>
# **ConferencesListconference**
> string ConferencesListconference (int? page = null, int? pagesize = null, string friendlyName = null, string dateCreated = null)

List Conferences

Retrieve a list of conference objects.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ConferencesListconferenceExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ConferenceApi();
            var page = 56;  // int? | The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional)  (default to 1)
            var pagesize = 56;  // int? | Number of individual resources listed in the response per page (optional)  (default to 10)
            var friendlyName = friendlyName_example;  // string | Only return conferences with the specified FriendlyName (optional) 
            var dateCreated = dateCreated_example;  // string | Conference created date (optional) 

            try
            {
                // List Conferences
                string result = apiInstance.ConferencesListconference(page, pagesize, friendlyName, dateCreated);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ConferenceApi.ConferencesListconference: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int?**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **int?**| Number of individual resources listed in the response per page | [optional] [default to 10]
 **friendlyName** | **string**| Only return conferences with the specified FriendlyName | [optional] 
 **dateCreated** | **string**| Conference created date | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="conferencesplayaudio"></a>
# **ConferencesPlayAudio**
> string ConferencesPlayAudio (string conferenceSid, string participantSid, string audioUrl)

Play Audio

Play an audio file during a conference.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ConferencesPlayAudioExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ConferenceApi();
            var conferenceSid = conferenceSid_example;  // string | The unique identifier for a conference object.
            var participantSid = participantSid_example;  // string | The unique identifier for a participant object.
            var audioUrl = audioUrl_example;  // string | The URL for the audio file that is to be played during the conference. Multiple audio files can be chained by using a semicolon.

            try
            {
                // Play Audio
                string result = apiInstance.ConferencesPlayAudio(conferenceSid, participantSid, audioUrl);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ConferenceApi.ConferencesPlayAudio: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="conferencesviewparticipant"></a>
# **ConferencesViewParticipant**
> string ConferencesViewParticipant (string conferenceSid, string participantSid)

View Participant

Retrieve information about a participant by its ParticipantSid.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ConferencesViewParticipantExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ConferenceApi();
            var conferenceSid = conferenceSid_example;  // string | The unique identifier for a conference object.
            var participantSid = participantSid_example;  // string | The unique identifier for a participant object.

            try
            {
                // View Participant
                string result = apiInstance.ConferencesViewParticipant(conferenceSid, participantSid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ConferenceApi.ConferencesViewParticipant: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="conferencesviewconference"></a>
# **ConferencesViewconference**
> string ConferencesViewconference (string conferenceSid)

View Conference

Retrieve information about a conference by its ConferenceSid.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ConferencesViewconferenceExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ConferenceApi();
            var conferenceSid = conferenceSid_example;  // string | The unique identifier of each conference resource

            try
            {
                // View Conference
                string result = apiInstance.ConferencesViewconference(conferenceSid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ConferenceApi.ConferencesViewconference: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conferenceSid** | **string**| The unique identifier of each conference resource | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

