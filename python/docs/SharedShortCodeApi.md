# swagger_client.SharedShortCodeApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**keyword_lists**](SharedShortCodeApi.md#keyword_lists) | **POST** /keyword/lists.json | List Keywords
[**keyword_view**](SharedShortCodeApi.md#keyword_view) | **POST** /keyword/view.json | View Keyword
[**shortcode_getinboundsms**](SharedShortCodeApi.md#shortcode_getinboundsms) | **POST** /shortcode/getinboundsms.json | List Inbound SMS
[**shortcode_listshortcode**](SharedShortCodeApi.md#shortcode_listshortcode) | **POST** /shortcode/listshortcode.json | List Shortcodes
[**shortcode_sendsms**](SharedShortCodeApi.md#shortcode_sendsms) | **POST** /shortcode/sendsms.json | Send SMS
[**shortcode_updateshortcode**](SharedShortCodeApi.md#shortcode_updateshortcode) | **POST** /shortcode/updateshortcode.json | Update Shortcode
[**shortcode_viewshortcode**](SharedShortCodeApi.md#shortcode_viewshortcode) | **POST** /shortcode/viewshortcode.json | View Shortcode
[**template_lists**](SharedShortCodeApi.md#template_lists) | **POST** /template/lists.json | List Templates
[**template_view**](SharedShortCodeApi.md#template_view) | **POST** /template/view.json | View Template


# **keyword_lists**
> str keyword_lists(page=page, pagesize=pagesize, keyword=keyword, shortcode=shortcode)

List Keywords

Retrieve a list of keywords associated with your Ytel account.

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
api_instance = swagger_client.SharedShortCodeApi(swagger_client.ApiClient(configuration))
page = 1 # int | The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) (default to 1)
pagesize = 10 # int | Number of individual resources listed in the response per page (optional) (default to 10)
keyword = 'keyword_example' # str | Only list keywords of keyword (optional)
shortcode = 56 # int | Only list keywords of shortcode (optional)

try:
    # List Keywords
    api_response = api_instance.keyword_lists(page=page, pagesize=pagesize, keyword=keyword, shortcode=shortcode)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SharedShortCodeApi->keyword_lists: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **int**| Number of individual resources listed in the response per page | [optional] [default to 10]
 **keyword** | **str**| Only list keywords of keyword | [optional] 
 **shortcode** | **int**| Only list keywords of shortcode | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **keyword_view**
> str keyword_view(keywordid)

View Keyword

View a set of properties for a single keyword.

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
api_instance = swagger_client.SharedShortCodeApi(swagger_client.ApiClient(configuration))
keywordid = 'keywordid_example' # str | The unique identifier of each keyword

try:
    # View Keyword
    api_response = api_instance.keyword_view(keywordid)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SharedShortCodeApi->keyword_view: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keywordid** | **str**| The unique identifier of each keyword | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **shortcode_getinboundsms**
> str shortcode_getinboundsms(page=page, pagesize=pagesize, _from=_from, shortcode=shortcode, datecreated=datecreated)

List Inbound SMS

List All Inbound ShortCode

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
api_instance = swagger_client.SharedShortCodeApi(swagger_client.ApiClient(configuration))
page = 1 # int | The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) (default to 1)
pagesize = 10 # int | Number of individual resources listed in the response per page (optional) (default to 10)
_from = '_from_example' # str | From Number to Inbound ShortCode (optional)
shortcode = 'shortcode_example' # str | Only list messages sent to this Short Code (optional)
datecreated = 'datecreated_example' # str | Only list messages sent with the specified date (optional)

try:
    # List Inbound SMS
    api_response = api_instance.shortcode_getinboundsms(page=page, pagesize=pagesize, _from=_from, shortcode=shortcode, datecreated=datecreated)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SharedShortCodeApi->shortcode_getinboundsms: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **int**| Number of individual resources listed in the response per page | [optional] [default to 10]
 **_from** | **str**| From Number to Inbound ShortCode | [optional] 
 **shortcode** | **str**| Only list messages sent to this Short Code | [optional] 
 **datecreated** | **str**| Only list messages sent with the specified date | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **shortcode_listshortcode**
> str shortcode_listshortcode(page=page, pagesize=pagesize, shortcode=shortcode)

List Shortcodes

Retrieve a list of shortcode assignment associated with your Ytel account.

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
api_instance = swagger_client.SharedShortCodeApi(swagger_client.ApiClient(configuration))
page = 1 # int | The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) (default to 1)
pagesize = 10 # int | Number of individual resources listed in the response per page (optional) (default to 10)
shortcode = 'shortcode_example' # str | Only list keywords of shortcode (optional)

try:
    # List Shortcodes
    api_response = api_instance.shortcode_listshortcode(page=page, pagesize=pagesize, shortcode=shortcode)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SharedShortCodeApi->shortcode_listshortcode: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **int**| Number of individual resources listed in the response per page | [optional] [default to 10]
 **shortcode** | **str**| Only list keywords of shortcode | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **shortcode_sendsms**
> str shortcode_sendsms(shortcode, to, templateid, data, method=method, message_status_callback=message_status_callback)

Send SMS

Send an SMS from a Ytel ShortCode

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
api_instance = swagger_client.SharedShortCodeApi(swagger_client.ApiClient(configuration))
shortcode = 'shortcode_example' # str | The Short Code number that is the sender of this message
to = 'to_example' # str | A valid 10-digit number that should receive the message
templateid = 'templateid_example' # str | The unique identifier for the template used for the message
data = 'data_example' # str | format of your data, example: {companyname}:test,{otpcode}:1234
method = 'GET' # str | Specifies the HTTP method used to request the required URL once the Short Code message is sent. (optional) (default to GET)
message_status_callback = 'message_status_callback_example' # str | URL that can be requested to receive notification when Short Code message was sent. (optional)

try:
    # Send SMS
    api_response = api_instance.shortcode_sendsms(shortcode, to, templateid, data, method=method, message_status_callback=message_status_callback)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SharedShortCodeApi->shortcode_sendsms: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **str**| The Short Code number that is the sender of this message | 
 **to** | **str**| A valid 10-digit number that should receive the message | 
 **templateid** | [**str**](.md)| The unique identifier for the template used for the message | 
 **data** | **str**| format of your data, example: {companyname}:test,{otpcode}:1234 | 
 **method** | **str**| Specifies the HTTP method used to request the required URL once the Short Code message is sent. | [optional] [default to GET]
 **message_status_callback** | **str**| URL that can be requested to receive notification when Short Code message was sent. | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **shortcode_updateshortcode**
> str shortcode_updateshortcode(shortcode, friendly_name=friendly_name, callback_url=callback_url, callback_method=callback_method, fallback_url=fallback_url, fallback_url_method=fallback_url_method)

Update Shortcode

Update Assignment

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
api_instance = swagger_client.SharedShortCodeApi(swagger_client.ApiClient(configuration))
shortcode = 'shortcode_example' # str | List of valid shortcode to your Ytel account
friendly_name = 'friendly_name_example' # str | User generated name of the shortcode (optional)
callback_url = 'callback_url_example' # str | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. (optional)
callback_method = 'callback_method_example' # str | Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. (optional)
fallback_url = 'fallback_url_example' # str | URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST. (optional)
fallback_url_method = 'fallback_url_method_example' # str | Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional)

try:
    # Update Shortcode
    api_response = api_instance.shortcode_updateshortcode(shortcode, friendly_name=friendly_name, callback_url=callback_url, callback_method=callback_method, fallback_url=fallback_url, fallback_url_method=fallback_url_method)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SharedShortCodeApi->shortcode_updateshortcode: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **str**| List of valid shortcode to your Ytel account | 
 **friendly_name** | **str**| User generated name of the shortcode | [optional] 
 **callback_url** | **str**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. | [optional] 
 **callback_method** | **str**| Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. | [optional] 
 **fallback_url** | **str**| URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST. | [optional] 
 **fallback_url_method** | **str**| Specifies the HTTP method used to request the required FallbackUrl once call connects. | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **shortcode_viewshortcode**
> str shortcode_viewshortcode(shortcode)

View Shortcode

The response returned here contains all resource properties associated with the given Shortcode.

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
api_instance = swagger_client.SharedShortCodeApi(swagger_client.ApiClient(configuration))
shortcode = 'shortcode_example' # str | List of valid Shortcode to your Ytel account

try:
    # View Shortcode
    api_response = api_instance.shortcode_viewshortcode(shortcode)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SharedShortCodeApi->shortcode_viewshortcode: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **str**| List of valid Shortcode to your Ytel account | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **template_lists**
> str template_lists(type=type, page=page, pagesize=pagesize, shortcode=shortcode)

List Templates

List Shortcode Templates by Type

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
api_instance = swagger_client.SharedShortCodeApi(swagger_client.ApiClient(configuration))
type = 'authorization' # str | The type (category) of template Valid values: marketing, authorization (optional) (default to authorization)
page = 1 # int | The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) (default to 1)
pagesize = 10 # int | The count of objects to return per page. (optional) (default to 10)
shortcode = 'shortcode_example' # str | Only list templates of type (optional)

try:
    # List Templates
    api_response = api_instance.template_lists(type=type, page=page, pagesize=pagesize, shortcode=shortcode)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SharedShortCodeApi->template_lists: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **str**| The type (category) of template Valid values: marketing, authorization | [optional] [default to authorization]
 **page** | **int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **int**| The count of objects to return per page. | [optional] [default to 10]
 **shortcode** | **str**| Only list templates of type | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **template_view**
> str template_view(template_id)

View Template

View a Shared ShortCode Template

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
api_instance = swagger_client.SharedShortCodeApi(swagger_client.ApiClient(configuration))
template_id = 'template_id_example' # str | The unique identifier for a template object

try:
    # View Template
    api_response = api_instance.template_view(template_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SharedShortCodeApi->template_view: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_id** | [**str**](.md)| The unique identifier for a template object | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

