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
> kotlin.String addressCreateaddress(name, address, country, state, city, zip, description, email, phone)

Create Address

To add an address to your address book, you create a new address object. You can retrieve and delete individual addresses as well as get a list of addresses. Addresses are identified by a unique random ID.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = AddressApi()
val name : kotlin.String = name_example // kotlin.String | Name of user
val address : kotlin.String = address_example // kotlin.String | Address of user.
val country : kotlin.String = country_example // kotlin.String | Must be a 2 letter country short-name code (ISO 3166)
val state : kotlin.String = state_example // kotlin.String | Must be a 2 letter State eg. CA for US. For Some Countries it can be greater than 2 letters.
val city : kotlin.String = city_example // kotlin.String | City Name.
val zip : kotlin.String = zip_example // kotlin.String | Zip code of city.
val description : kotlin.String = description_example // kotlin.String | Description of addresses.
val email : kotlin.String = email_example // kotlin.String | Email Id of user.
val phone : kotlin.String = phone_example // kotlin.String | Phone number of user.
try {
    val result : kotlin.String = apiInstance.addressCreateaddress(name, address, country, state, city, zip, description, email, phone)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AddressApi#addressCreateaddress")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AddressApi#addressCreateaddress")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**| Name of user |
 **address** | **kotlin.String**| Address of user. |
 **country** | **kotlin.String**| Must be a 2 letter country short-name code (ISO 3166) |
 **state** | **kotlin.String**| Must be a 2 letter State eg. CA for US. For Some Countries it can be greater than 2 letters. |
 **city** | **kotlin.String**| City Name. |
 **zip** | **kotlin.String**| Zip code of city. |
 **description** | **kotlin.String**| Description of addresses. | [optional]
 **email** | **kotlin.String**| Email Id of user. | [optional]
 **phone** | **kotlin.String**| Phone number of user. | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="addressDeleteaddress"></a>
# **addressDeleteaddress**
> kotlin.String addressDeleteaddress(addressid)

Delete Address

To delete Address to your address book

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = AddressApi()
val addressid : kotlin.String = addressid_example // kotlin.String | The identifier of the address to be deleted.
try {
    val result : kotlin.String = apiInstance.addressDeleteaddress(addressid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AddressApi#addressDeleteaddress")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AddressApi#addressDeleteaddress")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addressid** | **kotlin.String**| The identifier of the address to be deleted. |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="addressListaddress"></a>
# **addressListaddress**
> kotlin.String addressListaddress(page, pagesize, addressid, dateCreated)

List Addresses

List All Address 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = AddressApi()
val page : kotlin.Int = 56 // kotlin.Int | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
val pagesize : kotlin.Int = 56 // kotlin.Int | How many results to return, default is 10, max is 100, must be an integer
val addressid : kotlin.String = addressid_example // kotlin.String | addresses Sid
val dateCreated : kotlin.String = dateCreated_example // kotlin.String | date created address.
try {
    val result : kotlin.String = apiInstance.addressListaddress(page, pagesize, addressid, dateCreated)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AddressApi#addressListaddress")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AddressApi#addressListaddress")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **kotlin.Int**| How many results to return, default is 10, max is 100, must be an integer | [optional] [default to 10]
 **addressid** | **kotlin.String**| addresses Sid | [optional]
 **dateCreated** | **kotlin.String**| date created address. | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="addressVerifyaddress"></a>
# **addressVerifyaddress**
> kotlin.String addressVerifyaddress(addressid)

Verify Address

Validates an address given.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = AddressApi()
val addressid : kotlin.String = addressid_example // kotlin.String | The identifier of the address to be verified.
try {
    val result : kotlin.String = apiInstance.addressVerifyaddress(addressid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AddressApi#addressVerifyaddress")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AddressApi#addressVerifyaddress")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addressid** | **kotlin.String**| The identifier of the address to be verified. |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="addressViewaddress"></a>
# **addressViewaddress**
> kotlin.String addressViewaddress(addressid)

View Address

View Address Specific address Book by providing the address id

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = AddressApi()
val addressid : kotlin.String = addressid_example // kotlin.String | The identifier of the address to be retrieved.
try {
    val result : kotlin.String = apiInstance.addressViewaddress(addressid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AddressApi#addressViewaddress")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AddressApi#addressViewaddress")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addressid** | **kotlin.String**| The identifier of the address to be retrieved. |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

