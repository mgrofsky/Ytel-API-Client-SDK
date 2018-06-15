# swagger_client.SubAccountApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**user_createsubaccount**](SubAccountApi.md#user_createsubaccount) | **POST** /user/createsubaccount.json | Create Subaccount
[**user_deletesubaccount**](SubAccountApi.md#user_deletesubaccount) | **POST** /user/deletesubaccount.json | Delete Subaccount
[**user_subaccountactivation**](SubAccountApi.md#user_subaccountactivation) | **POST** /user/subaccountactivation.json | Toggle Subaccount Status


# **user_createsubaccount**
> str user_createsubaccount(first_name, last_name, email, friendly_name, password)

Create Subaccount

Create a sub user account under the parent account

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
api_instance = swagger_client.SubAccountApi(swagger_client.ApiClient(configuration))
first_name = 'first_name_example' # str | Sub account user first name
last_name = 'last_name_example' # str | sub account user last name
email = 'email_example' # str | Sub account email address
friendly_name = 'friendly_name_example' # str | Descriptive name of the sub account
password = 'password_example' # str | The password of the sub account.  Please make sure to make as password that is at least 8 characters long, contain a symbol, uppercase and a number.

try:
    # Create Subaccount
    api_response = api_instance.user_createsubaccount(first_name, last_name, email, friendly_name, password)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SubAccountApi->user_createsubaccount: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **first_name** | **str**| Sub account user first name | 
 **last_name** | **str**| sub account user last name | 
 **email** | **str**| Sub account email address | 
 **friendly_name** | **str**| Descriptive name of the sub account | 
 **password** | **str**| The password of the sub account.  Please make sure to make as password that is at least 8 characters long, contain a symbol, uppercase and a number. | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_deletesubaccount**
> str user_deletesubaccount(sub_account_sid, merge_number)

Delete Subaccount

Delete sub account or merge numbers into parent

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
api_instance = swagger_client.SubAccountApi(swagger_client.ApiClient(configuration))
sub_account_sid = 'sub_account_sid_example' # str | The SubaccountSid to be deleted
merge_number = 'merge_number_example' # str | 0 to delete or 1 to merge numbers to parent account.

try:
    # Delete Subaccount
    api_response = api_instance.user_deletesubaccount(sub_account_sid, merge_number)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SubAccountApi->user_deletesubaccount: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sub_account_sid** | **str**| The SubaccountSid to be deleted | 
 **merge_number** | **str**| 0 to delete or 1 to merge numbers to parent account. | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_subaccountactivation**
> str user_subaccountactivation(sub_account_sid, activate)

Toggle Subaccount Status

Suspend or unsuspend

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
api_instance = swagger_client.SubAccountApi(swagger_client.ApiClient(configuration))
sub_account_sid = 'sub_account_sid_example' # str | The SubaccountSid to be activated or suspended
activate = 'activate_example' # str | 0 to suspend or 1 to activate

try:
    # Toggle Subaccount Status
    api_response = api_instance.user_subaccountactivation(sub_account_sid, activate)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SubAccountApi->user_subaccountactivation: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sub_account_sid** | **str**| The SubaccountSid to be activated or suspended | 
 **activate** | **str**| 0 to suspend or 1 to activate | 

### Return type

**str**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

