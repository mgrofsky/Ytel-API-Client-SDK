# SWGSubAccountApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userCreatesubaccount**](SWGSubAccountApi.md#usercreatesubaccount) | **POST** /user/createsubaccount.json | Create Subaccount
[**userDeletesubaccount**](SWGSubAccountApi.md#userdeletesubaccount) | **POST** /user/deletesubaccount.json | Delete Subaccount
[**userSubaccountactivation**](SWGSubAccountApi.md#usersubaccountactivation) | **POST** /user/subaccountactivation.json | Toggle Subaccount Status


# **userCreatesubaccount**
```objc
-(NSURLSessionTask*) userCreatesubaccountWithFirstName: (NSString*) firstName
    lastName: (NSString*) lastName
    email: (NSString*) email
    friendlyName: (NSString*) friendlyName
    password: (NSString*) password
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Create Subaccount

Create a sub user account under the parent account

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* firstName = @"firstName_example"; // Sub account user first name
NSString* lastName = @"lastName_example"; // sub account user last name
NSString* email = @"email_example"; // Sub account email address
NSString* friendlyName = @"friendlyName_example"; // Descriptive name of the sub account
NSString* password = @"password_example"; // The password of the sub account.  Please make sure to make as password that is at least 8 characters long, contain a symbol, uppercase and a number.

SWGSubAccountApi*apiInstance = [[SWGSubAccountApi alloc] init];

// Create Subaccount
[apiInstance userCreatesubaccountWithFirstName:firstName
              lastName:lastName
              email:email
              friendlyName:friendlyName
              password:password
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSubAccountApi->userCreatesubaccount: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **firstName** | **NSString***| Sub account user first name | 
 **lastName** | **NSString***| sub account user last name | 
 **email** | **NSString***| Sub account email address | 
 **friendlyName** | **NSString***| Descriptive name of the sub account | 
 **password** | **NSString***| The password of the sub account.  Please make sure to make as password that is at least 8 characters long, contain a symbol, uppercase and a number. | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userDeletesubaccount**
```objc
-(NSURLSessionTask*) userDeletesubaccountWithSubAccountSID: (NSString*) subAccountSID
    mergeNumber: (NSString*) mergeNumber
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Delete Subaccount

Delete sub account or merge numbers into parent

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* subAccountSID = @"subAccountSID_example"; // The SubaccountSid to be deleted
NSString* mergeNumber = @"mergeNumber_example"; // 0 to delete or 1 to merge numbers to parent account.

SWGSubAccountApi*apiInstance = [[SWGSubAccountApi alloc] init];

// Delete Subaccount
[apiInstance userDeletesubaccountWithSubAccountSID:subAccountSID
              mergeNumber:mergeNumber
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSubAccountApi->userDeletesubaccount: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subAccountSID** | **NSString***| The SubaccountSid to be deleted | 
 **mergeNumber** | **NSString***| 0 to delete or 1 to merge numbers to parent account. | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userSubaccountactivation**
```objc
-(NSURLSessionTask*) userSubaccountactivationWithSubAccountSID: (NSString*) subAccountSID
    activate: (NSString*) activate
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Toggle Subaccount Status

Suspend or unsuspend

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* subAccountSID = @"subAccountSID_example"; // The SubaccountSid to be activated or suspended
NSString* activate = @"activate_example"; // 0 to suspend or 1 to activate

SWGSubAccountApi*apiInstance = [[SWGSubAccountApi alloc] init];

// Toggle Subaccount Status
[apiInstance userSubaccountactivationWithSubAccountSID:subAccountSID
              activate:activate
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSubAccountApi->userSubaccountactivation: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subAccountSID** | **NSString***| The SubaccountSid to be activated or suspended | 
 **activate** | **NSString***| 0 to suspend or 1 to activate | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

