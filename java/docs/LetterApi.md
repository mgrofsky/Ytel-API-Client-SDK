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
> String letterCreate(to, from, attachbyid, file, color, description, extraservice, doublesided, template, htmldata)

Create Letter

Create, print, and mail a letter to an address. The letter file must be supplied as a PDF or an HTML string.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LetterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

LetterApi apiInstance = new LetterApi();
String to = "to_example"; // String | The AddressId or an object structured when creating an address by addresses/Create.
String from = "from_example"; // String | The AddressId or an object structured when creating an address by addresses/Create.
String attachbyid = "attachbyid_example"; // String | Set an existing letter by attaching its LetterId.
String file = "file_example"; // String | File can be a 8.5\"x11\" PDF uploaded file or URL that links to a file.
String color = "color_example"; // String | Specify if letter should be printed in color.
String description = "description_example"; // String | A description for the letter.
String extraservice = "extraservice_example"; // String | Add an extra service to your letter. Options are \"certified\" or \"registered\". Certified provides tracking and delivery confirmation for domestic destinations and is an additional $5.00. Registered provides tracking and confirmation for international addresses and is an additional $16.50.
String doublesided = "doublesided_example"; // String | Specify if letter should be printed on both sides.
String template = "template_example"; // String | Boolean that defaults to true. When set to false, this specifies that your letter does not follow the m360 address template. In this case, a blank address page will be inserted at the beginning of your file and you will be charged for the extra page.
String htmldata = "htmldata_example"; // String | A string value that contains HTML markup.
try {
    String result = apiInstance.letterCreate(to, from, attachbyid, file, color, description, extraservice, doublesided, template, htmldata);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LetterApi#letterCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **to** | **String**| The AddressId or an object structured when creating an address by addresses/Create. |
 **from** | **String**| The AddressId or an object structured when creating an address by addresses/Create. |
 **attachbyid** | **String**| Set an existing letter by attaching its LetterId. |
 **file** | **String**| File can be a 8.5\&quot;x11\&quot; PDF uploaded file or URL that links to a file. |
 **color** | **String**| Specify if letter should be printed in color. |
 **description** | **String**| A description for the letter. | [optional]
 **extraservice** | **String**| Add an extra service to your letter. Options are \&quot;certified\&quot; or \&quot;registered\&quot;. Certified provides tracking and delivery confirmation for domestic destinations and is an additional $5.00. Registered provides tracking and confirmation for international addresses and is an additional $16.50. | [optional]
 **doublesided** | **String**| Specify if letter should be printed on both sides. | [optional]
 **template** | **String**| Boolean that defaults to true. When set to false, this specifies that your letter does not follow the m360 address template. In this case, a blank address page will be inserted at the beginning of your file and you will be charged for the extra page. | [optional]
 **htmldata** | **String**| A string value that contains HTML markup. | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="letterDelete"></a>
# **letterDelete**
> String letterDelete(lettersid)

Delete Letter

Remove a letter object by its LetterId.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LetterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

LetterApi apiInstance = new LetterApi();
String lettersid = "lettersid_example"; // String | The unique identifier for a letter object.
try {
    String result = apiInstance.letterDelete(lettersid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LetterApi#letterDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lettersid** | **String**| The unique identifier for a letter object. |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="letterListsletter"></a>
# **letterListsletter**
> String letterListsletter(page, pagesize, lettersid, dateCreated)

List Letters

Retrieve a list of letter objects. The letter objects are sorted by creation date, with the most recently created letters appearing first.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LetterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

LetterApi apiInstance = new LetterApi();
Integer page = 1; // Integer | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
Integer pagesize = 10; // Integer | The count of objects to return per page.
String lettersid = "lettersid_example"; // String | The unique identifier for a letter object.
String dateCreated = "dateCreated_example"; // String | The date the letter was created.
try {
    String result = apiInstance.letterListsletter(page, pagesize, lettersid, dateCreated);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LetterApi#letterListsletter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **Integer**| The count of objects to return per page. | [optional] [default to 10]
 **lettersid** | **String**| The unique identifier for a letter object. | [optional]
 **dateCreated** | **String**| The date the letter was created. | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="letterViewletter"></a>
# **letterViewletter**
> String letterViewletter(lettersid)

View Letter

Retrieve a letter object by its LetterSid.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LetterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

LetterApi apiInstance = new LetterApi();
String lettersid = "lettersid_example"; // String | The unique identifier for a letter object.
try {
    String result = apiInstance.letterViewletter(lettersid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LetterApi#letterViewletter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lettersid** | **String**| The unique identifier for a letter object. |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

