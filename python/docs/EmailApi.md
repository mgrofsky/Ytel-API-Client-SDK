# swagger_client.EmailApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**email_addunsubscribesemail**](EmailApi.md#email_addunsubscribesemail) | **POST** /email/addunsubscribesemail.json | Add Email Unsubscribe
[**email_deleteblocksemail**](EmailApi.md#email_deleteblocksemail) | **POST** /email/deleteblocksemail.json | Remove Blocked Address
[**email_deletebouncesemail**](EmailApi.md#email_deletebouncesemail) | **POST** /email/deletebouncesemail.json | Remove Bounced Email
[**email_deleteinvalidemail**](EmailApi.md#email_deleteinvalidemail) | **POST** /email/deleteinvalidemail.json | Remove Invalid Email
[**email_deletespamemail**](EmailApi.md#email_deletespamemail) | **POST** /email/deletespamemail.json | Remove Spam Address
[**email_deleteunsubscribedemail**](EmailApi.md#email_deleteunsubscribedemail) | **POST** /email/deleteunsubscribedemail.json | Remove Unsubscribed Email
[**email_listblockemail**](EmailApi.md#email_listblockemail) | **POST** /email/listblockemail.json | Blocked Emails
[**email_listbounceemail**](EmailApi.md#email_listbounceemail) | **POST** /email/listbounceemail.json | Bounced Emails
[**email_listinvalidemail**](EmailApi.md#email_listinvalidemail) | **POST** /email/listinvalidemail.json | Invalid Emails
[**email_listspamemail**](EmailApi.md#email_listspamemail) | **POST** /email/listspamemail.json | Spam Emails
[**email_listunsubscribedemail**](EmailApi.md#email_listunsubscribedemail) | **POST** /email/listunsubscribedemail.json | List Unsubscribed Emails
[**email_sendemails**](EmailApi.md#email_sendemails) | **POST** /email/sendemails.json | Send Email


# **email_addunsubscribesemail**
> str email_addunsubscribesemail(email)

Add Email Unsubscribe

Add an email to the unsubscribe list

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
api_instance = swagger_client.EmailApi(swagger_client.ApiClient(configuration))
email = 'email_example' # str | A valid email address that is to be added to the unsubscribe list

try:
    # Add Email Unsubscribe
    api_response = api_instance.email_addunsubscribesemail(email)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EmailApi->email_addunsubscribesemail: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **str**| A valid email address that is to be added to the unsubscribe list | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **email_deleteblocksemail**
> str email_deleteblocksemail(email)

Remove Blocked Address

Remove an email from blocked emails list.

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
api_instance = swagger_client.EmailApi(swagger_client.ApiClient(configuration))
email = 'email_example' # str | The email address to be remove from the blocked list.

try:
    # Remove Blocked Address
    api_response = api_instance.email_deleteblocksemail(email)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EmailApi->email_deleteblocksemail: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **str**| The email address to be remove from the blocked list. | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **email_deletebouncesemail**
> str email_deletebouncesemail(email)

Remove Bounced Email

Remove an email address from the bounced list.

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
api_instance = swagger_client.EmailApi(swagger_client.ApiClient(configuration))
email = 'email_example' # str | The email address to be remove from the bounced email list.

try:
    # Remove Bounced Email
    api_response = api_instance.email_deletebouncesemail(email)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EmailApi->email_deletebouncesemail: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **str**| The email address to be remove from the bounced email list. | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **email_deleteinvalidemail**
> str email_deleteinvalidemail(email)

Remove Invalid Email

Remove an email from the invalid email list.

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
api_instance = swagger_client.EmailApi(swagger_client.ApiClient(configuration))
email = 'email_example' # str | A valid email address that is to be remove from the invalid email list.

try:
    # Remove Invalid Email
    api_response = api_instance.email_deleteinvalidemail(email)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EmailApi->email_deleteinvalidemail: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **str**| A valid email address that is to be remove from the invalid email list. | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **email_deletespamemail**
> str email_deletespamemail(email)

Remove Spam Address

Remove an email from the spam email list.

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
api_instance = swagger_client.EmailApi(swagger_client.ApiClient(configuration))
email = 'email_example' # str | A valid email address that is to be remove from the spam list.

try:
    # Remove Spam Address
    api_response = api_instance.email_deletespamemail(email)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EmailApi->email_deletespamemail: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **str**| A valid email address that is to be remove from the spam list. | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **email_deleteunsubscribedemail**
> str email_deleteunsubscribedemail(email)

Remove Unsubscribed Email

Remove an email address from the list of unsubscribed emails.

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
api_instance = swagger_client.EmailApi(swagger_client.ApiClient(configuration))
email = 'email_example' # str | A valid email address that is to be remove from the unsubscribe list.

try:
    # Remove Unsubscribed Email
    api_response = api_instance.email_deleteunsubscribedemail(email)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EmailApi->email_deleteunsubscribedemail: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **str**| A valid email address that is to be remove from the unsubscribe list. | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **email_listblockemail**
> str email_listblockemail(offset=offset, limit=limit)

Blocked Emails

Retrieve a list of emails that have been blocked.

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
api_instance = swagger_client.EmailApi(swagger_client.ApiClient(configuration))
offset = 'offset_example' # str | The starting point of the list of blocked emails that should be returned. (optional)
limit = 'limit_example' # str | The count of results that should be returned. (optional)

try:
    # Blocked Emails
    api_response = api_instance.email_listblockemail(offset=offset, limit=limit)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EmailApi->email_listblockemail: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **str**| The starting point of the list of blocked emails that should be returned. | [optional] 
 **limit** | **str**| The count of results that should be returned. | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **email_listbounceemail**
> str email_listbounceemail(offset=offset, limit=limit)

Bounced Emails

Retrieve a list of emails that have bounced.

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
api_instance = swagger_client.EmailApi(swagger_client.ApiClient(configuration))
offset = 'offset_example' # str | The starting point of the list of bounced emails that should be returned. (optional)
limit = 'limit_example' # str | The count of results that should be returned. (optional)

try:
    # Bounced Emails
    api_response = api_instance.email_listbounceemail(offset=offset, limit=limit)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EmailApi->email_listbounceemail: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **str**| The starting point of the list of bounced emails that should be returned. | [optional] 
 **limit** | **str**| The count of results that should be returned. | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **email_listinvalidemail**
> str email_listinvalidemail(offset=offset, limit=limit)

Invalid Emails

Retrieve a list of invalid email addresses.

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
api_instance = swagger_client.EmailApi(swagger_client.ApiClient(configuration))
offset = 'offset_example' # str | The starting point of the list of invalid emails that should be returned. (optional)
limit = 'limit_example' # str | The count of results that should be returned. (optional)

try:
    # Invalid Emails
    api_response = api_instance.email_listinvalidemail(offset=offset, limit=limit)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EmailApi->email_listinvalidemail: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **str**| The starting point of the list of invalid emails that should be returned. | [optional] 
 **limit** | **str**| The count of results that should be returned. | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **email_listspamemail**
> str email_listspamemail(offset=offset, limit=limit)

Spam Emails

Retrieve a list of emails that are on the spam list.

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
api_instance = swagger_client.EmailApi(swagger_client.ApiClient(configuration))
offset = 'offset_example' # str | The starting point of the list of spam emails that should be returned. (optional)
limit = 'limit_example' # str | The count of results that should be returned. (optional)

try:
    # Spam Emails
    api_response = api_instance.email_listspamemail(offset=offset, limit=limit)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EmailApi->email_listspamemail: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **str**| The starting point of the list of spam emails that should be returned. | [optional] 
 **limit** | **str**| The count of results that should be returned. | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **email_listunsubscribedemail**
> str email_listunsubscribedemail(offset=offset, limit=limit)

List Unsubscribed Emails

Retrieve a list of email addresses from the unsubscribe list.

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
api_instance = swagger_client.EmailApi(swagger_client.ApiClient(configuration))
offset = 'offset_example' # str | The starting point of the list of unsubscribed emails that should be returned. (optional)
limit = 'limit_example' # str | The count of results that should be returned. (optional)

try:
    # List Unsubscribed Emails
    api_response = api_instance.email_listunsubscribedemail(offset=offset, limit=limit)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EmailApi->email_listunsubscribedemail: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **str**| The starting point of the list of unsubscribed emails that should be returned. | [optional] 
 **limit** | **str**| The count of results that should be returned. | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **email_sendemails**
> str email_sendemails(to, type, subject, message, _from=_from, cc=cc, bcc=bcc, attachment=attachment)

Send Email

Create and submit an email message to one or more email addresses.

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
api_instance = swagger_client.EmailApi(swagger_client.ApiClient(configuration))
to = 'to_example' # str | A valid address that will receive the email. Multiple addresses can be separated by using commas.
type = 'type_example' # str | Specifies the type of email to be sent
subject = 'subject_example' # str | The subject of the mail. Must be a valid string.
message = 'message_example' # str | The email message that is to be sent in the text.
_from = '_from_example' # str | A valid address that will send the email. (optional)
cc = 'cc_example' # str | Carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas. (optional)
bcc = 'bcc_example' # str | Blind carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas. (optional)
attachment = 'attachment_example' # str | A file that is attached to the email. Must be less than 7 MB in size. (optional)

try:
    # Send Email
    api_response = api_instance.email_sendemails(to, type, subject, message, _from=_from, cc=cc, bcc=bcc, attachment=attachment)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EmailApi->email_sendemails: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **to** | **str**| A valid address that will receive the email. Multiple addresses can be separated by using commas. | 
 **type** | **str**| Specifies the type of email to be sent | 
 **subject** | **str**| The subject of the mail. Must be a valid string. | 
 **message** | **str**| The email message that is to be sent in the text. | 
 **_from** | **str**| A valid address that will send the email. | [optional] 
 **cc** | **str**| Carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas. | [optional] 
 **bcc** | **str**| Blind carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas. | [optional] 
 **attachment** | **str**| A file that is attached to the email. Must be less than 7 MB in size. | [optional] 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

