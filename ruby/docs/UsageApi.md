# SwaggerClient::UsageApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usage_listusage**](UsageApi.md#usage_listusage) | **POST** /usage/listusage.json | List Usage


# **usage_listusage**
> String usage_listusage(opts)

List Usage

Retrieve usage metrics regarding your Ytel account. The results includes inbound/outbound voice calls and inbound/outbound SMS messages as well as carrier lookup requests.

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

api_instance = SwaggerClient::UsageApi.new

opts = { 
  product_code: "0", # String | Filter usage results by product type.
  start_date: "2016-09-06", # String | Filter usage objects by start date.
  end_date: "2016-09-06", # String | Filter usage objects by end date.
  include_sub_accounts: "include_sub_accounts_example" # String | Will include all subaccount usage data
}

begin
  #List Usage
  result = api_instance.usage_listusage(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UsageApi->usage_listusage: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_code** | **String**| Filter usage results by product type. | [optional] [default to 0]
 **start_date** | **String**| Filter usage objects by start date. | [optional] [default to 2016-09-06]
 **end_date** | **String**| Filter usage objects by end date. | [optional] [default to 2016-09-06]
 **include_sub_accounts** | **String**| Will include all subaccount usage data | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



