# SubAccountApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userCreatesubaccount**](SubAccountApi.md#userCreatesubaccount) | **POST** /user/createsubaccount.json | Create Subaccount
[**userDeletesubaccount**](SubAccountApi.md#userDeletesubaccount) | **POST** /user/deletesubaccount.json | Delete Subaccount
[**userSubaccountactivation**](SubAccountApi.md#userSubaccountactivation) | **POST** /user/subaccountactivation.json | Toggle Subaccount Status


<a name="userCreatesubaccount"></a>
# **userCreatesubaccount**
> kotlin.String userCreatesubaccount(firstName, lastName, email, friendlyName, password)

Create Subaccount

Create a sub user account under the parent account

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SubAccountApi()
val firstName : kotlin.String = firstName_example // kotlin.String | Sub account user first name
val lastName : kotlin.String = lastName_example // kotlin.String | sub account user last name
val email : kotlin.String = email_example // kotlin.String | Sub account email address
val friendlyName : kotlin.String = friendlyName_example // kotlin.String | Descriptive name of the sub account
val password : kotlin.String = password_example // kotlin.String | The password of the sub account.  Please make sure to make as password that is at least 8 characters long, contain a symbol, uppercase and a number.
try {
    val result : kotlin.String = apiInstance.userCreatesubaccount(firstName, lastName, email, friendlyName, password)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubAccountApi#userCreatesubaccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubAccountApi#userCreatesubaccount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **firstName** | **kotlin.String**| Sub account user first name |
 **lastName** | **kotlin.String**| sub account user last name |
 **email** | **kotlin.String**| Sub account email address |
 **friendlyName** | **kotlin.String**| Descriptive name of the sub account |
 **password** | **kotlin.String**| The password of the sub account.  Please make sure to make as password that is at least 8 characters long, contain a symbol, uppercase and a number. |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="userDeletesubaccount"></a>
# **userDeletesubaccount**
> kotlin.String userDeletesubaccount(subAccountSID, mergeNumber)

Delete Subaccount

Delete sub account or merge numbers into parent

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SubAccountApi()
val subAccountSID : kotlin.String = subAccountSID_example // kotlin.String | The SubaccountSid to be deleted
val mergeNumber : kotlin.String = mergeNumber_example // kotlin.String | 0 to delete or 1 to merge numbers to parent account.
try {
    val result : kotlin.String = apiInstance.userDeletesubaccount(subAccountSID, mergeNumber)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubAccountApi#userDeletesubaccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubAccountApi#userDeletesubaccount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subAccountSID** | **kotlin.String**| The SubaccountSid to be deleted |
 **mergeNumber** | **kotlin.String**| 0 to delete or 1 to merge numbers to parent account. | [enum: 0, 1]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="userSubaccountactivation"></a>
# **userSubaccountactivation**
> kotlin.String userSubaccountactivation(subAccountSID, activate)

Toggle Subaccount Status

Suspend or unsuspend

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SubAccountApi()
val subAccountSID : kotlin.String = subAccountSID_example // kotlin.String | The SubaccountSid to be activated or suspended
val activate : kotlin.String = activate_example // kotlin.String | 0 to suspend or 1 to activate
try {
    val result : kotlin.String = apiInstance.userSubaccountactivation(subAccountSID, activate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubAccountApi#userSubaccountactivation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubAccountApi#userSubaccountactivation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subAccountSID** | **kotlin.String**| The SubaccountSid to be activated or suspended |
 **activate** | **kotlin.String**| 0 to suspend or 1 to activate | [enum: 1, 0]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

