# swagger_client.ShortCodeApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dedicatedshortcode_getinboundsms**](ShortCodeApi.md#dedicatedshortcode_getinboundsms) | **POST** /dedicatedshortcode/getinboundsms.json | List Inbound SMS
[**dedicatedshortcode_listshortcode**](ShortCodeApi.md#dedicatedshortcode_listshortcode) | **POST** /dedicatedshortcode/listshortcode.json | List Shortcodes
[**dedicatedshortcode_sendsms**](ShortCodeApi.md#dedicatedshortcode_sendsms) | **POST** /dedicatedshortcode/sendsms.json | Send SMS
[**dedicatedshortcode_updateshortcode**](ShortCodeApi.md#dedicatedshortcode_updateshortcode) | **POST** /dedicatedshortcode/updateshortcode.json | Update Shortcode
[**dedicatedshortcode_viewshortcode**](ShortCodeApi.md#dedicatedshortcode_viewshortcode) | **POST** /dedicatedshortcode/viewshortcode.json | View SMS
[**shortcode_listsms**](ShortCodeApi.md#shortcode_listsms) | **POST** /shortcode/listsms.json | List SMS
[**shortcode_viewsms**](ShortCodeApi.md#shortcode_viewsms) | **POST** /shortcode/viewsms.json | View SMS


# **dedicatedshortcode_getinboundsms**
> str dedicatedshortcode_getinboundsms(page=page, pagesize=pagesize, _from=_from, shortcode=shortcode, datecreated=datecreated)

List Inbound SMS

Retrive a list of inbound Sms Short Code messages associated with your Ytel account.

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
api_instance = swagger_client.ShortCodeApi(swagger_client.ApiClient(configuration))
page = 1 # int | The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) (default to 1)
pagesize = 10 # int | Number of individual resources listed in the response per page (optional) (default to 10)
_from = '_from_example' # str | Only list SMS messages sent from this number (optional)
shortcode = 'shortcode_example' # str | Only list SMS messages sent to Shortcode (optional)
datecreated = 'datecreated_example' # str | Only list SMS messages sent in the specified date MAKE REQUEST (optional)

try:
    # List Inbound SMS
    api_response = api_instance.dedicatedshortcode_getinboundsms(page=page, pagesize=pagesize, _from=_from, shortcode=shortcode, datecreated=datecreated)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ShortCodeApi->dedicatedshortcode_getinboundsms: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **int**| Number of individual resources listed in the response per page | [optional] [default to 10]
 **_from** | **str**| Only list SMS messages sent from this number | [optional] 
 **shortcode** | **str**| Only list SMS messages sent to Shortcode | [optional] 
 **datecreated** | **str**| Only list SMS messages sent in the specified date MAKE REQUEST | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dedicatedshortcode_listshortcode**
> str dedicatedshortcode_listshortcode(shortcode=shortcode, page=page, pagesize=pagesize)

List Shortcodes

Retrieve a list of Short Code assignment associated with your Ytel account.

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
api_instance = swagger_client.ShortCodeApi(swagger_client.ApiClient(configuration))
shortcode = 'shortcode_example' # str | Only list Short Code Assignment sent from this Short Code (optional)
page = 'page_example' # str | The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional)
pagesize = 'pagesize_example' # str | The count of objects to return per page. (optional)

try:
    # List Shortcodes
    api_response = api_instance.dedicatedshortcode_listshortcode(shortcode=shortcode, page=page, pagesize=pagesize)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ShortCodeApi->dedicatedshortcode_listshortcode: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **str**| Only list Short Code Assignment sent from this Short Code | [optional] 
 **page** | **str**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] 
 **pagesize** | **str**| The count of objects to return per page. | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dedicatedshortcode_sendsms**
> str dedicatedshortcode_sendsms(shortcode, to, body, method=method, messagestatuscallback=messagestatuscallback)

Send SMS

Send Dedicated Shortcode

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
api_instance = swagger_client.ShortCodeApi(swagger_client.ApiClient(configuration))
shortcode = 56 # int | Your dedicated shortcode
to = 1.2 # float | The number to send your SMS to
body = 'body_example' # str | The body of your message
method = 'method_example' # str | Specifies the HTTP method used to request the required URL once the Short Code message is sent.GET or POST (optional)
messagestatuscallback = 'messagestatuscallback_example' # str | URL that can be requested to receive notification when Short Code message was sent. (optional)

try:
    # Send SMS
    api_response = api_instance.dedicatedshortcode_sendsms(shortcode, to, body, method=method, messagestatuscallback=messagestatuscallback)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ShortCodeApi->dedicatedshortcode_sendsms: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **int**| Your dedicated shortcode | 
 **to** | **float**| The number to send your SMS to | 
 **body** | **str**| The body of your message | 
 **method** | **str**| Specifies the HTTP method used to request the required URL once the Short Code message is sent.GET or POST | [optional] 
 **messagestatuscallback** | **str**| URL that can be requested to receive notification when Short Code message was sent. | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dedicatedshortcode_updateshortcode**
> str dedicatedshortcode_updateshortcode(shortcode, friendly_name=friendly_name, callback_method=callback_method, callback_url=callback_url, fallback_method=fallback_method, fallback_url=fallback_url)

Update Shortcode

Update a dedicated shortcode.

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
api_instance = swagger_client.ShortCodeApi(swagger_client.ApiClient(configuration))
shortcode = 'shortcode_example' # str | List of valid dedicated shortcode to your Ytel account.
friendly_name = 'friendly_name_example' # str | User generated name of the dedicated shortcode. (optional)
callback_method = 'callback_method_example' # str | Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. (optional)
callback_url = 'callback_url_example' # str | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. (optional)
fallback_method = 'fallback_method_example' # str | Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional)
fallback_url = 'fallback_url_example' # str | URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST. (optional)

try:
    # Update Shortcode
    api_response = api_instance.dedicatedshortcode_updateshortcode(shortcode, friendly_name=friendly_name, callback_method=callback_method, callback_url=callback_url, fallback_method=fallback_method, fallback_url=fallback_url)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ShortCodeApi->dedicatedshortcode_updateshortcode: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **str**| List of valid dedicated shortcode to your Ytel account. | 
 **friendly_name** | **str**| User generated name of the dedicated shortcode. | [optional] 
 **callback_method** | **str**| Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. | [optional] 
 **callback_url** | **str**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. | [optional] 
 **fallback_method** | **str**| Specifies the HTTP method used to request the required FallbackUrl once call connects. | [optional] 
 **fallback_url** | **str**| URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST. | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dedicatedshortcode_viewshortcode**
> str dedicatedshortcode_viewshortcode(shortcode)

View SMS

Retrieve a single Short Code object by its shortcode assignment.

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
api_instance = swagger_client.ShortCodeApi(swagger_client.ApiClient(configuration))
shortcode = 'shortcode_example' # str | List of valid Dedicated Short Code to your Ytel account

try:
    # View SMS
    api_response = api_instance.dedicatedshortcode_viewshortcode(shortcode)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ShortCodeApi->dedicatedshortcode_viewshortcode: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **str**| List of valid Dedicated Short Code to your Ytel account | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **shortcode_listsms**
> str shortcode_listsms(shortcode=shortcode, to=to, date_sent=date_sent, page=page, page_size=page_size)

List SMS

Retrieve a list of Short Code messages.

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
api_instance = swagger_client.ShortCodeApi(swagger_client.ApiClient(configuration))
shortcode = 'shortcode_example' # str | Only list messages sent from this Short Code (optional)
to = 'to_example' # str | Only list messages sent to this number (optional)
date_sent = 'date_sent_example' # str | Only list messages sent with the specified date (optional)
page = 1 # int | The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) (default to 1)
page_size = 10 # int | The count of objects to return per page. (optional) (default to 10)

try:
    # List SMS
    api_response = api_instance.shortcode_listsms(shortcode=shortcode, to=to, date_sent=date_sent, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ShortCodeApi->shortcode_listsms: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **str**| Only list messages sent from this Short Code | [optional] 
 **to** | **str**| Only list messages sent to this number | [optional] 
 **date_sent** | **str**| Only list messages sent with the specified date | [optional] 
 **page** | **int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **page_size** | **int**| The count of objects to return per page. | [optional] [default to 10]

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **shortcode_viewsms**
> str shortcode_viewsms(message_sid)

View SMS

View a single Sms Short Code message.

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
api_instance = swagger_client.ShortCodeApi(swagger_client.ApiClient(configuration))
message_sid = 'message_sid_example' # str | The unique identifier for the sms resource

try:
    # View SMS
    api_response = api_instance.shortcode_viewsms(message_sid)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ShortCodeApi->shortcode_viewsms: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message_sid** | **str**| The unique identifier for the sms resource | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

