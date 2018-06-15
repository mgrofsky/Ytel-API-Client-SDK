# Go API client for swagger

Ytel API version 3

## Overview
This API client was generated by the [swagger-codegen](https://github.com/swagger-api/swagger-codegen) project.  By using the [swagger-spec](https://github.com/swagger-api/swagger-spec) from a remote server, you can easily generate an API client.

- API version: 3.0
- Package version: 1.0.0
- Build package: io.swagger.codegen.languages.GoClientCodegen

## Installation
Put the package under your project folder and add the following in import:
```
    "./swagger"
```

## Documentation for API Endpoints

All URIs are relative to *https://api.message360.com/api/v3/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountApi* | [**AccountsViewaccount**](docs/AccountApi.md#accountsviewaccount) | **Post** /accounts/viewaccount.json | View Account
*AddressApi* | [**AddressCreateaddress**](docs/AddressApi.md#addresscreateaddress) | **Post** /address/createaddress.json | Create Address
*AddressApi* | [**AddressDeleteaddress**](docs/AddressApi.md#addressdeleteaddress) | **Post** /address/deleteaddress.json | Delete Address
*AddressApi* | [**AddressListaddress**](docs/AddressApi.md#addresslistaddress) | **Post** /address/listaddress.json | List Addresses
*AddressApi* | [**AddressVerifyaddress**](docs/AddressApi.md#addressverifyaddress) | **Post** /address/verifyaddress.json | Verify Address
*AddressApi* | [**AddressViewaddress**](docs/AddressApi.md#addressviewaddress) | **Post** /address/viewaddress.json | View Address
*AreaMailApi* | [**AreamailCreate**](docs/AreaMailApi.md#areamailcreate) | **Post** /areamail/create.json | Create AreaMail
*AreaMailApi* | [**AreamailDelete**](docs/AreaMailApi.md#areamaildelete) | **Post** /areamail/delete.json | Delete AreaMail
*AreaMailApi* | [**AreamailLists**](docs/AreaMailApi.md#areamaillists) | **Post** /areamail/lists.json | List AreaMails
*AreaMailApi* | [**AreamailView**](docs/AreaMailApi.md#areamailview) | **Post** /areamail/view.json | View AreaMail
*CallApi* | [**CallsGroupcall**](docs/CallApi.md#callsgroupcall) | **Post** /calls/groupcall.json | Group Call
*CallApi* | [**CallsInterruptcalls**](docs/CallApi.md#callsinterruptcalls) | **Post** /calls/interruptcalls.json | Interrupt Call
*CallApi* | [**CallsListcalls**](docs/CallApi.md#callslistcalls) | **Post** /calls/listcalls.json | List Calls
*CallApi* | [**CallsMakecall**](docs/CallApi.md#callsmakecall) | **Post** /calls/makecall.json | Make Call
*CallApi* | [**CallsMakervm**](docs/CallApi.md#callsmakervm) | **Post** /calls/makervm.json | Send RVM
*CallApi* | [**CallsPlayaudios**](docs/CallApi.md#callsplayaudios) | **Post** /calls/playaudios.json | Play Audio
*CallApi* | [**CallsRecordcalls**](docs/CallApi.md#callsrecordcalls) | **Post** /calls/recordcalls.json | Record Call
*CallApi* | [**CallsSenddigits**](docs/CallApi.md#callssenddigits) | **Post** /calls/senddigits.json | Play DTMF
*CallApi* | [**CallsViewcalldetail**](docs/CallApi.md#callsviewcalldetail) | **Post** /calls/viewcalldetail.json | View Call
*CallApi* | [**CallsViewcalls**](docs/CallApi.md#callsviewcalls) | **Post** /calls/viewcalls.json | View Call
*CallApi* | [**CallsVoiceeffect**](docs/CallApi.md#callsvoiceeffect) | **Post** /calls/voiceeffect.json | Voice Effect
*CarrierApi* | [**CarrierLookup**](docs/CarrierApi.md#carrierlookup) | **Post** /carrier/lookup.json | Lookup Carrier
*CarrierApi* | [**CarrierLookuplist**](docs/CarrierApi.md#carrierlookuplist) | **Post** /carrier/lookuplist.json | Carrier Results
*ConferenceApi* | [**ConferencesAddParticipant**](docs/ConferenceApi.md#conferencesaddparticipant) | **Post** /conferences/addParticipant.json | Add Participant
*ConferenceApi* | [**ConferencesCreateConference**](docs/ConferenceApi.md#conferencescreateconference) | **Post** /conferences/createConference.json | Create Conference
*ConferenceApi* | [**ConferencesDeafMuteParticipant**](docs/ConferenceApi.md#conferencesdeafmuteparticipant) | **Post** /conferences/deafMuteParticipant.json | Silence Participant
*ConferenceApi* | [**ConferencesHangupParticipant**](docs/ConferenceApi.md#conferenceshangupparticipant) | **Post** /conferences/hangupParticipant.json | Hangup Participant
*ConferenceApi* | [**ConferencesListParticipant**](docs/ConferenceApi.md#conferenceslistparticipant) | **Post** /conferences/listParticipant.json | List Participants
*ConferenceApi* | [**ConferencesListconference**](docs/ConferenceApi.md#conferenceslistconference) | **Post** /conferences/listconference.json | List Conferences
*ConferenceApi* | [**ConferencesPlayAudio**](docs/ConferenceApi.md#conferencesplayaudio) | **Post** /conferences/playAudio.json | Play Audio
*ConferenceApi* | [**ConferencesViewParticipant**](docs/ConferenceApi.md#conferencesviewparticipant) | **Post** /conferences/viewParticipant.json | View Participant
*ConferenceApi* | [**ConferencesViewconference**](docs/ConferenceApi.md#conferencesviewconference) | **Post** /conferences/viewconference.json | View Conference
*EmailApi* | [**EmailAddunsubscribesemail**](docs/EmailApi.md#emailaddunsubscribesemail) | **Post** /email/addunsubscribesemail.json | Add Email Unsubscribe
*EmailApi* | [**EmailDeleteblocksemail**](docs/EmailApi.md#emaildeleteblocksemail) | **Post** /email/deleteblocksemail.json | Remove Blocked Address
*EmailApi* | [**EmailDeletebouncesemail**](docs/EmailApi.md#emaildeletebouncesemail) | **Post** /email/deletebouncesemail.json | Remove Bounced Email
*EmailApi* | [**EmailDeleteinvalidemail**](docs/EmailApi.md#emaildeleteinvalidemail) | **Post** /email/deleteinvalidemail.json | Remove Invalid Email
*EmailApi* | [**EmailDeletespamemail**](docs/EmailApi.md#emaildeletespamemail) | **Post** /email/deletespamemail.json | Remove Spam Address
*EmailApi* | [**EmailDeleteunsubscribedemail**](docs/EmailApi.md#emaildeleteunsubscribedemail) | **Post** /email/deleteunsubscribedemail.json | Remove Unsubscribed Email
*EmailApi* | [**EmailListblockemail**](docs/EmailApi.md#emaillistblockemail) | **Post** /email/listblockemail.json | Blocked Emails
*EmailApi* | [**EmailListbounceemail**](docs/EmailApi.md#emaillistbounceemail) | **Post** /email/listbounceemail.json | Bounced Emails
*EmailApi* | [**EmailListinvalidemail**](docs/EmailApi.md#emaillistinvalidemail) | **Post** /email/listinvalidemail.json | Invalid Emails
*EmailApi* | [**EmailListspamemail**](docs/EmailApi.md#emaillistspamemail) | **Post** /email/listspamemail.json | Spam Emails
*EmailApi* | [**EmailListunsubscribedemail**](docs/EmailApi.md#emaillistunsubscribedemail) | **Post** /email/listunsubscribedemail.json | List Unsubscribed Emails
*EmailApi* | [**EmailSendemails**](docs/EmailApi.md#emailsendemails) | **Post** /email/sendemails.json | Send Email
*LetterApi* | [**LetterCreate**](docs/LetterApi.md#lettercreate) | **Post** /letter/create.json | Create Letter
*LetterApi* | [**LetterDelete**](docs/LetterApi.md#letterdelete) | **Post** /letter/delete.json | Delete Letter
*LetterApi* | [**LetterListsletter**](docs/LetterApi.md#letterlistsletter) | **Post** /letter/listsletter.json | List Letters
*LetterApi* | [**LetterViewletter**](docs/LetterApi.md#letterviewletter) | **Post** /letter/viewletter.json | View Letter
*PhoneNumberApi* | [**IncomingphoneAvailablenumber**](docs/PhoneNumberApi.md#incomingphoneavailablenumber) | **Post** /incomingphone/availablenumber.json | Available Numbers
*PhoneNumberApi* | [**IncomingphoneBulkbuy**](docs/PhoneNumberApi.md#incomingphonebulkbuy) | **Post** /incomingphone/bulkbuy.json | Bulk Buy Numbers
*PhoneNumberApi* | [**IncomingphoneBuynumber**](docs/PhoneNumberApi.md#incomingphonebuynumber) | **Post** /incomingphone/buynumber.json | Purchase Number
*PhoneNumberApi* | [**IncomingphoneGetdidscore**](docs/PhoneNumberApi.md#incomingphonegetdidscore) | **Post** /incomingphone/getdidscore.json | Get DID Score
*PhoneNumberApi* | [**IncomingphoneListnumber**](docs/PhoneNumberApi.md#incomingphonelistnumber) | **Post** /incomingphone/listnumber.json | List Numbers
*PhoneNumberApi* | [**IncomingphoneMassreleasenumber**](docs/PhoneNumberApi.md#incomingphonemassreleasenumber) | **Post** /incomingphone/massreleasenumber.json | Bulk Release
*PhoneNumberApi* | [**IncomingphoneMassupdatenumber**](docs/PhoneNumberApi.md#incomingphonemassupdatenumber) | **Post** /incomingphone/massupdatenumber.json | Bulk Update Numbers
*PhoneNumberApi* | [**IncomingphoneReleasenumberByResponseTypePost**](docs/PhoneNumberApi.md#incomingphonereleasenumberbyresponsetypepost) | **Post** /incomingphone/releasenumber.{ResponseType} | Release Number
*PhoneNumberApi* | [**IncomingphoneTransferphonenumbers**](docs/PhoneNumberApi.md#incomingphonetransferphonenumbers) | **Post** /incomingphone/transferphonenumbers.json | Move Number
*PhoneNumberApi* | [**IncomingphoneUpdatenumber**](docs/PhoneNumberApi.md#incomingphoneupdatenumber) | **Post** /incomingphone/updatenumber.json | Update Number
*PhoneNumberApi* | [**IncomingphoneViewnumber**](docs/PhoneNumberApi.md#incomingphoneviewnumber) | **Post** /incomingphone/viewnumber.json | View Details
*PostCardApi* | [**PostcardCreatepostcard**](docs/PostCardApi.md#postcardcreatepostcard) | **Post** /Postcard/createpostcard.json | Create Postcard
*PostCardApi* | [**PostcardDeletepostcard**](docs/PostCardApi.md#postcarddeletepostcard) | **Post** /Postcard/deletepostcard.json | Delete Postcard
*PostCardApi* | [**PostcardListpostcard**](docs/PostCardApi.md#postcardlistpostcard) | **Post** /Postcard/listpostcard.json | List Postcards
*PostCardApi* | [**PostcardViewpostcard**](docs/PostCardApi.md#postcardviewpostcard) | **Post** /Postcard/viewpostcard.json | View Postcard
*RecordingApi* | [**RecordingDeleterecording**](docs/RecordingApi.md#recordingdeleterecording) | **Post** /recording/deleterecording.json | Delete Recording
*RecordingApi* | [**RecordingListrecording**](docs/RecordingApi.md#recordinglistrecording) | **Post** /recording/listrecording.json | List Recordings
*RecordingApi* | [**RecordingViewrecording**](docs/RecordingApi.md#recordingviewrecording) | **Post** /recording/viewrecording.json | View Recording
*SMSApi* | [**SmsGetinboundsms**](docs/SMSApi.md#smsgetinboundsms) | **Post** /sms/getinboundsms.json | List Inbound SMS
*SMSApi* | [**SmsListsms**](docs/SMSApi.md#smslistsms) | **Post** /sms/listsms.json | List SMS
*SMSApi* | [**SmsSendsms**](docs/SMSApi.md#smssendsms) | **Post** /sms/sendsms.json | Send SMS
*SMSApi* | [**SmsViewdetailsms**](docs/SMSApi.md#smsviewdetailsms) | **Post** /sms/viewdetailsms.json | View SMS
*SMSApi* | [**SmsViewsms**](docs/SMSApi.md#smsviewsms) | **Post** /sms/viewsms.json | View SMS
*SharedShortCodeApi* | [**KeywordLists**](docs/SharedShortCodeApi.md#keywordlists) | **Post** /keyword/lists.json | List Keywords
*SharedShortCodeApi* | [**KeywordView**](docs/SharedShortCodeApi.md#keywordview) | **Post** /keyword/view.json | View Keyword
*SharedShortCodeApi* | [**ShortcodeGetinboundsms**](docs/SharedShortCodeApi.md#shortcodegetinboundsms) | **Post** /shortcode/getinboundsms.json | List Inbound SMS
*SharedShortCodeApi* | [**ShortcodeListshortcode**](docs/SharedShortCodeApi.md#shortcodelistshortcode) | **Post** /shortcode/listshortcode.json | List Shortcodes
*SharedShortCodeApi* | [**ShortcodeSendsms**](docs/SharedShortCodeApi.md#shortcodesendsms) | **Post** /shortcode/sendsms.json | Send SMS
*SharedShortCodeApi* | [**ShortcodeUpdateshortcode**](docs/SharedShortCodeApi.md#shortcodeupdateshortcode) | **Post** /shortcode/updateshortcode.json | Update Shortcode
*SharedShortCodeApi* | [**ShortcodeViewshortcode**](docs/SharedShortCodeApi.md#shortcodeviewshortcode) | **Post** /shortcode/viewshortcode.json | View Shortcode
*SharedShortCodeApi* | [**TemplateLists**](docs/SharedShortCodeApi.md#templatelists) | **Post** /template/lists.json | List Templates
*SharedShortCodeApi* | [**TemplateView**](docs/SharedShortCodeApi.md#templateview) | **Post** /template/view.json | View Template
*ShortCodeApi* | [**DedicatedshortcodeGetinboundsms**](docs/ShortCodeApi.md#dedicatedshortcodegetinboundsms) | **Post** /dedicatedshortcode/getinboundsms.json | List Inbound SMS
*ShortCodeApi* | [**DedicatedshortcodeListshortcode**](docs/ShortCodeApi.md#dedicatedshortcodelistshortcode) | **Post** /dedicatedshortcode/listshortcode.json | List Shortcodes
*ShortCodeApi* | [**DedicatedshortcodeSendsms**](docs/ShortCodeApi.md#dedicatedshortcodesendsms) | **Post** /dedicatedshortcode/sendsms.json | Send SMS
*ShortCodeApi* | [**DedicatedshortcodeUpdateshortcode**](docs/ShortCodeApi.md#dedicatedshortcodeupdateshortcode) | **Post** /dedicatedshortcode/updateshortcode.json | Update Shortcode
*ShortCodeApi* | [**DedicatedshortcodeViewshortcode**](docs/ShortCodeApi.md#dedicatedshortcodeviewshortcode) | **Post** /dedicatedshortcode/viewshortcode.json | View SMS
*ShortCodeApi* | [**ShortcodeListsms**](docs/ShortCodeApi.md#shortcodelistsms) | **Post** /shortcode/listsms.json | List SMS
*ShortCodeApi* | [**ShortcodeViewsms**](docs/ShortCodeApi.md#shortcodeviewsms) | **Post** /shortcode/viewsms.json | View SMS
*SubAccountApi* | [**UserCreatesubaccount**](docs/SubAccountApi.md#usercreatesubaccount) | **Post** /user/createsubaccount.json | Create Subaccount
*SubAccountApi* | [**UserDeletesubaccount**](docs/SubAccountApi.md#userdeletesubaccount) | **Post** /user/deletesubaccount.json | Delete Subaccount
*SubAccountApi* | [**UserSubaccountactivation**](docs/SubAccountApi.md#usersubaccountactivation) | **Post** /user/subaccountactivation.json | Toggle Subaccount Status
*TranscriptionApi* | [**TranscriptionsAudiourltranscription**](docs/TranscriptionApi.md#transcriptionsaudiourltranscription) | **Post** /transcriptions/audiourltranscription.json | Transcribe Audio URL
*TranscriptionApi* | [**TranscriptionsListtranscription**](docs/TranscriptionApi.md#transcriptionslisttranscription) | **Post** /transcriptions/listtranscription.json | List Transcriptions
*TranscriptionApi* | [**TranscriptionsRecordingtranscription**](docs/TranscriptionApi.md#transcriptionsrecordingtranscription) | **Post** /transcriptions/recordingtranscription.json | Transcribe Recording
*TranscriptionApi* | [**TranscriptionsViewtranscription**](docs/TranscriptionApi.md#transcriptionsviewtranscription) | **Post** /transcriptions/viewtranscription.json | View Transcription
*UsageApi* | [**UsageListusage**](docs/UsageApi.md#usagelistusage) | **Post** /usage/listusage.json | List Usage


## Documentation For Models

 - [Activate](docs/Activate.md)
 - [ActivateStatus](docs/ActivateStatus.md)
 - [AudioDirection](docs/AudioDirection.md)
 - [AudioFormat](docs/AudioFormat.md)
 - [AudioUrl](docs/AudioUrl.md)
 - [Direction](docs/Direction.md)
 - [Errors](docs/Errors.md)
 - [Fileformat](docs/Fileformat.md)
 - [GroupConfirmFile](docs/GroupConfirmFile.md)
 - [HttpAction](docs/HttpAction.md)
 - [IfMachine](docs/IfMachine.md)
 - [InterruptedCallStatus](docs/InterruptedCallStatus.md)
 - [MergeNumber](docs/MergeNumber.md)
 - [MergeNumberStatus](docs/MergeNumberStatus.md)
 - [Message](docs/Message.md)
 - [ModelError](docs/ModelError.md)
 - [ModelType](docs/ModelType.md)
 - [NumberType](docs/NumberType.md)
 - [Numbertype16](docs/Numbertype16.md)
 - [PlayDtmfDirection](docs/PlayDtmfDirection.md)
 - [ProductCode](docs/ProductCode.md)
 - [ProductCode27](docs/ProductCode27.md)
 - [SendEmailAs](docs/SendEmailAs.md)
 - [Status](docs/Status.md)
 - [Status24](docs/Status24.md)
 - [TemplateData](docs/TemplateData.md)


## Documentation For Authorization

## auth
- **Type**: HTTP basic authentication

Example
```
	auth := context.WithValue(context.TODO(), sw.ContextBasicAuth, sw.BasicAuth{
		UserName: "username",
		Password: "password",
	})
    r, err := client.Service.Operation(auth, args)
```

## Author


