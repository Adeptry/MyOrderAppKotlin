# HealthApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**healthControllerCheckDatabase**](HealthApi.md#healthControllerCheckDatabase) | **GET** v1/health/database | 
[**healthControllerThrowServerError**](HealthApi.md#healthControllerThrowServerError) | **GET** v1/health/error | 





### Example
```kotlin
// Import classes:
//import com.adeptry.myorderapp.client.*
//import com.adeptry.myorderapp.client.infrastructure.*
//import com.adeptry.myorderapp.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HealthApi::class.java)

launch(Dispatchers.IO) {
    val result : InlineResponse200 = webService.healthControllerCheckDatabase()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

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
val webService = apiClient.createWebservice(HealthApi::class.java)

launch(Dispatchers.IO) {
    webService.healthControllerThrowServerError()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

