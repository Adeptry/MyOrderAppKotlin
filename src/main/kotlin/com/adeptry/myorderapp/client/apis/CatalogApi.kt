package com.adeptry.myorderapp.client.apis

import com.adeptry.myorderapp.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import com.adeptry.myorderapp.client.models.MoaCatalog
import com.adeptry.myorderapp.client.models.MoaError

interface CatalogApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: 
     *  - 401: You need to be authenticated to access this endpoint.
     * 
     * @return [MoaCatalog]
     */
    @GET("v1/customers/current/merchant/catalog")
    suspend fun getCurrentCustomersMerchantsCatalog(): Response<MoaCatalog>

    /**
     * 
     * 
     * Responses:
     *  - 200: 
     * 
     * @param moaId  
     * @return [MoaCatalog]
     */
    @GET("v1/merchants/{moaId}/catalog")
    suspend fun getMerchantCatalog(@Path("moaId") moaId: kotlin.String): Response<MoaCatalog>

}
