# SwaggerClient::ShortCodeApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dedicatedshortcode_getinboundsms**](ShortCodeApi.md#dedicatedshortcode_getinboundsms) | **POST** /dedicatedshortcode/getinboundsms.json | List Inbound SMS
[**dedicatedshortcode_listshortcode**](ShortCodeApi.md#dedicatedshortcode_listshortcode) | **POST** /dedicatedshortcode/listshortcode.json | List Shortcodes
[**dedicatedshortcode_sendsms**](ShortCodeApi.md#dedicatedshortcode_sendsms) | **POST** /dedicatedshortcode/sendsms.json | Send SMS
[**dedicatedshortcode_updateshortcode**](ShortCodeApi.md#dedicatedshortcode_updateshortcode) | **POST** /dedicatedshortcode/updateshortcode.json | Update Shortcode
[**dedicatedshortcode_viewshortcode**](ShortCodeApi.md#dedicatedshortcode_viewshortcode) | **POST** /dedicatedshortcode/viewshortcode.json | View SMS
[**shortcode_listsms**](ShortCodeApi.md#shortcode_listsms) | **POST** /shortcode/listsms.json | List SMS
[**shortcode_viewsms**](ShortCodeApi.md#shortcode_viewsms) | **POST** /shortcode/viewsms.json | View SMS


# **dedicatedshortcode_getinboundsms**
> String dedicatedshortcode_getinboundsms(opts)

List Inbound SMS

Retrive a list of inbound Sms Short Code messages associated with your Ytel account.

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

api_instance = SwaggerClient::ShortCodeApi.new

opts = { 
  page: 1, # Integer | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
  pagesize: 10, # Integer | Number of individual resources listed in the response per page
  from: "from_example", # String | Only list SMS messages sent from this number
  shortcode: "shortcode_example", # String | Only list SMS messages sent to Shortcode
  datecreated: "datecreated_example" # String | Only list SMS messages sent in the specified date MAKE REQUEST
}

begin
  #List Inbound SMS
  result = api_instance.dedicatedshortcode_getinboundsms(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ShortCodeApi->dedicatedshortcode_getinboundsms: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **Integer**| Number of individual resources listed in the response per page | [optional] [default to 10]
 **from** | **String**| Only list SMS messages sent from this number | [optional] 
 **shortcode** | **String**| Only list SMS messages sent to Shortcode | [optional] 
 **datecreated** | **String**| Only list SMS messages sent in the specified date MAKE REQUEST | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **dedicatedshortcode_listshortcode**
> String dedicatedshortcode_listshortcode(opts)

List Shortcodes

Retrieve a list of Short Code assignment associated with your Ytel account.

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

api_instance = SwaggerClient::ShortCodeApi.new

opts = { 
  shortcode: "shortcode_example", # String | Only list Short Code Assignment sent from this Short Code
  page: "page_example", # String | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
  pagesize: "pagesize_example" # String | The count of objects to return per page.
}

begin
  #List Shortcodes
  result = api_instance.dedicatedshortcode_listshortcode(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ShortCodeApi->dedicatedshortcode_listshortcode: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **String**| Only list Short Code Assignment sent from this Short Code | [optional] 
 **page** | **String**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] 
 **pagesize** | **String**| The count of objects to return per page. | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **dedicatedshortcode_sendsms**
> String dedicatedshortcode_sendsms(shortcode, to, body, opts)

Send SMS

Send Dedicated Shortcode

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

api_instance = SwaggerClient::ShortCodeApi.new

shortcode = 56 # Integer | Your dedicated shortcode

to = 1.2 # Float | The number to send your SMS to

body = "body_example" # String | The body of your message

opts = { 
  method: "method_example", # String | Specifies the HTTP method used to request the required URL once the Short Code message is sent.GET or POST
  messagestatuscallback: "messagestatuscallback_example" # String | URL that can be requested to receive notification when Short Code message was sent.
}

begin
  #Send SMS
  result = api_instance.dedicatedshortcode_sendsms(shortcode, to, body, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ShortCodeApi->dedicatedshortcode_sendsms: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **Integer**| Your dedicated shortcode | 
 **to** | **Float**| The number to send your SMS to | 
 **body** | **String**| The body of your message | 
 **method** | **String**| Specifies the HTTP method used to request the required URL once the Short Code message is sent.GET or POST | [optional] 
 **messagestatuscallback** | **String**| URL that can be requested to receive notification when Short Code message was sent. | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **dedicatedshortcode_updateshortcode**
> String dedicatedshortcode_updateshortcode(shortcode, opts)

Update Shortcode

Update a dedicated shortcode.

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

api_instance = SwaggerClient::ShortCodeApi.new

shortcode = "shortcode_example" # String | List of valid dedicated shortcode to your Ytel account.

opts = { 
  friendly_name: "friendly_name_example", # String | User generated name of the dedicated shortcode.
  callback_method: "callback_method_example", # String | Specifies the HTTP method used to request the required StatusCallBackUrl once call connects.
  callback_url: "callback_url_example", # String | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
  fallback_method: "fallback_method_example", # String | Specifies the HTTP method used to request the required FallbackUrl once call connects.
  fallback_url: "fallback_url_example" # String | URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST.
}

begin
  #Update Shortcode
  result = api_instance.dedicatedshortcode_updateshortcode(shortcode, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ShortCodeApi->dedicatedshortcode_updateshortcode: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **String**| List of valid dedicated shortcode to your Ytel account. | 
 **friendly_name** | **String**| User generated name of the dedicated shortcode. | [optional] 
 **callback_method** | **String**| Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. | [optional] 
 **callback_url** | **String**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. | [optional] 
 **fallback_method** | **String**| Specifies the HTTP method used to request the required FallbackUrl once call connects. | [optional] 
 **fallback_url** | **String**| URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST. | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **dedicatedshortcode_viewshortcode**
> String dedicatedshortcode_viewshortcode(shortcode)

View SMS

Retrieve a single Short Code object by its shortcode assignment.

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

api_instance = SwaggerClient::ShortCodeApi.new

shortcode = "shortcode_example" # String | List of valid Dedicated Short Code to your Ytel account


begin
  #View SMS
  result = api_instance.dedicatedshortcode_viewshortcode(shortcode)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ShortCodeApi->dedicatedshortcode_viewshortcode: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **String**| List of valid Dedicated Short Code to your Ytel account | 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **shortcode_listsms**
> String shortcode_listsms(opts)

List SMS

Retrieve a list of Short Code messages.

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

api_instance = SwaggerClient::ShortCodeApi.new

opts = { 
  shortcode: "shortcode_example", # String | Only list messages sent from this Short Code
  to: "to_example", # String | Only list messages sent to this number
  date_sent: "date_sent_example", # String | Only list messages sent with the specified date
  page: 1, # Integer | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
  page_size: 10 # Integer | The count of objects to return per page.
}

begin
  #List SMS
  result = api_instance.shortcode_listsms(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ShortCodeApi->shortcode_listsms: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **String**| Only list messages sent from this Short Code | [optional] 
 **to** | **String**| Only list messages sent to this number | [optional] 
 **date_sent** | **String**| Only list messages sent with the specified date | [optional] 
 **page** | **Integer**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **page_size** | **Integer**| The count of objects to return per page. | [optional] [default to 10]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **shortcode_viewsms**
> String shortcode_viewsms(message_sid)

View SMS

View a single Sms Short Code message.

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

api_instance = SwaggerClient::ShortCodeApi.new

message_sid = "message_sid_example" # String | The unique identifier for the sms resource


begin
  #View SMS
  result = api_instance.shortcode_viewsms(message_sid)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ShortCodeApi->shortcode_viewsms: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message_sid** | **String**| The unique identifier for the sms resource | 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



