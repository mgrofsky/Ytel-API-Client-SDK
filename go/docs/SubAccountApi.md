# \SubAccountApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**UserCreatesubaccount**](SubAccountApi.md#UserCreatesubaccount) | **Post** /user/createsubaccount.json | Create Subaccount
[**UserDeletesubaccount**](SubAccountApi.md#UserDeletesubaccount) | **Post** /user/deletesubaccount.json | Delete Subaccount
[**UserSubaccountactivation**](SubAccountApi.md#UserSubaccountactivation) | **Post** /user/subaccountactivation.json | Toggle Subaccount Status


# **UserCreatesubaccount**
> string UserCreatesubaccount(ctx, firstName, lastName, email, friendlyName, password)
Create Subaccount

Create a sub user account under the parent account

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for logging, tracing, authentication, etc.
  **firstName** | **string**| Sub account user first name | 
  **lastName** | **string**| sub account user last name | 
  **email** | **string**| Sub account email address | 
  **friendlyName** | **string**| Descriptive name of the sub account | 
  **password** | **string**| The password of the sub account.  Please make sure to make as password that is at least 8 characters long, contain a symbol, uppercase and a number. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserDeletesubaccount**
> string UserDeletesubaccount(ctx, subAccountSID, mergeNumber)
Delete Subaccount

Delete sub account or merge numbers into parent

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for logging, tracing, authentication, etc.
  **subAccountSID** | **string**| The SubaccountSid to be deleted | 
  **mergeNumber** | **string**| 0 to delete or 1 to merge numbers to parent account. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserSubaccountactivation**
> string UserSubaccountactivation(ctx, subAccountSID, activate)
Toggle Subaccount Status

Suspend or unsuspend

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for logging, tracing, authentication, etc.
  **subAccountSID** | **string**| The SubaccountSid to be activated or suspended | 
  **activate** | **string**| 0 to suspend or 1 to activate | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

