# swagger_client.AddressApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**address_createaddress**](AddressApi.md#address_createaddress) | **POST** /address/createaddress.json | Create Address
[**address_deleteaddress**](AddressApi.md#address_deleteaddress) | **POST** /address/deleteaddress.json | Delete Address
[**address_listaddress**](AddressApi.md#address_listaddress) | **POST** /address/listaddress.json | List Addresses
[**address_verifyaddress**](AddressApi.md#address_verifyaddress) | **POST** /address/verifyaddress.json | Verify Address
[**address_viewaddress**](AddressApi.md#address_viewaddress) | **POST** /address/viewaddress.json | View Address


# **address_createaddress**
> str address_createaddress(name, address, country, state, city, zip, description=description, email=email, phone=phone)

Create Address

To add an address to your address book, you create a new address object. You can retrieve and delete individual addresses as well as get a list of addresses. Addresses are identified by a unique random ID.

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
api_instance = swagger_client.AddressApi(swagger_client.ApiClient(configuration))
name = 'name_example' # str | Name of user
address = 'address_example' # str | Address of user.
country = 'country_example' # str | Must be a 2 letter country short-name code (ISO 3166)
state = 'state_example' # str | Must be a 2 letter State eg. CA for US. For Some Countries it can be greater than 2 letters.
city = 'city_example' # str | City Name.
zip = 'zip_example' # str | Zip code of city.
description = 'description_example' # str | Description of addresses. (optional)
email = 'email_example' # str | Email Id of user. (optional)
phone = 'phone_example' # str | Phone number of user. (optional)

try:
    # Create Address
    api_response = api_instance.address_createaddress(name, address, country, state, city, zip, description=description, email=email, phone=phone)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AddressApi->address_createaddress: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**| Name of user | 
 **address** | **str**| Address of user. | 
 **country** | **str**| Must be a 2 letter country short-name code (ISO 3166) | 
 **state** | **str**| Must be a 2 letter State eg. CA for US. For Some Countries it can be greater than 2 letters. | 
 **city** | **str**| City Name. | 
 **zip** | **str**| Zip code of city. | 
 **description** | **str**| Description of addresses. | [optional] 
 **email** | **str**| Email Id of user. | [optional] 
 **phone** | **str**| Phone number of user. | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **address_deleteaddress**
> str address_deleteaddress(addressid)

Delete Address

To delete Address to your address book

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
api_instance = swagger_client.AddressApi(swagger_client.ApiClient(configuration))
addressid = 'addressid_example' # str | The identifier of the address to be deleted.

try:
    # Delete Address
    api_response = api_instance.address_deleteaddress(addressid)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AddressApi->address_deleteaddress: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addressid** | **str**| The identifier of the address to be deleted. | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **address_listaddress**
> str address_listaddress(page=page, pagesize=pagesize, addressid=addressid, date_created=date_created)

List Addresses

List All Address 

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
api_instance = swagger_client.AddressApi(swagger_client.ApiClient(configuration))
page = 1 # int | The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) (default to 1)
pagesize = 10 # int | How many results to return, default is 10, max is 100, must be an integer (optional) (default to 10)
addressid = 'addressid_example' # str | addresses Sid (optional)
date_created = 'date_created_example' # str | date created address. (optional)

try:
    # List Addresses
    api_response = api_instance.address_listaddress(page=page, pagesize=pagesize, addressid=addressid, date_created=date_created)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AddressApi->address_listaddress: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **int**| How many results to return, default is 10, max is 100, must be an integer | [optional] [default to 10]
 **addressid** | **str**| addresses Sid | [optional] 
 **date_created** | **str**| date created address. | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **address_verifyaddress**
> str address_verifyaddress(addressid)

Verify Address

Validates an address given.

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
api_instance = swagger_client.AddressApi(swagger_client.ApiClient(configuration))
addressid = 'addressid_example' # str | The identifier of the address to be verified.

try:
    # Verify Address
    api_response = api_instance.address_verifyaddress(addressid)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AddressApi->address_verifyaddress: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addressid** | **str**| The identifier of the address to be verified. | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **address_viewaddress**
> str address_viewaddress(addressid)

View Address

View Address Specific address Book by providing the address id

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
api_instance = swagger_client.AddressApi(swagger_client.ApiClient(configuration))
addressid = 'addressid_example' # str | The identifier of the address to be retrieved.

try:
    # View Address
    api_response = api_instance.address_viewaddress(addressid)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AddressApi->address_viewaddress: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addressid** | **str**| The identifier of the address to be retrieved. | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

