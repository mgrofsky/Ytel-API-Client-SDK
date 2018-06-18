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

class UsageApi(basePath: kotlin.String = "https://api.message360.com/api/v3/") : ApiClient(basePath) {

    /**
    * List Usage
    * Retrieve usage metrics regarding your Ytel account. The results includes inbound/outbound voice calls and inbound/outbound SMS messages as well as carrier lookup requests.
    * @param productCode Filter usage results by product type. (optional, default to 0)
    * @param startDate Filter usage objects by start date. (optional, default to 2016-09-06)
    * @param endDate Filter usage objects by end date. (optional, default to 2016-09-06)
    * @param includeSubAccounts Will include all subaccount usage data (optional)
    * @return kotlin.String
    */
    @Suppress("UNCHECKED_CAST")
    fun usageListusage(productCode: kotlin.String, startDate: kotlin.String, endDate: kotlin.String, includeSubAccounts: kotlin.String) : kotlin.String {
        val localVariableBody: kotlin.Any? = mapOf("ProductCode" to "$productCode", "startDate" to "$startDate", "endDate" to "$endDate", "IncludeSubAccounts" to "$includeSubAccounts")
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/usage/listusage.json",
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
