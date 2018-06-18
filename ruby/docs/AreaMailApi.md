# SwaggerClient::AreaMailApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**areamail_create**](AreaMailApi.md#areamail_create) | **POST** /areamail/create.json | Create AreaMail
[**areamail_delete**](AreaMailApi.md#areamail_delete) | **POST** /areamail/delete.json | Delete AreaMail
[**areamail_lists**](AreaMailApi.md#areamail_lists) | **POST** /areamail/lists.json | List AreaMails
[**areamail_view**](AreaMailApi.md#areamail_view) | **POST** /areamail/view.json | View AreaMail


# **areamail_create**
> String areamail_create(routes, attachbyid, front, back, opts)

Create AreaMail

Create a new AreaMail object.

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

api_instance = SwaggerClient::AreaMailApi.new

routes = "routes_example" # String | List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route.List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route. A carrier route is in the form of 92610-C043 where the carrier route is composed of 5 numbers for zipcode, 1 letter for carrier route type, and 3 numbers for carrier route code. Delivery can be sent to mutliple routes by separating them with a commas. Valid Values: 92656, 92610-C043

attachbyid = "attachbyid_example" # String | Set an existing areamail by attaching its AreamailId.

front = "front_example" # String | The front of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. Back required

back = "back_example" # String | The back of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG.

opts = { 
  description: "description_example", # String | A string value to use as a description for this AreaMail item.
  targettype: "targettype_example", # String | The delivery location type.
  htmldata: "htmldata_example" # String | A string value that contains HTML markup.
}

begin
  #Create AreaMail
  result = api_instance.areamail_create(routes, attachbyid, front, back, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AreaMailApi->areamail_create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routes** | **String**| List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route.List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route. A carrier route is in the form of 92610-C043 where the carrier route is composed of 5 numbers for zipcode, 1 letter for carrier route type, and 3 numbers for carrier route code. Delivery can be sent to mutliple routes by separating them with a commas. Valid Values: 92656, 92610-C043 | 
 **attachbyid** | **String**| Set an existing areamail by attaching its AreamailId. | 
 **front** | **String**| The front of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. Back required | 
 **back** | **String**| The back of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. | 
 **description** | **String**| A string value to use as a description for this AreaMail item. | [optional] 
 **targettype** | **String**| The delivery location type. | [optional] 
 **htmldata** | **String**| A string value that contains HTML markup. | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **areamail_delete**
> String areamail_delete(areamailid)

Delete AreaMail

Remove an AreaMail object by its AreaMailId.

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

api_instance = SwaggerClient::AreaMailApi.new

areamailid = "areamailid_example" # String | The unique identifier for an AreaMail object.


begin
  #Delete AreaMail
  result = api_instance.areamail_delete(areamailid)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AreaMailApi->areamail_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **areamailid** | **String**| The unique identifier for an AreaMail object. | 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **areamail_lists**
> String areamail_lists(opts)

List AreaMails

Retrieve a list of AreaMail objects.

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

api_instance = SwaggerClient::AreaMailApi.new

opts = { 
  page: 1, # Integer | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
  pagesize: 10, # Integer | The count of objects to return per page.
  areamailsid: "areamailsid_example", # String | The unique identifier for an AreaMail object.
  date_created: "date_created_example" # String | The date the AreaMail was created.
}

begin
  #List AreaMails
  result = api_instance.areamail_lists(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AreaMailApi->areamail_lists: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **Integer**| The count of objects to return per page. | [optional] [default to 10]
 **areamailsid** | **String**| The unique identifier for an AreaMail object. | [optional] 
 **date_created** | **String**| The date the AreaMail was created. | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **areamail_view**
> String areamail_view(areamailid)

View AreaMail

Retrieve an AreaMail object by its AreaMailId.

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

api_instance = SwaggerClient::AreaMailApi.new

areamailid = "areamailid_example" # String | The unique identifier for an AreaMail object.


begin
  #View AreaMail
  result = api_instance.areamail_view(areamailid)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AreaMailApi->areamail_view: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **areamailid** | **String**| The unique identifier for an AreaMail object. | 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



