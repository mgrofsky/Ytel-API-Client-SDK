package io.swagger.client.api;

import io.swagger.client.ApiException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountApi
 */
@Ignore
public class AccountApiTest {

    private final AccountApi api = new AccountApi();

    
    /**
     * View Account
     *
     * Retrieve information regarding your Ytel account by a specific date. The response object will contain data such as account status, balance, and account usage totals.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void accountsViewaccountTest() throws ApiException {
        String date = null;
        String response = api.accountsViewaccount(date);

        // TODO: test validations
    }
    
}
