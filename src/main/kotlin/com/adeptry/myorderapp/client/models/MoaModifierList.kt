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

import com.adeptry.myorderapp.client.models.MoaItem
import com.adeptry.myorderapp.client.models.MoaModifier

import com.squareup.moshi.Json
import java.io.Serializable

/**
 * 
 * @param items 
 * @param modifiers 
 * @param squareId 
 * @param minSelectedModifiers 
 * @param maxSelectedModifiers 
 * @param enabled 
 * @param name 
 * @param selectionType 
 * @param moaId 
 * @param createDate 
 * @param updateDate 
 * @param deleteDate 
 * @param version 
 */

data class MoaModifierList (
    @Json(name = "items")
    val items: kotlin.collections.List<MoaItem>? = null,
    @Json(name = "modifiers")
    val modifiers: kotlin.collections.List<MoaModifier>? = null,
    @Json(name = "squareId")
    val squareId: kotlin.String? = null,
    @Json(name = "minSelectedModifiers")
    val minSelectedModifiers: Double? = null,
    @Json(name = "maxSelectedModifiers")
    val maxSelectedModifiers: Double? = null,
    @Json(name = "enabled")
    val enabled: kotlin.Boolean? = null,
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "selectionType")
    val selectionType: MoaModifierList.SelectionType? = null,
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

    /**
     * 
     * Values: SINGLE,MULTIPLE
     */
    enum class SelectionType(val value: kotlin.String) {
        @Json(name = "SINGLE") SINGLE("SINGLE"),
        @Json(name = "MULTIPLE") MULTIPLE("MULTIPLE");
    }
}

