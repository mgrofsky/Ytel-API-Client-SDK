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
 * API tests for CarrierApi
 */
@Ignore
public class CarrierApiTest {

    private final CarrierApi api = new CarrierApi();

    
    /**
     * Lookup Carrier
     *
     * Get the Carrier Lookup
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void carrierLookupTest() throws ApiException {
        String phoneNumber = null;
        String response = api.carrierLookup(phoneNumber);

        // TODO: test validations
    }
    
    /**
     * Carrier Results
     *
     * Retrieve a list of carrier lookup objects.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void carrierLookuplistTest() throws ApiException {
        Integer page = null;
        Integer pageSize = null;
        String response = api.carrierLookuplist(page, pageSize);

        // TODO: test validations
    }
    
}
