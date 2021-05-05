# CustomersApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomer**](CustomersApi.md#createCustomer) | **POST** v1/customers | 
[**getCurrentCustomer**](CustomersApi.md#getCurrentCustomer) | **GET** v1/customers/current | 
[**updateCurrentCustomer**](CustomersApi.md#updateCurrentCustomer) | **PATCH** v1/customers/current | 





### Example
```kotlin
// Import classes:
//import com.adeptry.myorderapp.client.*
//import com.adeptry.myorderapp.client.infrastructure.*
//import com.adeptry.myorderapp.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CustomersApi::class.java)
val moaCustomerCreateInput : MoaCustomerCreateInput =  // MoaCustomerCreateInput | 

launch(Dispatchers.IO) {
    val result : MoaCustomer = webService.createCustomer(moaCustomerCreateInput)
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




### Example
```kotlin
// Import classes:
//import com.adeptry.myorderapp.client.*
//import com.adeptry.myorderapp.client.infrastructure.*
//import com.adeptry.myorderapp.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CustomersApi::class.java)

launch(Dispatchers.IO) {
    val result : MoaCustomer = webService.getCurrentCustomer()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MoaCustomer**](MoaCustomer.md)

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
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CustomersApi::class.java)
val moaCustomerUpdateInput : MoaCustomerUpdateInput =  // MoaCustomerUpdateInput | 

launch(Dispatchers.IO) {
    val result : MoaCustomer = webService.updateCurrentCustomer(moaCustomerUpdateInput)
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
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

