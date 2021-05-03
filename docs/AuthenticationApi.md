# AuthenticationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postAuthentication**](AuthenticationApi.md#postAuthentication) | **POST** /v1/authentication | 


<a name="postAuthentication"></a>
# **postAuthentication**
> MoaAuthenticationOutput postAuthentication(moaAuthenticationInput)



### Example
```kotlin
// Import classes:
//import org.myorderapp.kotlin-client.infrastructure.*
//import org.myorderapp.kotlin-client.models.*

val apiInstance = AuthenticationApi()
val moaAuthenticationInput : MoaAuthenticationInput =  // MoaAuthenticationInput | 
try {
    val result : MoaAuthenticationOutput = apiInstance.postAuthentication(moaAuthenticationInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthenticationApi#postAuthentication")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthenticationApi#postAuthentication")
    e.printStackTrace()
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

