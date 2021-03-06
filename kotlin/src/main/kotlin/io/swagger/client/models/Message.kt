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
package io.swagger.client.models

import io.swagger.client.models.TemplateData

/**
 * 
 * @param ApiVersion 
 * @param MessageSid 
 * @param From 
 * @param To 
 * @param MessagePrice 
 * @param Body 
 * @param DateSent 
 * @param Status 
 * @param TemplateId 
 * @param TemplateData 
 */
data class Message (
    /*  */
    val ApiVersion: kotlin.String,
    /*  */
    val MessageSid: kotlin.String,
    /*  */
    val From: kotlin.String,
    /*  */
    val To: kotlin.String,
    /*  */
    val MessagePrice: kotlin.String,
    /*  */
    val Body: kotlin.String,
    /*  */
    val DateSent: kotlin.String,
    /*  */
    val Status: kotlin.String,
    /*  */
    val TemplateId: kotlin.String,
    val TemplateData: TemplateData
) {

}

