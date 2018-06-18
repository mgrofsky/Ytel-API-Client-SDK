# SwaggerClient::AccountApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accounts_viewaccount**](AccountApi.md#accounts_viewaccount) | **POST** /accounts/viewaccount.json | View Account


# **accounts_viewaccount**
> String accounts_viewaccount(date)

View Account

Retrieve information regarding your Ytel account by a specific date. The response object will contain data such as account status, balance, and account usage totals.

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

api_instance = SwaggerClient::AccountApi.new

date = "date_example" # String | Filter account information based on date.


begin
  #View Account
  result = api_instance.accounts_viewaccount(date)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AccountApi->accounts_viewaccount: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **String**| Filter account information based on date. | 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



