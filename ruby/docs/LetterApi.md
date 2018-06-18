# SwaggerClient::LetterApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**letter_create**](LetterApi.md#letter_create) | **POST** /letter/create.json | Create Letter
[**letter_delete**](LetterApi.md#letter_delete) | **POST** /letter/delete.json | Delete Letter
[**letter_listsletter**](LetterApi.md#letter_listsletter) | **POST** /letter/listsletter.json | List Letters
[**letter_viewletter**](LetterApi.md#letter_viewletter) | **POST** /letter/viewletter.json | View Letter


# **letter_create**
> String letter_create(to, from, attachbyid, file, color, opts)

Create Letter

Create, print, and mail a letter to an address. The letter file must be supplied as a PDF or an HTML string.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: auth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::LetterApi.new

to = "to_example" # String | The AddressId or an object structured when creating an address by addresses/Create.

from = "from_example" # String | The AddressId or an object structured when creating an address by addresses/Create.

attachbyid = "attachbyid_example" # String | Set an existing letter by attaching its LetterId.

file = "file_example" # String | File can be a 8.5\"x11\" PDF uploaded file or URL that links to a file.

color = "color_example" # String | Specify if letter should be printed in color.

opts = { 
  description: "description_example", # String | A description for the letter.
  extraservice: "extraservice_example", # String | Add an extra service to your letter. Options are \"certified\" or \"registered\". Certified provides tracking and delivery confirmation for domestic destinations and is an additional $5.00. Registered provides tracking and confirmation for international addresses and is an additional $16.50.
  doublesided: "doublesided_example", # String | Specify if letter should be printed on both sides.
  template: "template_example", # String | Boolean that defaults to true. When set to false, this specifies that your letter does not follow the m360 address template. In this case, a blank address page will be inserted at the beginning of your file and you will be charged for the extra page.
  htmldata: "htmldata_example" # String | A string value that contains HTML markup.
}

begin
  #Create Letter
  result = api_instance.letter_create(to, from, attachbyid, file, color, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling LetterApi->letter_create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **to** | **String**| The AddressId or an object structured when creating an address by addresses/Create. | 
 **from** | **String**| The AddressId or an object structured when creating an address by addresses/Create. | 
 **attachbyid** | **String**| Set an existing letter by attaching its LetterId. | 
 **file** | **String**| File can be a 8.5\&quot;x11\&quot; PDF uploaded file or URL that links to a file. | 
 **color** | **String**| Specify if letter should be printed in color. | 
 **description** | **String**| A description for the letter. | [optional] 
 **extraservice** | **String**| Add an extra service to your letter. Options are \&quot;certified\&quot; or \&quot;registered\&quot;. Certified provides tracking and delivery confirmation for domestic destinations and is an additional $5.00. Registered provides tracking and confirmation for international addresses and is an additional $16.50. | [optional] 
 **doublesided** | **String**| Specify if letter should be printed on both sides. | [optional] 
 **template** | **String**| Boolean that defaults to true. When set to false, this specifies that your letter does not follow the m360 address template. In this case, a blank address page will be inserted at the beginning of your file and you will be charged for the extra page. | [optional] 
 **htmldata** | **String**| A string value that contains HTML markup. | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **letter_delete**
> String letter_delete(lettersid)

Delete Letter

Remove a letter object by its LetterId.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: auth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::LetterApi.new

lettersid = "lettersid_example" # String | The unique identifier for a letter object.


begin
  #Delete Letter
  result = api_instance.letter_delete(lettersid)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling LetterApi->letter_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lettersid** | **String**| The unique identifier for a letter object. | 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **letter_listsletter**
> String letter_listsletter(opts)

List Letters

Retrieve a list of letter objects. The letter objects are sorted by creation date, with the most recently created letters appearing first.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: auth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::LetterApi.new

opts = { 
  page: 1, # Integer | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
  pagesize: 10, # Integer | The count of objects to return per page.
  lettersid: "lettersid_example", # String | The unique identifier for a letter object.
  date_created: "date_created_example" # String | The date the letter was created.
}

begin
  #List Letters
  result = api_instance.letter_listsletter(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling LetterApi->letter_listsletter: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **Integer**| The count of objects to return per page. | [optional] [default to 10]
 **lettersid** | **String**| The unique identifier for a letter object. | [optional] 
 **date_created** | **String**| The date the letter was created. | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **letter_viewletter**
> String letter_viewletter(lettersid)

View Letter

Retrieve a letter object by its LetterSid.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: auth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::LetterApi.new

lettersid = "lettersid_example" # String | The unique identifier for a letter object.


begin
  #View Letter
  result = api_instance.letter_viewletter(lettersid)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling LetterApi->letter_viewletter: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lettersid** | **String**| The unique identifier for a letter object. | 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



