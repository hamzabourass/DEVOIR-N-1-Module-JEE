package ma.ecom.microservicecommandes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.api.CommandesApi;
import org.openapitools.client.model.CommandesGet200ResponseInner;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MicroserviceCommandesApplicationTests {

	@BeforeEach
	void setUp() {
		ApiClient defaultClient = Configuration.getDefaultApiClient();
		defaultClient.setBasePath("http://localhost:8090");
	}

	@Test
	@DisplayName("Test commandesGet")
	void testCommandesGet() {
		CommandesApi apiInstance = new CommandesApi();

		try {
			List<CommandesGet200ResponseInner> result = apiInstance.commandesGet();
			System.out.println(result);
		} catch (ApiException e) {
			handleApiException("commandesGet", e);
		}
	}

	@Test
	@DisplayName("Test commandesIdGet")
	void testCommandesIdGet() {
		CommandesApi apiInstance = new CommandesApi();

		Long id = 1L; // ID of the command
		try {
			CommandesGet200ResponseInner result = apiInstance.commandesIdGet(id);
			System.out.println(result);
		} catch (ApiException e) {
			handleApiException("commandesIdGet", e);
		}
	}

	private void handleApiException(String methodName, ApiException e) {
		System.err.println("Exception when calling CommandesApi#" + methodName);
		System.err.println("Status code: " + e.getCode());
		System.err.println("Reason: " + e.getResponseBody());
		System.err.println("Response headers: " + e.getResponseHeaders());
		e.printStackTrace();
	}
}