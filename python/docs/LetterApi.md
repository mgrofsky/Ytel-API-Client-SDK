# swagger_client.LetterApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**letter_create**](LetterApi.md#letter_create) | **POST** /letter/create.json | Create Letter
[**letter_delete**](LetterApi.md#letter_delete) | **POST** /letter/delete.json | Delete Letter
[**letter_listsletter**](LetterApi.md#letter_listsletter) | **POST** /letter/listsletter.json | List Letters
[**letter_viewletter**](LetterApi.md#letter_viewletter) | **POST** /letter/viewletter.json | View Letter


# **letter_create**
> str letter_create(to, _from, attachbyid, file, color, description=description, extraservice=extraservice, doublesided=doublesided, template=template, htmldata=htmldata)

Create Letter

Create, print, and mail a letter to an address. The letter file must be supplied as a PDF or an HTML string.

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
api_instance = swagger_client.LetterApi(swagger_client.ApiClient(configuration))
to = 'to_example' # str | The AddressId or an object structured when creating an address by addresses/Create.
_from = '_from_example' # str | The AddressId or an object structured when creating an address by addresses/Create.
attachbyid = 'attachbyid_example' # str | Set an existing letter by attaching its LetterId.
file = 'file_example' # str | File can be a 8.5\"x11\" PDF uploaded file or URL that links to a file.
color = 'color_example' # str | Specify if letter should be printed in color.
description = 'description_example' # str | A description for the letter. (optional)
extraservice = 'extraservice_example' # str | Add an extra service to your letter. Options are \"certified\" or \"registered\". Certified provides tracking and delivery confirmation for domestic destinations and is an additional $5.00. Registered provides tracking and confirmation for international addresses and is an additional $16.50. (optional)
doublesided = 'doublesided_example' # str | Specify if letter should be printed on both sides. (optional)
template = 'template_example' # str | Boolean that defaults to true. When set to false, this specifies that your letter does not follow the m360 address template. In this case, a blank address page will be inserted at the beginning of your file and you will be charged for the extra page. (optional)
htmldata = 'htmldata_example' # str | A string value that contains HTML markup. (optional)

try:
    # Create Letter
    api_response = api_instance.letter_create(to, _from, attachbyid, file, color, description=description, extraservice=extraservice, doublesided=doublesided, template=template, htmldata=htmldata)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LetterApi->letter_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **to** | **str**| The AddressId or an object structured when creating an address by addresses/Create. | 
 **_from** | **str**| The AddressId or an object structured when creating an address by addresses/Create. | 
 **attachbyid** | **str**| Set an existing letter by attaching its LetterId. | 
 **file** | **str**| File can be a 8.5\&quot;x11\&quot; PDF uploaded file or URL that links to a file. | 
 **color** | **str**| Specify if letter should be printed in color. | 
 **description** | **str**| A description for the letter. | [optional] 
 **extraservice** | **str**| Add an extra service to your letter. Options are \&quot;certified\&quot; or \&quot;registered\&quot;. Certified provides tracking and delivery confirmation for domestic destinations and is an additional $5.00. Registered provides tracking and confirmation for international addresses and is an additional $16.50. | [optional] 
 **doublesided** | **str**| Specify if letter should be printed on both sides. | [optional] 
 **template** | **str**| Boolean that defaults to true. When set to false, this specifies that your letter does not follow the m360 address template. In this case, a blank address page will be inserted at the beginning of your file and you will be charged for the extra page. | [optional] 
 **htmldata** | **str**| A string value that contains HTML markup. | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **letter_delete**
> str letter_delete(lettersid)

Delete Letter

Remove a letter object by its LetterId.

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
api_instance = swagger_client.LetterApi(swagger_client.ApiClient(configuration))
lettersid = 'lettersid_example' # str | The unique identifier for a letter object.

try:
    # Delete Letter
    api_response = api_instance.letter_delete(lettersid)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LetterApi->letter_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lettersid** | **str**| The unique identifier for a letter object. | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **letter_listsletter**
> str letter_listsletter(page=page, pagesize=pagesize, lettersid=lettersid, date_created=date_created)

List Letters

Retrieve a list of letter objects. The letter objects are sorted by creation date, with the most recently created letters appearing first.

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
api_instance = swagger_client.LetterApi(swagger_client.ApiClient(configuration))
page = 1 # int | The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) (default to 1)
pagesize = 10 # int | The count of objects to return per page. (optional) (default to 10)
lettersid = 'lettersid_example' # str | The unique identifier for a letter object. (optional)
date_created = 'date_created_example' # str | The date the letter was created. (optional)

try:
    # List Letters
    api_response = api_instance.letter_listsletter(page=page, pagesize=pagesize, lettersid=lettersid, date_created=date_created)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LetterApi->letter_listsletter: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **int**| The count of objects to return per page. | [optional] [default to 10]
 **lettersid** | **str**| The unique identifier for a letter object. | [optional] 
 **date_created** | **str**| The date the letter was created. | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **letter_viewletter**
> str letter_viewletter(lettersid)

View Letter

Retrieve a letter object by its LetterSid.

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
api_instance = swagger_client.LetterApi(swagger_client.ApiClient(configuration))
lettersid = 'lettersid_example' # str | The unique identifier for a letter object.

try:
    # View Letter
    api_response = api_instance.letter_viewletter(lettersid)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LetterApi->letter_viewletter: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lettersid** | **str**| The unique identifier for a letter object. | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

