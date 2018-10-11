# CarrierApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**carrierLookup**](CarrierApi.md#carrierLookup) | **POST** /carrier/lookup.json | Lookup Carrier
[**carrierLookuplist**](CarrierApi.md#carrierLookuplist) | **POST** /carrier/lookuplist.json | Carrier Results


<a name="carrierLookup"></a>
# **carrierLookup**
> String carrierLookup(phoneNumber)

Lookup Carrier

Get the Carrier Lookup

### Example
```java
// Import classes:
//import io.swagger.client.api.CarrierApi;

CarrierApi apiInstance = new CarrierApi();
String phoneNumber = "phoneNumber_example"; // String | A valid 10-digit number (E.164 format).
try {
    String result = apiInstance.carrierLookup(phoneNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CarrierApi#carrierLookup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **String**| A valid 10-digit number (E.164 format). |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="carrierLookuplist"></a>
# **carrierLookuplist**
> String carrierLookuplist(page, pageSize)

Carrier Results

Retrieve a list of carrier lookup objects.

### Example
```java
// Import classes:
//import io.swagger.client.api.CarrierApi;

CarrierApi apiInstance = new CarrierApi();
Integer page = 1; // Integer | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
Integer pageSize = 10; // Integer | The count of objects to return per page.
try {
    String result = apiInstance.carrierLookuplist(page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CarrierApi#carrierLookuplist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pageSize** | **Integer**| The count of objects to return per page. | [optional] [default to 10]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

