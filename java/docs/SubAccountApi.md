# SubAccountApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userCreatesubaccount**](SubAccountApi.md#userCreatesubaccount) | **POST** /user/createsubaccount.json | Create Subaccount
[**userDeletesubaccount**](SubAccountApi.md#userDeletesubaccount) | **POST** /user/deletesubaccount.json | Delete Subaccount
[**userSubaccountactivation**](SubAccountApi.md#userSubaccountactivation) | **POST** /user/subaccountactivation.json | Toggle Subaccount Status


<a name="userCreatesubaccount"></a>
# **userCreatesubaccount**
> String userCreatesubaccount(firstName, lastName, email, friendlyName, password)

Create Subaccount

Create a sub user account under the parent account

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SubAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

SubAccountApi apiInstance = new SubAccountApi();
String firstName = "firstName_example"; // String | Sub account user first name
String lastName = "lastName_example"; // String | sub account user last name
String email = "email_example"; // String | Sub account email address
String friendlyName = "friendlyName_example"; // String | Descriptive name of the sub account
String password = "password_example"; // String | The password of the sub account.  Please make sure to make as password that is at least 8 characters long, contain a symbol, uppercase and a number.
try {
    String result = apiInstance.userCreatesubaccount(firstName, lastName, email, friendlyName, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubAccountApi#userCreatesubaccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **firstName** | **String**| Sub account user first name |
 **lastName** | **String**| sub account user last name |
 **email** | **String**| Sub account email address |
 **friendlyName** | **String**| Descriptive name of the sub account |
 **password** | **String**| The password of the sub account.  Please make sure to make as password that is at least 8 characters long, contain a symbol, uppercase and a number. |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="userDeletesubaccount"></a>
# **userDeletesubaccount**
> String userDeletesubaccount(subAccountSID, mergeNumber)

Delete Subaccount

Delete sub account or merge numbers into parent

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SubAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

SubAccountApi apiInstance = new SubAccountApi();
String subAccountSID = "subAccountSID_example"; // String | The SubaccountSid to be deleted
String mergeNumber = "mergeNumber_example"; // String | 0 to delete or 1 to merge numbers to parent account.
try {
    String result = apiInstance.userDeletesubaccount(subAccountSID, mergeNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubAccountApi#userDeletesubaccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subAccountSID** | **String**| The SubaccountSid to be deleted |
 **mergeNumber** | **String**| 0 to delete or 1 to merge numbers to parent account. | [enum: 0, 1]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="userSubaccountactivation"></a>
# **userSubaccountactivation**
> String userSubaccountactivation(subAccountSID, activate)

Toggle Subaccount Status

Suspend or unsuspend

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SubAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

SubAccountApi apiInstance = new SubAccountApi();
String subAccountSID = "subAccountSID_example"; // String | The SubaccountSid to be activated or suspended
String activate = "activate_example"; // String | 0 to suspend or 1 to activate
try {
    String result = apiInstance.userSubaccountactivation(subAccountSID, activate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubAccountApi#userSubaccountactivation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subAccountSID** | **String**| The SubaccountSid to be activated or suspended |
 **activate** | **String**| 0 to suspend or 1 to activate | [enum: 1, 0]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

