# EmailApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**emailAddunsubscribesemail**](EmailApi.md#emailAddunsubscribesemail) | **POST** /email/addunsubscribesemail.json | Add Email Unsubscribe
[**emailDeleteblocksemail**](EmailApi.md#emailDeleteblocksemail) | **POST** /email/deleteblocksemail.json | Remove Blocked Address
[**emailDeletebouncesemail**](EmailApi.md#emailDeletebouncesemail) | **POST** /email/deletebouncesemail.json | Remove Bounced Email
[**emailDeleteinvalidemail**](EmailApi.md#emailDeleteinvalidemail) | **POST** /email/deleteinvalidemail.json | Remove Invalid Email
[**emailDeletespamemail**](EmailApi.md#emailDeletespamemail) | **POST** /email/deletespamemail.json | Remove Spam Address
[**emailDeleteunsubscribedemail**](EmailApi.md#emailDeleteunsubscribedemail) | **POST** /email/deleteunsubscribedemail.json | Remove Unsubscribed Email
[**emailListblockemail**](EmailApi.md#emailListblockemail) | **POST** /email/listblockemail.json | Blocked Emails
[**emailListbounceemail**](EmailApi.md#emailListbounceemail) | **POST** /email/listbounceemail.json | Bounced Emails
[**emailListinvalidemail**](EmailApi.md#emailListinvalidemail) | **POST** /email/listinvalidemail.json | Invalid Emails
[**emailListspamemail**](EmailApi.md#emailListspamemail) | **POST** /email/listspamemail.json | Spam Emails
[**emailListunsubscribedemail**](EmailApi.md#emailListunsubscribedemail) | **POST** /email/listunsubscribedemail.json | List Unsubscribed Emails
[**emailSendemails**](EmailApi.md#emailSendemails) | **POST** /email/sendemails.json | Send Email


<a name="emailAddunsubscribesemail"></a>
# **emailAddunsubscribesemail**
> kotlin.String emailAddunsubscribesemail(email)

Add Email Unsubscribe

Add an email to the unsubscribe list

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = EmailApi()
val email : kotlin.String = email_example // kotlin.String | A valid email address that is to be added to the unsubscribe list
try {
    val result : kotlin.String = apiInstance.emailAddunsubscribesemail(email)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailApi#emailAddunsubscribesemail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailApi#emailAddunsubscribesemail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **kotlin.String**| A valid email address that is to be added to the unsubscribe list |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="emailDeleteblocksemail"></a>
# **emailDeleteblocksemail**
> kotlin.String emailDeleteblocksemail(email)

Remove Blocked Address

Remove an email from blocked emails list.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = EmailApi()
val email : kotlin.String = email_example // kotlin.String | The email address to be remove from the blocked list.
try {
    val result : kotlin.String = apiInstance.emailDeleteblocksemail(email)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailApi#emailDeleteblocksemail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailApi#emailDeleteblocksemail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **kotlin.String**| The email address to be remove from the blocked list. |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="emailDeletebouncesemail"></a>
# **emailDeletebouncesemail**
> kotlin.String emailDeletebouncesemail(email)

Remove Bounced Email

Remove an email address from the bounced list.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = EmailApi()
val email : kotlin.String = email_example // kotlin.String | The email address to be remove from the bounced email list.
try {
    val result : kotlin.String = apiInstance.emailDeletebouncesemail(email)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailApi#emailDeletebouncesemail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailApi#emailDeletebouncesemail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **kotlin.String**| The email address to be remove from the bounced email list. |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="emailDeleteinvalidemail"></a>
# **emailDeleteinvalidemail**
> kotlin.String emailDeleteinvalidemail(email)

Remove Invalid Email

Remove an email from the invalid email list.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = EmailApi()
val email : kotlin.String = email_example // kotlin.String | A valid email address that is to be remove from the invalid email list.
try {
    val result : kotlin.String = apiInstance.emailDeleteinvalidemail(email)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailApi#emailDeleteinvalidemail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailApi#emailDeleteinvalidemail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **kotlin.String**| A valid email address that is to be remove from the invalid email list. |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="emailDeletespamemail"></a>
# **emailDeletespamemail**
> kotlin.String emailDeletespamemail(email)

Remove Spam Address

Remove an email from the spam email list.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = EmailApi()
val email : kotlin.String = email_example // kotlin.String | A valid email address that is to be remove from the spam list.
try {
    val result : kotlin.String = apiInstance.emailDeletespamemail(email)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailApi#emailDeletespamemail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailApi#emailDeletespamemail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **kotlin.String**| A valid email address that is to be remove from the spam list. |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="emailDeleteunsubscribedemail"></a>
# **emailDeleteunsubscribedemail**
> kotlin.String emailDeleteunsubscribedemail(email)

Remove Unsubscribed Email

Remove an email address from the list of unsubscribed emails.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = EmailApi()
val email : kotlin.String = email_example // kotlin.String | A valid email address that is to be remove from the unsubscribe list.
try {
    val result : kotlin.String = apiInstance.emailDeleteunsubscribedemail(email)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailApi#emailDeleteunsubscribedemail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailApi#emailDeleteunsubscribedemail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **kotlin.String**| A valid email address that is to be remove from the unsubscribe list. |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="emailListblockemail"></a>
# **emailListblockemail**
> kotlin.String emailListblockemail(offset, limit)

Blocked Emails

Retrieve a list of emails that have been blocked.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = EmailApi()
val offset : kotlin.String = offset_example // kotlin.String | The starting point of the list of blocked emails that should be returned.
val limit : kotlin.String = limit_example // kotlin.String | The count of results that should be returned.
try {
    val result : kotlin.String = apiInstance.emailListblockemail(offset, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailApi#emailListblockemail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailApi#emailListblockemail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **kotlin.String**| The starting point of the list of blocked emails that should be returned. | [optional]
 **limit** | **kotlin.String**| The count of results that should be returned. | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="emailListbounceemail"></a>
# **emailListbounceemail**
> kotlin.String emailListbounceemail(offset, limit)

Bounced Emails

Retrieve a list of emails that have bounced.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = EmailApi()
val offset : kotlin.String = offset_example // kotlin.String | The starting point of the list of bounced emails that should be returned.
val limit : kotlin.String = limit_example // kotlin.String | The count of results that should be returned.
try {
    val result : kotlin.String = apiInstance.emailListbounceemail(offset, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailApi#emailListbounceemail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailApi#emailListbounceemail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **kotlin.String**| The starting point of the list of bounced emails that should be returned. | [optional]
 **limit** | **kotlin.String**| The count of results that should be returned. | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="emailListinvalidemail"></a>
# **emailListinvalidemail**
> kotlin.String emailListinvalidemail(offset, limit)

Invalid Emails

Retrieve a list of invalid email addresses.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = EmailApi()
val offset : kotlin.String = offset_example // kotlin.String | The starting point of the list of invalid emails that should be returned.
val limit : kotlin.String = limit_example // kotlin.String | The count of results that should be returned.
try {
    val result : kotlin.String = apiInstance.emailListinvalidemail(offset, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailApi#emailListinvalidemail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailApi#emailListinvalidemail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **kotlin.String**| The starting point of the list of invalid emails that should be returned. | [optional]
 **limit** | **kotlin.String**| The count of results that should be returned. | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="emailListspamemail"></a>
# **emailListspamemail**
> kotlin.String emailListspamemail(offset, limit)

Spam Emails

Retrieve a list of emails that are on the spam list.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = EmailApi()
val offset : kotlin.String = offset_example // kotlin.String | The starting point of the list of spam emails that should be returned.
val limit : kotlin.String = limit_example // kotlin.String | The count of results that should be returned.
try {
    val result : kotlin.String = apiInstance.emailListspamemail(offset, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailApi#emailListspamemail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailApi#emailListspamemail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **kotlin.String**| The starting point of the list of spam emails that should be returned. | [optional]
 **limit** | **kotlin.String**| The count of results that should be returned. | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="emailListunsubscribedemail"></a>
# **emailListunsubscribedemail**
> kotlin.String emailListunsubscribedemail(offset, limit)

List Unsubscribed Emails

Retrieve a list of email addresses from the unsubscribe list.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = EmailApi()
val offset : kotlin.String = offset_example // kotlin.String | The starting point of the list of unsubscribed emails that should be returned.
val limit : kotlin.String = limit_example // kotlin.String | The count of results that should be returned.
try {
    val result : kotlin.String = apiInstance.emailListunsubscribedemail(offset, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailApi#emailListunsubscribedemail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailApi#emailListunsubscribedemail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **kotlin.String**| The starting point of the list of unsubscribed emails that should be returned. | [optional]
 **limit** | **kotlin.String**| The count of results that should be returned. | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="emailSendemails"></a>
# **emailSendemails**
> kotlin.String emailSendemails(to, type, subject, message, from, cc, bcc, attachment)

Send Email

Create and submit an email message to one or more email addresses.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = EmailApi()
val to : kotlin.String = to_example // kotlin.String | A valid address that will receive the email. Multiple addresses can be separated by using commas.
val type : kotlin.String = type_example // kotlin.String | Specifies the type of email to be sent
val subject : kotlin.String = subject_example // kotlin.String | The subject of the mail. Must be a valid string.
val message : kotlin.String = message_example // kotlin.String | The email message that is to be sent in the text.
val from : kotlin.String = from_example // kotlin.String | A valid address that will send the email.
val cc : kotlin.String = cc_example // kotlin.String | Carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas.
val bcc : kotlin.String = bcc_example // kotlin.String | Blind carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas.
val attachment : kotlin.String = attachment_example // kotlin.String | A file that is attached to the email. Must be less than 7 MB in size.
try {
    val result : kotlin.String = apiInstance.emailSendemails(to, type, subject, message, from, cc, bcc, attachment)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailApi#emailSendemails")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailApi#emailSendemails")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **to** | **kotlin.String**| A valid address that will receive the email. Multiple addresses can be separated by using commas. |
 **type** | **kotlin.String**| Specifies the type of email to be sent | [enum: text, html]
 **subject** | **kotlin.String**| The subject of the mail. Must be a valid string. |
 **message** | **kotlin.String**| The email message that is to be sent in the text. |
 **from** | **kotlin.String**| A valid address that will send the email. | [optional]
 **cc** | **kotlin.String**| Carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas. | [optional]
 **bcc** | **kotlin.String**| Blind carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas. | [optional]
 **attachment** | **kotlin.String**| A file that is attached to the email. Must be less than 7 MB in size. | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

