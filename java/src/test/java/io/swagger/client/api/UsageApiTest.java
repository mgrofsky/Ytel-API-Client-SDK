/*
 * Ytel API V3
 * Ytel API version 3
 *
 * OpenAPI spec version: 3.12
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsageApi
 */
@Ignore
public class UsageApiTest {

    private final UsageApi api = new UsageApi();

    
    /**
     * List Usage
     *
     * Retrieve usage metrics regarding your Ytel account. The results includes inbound/outbound voice calls and inbound/outbound SMS messages as well as carrier lookup requests.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usageListusageTest() throws ApiException {
        String productCode = null;
        String startDate = null;
        String endDate = null;
        String includeSubAccounts = null;
        String response = api.usageListusage(productCode, startDate, endDate, includeSubAccounts);

        // TODO: test validations
    }
    
}
