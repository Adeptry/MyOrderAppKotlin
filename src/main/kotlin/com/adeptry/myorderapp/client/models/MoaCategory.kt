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

import com.adeptry.myorderapp.client.models.MoaCatalog
import com.adeptry.myorderapp.client.models.MoaItem

import com.squareup.moshi.Json
import java.io.Serializable

/**
 * 
 * @param catalog 
 * @param items 
 * @param moaOrdinal 
 * @param moaEnabled 
 * @param squareId 
 * @param name 
 * @param moaId 
 * @param createDate 
 * @param updateDate 
 * @param deleteDate 
 * @param version 
 */

data class MoaCategory (
    @Json(name = "catalog")
    val catalog: MoaCatalog? = null,
    @Json(name = "items")
    val items: kotlin.collections.List<MoaItem>? = null,
    @Json(name = "moaOrdinal")
    val moaOrdinal: Double? = null,
    @Json(name = "moaEnabled")
    val moaEnabled: kotlin.Boolean? = null,
    @Json(name = "squareId")
    val squareId: kotlin.String? = null,
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "moaId")
    val moaId: kotlin.String? = null,
    @Json(name = "createDate")
    val createDate: org.threeten.bp.OffsetDateTime? = null,
    @Json(name = "updateDate")
    val updateDate: org.threeten.bp.OffsetDateTime? = null,
    @Json(name = "deleteDate")
    val deleteDate: org.threeten.bp.OffsetDateTime? = null,
    @Json(name = "version")
    val version: Double? = null
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

