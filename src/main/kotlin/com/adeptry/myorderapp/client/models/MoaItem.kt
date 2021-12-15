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

import com.adeptry.myorderapp.client.models.MoaAWSS3File
import com.adeptry.myorderapp.client.models.MoaCategory
import com.adeptry.myorderapp.client.models.MoaModifierList
import com.adeptry.myorderapp.client.models.MoaVariation

import com.squareup.moshi.Json
import java.io.Serializable

/**
 * 
 * @param category 
 * @param modifierLists 
 * @param variations 
 * @param image 
 * @param moaOrdinal 
 * @param moaEnabled 
 * @param squareId 
 * @param name 
 * @param priceInCents 
 * @param description 
 * @param categoryMoaId 
 * @param moaId 
 * @param createDate 
 * @param updateDate 
 * @param deleteDate 
 * @param version 
 */

data class MoaItem (
    @Json(name = "category")
    val category: MoaCategory? = null,
    @Json(name = "modifierLists")
    val modifierLists: kotlin.collections.List<MoaModifierList>? = null,
    @Json(name = "variations")
    val variations: kotlin.collections.List<MoaVariation>? = null,
    @Json(name = "image")
    val image: MoaAWSS3File? = null,
    @Json(name = "moaOrdinal")
    val moaOrdinal: Double? = null,
    @Json(name = "moaEnabled")
    val moaEnabled: kotlin.Boolean? = null,
    @Json(name = "squareId")
    val squareId: kotlin.String? = null,
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "priceInCents")
    val priceInCents: Double? = null,
    @Json(name = "description")
    val description: kotlin.String? = null,
    @Json(name = "categoryMoaId")
    val categoryMoaId: kotlin.String? = null,
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

