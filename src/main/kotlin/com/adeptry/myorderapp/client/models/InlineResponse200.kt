/**
* MyOrderApp
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* The version of the OpenAPI document: 1.0.1
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package com.adeptry.myorderapp.client.models


import com.squareup.moshi.Json
import java.io.Serializable

/**
 * 
 * @param status 
 * @param info 
 * @param error 
 * @param details 
 */

data class InlineResponse200 (
    @Json(name = "status")
    val status: kotlin.String? = null,
    @Json(name = "info")
    val info: kotlin.collections.Map<kotlin.String, kotlin.collections.Map<kotlin.String, kotlin.String>>? = null,
    @Json(name = "error")
    val error: kotlin.collections.Map<kotlin.String, kotlin.collections.Map<kotlin.String, kotlin.String>>? = null,
    @Json(name = "details")
    val details: kotlin.collections.Map<kotlin.String, kotlin.collections.Map<kotlin.String, kotlin.String>>? = null
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}
