# SwaggerClient::SubAccountApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**user_createsubaccount**](SubAccountApi.md#user_createsubaccount) | **POST** /user/createsubaccount.json | Create Subaccount
[**user_deletesubaccount**](SubAccountApi.md#user_deletesubaccount) | **POST** /user/deletesubaccount.json | Delete Subaccount
[**user_subaccountactivation**](SubAccountApi.md#user_subaccountactivation) | **POST** /user/subaccountactivation.json | Toggle Subaccount Status


# **user_createsubaccount**
> String user_createsubaccount(first_name, last_name, email, friendly_name, password)

Create Subaccount

Create a sub user account under the parent account

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: auth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::SubAccountApi.new

first_name = "first_name_example" # String | Sub account user first name

last_name = "last_name_example" # String | sub account user last name

email = "email_example" # String | Sub account email address

friendly_name = "friendly_name_example" # String | Descriptive name of the sub account

password = "password_example" # String | The password of the sub account.  Please make sure to make as password that is at least 8 characters long, contain a symbol, uppercase and a number.


begin
  #Create Subaccount
  result = api_instance.user_createsubaccount(first_name, last_name, email, friendly_name, password)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SubAccountApi->user_createsubaccount: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **first_name** | **String**| Sub account user first name | 
 **last_name** | **String**| sub account user last name | 
 **email** | **String**| Sub account email address | 
 **friendly_name** | **String**| Descriptive name of the sub account | 
 **password** | **String**| The password of the sub account.  Please make sure to make as password that is at least 8 characters long, contain a symbol, uppercase and a number. | 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **user_deletesubaccount**
> String user_deletesubaccount(sub_account_sid, merge_number)

Delete Subaccount

Delete sub account or merge numbers into parent

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: auth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::SubAccountApi.new

sub_account_sid = "sub_account_sid_example" # String | The SubaccountSid to be deleted

merge_number = "merge_number_example" # String | 0 to delete or 1 to merge numbers to parent account.


begin
  #Delete Subaccount
  result = api_instance.user_deletesubaccount(sub_account_sid, merge_number)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SubAccountApi->user_deletesubaccount: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sub_account_sid** | **String**| The SubaccountSid to be deleted | 
 **merge_number** | **String**| 0 to delete or 1 to merge numbers to parent account. | 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **user_subaccountactivation**
> String user_subaccountactivation(sub_account_sid, activate)

Toggle Subaccount Status

Suspend or unsuspend

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: auth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::SubAccountApi.new

sub_account_sid = "sub_account_sid_example" # String | The SubaccountSid to be activated or suspended

activate = "activate_example" # String | 0 to suspend or 1 to activate


begin
  #Toggle Subaccount Status
  result = api_instance.user_subaccountactivation(sub_account_sid, activate)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SubAccountApi->user_subaccountactivation: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sub_account_sid** | **String**| The SubaccountSid to be activated or suspended | 
 **activate** | **String**| 0 to suspend or 1 to activate | 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



