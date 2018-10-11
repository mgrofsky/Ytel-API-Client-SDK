/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object CallApi {

  /**
   * Group Call
   * 
   * Expected answers:
   *   code 200 : String 
   * 
   * Available security schemes:
   *   auth (basic)
   * 
   * @param from This number to display on Caller ID as calling
   * @param to Please enter multiple E164 number. You can add max 10 numbers. Add numbers separated with comma. e.g : 1111111111,2222222222
   * @param url URL requested once the call connects
   * @param groupConfirmKey Define the DTMF that the called party should send to bridge the call. Allowed Values : 0-9, #, *
   * @param groupConfirmFile Specify the audio file you want to play when the called party picks up the call
   * @param method Specifies the HTTP method used to request the required URL once call connects.
   * @param statusCallBackUrl URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
   * @param statusCallBackMethod Specifies the HTTP methodlinkclass used to request StatusCallbackUrl.
   * @param fallBackUrl URL requested if the initial Url parameter fails or encounters an error
   * @param fallBackMethod Specifies the HTTP method used to request the required FallbackUrl once call connects.
   * @param heartBeatUrl URL that can be requested every 60 seconds during the call to notify of elapsed time and pass other general information.
   * @param heartBeatMethod Specifies the HTTP method used to request HeartbeatUrl.
   * @param timeout Time (in seconds) we should wait while the call is ringing before canceling the call
   * @param playDtmf DTMF Digits to play to the call once it connects. 0-9, #, or *
   * @param hideCallerId Specifies if the caller id will be hidden
   * @param record Specifies if the call should be recorded
   * @param recordCallBackUrl Recording parameters will be sent here upon completion
   * @param recordCallBackMethod Method used to request the RecordCallback URL.
   * @param transcribe Specifies if the call recording should be transcribed
   * @param transcribeCallBackUrl Transcription parameters will be sent here upon completion
   */
  def callsGroupcall(from: String, to: String, url: String, groupConfirmKey: String, groupConfirmFile: String, method: Option[String] = None, statusCallBackUrl: Option[String] = None, statusCallBackMethod: Option[String] = None, fallBackUrl: Option[String] = None, fallBackMethod: Option[String] = None, heartBeatUrl: Option[String] = None, heartBeatMethod: Option[String] = None, timeout: Option[Int] = None, playDtmf: Option[String] = None, hideCallerId: Option[String] = None, record: Option[Boolean] = None, recordCallBackUrl: Option[String] = None, recordCallBackMethod: Option[String] = None, transcribe: Option[Boolean] = None, transcribeCallBackUrl: Option[String] = None)(implicit basicAuth: BasicCredentials): ApiRequest[String] =
    ApiRequest[String](ApiMethods.POST, "https://api.ytel.com/api/v3", "/calls/groupcall.json", "application/x-www-form-urlencoded")
      .withCredentials(basicAuth)
      .withFormParam("From", from)
      .withFormParam("To", to)
      .withFormParam("Url", url)
      .withFormParam("GroupConfirmKey", groupConfirmKey)
      .withFormParam("GroupConfirmFile", groupConfirmFile)
      .withFormParam("Method", method)
      .withFormParam("StatusCallBackUrl", statusCallBackUrl)
      .withFormParam("StatusCallBackMethod", statusCallBackMethod)
      .withFormParam("FallBackUrl", fallBackUrl)
      .withFormParam("FallBackMethod", fallBackMethod)
      .withFormParam("HeartBeatUrl", heartBeatUrl)
      .withFormParam("HeartBeatMethod", heartBeatMethod)
      .withFormParam("Timeout", timeout)
      .withFormParam("PlayDtmf", playDtmf)
      .withFormParam("HideCallerId", hideCallerId)
      .withFormParam("Record", record)
      .withFormParam("RecordCallBackUrl", recordCallBackUrl)
      .withFormParam("RecordCallBackMethod", recordCallBackMethod)
      .withFormParam("Transcribe", transcribe)
      .withFormParam("TranscribeCallBackUrl", transcribeCallBackUrl)
      .withSuccessResponse[String](200)
        /**
   * Interrupt the Call by Call Sid
   * 
   * Expected answers:
   *   code 200 : String 
   * 
   * Available security schemes:
   *   auth (basic)
   * 
   * @param callSid The unique identifier for voice call that is in progress.
   * @param url URL the in-progress call will be redirected to
   * @param method The method used to request the above Url parameter
   * @param status Status to set the in-progress call to
   */
  def callsInterruptcalls(callSid: String, url: Option[String] = None, method: Option[String] = None, status: Option[String] = None)(implicit basicAuth: BasicCredentials): ApiRequest[String] =
    ApiRequest[String](ApiMethods.POST, "https://api.ytel.com/api/v3", "/calls/interruptcalls.json", "application/x-www-form-urlencoded")
      .withCredentials(basicAuth)
      .withFormParam("CallSid", callSid)
      .withFormParam("Url", url)
      .withFormParam("Method", method)
      .withFormParam("Status", status)
      .withSuccessResponse[String](200)
        /**
   * A list of calls associated with your Ytel account
   * 
   * Expected answers:
   *   code 200 : String 
   * 
   * Available security schemes:
   *   auth (basic)
   * 
   * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1.
   * @param pageSize Number of individual resources listed in the response per page
   * @param to Filter calls that were sent to this 10-digit number (E.164 format).
   * @param from Filter calls that were sent from this 10-digit number (E.164 format).
   * @param dateCreated Return calls that are from a specified date.
   */
  def callsListcalls(page: Option[Int], pageSize: Option[Int], to: Option[String] = None, from: Option[String] = None, dateCreated: Option[String] = None)(implicit basicAuth: BasicCredentials): ApiRequest[String] =
    ApiRequest[String](ApiMethods.POST, "https://api.ytel.com/api/v3", "/calls/listcalls.json", "application/x-www-form-urlencoded")
      .withCredentials(basicAuth)
      .withFormParam("Page", page)
      .withFormParam("PageSize", pageSize)
      .withFormParam("To", to)
      .withFormParam("From", from)
      .withFormParam("DateCreated", dateCreated)
      .withSuccessResponse[String](200)
        /**
   * You can experiment with initiating a call through Ytel and view the request response generated when doing so and get the response in json
   * 
   * Expected answers:
   *   code 200 : String 
   * 
   * Available security schemes:
   *   auth (basic)
   * 
   * @param from A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call.
   * @param to To number
   * @param url URL requested once the call connects
   * @param method Specifies the HTTP method used to request the required URL once call connects.
   * @param statusCallBackUrl URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
   * @param statusCallBackMethod Specifies the HTTP methodlinkclass used to request StatusCallbackUrl.
   * @param fallBackUrl URL requested if the initial Url parameter fails or encounters an error
   * @param fallBackMethod Specifies the HTTP method used to request the required FallbackUrl once call connects.
   * @param heartBeatUrl URL that can be requested every 60 seconds during the call to notify of elapsed tim
   * @param heartBeatMethod Specifies the HTTP method used to request HeartbeatUrl.
   * @param timeout Time (in seconds) Ytel should wait while the call is ringing before canceling the call
   * @param playDtmf DTMF Digits to play to the call once it connects. 0-9, #, or *
   * @param hideCallerId Specifies if the caller id will be hidden
   * @param record Specifies if the call should be recorded
   * @param recordCallBackUrl Recording parameters will be sent here upon completion
   * @param recordCallBackMethod Method used to request the RecordCallback URL.
   * @param transcribe Specifies if the call recording should be transcribed
   * @param transcribeCallBackUrl Transcription parameters will be sent here upon completion
   * @param ifMachine How Ytel should handle the receiving numbers voicemail machine
   * @param ifMachineUrl URL requested when IfMachine&#x3D;continue
   * @param ifMachineMethod Method used to request the IfMachineUrl.
   * @param feedback Specify if survey should be enable or not
   * @param surveyId The unique identifier for the survey.
   */
  def callsMakecall(from: String, to: String, url: String, method: Option[String] = None, statusCallBackUrl: Option[String] = None, statusCallBackMethod: Option[String] = None, fallBackUrl: Option[String] = None, fallBackMethod: Option[String] = None, heartBeatUrl: Option[String] = None, heartBeatMethod: Option[String] = None, timeout: Option[Int] = None, playDtmf: Option[String] = None, hideCallerId: Option[Boolean] = None, record: Option[Boolean] = None, recordCallBackUrl: Option[String] = None, recordCallBackMethod: Option[String] = None, transcribe: Option[Boolean] = None, transcribeCallBackUrl: Option[String] = None, ifMachine: Option[String] = None, ifMachineUrl: Option[String] = None, ifMachineMethod: Option[String] = None, feedback: Option[Boolean] = None, surveyId: Option[String] = None)(implicit basicAuth: BasicCredentials): ApiRequest[String] =
    ApiRequest[String](ApiMethods.POST, "https://api.ytel.com/api/v3", "/calls/makecall.json", "application/x-www-form-urlencoded")
      .withCredentials(basicAuth)
      .withFormParam("From", from)
      .withFormParam("To", to)
      .withFormParam("Url", url)
      .withFormParam("Method", method)
      .withFormParam("StatusCallBackUrl", statusCallBackUrl)
      .withFormParam("StatusCallBackMethod", statusCallBackMethod)
      .withFormParam("FallBackUrl", fallBackUrl)
      .withFormParam("FallBackMethod", fallBackMethod)
      .withFormParam("HeartBeatUrl", heartBeatUrl)
      .withFormParam("HeartBeatMethod", heartBeatMethod)
      .withFormParam("Timeout", timeout)
      .withFormParam("PlayDtmf", playDtmf)
      .withFormParam("HideCallerId", hideCallerId)
      .withFormParam("Record", record)
      .withFormParam("RecordCallBackUrl", recordCallBackUrl)
      .withFormParam("RecordCallBackMethod", recordCallBackMethod)
      .withFormParam("Transcribe", transcribe)
      .withFormParam("TranscribeCallBackUrl", transcribeCallBackUrl)
      .withFormParam("IfMachine", ifMachine)
      .withFormParam("IfMachineUrl", ifMachineUrl)
      .withFormParam("IfMachineMethod", ifMachineMethod)
      .withFormParam("Feedback", feedback)
      .withFormParam("SurveyId", surveyId)
      .withSuccessResponse[String](200)
        /**
   * Initiate an outbound Ringless Voicemail through Ytel.
   * 
   * Expected answers:
   *   code 200 : String 
   * 
   * Available security schemes:
   *   auth (basic)
   * 
   * @param from A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call.
   * @param rVMCallerId A required secondary Caller ID for RVM to work.
   * @param to A valid number (E.164 format) that will receive the phone call.
   * @param voiceMailURL The URL requested once the RVM connects. A set of default parameters will be sent here.
   * @param method Specifies the HTTP method used to request the required URL once call connects.
   * @param statusCallBackUrl URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
   * @param statsCallBackMethod Specifies the HTTP method used to request the required StatusCallBackUrl once call connects.
   */
  def callsMakervm(from: String, rVMCallerId: String, to: String, voiceMailURL: String, method: Option[String], statusCallBackUrl: Option[String] = None, statsCallBackMethod: Option[String] = None)(implicit basicAuth: BasicCredentials): ApiRequest[String] =
    ApiRequest[String](ApiMethods.POST, "https://api.ytel.com/api/v3", "/calls/makervm.json", "application/x-www-form-urlencoded")
      .withCredentials(basicAuth)
      .withFormParam("From", from)
      .withFormParam("RVMCallerId", rVMCallerId)
      .withFormParam("To", to)
      .withFormParam("VoiceMailURL", voiceMailURL)
      .withFormParam("Method", method)
      .withFormParam("StatusCallBackUrl", statusCallBackUrl)
      .withFormParam("StatsCallBackMethod", statsCallBackMethod)
      .withSuccessResponse[String](200)
        /**
   * Play Audio from a url
   * 
   * Expected answers:
   *   code 200 : String 
   * 
   * Available security schemes:
   *   auth (basic)
   * 
   * @param callSid The unique identifier of each call resource
   * @param audioUrl URL to sound that should be played. You also can add more than one audio file using semicolons e.g. http://example.com/audio1.mp3;http://example.com/audio2.wav
   * @param sayText Valid alphanumeric string that should be played to the In-progress call.
   * @param length Time limit in seconds for audio play back
   * @param direction The leg of the call audio will be played to
   * @param mix If false, all other audio will be muted
   */
  def callsPlayaudios(callSid: String, audioUrl: String, sayText: String, length: Option[Int] = None, direction: Option[String] = None, mix: Option[Boolean] = None)(implicit basicAuth: BasicCredentials): ApiRequest[String] =
    ApiRequest[String](ApiMethods.POST, "https://api.ytel.com/api/v3", "/calls/playaudios.json", "application/x-www-form-urlencoded")
      .withCredentials(basicAuth)
      .withFormParam("CallSid", callSid)
      .withFormParam("AudioUrl", audioUrl)
      .withFormParam("SayText", sayText)
      .withFormParam("Length", length)
      .withFormParam("Direction", direction)
      .withFormParam("Mix", mix)
      .withSuccessResponse[String](200)
        /**
   * Start or stop recording of an in-progress voice call.
   * 
   * Expected answers:
   *   code 200 : String 
   * 
   * Available security schemes:
   *   auth (basic)
   * 
   * @param callSid The unique identifier of each call resource
   * @param record Set true to initiate recording or false to terminate recording
   * @param direction The leg of the call to record
   * @param timeLimit Time in seconds the recording duration should not exceed
   * @param callBackUrl URL consulted after the recording completes
   * @param fileformat Format of the recording file. Can be .mp3 or .wav
   */
  def callsRecordcalls(callSid: String, record: Boolean, direction: Option[String] = None, timeLimit: Option[Int] = None, callBackUrl: Option[String] = None, fileformat: Option[String] = None)(implicit basicAuth: BasicCredentials): ApiRequest[String] =
    ApiRequest[String](ApiMethods.POST, "https://api.ytel.com/api/v3", "/calls/recordcalls.json", "application/x-www-form-urlencoded")
      .withCredentials(basicAuth)
      .withFormParam("CallSid", callSid)
      .withFormParam("Record", record)
      .withFormParam("Direction", direction)
      .withFormParam("TimeLimit", timeLimit)
      .withFormParam("CallBackUrl", callBackUrl)
      .withFormParam("Fileformat", fileformat)
      .withSuccessResponse[String](200)
        /**
   * Play Dtmf and send the Digit
   * 
   * Expected answers:
   *   code 200 : String 
   * 
   * Available security schemes:
   *   auth (basic)
   * 
   * @param callSid The unique identifier of each call resource
   * @param playDtmf DTMF digits to play to the call. 0-9, #, *, W, or w
   * @param playDtmfDirection The leg of the call DTMF digits should be sent to
   */
  def callsSenddigits(callSid: String, playDtmf: String, playDtmfDirection: Option[String] = None)(implicit basicAuth: BasicCredentials): ApiRequest[String] =
    ApiRequest[String](ApiMethods.POST, "https://api.ytel.com/api/v3", "/calls/senddigits.json", "application/x-www-form-urlencoded")
      .withCredentials(basicAuth)
      .withFormParam("CallSid", callSid)
      .withFormParam("PlayDtmf", playDtmf)
      .withFormParam("PlayDtmfDirection", playDtmfDirection)
      .withSuccessResponse[String](200)
        /**
   * Retrieve a single voice call’s information by its CallSid.
   * 
   * Expected answers:
   *   code 200 : String 
   * 
   * Available security schemes:
   *   auth (basic)
   * 
   * @param callSid The unique identifier for the voice call.
   */
  def callsViewcalldetail(callSid: String)(implicit basicAuth: BasicCredentials): ApiRequest[String] =
    ApiRequest[String](ApiMethods.POST, "https://api.ytel.com/api/v3", "/calls/viewcalldetail.json", "application/x-www-form-urlencoded")
      .withCredentials(basicAuth)
      .withFormParam("callSid", callSid)
      .withSuccessResponse[String](200)
        /**
   * Retrieve a single voice call’s information by its CallSid.
   * 
   * Expected answers:
   *   code 200 : String 
   * 
   * Available security schemes:
   *   auth (basic)
   * 
   * @param callsid The unique identifier for the voice call.
   */
  def callsViewcalls(callsid: String)(implicit basicAuth: BasicCredentials): ApiRequest[String] =
    ApiRequest[String](ApiMethods.POST, "https://api.ytel.com/api/v3", "/calls/viewcalls.json", "application/x-www-form-urlencoded")
      .withCredentials(basicAuth)
      .withFormParam("callsid", callsid)
      .withSuccessResponse[String](200)
        /**
   * Add audio voice effects to the an in-progress voice call.
   * 
   * Expected answers:
   *   code 200 : String 
   * 
   * Available security schemes:
   *   auth (basic)
   * 
   * @param callSid The unique identifier for the in-progress voice call.
   * @param audioDirection The direction the audio effect should be placed on. If IN, the effects will occur on the incoming audio stream. If OUT, the effects will occur on the outgoing audio stream.
   * @param pitchSemiTones Set the pitch in semitone (half-step) intervals. Value between -14 and 14
   * @param pitchOctaves Set the pitch in octave intervals.. Value between -1 and 1
   * @param pitch Set the pitch (lowness/highness) of the audio. The higher the value, the higher the pitch. Value greater than 0
   * @param rate Set the rate for audio. The lower the value, the lower the rate. value greater than 0
   * @param tempo Set the tempo (speed) of the audio. A higher value denotes a faster tempo. Value greater than 0
   */
  def callsVoiceeffect(callSid: String, audioDirection: Option[String] = None, pitchSemiTones: Option[Double] = None, pitchOctaves: Option[Double] = None, pitch: Option[Double] = None, rate: Option[Double] = None, tempo: Option[Double] = None)(implicit basicAuth: BasicCredentials): ApiRequest[String] =
    ApiRequest[String](ApiMethods.POST, "https://api.ytel.com/api/v3", "/calls/voiceeffect.json", "application/x-www-form-urlencoded")
      .withCredentials(basicAuth)
      .withFormParam("CallSid", callSid)
      .withFormParam("AudioDirection", audioDirection)
      .withFormParam("PitchSemiTones", pitchSemiTones)
      .withFormParam("PitchOctaves", pitchOctaves)
      .withFormParam("Pitch", pitch)
      .withFormParam("Rate", rate)
      .withFormParam("Tempo", tempo)
      .withSuccessResponse[String](200)
      

}

