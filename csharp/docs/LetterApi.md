# IO.Swagger.Api.LetterApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**LetterCreate**](LetterApi.md#lettercreate) | **POST** /letter/create.json | Create Letter
[**LetterDelete**](LetterApi.md#letterdelete) | **POST** /letter/delete.json | Delete Letter
[**LetterListsletter**](LetterApi.md#letterlistsletter) | **POST** /letter/listsletter.json | List Letters
[**LetterViewletter**](LetterApi.md#letterviewletter) | **POST** /letter/viewletter.json | View Letter


<a name="lettercreate"></a>
# **LetterCreate**
> string LetterCreate (string to, string from, string attachbyid, string file, string color, string description = null, string extraservice = null, string doublesided = null, string template = null, string htmldata = null)

Create Letter

Create, print, and mail a letter to an address. The letter file must be supplied as a PDF or an HTML string.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class LetterCreateExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new LetterApi();
            var to = to_example;  // string | The AddressId or an object structured when creating an address by addresses/Create.
            var from = from_example;  // string | The AddressId or an object structured when creating an address by addresses/Create.
            var attachbyid = attachbyid_example;  // string | Set an existing letter by attaching its LetterId.
            var file = file_example;  // string | File can be a 8.5\"x11\" PDF uploaded file or URL that links to a file.
            var color = color_example;  // string | Specify if letter should be printed in color.
            var description = description_example;  // string | A description for the letter. (optional) 
            var extraservice = extraservice_example;  // string | Add an extra service to your letter. Options are \"certified\" or \"registered\". Certified provides tracking and delivery confirmation for domestic destinations and is an additional $5.00. Registered provides tracking and confirmation for international addresses and is an additional $16.50. (optional) 
            var doublesided = doublesided_example;  // string | Specify if letter should be printed on both sides. (optional) 
            var template = template_example;  // string | Boolean that defaults to true. When set to false, this specifies that your letter does not follow the m360 address template. In this case, a blank address page will be inserted at the beginning of your file and you will be charged for the extra page. (optional) 
            var htmldata = htmldata_example;  // string | A string value that contains HTML markup. (optional) 

            try
            {
                // Create Letter
                string result = apiInstance.LetterCreate(to, from, attachbyid, file, color, description, extraservice, doublesided, template, htmldata);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LetterApi.LetterCreate: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **to** | **string**| The AddressId or an object structured when creating an address by addresses/Create. | 
 **from** | **string**| The AddressId or an object structured when creating an address by addresses/Create. | 
 **attachbyid** | **string**| Set an existing letter by attaching its LetterId. | 
 **file** | **string**| File can be a 8.5\&quot;x11\&quot; PDF uploaded file or URL that links to a file. | 
 **color** | **string**| Specify if letter should be printed in color. | 
 **description** | **string**| A description for the letter. | [optional] 
 **extraservice** | **string**| Add an extra service to your letter. Options are \&quot;certified\&quot; or \&quot;registered\&quot;. Certified provides tracking and delivery confirmation for domestic destinations and is an additional $5.00. Registered provides tracking and confirmation for international addresses and is an additional $16.50. | [optional] 
 **doublesided** | **string**| Specify if letter should be printed on both sides. | [optional] 
 **template** | **string**| Boolean that defaults to true. When set to false, this specifies that your letter does not follow the m360 address template. In this case, a blank address page will be inserted at the beginning of your file and you will be charged for the extra page. | [optional] 
 **htmldata** | **string**| A string value that contains HTML markup. | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="letterdelete"></a>
# **LetterDelete**
> string LetterDelete (string lettersid)

Delete Letter

Remove a letter object by its LetterId.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class LetterDeleteExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new LetterApi();
            var lettersid = lettersid_example;  // string | The unique identifier for a letter object.

            try
            {
                // Delete Letter
                string result = apiInstance.LetterDelete(lettersid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LetterApi.LetterDelete: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lettersid** | **string**| The unique identifier for a letter object. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="letterlistsletter"></a>
# **LetterListsletter**
> string LetterListsletter (int? page = null, int? pagesize = null, string lettersid = null, string dateCreated = null)

List Letters

Retrieve a list of letter objects. The letter objects are sorted by creation date, with the most recently created letters appearing first.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class LetterListsletterExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new LetterApi();
            var page = 56;  // int? | The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional)  (default to 1)
            var pagesize = 56;  // int? | The count of objects to return per page. (optional)  (default to 10)
            var lettersid = lettersid_example;  // string | The unique identifier for a letter object. (optional) 
            var dateCreated = dateCreated_example;  // string | The date the letter was created. (optional) 

            try
            {
                // List Letters
                string result = apiInstance.LetterListsletter(page, pagesize, lettersid, dateCreated);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LetterApi.LetterListsletter: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int?**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **int?**| The count of objects to return per page. | [optional] [default to 10]
 **lettersid** | **string**| The unique identifier for a letter object. | [optional] 
 **dateCreated** | **string**| The date the letter was created. | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="letterviewletter"></a>
# **LetterViewletter**
> string LetterViewletter (string lettersid)

View Letter

Retrieve a letter object by its LetterSid.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class LetterViewletterExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new LetterApi();
            var lettersid = lettersid_example;  // string | The unique identifier for a letter object.

            try
            {
                // View Letter
                string result = apiInstance.LetterViewletter(lettersid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LetterApi.LetterViewletter: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lettersid** | **string**| The unique identifier for a letter object. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

