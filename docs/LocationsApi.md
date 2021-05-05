# LocationsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCurrentCustomersMerchantsLocations**](LocationsApi.md#getCurrentCustomersMerchantsLocations) | **GET** v1/customers/current/merchant/locations | 
[**getMerchantLocations**](LocationsApi.md#getMerchantLocations) | **GET** v1/merchants/{moaId}/locations | 





### Example
```kotlin
// Import classes:
//import com.adeptry.myorderapp.client.*
//import com.adeptry.myorderapp.client.infrastructure.*
//import com.adeptry.myorderapp.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(LocationsApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<MoaLocation> = webService.getCurrentCustomersMerchantsLocations()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;MoaLocation&gt;**](MoaLocation.md)

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
val webService = apiClient.createWebservice(LocationsApi::class.java)
val moaId : kotlin.String = moaId_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<MoaLocation> = webService.getMerchantLocations(moaId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **moaId** | **kotlin.String**|  |

### Return type

[**kotlin.collections.List&lt;MoaLocation&gt;**](MoaLocation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

