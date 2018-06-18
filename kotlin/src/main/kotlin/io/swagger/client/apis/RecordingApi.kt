/**
* Ytel API V3
* Ytel API version 3
*
* OpenAPI spec version: 3.11
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package io.swagger.client.apis


import io.swagger.client.infrastructure.*

class RecordingApi(basePath: kotlin.String = "https://api.message360.com/api/v3/") : ApiClient(basePath) {

    /**
    * Delete Recording
    * Remove a recording from your Ytel account.
    * @param recordingsid The unique identifier for a recording. 
    * @return kotlin.String
    */
    @Suppress("UNCHECKED_CAST")
    fun recordingDeleterecording(recordingsid: kotlin.String) : kotlin.String {
        val localVariableBody: kotlin.Any? = mapOf("recordingsid" to "$recordingsid")
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/recording/deleterecording.json",
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
    * List Recordings
    * Retrieve a list of recording objects.
    * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
    * @param pagesize The count of objects to return per page. (optional, default to 10)
    * @param datecreated Filter results by creation date (optional)
    * @param callsid The unique identifier for a call. (optional)
    * @return kotlin.String
    */
    @Suppress("UNCHECKED_CAST")
    fun recordingListrecording(page: kotlin.Int, pagesize: kotlin.Int, datecreated: kotlin.String, callsid: kotlin.String) : kotlin.String {
        val localVariableBody: kotlin.Any? = mapOf("page" to "$page", "pagesize" to "$pagesize", "Datecreated" to "$datecreated", "callsid" to "$callsid")
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/recording/listrecording.json",
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
    * View Recording
    * Retrieve the recording of a call by its RecordingSid. This resource will return information regarding the call such as start time, end time, duration, and so forth.
    * @param recordingsid The unique identifier for the recording. 
    * @return kotlin.String
    */
    @Suppress("UNCHECKED_CAST")
    fun recordingViewrecording(recordingsid: kotlin.String) : kotlin.String {
        val localVariableBody: kotlin.Any? = mapOf("recordingsid" to "$recordingsid")
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/recording/viewrecording.json",
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
