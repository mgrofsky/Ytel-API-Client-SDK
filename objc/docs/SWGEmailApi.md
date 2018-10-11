# SWGEmailApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**emailAddunsubscribesemail**](SWGEmailApi.md#emailaddunsubscribesemail) | **POST** /email/addunsubscribesemail.json | Add Email Unsubscribe
[**emailDeleteblocksemail**](SWGEmailApi.md#emaildeleteblocksemail) | **POST** /email/deleteblocksemail.json | Remove Blocked Address
[**emailDeletebouncesemail**](SWGEmailApi.md#emaildeletebouncesemail) | **POST** /email/deletebouncesemail.json | Remove Bounced Email
[**emailDeleteinvalidemail**](SWGEmailApi.md#emaildeleteinvalidemail) | **POST** /email/deleteinvalidemail.json | Remove Invalid Email
[**emailDeletespamemail**](SWGEmailApi.md#emaildeletespamemail) | **POST** /email/deletespamemail.json | Remove Spam Address
[**emailDeleteunsubscribedemail**](SWGEmailApi.md#emaildeleteunsubscribedemail) | **POST** /email/deleteunsubscribedemail.json | Remove Unsubscribed Email
[**emailListblockemail**](SWGEmailApi.md#emaillistblockemail) | **POST** /email/listblockemail.json | Blocked Emails
[**emailListbounceemail**](SWGEmailApi.md#emaillistbounceemail) | **POST** /email/listbounceemail.json | Bounced Emails
[**emailListinvalidemail**](SWGEmailApi.md#emaillistinvalidemail) | **POST** /email/listinvalidemail.json | Invalid Emails
[**emailListspamemail**](SWGEmailApi.md#emaillistspamemail) | **POST** /email/listspamemail.json | Spam Emails
[**emailListunsubscribedemail**](SWGEmailApi.md#emaillistunsubscribedemail) | **POST** /email/listunsubscribedemail.json | List Unsubscribed Emails
[**emailSendemails**](SWGEmailApi.md#emailsendemails) | **POST** /email/sendemails.json | Send Email


# **emailAddunsubscribesemail**
```objc
-(NSURLSessionTask*) emailAddunsubscribesemailWithEmail: (NSString*) email
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Add Email Unsubscribe

Add an email to the unsubscribe list

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* email = @"email_example"; // A valid email address that is to be added to the unsubscribe list

SWGEmailApi*apiInstance = [[SWGEmailApi alloc] init];

// Add Email Unsubscribe
[apiInstance emailAddunsubscribesemailWithEmail:email
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGEmailApi->emailAddunsubscribesemail: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **NSString***| A valid email address that is to be added to the unsubscribe list | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **emailDeleteblocksemail**
```objc
-(NSURLSessionTask*) emailDeleteblocksemailWithEmail: (NSString*) email
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Remove Blocked Address

Remove an email from blocked emails list.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* email = @"email_example"; // The email address to be remove from the blocked list.

SWGEmailApi*apiInstance = [[SWGEmailApi alloc] init];

// Remove Blocked Address
[apiInstance emailDeleteblocksemailWithEmail:email
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGEmailApi->emailDeleteblocksemail: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **NSString***| The email address to be remove from the blocked list. | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **emailDeletebouncesemail**
```objc
-(NSURLSessionTask*) emailDeletebouncesemailWithEmail: (NSString*) email
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Remove Bounced Email

Remove an email address from the bounced list.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* email = @"email_example"; // The email address to be remove from the bounced email list.

SWGEmailApi*apiInstance = [[SWGEmailApi alloc] init];

// Remove Bounced Email
[apiInstance emailDeletebouncesemailWithEmail:email
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGEmailApi->emailDeletebouncesemail: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **NSString***| The email address to be remove from the bounced email list. | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **emailDeleteinvalidemail**
```objc
-(NSURLSessionTask*) emailDeleteinvalidemailWithEmail: (NSString*) email
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Remove Invalid Email

Remove an email from the invalid email list.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* email = @"email_example"; // A valid email address that is to be remove from the invalid email list.

SWGEmailApi*apiInstance = [[SWGEmailApi alloc] init];

// Remove Invalid Email
[apiInstance emailDeleteinvalidemailWithEmail:email
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGEmailApi->emailDeleteinvalidemail: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **NSString***| A valid email address that is to be remove from the invalid email list. | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **emailDeletespamemail**
```objc
-(NSURLSessionTask*) emailDeletespamemailWithEmail: (NSString*) email
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Remove Spam Address

Remove an email from the spam email list.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* email = @"email_example"; // A valid email address that is to be remove from the spam list.

SWGEmailApi*apiInstance = [[SWGEmailApi alloc] init];

// Remove Spam Address
[apiInstance emailDeletespamemailWithEmail:email
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGEmailApi->emailDeletespamemail: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **NSString***| A valid email address that is to be remove from the spam list. | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **emailDeleteunsubscribedemail**
```objc
-(NSURLSessionTask*) emailDeleteunsubscribedemailWithEmail: (NSString*) email
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Remove Unsubscribed Email

Remove an email address from the list of unsubscribed emails.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* email = @"email_example"; // A valid email address that is to be remove from the unsubscribe list.

SWGEmailApi*apiInstance = [[SWGEmailApi alloc] init];

// Remove Unsubscribed Email
[apiInstance emailDeleteunsubscribedemailWithEmail:email
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGEmailApi->emailDeleteunsubscribedemail: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **NSString***| A valid email address that is to be remove from the unsubscribe list. | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **emailListblockemail**
```objc
-(NSURLSessionTask*) emailListblockemailWithOffset: (NSString*) offset
    limit: (NSString*) limit
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Blocked Emails

Retrieve a list of emails that have been blocked.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* offset = @"offset_example"; // The starting point of the list of blocked emails that should be returned. (optional)
NSString* limit = @"limit_example"; // The count of results that should be returned. (optional)

SWGEmailApi*apiInstance = [[SWGEmailApi alloc] init];

// Blocked Emails
[apiInstance emailListblockemailWithOffset:offset
              limit:limit
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGEmailApi->emailListblockemail: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **NSString***| The starting point of the list of blocked emails that should be returned. | [optional] 
 **limit** | **NSString***| The count of results that should be returned. | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **emailListbounceemail**
```objc
-(NSURLSessionTask*) emailListbounceemailWithOffset: (NSString*) offset
    limit: (NSString*) limit
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Bounced Emails

Retrieve a list of emails that have bounced.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* offset = @"offset_example"; // The starting point of the list of bounced emails that should be returned. (optional)
NSString* limit = @"limit_example"; // The count of results that should be returned. (optional)

SWGEmailApi*apiInstance = [[SWGEmailApi alloc] init];

// Bounced Emails
[apiInstance emailListbounceemailWithOffset:offset
              limit:limit
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGEmailApi->emailListbounceemail: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **NSString***| The starting point of the list of bounced emails that should be returned. | [optional] 
 **limit** | **NSString***| The count of results that should be returned. | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **emailListinvalidemail**
```objc
-(NSURLSessionTask*) emailListinvalidemailWithOffset: (NSString*) offset
    limit: (NSString*) limit
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Invalid Emails

Retrieve a list of invalid email addresses.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* offset = @"offset_example"; // The starting point of the list of invalid emails that should be returned. (optional)
NSString* limit = @"limit_example"; // The count of results that should be returned. (optional)

SWGEmailApi*apiInstance = [[SWGEmailApi alloc] init];

// Invalid Emails
[apiInstance emailListinvalidemailWithOffset:offset
              limit:limit
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGEmailApi->emailListinvalidemail: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **NSString***| The starting point of the list of invalid emails that should be returned. | [optional] 
 **limit** | **NSString***| The count of results that should be returned. | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **emailListspamemail**
```objc
-(NSURLSessionTask*) emailListspamemailWithOffset: (NSString*) offset
    limit: (NSString*) limit
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Spam Emails

Retrieve a list of emails that are on the spam list.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* offset = @"offset_example"; // The starting point of the list of spam emails that should be returned. (optional)
NSString* limit = @"limit_example"; // The count of results that should be returned. (optional)

SWGEmailApi*apiInstance = [[SWGEmailApi alloc] init];

// Spam Emails
[apiInstance emailListspamemailWithOffset:offset
              limit:limit
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGEmailApi->emailListspamemail: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **NSString***| The starting point of the list of spam emails that should be returned. | [optional] 
 **limit** | **NSString***| The count of results that should be returned. | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **emailListunsubscribedemail**
```objc
-(NSURLSessionTask*) emailListunsubscribedemailWithOffset: (NSString*) offset
    limit: (NSString*) limit
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

List Unsubscribed Emails

Retrieve a list of email addresses from the unsubscribe list.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* offset = @"offset_example"; // The starting point of the list of unsubscribed emails that should be returned. (optional)
NSString* limit = @"limit_example"; // The count of results that should be returned. (optional)

SWGEmailApi*apiInstance = [[SWGEmailApi alloc] init];

// List Unsubscribed Emails
[apiInstance emailListunsubscribedemailWithOffset:offset
              limit:limit
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGEmailApi->emailListunsubscribedemail: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **NSString***| The starting point of the list of unsubscribed emails that should be returned. | [optional] 
 **limit** | **NSString***| The count of results that should be returned. | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **emailSendemails**
```objc
-(NSURLSessionTask*) emailSendemailsWithTo: (NSString*) to
    type: (NSString*) type
    subject: (NSString*) subject
    message: (NSString*) message
    from: (NSString*) from
    cc: (NSString*) cc
    bcc: (NSString*) bcc
    attachment: (NSString*) attachment
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Send Email

Create and submit an email message to one or more email addresses.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* to = @"to_example"; // A valid address that will receive the email. Multiple addresses can be separated by using commas.
NSString* type = @"type_example"; // Specifies the type of email to be sent
NSString* subject = @"subject_example"; // The subject of the mail. Must be a valid string.
NSString* message = @"message_example"; // The email message that is to be sent in the text.
NSString* from = @"from_example"; // A valid address that will send the email. (optional)
NSString* cc = @"cc_example"; // Carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas. (optional)
NSString* bcc = @"bcc_example"; // Blind carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas. (optional)
NSString* attachment = @"attachment_example"; // A file that is attached to the email. Must be less than 7 MB in size. (optional)

SWGEmailApi*apiInstance = [[SWGEmailApi alloc] init];

// Send Email
[apiInstance emailSendemailsWithTo:to
              type:type
              subject:subject
              message:message
              from:from
              cc:cc
              bcc:bcc
              attachment:attachment
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGEmailApi->emailSendemails: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **to** | **NSString***| A valid address that will receive the email. Multiple addresses can be separated by using commas. | 
 **type** | **NSString***| Specifies the type of email to be sent | 
 **subject** | **NSString***| The subject of the mail. Must be a valid string. | 
 **message** | **NSString***| The email message that is to be sent in the text. | 
 **from** | **NSString***| A valid address that will send the email. | [optional] 
 **cc** | **NSString***| Carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas. | [optional] 
 **bcc** | **NSString***| Blind carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas. | [optional] 
 **attachment** | **NSString***| A file that is attached to the email. Must be less than 7 MB in size. | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

