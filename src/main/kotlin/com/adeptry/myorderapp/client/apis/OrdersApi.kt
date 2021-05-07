package com.adeptry.myorderapp.client.apis

import com.adeptry.myorderapp.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import com.adeptry.myorderapp.client.models.MoaCustomer
import com.adeptry.myorderapp.client.models.MoaError
import com.adeptry.myorderapp.client.models.MoaOrder
import com.adeptry.myorderapp.client.models.MoaOrderAddInput
import com.adeptry.myorderapp.client.models.MoaOrderCreateInput
import com.adeptry.myorderapp.client.models.MoaOrderPaginatedResponse
import com.adeptry.myorderapp.client.models.MoaOrderPayInput
import com.adeptry.myorderapp.client.models.MoaOrderRemoveInput

interface OrdersApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: 
     *  - 401: You need to be authenticated to access this endpoint.
     * 
     * @param moaOrderAddInput  
     * @return [MoaOrder]
     */
    @PUT("v1/customers/current/orders/current/variation")
    suspend fun addVariationToCurrentCustomersCurrentOrder(@Body moaOrderAddInput: MoaOrderAddInput): Response<MoaOrder>

    /**
     * 
     * 
     * Responses:
     *  - 200: 
     *  - 201: 
     *  - 401: You need to be authenticated to access this endpoint.
     * 
     * @param moaOrderCreateInput  
     * @return [MoaCustomer]
     */
    @POST("v1/customers/current/orders/current")
    suspend fun createOrderForCurrentCustomer(@Body moaOrderCreateInput: MoaOrderCreateInput): Response<MoaCustomer>

    /**
     * 
     * 
     * Responses:
     *  - 200: 
     *  - 401: You need to be authenticated to access this endpoint.
     * 
     * @return [MoaCustomer]
     */
    @DELETE("v1/customers/current/orders/current")
    suspend fun deleteCurrentCustomersCurrentOrder(): Response<MoaCustomer>

    /**
     * 
     * 
     * Responses:
     *  - 200: 
     *  - 401: You need to be authenticated to access this endpoint.
     * 
     * @param page  (optional)
     * @param limit  (optional)
     * @return [MoaOrderPaginatedResponse]
     */
    @GET("v1/customers/current/orders")
    suspend fun getCurrentCustomerOrders(@Query("page") page: Double? = null, @Query("limit") limit: Double? = null): Response<MoaOrderPaginatedResponse>

    /**
     * 
     * 
     * Responses:
     *  - 200: 
     *  - 401: You need to be authenticated to access this endpoint.
     * 
     * @return [MoaOrder]
     */
    @GET("v1/customers/current/orders/current")
    suspend fun getCurrentCustomersCurrentOrder(): Response<MoaOrder>

    /**
     * 
     * 
     * Responses:
     *  - 200: 
     * 
     * @param moaId  
     * @return [MoaOrder]
     */
    @GET("v1/orders/{moaId}")
    suspend fun getOrderWithId(@Path("moaId") moaId: kotlin.String): Response<MoaOrder>

    /**
     * 
     * 
     * Responses:
     *  - 200: 
     *  - 401: You need to be authenticated to access this endpoint.
     *  - 403: 
     *  - 404: If there is no customer with this authentication.
     *  - 500: 
     * 
     * @param moaOrderPayInput  
     * @return [MoaOrder]
     */
    @PUT("v1/customers/current/orders/current/payment")
    suspend fun payForCurrentCustomersCurrentOrder(@Body moaOrderPayInput: MoaOrderPayInput): Response<MoaOrder>

    /**
     * 
     * 
     * Responses:
     *  - 200: 
     *  - 401: You need to be authenticated to access this endpoint.
     * 
     * @param moaOrderRemoveInput  
     * @return [MoaOrder]
     */
    @DELETE("v1/customers/current/orders/current/variation")
    suspend fun removeVariationFromCurrentCustomersCurrentOrder(@Body moaOrderRemoveInput: MoaOrderRemoveInput): Response<MoaOrder>

}
