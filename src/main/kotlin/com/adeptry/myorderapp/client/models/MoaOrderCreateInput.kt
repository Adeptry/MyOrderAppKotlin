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
 * @param locationMoaId 
 */

data class MoaOrderCreateInput (
    @Json(name = "locationMoaId")
    val locationMoaId: kotlin.String
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

