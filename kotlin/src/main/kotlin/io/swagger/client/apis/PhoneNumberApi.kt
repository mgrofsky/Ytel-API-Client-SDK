/**
* Ytel API V3
* Ytel API version 3
*
* OpenAPI spec version: 3.0
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package io.swagger.client.apis


import io.swagger.client.infrastructure.*

class PhoneNumberApi(basePath: kotlin.String = "https://api.message360.com/api/v3/") : ApiClient(basePath) {

    /**
    * Available Numbers
    * Retrieve a list of available phone numbers that can be purchased and used for your Ytel account.
    * @param numbertype Number type either SMS,Voice or all 
    * @param areacode Specifies the area code for the returned list of available numbers. Only available for North American numbers. 
    * @param pagesize The count of objects to return. (optional, default to 10)
    * @return kotlin.String
    */
    @Suppress("UNCHECKED_CAST")
    fun incomingphoneAvailablenumber(numbertype: kotlin.String, areacode: kotlin.String, pagesize: kotlin.Int) : kotlin.String {
        val localVariableBody: kotlin.Any? = mapOf("numbertype" to "$numbertype", "areacode" to "$areacode", "pagesize" to "$pagesize")
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/incomingphone/availablenumber.json",
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
    * Bulk Buy Numbers
    * Purchase a selected number of DID&#39;s from specific area codes to be used with your Ytel account.
    * @param numberType The capability the number supports. 
    * @param areaCode Specifies the area code for the returned list of available numbers. Only available for North American numbers. 
    * @param quantity A positive integer that tells how many number you want to buy at a time. 
    * @param leftover If desired quantity is unavailable purchase what is available . (optional)
    * @return kotlin.String
    */
    @Suppress("UNCHECKED_CAST")
    fun incomingphoneBulkbuy(numberType: kotlin.String, areaCode: kotlin.String, quantity: kotlin.String, leftover: kotlin.String) : kotlin.String {
        val localVariableBody: kotlin.Any? = mapOf("NumberType" to "$numberType", "AreaCode" to "$areaCode", "Quantity" to "$quantity", "Leftover" to "$leftover")
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/incomingphone/bulkbuy.json",
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
    * Purchase Number
    * Purchase a phone number to be used with your Ytel account
    * @param phoneNumber A valid 10-digit Ytel number (E.164 format). 
    * @return kotlin.String
    */
    @Suppress("UNCHECKED_CAST")
    fun incomingphoneBuynumber(phoneNumber: kotlin.String) : kotlin.String {
        val localVariableBody: kotlin.Any? = mapOf("PhoneNumber" to "$phoneNumber")
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/incomingphone/buynumber.json",
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
    * Get DID Score
    * Get DID Score Number
    * @param phonenumber Specifies the multiple phone numbers for check updated spamscore . 
    * @return kotlin.String
    */
    @Suppress("UNCHECKED_CAST")
    fun incomingphoneGetdidscore(phonenumber: kotlin.String) : kotlin.String {
        val localVariableBody: kotlin.Any? = mapOf("Phonenumber" to "$phonenumber")
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/incomingphone/getdidscore.json",
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
    * List Numbers
    * Retrieve a list of purchased phones numbers associated with your Ytel account.
    * @param page Which page of the overall response will be returned. Page indexing starts at 1. (optional, default to 1)
    * @param pageSize The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 10)
    * @param numberType The capability supported by the number.Number type either SMS,Voice or all (optional)
    * @param friendlyName A human-readable label added to the number object. (optional)
    * @return kotlin.String
    */
    @Suppress("UNCHECKED_CAST")
    fun incomingphoneListnumber(page: kotlin.Int, pageSize: kotlin.Int, numberType: kotlin.String, friendlyName: kotlin.String) : kotlin.String {
        val localVariableBody: kotlin.Any? = mapOf("Page" to "$page", "PageSize" to "$pageSize", "NumberType" to "$numberType", "FriendlyName" to "$friendlyName")
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/incomingphone/listnumber.json",
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
    * Bulk Release
    * Remove a purchased Ytel number from your account.
    * @param phoneNumber A valid Ytel comma separated numbers (E.164 format). 
    * @return kotlin.String
    */
    @Suppress("UNCHECKED_CAST")
    fun incomingphoneMassreleasenumber(phoneNumber: kotlin.String) : kotlin.String {
        val localVariableBody: kotlin.Any? = mapOf("PhoneNumber" to "$phoneNumber")
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/incomingphone/massreleasenumber.json",
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
    * Bulk Update Numbers
    * Update properties for a Ytel numbers that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.
    * @param phoneNumber A valid comma(,) separated Ytel numbers. (E.164 format). 
    * @param voiceUrl The URL returning InboundXML incoming calls should execute when connected. 
    * @param friendlyName A human-readable value for labeling the number. (optional)
    * @param voiceMethod Specifies the HTTP method used to request the VoiceUrl once incoming call connects. (optional)
    * @param voiceFallbackUrl URL used if any errors occur during execution of InboundXML on a call or at initial request of the voice url (optional)
    * @param voiceFallbackMethod Specifies the HTTP method used to request the VoiceFallbackUrl once incoming call connects. (optional)
    * @param hangupCallback URL that can be requested to receive notification when and how incoming call has ended. (optional)
    * @param hangupCallbackMethod The HTTP method Ytel will use when requesting the HangupCallback URL. (optional)
    * @param heartbeatUrl URL that can be used to monitor the phone number. (optional)
    * @param heartbeatMethod The HTTP method Ytel will use when requesting the HeartbeatUrl. (optional)
    * @param smsUrl URL requested when an SMS is received. (optional)
    * @param smsMethod The HTTP method Ytel will use when requesting the SmsUrl. (optional)
    * @param smsFallbackUrl URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl. (optional)
    * @param smsFallbackMethod The HTTP method Ytel will use when URL requested if the SmsUrl is not available. (optional)
    * @return kotlin.String
    */
    @Suppress("UNCHECKED_CAST")
    fun incomingphoneMassupdatenumber(phoneNumber: kotlin.String, voiceUrl: kotlin.String, friendlyName: kotlin.String, voiceMethod: kotlin.String, voiceFallbackUrl: kotlin.String, voiceFallbackMethod: kotlin.String, hangupCallback: kotlin.String, hangupCallbackMethod: kotlin.String, heartbeatUrl: kotlin.String, heartbeatMethod: kotlin.String, smsUrl: kotlin.String, smsMethod: kotlin.String, smsFallbackUrl: kotlin.String, smsFallbackMethod: kotlin.String) : kotlin.String {
        val localVariableBody: kotlin.Any? = mapOf("PhoneNumber" to "$phoneNumber", "VoiceUrl" to "$voiceUrl", "FriendlyName" to "$friendlyName", "VoiceMethod" to "$voiceMethod", "VoiceFallbackUrl" to "$voiceFallbackUrl", "VoiceFallbackMethod" to "$voiceFallbackMethod", "HangupCallback" to "$hangupCallback", "HangupCallbackMethod" to "$hangupCallbackMethod", "HeartbeatUrl" to "$heartbeatUrl", "HeartbeatMethod" to "$heartbeatMethod", "SmsUrl" to "$smsUrl", "SmsMethod" to "$smsMethod", "SmsFallbackUrl" to "$smsFallbackUrl", "SmsFallbackMethod" to "$smsFallbackMethod")
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/incomingphone/massupdatenumber.json",
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
    * Release Number
    * Remove a purchased Ytel number from your account.
    * @param phoneNumber A valid 10-digit Ytel number (E.164 format). 
    * @param responseType Response type format xml or json 
    * @return kotlin.String
    */
    @Suppress("UNCHECKED_CAST")
    fun incomingphoneReleasenumberByResponseTypePost(phoneNumber: kotlin.String, responseType: kotlin.String) : kotlin.String {
        val localVariableBody: kotlin.Any? = mapOf("PhoneNumber" to "$phoneNumber")
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/incomingphone/releasenumber.{ResponseType}".replace("{"+"ResponseType"+"}", "$responseType"),
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
    * Move Number
    * Transfer phone number that has been purchased for from one account to another account.
    * @param phonenumber A valid 10-digit Ytel number (E.164 format). 
    * @param fromaccountsid A specific Accountsid from where Number is getting transfer. 
    * @param toaccountsid A specific Accountsid to which Number is getting transfer. 
    * @return kotlin.String
    */
    @Suppress("UNCHECKED_CAST")
    fun incomingphoneTransferphonenumbers(phonenumber: kotlin.String, fromaccountsid: kotlin.String, toaccountsid: kotlin.String) : kotlin.String {
        val localVariableBody: kotlin.Any? = mapOf("phonenumber" to "$phonenumber", "fromaccountsid" to "$fromaccountsid", "toaccountsid" to "$toaccountsid")
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/incomingphone/transferphonenumbers.json",
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
    * Update Number
    * Update properties for a Ytel number that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.
    * @param phoneNumber A valid Ytel number (E.164 format). 
    * @param voiceUrl URL requested once the call connects 
    * @param friendlyName Phone number friendly name description (optional)
    * @param voiceMethod Post or Get (optional)
    * @param voiceFallbackUrl URL requested if the voice URL is not available (optional)
    * @param voiceFallbackMethod Post or Get (optional)
    * @param hangupCallback callback url after a hangup occurs (optional)
    * @param hangupCallbackMethod Post or Get (optional)
    * @param heartbeatUrl URL requested once the call connects (optional)
    * @param heartbeatMethod URL that can be requested every 60 seconds during the call to notify of elapsed time (optional)
    * @param smsUrl URL requested when an SMS is received (optional)
    * @param smsMethod Post or Get (optional)
    * @param smsFallbackUrl URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl. (optional)
    * @param smsFallbackMethod The HTTP method Ytel will use when URL requested if the SmsUrl is not available. (optional)
    * @return kotlin.String
    */
    @Suppress("UNCHECKED_CAST")
    fun incomingphoneUpdatenumber(phoneNumber: kotlin.String, voiceUrl: kotlin.String, friendlyName: kotlin.String, voiceMethod: kotlin.String, voiceFallbackUrl: kotlin.String, voiceFallbackMethod: kotlin.String, hangupCallback: kotlin.String, hangupCallbackMethod: kotlin.String, heartbeatUrl: kotlin.String, heartbeatMethod: kotlin.String, smsUrl: kotlin.String, smsMethod: kotlin.String, smsFallbackUrl: kotlin.String, smsFallbackMethod: kotlin.String) : kotlin.String {
        val localVariableBody: kotlin.Any? = mapOf("PhoneNumber" to "$phoneNumber", "VoiceUrl" to "$voiceUrl", "FriendlyName" to "$friendlyName", "VoiceMethod" to "$voiceMethod", "VoiceFallbackUrl" to "$voiceFallbackUrl", "VoiceFallbackMethod" to "$voiceFallbackMethod", "HangupCallback" to "$hangupCallback", "HangupCallbackMethod" to "$hangupCallbackMethod", "HeartbeatUrl" to "$heartbeatUrl", "HeartbeatMethod" to "$heartbeatMethod", "SmsUrl" to "$smsUrl", "SmsMethod" to "$smsMethod", "SmsFallbackUrl" to "$smsFallbackUrl", "SmsFallbackMethod" to "$smsFallbackMethod")
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/incomingphone/updatenumber.json",
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
    * View Details
    * Retrieve the details for a phone number by its number.
    * @param phoneNumber A valid Ytel 10-digit phone number (E.164 format). 
    * @return kotlin.String
    */
    @Suppress("UNCHECKED_CAST")
    fun incomingphoneViewnumber(phoneNumber: kotlin.String) : kotlin.String {
        val localVariableBody: kotlin.Any? = mapOf("PhoneNumber" to "$phoneNumber")
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/incomingphone/viewnumber.json",
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