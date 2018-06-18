# SwaggerClient::AddressApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**address_createaddress**](AddressApi.md#address_createaddress) | **POST** /address/createaddress.json | Create Address
[**address_deleteaddress**](AddressApi.md#address_deleteaddress) | **POST** /address/deleteaddress.json | Delete Address
[**address_listaddress**](AddressApi.md#address_listaddress) | **POST** /address/listaddress.json | List Addresses
[**address_verifyaddress**](AddressApi.md#address_verifyaddress) | **POST** /address/verifyaddress.json | Verify Address
[**address_viewaddress**](AddressApi.md#address_viewaddress) | **POST** /address/viewaddress.json | View Address


# **address_createaddress**
> String address_createaddress(name, address, country, state, city, zip, opts)

Create Address

To add an address to your address book, you create a new address object. You can retrieve and delete individual addresses as well as get a list of addresses. Addresses are identified by a unique random ID.

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

api_instance = SwaggerClient::AddressApi.new

name = "name_example" # String | Name of user

address = "address_example" # String | Address of user.

country = "country_example" # String | Must be a 2 letter country short-name code (ISO 3166)

state = "state_example" # String | Must be a 2 letter State eg. CA for US. For Some Countries it can be greater than 2 letters.

city = "city_example" # String | City Name.

zip = "zip_example" # String | Zip code of city.

opts = { 
  description: "description_example", # String | Description of addresses.
  email: "email_example", # String | Email Id of user.
  phone: "phone_example" # String | Phone number of user.
}

begin
  #Create Address
  result = api_instance.address_createaddress(name, address, country, state, city, zip, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AddressApi->address_createaddress: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of user | 
 **address** | **String**| Address of user. | 
 **country** | **String**| Must be a 2 letter country short-name code (ISO 3166) | 
 **state** | **String**| Must be a 2 letter State eg. CA for US. For Some Countries it can be greater than 2 letters. | 
 **city** | **String**| City Name. | 
 **zip** | **String**| Zip code of city. | 
 **description** | **String**| Description of addresses. | [optional] 
 **email** | **String**| Email Id of user. | [optional] 
 **phone** | **String**| Phone number of user. | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **address_deleteaddress**
> String address_deleteaddress(addressid)

Delete Address

To delete Address to your address book

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

api_instance = SwaggerClient::AddressApi.new

addressid = "addressid_example" # String | The identifier of the address to be deleted.


begin
  #Delete Address
  result = api_instance.address_deleteaddress(addressid)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AddressApi->address_deleteaddress: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addressid** | **String**| The identifier of the address to be deleted. | 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **address_listaddress**
> String address_listaddress(opts)

List Addresses

List All Address 

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

api_instance = SwaggerClient::AddressApi.new

opts = { 
  page: 1, # Integer | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
  pagesize: 10, # Integer | How many results to return, default is 10, max is 100, must be an integer
  addressid: "addressid_example", # String | addresses Sid
  date_created: "date_created_example" # String | date created address.
}

begin
  #List Addresses
  result = api_instance.address_listaddress(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AddressApi->address_listaddress: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **Integer**| How many results to return, default is 10, max is 100, must be an integer | [optional] [default to 10]
 **addressid** | **String**| addresses Sid | [optional] 
 **date_created** | **String**| date created address. | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **address_verifyaddress**
> String address_verifyaddress(addressid)

Verify Address

Validates an address given.

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

api_instance = SwaggerClient::AddressApi.new

addressid = "addressid_example" # String | The identifier of the address to be verified.


begin
  #Verify Address
  result = api_instance.address_verifyaddress(addressid)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AddressApi->address_verifyaddress: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addressid** | **String**| The identifier of the address to be verified. | 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **address_viewaddress**
> String address_viewaddress(addressid)

View Address

View Address Specific address Book by providing the address id

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

api_instance = SwaggerClient::AddressApi.new

addressid = "addressid_example" # String | The identifier of the address to be retrieved.


begin
  #View Address
  result = api_instance.address_viewaddress(addressid)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AddressApi->address_viewaddress: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addressid** | **String**| The identifier of the address to be retrieved. | 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



