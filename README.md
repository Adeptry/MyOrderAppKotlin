# org.myorderapp.kotlin-client - Kotlin client library for MyOrderApp

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
*CatalogApi* | [**getMerchantCatalog**](docs/CatalogApi.md#getmerchantcatalog) | **GET** /v1/merchants/{id}/catalog | 
*CustomersApi* | [**createCustomer**](docs/CustomersApi.md#createcustomer) | **POST** /v1/customers | 
*CustomersApi* | [**getCurrentCustomer**](docs/CustomersApi.md#getcurrentcustomer) | **GET** /v1/customers/current | 
*CustomersApi* | [**updateCurrentCustomer**](docs/CustomersApi.md#updatecurrentcustomer) | **PATCH** /v1/customers/current | 
*LocationsApi* | [**getCurrentCustomersMerchantsLocations**](docs/LocationsApi.md#getcurrentcustomersmerchantslocations) | **GET** /v1/customers/current/merchant/locations | 
*LocationsApi* | [**getMerchantLocations**](docs/LocationsApi.md#getmerchantlocations) | **GET** /v1/merchants/{id}/locations | 
*OrdersApi* | [**addVariationToCurrentCustomersCurrentOrder**](docs/OrdersApi.md#addvariationtocurrentcustomerscurrentorder) | **PUT** /v1/customers/current/orders/current/variation | 
*OrdersApi* | [**createOrderForCurrentCustomer**](docs/OrdersApi.md#createorderforcurrentcustomer) | **POST** /v1/customers/current/orders/current | 
*OrdersApi* | [**deleteCurrentCustomersCurrentOrder**](docs/OrdersApi.md#deletecurrentcustomerscurrentorder) | **DELETE** /v1/customers/current/orders/current | 
*OrdersApi* | [**getCurrentCustomerOrders**](docs/OrdersApi.md#getcurrentcustomerorders) | **GET** /v1/customers/current/orders | 
*OrdersApi* | [**getCurrentCustomersCurrentOrder**](docs/OrdersApi.md#getcurrentcustomerscurrentorder) | **GET** /v1/customers/current/orders/current | 
*OrdersApi* | [**payForCurrentCustomersCurrentOrder**](docs/OrdersApi.md#payforcurrentcustomerscurrentorder) | **PUT** /v1/customers/current/orders/current/payment | 
*OrdersApi* | [**removeVariationFromCurrentCustomersCurrentOrder**](docs/OrdersApi.md#removevariationfromcurrentcustomerscurrentorder) | **DELETE** /v1/customers/current/orders/current/variation | 


<a name="documentation-for-models"></a>
## Documentation for Models

 - [org.myorderapp.kotlin-client.models.MoaAuthenticationInput](docs/MoaAuthenticationInput.md)
 - [org.myorderapp.kotlin-client.models.MoaAuthenticationOutput](docs/MoaAuthenticationOutput.md)
 - [org.myorderapp.kotlin-client.models.MoaCatalog](docs/MoaCatalog.md)
 - [org.myorderapp.kotlin-client.models.MoaCategory](docs/MoaCategory.md)
 - [org.myorderapp.kotlin-client.models.MoaCustomer](docs/MoaCustomer.md)
 - [org.myorderapp.kotlin-client.models.MoaCustomerCreateInput](docs/MoaCustomerCreateInput.md)
 - [org.myorderapp.kotlin-client.models.MoaCustomerUpdateInput](docs/MoaCustomerUpdateInput.md)
 - [org.myorderapp.kotlin-client.models.MoaError](docs/MoaError.md)
 - [org.myorderapp.kotlin-client.models.MoaItem](docs/MoaItem.md)
 - [org.myorderapp.kotlin-client.models.MoaLocation](docs/MoaLocation.md)
 - [org.myorderapp.kotlin-client.models.MoaMerchant](docs/MoaMerchant.md)
 - [org.myorderapp.kotlin-client.models.MoaModifier](docs/MoaModifier.md)
 - [org.myorderapp.kotlin-client.models.MoaModifierList](docs/MoaModifierList.md)
 - [org.myorderapp.kotlin-client.models.MoaOrder](docs/MoaOrder.md)
 - [org.myorderapp.kotlin-client.models.MoaOrderAddInput](docs/MoaOrderAddInput.md)
 - [org.myorderapp.kotlin-client.models.MoaOrderCreateInput](docs/MoaOrderCreateInput.md)
 - [org.myorderapp.kotlin-client.models.MoaOrderPaginatedResponse](docs/MoaOrderPaginatedResponse.md)
 - [org.myorderapp.kotlin-client.models.MoaOrderPayInput](docs/MoaOrderPayInput.md)
 - [org.myorderapp.kotlin-client.models.MoaOrderRemoveInput](docs/MoaOrderRemoveInput.md)
 - [org.myorderapp.kotlin-client.models.MoaVariation](docs/MoaVariation.md)
 - [org.myorderapp.kotlin-client.models.SquareAddress](docs/SquareAddress.md)
 - [org.myorderapp.kotlin-client.models.SquareCard](docs/SquareCard.md)
 - [org.myorderapp.kotlin-client.models.SquareCreateCustomerCardInput](docs/SquareCreateCustomerCardInput.md)
 - [org.myorderapp.kotlin-client.models.SquareDeleteCustomerCardInput](docs/SquareDeleteCustomerCardInput.md)
 - [org.myorderapp.kotlin-client.models.SquareMoney](docs/SquareMoney.md)
 - [org.myorderapp.kotlin-client.models.SquareOrder](docs/SquareOrder.md)
 - [org.myorderapp.kotlin-client.models.SquareOrderFulfillment](docs/SquareOrderFulfillment.md)
 - [org.myorderapp.kotlin-client.models.SquareOrderLineItem](docs/SquareOrderLineItem.md)
 - [org.myorderapp.kotlin-client.models.SquareOrderLineItemDiscount](docs/SquareOrderLineItemDiscount.md)
 - [org.myorderapp.kotlin-client.models.SquareOrderLineItemModifier](docs/SquareOrderLineItemModifier.md)
 - [org.myorderapp.kotlin-client.models.SquareOrderLineItemTax](docs/SquareOrderLineItemTax.md)
 - [org.myorderapp.kotlin-client.models.SquareOrderMoneyAmounts](docs/SquareOrderMoneyAmounts.md)
 - [org.myorderapp.kotlin-client.models.SquareOrderRoundingAdjustment](docs/SquareOrderRoundingAdjustment.md)
 - [org.myorderapp.kotlin-client.models.SquareOrderServiceCharge](docs/SquareOrderServiceCharge.md)
 - [org.myorderapp.kotlin-client.models.SquarePayment](docs/SquarePayment.md)
 - [org.myorderapp.kotlin-client.models.SquareRefund](docs/SquareRefund.md)
 - [org.myorderapp.kotlin-client.models.SquareTender](docs/SquareTender.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="bearer"></a>
### bearer

- **Type**: HTTP basic authentication

