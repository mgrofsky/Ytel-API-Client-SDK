# swagger_client.RecordingApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**recording_deleterecording**](RecordingApi.md#recording_deleterecording) | **POST** /recording/deleterecording.json | Delete Recording
[**recording_listrecording**](RecordingApi.md#recording_listrecording) | **POST** /recording/listrecording.json | List Recordings
[**recording_viewrecording**](RecordingApi.md#recording_viewrecording) | **POST** /recording/viewrecording.json | View Recording


# **recording_deleterecording**
> str recording_deleterecording(recordingsid)

Delete Recording

Remove a recording from your Ytel account.

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
api_instance = swagger_client.RecordingApi(swagger_client.ApiClient(configuration))
recordingsid = 'recordingsid_example' # str | The unique identifier for a recording.

try:
    # Delete Recording
    api_response = api_instance.recording_deleterecording(recordingsid)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RecordingApi->recording_deleterecording: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordingsid** | **str**| The unique identifier for a recording. | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **recording_listrecording**
> str recording_listrecording(page=page, pagesize=pagesize, datecreated=datecreated, callsid=callsid)

List Recordings

Retrieve a list of recording objects.

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
api_instance = swagger_client.RecordingApi(swagger_client.ApiClient(configuration))
page = 1 # int | The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) (default to 1)
pagesize = 10 # int | The count of objects to return per page. (optional) (default to 10)
datecreated = 'datecreated_example' # str | Filter results by creation date (optional)
callsid = 'callsid_example' # str | The unique identifier for a call. (optional)

try:
    # List Recordings
    api_response = api_instance.recording_listrecording(page=page, pagesize=pagesize, datecreated=datecreated, callsid=callsid)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RecordingApi->recording_listrecording: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **int**| The count of objects to return per page. | [optional] [default to 10]
 **datecreated** | **str**| Filter results by creation date | [optional] 
 **callsid** | **str**| The unique identifier for a call. | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **recording_viewrecording**
> str recording_viewrecording(recordingsid)

View Recording

Retrieve the recording of a call by its RecordingSid. This resource will return information regarding the call such as start time, end time, duration, and so forth.

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
api_instance = swagger_client.RecordingApi(swagger_client.ApiClient(configuration))
recordingsid = 'recordingsid_example' # str | The unique identifier for the recording.

try:
    # View Recording
    api_response = api_instance.recording_viewrecording(recordingsid)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RecordingApi->recording_viewrecording: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordingsid** | **str**| The unique identifier for the recording. | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

