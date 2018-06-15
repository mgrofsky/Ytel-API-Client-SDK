# AreaMailApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**areamailCreate**](AreaMailApi.md#areamailCreate) | **POST** /areamail/create.json | Create AreaMail
[**areamailDelete**](AreaMailApi.md#areamailDelete) | **POST** /areamail/delete.json | Delete AreaMail
[**areamailLists**](AreaMailApi.md#areamailLists) | **POST** /areamail/lists.json | List AreaMails
[**areamailView**](AreaMailApi.md#areamailView) | **POST** /areamail/view.json | View AreaMail


<a name="areamailCreate"></a>
# **areamailCreate**
> String areamailCreate(routes, attachbyid, front, back, description, targettype, htmldata)

Create AreaMail

Create a new AreaMail object.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AreaMailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

AreaMailApi apiInstance = new AreaMailApi();
String routes = "routes_example"; // String | List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route.List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route. A carrier route is in the form of 92610-C043 where the carrier route is composed of 5 numbers for zipcode, 1 letter for carrier route type, and 3 numbers for carrier route code. Delivery can be sent to mutliple routes by separating them with a commas. Valid Values: 92656, 92610-C043
String attachbyid = "attachbyid_example"; // String | Set an existing areamail by attaching its AreamailId.
String front = "front_example"; // String | The front of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. Back required
String back = "back_example"; // String | The back of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG.
String description = "description_example"; // String | A string value to use as a description for this AreaMail item.
String targettype = "targettype_example"; // String | The delivery location type.
String htmldata = "htmldata_example"; // String | A string value that contains HTML markup.
try {
    String result = apiInstance.areamailCreate(routes, attachbyid, front, back, description, targettype, htmldata);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AreaMailApi#areamailCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routes** | **String**| List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route.List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route. A carrier route is in the form of 92610-C043 where the carrier route is composed of 5 numbers for zipcode, 1 letter for carrier route type, and 3 numbers for carrier route code. Delivery can be sent to mutliple routes by separating them with a commas. Valid Values: 92656, 92610-C043 |
 **attachbyid** | **String**| Set an existing areamail by attaching its AreamailId. |
 **front** | **String**| The front of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. Back required |
 **back** | **String**| The back of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. |
 **description** | **String**| A string value to use as a description for this AreaMail item. | [optional]
 **targettype** | **String**| The delivery location type. | [optional]
 **htmldata** | **String**| A string value that contains HTML markup. | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="areamailDelete"></a>
# **areamailDelete**
> String areamailDelete(areamailid)

Delete AreaMail

Remove an AreaMail object by its AreaMailId.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AreaMailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

AreaMailApi apiInstance = new AreaMailApi();
String areamailid = "areamailid_example"; // String | The unique identifier for an AreaMail object.
try {
    String result = apiInstance.areamailDelete(areamailid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AreaMailApi#areamailDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **areamailid** | **String**| The unique identifier for an AreaMail object. |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="areamailLists"></a>
# **areamailLists**
> String areamailLists(page, pagesize, areamailsid, dateCreated)

List AreaMails

Retrieve a list of AreaMail objects.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AreaMailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

AreaMailApi apiInstance = new AreaMailApi();
Integer page = 1; // Integer | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
Integer pagesize = 10; // Integer | The count of objects to return per page.
String areamailsid = "areamailsid_example"; // String | The unique identifier for an AreaMail object.
String dateCreated = "dateCreated_example"; // String | The date the AreaMail was created.
try {
    String result = apiInstance.areamailLists(page, pagesize, areamailsid, dateCreated);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AreaMailApi#areamailLists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **Integer**| The count of objects to return per page. | [optional] [default to 10]
 **areamailsid** | **String**| The unique identifier for an AreaMail object. | [optional]
 **dateCreated** | **String**| The date the AreaMail was created. | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="areamailView"></a>
# **areamailView**
> String areamailView(areamailid)

View AreaMail

Retrieve an AreaMail object by its AreaMailId.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AreaMailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

AreaMailApi apiInstance = new AreaMailApi();
String areamailid = "areamailid_example"; // String | The unique identifier for an AreaMail object.
try {
    String result = apiInstance.areamailView(areamailid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AreaMailApi#areamailView");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **areamailid** | **String**| The unique identifier for an AreaMail object. |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

