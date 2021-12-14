package com.adeptry.myorderapp.client.apis

import com.adeptry.myorderapp.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import com.adeptry.myorderapp.client.models.InlineResponse200
import com.adeptry.myorderapp.client.models.InlineResponse503

interface HealthApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: The Health Check is successful
     *  - 503: The Health Check is not successful
     * 
     * @return [InlineResponse200]
     */
    @GET("v1/health/database")
    suspend fun healthControllerCheckDatabase(): Response<InlineResponse200>

    /**
     * 
     * 
     * Responses:
     *  - 200: 
     * 
     * @return [Unit]
     */
    @GET("v1/health/error")
    suspend fun healthControllerThrowServerError(): Response<Unit>

}
