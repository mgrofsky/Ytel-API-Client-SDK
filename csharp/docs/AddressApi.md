# IO.Swagger.Api.AddressApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AddressCreateaddress**](AddressApi.md#addresscreateaddress) | **POST** /address/createaddress.json | Create Address
[**AddressDeleteaddress**](AddressApi.md#addressdeleteaddress) | **POST** /address/deleteaddress.json | Delete Address
[**AddressListaddress**](AddressApi.md#addresslistaddress) | **POST** /address/listaddress.json | List Addresses
[**AddressVerifyaddress**](AddressApi.md#addressverifyaddress) | **POST** /address/verifyaddress.json | Verify Address
[**AddressViewaddress**](AddressApi.md#addressviewaddress) | **POST** /address/viewaddress.json | View Address


<a name="addresscreateaddress"></a>
# **AddressCreateaddress**
> string AddressCreateaddress (string name, string address, string country, string state, string city, string zip, string description = null, string email = null, string phone = null)

Create Address

To add an address to your address book, you create a new address object. You can retrieve and delete individual addresses as well as get a list of addresses. Addresses are identified by a unique random ID.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class AddressCreateaddressExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new AddressApi();
            var name = name_example;  // string | Name of user
            var address = address_example;  // string | Address of user.
            var country = country_example;  // string | Must be a 2 letter country short-name code (ISO 3166)
            var state = state_example;  // string | Must be a 2 letter State eg. CA for US. For Some Countries it can be greater than 2 letters.
            var city = city_example;  // string | City Name.
            var zip = zip_example;  // string | Zip code of city.
            var description = description_example;  // string | Description of addresses. (optional) 
            var email = email_example;  // string | Email Id of user. (optional) 
            var phone = phone_example;  // string | Phone number of user. (optional) 

            try
            {
                // Create Address
                string result = apiInstance.AddressCreateaddress(name, address, country, state, city, zip, description, email, phone);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AddressApi.AddressCreateaddress: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **string**| Name of user | 
 **address** | **string**| Address of user. | 
 **country** | **string**| Must be a 2 letter country short-name code (ISO 3166) | 
 **state** | **string**| Must be a 2 letter State eg. CA for US. For Some Countries it can be greater than 2 letters. | 
 **city** | **string**| City Name. | 
 **zip** | **string**| Zip code of city. | 
 **description** | **string**| Description of addresses. | [optional] 
 **email** | **string**| Email Id of user. | [optional] 
 **phone** | **string**| Phone number of user. | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="addressdeleteaddress"></a>
# **AddressDeleteaddress**
> string AddressDeleteaddress (string addressid)

Delete Address

To delete Address to your address book

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class AddressDeleteaddressExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new AddressApi();
            var addressid = addressid_example;  // string | The identifier of the address to be deleted.

            try
            {
                // Delete Address
                string result = apiInstance.AddressDeleteaddress(addressid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AddressApi.AddressDeleteaddress: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addressid** | **string**| The identifier of the address to be deleted. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="addresslistaddress"></a>
# **AddressListaddress**
> string AddressListaddress (int? page = null, int? pagesize = null, string addressid = null, string dateCreated = null)

List Addresses

List All Address 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class AddressListaddressExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new AddressApi();
            var page = 56;  // int? | The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional)  (default to 1)
            var pagesize = 56;  // int? | How many results to return, default is 10, max is 100, must be an integer (optional)  (default to 10)
            var addressid = addressid_example;  // string | addresses Sid (optional) 
            var dateCreated = dateCreated_example;  // string | date created address. (optional) 

            try
            {
                // List Addresses
                string result = apiInstance.AddressListaddress(page, pagesize, addressid, dateCreated);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AddressApi.AddressListaddress: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int?**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **int?**| How many results to return, default is 10, max is 100, must be an integer | [optional] [default to 10]
 **addressid** | **string**| addresses Sid | [optional] 
 **dateCreated** | **string**| date created address. | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="addressverifyaddress"></a>
# **AddressVerifyaddress**
> string AddressVerifyaddress (string addressid)

Verify Address

Validates an address given.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class AddressVerifyaddressExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new AddressApi();
            var addressid = addressid_example;  // string | The identifier of the address to be verified.

            try
            {
                // Verify Address
                string result = apiInstance.AddressVerifyaddress(addressid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AddressApi.AddressVerifyaddress: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addressid** | **string**| The identifier of the address to be verified. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="addressviewaddress"></a>
# **AddressViewaddress**
> string AddressViewaddress (string addressid)

View Address

View Address Specific address Book by providing the address id

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class AddressViewaddressExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new AddressApi();
            var addressid = addressid_example;  // string | The identifier of the address to be retrieved.

            try
            {
                // View Address
                string result = apiInstance.AddressViewaddress(addressid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AddressApi.AddressViewaddress: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addressid** | **string**| The identifier of the address to be retrieved. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

