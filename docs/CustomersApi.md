# CustomersApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomer**](CustomersApi.md#createCustomer) | **POST** /v1/customers | 
[**getCurrentCustomer**](CustomersApi.md#getCurrentCustomer) | **GET** /v1/customers/current | 
[**updateCurrentCustomer**](CustomersApi.md#updateCurrentCustomer) | **PATCH** /v1/customers/current | 


<a name="createCustomer"></a>
# **createCustomer**
> MoaCustomer createCustomer(moaCustomerCreateInput)



### Example
```kotlin
// Import classes:
//import com.adeptry.moaclient.infrastructure.*
//import com.adeptry.moaclient.models.*

val apiInstance = CustomersApi()
val moaCustomerCreateInput : MoaCustomerCreateInput =  // MoaCustomerCreateInput | 
try {
    val result : MoaCustomer = apiInstance.createCustomer(moaCustomerCreateInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#createCustomer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#createCustomer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **moaCustomerCreateInput** | [**MoaCustomerCreateInput**](MoaCustomerCreateInput.md)|  |

### Return type

[**MoaCustomer**](MoaCustomer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCurrentCustomer"></a>
# **getCurrentCustomer**
> MoaCustomer getCurrentCustomer()



### Example
```kotlin
// Import classes:
//import com.adeptry.moaclient.infrastructure.*
//import com.adeptry.moaclient.models.*

val apiInstance = CustomersApi()
try {
    val result : MoaCustomer = apiInstance.getCurrentCustomer()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#getCurrentCustomer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#getCurrentCustomer")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MoaCustomer**](MoaCustomer.md)

### Authorization


Configure bearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCurrentCustomer"></a>
# **updateCurrentCustomer**
> MoaCustomer updateCurrentCustomer(moaCustomerUpdateInput)



### Example
```kotlin
// Import classes:
//import com.adeptry.moaclient.infrastructure.*
//import com.adeptry.moaclient.models.*

val apiInstance = CustomersApi()
val moaCustomerUpdateInput : MoaCustomerUpdateInput =  // MoaCustomerUpdateInput | 
try {
    val result : MoaCustomer = apiInstance.updateCurrentCustomer(moaCustomerUpdateInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#updateCurrentCustomer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#updateCurrentCustomer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **moaCustomerUpdateInput** | [**MoaCustomerUpdateInput**](MoaCustomerUpdateInput.md)|  |

### Return type

[**MoaCustomer**](MoaCustomer.md)

### Authorization


Configure bearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

