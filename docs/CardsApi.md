# CardsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCardForCurrentCustomer**](CardsApi.md#createCardForCurrentCustomer) | **POST** v1/customers/current/cards | 
[**deleteCardForCurrentCustomer**](CardsApi.md#deleteCardForCurrentCustomer) | **DELETE** v1/customers/current/cards | 
[**getCardsForCurrentCustomer**](CardsApi.md#getCardsForCurrentCustomer) | **GET** v1/customers/current/cards | 





### Example
```kotlin
// Import classes:
//import com.adeptry.myorderapp.client.*
//import com.adeptry.myorderapp.client.infrastructure.*
//import com.adeptry.myorderapp.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CardsApi::class.java)
val squareCreateCustomerCardInput : SquareCreateCustomerCardInput =  // SquareCreateCustomerCardInput | 

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<SquareCard> = webService.createCardForCurrentCustomer(squareCreateCustomerCardInput)
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
val webService = apiClient.createWebservice(CardsApi::class.java)
val squareDeleteCustomerCardInput : SquareDeleteCustomerCardInput =  // SquareDeleteCustomerCardInput | 

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<SquareCard> = webService.deleteCardForCurrentCustomer(squareDeleteCustomerCardInput)
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
val webService = apiClient.createWebservice(CardsApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<SquareCard> = webService.getCardsForCurrentCustomer()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;SquareCard&gt;**](SquareCard.md)

### Authorization


Configure bearer:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

