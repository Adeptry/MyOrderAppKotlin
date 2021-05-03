/**
* MyOrderApp
* API for MyOrderApp
*
* The version of the OpenAPI document: 1.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.myorderapp.kotlin-client.apis

import org.myorderapp.kotlin-client.models.MoaCustomer
import org.myorderapp.kotlin-client.models.MoaCustomerCreateInput
import org.myorderapp.kotlin-client.models.MoaCustomerUpdateInput
import org.myorderapp.kotlin-client.models.MoaError

import org.myorderapp.kotlin-client.infrastructure.ApiClient
import org.myorderapp.kotlin-client.infrastructure.ClientException
import org.myorderapp.kotlin-client.infrastructure.ClientError
import org.myorderapp.kotlin-client.infrastructure.ServerException
import org.myorderapp.kotlin-client.infrastructure.ServerError
import org.myorderapp.kotlin-client.infrastructure.MultiValueMap
import org.myorderapp.kotlin-client.infrastructure.RequestConfig
import org.myorderapp.kotlin-client.infrastructure.RequestMethod
import org.myorderapp.kotlin-client.infrastructure.ResponseType
import org.myorderapp.kotlin-client.infrastructure.Success
import org.myorderapp.kotlin-client.infrastructure.toMultiValue

class CustomersApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("org.myorderapp.kotlin-client.baseUrl", "http://localhost")
        }
    }

    /**
    * 
    * 
    * @param moaCustomerCreateInput  
    * @return MoaCustomer
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun createCustomer(moaCustomerCreateInput: MoaCustomerCreateInput) : MoaCustomer {
        val localVariableConfig = createCustomerRequestConfig(moaCustomerCreateInput = moaCustomerCreateInput)

        val localVarResponse = request<MoaCustomer>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as MoaCustomer
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * To obtain the request config of the operation createCustomer
    *
    * @param moaCustomerCreateInput  
    * @return RequestConfig
    */
    fun createCustomerRequestConfig(moaCustomerCreateInput: MoaCustomerCreateInput) : RequestConfig {
        val localVariableBody: kotlin.Any? = moaCustomerCreateInput
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.POST,
            path = "/v1/customers",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * 
    * 
    * @return MoaCustomer
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getCurrentCustomer() : MoaCustomer {
        val localVariableConfig = getCurrentCustomerRequestConfig()

        val localVarResponse = request<MoaCustomer>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as MoaCustomer
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * To obtain the request config of the operation getCurrentCustomer
    *
    * @return RequestConfig
    */
    fun getCurrentCustomerRequestConfig() : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.GET,
            path = "/v1/customers/current",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * 
    * 
    * @param moaCustomerUpdateInput  
    * @return MoaCustomer
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun updateCurrentCustomer(moaCustomerUpdateInput: MoaCustomerUpdateInput) : MoaCustomer {
        val localVariableConfig = updateCurrentCustomerRequestConfig(moaCustomerUpdateInput = moaCustomerUpdateInput)

        val localVarResponse = request<MoaCustomer>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as MoaCustomer
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * To obtain the request config of the operation updateCurrentCustomer
    *
    * @param moaCustomerUpdateInput  
    * @return RequestConfig
    */
    fun updateCurrentCustomerRequestConfig(moaCustomerUpdateInput: MoaCustomerUpdateInput) : RequestConfig {
        val localVariableBody: kotlin.Any? = moaCustomerUpdateInput
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.PATCH,
            path = "/v1/customers/current",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

}