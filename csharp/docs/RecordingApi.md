# IO.Swagger.Api.RecordingApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**RecordingDeleterecording**](RecordingApi.md#recordingdeleterecording) | **POST** /recording/deleterecording.json | Delete Recording
[**RecordingListrecording**](RecordingApi.md#recordinglistrecording) | **POST** /recording/listrecording.json | List Recordings
[**RecordingViewrecording**](RecordingApi.md#recordingviewrecording) | **POST** /recording/viewrecording.json | View Recording


<a name="recordingdeleterecording"></a>
# **RecordingDeleterecording**
> string RecordingDeleterecording (string recordingsid)

Delete Recording

Remove a recording from your Ytel account.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class RecordingDeleterecordingExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new RecordingApi();
            var recordingsid = recordingsid_example;  // string | The unique identifier for a recording.

            try
            {
                // Delete Recording
                string result = apiInstance.RecordingDeleterecording(recordingsid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling RecordingApi.RecordingDeleterecording: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordingsid** | **string**| The unique identifier for a recording. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="recordinglistrecording"></a>
# **RecordingListrecording**
> string RecordingListrecording (int? page = null, int? pagesize = null, string datecreated = null, string callsid = null)

List Recordings

Retrieve a list of recording objects.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class RecordingListrecordingExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new RecordingApi();
            var page = 56;  // int? | The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional)  (default to 1)
            var pagesize = 56;  // int? | The count of objects to return per page. (optional)  (default to 10)
            var datecreated = datecreated_example;  // string | Filter results by creation date (optional) 
            var callsid = callsid_example;  // string | The unique identifier for a call. (optional) 

            try
            {
                // List Recordings
                string result = apiInstance.RecordingListrecording(page, pagesize, datecreated, callsid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling RecordingApi.RecordingListrecording: " + e.Message );
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
 **datecreated** | **string**| Filter results by creation date | [optional] 
 **callsid** | **string**| The unique identifier for a call. | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="recordingviewrecording"></a>
# **RecordingViewrecording**
> string RecordingViewrecording (string recordingsid)

View Recording

Retrieve the recording of a call by its RecordingSid. This resource will return information regarding the call such as start time, end time, duration, and so forth.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class RecordingViewrecordingExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new RecordingApi();
            var recordingsid = recordingsid_example;  // string | The unique identifier for the recording.

            try
            {
                // View Recording
                string result = apiInstance.RecordingViewrecording(recordingsid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling RecordingApi.RecordingViewrecording: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordingsid** | **string**| The unique identifier for the recording. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

