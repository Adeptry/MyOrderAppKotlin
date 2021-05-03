# OrdersApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addVariationToCurrentCustomersCurrentOrder**](OrdersApi.md#addVariationToCurrentCustomersCurrentOrder) | **PUT** /v1/customers/current/orders/current/variation | 
[**createOrderForCurrentCustomer**](OrdersApi.md#createOrderForCurrentCustomer) | **POST** /v1/customers/current/orders/current | 
[**deleteCurrentCustomersCurrentOrder**](OrdersApi.md#deleteCurrentCustomersCurrentOrder) | **DELETE** /v1/customers/current/orders/current | 
[**getCurrentCustomerOrders**](OrdersApi.md#getCurrentCustomerOrders) | **GET** /v1/customers/current/orders | 
[**getCurrentCustomersCurrentOrder**](OrdersApi.md#getCurrentCustomersCurrentOrder) | **GET** /v1/customers/current/orders/current | 
[**payForCurrentCustomersCurrentOrder**](OrdersApi.md#payForCurrentCustomersCurrentOrder) | **PUT** /v1/customers/current/orders/current/payment | 
[**removeVariationFromCurrentCustomersCurrentOrder**](OrdersApi.md#removeVariationFromCurrentCustomersCurrentOrder) | **DELETE** /v1/customers/current/orders/current/variation | 


<a name="addVariationToCurrentCustomersCurrentOrder"></a>
# **addVariationToCurrentCustomersCurrentOrder**
> MoaOrder addVariationToCurrentCustomersCurrentOrder(moaOrderAddInput)



### Example
```kotlin
// Import classes:
//import org.myorderapp.kotlin-client.infrastructure.*
//import org.myorderapp.kotlin-client.models.*

val apiInstance = OrdersApi()
val moaOrderAddInput : MoaOrderAddInput =  // MoaOrderAddInput | 
try {
    val result : MoaOrder = apiInstance.addVariationToCurrentCustomersCurrentOrder(moaOrderAddInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#addVariationToCurrentCustomersCurrentOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#addVariationToCurrentCustomersCurrentOrder")
    e.printStackTrace()
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
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createOrderForCurrentCustomer"></a>
# **createOrderForCurrentCustomer**
> MoaCustomer createOrderForCurrentCustomer(moaOrderCreateInput)



### Example
```kotlin
// Import classes:
//import org.myorderapp.kotlin-client.infrastructure.*
//import org.myorderapp.kotlin-client.models.*

val apiInstance = OrdersApi()
val moaOrderCreateInput : MoaOrderCreateInput =  // MoaOrderCreateInput | 
try {
    val result : MoaCustomer = apiInstance.createOrderForCurrentCustomer(moaOrderCreateInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createOrderForCurrentCustomer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createOrderForCurrentCustomer")
    e.printStackTrace()
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
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCurrentCustomersCurrentOrder"></a>
# **deleteCurrentCustomersCurrentOrder**
> MoaCustomer deleteCurrentCustomersCurrentOrder()



### Example
```kotlin
// Import classes:
//import org.myorderapp.kotlin-client.infrastructure.*
//import org.myorderapp.kotlin-client.models.*

val apiInstance = OrdersApi()
try {
    val result : MoaCustomer = apiInstance.deleteCurrentCustomersCurrentOrder()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#deleteCurrentCustomersCurrentOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#deleteCurrentCustomersCurrentOrder")
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

<a name="getCurrentCustomerOrders"></a>
# **getCurrentCustomerOrders**
> MoaOrderPaginatedResponse getCurrentCustomerOrders(page, limit)



### Example
```kotlin
// Import classes:
//import org.myorderapp.kotlin-client.infrastructure.*
//import org.myorderapp.kotlin-client.models.*

val apiInstance = OrdersApi()
val page : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val limit : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
try {
    val result : MoaOrderPaginatedResponse = apiInstance.getCurrentCustomerOrders(page, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#getCurrentCustomerOrders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#getCurrentCustomerOrders")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **java.math.BigDecimal**|  | [optional]
 **limit** | **java.math.BigDecimal**|  | [optional]

### Return type

[**MoaOrderPaginatedResponse**](MoaOrderPaginatedResponse.md)

### Authorization


Configure bearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCurrentCustomersCurrentOrder"></a>
# **getCurrentCustomersCurrentOrder**
> MoaOrder getCurrentCustomersCurrentOrder()



### Example
```kotlin
// Import classes:
//import org.myorderapp.kotlin-client.infrastructure.*
//import org.myorderapp.kotlin-client.models.*

val apiInstance = OrdersApi()
try {
    val result : MoaOrder = apiInstance.getCurrentCustomersCurrentOrder()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#getCurrentCustomersCurrentOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#getCurrentCustomersCurrentOrder")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MoaOrder**](MoaOrder.md)

### Authorization


Configure bearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="payForCurrentCustomersCurrentOrder"></a>
# **payForCurrentCustomersCurrentOrder**
> MoaOrder payForCurrentCustomersCurrentOrder(moaOrderPayInput)



### Example
```kotlin
// Import classes:
//import org.myorderapp.kotlin-client.infrastructure.*
//import org.myorderapp.kotlin-client.models.*

val apiInstance = OrdersApi()
val moaOrderPayInput : MoaOrderPayInput =  // MoaOrderPayInput | 
try {
    val result : MoaOrder = apiInstance.payForCurrentCustomersCurrentOrder(moaOrderPayInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#payForCurrentCustomersCurrentOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#payForCurrentCustomersCurrentOrder")
    e.printStackTrace()
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
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeVariationFromCurrentCustomersCurrentOrder"></a>
# **removeVariationFromCurrentCustomersCurrentOrder**
> MoaOrder removeVariationFromCurrentCustomersCurrentOrder(moaOrderRemoveInput)



### Example
```kotlin
// Import classes:
//import org.myorderapp.kotlin-client.infrastructure.*
//import org.myorderapp.kotlin-client.models.*

val apiInstance = OrdersApi()
val moaOrderRemoveInput : MoaOrderRemoveInput =  // MoaOrderRemoveInput | 
try {
    val result : MoaOrder = apiInstance.removeVariationFromCurrentCustomersCurrentOrder(moaOrderRemoveInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#removeVariationFromCurrentCustomersCurrentOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#removeVariationFromCurrentCustomersCurrentOrder")
    e.printStackTrace()
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
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

