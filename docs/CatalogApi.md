# CatalogApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCurrentCustomersMerchantsCatalog**](CatalogApi.md#getCurrentCustomersMerchantsCatalog) | **GET** /v1/customers/current/merchant/catalog | 
[**getMerchantCatalog**](CatalogApi.md#getMerchantCatalog) | **GET** /v1/merchants/{id}/catalog | 


<a name="getCurrentCustomersMerchantsCatalog"></a>
# **getCurrentCustomersMerchantsCatalog**
> MoaCatalog getCurrentCustomersMerchantsCatalog()



### Example
```kotlin
// Import classes:
//import org.myorderapp.kotlin-client.infrastructure.*
//import org.myorderapp.kotlin-client.models.*

val apiInstance = CatalogApi()
try {
    val result : MoaCatalog = apiInstance.getCurrentCustomersMerchantsCatalog()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogApi#getCurrentCustomersMerchantsCatalog")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogApi#getCurrentCustomersMerchantsCatalog")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MoaCatalog**](MoaCatalog.md)

### Authorization


Configure bearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMerchantCatalog"></a>
# **getMerchantCatalog**
> MoaCatalog getMerchantCatalog(id)



### Example
```kotlin
// Import classes:
//import org.myorderapp.kotlin-client.infrastructure.*
//import org.myorderapp.kotlin-client.models.*

val apiInstance = CatalogApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : MoaCatalog = apiInstance.getMerchantCatalog(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogApi#getMerchantCatalog")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogApi#getMerchantCatalog")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

[**MoaCatalog**](MoaCatalog.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

