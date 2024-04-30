# ProjectsApi

All URIs are relative to *https://api.fevertokens.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**projectsGet**](ProjectsApi.md#projectsGet) | **GET** /projects | Retrieve a list of projects |


<a name="projectsGet"></a>
# **projectsGet**
> ProjectList projectsGet(page, pageSize)

Retrieve a list of projects

Returns a paginated list of projects.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fevertokens.io/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    Integer page = 1; // Integer | Page number to retrieve (optional, default is 1)
    Integer pageSize = 10; // Integer | Number of projects per page (optional, default is 10)
    try {
      ProjectList result = apiInstance.projectsGet(page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#projectsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| Page number to retrieve (optional, default is 1) | [optional] [default to 1] |
| **pageSize** | **Integer**| Number of projects per page (optional, default is 10) | [optional] [default to 10] |

### Return type

[**ProjectList**](ProjectList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

