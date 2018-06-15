# \AddressApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AddressCreateaddress**](AddressApi.md#AddressCreateaddress) | **Post** /address/createaddress.json | Create Address
[**AddressDeleteaddress**](AddressApi.md#AddressDeleteaddress) | **Post** /address/deleteaddress.json | Delete Address
[**AddressListaddress**](AddressApi.md#AddressListaddress) | **Post** /address/listaddress.json | List Addresses
[**AddressVerifyaddress**](AddressApi.md#AddressVerifyaddress) | **Post** /address/verifyaddress.json | Verify Address
[**AddressViewaddress**](AddressApi.md#AddressViewaddress) | **Post** /address/viewaddress.json | View Address


# **AddressCreateaddress**
> string AddressCreateaddress(ctx, name, address, country, state, city, zip, optional)
Create Address

To add an address to your address book, you create a new address object. You can retrieve and delete individual addresses as well as get a list of addresses. Addresses are identified by a unique random ID.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **name** | **string**| Name of user | 
  **address** | **string**| Address of user. | 
  **country** | **string**| Must be a 2 letter country short-name code (ISO 3166) | 
  **state** | **string**| Must be a 2 letter State eg. CA for US. For Some Countries it can be greater than 2 letters. | 
  **city** | **string**| City Name. | 
  **zip** | **string**| Zip code of city. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **string**| Name of user | 
 **address** | **string**| Address of user. | 
 **country** | **string**| Must be a 2 letter country short-name code (ISO 3166) | 
 **state** | **string**| Must be a 2 letter State eg. CA for US. For Some Countries it can be greater than 2 letters. | 
 **city** | **string**| City Name. | 
 **zip** | **string**| Zip code of city. | 
 **description** | **string**| Description of addresses. | 
 **email** | **string**| Email Id of user. | 
 **phone** | **string**| Phone number of user. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AddressDeleteaddress**
> string AddressDeleteaddress(ctx, addressid)
Delete Address

To delete Address to your address book

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **addressid** | **string**| The identifier of the address to be deleted. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AddressListaddress**
> string AddressListaddress(ctx, optional)
List Addresses

List All Address 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int32**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [default to 1]
 **pagesize** | **int32**| How many results to return, default is 10, max is 100, must be an integer | [default to 10]
 **addressid** | **string**| addresses Sid | 
 **dateCreated** | **string**| date created address. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AddressVerifyaddress**
> string AddressVerifyaddress(ctx, addressid)
Verify Address

Validates an address given.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **addressid** | **string**| The identifier of the address to be verified. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AddressViewaddress**
> string AddressViewaddress(ctx, addressid)
View Address

View Address Specific address Book by providing the address id

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **addressid** | **string**| The identifier of the address to be retrieved. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

