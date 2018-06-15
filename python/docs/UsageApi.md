# swagger_client.UsageApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usage_listusage**](UsageApi.md#usage_listusage) | **POST** /usage/listusage.json | List Usage


# **usage_listusage**
> str usage_listusage(product_code=product_code, start_date=start_date, end_date=end_date, include_sub_accounts=include_sub_accounts)

List Usage

Retrieve usage metrics regarding your Ytel account. The results includes inbound/outbound voice calls and inbound/outbound SMS messages as well as carrier lookup requests.

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
api_instance = swagger_client.UsageApi(swagger_client.ApiClient(configuration))
product_code = '0' # str | Filter usage results by product type. (optional) (default to 0)
start_date = '2016-09-06' # str | Filter usage objects by start date. (optional) (default to 2016-09-06)
end_date = '2016-09-06' # str | Filter usage objects by end date. (optional) (default to 2016-09-06)
include_sub_accounts = 'include_sub_accounts_example' # str | Will include all subaccount usage data (optional)

try:
    # List Usage
    api_response = api_instance.usage_listusage(product_code=product_code, start_date=start_date, end_date=end_date, include_sub_accounts=include_sub_accounts)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UsageApi->usage_listusage: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_code** | **str**| Filter usage results by product type. | [optional] [default to 0]
 **start_date** | **str**| Filter usage objects by start date. | [optional] [default to 2016-09-06]
 **end_date** | **str**| Filter usage objects by end date. | [optional] [default to 2016-09-06]
 **include_sub_accounts** | **str**| Will include all subaccount usage data | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

