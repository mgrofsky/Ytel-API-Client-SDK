# swagger-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-android-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.api.AccountApi;

public class AccountApiExample {

    public static void main(String[] args) {
        AccountApi apiInstance = new AccountApi();
        String date = "date_example"; // String | Filter account information based on date.
        try {
            String result = apiInstance.accountsViewaccount(date);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#accountsViewaccount");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.ytel.com/api/v3*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountApi* | [**accountsViewaccount**](docs/AccountApi.md#accountsViewaccount) | **POST** /accounts/viewaccount.json | View Account
*AddressApi* | [**addressCreateaddress**](docs/AddressApi.md#addressCreateaddress) | **POST** /address/createaddress.json | Create Address
*AddressApi* | [**addressDeleteaddress**](docs/AddressApi.md#addressDeleteaddress) | **POST** /address/deleteaddress.json | Delete Address
*AddressApi* | [**addressListaddress**](docs/AddressApi.md#addressListaddress) | **POST** /address/listaddress.json | List Addresses
*AddressApi* | [**addressVerifyaddress**](docs/AddressApi.md#addressVerifyaddress) | **POST** /address/verifyaddress.json | Verify Address
*AddressApi* | [**addressViewaddress**](docs/AddressApi.md#addressViewaddress) | **POST** /address/viewaddress.json | View Address
*AreaMailApi* | [**areamailCreate**](docs/AreaMailApi.md#areamailCreate) | **POST** /areamail/create.json | Create AreaMail
*AreaMailApi* | [**areamailDelete**](docs/AreaMailApi.md#areamailDelete) | **POST** /areamail/delete.json | Delete AreaMail
*AreaMailApi* | [**areamailLists**](docs/AreaMailApi.md#areamailLists) | **POST** /areamail/lists.json | List AreaMails
*AreaMailApi* | [**areamailView**](docs/AreaMailApi.md#areamailView) | **POST** /areamail/view.json | View AreaMail
*CallApi* | [**callsGroupcall**](docs/CallApi.md#callsGroupcall) | **POST** /calls/groupcall.json | Group Call
*CallApi* | [**callsInterruptcalls**](docs/CallApi.md#callsInterruptcalls) | **POST** /calls/interruptcalls.json | Interrupt Call
*CallApi* | [**callsListcalls**](docs/CallApi.md#callsListcalls) | **POST** /calls/listcalls.json | List Calls
*CallApi* | [**callsMakecall**](docs/CallApi.md#callsMakecall) | **POST** /calls/makecall.json | Make Call
*CallApi* | [**callsMakervm**](docs/CallApi.md#callsMakervm) | **POST** /calls/makervm.json | Send RVM
*CallApi* | [**callsPlayaudios**](docs/CallApi.md#callsPlayaudios) | **POST** /calls/playaudios.json | Play Audio
*CallApi* | [**callsRecordcalls**](docs/CallApi.md#callsRecordcalls) | **POST** /calls/recordcalls.json | Record Call
*CallApi* | [**callsSenddigits**](docs/CallApi.md#callsSenddigits) | **POST** /calls/senddigits.json | Play DTMF
*CallApi* | [**callsViewcalldetail**](docs/CallApi.md#callsViewcalldetail) | **POST** /calls/viewcalldetail.json | View Call
*CallApi* | [**callsViewcalls**](docs/CallApi.md#callsViewcalls) | **POST** /calls/viewcalls.json | View Call
*CallApi* | [**callsVoiceeffect**](docs/CallApi.md#callsVoiceeffect) | **POST** /calls/voiceeffect.json | Voice Effect
*CarrierApi* | [**carrierLookup**](docs/CarrierApi.md#carrierLookup) | **POST** /carrier/lookup.json | Lookup Carrier
*CarrierApi* | [**carrierLookuplist**](docs/CarrierApi.md#carrierLookuplist) | **POST** /carrier/lookuplist.json | Carrier Results
*ConferenceApi* | [**conferencesAddParticipant**](docs/ConferenceApi.md#conferencesAddParticipant) | **POST** /conferences/addParticipant.json | Add Participant
*ConferenceApi* | [**conferencesCreateConference**](docs/ConferenceApi.md#conferencesCreateConference) | **POST** /conferences/createConference.json | Create Conference
*ConferenceApi* | [**conferencesDeafMuteParticipant**](docs/ConferenceApi.md#conferencesDeafMuteParticipant) | **POST** /conferences/deafMuteParticipant.json | Silence Participant
*ConferenceApi* | [**conferencesHangupParticipant**](docs/ConferenceApi.md#conferencesHangupParticipant) | **POST** /conferences/hangupParticipant.json | Hangup Participant
*ConferenceApi* | [**conferencesListParticipant**](docs/ConferenceApi.md#conferencesListParticipant) | **POST** /conferences/listParticipant.json | List Participants
*ConferenceApi* | [**conferencesListconference**](docs/ConferenceApi.md#conferencesListconference) | **POST** /conferences/listconference.json | List Conferences
*ConferenceApi* | [**conferencesPlayAudio**](docs/ConferenceApi.md#conferencesPlayAudio) | **POST** /conferences/playAudio.json | Play Audio
*ConferenceApi* | [**conferencesViewParticipant**](docs/ConferenceApi.md#conferencesViewParticipant) | **POST** /conferences/viewParticipant.json | View Participant
*ConferenceApi* | [**conferencesViewconference**](docs/ConferenceApi.md#conferencesViewconference) | **POST** /conferences/viewconference.json | View Conference
*EmailApi* | [**emailAddunsubscribesemail**](docs/EmailApi.md#emailAddunsubscribesemail) | **POST** /email/addunsubscribesemail.json | Add Email Unsubscribe
*EmailApi* | [**emailDeleteblocksemail**](docs/EmailApi.md#emailDeleteblocksemail) | **POST** /email/deleteblocksemail.json | Remove Blocked Address
*EmailApi* | [**emailDeletebouncesemail**](docs/EmailApi.md#emailDeletebouncesemail) | **POST** /email/deletebouncesemail.json | Remove Bounced Email
*EmailApi* | [**emailDeleteinvalidemail**](docs/EmailApi.md#emailDeleteinvalidemail) | **POST** /email/deleteinvalidemail.json | Remove Invalid Email
*EmailApi* | [**emailDeletespamemail**](docs/EmailApi.md#emailDeletespamemail) | **POST** /email/deletespamemail.json | Remove Spam Address
*EmailApi* | [**emailDeleteunsubscribedemail**](docs/EmailApi.md#emailDeleteunsubscribedemail) | **POST** /email/deleteunsubscribedemail.json | Remove Unsubscribed Email
*EmailApi* | [**emailListblockemail**](docs/EmailApi.md#emailListblockemail) | **POST** /email/listblockemail.json | Blocked Emails
*EmailApi* | [**emailListbounceemail**](docs/EmailApi.md#emailListbounceemail) | **POST** /email/listbounceemail.json | Bounced Emails
*EmailApi* | [**emailListinvalidemail**](docs/EmailApi.md#emailListinvalidemail) | **POST** /email/listinvalidemail.json | Invalid Emails
*EmailApi* | [**emailListspamemail**](docs/EmailApi.md#emailListspamemail) | **POST** /email/listspamemail.json | Spam Emails
*EmailApi* | [**emailListunsubscribedemail**](docs/EmailApi.md#emailListunsubscribedemail) | **POST** /email/listunsubscribedemail.json | List Unsubscribed Emails
*EmailApi* | [**emailSendemails**](docs/EmailApi.md#emailSendemails) | **POST** /email/sendemails.json | Send Email
*LetterApi* | [**letterCreate**](docs/LetterApi.md#letterCreate) | **POST** /letter/create.json | Create Letter
*LetterApi* | [**letterDelete**](docs/LetterApi.md#letterDelete) | **POST** /letter/delete.json | Delete Letter
*LetterApi* | [**letterListsletter**](docs/LetterApi.md#letterListsletter) | **POST** /letter/listsletter.json | List Letters
*LetterApi* | [**letterViewletter**](docs/LetterApi.md#letterViewletter) | **POST** /letter/viewletter.json | View Letter
*PhoneNumberApi* | [**incomingphoneAvailablenumber**](docs/PhoneNumberApi.md#incomingphoneAvailablenumber) | **POST** /incomingphone/availablenumber.json | Available Numbers
*PhoneNumberApi* | [**incomingphoneBulkbuy**](docs/PhoneNumberApi.md#incomingphoneBulkbuy) | **POST** /incomingphone/bulkbuy.json | Bulk Buy Numbers
*PhoneNumberApi* | [**incomingphoneBuynumber**](docs/PhoneNumberApi.md#incomingphoneBuynumber) | **POST** /incomingphone/buynumber.json | Purchase Number
*PhoneNumberApi* | [**incomingphoneGetdidscore**](docs/PhoneNumberApi.md#incomingphoneGetdidscore) | **POST** /incomingphone/getdidscore.json | Get DID Score
*PhoneNumberApi* | [**incomingphoneListnumber**](docs/PhoneNumberApi.md#incomingphoneListnumber) | **POST** /incomingphone/listnumber.json | List Numbers
*PhoneNumberApi* | [**incomingphoneMassreleasenumber**](docs/PhoneNumberApi.md#incomingphoneMassreleasenumber) | **POST** /incomingphone/massreleasenumber.json | Bulk Release
*PhoneNumberApi* | [**incomingphoneMassupdatenumber**](docs/PhoneNumberApi.md#incomingphoneMassupdatenumber) | **POST** /incomingphone/massupdatenumber.json | Bulk Update Numbers
*PhoneNumberApi* | [**incomingphoneReleasenumberByResponseTypePost**](docs/PhoneNumberApi.md#incomingphoneReleasenumberByResponseTypePost) | **POST** /incomingphone/releasenumber.{ResponseType} | Release Number
*PhoneNumberApi* | [**incomingphoneTransferphonenumbers**](docs/PhoneNumberApi.md#incomingphoneTransferphonenumbers) | **POST** /incomingphone/transferphonenumbers.json | Move Number
*PhoneNumberApi* | [**incomingphoneUpdatenumber**](docs/PhoneNumberApi.md#incomingphoneUpdatenumber) | **POST** /incomingphone/updatenumber.json | Update Number
*PhoneNumberApi* | [**incomingphoneViewnumber**](docs/PhoneNumberApi.md#incomingphoneViewnumber) | **POST** /incomingphone/viewnumber.json | View Details
*PostCardApi* | [**postcardCreatepostcard**](docs/PostCardApi.md#postcardCreatepostcard) | **POST** /Postcard/createpostcard.json | Create Postcard
*PostCardApi* | [**postcardDeletepostcard**](docs/PostCardApi.md#postcardDeletepostcard) | **POST** /Postcard/deletepostcard.json | Delete Postcard
*PostCardApi* | [**postcardListpostcard**](docs/PostCardApi.md#postcardListpostcard) | **POST** /Postcard/listpostcard.json | List Postcards
*PostCardApi* | [**postcardViewpostcard**](docs/PostCardApi.md#postcardViewpostcard) | **POST** /Postcard/viewpostcard.json | View Postcard
*RecordingApi* | [**recordingDeleterecording**](docs/RecordingApi.md#recordingDeleterecording) | **POST** /recording/deleterecording.json | Delete Recording
*RecordingApi* | [**recordingListrecording**](docs/RecordingApi.md#recordingListrecording) | **POST** /recording/listrecording.json | List Recordings
*RecordingApi* | [**recordingViewrecording**](docs/RecordingApi.md#recordingViewrecording) | **POST** /recording/viewrecording.json | View Recording
*SMSApi* | [**smsGetinboundsms**](docs/SMSApi.md#smsGetinboundsms) | **POST** /sms/getinboundsms.json | List Inbound SMS
*SMSApi* | [**smsListsms**](docs/SMSApi.md#smsListsms) | **POST** /sms/listsms.json | List SMS
*SMSApi* | [**smsSendsms**](docs/SMSApi.md#smsSendsms) | **POST** /sms/sendsms.json | Send SMS
*SMSApi* | [**smsViewdetailsms**](docs/SMSApi.md#smsViewdetailsms) | **POST** /sms/viewdetailsms.json | View SMS
*SMSApi* | [**smsViewsms**](docs/SMSApi.md#smsViewsms) | **POST** /sms/viewsms.json | View SMS
*SharedShortCodeApi* | [**keywordLists**](docs/SharedShortCodeApi.md#keywordLists) | **POST** /keyword/lists.json | List Keywords
*SharedShortCodeApi* | [**keywordView**](docs/SharedShortCodeApi.md#keywordView) | **POST** /keyword/view.json | View Keyword
*SharedShortCodeApi* | [**shortcodeGetinboundsms**](docs/SharedShortCodeApi.md#shortcodeGetinboundsms) | **POST** /shortcode/getinboundsms.json | List Inbound SMS
*SharedShortCodeApi* | [**shortcodeListshortcode**](docs/SharedShortCodeApi.md#shortcodeListshortcode) | **POST** /shortcode/listshortcode.json | List Shortcodes
*SharedShortCodeApi* | [**shortcodeSendsms**](docs/SharedShortCodeApi.md#shortcodeSendsms) | **POST** /shortcode/sendsms.json | Send SMS
*SharedShortCodeApi* | [**shortcodeUpdateshortcode**](docs/SharedShortCodeApi.md#shortcodeUpdateshortcode) | **POST** /shortcode/updateshortcode.json | Update Shortcode
*SharedShortCodeApi* | [**shortcodeViewshortcode**](docs/SharedShortCodeApi.md#shortcodeViewshortcode) | **POST** /shortcode/viewshortcode.json | View Shortcode
*SharedShortCodeApi* | [**templateLists**](docs/SharedShortCodeApi.md#templateLists) | **POST** /template/lists.json | List Templates
*SharedShortCodeApi* | [**templateView**](docs/SharedShortCodeApi.md#templateView) | **POST** /template/view.json | View Template
*ShortCodeApi* | [**dedicatedshortcodeGetinboundsms**](docs/ShortCodeApi.md#dedicatedshortcodeGetinboundsms) | **POST** /dedicatedshortcode/getinboundsms.json | List Inbound SMS
*ShortCodeApi* | [**dedicatedshortcodeListshortcode**](docs/ShortCodeApi.md#dedicatedshortcodeListshortcode) | **POST** /dedicatedshortcode/listshortcode.json | List Shortcodes
*ShortCodeApi* | [**dedicatedshortcodeSendsms**](docs/ShortCodeApi.md#dedicatedshortcodeSendsms) | **POST** /dedicatedshortcode/sendsms.json | Send SMS
*ShortCodeApi* | [**dedicatedshortcodeUpdateshortcode**](docs/ShortCodeApi.md#dedicatedshortcodeUpdateshortcode) | **POST** /dedicatedshortcode/updateshortcode.json | Update Shortcode
*ShortCodeApi* | [**dedicatedshortcodeViewshortcode**](docs/ShortCodeApi.md#dedicatedshortcodeViewshortcode) | **POST** /dedicatedshortcode/viewshortcode.json | View SMS
*ShortCodeApi* | [**shortcodeListsms**](docs/ShortCodeApi.md#shortcodeListsms) | **POST** /shortcode/listsms.json | List SMS
*ShortCodeApi* | [**shortcodeViewsms**](docs/ShortCodeApi.md#shortcodeViewsms) | **POST** /shortcode/viewsms.json | View SMS
*SubAccountApi* | [**userCreatesubaccount**](docs/SubAccountApi.md#userCreatesubaccount) | **POST** /user/createsubaccount.json | Create Subaccount
*SubAccountApi* | [**userDeletesubaccount**](docs/SubAccountApi.md#userDeletesubaccount) | **POST** /user/deletesubaccount.json | Delete Subaccount
*SubAccountApi* | [**userSubaccountactivation**](docs/SubAccountApi.md#userSubaccountactivation) | **POST** /user/subaccountactivation.json | Toggle Subaccount Status
*TranscriptionApi* | [**transcriptionsAudiourltranscription**](docs/TranscriptionApi.md#transcriptionsAudiourltranscription) | **POST** /transcriptions/audiourltranscription.json | Transcribe Audio URL
*TranscriptionApi* | [**transcriptionsListtranscription**](docs/TranscriptionApi.md#transcriptionsListtranscription) | **POST** /transcriptions/listtranscription.json | List Transcriptions
*TranscriptionApi* | [**transcriptionsRecordingtranscription**](docs/TranscriptionApi.md#transcriptionsRecordingtranscription) | **POST** /transcriptions/recordingtranscription.json | Transcribe Recording
*TranscriptionApi* | [**transcriptionsViewtranscription**](docs/TranscriptionApi.md#transcriptionsViewtranscription) | **POST** /transcriptions/viewtranscription.json | View Transcription
*UsageApi* | [**usageListusage**](docs/UsageApi.md#usageListusage) | **POST** /usage/listusage.json | List Usage


## Documentation for Models

 - [Activate](docs/Activate.md)
 - [ActivateStatus](docs/ActivateStatus.md)
 - [AudioDirection](docs/AudioDirection.md)
 - [AudioFormat](docs/AudioFormat.md)
 - [AudioUrl](docs/AudioUrl.md)
 - [Direction](docs/Direction.md)
 - [Error](docs/Error.md)
 - [Errors](docs/Errors.md)
 - [Fileformat](docs/Fileformat.md)
 - [GroupConfirmFile](docs/GroupConfirmFile.md)
 - [HttpAction](docs/HttpAction.md)
 - [IfMachine](docs/IfMachine.md)
 - [InterruptedCallStatus](docs/InterruptedCallStatus.md)
 - [MergeNumber](docs/MergeNumber.md)
 - [MergeNumberStatus](docs/MergeNumberStatus.md)
 - [Message](docs/Message.md)
 - [NumberType](docs/NumberType.md)
 - [Numbertype16](docs/Numbertype16.md)
 - [PlayDtmfDirection](docs/PlayDtmfDirection.md)
 - [ProductCode](docs/ProductCode.md)
 - [ProductCode27](docs/ProductCode27.md)
 - [SendEmailAs](docs/SendEmailAs.md)
 - [Status](docs/Status.md)
 - [Status24](docs/Status24.md)
 - [TemplateData](docs/TemplateData.md)
 - [Type](docs/Type.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### auth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



