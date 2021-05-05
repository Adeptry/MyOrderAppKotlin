# CatalogApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCurrentCustomersMerchantsCatalog**](CatalogApi.md#getCurrentCustomersMerchantsCatalog) | **GET** v1/customers/current/merchant/catalog | 
[**getMerchantCatalog**](CatalogApi.md#getMerchantCatalog) | **GET** v1/merchants/{moaId}/catalog | 





### Example
```kotlin
// Import classes:
//import com.adeptry.myorderapp.client.*
//import com.adeptry.myorderapp.client.infrastructure.*
//import com.adeptry.myorderapp.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CatalogApi::class.java)

launch(Dispatchers.IO) {
    val result : MoaCatalog = webService.getCurrentCustomersMerchantsCatalog()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MoaCatalog**](MoaCatalog.md)

### Authorization


Configure bearer:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json




### Example
```kotlin
// Import classes:
//import com.adeptry.myorderapp.client.*
//import com.adeptry.myorderapp.client.infrastructure.*
//import com.adeptry.myorderapp.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CatalogApi::class.java)
val moaId : kotlin.String = moaId_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : MoaCatalog = webService.getMerchantCatalog(moaId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **moaId** | **kotlin.String**|  |

### Return type

[**MoaCatalog**](MoaCatalog.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

