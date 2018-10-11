# swagger_client.SMSApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sms_getinboundsms**](SMSApi.md#sms_getinboundsms) | **POST** /sms/getinboundsms.json | List Inbound SMS
[**sms_listsms**](SMSApi.md#sms_listsms) | **POST** /sms/listsms.json | List SMS
[**sms_sendsms**](SMSApi.md#sms_sendsms) | **POST** /sms/sendsms.json | Send SMS
[**sms_viewdetailsms**](SMSApi.md#sms_viewdetailsms) | **POST** /sms/viewdetailsms.json | View SMS
[**sms_viewsms**](SMSApi.md#sms_viewsms) | **POST** /sms/viewsms.json | View SMS


# **sms_getinboundsms**
> str sms_getinboundsms(page=page, page_size=page_size, _from=_from, to=to, date_sent=date_sent)

List Inbound SMS

Retrieve a list of Inbound SMS message objects.

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
api_instance = swagger_client.SMSApi(swagger_client.ApiClient(configuration))
page = 1 # int | The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) (default to 1)
page_size = 10 # int | The count of objects to return per page. (optional) (default to 10)
_from = '_from_example' # str | Filter SMS message objects from this valid 10-digit phone number (E.164 format). (optional)
to = 'to_example' # str | Filter SMS message objects to this valid 10-digit phone number (E.164 format). (optional)
date_sent = 'date_sent_example' # str | Filter sms message objects by this date. (optional)

try:
    # List Inbound SMS
    api_response = api_instance.sms_getinboundsms(page=page, page_size=page_size, _from=_from, to=to, date_sent=date_sent)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SMSApi->sms_getinboundsms: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **page_size** | **int**| The count of objects to return per page. | [optional] [default to 10]
 **_from** | **str**| Filter SMS message objects from this valid 10-digit phone number (E.164 format). | [optional] 
 **to** | **str**| Filter SMS message objects to this valid 10-digit phone number (E.164 format). | [optional] 
 **date_sent** | **str**| Filter sms message objects by this date. | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **sms_listsms**
> str sms_listsms(page=page, page_size=page_size, _from=_from, to=to, date_sent=date_sent)

List SMS

Retrieve a list of Outbound SMS message objects.

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
api_instance = swagger_client.SMSApi(swagger_client.ApiClient(configuration))
page = 1 # int | The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) (default to 1)
page_size = 10 # int | Number of individual resources listed in the response per page (optional) (default to 10)
_from = '_from_example' # str | Filter SMS message objects from this valid 10-digit phone number (E.164 format). (optional)
to = 'to_example' # str | Filter SMS message objects to this valid 10-digit phone number (E.164 format). (optional)
date_sent = 'date_sent_example' # str | Only list SMS messages sent in the specified date range (optional)

try:
    # List SMS
    api_response = api_instance.sms_listsms(page=page, page_size=page_size, _from=_from, to=to, date_sent=date_sent)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SMSApi->sms_listsms: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **page_size** | **int**| Number of individual resources listed in the response per page | [optional] [default to 10]
 **_from** | **str**| Filter SMS message objects from this valid 10-digit phone number (E.164 format). | [optional] 
 **to** | **str**| Filter SMS message objects to this valid 10-digit phone number (E.164 format). | [optional] 
 **date_sent** | **str**| Only list SMS messages sent in the specified date range | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **sms_sendsms**
> str sms_sendsms(_from, to, body, method=method, message_status_callback=message_status_callback, smartsms=smartsms, delivery_status=delivery_status)

Send SMS

Send an SMS from a Ytel number

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
api_instance = swagger_client.SMSApi(swagger_client.ApiClient(configuration))
_from = '_from_example' # str | The 10-digit SMS-enabled Ytel number (E.164 format) in which the message is sent.
to = 'to_example' # str | The 10-digit phone number (E.164 format) that will receive the message.
body = 'body_example' # str | The body message that is to be sent in the text.
method = 'method_example' # str | Specifies the HTTP method used to request the required URL once SMS sent. (optional)
message_status_callback = 'message_status_callback_example' # str | URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished. (optional)
smartsms = false # bool | Check's 'to' number can receive sms or not using Carrier API, if wireless = true then text sms is sent, else wireless = false then call is recieved to end user with audible message. (optional) (default to false)
delivery_status = false # bool | Delivery reports are a method to tell your system if the message has arrived on the destination phone. (optional) (default to false)

try:
    # Send SMS
    api_response = api_instance.sms_sendsms(_from, to, body, method=method, message_status_callback=message_status_callback, smartsms=smartsms, delivery_status=delivery_status)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SMSApi->sms_sendsms: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_from** | **str**| The 10-digit SMS-enabled Ytel number (E.164 format) in which the message is sent. | 
 **to** | **str**| The 10-digit phone number (E.164 format) that will receive the message. | 
 **body** | **str**| The body message that is to be sent in the text. | 
 **method** | **str**| Specifies the HTTP method used to request the required URL once SMS sent. | [optional] 
 **message_status_callback** | **str**| URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished. | [optional] 
 **smartsms** | **bool**| Check&#39;s &#39;to&#39; number can receive sms or not using Carrier API, if wireless &#x3D; true then text sms is sent, else wireless &#x3D; false then call is recieved to end user with audible message. | [optional] [default to false]
 **delivery_status** | **bool**| Delivery reports are a method to tell your system if the message has arrived on the destination phone. | [optional] [default to false]

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **sms_viewdetailsms**
> str sms_viewdetailsms(message_sid)

View SMS

Retrieve a single SMS message object with details by its SmsSid.

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
api_instance = swagger_client.SMSApi(swagger_client.ApiClient(configuration))
message_sid = 'message_sid_example' # str | The unique identifier for a sms message.

try:
    # View SMS
    api_response = api_instance.sms_viewdetailsms(message_sid)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SMSApi->sms_viewdetailsms: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message_sid** | **str**| The unique identifier for a sms message. | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **sms_viewsms**
> str sms_viewsms(message_sid)

View SMS

Retrieve a single SMS message object by its SmsSid.

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
api_instance = swagger_client.SMSApi(swagger_client.ApiClient(configuration))
message_sid = 'message_sid_example' # str | The unique identifier for a sms message.

try:
    # View SMS
    api_response = api_instance.sms_viewsms(message_sid)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SMSApi->sms_viewsms: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message_sid** | **str**| The unique identifier for a sms message. | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

