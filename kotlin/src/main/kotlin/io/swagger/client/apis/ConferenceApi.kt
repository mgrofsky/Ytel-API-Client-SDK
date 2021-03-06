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
package io.swagger.client.apis


import io.swagger.client.infrastructure.*

class ConferenceApi(basePath: kotlin.String = "https://api.ytel.com/api/v3") : ApiClient(basePath) {

    /**
    * Add Participant
    * Add Participant in conference 
    * @param conferenceSid The unique identifier for a conference object. 
    * @param participantNumber The phone number of the participant to be added. 
    * @param muted Specifies if participant should be muted. (optional)
    * @param deaf Specifies if the participant should hear audio in the conference. (optional)
    * @return kotlin.String
    */
    @Suppress("UNCHECKED_CAST")
    fun conferencesAddParticipant(conferenceSid: kotlin.String, participantNumber: kotlin.String, muted: kotlin.Boolean, deaf: kotlin.Boolean) : kotlin.String {
        val localVariableBody: kotlin.Any? = mapOf("ConferenceSid" to "$conferenceSid", "ParticipantNumber" to "$participantNumber", "Muted" to "$muted", "Deaf" to "$deaf")
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/conferences/addParticipant.json",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.String>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.String
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Create Conference
    * Here you can experiment with initiating a conference call through Ytel and view the request response generated when doing so.
    * @param from A valid 10-digit number (E.164 format) that will be initiating the conference call. 
    * @param to A valid 10-digit number (E.164 format) that is to receive the conference call. 
    * @param url URL requested once the conference connects 
    * @param method Specifies the HTTP method used to request the required URL once call connects. (optional, default to POST)
    * @param statusCallBackUrl URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the conference is finished. (optional)
    * @param statusCallBackMethod Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. (optional)
    * @param fallbackUrl URL requested if the initial Url parameter fails or encounters an error (optional)
    * @param fallbackMethod Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional)
    * @param record Specifies if the conference should be recorded. (optional)
    * @param recordCallBackUrl Recording parameters will be sent here upon completion. (optional)
    * @param recordCallBackMethod Specifies the HTTP method used to request the required URL once conference connects. (optional)
    * @param scheduleTime Schedule conference in future. Schedule time must be greater than current time (optional)
    * @param timeout The number of seconds the call stays on the line while waiting for an answer. The max time limit is 999 and the default limit is 60 seconds but lower times can be set. (optional)
    * @return kotlin.String
    */
    @Suppress("UNCHECKED_CAST")
    fun conferencesCreateConference(from: kotlin.String, to: kotlin.String, url: kotlin.String, method: kotlin.String, statusCallBackUrl: kotlin.String, statusCallBackMethod: kotlin.String, fallbackUrl: kotlin.String, fallbackMethod: kotlin.String, record: kotlin.Boolean, recordCallBackUrl: kotlin.String, recordCallBackMethod: kotlin.String, scheduleTime: kotlin.String, timeout: kotlin.Int) : kotlin.String {
        val localVariableBody: kotlin.Any? = mapOf("From" to "$from", "To" to "$to", "Method" to "$method", "StatusCallBackUrl" to "$statusCallBackUrl", "StatusCallBackMethod" to "$statusCallBackMethod", "FallbackUrl" to "$fallbackUrl", "FallbackMethod" to "$fallbackMethod", "Record" to "$record", "RecordCallBackUrl" to "$recordCallBackUrl", "RecordCallBackMethod" to "$recordCallBackMethod", "ScheduleTime" to "$scheduleTime", "Timeout" to "$timeout")
        val localVariableQuery: MultiValueMap = mapOf("url" to listOf("$url"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/conferences/createConference.json",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.String>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.String
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Silence Participant
    * Deaf Mute Participant
    * @param conferenceSid ID of the active conference 
    * @param participantSid ID of an active participant 
    * @param muted Mute a participant (optional)
    * @param deaf Make it so a participant cant hear (optional)
    * @return kotlin.String
    */
    @Suppress("UNCHECKED_CAST")
    fun conferencesDeafMuteParticipant(conferenceSid: kotlin.String, participantSid: kotlin.String, muted: kotlin.Boolean, deaf: kotlin.Boolean) : kotlin.String {
        val localVariableBody: kotlin.Any? = mapOf("conferenceSid" to "$conferenceSid", "ParticipantSid" to "$participantSid", "Muted" to "$muted", "Deaf" to "$deaf")
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/conferences/deafMuteParticipant.json",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.String>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.String
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Hangup Participant
    * Remove a participant from a conference.
    * @param conferenceSid The unique identifier for a conference object. 
    * @param participantSid The unique identifier for a participant object. 
    * @return kotlin.String
    */
    @Suppress("UNCHECKED_CAST")
    fun conferencesHangupParticipant(conferenceSid: kotlin.String, participantSid: kotlin.String) : kotlin.String {
        val localVariableBody: kotlin.Any? = mapOf("ConferenceSid" to "$conferenceSid")
        val localVariableQuery: MultiValueMap = mapOf("participantSid" to listOf("$participantSid"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/conferences/hangupParticipant.json",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.String>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.String
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * List Participants
    * Retrieve a list of participants for an in-progress conference.
    * @param conferenceSid The unique identifier for a conference. 
    * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
    * @param pagesize The count of objects to return per page. (optional, default to 10)
    * @param muted Specifies if participant should be muted. (optional)
    * @param deaf Specifies if the participant should hear audio in the conference. (optional)
    * @return kotlin.String
    */
    @Suppress("UNCHECKED_CAST")
    fun conferencesListParticipant(conferenceSid: kotlin.String, page: kotlin.Int, pagesize: kotlin.Int, muted: kotlin.Boolean, deaf: kotlin.Boolean) : kotlin.String {
        val localVariableBody: kotlin.Any? = mapOf("ConferenceSid" to "$conferenceSid", "Page" to "$page", "Pagesize" to "$pagesize", "Muted" to "$muted", "Deaf" to "$deaf")
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/conferences/listParticipant.json",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.String>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.String
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * List Conferences
    * Retrieve a list of conference objects.
    * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
    * @param pagesize Number of individual resources listed in the response per page (optional, default to 10)
    * @param friendlyName Only return conferences with the specified FriendlyName (optional)
    * @param dateCreated Conference created date (optional)
    * @return kotlin.String
    */
    @Suppress("UNCHECKED_CAST")
    fun conferencesListconference(page: kotlin.Int, pagesize: kotlin.Int, friendlyName: kotlin.String, dateCreated: kotlin.String) : kotlin.String {
        val localVariableBody: kotlin.Any? = mapOf("page" to "$page", "pagesize" to "$pagesize", "FriendlyName" to "$friendlyName", "DateCreated" to "$dateCreated")
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/conferences/listconference.json",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.String>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.String
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Play Audio
    * Play an audio file during a conference.
    * @param conferenceSid The unique identifier for a conference object. 
    * @param participantSid The unique identifier for a participant object. 
    * @param audioUrl The URL for the audio file that is to be played during the conference. Multiple audio files can be chained by using a semicolon. 
    * @return kotlin.String
    */
    @Suppress("UNCHECKED_CAST")
    fun conferencesPlayAudio(conferenceSid: kotlin.String, participantSid: kotlin.String, audioUrl: kotlin.String) : kotlin.String {
        val localVariableBody: kotlin.Any? = mapOf("ConferenceSid" to "$conferenceSid", "ParticipantSid" to "$participantSid", "AudioUrl" to "$audioUrl")
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/conferences/playAudio.json",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.String>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.String
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * View Participant
    * Retrieve information about a participant by its ParticipantSid.
    * @param conferenceSid The unique identifier for a conference object. 
    * @param participantSid The unique identifier for a participant object. 
    * @return kotlin.String
    */
    @Suppress("UNCHECKED_CAST")
    fun conferencesViewParticipant(conferenceSid: kotlin.String, participantSid: kotlin.String) : kotlin.String {
        val localVariableBody: kotlin.Any? = mapOf("ConferenceSid" to "$conferenceSid", "ParticipantSid" to "$participantSid")
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/conferences/viewParticipant.json",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.String>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.String
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * View Conference
    * Retrieve information about a conference by its ConferenceSid.
    * @param conferenceSid The unique identifier of each conference resource 
    * @return kotlin.String
    */
    @Suppress("UNCHECKED_CAST")
    fun conferencesViewconference(conferenceSid: kotlin.String) : kotlin.String {
        val localVariableBody: kotlin.Any? = mapOf("ConferenceSid" to "$conferenceSid")
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/conferences/viewconference.json",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.String>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.String
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

}
