# CardsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCardForCurrentCustomer**](CardsApi.md#createCardForCurrentCustomer) | **POST** /v1/customers/current/cards | 
[**deleteCardForCurrentCustomer**](CardsApi.md#deleteCardForCurrentCustomer) | **DELETE** /v1/customers/current/cards | 
[**getCardsForCurrentCustomer**](CardsApi.md#getCardsForCurrentCustomer) | **GET** /v1/customers/current/cards | 


<a name="createCardForCurrentCustomer"></a>
# **createCardForCurrentCustomer**
> kotlin.collections.List&lt;SquareCard&gt; createCardForCurrentCustomer(squareCreateCustomerCardInput)



### Example
```kotlin
// Import classes:
//import com.adeptry.moaclient.infrastructure.*
//import com.adeptry.moaclient.models.*

val apiInstance = CardsApi()
val squareCreateCustomerCardInput : SquareCreateCustomerCardInput =  // SquareCreateCustomerCardInput | 
try {
    val result : kotlin.collections.List<SquareCard> = apiInstance.createCardForCurrentCustomer(squareCreateCustomerCardInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CardsApi#createCardForCurrentCustomer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CardsApi#createCardForCurrentCustomer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **squareCreateCustomerCardInput** | [**SquareCreateCustomerCardInput**](SquareCreateCustomerCardInput.md)|  |

### Return type

[**kotlin.collections.List&lt;SquareCard&gt;**](SquareCard.md)

### Authorization


Configure bearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCardForCurrentCustomer"></a>
# **deleteCardForCurrentCustomer**
> kotlin.collections.List&lt;SquareCard&gt; deleteCardForCurrentCustomer(squareDeleteCustomerCardInput)



### Example
```kotlin
// Import classes:
//import com.adeptry.moaclient.infrastructure.*
//import com.adeptry.moaclient.models.*

val apiInstance = CardsApi()
val squareDeleteCustomerCardInput : SquareDeleteCustomerCardInput =  // SquareDeleteCustomerCardInput | 
try {
    val result : kotlin.collections.List<SquareCard> = apiInstance.deleteCardForCurrentCustomer(squareDeleteCustomerCardInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CardsApi#deleteCardForCurrentCustomer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CardsApi#deleteCardForCurrentCustomer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **squareDeleteCustomerCardInput** | [**SquareDeleteCustomerCardInput**](SquareDeleteCustomerCardInput.md)|  |

### Return type

[**kotlin.collections.List&lt;SquareCard&gt;**](SquareCard.md)

### Authorization


Configure bearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCardsForCurrentCustomer"></a>
# **getCardsForCurrentCustomer**
> kotlin.collections.List&lt;SquareCard&gt; getCardsForCurrentCustomer()



### Example
```kotlin
// Import classes:
//import com.adeptry.moaclient.infrastructure.*
//import com.adeptry.moaclient.models.*

val apiInstance = CardsApi()
try {
    val result : kotlin.collections.List<SquareCard> = apiInstance.getCardsForCurrentCustomer()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CardsApi#getCardsForCurrentCustomer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CardsApi#getCardsForCurrentCustomer")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;SquareCard&gt;**](SquareCard.md)

### Authorization


Configure bearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

