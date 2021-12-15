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
 * @param addressLine1 
 * @param addressLine2 
 * @param addressLine3 
 * @param locality 
 * @param sublocality 
 * @param sublocality2 
 * @param sublocality3 
 * @param administrativeDistrictLevel1 
 * @param administrativeDistrictLevel2 
 * @param administrativeDistrictLevel3 
 * @param postalCode 
 * @param country 
 * @param firstName 
 * @param lastName 
 * @param organization 
 */

data class SquareAddress (
    @Json(name = "addressLine1")
    val addressLine1: kotlin.String? = null,
    @Json(name = "addressLine2")
    val addressLine2: kotlin.String? = null,
    @Json(name = "addressLine3")
    val addressLine3: kotlin.String? = null,
    @Json(name = "locality")
    val locality: kotlin.String? = null,
    @Json(name = "sublocality")
    val sublocality: kotlin.String? = null,
    @Json(name = "sublocality2")
    val sublocality2: kotlin.String? = null,
    @Json(name = "sublocality3")
    val sublocality3: kotlin.String? = null,
    @Json(name = "administrativeDistrictLevel1")
    val administrativeDistrictLevel1: kotlin.String? = null,
    @Json(name = "administrativeDistrictLevel2")
    val administrativeDistrictLevel2: kotlin.String? = null,
    @Json(name = "administrativeDistrictLevel3")
    val administrativeDistrictLevel3: kotlin.String? = null,
    @Json(name = "postalCode")
    val postalCode: kotlin.String? = null,
    @Json(name = "country")
    val country: kotlin.String? = null,
    @Json(name = "firstName")
    val firstName: kotlin.String? = null,
    @Json(name = "lastName")
    val lastName: kotlin.String? = null,
    @Json(name = "organization")
    val organization: kotlin.String? = null
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

