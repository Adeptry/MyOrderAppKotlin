# ConfigurationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getConfiguration**](ConfigurationApi.md#getConfiguration) | **GET** v1/configuration/{merchantMoaId} | 





### Example
```kotlin
// Import classes:
//import com.adeptry.myorderapp.client.*
//import com.adeptry.myorderapp.client.infrastructure.*
//import com.adeptry.myorderapp.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ConfigurationApi::class.java)
val merchantMoaId : kotlin.String = merchantMoaId_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : MoaConfigurationDto = webService.getConfiguration(merchantMoaId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantMoaId** | **kotlin.String**|  |

### Return type

[**MoaConfigurationDto**](MoaConfigurationDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

