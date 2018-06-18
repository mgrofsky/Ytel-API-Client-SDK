# SwaggerClient::CarrierApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**carrier_lookup**](CarrierApi.md#carrier_lookup) | **POST** /carrier/lookup.json | Lookup Carrier
[**carrier_lookuplist**](CarrierApi.md#carrier_lookuplist) | **POST** /carrier/lookuplist.json | Carrier Results


# **carrier_lookup**
> String carrier_lookup(phone_number)

Lookup Carrier

Get the Carrier Lookup

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

api_instance = SwaggerClient::CarrierApi.new

phone_number = "phone_number_example" # String | A valid 10-digit number (E.164 format).


begin
  #Lookup Carrier
  result = api_instance.carrier_lookup(phone_number)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CarrierApi->carrier_lookup: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone_number** | **String**| A valid 10-digit number (E.164 format). | 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **carrier_lookuplist**
> String carrier_lookuplist(opts)

Carrier Results

Retrieve a list of carrier lookup objects.

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

api_instance = SwaggerClient::CarrierApi.new

opts = { 
  page: 1, # Integer | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
  page_size: 10 # Integer | The count of objects to return per page.
}

begin
  #Carrier Results
  result = api_instance.carrier_lookuplist(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CarrierApi->carrier_lookuplist: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **page_size** | **Integer**| The count of objects to return per page. | [optional] [default to 10]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



