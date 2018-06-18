# SwaggerClient::SharedShortCodeApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**keyword_lists**](SharedShortCodeApi.md#keyword_lists) | **POST** /keyword/lists.json | List Keywords
[**keyword_view**](SharedShortCodeApi.md#keyword_view) | **POST** /keyword/view.json | View Keyword
[**shortcode_getinboundsms**](SharedShortCodeApi.md#shortcode_getinboundsms) | **POST** /shortcode/getinboundsms.json | List Inbound SMS
[**shortcode_listshortcode**](SharedShortCodeApi.md#shortcode_listshortcode) | **POST** /shortcode/listshortcode.json | List Shortcodes
[**shortcode_sendsms**](SharedShortCodeApi.md#shortcode_sendsms) | **POST** /shortcode/sendsms.json | Send SMS
[**shortcode_updateshortcode**](SharedShortCodeApi.md#shortcode_updateshortcode) | **POST** /shortcode/updateshortcode.json | Update Shortcode
[**shortcode_viewshortcode**](SharedShortCodeApi.md#shortcode_viewshortcode) | **POST** /shortcode/viewshortcode.json | View Shortcode
[**template_lists**](SharedShortCodeApi.md#template_lists) | **POST** /template/lists.json | List Templates
[**template_view**](SharedShortCodeApi.md#template_view) | **POST** /template/view.json | View Template


# **keyword_lists**
> String keyword_lists(opts)

List Keywords

Retrieve a list of keywords associated with your Ytel account.

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

api_instance = SwaggerClient::SharedShortCodeApi.new

opts = { 
  page: 1, # Integer | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
  pagesize: 10, # Integer | Number of individual resources listed in the response per page
  keyword: "keyword_example", # String | Only list keywords of keyword
  shortcode: 56 # Integer | Only list keywords of shortcode
}

begin
  #List Keywords
  result = api_instance.keyword_lists(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SharedShortCodeApi->keyword_lists: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **Integer**| Number of individual resources listed in the response per page | [optional] [default to 10]
 **keyword** | **String**| Only list keywords of keyword | [optional] 
 **shortcode** | **Integer**| Only list keywords of shortcode | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **keyword_view**
> String keyword_view(keywordid)

View Keyword

View a set of properties for a single keyword.

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

api_instance = SwaggerClient::SharedShortCodeApi.new

keywordid = "keywordid_example" # String | The unique identifier of each keyword


begin
  #View Keyword
  result = api_instance.keyword_view(keywordid)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SharedShortCodeApi->keyword_view: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keywordid** | **String**| The unique identifier of each keyword | 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **shortcode_getinboundsms**
> String shortcode_getinboundsms(opts)

List Inbound SMS

List All Inbound ShortCode

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

api_instance = SwaggerClient::SharedShortCodeApi.new

opts = { 
  page: 1, # Integer | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
  pagesize: 10, # Integer | Number of individual resources listed in the response per page
  from: "from_example", # String | From Number to Inbound ShortCode
  shortcode: "shortcode_example", # String | Only list messages sent to this Short Code
  datecreated: "datecreated_example" # String | Only list messages sent with the specified date
}

begin
  #List Inbound SMS
  result = api_instance.shortcode_getinboundsms(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SharedShortCodeApi->shortcode_getinboundsms: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **Integer**| Number of individual resources listed in the response per page | [optional] [default to 10]
 **from** | **String**| From Number to Inbound ShortCode | [optional] 
 **shortcode** | **String**| Only list messages sent to this Short Code | [optional] 
 **datecreated** | **String**| Only list messages sent with the specified date | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **shortcode_listshortcode**
> String shortcode_listshortcode(opts)

List Shortcodes

Retrieve a list of shortcode assignment associated with your Ytel account.

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

api_instance = SwaggerClient::SharedShortCodeApi.new

opts = { 
  page: 1, # Integer | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
  pagesize: 10, # Integer | Number of individual resources listed in the response per page
  shortcode: "shortcode_example" # String | Only list keywords of shortcode
}

begin
  #List Shortcodes
  result = api_instance.shortcode_listshortcode(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SharedShortCodeApi->shortcode_listshortcode: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **Integer**| Number of individual resources listed in the response per page | [optional] [default to 10]
 **shortcode** | **String**| Only list keywords of shortcode | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **shortcode_sendsms**
> String shortcode_sendsms(shortcode, to, templateid, data, opts)

Send SMS

Send an SMS from a Ytel ShortCode

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

api_instance = SwaggerClient::SharedShortCodeApi.new

shortcode = "shortcode_example" # String | The Short Code number that is the sender of this message

to = "to_example" # String | A valid 10-digit number that should receive the message

templateid = "templateid_example" # String | The unique identifier for the template used for the message

data = "data_example" # String | format of your data, example: {companyname}:test,{otpcode}:1234

opts = { 
  method: "GET", # String | Specifies the HTTP method used to request the required URL once the Short Code message is sent.
  message_status_callback: "message_status_callback_example" # String | URL that can be requested to receive notification when Short Code message was sent.
}

begin
  #Send SMS
  result = api_instance.shortcode_sendsms(shortcode, to, templateid, data, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SharedShortCodeApi->shortcode_sendsms: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **String**| The Short Code number that is the sender of this message | 
 **to** | **String**| A valid 10-digit number that should receive the message | 
 **templateid** | **String**| The unique identifier for the template used for the message | 
 **data** | **String**| format of your data, example: {companyname}:test,{otpcode}:1234 | 
 **method** | **String**| Specifies the HTTP method used to request the required URL once the Short Code message is sent. | [optional] [default to GET]
 **message_status_callback** | **String**| URL that can be requested to receive notification when Short Code message was sent. | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **shortcode_updateshortcode**
> String shortcode_updateshortcode(shortcode, opts)

Update Shortcode

Update Assignment

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

api_instance = SwaggerClient::SharedShortCodeApi.new

shortcode = "shortcode_example" # String | List of valid shortcode to your Ytel account

opts = { 
  friendly_name: "friendly_name_example", # String | User generated name of the shortcode
  callback_url: "callback_url_example", # String | URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
  callback_method: "callback_method_example", # String | Specifies the HTTP method used to request the required StatusCallBackUrl once call connects.
  fallback_url: "fallback_url_example", # String | URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST.
  fallback_url_method: "fallback_url_method_example" # String | Specifies the HTTP method used to request the required FallbackUrl once call connects.
}

begin
  #Update Shortcode
  result = api_instance.shortcode_updateshortcode(shortcode, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SharedShortCodeApi->shortcode_updateshortcode: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **String**| List of valid shortcode to your Ytel account | 
 **friendly_name** | **String**| User generated name of the shortcode | [optional] 
 **callback_url** | **String**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. | [optional] 
 **callback_method** | **String**| Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. | [optional] 
 **fallback_url** | **String**| URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST. | [optional] 
 **fallback_url_method** | **String**| Specifies the HTTP method used to request the required FallbackUrl once call connects. | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **shortcode_viewshortcode**
> String shortcode_viewshortcode(shortcode)

View Shortcode

The response returned here contains all resource properties associated with the given Shortcode.

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

api_instance = SwaggerClient::SharedShortCodeApi.new

shortcode = "shortcode_example" # String | List of valid Shortcode to your Ytel account


begin
  #View Shortcode
  result = api_instance.shortcode_viewshortcode(shortcode)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SharedShortCodeApi->shortcode_viewshortcode: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **String**| List of valid Shortcode to your Ytel account | 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **template_lists**
> String template_lists(opts)

List Templates

List Shortcode Templates by Type

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

api_instance = SwaggerClient::SharedShortCodeApi.new

opts = { 
  type: "authorization", # String | The type (category) of template Valid values: marketing, authorization
  page: 1, # Integer | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
  pagesize: 10, # Integer | The count of objects to return per page.
  shortcode: "shortcode_example" # String | Only list templates of type
}

begin
  #List Templates
  result = api_instance.template_lists(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SharedShortCodeApi->template_lists: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| The type (category) of template Valid values: marketing, authorization | [optional] [default to authorization]
 **page** | **Integer**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **Integer**| The count of objects to return per page. | [optional] [default to 10]
 **shortcode** | **String**| Only list templates of type | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **template_view**
> String template_view(template_id)

View Template

View a Shared ShortCode Template

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

api_instance = SwaggerClient::SharedShortCodeApi.new

template_id = "template_id_example" # String | The unique identifier for a template object


begin
  #View Template
  result = api_instance.template_view(template_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SharedShortCodeApi->template_view: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_id** | **String**| The unique identifier for a template object | 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



