package com.adeptry.myorderapp.client.apis

import com.adeptry.myorderapp.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import com.adeptry.myorderapp.client.models.MoaCustomer
import com.adeptry.myorderapp.client.models.MoaCustomerCreateInput
import com.adeptry.myorderapp.client.models.MoaCustomerUpdateInput
import com.adeptry.myorderapp.client.models.MoaError

interface CustomersApi {
    /**
     * 
     * 
     * Responses:
     *  - 201: 
     *  - 401: 
     *  - 404: 
     * 
     * @param moaCustomerCreateInput  
     * @return [MoaCustomer]
     */
    @POST("v1/customers")
    suspend fun createCustomer(@Body moaCustomerCreateInput: MoaCustomerCreateInput): Response<MoaCustomer>

    /**
     * 
     * 
     * Responses:
     *  - 200: 
     *  - 401: You need to be authenticated to access this endpoint.
     * 
     * @return [MoaCustomer]
     */
    @GET("v1/customers/current")
    suspend fun getCurrentCustomer(): Response<MoaCustomer>

    /**
     * 
     * 
     * Responses:
     *  - 200: 
     *  - 401: You need to be authenticated to access this endpoint.
     * 
     * @param moaCustomerUpdateInput  
     * @return [MoaCustomer]
     */
    @PATCH("v1/customers/current")
    suspend fun updateCurrentCustomer(@Body moaCustomerUpdateInput: MoaCustomerUpdateInput): Response<MoaCustomer>

}
