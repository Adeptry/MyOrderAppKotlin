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
package org.myorderapp.kotlin-client.models


import com.squareup.moshi.Json

/**
 * 
 * @param uid 
 * @param type 
 * @param state 
 */

data class SquareOrderFulfillment (
    @Json(name = "uid")
    val uid: kotlin.String? = null,
    @Json(name = "type")
    val type: kotlin.String? = null,
    @Json(name = "state")
    val state: kotlin.String? = null
)

