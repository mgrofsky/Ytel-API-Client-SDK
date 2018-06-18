# SwaggerClient::PhoneNumberApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**incomingphone_availablenumber**](PhoneNumberApi.md#incomingphone_availablenumber) | **POST** /incomingphone/availablenumber.json | Available Numbers
[**incomingphone_bulkbuy**](PhoneNumberApi.md#incomingphone_bulkbuy) | **POST** /incomingphone/bulkbuy.json | Bulk Buy Numbers
[**incomingphone_buynumber**](PhoneNumberApi.md#incomingphone_buynumber) | **POST** /incomingphone/buynumber.json | Purchase Number
[**incomingphone_getdidscore**](PhoneNumberApi.md#incomingphone_getdidscore) | **POST** /incomingphone/getdidscore.json | Get DID Score
[**incomingphone_listnumber**](PhoneNumberApi.md#incomingphone_listnumber) | **POST** /incomingphone/listnumber.json | List Numbers
[**incomingphone_massreleasenumber**](PhoneNumberApi.md#incomingphone_massreleasenumber) | **POST** /incomingphone/massreleasenumber.json | Bulk Release
[**incomingphone_massupdatenumber**](PhoneNumberApi.md#incomingphone_massupdatenumber) | **POST** /incomingphone/massupdatenumber.json | Bulk Update Numbers
[**incomingphone_releasenumber_by_response_type_post**](PhoneNumberApi.md#incomingphone_releasenumber_by_response_type_post) | **POST** /incomingphone/releasenumber.{ResponseType} | Release Number
[**incomingphone_transferphonenumbers**](PhoneNumberApi.md#incomingphone_transferphonenumbers) | **POST** /incomingphone/transferphonenumbers.json | Move Number
[**incomingphone_updatenumber**](PhoneNumberApi.md#incomingphone_updatenumber) | **POST** /incomingphone/updatenumber.json | Update Number
[**incomingphone_viewnumber**](PhoneNumberApi.md#incomingphone_viewnumber) | **POST** /incomingphone/viewnumber.json | View Details


# **incomingphone_availablenumber**
> String incomingphone_availablenumber(numbertype, areacode, opts)

Available Numbers

Retrieve a list of available phone numbers that can be purchased and used for your Ytel account.

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

api_instance = SwaggerClient::PhoneNumberApi.new

numbertype = "numbertype_example" # String | Number type either SMS,Voice or all

areacode = "areacode_example" # String | Specifies the area code for the returned list of available numbers. Only available for North American numbers.

opts = { 
  pagesize: 10 # Integer | The count of objects to return.
}

begin
  #Available Numbers
  result = api_instance.incomingphone_availablenumber(numbertype, areacode, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PhoneNumberApi->incomingphone_availablenumber: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **numbertype** | **String**| Number type either SMS,Voice or all | 
 **areacode** | **String**| Specifies the area code for the returned list of available numbers. Only available for North American numbers. | 
 **pagesize** | **Integer**| The count of objects to return. | [optional] [default to 10]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **incomingphone_bulkbuy**
> String incomingphone_bulkbuy(number_type, area_code, quantity, opts)

Bulk Buy Numbers

Purchase a selected number of DID's from specific area codes to be used with your Ytel account.

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

api_instance = SwaggerClient::PhoneNumberApi.new

number_type = "number_type_example" # String | The capability the number supports.

area_code = "area_code_example" # String | Specifies the area code for the returned list of available numbers. Only available for North American numbers.

quantity = "quantity_example" # String | A positive integer that tells how many number you want to buy at a time.

opts = { 
  leftover: "leftover_example" # String | If desired quantity is unavailable purchase what is available .
}

begin
  #Bulk Buy Numbers
  result = api_instance.incomingphone_bulkbuy(number_type, area_code, quantity, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PhoneNumberApi->incomingphone_bulkbuy: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number_type** | **String**| The capability the number supports. | 
 **area_code** | **String**| Specifies the area code for the returned list of available numbers. Only available for North American numbers. | 
 **quantity** | **String**| A positive integer that tells how many number you want to buy at a time. | 
 **leftover** | **String**| If desired quantity is unavailable purchase what is available . | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **incomingphone_buynumber**
> String incomingphone_buynumber(phone_number)

Purchase Number

Purchase a phone number to be used with your Ytel account

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

api_instance = SwaggerClient::PhoneNumberApi.new

phone_number = "phone_number_example" # String | A valid 10-digit Ytel number (E.164 format).


begin
  #Purchase Number
  result = api_instance.incomingphone_buynumber(phone_number)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PhoneNumberApi->incomingphone_buynumber: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone_number** | **String**| A valid 10-digit Ytel number (E.164 format). | 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **incomingphone_getdidscore**
> String incomingphone_getdidscore(phonenumber)

Get DID Score

Get DID Score Number

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

api_instance = SwaggerClient::PhoneNumberApi.new

phonenumber = "phonenumber_example" # String | Specifies the multiple phone numbers for check updated spamscore .


begin
  #Get DID Score
  result = api_instance.incomingphone_getdidscore(phonenumber)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PhoneNumberApi->incomingphone_getdidscore: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phonenumber** | **String**| Specifies the multiple phone numbers for check updated spamscore . | 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **incomingphone_listnumber**
> String incomingphone_listnumber(opts)

List Numbers

Retrieve a list of purchased phones numbers associated with your Ytel account.

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

api_instance = SwaggerClient::PhoneNumberApi.new

opts = { 
  page: 1, # Integer | Which page of the overall response will be returned. Page indexing starts at 1.
  page_size: 10, # Integer | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
  number_type: "number_type_example", # String | The capability supported by the number.Number type either SMS,Voice or all
  friendly_name: "friendly_name_example" # String | A human-readable label added to the number object.
}

begin
  #List Numbers
  result = api_instance.incomingphone_listnumber(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PhoneNumberApi->incomingphone_listnumber: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Which page of the overall response will be returned. Page indexing starts at 1. | [optional] [default to 1]
 **page_size** | **Integer**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 10]
 **number_type** | **String**| The capability supported by the number.Number type either SMS,Voice or all | [optional] 
 **friendly_name** | **String**| A human-readable label added to the number object. | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **incomingphone_massreleasenumber**
> String incomingphone_massreleasenumber(phone_number)

Bulk Release

Remove a purchased Ytel number from your account.

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

api_instance = SwaggerClient::PhoneNumberApi.new

phone_number = "phone_number_example" # String | A valid Ytel comma separated numbers (E.164 format).


begin
  #Bulk Release
  result = api_instance.incomingphone_massreleasenumber(phone_number)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PhoneNumberApi->incomingphone_massreleasenumber: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone_number** | **String**| A valid Ytel comma separated numbers (E.164 format). | 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **incomingphone_massupdatenumber**
> String incomingphone_massupdatenumber(phone_number, voice_url, opts)

Bulk Update Numbers

Update properties for a Ytel numbers that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.

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

api_instance = SwaggerClient::PhoneNumberApi.new

phone_number = "phone_number_example" # String | A valid comma(,) separated Ytel numbers. (E.164 format).

voice_url = "voice_url_example" # String | The URL returning InboundXML incoming calls should execute when connected.

opts = { 
  friendly_name: "friendly_name_example", # String | A human-readable value for labeling the number.
  voice_method: "voice_method_example", # String | Specifies the HTTP method used to request the VoiceUrl once incoming call connects.
  voice_fallback_url: "voice_fallback_url_example", # String | URL used if any errors occur during execution of InboundXML on a call or at initial request of the voice url
  voice_fallback_method: "voice_fallback_method_example", # String | Specifies the HTTP method used to request the VoiceFallbackUrl once incoming call connects.
  hangup_callback: "hangup_callback_example", # String | URL that can be requested to receive notification when and how incoming call has ended.
  hangup_callback_method: "hangup_callback_method_example", # String | The HTTP method Ytel will use when requesting the HangupCallback URL.
  heartbeat_url: "heartbeat_url_example", # String | URL that can be used to monitor the phone number.
  heartbeat_method: "heartbeat_method_example", # String | The HTTP method Ytel will use when requesting the HeartbeatUrl.
  sms_url: "sms_url_example", # String | URL requested when an SMS is received.
  sms_method: "sms_method_example", # String | The HTTP method Ytel will use when requesting the SmsUrl.
  sms_fallback_url: "sms_fallback_url_example", # String | URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl.
  sms_fallback_method: "sms_fallback_method_example" # String | The HTTP method Ytel will use when URL requested if the SmsUrl is not available.
}

begin
  #Bulk Update Numbers
  result = api_instance.incomingphone_massupdatenumber(phone_number, voice_url, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PhoneNumberApi->incomingphone_massupdatenumber: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone_number** | **String**| A valid comma(,) separated Ytel numbers. (E.164 format). | 
 **voice_url** | **String**| The URL returning InboundXML incoming calls should execute when connected. | 
 **friendly_name** | **String**| A human-readable value for labeling the number. | [optional] 
 **voice_method** | **String**| Specifies the HTTP method used to request the VoiceUrl once incoming call connects. | [optional] 
 **voice_fallback_url** | **String**| URL used if any errors occur during execution of InboundXML on a call or at initial request of the voice url | [optional] 
 **voice_fallback_method** | **String**| Specifies the HTTP method used to request the VoiceFallbackUrl once incoming call connects. | [optional] 
 **hangup_callback** | **String**| URL that can be requested to receive notification when and how incoming call has ended. | [optional] 
 **hangup_callback_method** | **String**| The HTTP method Ytel will use when requesting the HangupCallback URL. | [optional] 
 **heartbeat_url** | **String**| URL that can be used to monitor the phone number. | [optional] 
 **heartbeat_method** | **String**| The HTTP method Ytel will use when requesting the HeartbeatUrl. | [optional] 
 **sms_url** | **String**| URL requested when an SMS is received. | [optional] 
 **sms_method** | **String**| The HTTP method Ytel will use when requesting the SmsUrl. | [optional] 
 **sms_fallback_url** | **String**| URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl. | [optional] 
 **sms_fallback_method** | **String**| The HTTP method Ytel will use when URL requested if the SmsUrl is not available. | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **incomingphone_releasenumber_by_response_type_post**
> String incomingphone_releasenumber_by_response_type_post(phone_number, response_type)

Release Number

Remove a purchased Ytel number from your account.

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

api_instance = SwaggerClient::PhoneNumberApi.new

phone_number = "phone_number_example" # String | A valid 10-digit Ytel number (E.164 format).

response_type = "response_type_example" # String | Response type format xml or json


begin
  #Release Number
  result = api_instance.incomingphone_releasenumber_by_response_type_post(phone_number, response_type)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PhoneNumberApi->incomingphone_releasenumber_by_response_type_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone_number** | **String**| A valid 10-digit Ytel number (E.164 format). | 
 **response_type** | **String**| Response type format xml or json | 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **incomingphone_transferphonenumbers**
> String incomingphone_transferphonenumbers(phonenumber, fromaccountsid, toaccountsid)

Move Number

Transfer phone number that has been purchased for from one account to another account.

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

api_instance = SwaggerClient::PhoneNumberApi.new

phonenumber = "phonenumber_example" # String | A valid 10-digit Ytel number (E.164 format).

fromaccountsid = "fromaccountsid_example" # String | A specific Accountsid from where Number is getting transfer.

toaccountsid = "toaccountsid_example" # String | A specific Accountsid to which Number is getting transfer.


begin
  #Move Number
  result = api_instance.incomingphone_transferphonenumbers(phonenumber, fromaccountsid, toaccountsid)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PhoneNumberApi->incomingphone_transferphonenumbers: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phonenumber** | **String**| A valid 10-digit Ytel number (E.164 format). | 
 **fromaccountsid** | **String**| A specific Accountsid from where Number is getting transfer. | 
 **toaccountsid** | **String**| A specific Accountsid to which Number is getting transfer. | 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **incomingphone_updatenumber**
> String incomingphone_updatenumber(phone_number, voice_url, opts)

Update Number

Update properties for a Ytel number that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.

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

api_instance = SwaggerClient::PhoneNumberApi.new

phone_number = "phone_number_example" # String | A valid Ytel number (E.164 format).

voice_url = "voice_url_example" # String | URL requested once the call connects

opts = { 
  friendly_name: "friendly_name_example", # String | Phone number friendly name description
  voice_method: "voice_method_example", # String | Post or Get
  voice_fallback_url: "voice_fallback_url_example", # String | URL requested if the voice URL is not available
  voice_fallback_method: "voice_fallback_method_example", # String | Post or Get
  hangup_callback: "hangup_callback_example", # String | callback url after a hangup occurs
  hangup_callback_method: "hangup_callback_method_example", # String | Post or Get
  heartbeat_url: "heartbeat_url_example", # String | URL requested once the call connects
  heartbeat_method: "heartbeat_method_example", # String | URL that can be requested every 60 seconds during the call to notify of elapsed time
  sms_url: "sms_url_example", # String | URL requested when an SMS is received
  sms_method: "sms_method_example", # String | Post or Get
  sms_fallback_url: "sms_fallback_url_example", # String | URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl.
  sms_fallback_method: "sms_fallback_method_example" # String | The HTTP method Ytel will use when URL requested if the SmsUrl is not available.
}

begin
  #Update Number
  result = api_instance.incomingphone_updatenumber(phone_number, voice_url, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PhoneNumberApi->incomingphone_updatenumber: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone_number** | **String**| A valid Ytel number (E.164 format). | 
 **voice_url** | **String**| URL requested once the call connects | 
 **friendly_name** | **String**| Phone number friendly name description | [optional] 
 **voice_method** | **String**| Post or Get | [optional] 
 **voice_fallback_url** | **String**| URL requested if the voice URL is not available | [optional] 
 **voice_fallback_method** | **String**| Post or Get | [optional] 
 **hangup_callback** | **String**| callback url after a hangup occurs | [optional] 
 **hangup_callback_method** | **String**| Post or Get | [optional] 
 **heartbeat_url** | **String**| URL requested once the call connects | [optional] 
 **heartbeat_method** | **String**| URL that can be requested every 60 seconds during the call to notify of elapsed time | [optional] 
 **sms_url** | **String**| URL requested when an SMS is received | [optional] 
 **sms_method** | **String**| Post or Get | [optional] 
 **sms_fallback_url** | **String**| URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl. | [optional] 
 **sms_fallback_method** | **String**| The HTTP method Ytel will use when URL requested if the SmsUrl is not available. | [optional] 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **incomingphone_viewnumber**
> String incomingphone_viewnumber(phone_number)

View Details

Retrieve the details for a phone number by its number.

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

api_instance = SwaggerClient::PhoneNumberApi.new

phone_number = "phone_number_example" # String | A valid Ytel 10-digit phone number (E.164 format).


begin
  #View Details
  result = api_instance.incomingphone_viewnumber(phone_number)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PhoneNumberApi->incomingphone_viewnumber: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone_number** | **String**| A valid Ytel 10-digit phone number (E.164 format). | 

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



