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

class EmailApi(basePath: kotlin.String = "https://api.ytel.com/api/v3") : ApiClient(basePath) {

    /**
    * Add Email Unsubscribe
    * Add an email to the unsubscribe list
    * @param email A valid email address that is to be added to the unsubscribe list 
    * @return kotlin.String
    */
    @Suppress("UNCHECKED_CAST")
    fun emailAddunsubscribesemail(email: kotlin.String) : kotlin.String {
        val localVariableBody: kotlin.Any? = mapOf("email" to "$email")
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/email/addunsubscribesemail.json",
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
    * Remove Blocked Address
    * Remove an email from blocked emails list.
    * @param email The email address to be remove from the blocked list. 
    * @return kotlin.String
    */
    @Suppress("UNCHECKED_CAST")
    fun emailDeleteblocksemail(email: kotlin.String) : kotlin.String {
        val localVariableBody: kotlin.Any? = mapOf("Email" to "$email")
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/email/deleteblocksemail.json",
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
    * Remove Bounced Email
    * Remove an email address from the bounced list.
    * @param email The email address to be remove from the bounced email list. 
    * @return kotlin.String
    */
    @Suppress("UNCHECKED_CAST")
    fun emailDeletebouncesemail(email: kotlin.String) : kotlin.String {
        val localVariableBody: kotlin.Any? = mapOf("Email" to "$email")
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/email/deletebouncesemail.json",
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
    * Remove Invalid Email
    * Remove an email from the invalid email list.
    * @param email A valid email address that is to be remove from the invalid email list. 
    * @return kotlin.String
    */
    @Suppress("UNCHECKED_CAST")
    fun emailDeleteinvalidemail(email: kotlin.String) : kotlin.String {
        val localVariableBody: kotlin.Any? = mapOf("Email" to "$email")
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/email/deleteinvalidemail.json",
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
    * Remove Spam Address
    * Remove an email from the spam email list.
    * @param email A valid email address that is to be remove from the spam list. 
    * @return kotlin.String
    */
    @Suppress("UNCHECKED_CAST")
    fun emailDeletespamemail(email: kotlin.String) : kotlin.String {
        val localVariableBody: kotlin.Any? = mapOf("Email" to "$email")
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/email/deletespamemail.json",
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
    * Remove Unsubscribed Email
    * Remove an email address from the list of unsubscribed emails.
    * @param email A valid email address that is to be remove from the unsubscribe list. 
    * @return kotlin.String
    */
    @Suppress("UNCHECKED_CAST")
    fun emailDeleteunsubscribedemail(email: kotlin.String) : kotlin.String {
        val localVariableBody: kotlin.Any? = mapOf("email" to "$email")
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/email/deleteunsubscribedemail.json",
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
    * Blocked Emails
    * Retrieve a list of emails that have been blocked.
    * @param offset The starting point of the list of blocked emails that should be returned. (optional)
    * @param limit The count of results that should be returned. (optional)
    * @return kotlin.String
    */
    @Suppress("UNCHECKED_CAST")
    fun emailListblockemail(offset: kotlin.String, limit: kotlin.String) : kotlin.String {
        val localVariableBody: kotlin.Any? = mapOf("Offset" to "$offset", "Limit" to "$limit")
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/email/listblockemail.json",
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
    * Bounced Emails
    * Retrieve a list of emails that have bounced.
    * @param offset The starting point of the list of bounced emails that should be returned. (optional)
    * @param limit The count of results that should be returned. (optional)
    * @return kotlin.String
    */
    @Suppress("UNCHECKED_CAST")
    fun emailListbounceemail(offset: kotlin.String, limit: kotlin.String) : kotlin.String {
        val localVariableBody: kotlin.Any? = mapOf("Offset" to "$offset", "Limit" to "$limit")
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/email/listbounceemail.json",
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
    * Invalid Emails
    * Retrieve a list of invalid email addresses.
    * @param offset The starting point of the list of invalid emails that should be returned. (optional)
    * @param limit The count of results that should be returned. (optional)
    * @return kotlin.String
    */
    @Suppress("UNCHECKED_CAST")
    fun emailListinvalidemail(offset: kotlin.String, limit: kotlin.String) : kotlin.String {
        val localVariableBody: kotlin.Any? = mapOf("Offset" to "$offset", "Limit" to "$limit")
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/email/listinvalidemail.json",
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
    * Spam Emails
    * Retrieve a list of emails that are on the spam list.
    * @param offset The starting point of the list of spam emails that should be returned. (optional)
    * @param limit The count of results that should be returned. (optional)
    * @return kotlin.String
    */
    @Suppress("UNCHECKED_CAST")
    fun emailListspamemail(offset: kotlin.String, limit: kotlin.String) : kotlin.String {
        val localVariableBody: kotlin.Any? = mapOf("Offset" to "$offset", "Limit" to "$limit")
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/email/listspamemail.json",
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
    * List Unsubscribed Emails
    * Retrieve a list of email addresses from the unsubscribe list.
    * @param offset The starting point of the list of unsubscribed emails that should be returned. (optional)
    * @param limit The count of results that should be returned. (optional)
    * @return kotlin.String
    */
    @Suppress("UNCHECKED_CAST")
    fun emailListunsubscribedemail(offset: kotlin.String, limit: kotlin.String) : kotlin.String {
        val localVariableBody: kotlin.Any? = mapOf("Offset" to "$offset", "Limit" to "$limit")
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/email/listunsubscribedemail.json",
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
    * Send Email
    * Create and submit an email message to one or more email addresses.
    * @param to A valid address that will receive the email. Multiple addresses can be separated by using commas. 
    * @param type Specifies the type of email to be sent 
    * @param subject The subject of the mail. Must be a valid string. 
    * @param message The email message that is to be sent in the text. 
    * @param from A valid address that will send the email. (optional)
    * @param cc Carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas. (optional)
    * @param bcc Blind carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas. (optional)
    * @param attachment A file that is attached to the email. Must be less than 7 MB in size. (optional)
    * @return kotlin.String
    */
    @Suppress("UNCHECKED_CAST")
    fun emailSendemails(to: kotlin.String, type: kotlin.String, subject: kotlin.String, message: kotlin.String, from: kotlin.String, cc: kotlin.String, bcc: kotlin.String, attachment: kotlin.String) : kotlin.String {
        val localVariableBody: kotlin.Any? = mapOf("To" to "$to", "Type" to "$type", "Subject" to "$subject", "Message" to "$message", "From" to "$from", "Cc" to "$cc", "Bcc" to "$bcc", "Attachment" to "$attachment")
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/email/sendemails.json",
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
