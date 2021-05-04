# AuthenticationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticate**](AuthenticationApi.md#authenticate) | **POST** /v1/authentication | 


<a name="authenticate"></a>
# **authenticate**
> MoaAuthenticationOutput authenticate(moaAuthenticationInput)



### Example
```kotlin
// Import classes:
//import org.myorderapp.kotlin-client.infrastructure.*
//import org.myorderapp.kotlin-client.models.*

val apiInstance = AuthenticationApi()
val moaAuthenticationInput : MoaAuthenticationInput =  // MoaAuthenticationInput | 
try {
    val result : MoaAuthenticationOutput = apiInstance.authenticate(moaAuthenticationInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthenticationApi#authenticate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthenticationApi#authenticate")
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

