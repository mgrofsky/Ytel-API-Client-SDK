# AddressApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addressCreateaddress**](AddressApi.md#addressCreateaddress) | **POST** /address/createaddress.json | Create Address
[**addressDeleteaddress**](AddressApi.md#addressDeleteaddress) | **POST** /address/deleteaddress.json | Delete Address
[**addressListaddress**](AddressApi.md#addressListaddress) | **POST** /address/listaddress.json | List Addresses
[**addressVerifyaddress**](AddressApi.md#addressVerifyaddress) | **POST** /address/verifyaddress.json | Verify Address
[**addressViewaddress**](AddressApi.md#addressViewaddress) | **POST** /address/viewaddress.json | View Address


<a name="addressCreateaddress"></a>
# **addressCreateaddress**
> String addressCreateaddress(name, address, country, state, city, zip, description, email, phone)

Create Address

To add an address to your address book, you create a new address object. You can retrieve and delete individual addresses as well as get a list of addresses. Addresses are identified by a unique random ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

AddressApi apiInstance = new AddressApi();
String name = "name_example"; // String | Name of user
String address = "address_example"; // String | Address of user.
String country = "country_example"; // String | Must be a 2 letter country short-name code (ISO 3166)
String state = "state_example"; // String | Must be a 2 letter State eg. CA for US. For Some Countries it can be greater than 2 letters.
String city = "city_example"; // String | City Name.
String zip = "zip_example"; // String | Zip code of city.
String description = "description_example"; // String | Description of addresses.
String email = "email_example"; // String | Email Id of user.
String phone = "phone_example"; // String | Phone number of user.
try {
    String result = apiInstance.addressCreateaddress(name, address, country, state, city, zip, description, email, phone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressApi#addressCreateaddress");
    e.printStackTrace();
}
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

<a name="addressDeleteaddress"></a>
# **addressDeleteaddress**
> String addressDeleteaddress(addressid)

Delete Address

To delete Address to your address book

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

AddressApi apiInstance = new AddressApi();
String addressid = "addressid_example"; // String | The identifier of the address to be deleted.
try {
    String result = apiInstance.addressDeleteaddress(addressid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressApi#addressDeleteaddress");
    e.printStackTrace();
}
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

<a name="addressListaddress"></a>
# **addressListaddress**
> String addressListaddress(page, pagesize, addressid, dateCreated)

List Addresses

List All Address 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

AddressApi apiInstance = new AddressApi();
Integer page = 1; // Integer | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
Integer pagesize = 10; // Integer | How many results to return, default is 10, max is 100, must be an integer
String addressid = "addressid_example"; // String | addresses Sid
String dateCreated = "dateCreated_example"; // String | date created address.
try {
    String result = apiInstance.addressListaddress(page, pagesize, addressid, dateCreated);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressApi#addressListaddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **Integer**| How many results to return, default is 10, max is 100, must be an integer | [optional] [default to 10]
 **addressid** | **String**| addresses Sid | [optional]
 **dateCreated** | **String**| date created address. | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="addressVerifyaddress"></a>
# **addressVerifyaddress**
> String addressVerifyaddress(addressid)

Verify Address

Validates an address given.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

AddressApi apiInstance = new AddressApi();
String addressid = "addressid_example"; // String | The identifier of the address to be verified.
try {
    String result = apiInstance.addressVerifyaddress(addressid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressApi#addressVerifyaddress");
    e.printStackTrace();
}
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

<a name="addressViewaddress"></a>
# **addressViewaddress**
> String addressViewaddress(addressid)

View Address

View Address Specific address Book by providing the address id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

AddressApi apiInstance = new AddressApi();
String addressid = "addressid_example"; // String | The identifier of the address to be retrieved.
try {
    String result = apiInstance.addressViewaddress(addressid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressApi#addressViewaddress");
    e.printStackTrace();
}
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

