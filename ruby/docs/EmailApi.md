# SwaggerClient::EmailApi

All URIs are relative to *https://api.ytel.com/api/v3*

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
> String email_addunsubscribesemail(email)

Add Email Unsubscribe

Add an email to the unsubscribe list

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

api_instance = SwaggerClient::EmailApi.new

email = "email_example" # String | A valid email address that is to be added to the unsubscribe list


begin
  #Add Email Unsubscribe
  result = api_instance.email_addunsubscribesemail(email)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EmailApi->email_addunsubscribesemail: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| A valid email address that is to be added to the unsubscribe list | 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **email_deleteblocksemail**
> String email_deleteblocksemail(email)

Remove Blocked Address

Remove an email from blocked emails list.

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

api_instance = SwaggerClient::EmailApi.new

email = "email_example" # String | The email address to be remove from the blocked list.


begin
  #Remove Blocked Address
  result = api_instance.email_deleteblocksemail(email)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EmailApi->email_deleteblocksemail: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| The email address to be remove from the blocked list. | 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **email_deletebouncesemail**
> String email_deletebouncesemail(email)

Remove Bounced Email

Remove an email address from the bounced list.

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

api_instance = SwaggerClient::EmailApi.new

email = "email_example" # String | The email address to be remove from the bounced email list.


begin
  #Remove Bounced Email
  result = api_instance.email_deletebouncesemail(email)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EmailApi->email_deletebouncesemail: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| The email address to be remove from the bounced email list. | 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **email_deleteinvalidemail**
> String email_deleteinvalidemail(email)

Remove Invalid Email

Remove an email from the invalid email list.

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

api_instance = SwaggerClient::EmailApi.new

email = "email_example" # String | A valid email address that is to be remove from the invalid email list.


begin
  #Remove Invalid Email
  result = api_instance.email_deleteinvalidemail(email)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EmailApi->email_deleteinvalidemail: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| A valid email address that is to be remove from the invalid email list. | 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **email_deletespamemail**
> String email_deletespamemail(email)

Remove Spam Address

Remove an email from the spam email list.

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

api_instance = SwaggerClient::EmailApi.new

email = "email_example" # String | A valid email address that is to be remove from the spam list.


begin
  #Remove Spam Address
  result = api_instance.email_deletespamemail(email)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EmailApi->email_deletespamemail: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| A valid email address that is to be remove from the spam list. | 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **email_deleteunsubscribedemail**
> String email_deleteunsubscribedemail(email)

Remove Unsubscribed Email

Remove an email address from the list of unsubscribed emails.

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

api_instance = SwaggerClient::EmailApi.new

email = "email_example" # String | A valid email address that is to be remove from the unsubscribe list.


begin
  #Remove Unsubscribed Email
  result = api_instance.email_deleteunsubscribedemail(email)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EmailApi->email_deleteunsubscribedemail: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| A valid email address that is to be remove from the unsubscribe list. | 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **email_listblockemail**
> String email_listblockemail(opts)

Blocked Emails

Retrieve a list of emails that have been blocked.

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

api_instance = SwaggerClient::EmailApi.new

opts = { 
  offset: "offset_example", # String | The starting point of the list of blocked emails that should be returned.
  limit: "limit_example" # String | The count of results that should be returned.
}

begin
  #Blocked Emails
  result = api_instance.email_listblockemail(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EmailApi->email_listblockemail: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **String**| The starting point of the list of blocked emails that should be returned. | [optional] 
 **limit** | **String**| The count of results that should be returned. | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **email_listbounceemail**
> String email_listbounceemail(opts)

Bounced Emails

Retrieve a list of emails that have bounced.

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

api_instance = SwaggerClient::EmailApi.new

opts = { 
  offset: "offset_example", # String | The starting point of the list of bounced emails that should be returned.
  limit: "limit_example" # String | The count of results that should be returned.
}

begin
  #Bounced Emails
  result = api_instance.email_listbounceemail(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EmailApi->email_listbounceemail: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **String**| The starting point of the list of bounced emails that should be returned. | [optional] 
 **limit** | **String**| The count of results that should be returned. | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **email_listinvalidemail**
> String email_listinvalidemail(opts)

Invalid Emails

Retrieve a list of invalid email addresses.

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

api_instance = SwaggerClient::EmailApi.new

opts = { 
  offset: "offset_example", # String | The starting point of the list of invalid emails that should be returned.
  limit: "limit_example" # String | The count of results that should be returned.
}

begin
  #Invalid Emails
  result = api_instance.email_listinvalidemail(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EmailApi->email_listinvalidemail: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **String**| The starting point of the list of invalid emails that should be returned. | [optional] 
 **limit** | **String**| The count of results that should be returned. | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **email_listspamemail**
> String email_listspamemail(opts)

Spam Emails

Retrieve a list of emails that are on the spam list.

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

api_instance = SwaggerClient::EmailApi.new

opts = { 
  offset: "offset_example", # String | The starting point of the list of spam emails that should be returned.
  limit: "limit_example" # String | The count of results that should be returned.
}

begin
  #Spam Emails
  result = api_instance.email_listspamemail(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EmailApi->email_listspamemail: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **String**| The starting point of the list of spam emails that should be returned. | [optional] 
 **limit** | **String**| The count of results that should be returned. | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **email_listunsubscribedemail**
> String email_listunsubscribedemail(opts)

List Unsubscribed Emails

Retrieve a list of email addresses from the unsubscribe list.

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

api_instance = SwaggerClient::EmailApi.new

opts = { 
  offset: "offset_example", # String | The starting point of the list of unsubscribed emails that should be returned.
  limit: "limit_example" # String | The count of results that should be returned.
}

begin
  #List Unsubscribed Emails
  result = api_instance.email_listunsubscribedemail(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EmailApi->email_listunsubscribedemail: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **String**| The starting point of the list of unsubscribed emails that should be returned. | [optional] 
 **limit** | **String**| The count of results that should be returned. | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **email_sendemails**
> String email_sendemails(to, type, subject, message, opts)

Send Email

Create and submit an email message to one or more email addresses.

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

api_instance = SwaggerClient::EmailApi.new

to = "to_example" # String | A valid address that will receive the email. Multiple addresses can be separated by using commas.

type = "type_example" # String | Specifies the type of email to be sent

subject = "subject_example" # String | The subject of the mail. Must be a valid string.

message = "message_example" # String | The email message that is to be sent in the text.

opts = { 
  from: "from_example", # String | A valid address that will send the email.
  cc: "cc_example", # String | Carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas.
  bcc: "bcc_example", # String | Blind carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas.
  attachment: "attachment_example" # String | A file that is attached to the email. Must be less than 7 MB in size.
}

begin
  #Send Email
  result = api_instance.email_sendemails(to, type, subject, message, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EmailApi->email_sendemails: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **to** | **String**| A valid address that will receive the email. Multiple addresses can be separated by using commas. | 
 **type** | **String**| Specifies the type of email to be sent | 
 **subject** | **String**| The subject of the mail. Must be a valid string. | 
 **message** | **String**| The email message that is to be sent in the text. | 
 **from** | **String**| A valid address that will send the email. | [optional] 
 **cc** | **String**| Carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas. | [optional] 
 **bcc** | **String**| Blind carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas. | [optional] 
 **attachment** | **String**| A file that is attached to the email. Must be less than 7 MB in size. | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



