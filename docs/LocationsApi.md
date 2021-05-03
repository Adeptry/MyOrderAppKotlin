# LocationsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCurrentCustomersMerchantsLocations**](LocationsApi.md#getCurrentCustomersMerchantsLocations) | **GET** /v1/customers/current/merchant/locations | 
[**getMerchantLocations**](LocationsApi.md#getMerchantLocations) | **GET** /v1/merchants/{id}/locations | 


<a name="getCurrentCustomersMerchantsLocations"></a>
# **getCurrentCustomersMerchantsLocations**
> kotlin.collections.List&lt;MoaLocation&gt; getCurrentCustomersMerchantsLocations()



### Example
```kotlin
// Import classes:
//import org.myorderapp.kotlin-client.infrastructure.*
//import org.myorderapp.kotlin-client.models.*

val apiInstance = LocationsApi()
try {
    val result : kotlin.collections.List<MoaLocation> = apiInstance.getCurrentCustomersMerchantsLocations()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationsApi#getCurrentCustomersMerchantsLocations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationsApi#getCurrentCustomersMerchantsLocations")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;MoaLocation&gt;**](MoaLocation.md)

### Authorization


Configure bearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMerchantLocations"></a>
# **getMerchantLocations**
> kotlin.collections.List&lt;MoaLocation&gt; getMerchantLocations(id)



### Example
```kotlin
// Import classes:
//import org.myorderapp.kotlin-client.infrastructure.*
//import org.myorderapp.kotlin-client.models.*

val apiInstance = LocationsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : kotlin.collections.List<MoaLocation> = apiInstance.getMerchantLocations(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationsApi#getMerchantLocations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationsApi#getMerchantLocations")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

[**kotlin.collections.List&lt;MoaLocation&gt;**](MoaLocation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

