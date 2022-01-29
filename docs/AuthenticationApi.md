# AuthenticationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticate**](AuthenticationApi.md#authenticate) | **POST** v1/authentication | 
[**forgotPassword**](AuthenticationApi.md#forgotPassword) | **POST** v1/authentication/forgot-password | 
[**resetPassword**](AuthenticationApi.md#resetPassword) | **POST** v1/authentication/reset-password | 





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
val moaPasswordForgotInput : MoaPasswordForgotInput =  // MoaPasswordForgotInput | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.forgotPassword(moaPasswordForgotInput)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **moaPasswordForgotInput** | [**MoaPasswordForgotInput**](MoaPasswordForgotInput.md)|  |

### Return type

**kotlin.Boolean**

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
val moaPasswordResetInput : MoaPasswordResetInput =  // MoaPasswordResetInput | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.resetPassword(moaPasswordResetInput)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **moaPasswordResetInput** | [**MoaPasswordResetInput**](MoaPasswordResetInput.md)|  |

### Return type

**kotlin.Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

