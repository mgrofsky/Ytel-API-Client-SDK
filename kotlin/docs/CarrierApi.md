# CarrierApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**carrierLookup**](CarrierApi.md#carrierLookup) | **POST** /carrier/lookup.json | Lookup Carrier
[**carrierLookuplist**](CarrierApi.md#carrierLookuplist) | **POST** /carrier/lookuplist.json | Carrier Results


<a name="carrierLookup"></a>
# **carrierLookup**
> kotlin.String carrierLookup(phoneNumber)

Lookup Carrier

Get the Carrier Lookup

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = CarrierApi()
val phoneNumber : kotlin.String = phoneNumber_example // kotlin.String | A valid 10-digit number (E.164 format).
try {
    val result : kotlin.String = apiInstance.carrierLookup(phoneNumber)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CarrierApi#carrierLookup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CarrierApi#carrierLookup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **kotlin.String**| A valid 10-digit number (E.164 format). |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="carrierLookuplist"></a>
# **carrierLookuplist**
> kotlin.String carrierLookuplist(page, pageSize)

Carrier Results

Retrieve a list of carrier lookup objects.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = CarrierApi()
val page : kotlin.Int = 56 // kotlin.Int | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
val pageSize : kotlin.Int = 56 // kotlin.Int | The count of objects to return per page.
try {
    val result : kotlin.String = apiInstance.carrierLookuplist(page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CarrierApi#carrierLookuplist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CarrierApi#carrierLookuplist")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pageSize** | **kotlin.Int**| The count of objects to return per page. | [optional] [default to 10]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

