# \EmailApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EmailAddunsubscribesemail**](EmailApi.md#EmailAddunsubscribesemail) | **Post** /email/addunsubscribesemail.json | Add Email Unsubscribe
[**EmailDeleteblocksemail**](EmailApi.md#EmailDeleteblocksemail) | **Post** /email/deleteblocksemail.json | Remove Blocked Address
[**EmailDeletebouncesemail**](EmailApi.md#EmailDeletebouncesemail) | **Post** /email/deletebouncesemail.json | Remove Bounced Email
[**EmailDeleteinvalidemail**](EmailApi.md#EmailDeleteinvalidemail) | **Post** /email/deleteinvalidemail.json | Remove Invalid Email
[**EmailDeletespamemail**](EmailApi.md#EmailDeletespamemail) | **Post** /email/deletespamemail.json | Remove Spam Address
[**EmailDeleteunsubscribedemail**](EmailApi.md#EmailDeleteunsubscribedemail) | **Post** /email/deleteunsubscribedemail.json | Remove Unsubscribed Email
[**EmailListblockemail**](EmailApi.md#EmailListblockemail) | **Post** /email/listblockemail.json | Blocked Emails
[**EmailListbounceemail**](EmailApi.md#EmailListbounceemail) | **Post** /email/listbounceemail.json | Bounced Emails
[**EmailListinvalidemail**](EmailApi.md#EmailListinvalidemail) | **Post** /email/listinvalidemail.json | Invalid Emails
[**EmailListspamemail**](EmailApi.md#EmailListspamemail) | **Post** /email/listspamemail.json | Spam Emails
[**EmailListunsubscribedemail**](EmailApi.md#EmailListunsubscribedemail) | **Post** /email/listunsubscribedemail.json | List Unsubscribed Emails
[**EmailSendemails**](EmailApi.md#EmailSendemails) | **Post** /email/sendemails.json | Send Email


# **EmailAddunsubscribesemail**
> string EmailAddunsubscribesemail(ctx, email)
Add Email Unsubscribe

Add an email to the unsubscribe list

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **email** | **string**| A valid email address that is to be added to the unsubscribe list | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EmailDeleteblocksemail**
> string EmailDeleteblocksemail(ctx, email)
Remove Blocked Address

Remove an email from blocked emails list.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **email** | **string**| The email address to be remove from the blocked list. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EmailDeletebouncesemail**
> string EmailDeletebouncesemail(ctx, email)
Remove Bounced Email

Remove an email address from the bounced list.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **email** | **string**| The email address to be remove from the bounced email list. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EmailDeleteinvalidemail**
> string EmailDeleteinvalidemail(ctx, email)
Remove Invalid Email

Remove an email from the invalid email list.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **email** | **string**| A valid email address that is to be remove from the invalid email list. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EmailDeletespamemail**
> string EmailDeletespamemail(ctx, email)
Remove Spam Address

Remove an email from the spam email list.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **email** | **string**| A valid email address that is to be remove from the spam list. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EmailDeleteunsubscribedemail**
> string EmailDeleteunsubscribedemail(ctx, email)
Remove Unsubscribed Email

Remove an email address from the list of unsubscribed emails.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **email** | **string**| A valid email address that is to be remove from the unsubscribe list. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EmailListblockemail**
> string EmailListblockemail(ctx, optional)
Blocked Emails

Retrieve a list of emails that have been blocked.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **string**| The starting point of the list of blocked emails that should be returned. | 
 **limit** | **string**| The count of results that should be returned. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EmailListbounceemail**
> string EmailListbounceemail(ctx, optional)
Bounced Emails

Retrieve a list of emails that have bounced.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **string**| The starting point of the list of bounced emails that should be returned. | 
 **limit** | **string**| The count of results that should be returned. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EmailListinvalidemail**
> string EmailListinvalidemail(ctx, optional)
Invalid Emails

Retrieve a list of invalid email addresses.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **string**| The starting point of the list of invalid emails that should be returned. | 
 **limit** | **string**| The count of results that should be returned. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EmailListspamemail**
> string EmailListspamemail(ctx, optional)
Spam Emails

Retrieve a list of emails that are on the spam list.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **string**| The starting point of the list of spam emails that should be returned. | 
 **limit** | **string**| The count of results that should be returned. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EmailListunsubscribedemail**
> string EmailListunsubscribedemail(ctx, optional)
List Unsubscribed Emails

Retrieve a list of email addresses from the unsubscribe list.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **string**| The starting point of the list of unsubscribed emails that should be returned. | 
 **limit** | **string**| The count of results that should be returned. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EmailSendemails**
> string EmailSendemails(ctx, to, type_, subject, message, optional)
Send Email

Create and submit an email message to one or more email addresses.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **to** | **string**| A valid address that will receive the email. Multiple addresses can be separated by using commas. | 
  **type_** | **string**| Specifies the type of email to be sent | 
  **subject** | **string**| The subject of the mail. Must be a valid string. | 
  **message** | **string**| The email message that is to be sent in the text. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **to** | **string**| A valid address that will receive the email. Multiple addresses can be separated by using commas. | 
 **type_** | **string**| Specifies the type of email to be sent | 
 **subject** | **string**| The subject of the mail. Must be a valid string. | 
 **message** | **string**| The email message that is to be sent in the text. | 
 **from** | **string**| A valid address that will send the email. | 
 **cc** | **string**| Carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas. | 
 **bcc** | **string**| Blind carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas. | 
 **attachment** | **string**| A file that is attached to the email. Must be less than 7 MB in size. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

