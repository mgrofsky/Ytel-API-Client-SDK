# PostCardApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postcardCreatepostcard**](PostCardApi.md#postcardCreatepostcard) | **POST** /Postcard/createpostcard.json | Create Postcard
[**postcardDeletepostcard**](PostCardApi.md#postcardDeletepostcard) | **POST** /Postcard/deletepostcard.json | Delete Postcard
[**postcardListpostcard**](PostCardApi.md#postcardListpostcard) | **POST** /Postcard/listpostcard.json | List Postcards
[**postcardViewpostcard**](PostCardApi.md#postcardViewpostcard) | **POST** /Postcard/viewpostcard.json | View Postcard


<a name="postcardCreatepostcard"></a>
# **postcardCreatepostcard**
> kotlin.String postcardCreatepostcard(to, from, attachbyid, front, back, message, setting, description, htmldata)

Create Postcard

Create, print, and mail a postcard to an address. The postcard front must be supplied as a PDF, image, or an HTML string. The back can be a PDF, image, HTML string, or it can be automatically generated by supplying a custom message.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PostCardApi()
val to : kotlin.String = to_example // kotlin.String | The AddressId or an object structured when creating an address by addresses/Create.
val from : kotlin.String = from_example // kotlin.String | The AddressId or an object structured when creating an address by addresses/Create.
val attachbyid : kotlin.String = attachbyid_example // kotlin.String | Set an existing postcard by attaching its PostcardId.
val front : kotlin.String = front_example // kotlin.String | A 4.25\"x6.25\" or 6.25\"x11.25\" image to use as the front of the postcard.  This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG.
val back : kotlin.String = back_example // kotlin.String | A 4.25\"x6.25\" or 6.25\"x11.25\" image to use as the back of the postcard, supplied as a URL, local file, or HTML string.  This allows you to customize your back design, but we will still insert the recipient address for you.
val message : kotlin.String = message_example // kotlin.String | The message for the back of the postcard with a maximum of 350 characters.
val setting : kotlin.String = setting_example // kotlin.String | Code for the dimensions of the media to be printed.
val description : kotlin.String = description_example // kotlin.String | A description for the postcard.
val htmldata : kotlin.String = htmldata_example // kotlin.String | A string value that contains HTML markup.
try {
    val result : kotlin.String = apiInstance.postcardCreatepostcard(to, from, attachbyid, front, back, message, setting, description, htmldata)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PostCardApi#postcardCreatepostcard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PostCardApi#postcardCreatepostcard")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **to** | **kotlin.String**| The AddressId or an object structured when creating an address by addresses/Create. |
 **from** | **kotlin.String**| The AddressId or an object structured when creating an address by addresses/Create. |
 **attachbyid** | **kotlin.String**| Set an existing postcard by attaching its PostcardId. |
 **front** | **kotlin.String**| A 4.25\&quot;x6.25\&quot; or 6.25\&quot;x11.25\&quot; image to use as the front of the postcard.  This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. |
 **back** | **kotlin.String**| A 4.25\&quot;x6.25\&quot; or 6.25\&quot;x11.25\&quot; image to use as the back of the postcard, supplied as a URL, local file, or HTML string.  This allows you to customize your back design, but we will still insert the recipient address for you. |
 **message** | **kotlin.String**| The message for the back of the postcard with a maximum of 350 characters. |
 **setting** | **kotlin.String**| Code for the dimensions of the media to be printed. |
 **description** | **kotlin.String**| A description for the postcard. | [optional]
 **htmldata** | **kotlin.String**| A string value that contains HTML markup. | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="postcardDeletepostcard"></a>
# **postcardDeletepostcard**
> kotlin.String postcardDeletepostcard(postcardid)

Delete Postcard

Remove a postcard object.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PostCardApi()
val postcardid : kotlin.String = postcardid_example // kotlin.String | The unique identifier of a postcard object.
try {
    val result : kotlin.String = apiInstance.postcardDeletepostcard(postcardid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PostCardApi#postcardDeletepostcard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PostCardApi#postcardDeletepostcard")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postcardid** | **kotlin.String**| The unique identifier of a postcard object. |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="postcardListpostcard"></a>
# **postcardListpostcard**
> kotlin.String postcardListpostcard(page, pagesize, postcardid, dateCreated)

List Postcards

Retrieve a list of postcard objects. The postcards objects are sorted by creation date, with the most recently created postcards appearing first.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PostCardApi()
val page : kotlin.Int = 56 // kotlin.Int | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
val pagesize : kotlin.Int = 56 // kotlin.Int | The count of objects to return per page.
val postcardid : kotlin.String = postcardid_example // kotlin.String | The unique identifier for a postcard object.
val dateCreated : kotlin.String = dateCreated_example // kotlin.String | The date the postcard was created.
try {
    val result : kotlin.String = apiInstance.postcardListpostcard(page, pagesize, postcardid, dateCreated)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PostCardApi#postcardListpostcard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PostCardApi#postcardListpostcard")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **kotlin.Int**| The count of objects to return per page. | [optional] [default to 10]
 **postcardid** | **kotlin.String**| The unique identifier for a postcard object. | [optional]
 **dateCreated** | **kotlin.String**| The date the postcard was created. | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="postcardViewpostcard"></a>
# **postcardViewpostcard**
> kotlin.String postcardViewpostcard(postcardid)

View Postcard

Retrieve a postcard object by its PostcardId.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PostCardApi()
val postcardid : kotlin.String = postcardid_example // kotlin.String | The unique identifier for a postcard object.
try {
    val result : kotlin.String = apiInstance.postcardViewpostcard(postcardid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PostCardApi#postcardViewpostcard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PostCardApi#postcardViewpostcard")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postcardid** | **kotlin.String**| The unique identifier for a postcard object. |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json
