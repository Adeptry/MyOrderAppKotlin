# OrdersApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addVariationToCurrentCustomersCurrentOrder**](OrdersApi.md#addVariationToCurrentCustomersCurrentOrder) | **PUT** v1/customers/current/orders/current/variation | 
[**createOrderForCurrentCustomer**](OrdersApi.md#createOrderForCurrentCustomer) | **POST** v1/customers/current/orders/current | 
[**deleteCurrentCustomersCurrentOrder**](OrdersApi.md#deleteCurrentCustomersCurrentOrder) | **DELETE** v1/customers/current/orders/current | 
[**getCurrentCustomerOrders**](OrdersApi.md#getCurrentCustomerOrders) | **GET** v1/customers/current/orders | 
[**getCurrentCustomersCurrentOrder**](OrdersApi.md#getCurrentCustomersCurrentOrder) | **GET** v1/customers/current/orders/current | 
[**getOrderWithId**](OrdersApi.md#getOrderWithId) | **GET** v1/orders/{moaId} | 
[**payForCurrentCustomersCurrentOrder**](OrdersApi.md#payForCurrentCustomersCurrentOrder) | **PUT** v1/customers/current/orders/current/payment | 
[**removeVariationFromCurrentCustomersCurrentOrder**](OrdersApi.md#removeVariationFromCurrentCustomersCurrentOrder) | **DELETE** v1/customers/current/orders/current/variation | 





### Example
```kotlin
// Import classes:
//import com.adeptry.myorderapp.client.*
//import com.adeptry.myorderapp.client.infrastructure.*
//import com.adeptry.myorderapp.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(OrdersApi::class.java)
val moaOrderAddInput : MoaOrderAddInput =  // MoaOrderAddInput | 

launch(Dispatchers.IO) {
    val result : MoaOrder = webService.addVariationToCurrentCustomersCurrentOrder(moaOrderAddInput)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **moaOrderAddInput** | [**MoaOrderAddInput**](MoaOrderAddInput.md)|  |

### Return type

[**MoaOrder**](MoaOrder.md)

### Authorization


Configure bearer:
    ApiClient().setBearerToken("TOKEN")

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
val webService = apiClient.createWebservice(OrdersApi::class.java)
val moaOrderCreateInput : MoaOrderCreateInput =  // MoaOrderCreateInput | 

launch(Dispatchers.IO) {
    val result : MoaCustomer = webService.createOrderForCurrentCustomer(moaOrderCreateInput)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **moaOrderCreateInput** | [**MoaOrderCreateInput**](MoaOrderCreateInput.md)|  |

### Return type

[**MoaCustomer**](MoaCustomer.md)

### Authorization


Configure bearer:
    ApiClient().setBearerToken("TOKEN")

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
val webService = apiClient.createWebservice(OrdersApi::class.java)

launch(Dispatchers.IO) {
    val result : MoaCustomer = webService.deleteCurrentCustomersCurrentOrder()
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
val webService = apiClient.createWebservice(OrdersApi::class.java)
val page : Double = 8.14 // Double | 
val limit : Double = 8.14 // Double | 

launch(Dispatchers.IO) {
    val result : MoaOrderPaginatedResponse = webService.getCurrentCustomerOrders(page, limit)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Double**|  | [optional]
 **limit** | **Double**|  | [optional]

### Return type

[**MoaOrderPaginatedResponse**](MoaOrderPaginatedResponse.md)

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
val webService = apiClient.createWebservice(OrdersApi::class.java)

launch(Dispatchers.IO) {
    val result : MoaOrder = webService.getCurrentCustomersCurrentOrder()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MoaOrder**](MoaOrder.md)

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
val webService = apiClient.createWebservice(OrdersApi::class.java)
val moaId : kotlin.String = moaId_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : MoaOrder = webService.getOrderWithId(moaId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **moaId** | **kotlin.String**|  |

### Return type

[**MoaOrder**](MoaOrder.md)

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
val webService = apiClient.createWebservice(OrdersApi::class.java)
val moaOrderPayInput : MoaOrderPayInput =  // MoaOrderPayInput | 

launch(Dispatchers.IO) {
    val result : MoaOrder = webService.payForCurrentCustomersCurrentOrder(moaOrderPayInput)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **moaOrderPayInput** | [**MoaOrderPayInput**](MoaOrderPayInput.md)|  |

### Return type

[**MoaOrder**](MoaOrder.md)

### Authorization


Configure bearer:
    ApiClient().setBearerToken("TOKEN")

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
val webService = apiClient.createWebservice(OrdersApi::class.java)
val moaOrderRemoveInput : MoaOrderRemoveInput =  // MoaOrderRemoveInput | 

launch(Dispatchers.IO) {
    val result : MoaOrder = webService.removeVariationFromCurrentCustomersCurrentOrder(moaOrderRemoveInput)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **moaOrderRemoveInput** | [**MoaOrderRemoveInput**](MoaOrderRemoveInput.md)|  |

### Return type

[**MoaOrder**](MoaOrder.md)

### Authorization


Configure bearer:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

