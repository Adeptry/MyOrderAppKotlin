/**
* MyOrderApp
* API for MyOrderApp
*
* The version of the OpenAPI document: 1.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package com.adeptry.myorderapp.client.models


import com.squareup.moshi.Json

/**
 * 
 * @param orderVariationUid 
 */

data class MoaOrderRemoveInput (
    @Json(name = "orderVariationUid")
    val orderVariationUid: kotlin.String
)

