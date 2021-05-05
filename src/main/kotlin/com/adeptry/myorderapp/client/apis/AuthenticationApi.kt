package com.adeptry.myorderapp.client.apis

import com.adeptry.myorderapp.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import com.adeptry.myorderapp.client.models.MoaAuthenticationInput
import com.adeptry.myorderapp.client.models.MoaAuthenticationOutput

interface AuthenticationApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: 
     *  - 201: 
     * 
     * @param moaAuthenticationInput  
     * @return [MoaAuthenticationOutput]
     */
    @POST("v1/authentication")
    suspend fun authenticate(@Body moaAuthenticationInput: MoaAuthenticationInput): Response<MoaAuthenticationOutput>

}
