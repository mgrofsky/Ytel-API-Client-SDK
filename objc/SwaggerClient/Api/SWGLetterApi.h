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



@interface SWGLetterApi: NSObject <SWGApi>

extern NSString* kSWGLetterApiErrorDomain;
extern NSInteger kSWGLetterApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(SWGApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// Create Letter
/// Create, print, and mail a letter to an address. The letter file must be supplied as a PDF or an HTML string.
///
/// @param to The AddressId or an object structured when creating an address by addresses/Create.
/// @param from The AddressId or an object structured when creating an address by addresses/Create.
/// @param attachbyid Set an existing letter by attaching its LetterId.
/// @param file File can be a 8.5\&quot;x11\&quot; PDF uploaded file or URL that links to a file.
/// @param color Specify if letter should be printed in color.
/// @param _description A description for the letter. (optional)
/// @param extraservice Add an extra service to your letter. Options are \&quot;certified\&quot; or \&quot;registered\&quot;. Certified provides tracking and delivery confirmation for domestic destinations and is an additional $5.00. Registered provides tracking and confirmation for international addresses and is an additional $16.50. (optional)
/// @param doublesided Specify if letter should be printed on both sides. (optional)
/// @param template Boolean that defaults to true. When set to false, this specifies that your letter does not follow the m360 address template. In this case, a blank address page will be inserted at the beginning of your file and you will be charged for the extra page. (optional)
/// @param htmldata A string value that contains HTML markup. (optional)
/// 
///  code:200 message:""
///
/// @return NSString*
-(NSURLSessionTask*) letterCreateWithTo: (NSString*) to
    from: (NSString*) from
    attachbyid: (NSString*) attachbyid
    file: (NSString*) file
    color: (NSString*) color
    _description: (NSString*) _description
    extraservice: (NSString*) extraservice
    doublesided: (NSString*) doublesided
    template: (NSString*) template
    htmldata: (NSString*) htmldata
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;


/// Delete Letter
/// Remove a letter object by its LetterId.
///
/// @param lettersid The unique identifier for a letter object.
/// 
///  code:200 message:""
///
/// @return NSString*
-(NSURLSessionTask*) letterDeleteWithLettersid: (NSString*) lettersid
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;


/// List Letters
/// Retrieve a list of letter objects. The letter objects are sorted by creation date, with the most recently created letters appearing first.
///
/// @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) (default to 1)
/// @param pagesize The count of objects to return per page. (optional) (default to 10)
/// @param lettersid The unique identifier for a letter object. (optional)
/// @param dateCreated The date the letter was created. (optional)
/// 
///  code:200 message:""
///
/// @return NSString*
-(NSURLSessionTask*) letterListsletterWithPage: (NSNumber*) page
    pagesize: (NSNumber*) pagesize
    lettersid: (NSString*) lettersid
    dateCreated: (NSString*) dateCreated
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;


/// View Letter
/// Retrieve a letter object by its LetterSid.
///
/// @param lettersid The unique identifier for a letter object.
/// 
///  code:200 message:""
///
/// @return NSString*
-(NSURLSessionTask*) letterViewletterWithLettersid: (NSString*) lettersid
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;



@end
