package com.adeptry.myorderapp.client.apis

import com.adeptry.myorderapp.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import com.adeptry.myorderapp.client.models.MoaConfigurationDto

interface ConfigurationApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: 
     * 
     * @param merchantMoaId  
     * @return [MoaConfigurationDto]
     */
    @GET("v1/configuration/{merchantMoaId}")
    suspend fun getConfiguration(@Path("merchantMoaId") merchantMoaId: kotlin.String): Response<MoaConfigurationDto>

}
