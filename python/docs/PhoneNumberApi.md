# swagger_client.PhoneNumberApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**incomingphone_availablenumber**](PhoneNumberApi.md#incomingphone_availablenumber) | **POST** /incomingphone/availablenumber.json | Available Numbers
[**incomingphone_bulkbuy**](PhoneNumberApi.md#incomingphone_bulkbuy) | **POST** /incomingphone/bulkbuy.json | Bulk Buy Numbers
[**incomingphone_buynumber**](PhoneNumberApi.md#incomingphone_buynumber) | **POST** /incomingphone/buynumber.json | Purchase Number
[**incomingphone_getdidscore**](PhoneNumberApi.md#incomingphone_getdidscore) | **POST** /incomingphone/getdidscore.json | Get DID Score
[**incomingphone_listnumber**](PhoneNumberApi.md#incomingphone_listnumber) | **POST** /incomingphone/listnumber.json | List Numbers
[**incomingphone_massreleasenumber**](PhoneNumberApi.md#incomingphone_massreleasenumber) | **POST** /incomingphone/massreleasenumber.json | Bulk Release
[**incomingphone_massupdatenumber**](PhoneNumberApi.md#incomingphone_massupdatenumber) | **POST** /incomingphone/massupdatenumber.json | Bulk Update Numbers
[**incomingphone_releasenumber_by_response_type_post**](PhoneNumberApi.md#incomingphone_releasenumber_by_response_type_post) | **POST** /incomingphone/releasenumber.{ResponseType} | Release Number
[**incomingphone_transferphonenumbers**](PhoneNumberApi.md#incomingphone_transferphonenumbers) | **POST** /incomingphone/transferphonenumbers.json | Move Number
[**incomingphone_updatenumber**](PhoneNumberApi.md#incomingphone_updatenumber) | **POST** /incomingphone/updatenumber.json | Update Number
[**incomingphone_viewnumber**](PhoneNumberApi.md#incomingphone_viewnumber) | **POST** /incomingphone/viewnumber.json | View Details


# **incomingphone_availablenumber**
> str incomingphone_availablenumber(numbertype, areacode, pagesize=pagesize)

Available Numbers

Retrieve a list of available phone numbers that can be purchased and used for your Ytel account.

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
api_instance = swagger_client.PhoneNumberApi(swagger_client.ApiClient(configuration))
numbertype = 'numbertype_example' # str | Number type either SMS,Voice or all
areacode = 'areacode_example' # str | Specifies the area code for the returned list of available numbers. Only available for North American numbers.
pagesize = 10 # int | The count of objects to return. (optional) (default to 10)

try:
    # Available Numbers
    api_response = api_instance.incomingphone_availablenumber(numbertype, areacode, pagesize=pagesize)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PhoneNumberApi->incomingphone_availablenumber: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **numbertype** | **str**| Number type either SMS,Voice or all | 
 **areacode** | **str**| Specifies the area code for the returned list of available numbers. Only available for North American numbers. | 
 **pagesize** | **int**| The count of objects to return. | [optional] [default to 10]

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **incomingphone_bulkbuy**
> str incomingphone_bulkbuy(number_type, area_code, quantity, leftover=leftover)

Bulk Buy Numbers

Purchase a selected number of DID's from specific area codes to be used with your Ytel account.

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
api_instance = swagger_client.PhoneNumberApi(swagger_client.ApiClient(configuration))
number_type = 'number_type_example' # str | The capability the number supports.
area_code = 'area_code_example' # str | Specifies the area code for the returned list of available numbers. Only available for North American numbers.
quantity = 'quantity_example' # str | A positive integer that tells how many number you want to buy at a time.
leftover = 'leftover_example' # str | If desired quantity is unavailable purchase what is available . (optional)

try:
    # Bulk Buy Numbers
    api_response = api_instance.incomingphone_bulkbuy(number_type, area_code, quantity, leftover=leftover)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PhoneNumberApi->incomingphone_bulkbuy: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number_type** | **str**| The capability the number supports. | 
 **area_code** | **str**| Specifies the area code for the returned list of available numbers. Only available for North American numbers. | 
 **quantity** | **str**| A positive integer that tells how many number you want to buy at a time. | 
 **leftover** | **str**| If desired quantity is unavailable purchase what is available . | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **incomingphone_buynumber**
> str incomingphone_buynumber(phone_number)

Purchase Number

Purchase a phone number to be used with your Ytel account

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
api_instance = swagger_client.PhoneNumberApi(swagger_client.ApiClient(configuration))
phone_number = 'phone_number_example' # str | A valid 10-digit Ytel number (E.164 format).

try:
    # Purchase Number
    api_response = api_instance.incomingphone_buynumber(phone_number)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PhoneNumberApi->incomingphone_buynumber: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone_number** | **str**| A valid 10-digit Ytel number (E.164 format). | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **incomingphone_getdidscore**
> str incomingphone_getdidscore(phonenumber)

Get DID Score

Get DID Score Number

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
api_instance = swagger_client.PhoneNumberApi(swagger_client.ApiClient(configuration))
phonenumber = 'phonenumber_example' # str | Specifies the multiple phone numbers for check updated spamscore .

try:
    # Get DID Score
    api_response = api_instance.incomingphone_getdidscore(phonenumber)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PhoneNumberApi->incomingphone_getdidscore: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phonenumber** | **str**| Specifies the multiple phone numbers for check updated spamscore . | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **incomingphone_listnumber**
> str incomingphone_listnumber(page=page, page_size=page_size, number_type=number_type, friendly_name=friendly_name)

List Numbers

Retrieve a list of purchased phones numbers associated with your Ytel account.

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
api_instance = swagger_client.PhoneNumberApi(swagger_client.ApiClient(configuration))
page = 1 # int | Which page of the overall response will be returned. Page indexing starts at 1. (optional) (default to 1)
page_size = 10 # int | The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) (default to 10)
number_type = 'number_type_example' # str | The capability supported by the number.Number type either SMS,Voice or all (optional)
friendly_name = 'friendly_name_example' # str | A human-readable label added to the number object. (optional)

try:
    # List Numbers
    api_response = api_instance.incomingphone_listnumber(page=page, page_size=page_size, number_type=number_type, friendly_name=friendly_name)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PhoneNumberApi->incomingphone_listnumber: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| Which page of the overall response will be returned. Page indexing starts at 1. | [optional] [default to 1]
 **page_size** | **int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 10]
 **number_type** | **str**| The capability supported by the number.Number type either SMS,Voice or all | [optional] 
 **friendly_name** | **str**| A human-readable label added to the number object. | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **incomingphone_massreleasenumber**
> str incomingphone_massreleasenumber(phone_number)

Bulk Release

Remove a purchased Ytel number from your account.

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
api_instance = swagger_client.PhoneNumberApi(swagger_client.ApiClient(configuration))
phone_number = 'phone_number_example' # str | A valid Ytel comma separated numbers (E.164 format).

try:
    # Bulk Release
    api_response = api_instance.incomingphone_massreleasenumber(phone_number)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PhoneNumberApi->incomingphone_massreleasenumber: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone_number** | **str**| A valid Ytel comma separated numbers (E.164 format). | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **incomingphone_massupdatenumber**
> str incomingphone_massupdatenumber(phone_number, voice_url, friendly_name=friendly_name, voice_method=voice_method, voice_fallback_url=voice_fallback_url, voice_fallback_method=voice_fallback_method, hangup_callback=hangup_callback, hangup_callback_method=hangup_callback_method, heartbeat_url=heartbeat_url, heartbeat_method=heartbeat_method, sms_url=sms_url, sms_method=sms_method, sms_fallback_url=sms_fallback_url, sms_fallback_method=sms_fallback_method)

Bulk Update Numbers

Update properties for a Ytel numbers that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.

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
api_instance = swagger_client.PhoneNumberApi(swagger_client.ApiClient(configuration))
phone_number = 'phone_number_example' # str | A valid comma(,) separated Ytel numbers. (E.164 format).
voice_url = 'voice_url_example' # str | The URL returning InboundXML incoming calls should execute when connected.
friendly_name = 'friendly_name_example' # str | A human-readable value for labeling the number. (optional)
voice_method = 'voice_method_example' # str | Specifies the HTTP method used to request the VoiceUrl once incoming call connects. (optional)
voice_fallback_url = 'voice_fallback_url_example' # str | URL used if any errors occur during execution of InboundXML on a call or at initial request of the voice url (optional)
voice_fallback_method = 'voice_fallback_method_example' # str | Specifies the HTTP method used to request the VoiceFallbackUrl once incoming call connects. (optional)
hangup_callback = 'hangup_callback_example' # str | URL that can be requested to receive notification when and how incoming call has ended. (optional)
hangup_callback_method = 'hangup_callback_method_example' # str | The HTTP method Ytel will use when requesting the HangupCallback URL. (optional)
heartbeat_url = 'heartbeat_url_example' # str | URL that can be used to monitor the phone number. (optional)
heartbeat_method = 'heartbeat_method_example' # str | The HTTP method Ytel will use when requesting the HeartbeatUrl. (optional)
sms_url = 'sms_url_example' # str | URL requested when an SMS is received. (optional)
sms_method = 'sms_method_example' # str | The HTTP method Ytel will use when requesting the SmsUrl. (optional)
sms_fallback_url = 'sms_fallback_url_example' # str | URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl. (optional)
sms_fallback_method = 'sms_fallback_method_example' # str | The HTTP method Ytel will use when URL requested if the SmsUrl is not available. (optional)

try:
    # Bulk Update Numbers
    api_response = api_instance.incomingphone_massupdatenumber(phone_number, voice_url, friendly_name=friendly_name, voice_method=voice_method, voice_fallback_url=voice_fallback_url, voice_fallback_method=voice_fallback_method, hangup_callback=hangup_callback, hangup_callback_method=hangup_callback_method, heartbeat_url=heartbeat_url, heartbeat_method=heartbeat_method, sms_url=sms_url, sms_method=sms_method, sms_fallback_url=sms_fallback_url, sms_fallback_method=sms_fallback_method)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PhoneNumberApi->incomingphone_massupdatenumber: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone_number** | **str**| A valid comma(,) separated Ytel numbers. (E.164 format). | 
 **voice_url** | **str**| The URL returning InboundXML incoming calls should execute when connected. | 
 **friendly_name** | **str**| A human-readable value for labeling the number. | [optional] 
 **voice_method** | **str**| Specifies the HTTP method used to request the VoiceUrl once incoming call connects. | [optional] 
 **voice_fallback_url** | **str**| URL used if any errors occur during execution of InboundXML on a call or at initial request of the voice url | [optional] 
 **voice_fallback_method** | **str**| Specifies the HTTP method used to request the VoiceFallbackUrl once incoming call connects. | [optional] 
 **hangup_callback** | **str**| URL that can be requested to receive notification when and how incoming call has ended. | [optional] 
 **hangup_callback_method** | **str**| The HTTP method Ytel will use when requesting the HangupCallback URL. | [optional] 
 **heartbeat_url** | **str**| URL that can be used to monitor the phone number. | [optional] 
 **heartbeat_method** | **str**| The HTTP method Ytel will use when requesting the HeartbeatUrl. | [optional] 
 **sms_url** | **str**| URL requested when an SMS is received. | [optional] 
 **sms_method** | **str**| The HTTP method Ytel will use when requesting the SmsUrl. | [optional] 
 **sms_fallback_url** | **str**| URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl. | [optional] 
 **sms_fallback_method** | **str**| The HTTP method Ytel will use when URL requested if the SmsUrl is not available. | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **incomingphone_releasenumber_by_response_type_post**
> str incomingphone_releasenumber_by_response_type_post(phone_number, response_type)

Release Number

Remove a purchased Ytel number from your account.

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
api_instance = swagger_client.PhoneNumberApi(swagger_client.ApiClient(configuration))
phone_number = 'phone_number_example' # str | A valid 10-digit Ytel number (E.164 format).
response_type = 'response_type_example' # str | Response type format xml or json

try:
    # Release Number
    api_response = api_instance.incomingphone_releasenumber_by_response_type_post(phone_number, response_type)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PhoneNumberApi->incomingphone_releasenumber_by_response_type_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone_number** | **str**| A valid 10-digit Ytel number (E.164 format). | 
 **response_type** | **str**| Response type format xml or json | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **incomingphone_transferphonenumbers**
> str incomingphone_transferphonenumbers(phonenumber, fromaccountsid, toaccountsid)

Move Number

Transfer phone number that has been purchased for from one account to another account.

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
api_instance = swagger_client.PhoneNumberApi(swagger_client.ApiClient(configuration))
phonenumber = 'phonenumber_example' # str | A valid 10-digit Ytel number (E.164 format).
fromaccountsid = 'fromaccountsid_example' # str | A specific Accountsid from where Number is getting transfer.
toaccountsid = 'toaccountsid_example' # str | A specific Accountsid to which Number is getting transfer.

try:
    # Move Number
    api_response = api_instance.incomingphone_transferphonenumbers(phonenumber, fromaccountsid, toaccountsid)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PhoneNumberApi->incomingphone_transferphonenumbers: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phonenumber** | **str**| A valid 10-digit Ytel number (E.164 format). | 
 **fromaccountsid** | **str**| A specific Accountsid from where Number is getting transfer. | 
 **toaccountsid** | **str**| A specific Accountsid to which Number is getting transfer. | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **incomingphone_updatenumber**
> str incomingphone_updatenumber(phone_number, voice_url, friendly_name=friendly_name, voice_method=voice_method, voice_fallback_url=voice_fallback_url, voice_fallback_method=voice_fallback_method, hangup_callback=hangup_callback, hangup_callback_method=hangup_callback_method, heartbeat_url=heartbeat_url, heartbeat_method=heartbeat_method, sms_url=sms_url, sms_method=sms_method, sms_fallback_url=sms_fallback_url, sms_fallback_method=sms_fallback_method)

Update Number

Update properties for a Ytel number that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.

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
api_instance = swagger_client.PhoneNumberApi(swagger_client.ApiClient(configuration))
phone_number = 'phone_number_example' # str | A valid Ytel number (E.164 format).
voice_url = 'voice_url_example' # str | URL requested once the call connects
friendly_name = 'friendly_name_example' # str | Phone number friendly name description (optional)
voice_method = 'voice_method_example' # str | Post or Get (optional)
voice_fallback_url = 'voice_fallback_url_example' # str | URL requested if the voice URL is not available (optional)
voice_fallback_method = 'voice_fallback_method_example' # str | Post or Get (optional)
hangup_callback = 'hangup_callback_example' # str | callback url after a hangup occurs (optional)
hangup_callback_method = 'hangup_callback_method_example' # str | Post or Get (optional)
heartbeat_url = 'heartbeat_url_example' # str | URL requested once the call connects (optional)
heartbeat_method = 'heartbeat_method_example' # str | URL that can be requested every 60 seconds during the call to notify of elapsed time (optional)
sms_url = 'sms_url_example' # str | URL requested when an SMS is received (optional)
sms_method = 'sms_method_example' # str | Post or Get (optional)
sms_fallback_url = 'sms_fallback_url_example' # str | URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl. (optional)
sms_fallback_method = 'sms_fallback_method_example' # str | The HTTP method Ytel will use when URL requested if the SmsUrl is not available. (optional)

try:
    # Update Number
    api_response = api_instance.incomingphone_updatenumber(phone_number, voice_url, friendly_name=friendly_name, voice_method=voice_method, voice_fallback_url=voice_fallback_url, voice_fallback_method=voice_fallback_method, hangup_callback=hangup_callback, hangup_callback_method=hangup_callback_method, heartbeat_url=heartbeat_url, heartbeat_method=heartbeat_method, sms_url=sms_url, sms_method=sms_method, sms_fallback_url=sms_fallback_url, sms_fallback_method=sms_fallback_method)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PhoneNumberApi->incomingphone_updatenumber: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone_number** | **str**| A valid Ytel number (E.164 format). | 
 **voice_url** | **str**| URL requested once the call connects | 
 **friendly_name** | **str**| Phone number friendly name description | [optional] 
 **voice_method** | **str**| Post or Get | [optional] 
 **voice_fallback_url** | **str**| URL requested if the voice URL is not available | [optional] 
 **voice_fallback_method** | **str**| Post or Get | [optional] 
 **hangup_callback** | **str**| callback url after a hangup occurs | [optional] 
 **hangup_callback_method** | **str**| Post or Get | [optional] 
 **heartbeat_url** | **str**| URL requested once the call connects | [optional] 
 **heartbeat_method** | **str**| URL that can be requested every 60 seconds during the call to notify of elapsed time | [optional] 
 **sms_url** | **str**| URL requested when an SMS is received | [optional] 
 **sms_method** | **str**| Post or Get | [optional] 
 **sms_fallback_url** | **str**| URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl. | [optional] 
 **sms_fallback_method** | **str**| The HTTP method Ytel will use when URL requested if the SmsUrl is not available. | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **incomingphone_viewnumber**
> str incomingphone_viewnumber(phone_number)

View Details

Retrieve the details for a phone number by its number.

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
api_instance = swagger_client.PhoneNumberApi(swagger_client.ApiClient(configuration))
phone_number = 'phone_number_example' # str | A valid Ytel 10-digit phone number (E.164 format).

try:
    # View Details
    api_response = api_instance.incomingphone_viewnumber(phone_number)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PhoneNumberApi->incomingphone_viewnumber: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone_number** | **str**| A valid Ytel 10-digit phone number (E.164 format). | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

