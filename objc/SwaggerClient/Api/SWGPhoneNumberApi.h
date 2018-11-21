#import <Foundation/Foundation.h>
#import "SWGApi.h"

/**
* Ytel API V3
* Ytel API version 3
*
* OpenAPI spec version: 3.12
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/



@interface SWGPhoneNumberApi: NSObject <SWGApi>

extern NSString* kSWGPhoneNumberApiErrorDomain;
extern NSInteger kSWGPhoneNumberApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(SWGApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// Available Numbers
/// Retrieve a list of available phone numbers that can be purchased and used for your Ytel account.
///
/// @param numbertype Number type either SMS,Voice or all
/// @param areacode Specifies the area code for the returned list of available numbers. Only available for North American numbers.
/// @param pagesize The count of objects to return. (optional) (default to 10)
/// 
///  code:200 message:""
///
/// @return NSString*
-(NSURLSessionTask*) incomingphoneAvailablenumberWithNumbertype: (NSString*) numbertype
    areacode: (NSString*) areacode
    pagesize: (NSNumber*) pagesize
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;


/// Bulk Buy Numbers
/// Purchase a selected number of DID's from specific area codes to be used with your Ytel account.
///
/// @param numberType The capability the number supports.
/// @param areaCode Specifies the area code for the returned list of available numbers. Only available for North American numbers.
/// @param quantity A positive integer that tells how many number you want to buy at a time.
/// @param leftover If desired quantity is unavailable purchase what is available . (optional)
/// 
///  code:200 message:""
///
/// @return NSString*
-(NSURLSessionTask*) incomingphoneBulkbuyWithNumberType: (NSString*) numberType
    areaCode: (NSString*) areaCode
    quantity: (NSString*) quantity
    leftover: (NSString*) leftover
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;


/// Purchase Number
/// Purchase a phone number to be used with your Ytel account
///
/// @param phoneNumber A valid 10-digit Ytel number (E.164 format).
/// 
///  code:200 message:""
///
/// @return NSString*
-(NSURLSessionTask*) incomingphoneBuynumberWithPhoneNumber: (NSString*) phoneNumber
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;


/// Get DID Score
/// Get DID Score Number
///
/// @param phonenumber Specifies the multiple phone numbers for check updated spamscore .
/// 
///  code:200 message:""
///
/// @return NSString*
-(NSURLSessionTask*) incomingphoneGetdidscoreWithPhonenumber: (NSString*) phonenumber
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;


/// List Numbers
/// Retrieve a list of purchased phones numbers associated with your Ytel account.
///
/// @param page Which page of the overall response will be returned. Page indexing starts at 1. (optional) (default to 1)
/// @param pageSize The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) (default to 10)
/// @param numberType The capability supported by the number.Number type either SMS,Voice or all (optional)
/// @param friendlyName A human-readable label added to the number object. (optional)
/// 
///  code:200 message:""
///
/// @return NSString*
-(NSURLSessionTask*) incomingphoneListnumberWithPage: (NSNumber*) page
    pageSize: (NSNumber*) pageSize
    numberType: (NSString*) numberType
    friendlyName: (NSString*) friendlyName
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;


/// Bulk Release
/// Remove a purchased Ytel number from your account.
///
/// @param phoneNumber A valid Ytel comma separated numbers (E.164 format).
/// 
///  code:200 message:""
///
/// @return NSString*
-(NSURLSessionTask*) incomingphoneMassreleasenumberWithPhoneNumber: (NSString*) phoneNumber
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;


/// Bulk Update Numbers
/// Update properties for a Ytel numbers that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.
///
/// @param phoneNumber A valid comma(,) separated Ytel numbers. (E.164 format).
/// @param voiceUrl The URL returning InboundXML incoming calls should execute when connected.
/// @param friendlyName A human-readable value for labeling the number. (optional)
/// @param voiceMethod Specifies the HTTP method used to request the VoiceUrl once incoming call connects. (optional)
/// @param voiceFallbackUrl URL used if any errors occur during execution of InboundXML on a call or at initial request of the voice url (optional)
/// @param voiceFallbackMethod Specifies the HTTP method used to request the VoiceFallbackUrl once incoming call connects. (optional)
/// @param hangupCallback URL that can be requested to receive notification when and how incoming call has ended. (optional)
/// @param hangupCallbackMethod The HTTP method Ytel will use when requesting the HangupCallback URL. (optional)
/// @param heartbeatUrl URL that can be used to monitor the phone number. (optional)
/// @param heartbeatMethod The HTTP method Ytel will use when requesting the HeartbeatUrl. (optional)
/// @param smsUrl URL requested when an SMS is received. (optional)
/// @param smsMethod The HTTP method Ytel will use when requesting the SmsUrl. (optional)
/// @param smsFallbackUrl URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl. (optional)
/// @param smsFallbackMethod The HTTP method Ytel will use when URL requested if the SmsUrl is not available. (optional)
/// 
///  code:200 message:""
///
/// @return NSString*
-(NSURLSessionTask*) incomingphoneMassupdatenumberWithPhoneNumber: (NSString*) phoneNumber
    voiceUrl: (NSString*) voiceUrl
    friendlyName: (NSString*) friendlyName
    voiceMethod: (NSString*) voiceMethod
    voiceFallbackUrl: (NSString*) voiceFallbackUrl
    voiceFallbackMethod: (NSString*) voiceFallbackMethod
    hangupCallback: (NSString*) hangupCallback
    hangupCallbackMethod: (NSString*) hangupCallbackMethod
    heartbeatUrl: (NSString*) heartbeatUrl
    heartbeatMethod: (NSString*) heartbeatMethod
    smsUrl: (NSString*) smsUrl
    smsMethod: (NSString*) smsMethod
    smsFallbackUrl: (NSString*) smsFallbackUrl
    smsFallbackMethod: (NSString*) smsFallbackMethod
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;


/// Release Number
/// Remove a purchased Ytel number from your account.
///
/// @param phoneNumber A valid 10-digit Ytel number (E.164 format).
/// 
///  code:200 message:""
///
/// @return NSString*
-(NSURLSessionTask*) incomingphoneReleasenumberByResponseTypePostWithPhoneNumber: (NSString*) phoneNumber
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;


/// Move Number
/// Transfer phone number that has been purchased for from one account to another account.
///
/// @param phonenumber A valid 10-digit Ytel number (E.164 format).
/// @param fromaccountsid A specific Accountsid from where Number is getting transfer.
/// @param toaccountsid A specific Accountsid to which Number is getting transfer.
/// 
///  code:200 message:""
///
/// @return NSString*
-(NSURLSessionTask*) incomingphoneTransferphonenumbersWithPhonenumber: (NSString*) phonenumber
    fromaccountsid: (NSString*) fromaccountsid
    toaccountsid: (NSString*) toaccountsid
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;


/// Update Number
/// Update properties for a Ytel number that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.
///
/// @param phoneNumber A valid Ytel number (E.164 format).
/// @param voiceUrl URL requested once the call connects
/// @param friendlyName Phone number friendly name description (optional)
/// @param voiceMethod Post or Get (optional)
/// @param voiceFallbackUrl URL requested if the voice URL is not available (optional)
/// @param voiceFallbackMethod Post or Get (optional)
/// @param hangupCallback callback url after a hangup occurs (optional)
/// @param hangupCallbackMethod Post or Get (optional)
/// @param heartbeatUrl URL requested once the call connects (optional)
/// @param heartbeatMethod URL that can be requested every 60 seconds during the call to notify of elapsed time (optional)
/// @param smsUrl URL requested when an SMS is received (optional)
/// @param smsMethod Post or Get (optional)
/// @param smsFallbackUrl URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl. (optional)
/// @param smsFallbackMethod The HTTP method Ytel will use when URL requested if the SmsUrl is not available. (optional)
/// 
///  code:200 message:""
///
/// @return NSString*
-(NSURLSessionTask*) incomingphoneUpdatenumberWithPhoneNumber: (NSString*) phoneNumber
    voiceUrl: (NSString*) voiceUrl
    friendlyName: (NSString*) friendlyName
    voiceMethod: (NSString*) voiceMethod
    voiceFallbackUrl: (NSString*) voiceFallbackUrl
    voiceFallbackMethod: (NSString*) voiceFallbackMethod
    hangupCallback: (NSString*) hangupCallback
    hangupCallbackMethod: (NSString*) hangupCallbackMethod
    heartbeatUrl: (NSString*) heartbeatUrl
    heartbeatMethod: (NSString*) heartbeatMethod
    smsUrl: (NSString*) smsUrl
    smsMethod: (NSString*) smsMethod
    smsFallbackUrl: (NSString*) smsFallbackUrl
    smsFallbackMethod: (NSString*) smsFallbackMethod
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;


/// View Details
/// Retrieve the details for a phone number by its number.
///
/// @param phoneNumber A valid Ytel 10-digit phone number (E.164 format).
/// 
///  code:200 message:""
///
/// @return NSString*
-(NSURLSessionTask*) incomingphoneViewnumberWithPhoneNumber: (NSString*) phoneNumber
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;



@end
