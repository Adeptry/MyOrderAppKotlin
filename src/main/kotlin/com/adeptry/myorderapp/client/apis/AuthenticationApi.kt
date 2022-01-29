package com.adeptry.myorderapp.client.apis

import com.adeptry.myorderapp.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import com.adeptry.myorderapp.client.models.MoaAuthenticationInput
import com.adeptry.myorderapp.client.models.MoaAuthenticationOutput
import com.adeptry.myorderapp.client.models.MoaPasswordForgotInput
import com.adeptry.myorderapp.client.models.MoaPasswordResetInput

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

    /**
     * 
     * 
     * Responses:
     *  - 200: 
     *  - 201: 
     * 
     * @param moaPasswordForgotInput  
     * @return [kotlin.Boolean]
     */
    @POST("v1/authentication/forgot-password")
    suspend fun forgotPassword(@Body moaPasswordForgotInput: MoaPasswordForgotInput): Response<kotlin.Boolean>

    /**
     * 
     * 
     * Responses:
     *  - 200: 
     *  - 201: 
     * 
     * @param moaPasswordResetInput  
     * @return [kotlin.Boolean]
     */
    @POST("v1/authentication/reset-password")
    suspend fun resetPassword(@Body moaPasswordResetInput: MoaPasswordResetInput): Response<kotlin.Boolean>

}
