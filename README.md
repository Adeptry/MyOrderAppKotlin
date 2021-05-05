# com.adeptry.moaclient - Kotlin client library for MyOrderApp

## Requires

* Kotlin 1.4.30
* Gradle 6.8.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthenticationApi* | [**authenticate**](docs/AuthenticationApi.md#authenticate) | **POST** /v1/authentication | 
*CardsApi* | [**createCardForCurrentCustomer**](docs/CardsApi.md#createcardforcurrentcustomer) | **POST** /v1/customers/current/cards | 
*CardsApi* | [**deleteCardForCurrentCustomer**](docs/CardsApi.md#deletecardforcurrentcustomer) | **DELETE** /v1/customers/current/cards | 
*CardsApi* | [**getCardsForCurrentCustomer**](docs/CardsApi.md#getcardsforcurrentcustomer) | **GET** /v1/customers/current/cards | 
*CatalogApi* | [**getCurrentCustomersMerchantsCatalog**](docs/CatalogApi.md#getcurrentcustomersmerchantscatalog) | **GET** /v1/customers/current/merchant/catalog | 
*CatalogApi* | [**getMerchantCatalog**](docs/CatalogApi.md#getmerchantcatalog) | **GET** /v1/merchants/{moaId}/catalog | 
*CustomersApi* | [**createCustomer**](docs/CustomersApi.md#createcustomer) | **POST** /v1/customers | 
*CustomersApi* | [**getCurrentCustomer**](docs/CustomersApi.md#getcurrentcustomer) | **GET** /v1/customers/current | 
*CustomersApi* | [**updateCurrentCustomer**](docs/CustomersApi.md#updatecurrentcustomer) | **PATCH** /v1/customers/current | 
*LocationsApi* | [**getCurrentCustomersMerchantsLocations**](docs/LocationsApi.md#getcurrentcustomersmerchantslocations) | **GET** /v1/customers/current/merchant/locations | 
*LocationsApi* | [**getMerchantLocations**](docs/LocationsApi.md#getmerchantlocations) | **GET** /v1/merchants/{moaId}/locations | 
*OrdersApi* | [**addVariationToCurrentCustomersCurrentOrder**](docs/OrdersApi.md#addvariationtocurrentcustomerscurrentorder) | **PUT** /v1/customers/current/orders/current/variation | 
*OrdersApi* | [**createOrderForCurrentCustomer**](docs/OrdersApi.md#createorderforcurrentcustomer) | **POST** /v1/customers/current/orders/current | 
*OrdersApi* | [**deleteCurrentCustomersCurrentOrder**](docs/OrdersApi.md#deletecurrentcustomerscurrentorder) | **DELETE** /v1/customers/current/orders/current | 
*OrdersApi* | [**getCurrentCustomerOrders**](docs/OrdersApi.md#getcurrentcustomerorders) | **GET** /v1/customers/current/orders | 
*OrdersApi* | [**getCurrentCustomersCurrentOrder**](docs/OrdersApi.md#getcurrentcustomerscurrentorder) | **GET** /v1/customers/current/orders/current | 
*OrdersApi* | [**getOrderWithId**](docs/OrdersApi.md#getorderwithid) | **GET** /v1/orders/{moaId} | 
*OrdersApi* | [**payForCurrentCustomersCurrentOrder**](docs/OrdersApi.md#payforcurrentcustomerscurrentorder) | **PUT** /v1/customers/current/orders/current/payment | 
*OrdersApi* | [**removeVariationFromCurrentCustomersCurrentOrder**](docs/OrdersApi.md#removevariationfromcurrentcustomerscurrentorder) | **DELETE** /v1/customers/current/orders/current/variation | 


<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.adeptry.moaclient.models.MoaAuthenticationInput](docs/MoaAuthenticationInput.md)
 - [com.adeptry.moaclient.models.MoaAuthenticationOutput](docs/MoaAuthenticationOutput.md)
 - [com.adeptry.moaclient.models.MoaCatalog](docs/MoaCatalog.md)
 - [com.adeptry.moaclient.models.MoaCategory](docs/MoaCategory.md)
 - [com.adeptry.moaclient.models.MoaCustomer](docs/MoaCustomer.md)
 - [com.adeptry.moaclient.models.MoaCustomerCreateInput](docs/MoaCustomerCreateInput.md)
 - [com.adeptry.moaclient.models.MoaCustomerUpdateInput](docs/MoaCustomerUpdateInput.md)
 - [com.adeptry.moaclient.models.MoaError](docs/MoaError.md)
 - [com.adeptry.moaclient.models.MoaItem](docs/MoaItem.md)
 - [com.adeptry.moaclient.models.MoaLocation](docs/MoaLocation.md)
 - [com.adeptry.moaclient.models.MoaMerchant](docs/MoaMerchant.md)
 - [com.adeptry.moaclient.models.MoaModifier](docs/MoaModifier.md)
 - [com.adeptry.moaclient.models.MoaModifierList](docs/MoaModifierList.md)
 - [com.adeptry.moaclient.models.MoaOrder](docs/MoaOrder.md)
 - [com.adeptry.moaclient.models.MoaOrderAddInput](docs/MoaOrderAddInput.md)
 - [com.adeptry.moaclient.models.MoaOrderCreateInput](docs/MoaOrderCreateInput.md)
 - [com.adeptry.moaclient.models.MoaOrderPaginatedResponse](docs/MoaOrderPaginatedResponse.md)
 - [com.adeptry.moaclient.models.MoaOrderPayInput](docs/MoaOrderPayInput.md)
 - [com.adeptry.moaclient.models.MoaOrderRemoveInput](docs/MoaOrderRemoveInput.md)
 - [com.adeptry.moaclient.models.MoaVariation](docs/MoaVariation.md)
 - [com.adeptry.moaclient.models.SquareAddress](docs/SquareAddress.md)
 - [com.adeptry.moaclient.models.SquareCard](docs/SquareCard.md)
 - [com.adeptry.moaclient.models.SquareCreateCustomerCardInput](docs/SquareCreateCustomerCardInput.md)
 - [com.adeptry.moaclient.models.SquareDeleteCustomerCardInput](docs/SquareDeleteCustomerCardInput.md)
 - [com.adeptry.moaclient.models.SquareMoney](docs/SquareMoney.md)
 - [com.adeptry.moaclient.models.SquareOrder](docs/SquareOrder.md)
 - [com.adeptry.moaclient.models.SquareOrderFulfillment](docs/SquareOrderFulfillment.md)
 - [com.adeptry.moaclient.models.SquareOrderLineItem](docs/SquareOrderLineItem.md)
 - [com.adeptry.moaclient.models.SquareOrderLineItemDiscount](docs/SquareOrderLineItemDiscount.md)
 - [com.adeptry.moaclient.models.SquareOrderLineItemModifier](docs/SquareOrderLineItemModifier.md)
 - [com.adeptry.moaclient.models.SquareOrderLineItemTax](docs/SquareOrderLineItemTax.md)
 - [com.adeptry.moaclient.models.SquareOrderMoneyAmounts](docs/SquareOrderMoneyAmounts.md)
 - [com.adeptry.moaclient.models.SquareOrderRoundingAdjustment](docs/SquareOrderRoundingAdjustment.md)
 - [com.adeptry.moaclient.models.SquareOrderServiceCharge](docs/SquareOrderServiceCharge.md)
 - [com.adeptry.moaclient.models.SquarePayment](docs/SquarePayment.md)
 - [com.adeptry.moaclient.models.SquareRefund](docs/SquareRefund.md)
 - [com.adeptry.moaclient.models.SquareTender](docs/SquareTender.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="bearer"></a>
### bearer

- **Type**: HTTP basic authentication

