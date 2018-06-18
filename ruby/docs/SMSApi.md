# SwaggerClient::SMSApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sms_getinboundsms**](SMSApi.md#sms_getinboundsms) | **POST** /sms/getinboundsms.json | List Inbound SMS
[**sms_listsms**](SMSApi.md#sms_listsms) | **POST** /sms/listsms.json | List SMS
[**sms_sendsms**](SMSApi.md#sms_sendsms) | **POST** /sms/sendsms.json | Send SMS
[**sms_viewdetailsms**](SMSApi.md#sms_viewdetailsms) | **POST** /sms/viewdetailsms.json | View SMS
[**sms_viewsms**](SMSApi.md#sms_viewsms) | **POST** /sms/viewsms.json | View SMS


# **sms_getinboundsms**
> String sms_getinboundsms(opts)

List Inbound SMS

Retrieve a list of Inbound SMS message objects.

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

api_instance = SwaggerClient::SMSApi.new

opts = { 
  page: 1, # Integer | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
  page_size: 10, # Integer | The count of objects to return per page.
  from: "from_example", # String | Filter SMS message objects from this valid 10-digit phone number (E.164 format).
  to: "to_example", # String | Filter SMS message objects to this valid 10-digit phone number (E.164 format).
  date_sent: "date_sent_example" # String | Filter sms message objects by this date.
}

begin
  #List Inbound SMS
  result = api_instance.sms_getinboundsms(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SMSApi->sms_getinboundsms: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **page_size** | **Integer**| The count of objects to return per page. | [optional] [default to 10]
 **from** | **String**| Filter SMS message objects from this valid 10-digit phone number (E.164 format). | [optional] 
 **to** | **String**| Filter SMS message objects to this valid 10-digit phone number (E.164 format). | [optional] 
 **date_sent** | **String**| Filter sms message objects by this date. | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **sms_listsms**
> String sms_listsms(opts)

List SMS

Retrieve a list of Outbound SMS message objects.

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

api_instance = SwaggerClient::SMSApi.new

opts = { 
  page: 1, # Integer | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
  page_size: 10, # Integer | Number of individual resources listed in the response per page
  from: "from_example", # String | Filter SMS message objects from this valid 10-digit phone number (E.164 format).
  to: "to_example", # String | Filter SMS message objects to this valid 10-digit phone number (E.164 format).
  date_sent: "date_sent_example" # String | Only list SMS messages sent in the specified date range
}

begin
  #List SMS
  result = api_instance.sms_listsms(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SMSApi->sms_listsms: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **page_size** | **Integer**| Number of individual resources listed in the response per page | [optional] [default to 10]
 **from** | **String**| Filter SMS message objects from this valid 10-digit phone number (E.164 format). | [optional] 
 **to** | **String**| Filter SMS message objects to this valid 10-digit phone number (E.164 format). | [optional] 
 **date_sent** | **String**| Only list SMS messages sent in the specified date range | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **sms_sendsms**
> String sms_sendsms(from, to, body, opts)

Send SMS

Send an SMS from a Ytel number

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

api_instance = SwaggerClient::SMSApi.new

from = "from_example" # String | The 10-digit SMS-enabled Ytel number (E.164 format) in which the message is sent.

to = "to_example" # String | The 10-digit phone number (E.164 format) that will receive the message.

body = "body_example" # String | The body message that is to be sent in the text.

opts = { 
  method: "method_example", # String | Specifies the HTTP method used to request the required URL once SMS sent.
  message_status_callback: "message_status_callback_example", # String | URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished.
  smartsms: false, # BOOLEAN | Check's 'to' number can receive sms or not using Carrier API, if wireless = true then text sms is sent, else wireless = false then call is recieved to end user with audible message.
  delivery_status: false # BOOLEAN | Delivery reports are a method to tell your system if the message has arrived on the destination phone.
}

begin
  #Send SMS
  result = api_instance.sms_sendsms(from, to, body, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SMSApi->sms_sendsms: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **String**| The 10-digit SMS-enabled Ytel number (E.164 format) in which the message is sent. | 
 **to** | **String**| The 10-digit phone number (E.164 format) that will receive the message. | 
 **body** | **String**| The body message that is to be sent in the text. | 
 **method** | **String**| Specifies the HTTP method used to request the required URL once SMS sent. | [optional] 
 **message_status_callback** | **String**| URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished. | [optional] 
 **smartsms** | **BOOLEAN**| Check&#39;s &#39;to&#39; number can receive sms or not using Carrier API, if wireless &#x3D; true then text sms is sent, else wireless &#x3D; false then call is recieved to end user with audible message. | [optional] [default to false]
 **delivery_status** | **BOOLEAN**| Delivery reports are a method to tell your system if the message has arrived on the destination phone. | [optional] [default to false]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **sms_viewdetailsms**
> String sms_viewdetailsms(message_sid)

View SMS

Retrieve a single SMS message object with details by its SmsSid.

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

api_instance = SwaggerClient::SMSApi.new

message_sid = "message_sid_example" # String | The unique identifier for a sms message.


begin
  #View SMS
  result = api_instance.sms_viewdetailsms(message_sid)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SMSApi->sms_viewdetailsms: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message_sid** | **String**| The unique identifier for a sms message. | 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **sms_viewsms**
> String sms_viewsms(message_sid)

View SMS

Retrieve a single SMS message object by its SmsSid.

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

api_instance = SwaggerClient::SMSApi.new

message_sid = "message_sid_example" # String | The unique identifier for a sms message.


begin
  #View SMS
  result = api_instance.sms_viewsms(message_sid)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SMSApi->sms_viewsms: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message_sid** | **String**| The unique identifier for a sms message. | 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



