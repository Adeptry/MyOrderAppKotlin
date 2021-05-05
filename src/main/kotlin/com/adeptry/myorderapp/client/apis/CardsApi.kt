package com.adeptry.myorderapp.client.apis

import com.adeptry.myorderapp.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import com.adeptry.myorderapp.client.models.MoaError
import com.adeptry.myorderapp.client.models.SquareCard
import com.adeptry.myorderapp.client.models.SquareCreateCustomerCardInput
import com.adeptry.myorderapp.client.models.SquareDeleteCustomerCardInput

interface CardsApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: 
     *  - 201: 
     *  - 401: You need to be authenticated to access this endpoint.
     * 
     * @param squareCreateCustomerCardInput  
     * @return [kotlin.collections.List<SquareCard>]
     */
    @POST("v1/customers/current/cards")
    suspend fun createCardForCurrentCustomer(@Body squareCreateCustomerCardInput: SquareCreateCustomerCardInput): Response<kotlin.collections.List<SquareCard>>

    /**
     * 
     * 
     * Responses:
     *  - 200: New list of cards
     *  - 401: You need to be authenticated to access this endpoint.
     * 
     * @param squareDeleteCustomerCardInput  
     * @return [kotlin.collections.List<SquareCard>]
     */
    @DELETE("v1/customers/current/cards")
    suspend fun deleteCardForCurrentCustomer(@Body squareDeleteCustomerCardInput: SquareDeleteCustomerCardInput): Response<kotlin.collections.List<SquareCard>>

    /**
     * 
     * 
     * Responses:
     *  - 200: 
     *  - 401: You need to be authenticated to access this endpoint.
     * 
     * @return [kotlin.collections.List<SquareCard>]
     */
    @GET("v1/customers/current/cards")
    suspend fun getCardsForCurrentCustomer(): Response<kotlin.collections.List<SquareCard>>

}
