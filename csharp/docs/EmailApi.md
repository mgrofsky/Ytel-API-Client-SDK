# IO.Swagger.Api.EmailApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EmailAddunsubscribesemail**](EmailApi.md#emailaddunsubscribesemail) | **POST** /email/addunsubscribesemail.json | Add Email Unsubscribe
[**EmailDeleteblocksemail**](EmailApi.md#emaildeleteblocksemail) | **POST** /email/deleteblocksemail.json | Remove Blocked Address
[**EmailDeletebouncesemail**](EmailApi.md#emaildeletebouncesemail) | **POST** /email/deletebouncesemail.json | Remove Bounced Email
[**EmailDeleteinvalidemail**](EmailApi.md#emaildeleteinvalidemail) | **POST** /email/deleteinvalidemail.json | Remove Invalid Email
[**EmailDeletespamemail**](EmailApi.md#emaildeletespamemail) | **POST** /email/deletespamemail.json | Remove Spam Address
[**EmailDeleteunsubscribedemail**](EmailApi.md#emaildeleteunsubscribedemail) | **POST** /email/deleteunsubscribedemail.json | Remove Unsubscribed Email
[**EmailListblockemail**](EmailApi.md#emaillistblockemail) | **POST** /email/listblockemail.json | Blocked Emails
[**EmailListbounceemail**](EmailApi.md#emaillistbounceemail) | **POST** /email/listbounceemail.json | Bounced Emails
[**EmailListinvalidemail**](EmailApi.md#emaillistinvalidemail) | **POST** /email/listinvalidemail.json | Invalid Emails
[**EmailListspamemail**](EmailApi.md#emaillistspamemail) | **POST** /email/listspamemail.json | Spam Emails
[**EmailListunsubscribedemail**](EmailApi.md#emaillistunsubscribedemail) | **POST** /email/listunsubscribedemail.json | List Unsubscribed Emails
[**EmailSendemails**](EmailApi.md#emailsendemails) | **POST** /email/sendemails.json | Send Email


<a name="emailaddunsubscribesemail"></a>
# **EmailAddunsubscribesemail**
> string EmailAddunsubscribesemail (string email)

Add Email Unsubscribe

Add an email to the unsubscribe list

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class EmailAddunsubscribesemailExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new EmailApi();
            var email = email_example;  // string | A valid email address that is to be added to the unsubscribe list

            try
            {
                // Add Email Unsubscribe
                string result = apiInstance.EmailAddunsubscribesemail(email);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EmailApi.EmailAddunsubscribesemail: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **string**| A valid email address that is to be added to the unsubscribe list | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="emaildeleteblocksemail"></a>
# **EmailDeleteblocksemail**
> string EmailDeleteblocksemail (string email)

Remove Blocked Address

Remove an email from blocked emails list.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class EmailDeleteblocksemailExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new EmailApi();
            var email = email_example;  // string | The email address to be remove from the blocked list.

            try
            {
                // Remove Blocked Address
                string result = apiInstance.EmailDeleteblocksemail(email);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EmailApi.EmailDeleteblocksemail: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **string**| The email address to be remove from the blocked list. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="emaildeletebouncesemail"></a>
# **EmailDeletebouncesemail**
> string EmailDeletebouncesemail (string email)

Remove Bounced Email

Remove an email address from the bounced list.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class EmailDeletebouncesemailExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new EmailApi();
            var email = email_example;  // string | The email address to be remove from the bounced email list.

            try
            {
                // Remove Bounced Email
                string result = apiInstance.EmailDeletebouncesemail(email);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EmailApi.EmailDeletebouncesemail: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **string**| The email address to be remove from the bounced email list. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="emaildeleteinvalidemail"></a>
# **EmailDeleteinvalidemail**
> string EmailDeleteinvalidemail (string email)

Remove Invalid Email

Remove an email from the invalid email list.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class EmailDeleteinvalidemailExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new EmailApi();
            var email = email_example;  // string | A valid email address that is to be remove from the invalid email list.

            try
            {
                // Remove Invalid Email
                string result = apiInstance.EmailDeleteinvalidemail(email);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EmailApi.EmailDeleteinvalidemail: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **string**| A valid email address that is to be remove from the invalid email list. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="emaildeletespamemail"></a>
# **EmailDeletespamemail**
> string EmailDeletespamemail (string email)

Remove Spam Address

Remove an email from the spam email list.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class EmailDeletespamemailExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new EmailApi();
            var email = email_example;  // string | A valid email address that is to be remove from the spam list.

            try
            {
                // Remove Spam Address
                string result = apiInstance.EmailDeletespamemail(email);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EmailApi.EmailDeletespamemail: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **string**| A valid email address that is to be remove from the spam list. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="emaildeleteunsubscribedemail"></a>
# **EmailDeleteunsubscribedemail**
> string EmailDeleteunsubscribedemail (string email)

Remove Unsubscribed Email

Remove an email address from the list of unsubscribed emails.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class EmailDeleteunsubscribedemailExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new EmailApi();
            var email = email_example;  // string | A valid email address that is to be remove from the unsubscribe list.

            try
            {
                // Remove Unsubscribed Email
                string result = apiInstance.EmailDeleteunsubscribedemail(email);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EmailApi.EmailDeleteunsubscribedemail: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **string**| A valid email address that is to be remove from the unsubscribe list. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="emaillistblockemail"></a>
# **EmailListblockemail**
> string EmailListblockemail (string offset = null, string limit = null)

Blocked Emails

Retrieve a list of emails that have been blocked.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class EmailListblockemailExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new EmailApi();
            var offset = offset_example;  // string | The starting point of the list of blocked emails that should be returned. (optional) 
            var limit = limit_example;  // string | The count of results that should be returned. (optional) 

            try
            {
                // Blocked Emails
                string result = apiInstance.EmailListblockemail(offset, limit);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EmailApi.EmailListblockemail: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **string**| The starting point of the list of blocked emails that should be returned. | [optional] 
 **limit** | **string**| The count of results that should be returned. | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="emaillistbounceemail"></a>
# **EmailListbounceemail**
> string EmailListbounceemail (string offset = null, string limit = null)

Bounced Emails

Retrieve a list of emails that have bounced.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class EmailListbounceemailExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new EmailApi();
            var offset = offset_example;  // string | The starting point of the list of bounced emails that should be returned. (optional) 
            var limit = limit_example;  // string | The count of results that should be returned. (optional) 

            try
            {
                // Bounced Emails
                string result = apiInstance.EmailListbounceemail(offset, limit);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EmailApi.EmailListbounceemail: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **string**| The starting point of the list of bounced emails that should be returned. | [optional] 
 **limit** | **string**| The count of results that should be returned. | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="emaillistinvalidemail"></a>
# **EmailListinvalidemail**
> string EmailListinvalidemail (string offset = null, string limit = null)

Invalid Emails

Retrieve a list of invalid email addresses.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class EmailListinvalidemailExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new EmailApi();
            var offset = offset_example;  // string | The starting point of the list of invalid emails that should be returned. (optional) 
            var limit = limit_example;  // string | The count of results that should be returned. (optional) 

            try
            {
                // Invalid Emails
                string result = apiInstance.EmailListinvalidemail(offset, limit);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EmailApi.EmailListinvalidemail: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **string**| The starting point of the list of invalid emails that should be returned. | [optional] 
 **limit** | **string**| The count of results that should be returned. | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="emaillistspamemail"></a>
# **EmailListspamemail**
> string EmailListspamemail (string offset = null, string limit = null)

Spam Emails

Retrieve a list of emails that are on the spam list.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class EmailListspamemailExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new EmailApi();
            var offset = offset_example;  // string | The starting point of the list of spam emails that should be returned. (optional) 
            var limit = limit_example;  // string | The count of results that should be returned. (optional) 

            try
            {
                // Spam Emails
                string result = apiInstance.EmailListspamemail(offset, limit);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EmailApi.EmailListspamemail: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **string**| The starting point of the list of spam emails that should be returned. | [optional] 
 **limit** | **string**| The count of results that should be returned. | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="emaillistunsubscribedemail"></a>
# **EmailListunsubscribedemail**
> string EmailListunsubscribedemail (string offset = null, string limit = null)

List Unsubscribed Emails

Retrieve a list of email addresses from the unsubscribe list.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class EmailListunsubscribedemailExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new EmailApi();
            var offset = offset_example;  // string | The starting point of the list of unsubscribed emails that should be returned. (optional) 
            var limit = limit_example;  // string | The count of results that should be returned. (optional) 

            try
            {
                // List Unsubscribed Emails
                string result = apiInstance.EmailListunsubscribedemail(offset, limit);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EmailApi.EmailListunsubscribedemail: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **string**| The starting point of the list of unsubscribed emails that should be returned. | [optional] 
 **limit** | **string**| The count of results that should be returned. | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="emailsendemails"></a>
# **EmailSendemails**
> string EmailSendemails (string to, string type, string subject, string message, string from = null, string cc = null, string bcc = null, string attachment = null)

Send Email

Create and submit an email message to one or more email addresses.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class EmailSendemailsExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new EmailApi();
            var to = to_example;  // string | A valid address that will receive the email. Multiple addresses can be separated by using commas.
            var type = type_example;  // string | Specifies the type of email to be sent
            var subject = subject_example;  // string | The subject of the mail. Must be a valid string.
            var message = message_example;  // string | The email message that is to be sent in the text.
            var from = from_example;  // string | A valid address that will send the email. (optional) 
            var cc = cc_example;  // string | Carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas. (optional) 
            var bcc = bcc_example;  // string | Blind carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas. (optional) 
            var attachment = attachment_example;  // string | A file that is attached to the email. Must be less than 7 MB in size. (optional) 

            try
            {
                // Send Email
                string result = apiInstance.EmailSendemails(to, type, subject, message, from, cc, bcc, attachment);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EmailApi.EmailSendemails: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **to** | **string**| A valid address that will receive the email. Multiple addresses can be separated by using commas. | 
 **type** | **string**| Specifies the type of email to be sent | 
 **subject** | **string**| The subject of the mail. Must be a valid string. | 
 **message** | **string**| The email message that is to be sent in the text. | 
 **from** | **string**| A valid address that will send the email. | [optional] 
 **cc** | **string**| Carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas. | [optional] 
 **bcc** | **string**| Blind carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas. | [optional] 
 **attachment** | **string**| A file that is attached to the email. Must be less than 7 MB in size. | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

