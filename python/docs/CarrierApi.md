# swagger_client.CarrierApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**carrier_lookup**](CarrierApi.md#carrier_lookup) | **POST** /carrier/lookup.json | Lookup Carrier
[**carrier_lookuplist**](CarrierApi.md#carrier_lookuplist) | **POST** /carrier/lookuplist.json | Carrier Results


# **carrier_lookup**
> str carrier_lookup(phone_number)

Lookup Carrier

Get the Carrier Lookup

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
api_instance = swagger_client.CarrierApi(swagger_client.ApiClient(configuration))
phone_number = 'phone_number_example' # str | A valid 10-digit number (E.164 format).

try:
    # Lookup Carrier
    api_response = api_instance.carrier_lookup(phone_number)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CarrierApi->carrier_lookup: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone_number** | **str**| A valid 10-digit number (E.164 format). | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **carrier_lookuplist**
> str carrier_lookuplist(page=page, page_size=page_size)

Carrier Results

Retrieve a list of carrier lookup objects.

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
api_instance = swagger_client.CarrierApi(swagger_client.ApiClient(configuration))
page = 1 # int | The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) (default to 1)
page_size = 10 # int | The count of objects to return per page. (optional) (default to 10)

try:
    # Carrier Results
    api_response = api_instance.carrier_lookuplist(page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CarrierApi->carrier_lookuplist: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

