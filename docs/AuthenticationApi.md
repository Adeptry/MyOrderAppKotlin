# AuthenticationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticate**](AuthenticationApi.md#authenticate) | **POST** v1/authentication | 
[**requestResetPassword**](AuthenticationApi.md#requestResetPassword) | **POST** v1/authentication/password/reset/request | 





### Example
```kotlin
// Import classes:
//import com.adeptry.myorderapp.client.*
//import com.adeptry.myorderapp.client.infrastructure.*
//import com.adeptry.myorderapp.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AuthenticationApi::class.java)
val moaAuthenticationInput : MoaAuthenticationInput =  // MoaAuthenticationInput | 

launch(Dispatchers.IO) {
    val result : MoaAuthenticationOutput = webService.authenticate(moaAuthenticationInput)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **moaAuthenticationInput** | [**MoaAuthenticationInput**](MoaAuthenticationInput.md)|  |

### Return type

[**MoaAuthenticationOutput**](MoaAuthenticationOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json




### Example
```kotlin
// Import classes:
//import com.adeptry.myorderapp.client.*
//import com.adeptry.myorderapp.client.infrastructure.*
//import com.adeptry.myorderapp.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AuthenticationApi::class.java)
val moaPasswordResetRequest : MoaPasswordResetRequest =  // MoaPasswordResetRequest | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.requestResetPassword(moaPasswordResetRequest)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **moaPasswordResetRequest** | [**MoaPasswordResetRequest**](MoaPasswordResetRequest.md)|  |

### Return type

**kotlin.Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

