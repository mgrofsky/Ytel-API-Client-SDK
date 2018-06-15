# LetterApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**letterCreate**](LetterApi.md#letterCreate) | **POST** /letter/create.json | Create Letter
[**letterDelete**](LetterApi.md#letterDelete) | **POST** /letter/delete.json | Delete Letter
[**letterListsletter**](LetterApi.md#letterListsletter) | **POST** /letter/listsletter.json | List Letters
[**letterViewletter**](LetterApi.md#letterViewletter) | **POST** /letter/viewletter.json | View Letter


<a name="letterCreate"></a>
# **letterCreate**
> kotlin.String letterCreate(to, from, attachbyid, file, color, description, extraservice, doublesided, template, htmldata)

Create Letter

Create, print, and mail a letter to an address. The letter file must be supplied as a PDF or an HTML string.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = LetterApi()
val to : kotlin.String = to_example // kotlin.String | The AddressId or an object structured when creating an address by addresses/Create.
val from : kotlin.String = from_example // kotlin.String | The AddressId or an object structured when creating an address by addresses/Create.
val attachbyid : kotlin.String = attachbyid_example // kotlin.String | Set an existing letter by attaching its LetterId.
val file : kotlin.String = file_example // kotlin.String | File can be a 8.5\"x11\" PDF uploaded file or URL that links to a file.
val color : kotlin.String = color_example // kotlin.String | Specify if letter should be printed in color.
val description : kotlin.String = description_example // kotlin.String | A description for the letter.
val extraservice : kotlin.String = extraservice_example // kotlin.String | Add an extra service to your letter. Options are \"certified\" or \"registered\". Certified provides tracking and delivery confirmation for domestic destinations and is an additional $5.00. Registered provides tracking and confirmation for international addresses and is an additional $16.50.
val doublesided : kotlin.String = doublesided_example // kotlin.String | Specify if letter should be printed on both sides.
val template : kotlin.String = template_example // kotlin.String | Boolean that defaults to true. When set to false, this specifies that your letter does not follow the m360 address template. In this case, a blank address page will be inserted at the beginning of your file and you will be charged for the extra page.
val htmldata : kotlin.String = htmldata_example // kotlin.String | A string value that contains HTML markup.
try {
    val result : kotlin.String = apiInstance.letterCreate(to, from, attachbyid, file, color, description, extraservice, doublesided, template, htmldata)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LetterApi#letterCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LetterApi#letterCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **to** | **kotlin.String**| The AddressId or an object structured when creating an address by addresses/Create. |
 **from** | **kotlin.String**| The AddressId or an object structured when creating an address by addresses/Create. |
 **attachbyid** | **kotlin.String**| Set an existing letter by attaching its LetterId. |
 **file** | **kotlin.String**| File can be a 8.5\&quot;x11\&quot; PDF uploaded file or URL that links to a file. |
 **color** | **kotlin.String**| Specify if letter should be printed in color. |
 **description** | **kotlin.String**| A description for the letter. | [optional]
 **extraservice** | **kotlin.String**| Add an extra service to your letter. Options are \&quot;certified\&quot; or \&quot;registered\&quot;. Certified provides tracking and delivery confirmation for domestic destinations and is an additional $5.00. Registered provides tracking and confirmation for international addresses and is an additional $16.50. | [optional]
 **doublesided** | **kotlin.String**| Specify if letter should be printed on both sides. | [optional]
 **template** | **kotlin.String**| Boolean that defaults to true. When set to false, this specifies that your letter does not follow the m360 address template. In this case, a blank address page will be inserted at the beginning of your file and you will be charged for the extra page. | [optional]
 **htmldata** | **kotlin.String**| A string value that contains HTML markup. | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="letterDelete"></a>
# **letterDelete**
> kotlin.String letterDelete(lettersid)

Delete Letter

Remove a letter object by its LetterId.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = LetterApi()
val lettersid : kotlin.String = lettersid_example // kotlin.String | The unique identifier for a letter object.
try {
    val result : kotlin.String = apiInstance.letterDelete(lettersid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LetterApi#letterDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LetterApi#letterDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lettersid** | **kotlin.String**| The unique identifier for a letter object. |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="letterListsletter"></a>
# **letterListsletter**
> kotlin.String letterListsletter(page, pagesize, lettersid, dateCreated)

List Letters

Retrieve a list of letter objects. The letter objects are sorted by creation date, with the most recently created letters appearing first.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = LetterApi()
val page : kotlin.Int = 56 // kotlin.Int | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
val pagesize : kotlin.Int = 56 // kotlin.Int | The count of objects to return per page.
val lettersid : kotlin.String = lettersid_example // kotlin.String | The unique identifier for a letter object.
val dateCreated : kotlin.String = dateCreated_example // kotlin.String | The date the letter was created.
try {
    val result : kotlin.String = apiInstance.letterListsletter(page, pagesize, lettersid, dateCreated)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LetterApi#letterListsletter")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LetterApi#letterListsletter")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **kotlin.Int**| The count of objects to return per page. | [optional] [default to 10]
 **lettersid** | **kotlin.String**| The unique identifier for a letter object. | [optional]
 **dateCreated** | **kotlin.String**| The date the letter was created. | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="letterViewletter"></a>
# **letterViewletter**
> kotlin.String letterViewletter(lettersid)

View Letter

Retrieve a letter object by its LetterSid.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = LetterApi()
val lettersid : kotlin.String = lettersid_example // kotlin.String | The unique identifier for a letter object.
try {
    val result : kotlin.String = apiInstance.letterViewletter(lettersid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LetterApi#letterViewletter")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LetterApi#letterViewletter")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lettersid** | **kotlin.String**| The unique identifier for a letter object. |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

