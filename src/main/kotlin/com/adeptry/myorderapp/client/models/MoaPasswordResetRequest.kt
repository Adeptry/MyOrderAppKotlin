/**
* MyOrderApp
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* The version of the OpenAPI document: 1.0.2
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
 * @param email 
 * @param merchantMoaId 
 */

data class MoaPasswordResetRequest (
    @Json(name = "email")
    val email: kotlin.String,
    @Json(name = "merchantMoaId")
    val merchantMoaId: kotlin.String? = null
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

