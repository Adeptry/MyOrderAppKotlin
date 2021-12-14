# com.adeptry.myorderapp.client - Kotlin client library for MyOrderApp

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
*AuthenticationApi* | [**authenticate**](docs/AuthenticationApi.md#authenticate) | **POST** v1/authentication | 
*AuthenticationApi* | [**requestResetPassword**](docs/AuthenticationApi.md#requestresetpassword) | **POST** v1/authentication/password/reset/request | 
*CardsApi* | [**createCardForCurrentCustomer**](docs/CardsApi.md#createcardforcurrentcustomer) | **POST** v1/customers/current/cards | 
*CardsApi* | [**deleteCardForCurrentCustomer**](docs/CardsApi.md#deletecardforcurrentcustomer) | **DELETE** v1/customers/current/cards/{squareId} | 
*CardsApi* | [**getCardsForCurrentCustomer**](docs/CardsApi.md#getcardsforcurrentcustomer) | **GET** v1/customers/current/cards | 
*CatalogApi* | [**getCurrentCustomersMerchantsCatalog**](docs/CatalogApi.md#getcurrentcustomersmerchantscatalog) | **GET** v1/customers/current/merchant/catalog | 
*CatalogApi* | [**getMerchantCatalog**](docs/CatalogApi.md#getmerchantcatalog) | **GET** v1/merchants/{moaId}/catalog | 
*ConfigurationApi* | [**getConfiguration**](docs/ConfigurationApi.md#getconfiguration) | **GET** v1/configuration/{merchantMoaId} | 
*CustomersApi* | [**createCustomer**](docs/CustomersApi.md#createcustomer) | **POST** v1/customers | 
*CustomersApi* | [**getCurrentCustomer**](docs/CustomersApi.md#getcurrentcustomer) | **GET** v1/customers/current | 
*CustomersApi* | [**updateCurrentCustomer**](docs/CustomersApi.md#updatecurrentcustomer) | **PATCH** v1/customers/current | 
*HealthApi* | [**healthControllerCheckDatabase**](docs/HealthApi.md#healthcontrollercheckdatabase) | **GET** v1/health/database | 
*HealthApi* | [**healthControllerThrowServerError**](docs/HealthApi.md#healthcontrollerthrowservererror) | **GET** v1/health/error | 
*LocationsApi* | [**getCurrentCustomersMerchantsLocations**](docs/LocationsApi.md#getcurrentcustomersmerchantslocations) | **GET** v1/customers/current/merchant/locations | 
*LocationsApi* | [**getMerchantLocations**](docs/LocationsApi.md#getmerchantlocations) | **GET** v1/merchants/{moaId}/locations | 
*OrdersApi* | [**addVariationToCurrentCustomersCurrentOrder**](docs/OrdersApi.md#addvariationtocurrentcustomerscurrentorder) | **PUT** v1/customers/current/orders/current/variation | 
*OrdersApi* | [**createOrderForCurrentCustomer**](docs/OrdersApi.md#createorderforcurrentcustomer) | **POST** v1/customers/current/orders/current | 
*OrdersApi* | [**deleteCurrentCustomersCurrentOrder**](docs/OrdersApi.md#deletecurrentcustomerscurrentorder) | **DELETE** v1/customers/current/orders/current | 
*OrdersApi* | [**getCurrentCustomerOrders**](docs/OrdersApi.md#getcurrentcustomerorders) | **GET** v1/customers/current/orders | 
*OrdersApi* | [**getCurrentCustomersCurrentOrder**](docs/OrdersApi.md#getcurrentcustomerscurrentorder) | **GET** v1/customers/current/orders/current | 
*OrdersApi* | [**getOrderWithId**](docs/OrdersApi.md#getorderwithid) | **GET** v1/orders/{moaId} | 
*OrdersApi* | [**payForCurrentCustomersCurrentOrder**](docs/OrdersApi.md#payforcurrentcustomerscurrentorder) | **PUT** v1/customers/current/orders/current/payment | 
*OrdersApi* | [**removeVariationFromCurrentCustomersCurrentOrder**](docs/OrdersApi.md#removevariationfromcurrentcustomerscurrentorder) | **DELETE** v1/customers/current/orders/current/variation/{orderVariationUid} | 


<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.adeptry.myorderapp.client.models.InlineResponse200](docs/InlineResponse200.md)
 - [com.adeptry.myorderapp.client.models.InlineResponse503](docs/InlineResponse503.md)
 - [com.adeptry.myorderapp.client.models.MoaAWSS3File](docs/MoaAWSS3File.md)
 - [com.adeptry.myorderapp.client.models.MoaAlertDto](docs/MoaAlertDto.md)
 - [com.adeptry.myorderapp.client.models.MoaAppConfigurationDto](docs/MoaAppConfigurationDto.md)
 - [com.adeptry.myorderapp.client.models.MoaAuthenticationInput](docs/MoaAuthenticationInput.md)
 - [com.adeptry.myorderapp.client.models.MoaAuthenticationOutput](docs/MoaAuthenticationOutput.md)
 - [com.adeptry.myorderapp.client.models.MoaCatalog](docs/MoaCatalog.md)
 - [com.adeptry.myorderapp.client.models.MoaCategory](docs/MoaCategory.md)
 - [com.adeptry.myorderapp.client.models.MoaConfiguration](docs/MoaConfiguration.md)
 - [com.adeptry.myorderapp.client.models.MoaConfigurationDto](docs/MoaConfigurationDto.md)
 - [com.adeptry.myorderapp.client.models.MoaCustomer](docs/MoaCustomer.md)
 - [com.adeptry.myorderapp.client.models.MoaCustomerCreateInput](docs/MoaCustomerCreateInput.md)
 - [com.adeptry.myorderapp.client.models.MoaCustomerUpdateInput](docs/MoaCustomerUpdateInput.md)
 - [com.adeptry.myorderapp.client.models.MoaError](docs/MoaError.md)
 - [com.adeptry.myorderapp.client.models.MoaItem](docs/MoaItem.md)
 - [com.adeptry.myorderapp.client.models.MoaLocation](docs/MoaLocation.md)
 - [com.adeptry.myorderapp.client.models.MoaMerchant](docs/MoaMerchant.md)
 - [com.adeptry.myorderapp.client.models.MoaModifier](docs/MoaModifier.md)
 - [com.adeptry.myorderapp.client.models.MoaModifierList](docs/MoaModifierList.md)
 - [com.adeptry.myorderapp.client.models.MoaOptionalUpdateDto](docs/MoaOptionalUpdateDto.md)
 - [com.adeptry.myorderapp.client.models.MoaOrder](docs/MoaOrder.md)
 - [com.adeptry.myorderapp.client.models.MoaOrderAddInput](docs/MoaOrderAddInput.md)
 - [com.adeptry.myorderapp.client.models.MoaOrderCreateInput](docs/MoaOrderCreateInput.md)
 - [com.adeptry.myorderapp.client.models.MoaOrderPaginatedResponse](docs/MoaOrderPaginatedResponse.md)
 - [com.adeptry.myorderapp.client.models.MoaOrderPayInput](docs/MoaOrderPayInput.md)
 - [com.adeptry.myorderapp.client.models.MoaPasswordResetRequest](docs/MoaPasswordResetRequest.md)
 - [com.adeptry.myorderapp.client.models.MoaVariation](docs/MoaVariation.md)
 - [com.adeptry.myorderapp.client.models.SquareAddress](docs/SquareAddress.md)
 - [com.adeptry.myorderapp.client.models.SquareCard](docs/SquareCard.md)
 - [com.adeptry.myorderapp.client.models.SquareCreateCustomerCardInput](docs/SquareCreateCustomerCardInput.md)
 - [com.adeptry.myorderapp.client.models.SquareMoney](docs/SquareMoney.md)
 - [com.adeptry.myorderapp.client.models.SquareOrder](docs/SquareOrder.md)
 - [com.adeptry.myorderapp.client.models.SquareOrderFulfillment](docs/SquareOrderFulfillment.md)
 - [com.adeptry.myorderapp.client.models.SquareOrderLineItem](docs/SquareOrderLineItem.md)
 - [com.adeptry.myorderapp.client.models.SquareOrderLineItemDiscount](docs/SquareOrderLineItemDiscount.md)
 - [com.adeptry.myorderapp.client.models.SquareOrderLineItemModifier](docs/SquareOrderLineItemModifier.md)
 - [com.adeptry.myorderapp.client.models.SquareOrderLineItemTax](docs/SquareOrderLineItemTax.md)
 - [com.adeptry.myorderapp.client.models.SquareOrderMoneyAmounts](docs/SquareOrderMoneyAmounts.md)
 - [com.adeptry.myorderapp.client.models.SquareOrderRoundingAdjustment](docs/SquareOrderRoundingAdjustment.md)
 - [com.adeptry.myorderapp.client.models.SquareOrderServiceCharge](docs/SquareOrderServiceCharge.md)
 - [com.adeptry.myorderapp.client.models.SquarePayment](docs/SquarePayment.md)
 - [com.adeptry.myorderapp.client.models.SquareRefund](docs/SquareRefund.md)
 - [com.adeptry.myorderapp.client.models.SquareTender](docs/SquareTender.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="bearer"></a>
### bearer

- **Type**: HTTP basic authentication

