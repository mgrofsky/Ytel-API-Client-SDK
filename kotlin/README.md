# io.swagger.client - Kotlin client library for Ytel API V3

## Requires

* Kotlin 1.1.2
* Gradle 3.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in Swagger definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://api.ytel.com/api/v3*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountApi* | [**accountsViewaccount**](docs/AccountApi.md#accountsviewaccount) | **POST** /accounts/viewaccount.json | View Account
*AddressApi* | [**addressCreateaddress**](docs/AddressApi.md#addresscreateaddress) | **POST** /address/createaddress.json | Create Address
*AddressApi* | [**addressDeleteaddress**](docs/AddressApi.md#addressdeleteaddress) | **POST** /address/deleteaddress.json | Delete Address
*AddressApi* | [**addressListaddress**](docs/AddressApi.md#addresslistaddress) | **POST** /address/listaddress.json | List Addresses
*AddressApi* | [**addressVerifyaddress**](docs/AddressApi.md#addressverifyaddress) | **POST** /address/verifyaddress.json | Verify Address
*AddressApi* | [**addressViewaddress**](docs/AddressApi.md#addressviewaddress) | **POST** /address/viewaddress.json | View Address
*AreaMailApi* | [**areamailCreate**](docs/AreaMailApi.md#areamailcreate) | **POST** /areamail/create.json | Create AreaMail
*AreaMailApi* | [**areamailDelete**](docs/AreaMailApi.md#areamaildelete) | **POST** /areamail/delete.json | Delete AreaMail
*AreaMailApi* | [**areamailLists**](docs/AreaMailApi.md#areamaillists) | **POST** /areamail/lists.json | List AreaMails
*AreaMailApi* | [**areamailView**](docs/AreaMailApi.md#areamailview) | **POST** /areamail/view.json | View AreaMail
*CallApi* | [**callsGroupcall**](docs/CallApi.md#callsgroupcall) | **POST** /calls/groupcall.json | Group Call
*CallApi* | [**callsInterruptcalls**](docs/CallApi.md#callsinterruptcalls) | **POST** /calls/interruptcalls.json | Interrupt Call
*CallApi* | [**callsListcalls**](docs/CallApi.md#callslistcalls) | **POST** /calls/listcalls.json | List Calls
*CallApi* | [**callsMakecall**](docs/CallApi.md#callsmakecall) | **POST** /calls/makecall.json | Make Call
*CallApi* | [**callsMakervm**](docs/CallApi.md#callsmakervm) | **POST** /calls/makervm.json | Send RVM
*CallApi* | [**callsPlayaudios**](docs/CallApi.md#callsplayaudios) | **POST** /calls/playaudios.json | Play Audio
*CallApi* | [**callsRecordcalls**](docs/CallApi.md#callsrecordcalls) | **POST** /calls/recordcalls.json | Record Call
*CallApi* | [**callsSenddigits**](docs/CallApi.md#callssenddigits) | **POST** /calls/senddigits.json | Play DTMF
*CallApi* | [**callsViewcalldetail**](docs/CallApi.md#callsviewcalldetail) | **POST** /calls/viewcalldetail.json | View Call Details
*CallApi* | [**callsViewcalls**](docs/CallApi.md#callsviewcalls) | **POST** /calls/viewcalls.json | View Call
*CallApi* | [**callsVoiceeffect**](docs/CallApi.md#callsvoiceeffect) | **POST** /calls/voiceeffect.json | Voice Effect
*CarrierApi* | [**carrierLookup**](docs/CarrierApi.md#carrierlookup) | **POST** /carrier/lookup.json | Lookup Carrier
*CarrierApi* | [**carrierLookuplist**](docs/CarrierApi.md#carrierlookuplist) | **POST** /carrier/lookuplist.json | Carrier Results
*ConferenceApi* | [**conferencesAddParticipant**](docs/ConferenceApi.md#conferencesaddparticipant) | **POST** /conferences/addParticipant.json | Add Participant
*ConferenceApi* | [**conferencesCreateConference**](docs/ConferenceApi.md#conferencescreateconference) | **POST** /conferences/createConference.json | Create Conference
*ConferenceApi* | [**conferencesDeafMuteParticipant**](docs/ConferenceApi.md#conferencesdeafmuteparticipant) | **POST** /conferences/deafMuteParticipant.json | Silence Participant
*ConferenceApi* | [**conferencesHangupParticipant**](docs/ConferenceApi.md#conferenceshangupparticipant) | **POST** /conferences/hangupParticipant.json | Hangup Participant
*ConferenceApi* | [**conferencesListParticipant**](docs/ConferenceApi.md#conferenceslistparticipant) | **POST** /conferences/listParticipant.json | List Participants
*ConferenceApi* | [**conferencesListconference**](docs/ConferenceApi.md#conferenceslistconference) | **POST** /conferences/listconference.json | List Conferences
*ConferenceApi* | [**conferencesPlayAudio**](docs/ConferenceApi.md#conferencesplayaudio) | **POST** /conferences/playAudio.json | Play Audio
*ConferenceApi* | [**conferencesViewParticipant**](docs/ConferenceApi.md#conferencesviewparticipant) | **POST** /conferences/viewParticipant.json | View Participant
*ConferenceApi* | [**conferencesViewconference**](docs/ConferenceApi.md#conferencesviewconference) | **POST** /conferences/viewconference.json | View Conference
*EmailApi* | [**emailAddunsubscribesemail**](docs/EmailApi.md#emailaddunsubscribesemail) | **POST** /email/addunsubscribesemail.json | Add Email Unsubscribe
*EmailApi* | [**emailDeleteblocksemail**](docs/EmailApi.md#emaildeleteblocksemail) | **POST** /email/deleteblocksemail.json | Remove Blocked Address
*EmailApi* | [**emailDeletebouncesemail**](docs/EmailApi.md#emaildeletebouncesemail) | **POST** /email/deletebouncesemail.json | Remove Bounced Email
*EmailApi* | [**emailDeleteinvalidemail**](docs/EmailApi.md#emaildeleteinvalidemail) | **POST** /email/deleteinvalidemail.json | Remove Invalid Email
*EmailApi* | [**emailDeletespamemail**](docs/EmailApi.md#emaildeletespamemail) | **POST** /email/deletespamemail.json | Remove Spam Address
*EmailApi* | [**emailDeleteunsubscribedemail**](docs/EmailApi.md#emaildeleteunsubscribedemail) | **POST** /email/deleteunsubscribedemail.json | Remove Unsubscribed Email
*EmailApi* | [**emailListblockemail**](docs/EmailApi.md#emaillistblockemail) | **POST** /email/listblockemail.json | Blocked Emails
*EmailApi* | [**emailListbounceemail**](docs/EmailApi.md#emaillistbounceemail) | **POST** /email/listbounceemail.json | Bounced Emails
*EmailApi* | [**emailListinvalidemail**](docs/EmailApi.md#emaillistinvalidemail) | **POST** /email/listinvalidemail.json | Invalid Emails
*EmailApi* | [**emailListspamemail**](docs/EmailApi.md#emaillistspamemail) | **POST** /email/listspamemail.json | Spam Emails
*EmailApi* | [**emailListunsubscribedemail**](docs/EmailApi.md#emaillistunsubscribedemail) | **POST** /email/listunsubscribedemail.json | List Unsubscribed Emails
*EmailApi* | [**emailSendemails**](docs/EmailApi.md#emailsendemails) | **POST** /email/sendemails.json | Send Email
*LetterApi* | [**letterCreate**](docs/LetterApi.md#lettercreate) | **POST** /letter/create.json | Create Letter
*LetterApi* | [**letterDelete**](docs/LetterApi.md#letterdelete) | **POST** /letter/delete.json | Delete Letter
*LetterApi* | [**letterListsletter**](docs/LetterApi.md#letterlistsletter) | **POST** /letter/listsletter.json | List Letters
*LetterApi* | [**letterViewletter**](docs/LetterApi.md#letterviewletter) | **POST** /letter/viewletter.json | View Letter
*PhoneNumberApi* | [**incomingphoneAvailablenumber**](docs/PhoneNumberApi.md#incomingphoneavailablenumber) | **POST** /incomingphone/availablenumber.json | Available Numbers
*PhoneNumberApi* | [**incomingphoneBulkbuy**](docs/PhoneNumberApi.md#incomingphonebulkbuy) | **POST** /incomingphone/bulkbuy.json | Bulk Buy Numbers
*PhoneNumberApi* | [**incomingphoneBuynumber**](docs/PhoneNumberApi.md#incomingphonebuynumber) | **POST** /incomingphone/buynumber.json | Purchase Number
*PhoneNumberApi* | [**incomingphoneGetdidscore**](docs/PhoneNumberApi.md#incomingphonegetdidscore) | **POST** /incomingphone/getdidscore.json | Get DID Score
*PhoneNumberApi* | [**incomingphoneListnumber**](docs/PhoneNumberApi.md#incomingphonelistnumber) | **POST** /incomingphone/listnumber.json | List Numbers
*PhoneNumberApi* | [**incomingphoneMassreleasenumber**](docs/PhoneNumberApi.md#incomingphonemassreleasenumber) | **POST** /incomingphone/massreleasenumber.json | Bulk Release
*PhoneNumberApi* | [**incomingphoneMassupdatenumber**](docs/PhoneNumberApi.md#incomingphonemassupdatenumber) | **POST** /incomingphone/massupdatenumber.json | Bulk Update Numbers
*PhoneNumberApi* | [**incomingphoneReleasenumberByResponseTypePost**](docs/PhoneNumberApi.md#incomingphonereleasenumberbyresponsetypepost) | **POST** /incomingphone/releasenumber.json | Release Number
*PhoneNumberApi* | [**incomingphoneTransferphonenumbers**](docs/PhoneNumberApi.md#incomingphonetransferphonenumbers) | **POST** /incomingphone/transferphonenumbers.json | Move Number
*PhoneNumberApi* | [**incomingphoneUpdatenumber**](docs/PhoneNumberApi.md#incomingphoneupdatenumber) | **POST** /incomingphone/updatenumber.json | Update Number
*PhoneNumberApi* | [**incomingphoneViewnumber**](docs/PhoneNumberApi.md#incomingphoneviewnumber) | **POST** /incomingphone/viewnumber.json | View Details
*PostCardApi* | [**postcardCreatepostcard**](docs/PostCardApi.md#postcardcreatepostcard) | **POST** /Postcard/createpostcard.json | Create Postcard
*PostCardApi* | [**postcardDeletepostcard**](docs/PostCardApi.md#postcarddeletepostcard) | **POST** /Postcard/deletepostcard.json | Delete Postcard
*PostCardApi* | [**postcardListpostcard**](docs/PostCardApi.md#postcardlistpostcard) | **POST** /Postcard/listpostcard.json | List Postcards
*PostCardApi* | [**postcardViewpostcard**](docs/PostCardApi.md#postcardviewpostcard) | **POST** /Postcard/viewpostcard.json | View Postcard
*RecordingApi* | [**recordingDeleterecording**](docs/RecordingApi.md#recordingdeleterecording) | **POST** /recording/deleterecording.json | Delete Recording
*RecordingApi* | [**recordingListrecording**](docs/RecordingApi.md#recordinglistrecording) | **POST** /recording/listrecording.json | List Recordings
*RecordingApi* | [**recordingViewrecording**](docs/RecordingApi.md#recordingviewrecording) | **POST** /recording/viewrecording.json | View Recording
*SMSApi* | [**smsGetinboundsms**](docs/SMSApi.md#smsgetinboundsms) | **POST** /sms/getinboundsms.json | List Inbound SMS
*SMSApi* | [**smsListsms**](docs/SMSApi.md#smslistsms) | **POST** /sms/listsms.json | List SMS
*SMSApi* | [**smsSendsms**](docs/SMSApi.md#smssendsms) | **POST** /sms/sendsms.json | Send SMS
*SMSApi* | [**smsViewdetailsms**](docs/SMSApi.md#smsviewdetailsms) | **POST** /sms/viewdetailsms.json | View SMS
*SMSApi* | [**smsViewsms**](docs/SMSApi.md#smsviewsms) | **POST** /sms/viewsms.json | View SMS
*SharedShortCodeApi* | [**keywordLists**](docs/SharedShortCodeApi.md#keywordlists) | **POST** /keyword/lists.json | List Keywords
*SharedShortCodeApi* | [**keywordView**](docs/SharedShortCodeApi.md#keywordview) | **POST** /keyword/view.json | View Keyword
*SharedShortCodeApi* | [**shortcodeGetinboundsms**](docs/SharedShortCodeApi.md#shortcodegetinboundsms) | **POST** /shortcode/getinboundsms.json | List Inbound SMS
*SharedShortCodeApi* | [**shortcodeListshortcode**](docs/SharedShortCodeApi.md#shortcodelistshortcode) | **POST** /shortcode/listshortcode.json | List Shortcodes
*SharedShortCodeApi* | [**shortcodeSendsms**](docs/SharedShortCodeApi.md#shortcodesendsms) | **POST** /shortcode/sendsms.json | Send SMS
*SharedShortCodeApi* | [**shortcodeUpdateshortcode**](docs/SharedShortCodeApi.md#shortcodeupdateshortcode) | **POST** /shortcode/updateshortcode.json | Update Shortcode
*SharedShortCodeApi* | [**shortcodeViewshortcode**](docs/SharedShortCodeApi.md#shortcodeviewshortcode) | **POST** /shortcode/viewshortcode.json | View Shortcode
*SharedShortCodeApi* | [**templateLists**](docs/SharedShortCodeApi.md#templatelists) | **POST** /template/lists.json | List Templates
*SharedShortCodeApi* | [**templateView**](docs/SharedShortCodeApi.md#templateview) | **POST** /template/view.json | View Template
*ShortCodeApi* | [**dedicatedshortcodeGetinboundsms**](docs/ShortCodeApi.md#dedicatedshortcodegetinboundsms) | **POST** /dedicatedshortcode/getinboundsms.json | List Inbound SMS
*ShortCodeApi* | [**dedicatedshortcodeListshortcode**](docs/ShortCodeApi.md#dedicatedshortcodelistshortcode) | **POST** /dedicatedshortcode/listshortcode.json | List Shortcodes
*ShortCodeApi* | [**dedicatedshortcodeSendsms**](docs/ShortCodeApi.md#dedicatedshortcodesendsms) | **POST** /dedicatedshortcode/sendsms.json | Send SMS
*ShortCodeApi* | [**dedicatedshortcodeUpdateshortcode**](docs/ShortCodeApi.md#dedicatedshortcodeupdateshortcode) | **POST** /dedicatedshortcode/updateshortcode.json | Update Shortcode
*ShortCodeApi* | [**dedicatedshortcodeViewshortcode**](docs/ShortCodeApi.md#dedicatedshortcodeviewshortcode) | **POST** /dedicatedshortcode/viewshortcode.json | View SMS
*ShortCodeApi* | [**shortcodeListsms**](docs/ShortCodeApi.md#shortcodelistsms) | **POST** /shortcode/listsms.json | List SMS
*ShortCodeApi* | [**shortcodeViewsms**](docs/ShortCodeApi.md#shortcodeviewsms) | **POST** /shortcode/viewsms.json | View SMS
*SubAccountApi* | [**userCreatesubaccount**](docs/SubAccountApi.md#usercreatesubaccount) | **POST** /user/createsubaccount.json | Create Subaccount
*SubAccountApi* | [**userDeletesubaccount**](docs/SubAccountApi.md#userdeletesubaccount) | **POST** /user/deletesubaccount.json | Delete Subaccount
*SubAccountApi* | [**userSubaccountactivation**](docs/SubAccountApi.md#usersubaccountactivation) | **POST** /user/subaccountactivation.json | Toggle Subaccount Status
*TranscriptionApi* | [**transcriptionsAudiourltranscription**](docs/TranscriptionApi.md#transcriptionsaudiourltranscription) | **POST** /transcriptions/audiourltranscription.json | Transcribe Audio URL
*TranscriptionApi* | [**transcriptionsListtranscription**](docs/TranscriptionApi.md#transcriptionslisttranscription) | **POST** /transcriptions/listtranscription.json | List Transcriptions
*TranscriptionApi* | [**transcriptionsRecordingtranscription**](docs/TranscriptionApi.md#transcriptionsrecordingtranscription) | **POST** /transcriptions/recordingtranscription.json | Transcribe Recording
*TranscriptionApi* | [**transcriptionsViewtranscription**](docs/TranscriptionApi.md#transcriptionsviewtranscription) | **POST** /transcriptions/viewtranscription.json | View Transcription
*UsageApi* | [**usageListusage**](docs/UsageApi.md#usagelistusage) | **POST** /usage/listusage.json | List Usage


<a name="documentation-for-models"></a>
## Documentation for Models

 - [io.swagger.client.models.Activate](docs/Activate.md)
 - [io.swagger.client.models.ActivateStatus](docs/ActivateStatus.md)
 - [io.swagger.client.models.AudioDirection](docs/AudioDirection.md)
 - [io.swagger.client.models.AudioFormat](docs/AudioFormat.md)
 - [io.swagger.client.models.AudioUrl](docs/AudioUrl.md)
 - [io.swagger.client.models.Direction](docs/Direction.md)
 - [io.swagger.client.models.Error](docs/Error.md)
 - [io.swagger.client.models.Errors](docs/Errors.md)
 - [io.swagger.client.models.Fileformat](docs/Fileformat.md)
 - [io.swagger.client.models.GroupConfirmFile](docs/GroupConfirmFile.md)
 - [io.swagger.client.models.HttpAction](docs/HttpAction.md)
 - [io.swagger.client.models.IfMachine](docs/IfMachine.md)
 - [io.swagger.client.models.InterruptedCallStatus](docs/InterruptedCallStatus.md)
 - [io.swagger.client.models.MergeNumber](docs/MergeNumber.md)
 - [io.swagger.client.models.MergeNumberStatus](docs/MergeNumberStatus.md)
 - [io.swagger.client.models.Message](docs/Message.md)
 - [io.swagger.client.models.NumberType](docs/NumberType.md)
 - [io.swagger.client.models.Numbertype16](docs/Numbertype16.md)
 - [io.swagger.client.models.PlayDtmfDirection](docs/PlayDtmfDirection.md)
 - [io.swagger.client.models.ProductCode](docs/ProductCode.md)
 - [io.swagger.client.models.ProductCode27](docs/ProductCode27.md)
 - [io.swagger.client.models.SendEmailAs](docs/SendEmailAs.md)
 - [io.swagger.client.models.Status](docs/Status.md)
 - [io.swagger.client.models.Status24](docs/Status24.md)
 - [io.swagger.client.models.TemplateData](docs/TemplateData.md)
 - [io.swagger.client.models.Type](docs/Type.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="auth"></a>
### auth

- **Type**: HTTP basic authentication

