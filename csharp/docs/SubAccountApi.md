# IO.Swagger.Api.SubAccountApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**UserCreatesubaccount**](SubAccountApi.md#usercreatesubaccount) | **POST** /user/createsubaccount.json | Create Subaccount
[**UserDeletesubaccount**](SubAccountApi.md#userdeletesubaccount) | **POST** /user/deletesubaccount.json | Delete Subaccount
[**UserSubaccountactivation**](SubAccountApi.md#usersubaccountactivation) | **POST** /user/subaccountactivation.json | Toggle Subaccount Status


<a name="usercreatesubaccount"></a>
# **UserCreatesubaccount**
> string UserCreatesubaccount (string firstName, string lastName, string email, string friendlyName, string password)

Create Subaccount

Create a sub user account under the parent account

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UserCreatesubaccountExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SubAccountApi();
            var firstName = firstName_example;  // string | Sub account user first name
            var lastName = lastName_example;  // string | sub account user last name
            var email = email_example;  // string | Sub account email address
            var friendlyName = friendlyName_example;  // string | Descriptive name of the sub account
            var password = password_example;  // string | The password of the sub account.  Please make sure to make as password that is at least 8 characters long, contain a symbol, uppercase and a number.

            try
            {
                // Create Subaccount
                string result = apiInstance.UserCreatesubaccount(firstName, lastName, email, friendlyName, password);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SubAccountApi.UserCreatesubaccount: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="userdeletesubaccount"></a>
# **UserDeletesubaccount**
> string UserDeletesubaccount (string subAccountSID, string mergeNumber)

Delete Subaccount

Delete sub account or merge numbers into parent

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UserDeletesubaccountExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SubAccountApi();
            var subAccountSID = subAccountSID_example;  // string | The SubaccountSid to be deleted
            var mergeNumber = mergeNumber_example;  // string | 0 to delete or 1 to merge numbers to parent account.

            try
            {
                // Delete Subaccount
                string result = apiInstance.UserDeletesubaccount(subAccountSID, mergeNumber);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SubAccountApi.UserDeletesubaccount: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="usersubaccountactivation"></a>
# **UserSubaccountactivation**
> string UserSubaccountactivation (string subAccountSID, string activate)

Toggle Subaccount Status

Suspend or unsuspend

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UserSubaccountactivationExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SubAccountApi();
            var subAccountSID = subAccountSID_example;  // string | The SubaccountSid to be activated or suspended
            var activate = activate_example;  // string | 0 to suspend or 1 to activate

            try
            {
                // Toggle Subaccount Status
                string result = apiInstance.UserSubaccountactivation(subAccountSID, activate);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SubAccountApi.UserSubaccountactivation: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

