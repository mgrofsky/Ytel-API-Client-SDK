# AreaMailApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**areamailCreate**](AreaMailApi.md#areamailCreate) | **POST** /areamail/create.json | Create AreaMail
[**areamailDelete**](AreaMailApi.md#areamailDelete) | **POST** /areamail/delete.json | Delete AreaMail
[**areamailLists**](AreaMailApi.md#areamailLists) | **POST** /areamail/lists.json | List AreaMails
[**areamailView**](AreaMailApi.md#areamailView) | **POST** /areamail/view.json | View AreaMail


<a name="areamailCreate"></a>
# **areamailCreate**
> kotlin.String areamailCreate(routes, attachbyid, front, back, description, targettype, htmldata)

Create AreaMail

Create a new AreaMail object.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = AreaMailApi()
val routes : kotlin.String = routes_example // kotlin.String | List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route.List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route. A carrier route is in the form of 92610-C043 where the carrier route is composed of 5 numbers for zipcode, 1 letter for carrier route type, and 3 numbers for carrier route code. Delivery can be sent to mutliple routes by separating them with a commas. Valid Values: 92656, 92610-C043
val attachbyid : kotlin.String = attachbyid_example // kotlin.String | Set an existing areamail by attaching its AreamailId.
val front : kotlin.String = front_example // kotlin.String | The front of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. Back required
val back : kotlin.String = back_example // kotlin.String | The back of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG.
val description : kotlin.String = description_example // kotlin.String | A string value to use as a description for this AreaMail item.
val targettype : kotlin.String = targettype_example // kotlin.String | The delivery location type.
val htmldata : kotlin.String = htmldata_example // kotlin.String | A string value that contains HTML markup.
try {
    val result : kotlin.String = apiInstance.areamailCreate(routes, attachbyid, front, back, description, targettype, htmldata)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AreaMailApi#areamailCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AreaMailApi#areamailCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routes** | **kotlin.String**| List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route.List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route. A carrier route is in the form of 92610-C043 where the carrier route is composed of 5 numbers for zipcode, 1 letter for carrier route type, and 3 numbers for carrier route code. Delivery can be sent to mutliple routes by separating them with a commas. Valid Values: 92656, 92610-C043 |
 **attachbyid** | **kotlin.String**| Set an existing areamail by attaching its AreamailId. |
 **front** | **kotlin.String**| The front of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. Back required |
 **back** | **kotlin.String**| The back of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. |
 **description** | **kotlin.String**| A string value to use as a description for this AreaMail item. | [optional]
 **targettype** | **kotlin.String**| The delivery location type. | [optional]
 **htmldata** | **kotlin.String**| A string value that contains HTML markup. | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="areamailDelete"></a>
# **areamailDelete**
> kotlin.String areamailDelete(areamailid)

Delete AreaMail

Remove an AreaMail object by its AreaMailId.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = AreaMailApi()
val areamailid : kotlin.String = areamailid_example // kotlin.String | The unique identifier for an AreaMail object.
try {
    val result : kotlin.String = apiInstance.areamailDelete(areamailid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AreaMailApi#areamailDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AreaMailApi#areamailDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **areamailid** | **kotlin.String**| The unique identifier for an AreaMail object. |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="areamailLists"></a>
# **areamailLists**
> kotlin.String areamailLists(page, pagesize, areamailsid, dateCreated)

List AreaMails

Retrieve a list of AreaMail objects.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = AreaMailApi()
val page : kotlin.Int = 56 // kotlin.Int | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
val pagesize : kotlin.Int = 56 // kotlin.Int | The count of objects to return per page.
val areamailsid : kotlin.String = areamailsid_example // kotlin.String | The unique identifier for an AreaMail object.
val dateCreated : kotlin.String = dateCreated_example // kotlin.String | The date the AreaMail was created.
try {
    val result : kotlin.String = apiInstance.areamailLists(page, pagesize, areamailsid, dateCreated)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AreaMailApi#areamailLists")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AreaMailApi#areamailLists")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **kotlin.Int**| The count of objects to return per page. | [optional] [default to 10]
 **areamailsid** | **kotlin.String**| The unique identifier for an AreaMail object. | [optional]
 **dateCreated** | **kotlin.String**| The date the AreaMail was created. | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="areamailView"></a>
# **areamailView**
> kotlin.String areamailView(areamailid)

View AreaMail

Retrieve an AreaMail object by its AreaMailId.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = AreaMailApi()
val areamailid : kotlin.String = areamailid_example // kotlin.String | The unique identifier for an AreaMail object.
try {
    val result : kotlin.String = apiInstance.areamailView(areamailid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AreaMailApi#areamailView")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AreaMailApi#areamailView")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **areamailid** | **kotlin.String**| The unique identifier for an AreaMail object. |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

