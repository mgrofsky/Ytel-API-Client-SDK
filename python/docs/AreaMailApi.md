# swagger_client.AreaMailApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**areamail_create**](AreaMailApi.md#areamail_create) | **POST** /areamail/create.json | Create AreaMail
[**areamail_delete**](AreaMailApi.md#areamail_delete) | **POST** /areamail/delete.json | Delete AreaMail
[**areamail_lists**](AreaMailApi.md#areamail_lists) | **POST** /areamail/lists.json | List AreaMails
[**areamail_view**](AreaMailApi.md#areamail_view) | **POST** /areamail/view.json | View AreaMail


# **areamail_create**
> str areamail_create(routes, attachbyid, front, back, description=description, targettype=targettype, htmldata=htmldata)

Create AreaMail

Create a new AreaMail object.

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
api_instance = swagger_client.AreaMailApi(swagger_client.ApiClient(configuration))
routes = 'routes_example' # str | List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route.List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route. A carrier route is in the form of 92610-C043 where the carrier route is composed of 5 numbers for zipcode, 1 letter for carrier route type, and 3 numbers for carrier route code. Delivery can be sent to mutliple routes by separating them with a commas. Valid Values: 92656, 92610-C043
attachbyid = 'attachbyid_example' # str | Set an existing areamail by attaching its AreamailId.
front = 'front_example' # str | The front of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. Back required
back = 'back_example' # str | The back of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG.
description = 'description_example' # str | A string value to use as a description for this AreaMail item. (optional)
targettype = 'targettype_example' # str | The delivery location type. (optional)
htmldata = 'htmldata_example' # str | A string value that contains HTML markup. (optional)

try:
    # Create AreaMail
    api_response = api_instance.areamail_create(routes, attachbyid, front, back, description=description, targettype=targettype, htmldata=htmldata)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AreaMailApi->areamail_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routes** | **str**| List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route.List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route. A carrier route is in the form of 92610-C043 where the carrier route is composed of 5 numbers for zipcode, 1 letter for carrier route type, and 3 numbers for carrier route code. Delivery can be sent to mutliple routes by separating them with a commas. Valid Values: 92656, 92610-C043 | 
 **attachbyid** | **str**| Set an existing areamail by attaching its AreamailId. | 
 **front** | **str**| The front of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. Back required | 
 **back** | **str**| The back of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. | 
 **description** | **str**| A string value to use as a description for this AreaMail item. | [optional] 
 **targettype** | **str**| The delivery location type. | [optional] 
 **htmldata** | **str**| A string value that contains HTML markup. | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **areamail_delete**
> str areamail_delete(areamailid)

Delete AreaMail

Remove an AreaMail object by its AreaMailId.

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
api_instance = swagger_client.AreaMailApi(swagger_client.ApiClient(configuration))
areamailid = 'areamailid_example' # str | The unique identifier for an AreaMail object.

try:
    # Delete AreaMail
    api_response = api_instance.areamail_delete(areamailid)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AreaMailApi->areamail_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **areamailid** | **str**| The unique identifier for an AreaMail object. | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **areamail_lists**
> str areamail_lists(page=page, pagesize=pagesize, areamailsid=areamailsid, date_created=date_created)

List AreaMails

Retrieve a list of AreaMail objects.

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
api_instance = swagger_client.AreaMailApi(swagger_client.ApiClient(configuration))
page = 1 # int | The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) (default to 1)
pagesize = 10 # int | The count of objects to return per page. (optional) (default to 10)
areamailsid = 'areamailsid_example' # str | The unique identifier for an AreaMail object. (optional)
date_created = 'date_created_example' # str | The date the AreaMail was created. (optional)

try:
    # List AreaMails
    api_response = api_instance.areamail_lists(page=page, pagesize=pagesize, areamailsid=areamailsid, date_created=date_created)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AreaMailApi->areamail_lists: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **int**| The count of objects to return per page. | [optional] [default to 10]
 **areamailsid** | **str**| The unique identifier for an AreaMail object. | [optional] 
 **date_created** | **str**| The date the AreaMail was created. | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **areamail_view**
> str areamail_view(areamailid)

View AreaMail

Retrieve an AreaMail object by its AreaMailId.

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
api_instance = swagger_client.AreaMailApi(swagger_client.ApiClient(configuration))
areamailid = 'areamailid_example' # str | The unique identifier for an AreaMail object.

try:
    # View AreaMail
    api_response = api_instance.areamail_view(areamailid)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AreaMailApi->areamail_view: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **areamailid** | **str**| The unique identifier for an AreaMail object. | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

