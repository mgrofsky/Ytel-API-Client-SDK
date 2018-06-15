package io.swagger.client.api;

import io.swagger.client.ApiException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SubAccountApi
 */
@Ignore
public class SubAccountApiTest {

    private final SubAccountApi api = new SubAccountApi();

    
    /**
     * Create Subaccount
     *
     * Create a sub user account under the parent account
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCreatesubaccountTest() throws ApiException {
        String firstName = null;
        String lastName = null;
        String email = null;
        String friendlyName = null;
        String password = null;
        String response = api.userCreatesubaccount(firstName, lastName, email, friendlyName, password);

        // TODO: test validations
    }
    
    /**
     * Delete Subaccount
     *
     * Delete sub account or merge numbers into parent
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userDeletesubaccountTest() throws ApiException {
        String subAccountSID = null;
        String mergeNumber = null;
        String response = api.userDeletesubaccount(subAccountSID, mergeNumber);

        // TODO: test validations
    }
    
    /**
     * Toggle Subaccount Status
     *
     * Suspend or unsuspend
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userSubaccountactivationTest() throws ApiException {
        String subAccountSID = null;
        String activate = null;
        String response = api.userSubaccountactivation(subAccountSID, activate);

        // TODO: test validations
    }
    
}
