package com.adeptry.myorderapp.client.apis

import com.adeptry.myorderapp.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import com.adeptry.myorderapp.client.models.MoaError
import com.adeptry.myorderapp.client.models.MoaLocation

interface LocationsApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: 
     *  - 401: You need to be authenticated to access this endpoint.
     * 
     * @return [kotlin.collections.List<MoaLocation>]
     */
    @GET("v1/customers/current/merchant/locations")
    suspend fun getCurrentCustomersMerchantsLocations(): Response<kotlin.collections.List<MoaLocation>>

    /**
     * 
     * 
     * Responses:
     *  - 200: 
     * 
     * @param moaId  
     * @return [kotlin.collections.List<MoaLocation>]
     */
    @GET("v1/merchants/{moaId}/locations")
    suspend fun getMerchantLocations(@Path("moaId") moaId: kotlin.String): Response<kotlin.collections.List<MoaLocation>>

}
