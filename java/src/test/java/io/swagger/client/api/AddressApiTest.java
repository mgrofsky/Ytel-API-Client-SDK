package io.swagger.client.api;

import io.swagger.client.ApiException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AddressApi
 */
@Ignore
public class AddressApiTest {

    private final AddressApi api = new AddressApi();

    
    /**
     * Create Address
     *
     * To add an address to your address book, you create a new address object. You can retrieve and delete individual addresses as well as get a list of addresses. Addresses are identified by a unique random ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addressCreateaddressTest() throws ApiException {
        String name = null;
        String address = null;
        String country = null;
        String state = null;
        String city = null;
        String zip = null;
        String description = null;
        String email = null;
        String phone = null;
        String response = api.addressCreateaddress(name, address, country, state, city, zip, description, email, phone);

        // TODO: test validations
    }
    
    /**
     * Delete Address
     *
     * To delete Address to your address book
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addressDeleteaddressTest() throws ApiException {
        String addressid = null;
        String response = api.addressDeleteaddress(addressid);

        // TODO: test validations
    }
    
    /**
     * List Addresses
     *
     * List All Address 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addressListaddressTest() throws ApiException {
        Integer page = null;
        Integer pagesize = null;
        String addressid = null;
        String dateCreated = null;
        String response = api.addressListaddress(page, pagesize, addressid, dateCreated);

        // TODO: test validations
    }
    
    /**
     * Verify Address
     *
     * Validates an address given.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addressVerifyaddressTest() throws ApiException {
        String addressid = null;
        String response = api.addressVerifyaddress(addressid);

        // TODO: test validations
    }
    
    /**
     * View Address
     *
     * View Address Specific address Book by providing the address id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addressViewaddressTest() throws ApiException {
        String addressid = null;
        String response = api.addressViewaddress(addressid);

        // TODO: test validations
    }
    
}