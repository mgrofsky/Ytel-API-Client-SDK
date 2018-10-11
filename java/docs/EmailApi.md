# EmailApi

All URIs are relative to *https://api.ytel.com/api/v3*

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
> String emailAddunsubscribesemail(email)

Add Email Unsubscribe

Add an email to the unsubscribe list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

EmailApi apiInstance = new EmailApi();
String email = "email_example"; // String | A valid email address that is to be added to the unsubscribe list
try {
    String result = apiInstance.emailAddunsubscribesemail(email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailApi#emailAddunsubscribesemail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| A valid email address that is to be added to the unsubscribe list |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="emailDeleteblocksemail"></a>
# **emailDeleteblocksemail**
> String emailDeleteblocksemail(email)

Remove Blocked Address

Remove an email from blocked emails list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

EmailApi apiInstance = new EmailApi();
String email = "email_example"; // String | The email address to be remove from the blocked list.
try {
    String result = apiInstance.emailDeleteblocksemail(email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailApi#emailDeleteblocksemail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| The email address to be remove from the blocked list. |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="emailDeletebouncesemail"></a>
# **emailDeletebouncesemail**
> String emailDeletebouncesemail(email)

Remove Bounced Email

Remove an email address from the bounced list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

EmailApi apiInstance = new EmailApi();
String email = "email_example"; // String | The email address to be remove from the bounced email list.
try {
    String result = apiInstance.emailDeletebouncesemail(email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailApi#emailDeletebouncesemail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| The email address to be remove from the bounced email list. |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="emailDeleteinvalidemail"></a>
# **emailDeleteinvalidemail**
> String emailDeleteinvalidemail(email)

Remove Invalid Email

Remove an email from the invalid email list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

EmailApi apiInstance = new EmailApi();
String email = "email_example"; // String | A valid email address that is to be remove from the invalid email list.
try {
    String result = apiInstance.emailDeleteinvalidemail(email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailApi#emailDeleteinvalidemail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| A valid email address that is to be remove from the invalid email list. |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="emailDeletespamemail"></a>
# **emailDeletespamemail**
> String emailDeletespamemail(email)

Remove Spam Address

Remove an email from the spam email list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

EmailApi apiInstance = new EmailApi();
String email = "email_example"; // String | A valid email address that is to be remove from the spam list.
try {
    String result = apiInstance.emailDeletespamemail(email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailApi#emailDeletespamemail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| A valid email address that is to be remove from the spam list. |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="emailDeleteunsubscribedemail"></a>
# **emailDeleteunsubscribedemail**
> String emailDeleteunsubscribedemail(email)

Remove Unsubscribed Email

Remove an email address from the list of unsubscribed emails.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

EmailApi apiInstance = new EmailApi();
String email = "email_example"; // String | A valid email address that is to be remove from the unsubscribe list.
try {
    String result = apiInstance.emailDeleteunsubscribedemail(email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailApi#emailDeleteunsubscribedemail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| A valid email address that is to be remove from the unsubscribe list. |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="emailListblockemail"></a>
# **emailListblockemail**
> String emailListblockemail(offset, limit)

Blocked Emails

Retrieve a list of emails that have been blocked.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

EmailApi apiInstance = new EmailApi();
String offset = "offset_example"; // String | The starting point of the list of blocked emails that should be returned.
String limit = "limit_example"; // String | The count of results that should be returned.
try {
    String result = apiInstance.emailListblockemail(offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailApi#emailListblockemail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **String**| The starting point of the list of blocked emails that should be returned. | [optional]
 **limit** | **String**| The count of results that should be returned. | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="emailListbounceemail"></a>
# **emailListbounceemail**
> String emailListbounceemail(offset, limit)

Bounced Emails

Retrieve a list of emails that have bounced.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

EmailApi apiInstance = new EmailApi();
String offset = "offset_example"; // String | The starting point of the list of bounced emails that should be returned.
String limit = "limit_example"; // String | The count of results that should be returned.
try {
    String result = apiInstance.emailListbounceemail(offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailApi#emailListbounceemail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **String**| The starting point of the list of bounced emails that should be returned. | [optional]
 **limit** | **String**| The count of results that should be returned. | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="emailListinvalidemail"></a>
# **emailListinvalidemail**
> String emailListinvalidemail(offset, limit)

Invalid Emails

Retrieve a list of invalid email addresses.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

EmailApi apiInstance = new EmailApi();
String offset = "offset_example"; // String | The starting point of the list of invalid emails that should be returned.
String limit = "limit_example"; // String | The count of results that should be returned.
try {
    String result = apiInstance.emailListinvalidemail(offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailApi#emailListinvalidemail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **String**| The starting point of the list of invalid emails that should be returned. | [optional]
 **limit** | **String**| The count of results that should be returned. | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="emailListspamemail"></a>
# **emailListspamemail**
> String emailListspamemail(offset, limit)

Spam Emails

Retrieve a list of emails that are on the spam list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

EmailApi apiInstance = new EmailApi();
String offset = "offset_example"; // String | The starting point of the list of spam emails that should be returned.
String limit = "limit_example"; // String | The count of results that should be returned.
try {
    String result = apiInstance.emailListspamemail(offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailApi#emailListspamemail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **String**| The starting point of the list of spam emails that should be returned. | [optional]
 **limit** | **String**| The count of results that should be returned. | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="emailListunsubscribedemail"></a>
# **emailListunsubscribedemail**
> String emailListunsubscribedemail(offset, limit)

List Unsubscribed Emails

Retrieve a list of email addresses from the unsubscribe list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

EmailApi apiInstance = new EmailApi();
String offset = "offset_example"; // String | The starting point of the list of unsubscribed emails that should be returned.
String limit = "limit_example"; // String | The count of results that should be returned.
try {
    String result = apiInstance.emailListunsubscribedemail(offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailApi#emailListunsubscribedemail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **String**| The starting point of the list of unsubscribed emails that should be returned. | [optional]
 **limit** | **String**| The count of results that should be returned. | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="emailSendemails"></a>
# **emailSendemails**
> String emailSendemails(to, type, subject, message, from, cc, bcc, attachment)

Send Email

Create and submit an email message to one or more email addresses.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

EmailApi apiInstance = new EmailApi();
String to = "to_example"; // String | A valid address that will receive the email. Multiple addresses can be separated by using commas.
String type = "type_example"; // String | Specifies the type of email to be sent
String subject = "subject_example"; // String | The subject of the mail. Must be a valid string.
String message = "message_example"; // String | The email message that is to be sent in the text.
String from = "from_example"; // String | A valid address that will send the email.
String cc = "cc_example"; // String | Carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas.
String bcc = "bcc_example"; // String | Blind carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas.
String attachment = "attachment_example"; // String | A file that is attached to the email. Must be less than 7 MB in size.
try {
    String result = apiInstance.emailSendemails(to, type, subject, message, from, cc, bcc, attachment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailApi#emailSendemails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **to** | **String**| A valid address that will receive the email. Multiple addresses can be separated by using commas. |
 **type** | **String**| Specifies the type of email to be sent | [enum: text, html]
 **subject** | **String**| The subject of the mail. Must be a valid string. |
 **message** | **String**| The email message that is to be sent in the text. |
 **from** | **String**| A valid address that will send the email. | [optional]
 **cc** | **String**| Carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas. | [optional]
 **bcc** | **String**| Blind carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas. | [optional]
 **attachment** | **String**| A file that is attached to the email. Must be less than 7 MB in size. | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

