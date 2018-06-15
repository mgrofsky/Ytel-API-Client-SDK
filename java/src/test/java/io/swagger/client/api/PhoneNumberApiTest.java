package io.swagger.client.api;

import io.swagger.client.ApiException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PhoneNumberApi
 */
@Ignore
public class PhoneNumberApiTest {

    private final PhoneNumberApi api = new PhoneNumberApi();

    
    /**
     * Available Numbers
     *
     * Retrieve a list of available phone numbers that can be purchased and used for your Ytel account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void incomingphoneAvailablenumberTest() throws ApiException {
        String numbertype = null;
        String areacode = null;
        Integer pagesize = null;
        String response = api.incomingphoneAvailablenumber(numbertype, areacode, pagesize);

        // TODO: test validations
    }
    
    /**
     * Bulk Buy Numbers
     *
     * Purchase a selected number of DID&#39;s from specific area codes to be used with your Ytel account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void incomingphoneBulkbuyTest() throws ApiException {
        String numberType = null;
        String areaCode = null;
        String quantity = null;
        String leftover = null;
        String response = api.incomingphoneBulkbuy(numberType, areaCode, quantity, leftover);

        // TODO: test validations
    }
    
    /**
     * Purchase Number
     *
     * Purchase a phone number to be used with your Ytel account
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void incomingphoneBuynumberTest() throws ApiException {
        String phoneNumber = null;
        String response = api.incomingphoneBuynumber(phoneNumber);

        // TODO: test validations
    }
    
    /**
     * Get DID Score
     *
     * Get DID Score Number
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void incomingphoneGetdidscoreTest() throws ApiException {
        String phonenumber = null;
        String response = api.incomingphoneGetdidscore(phonenumber);

        // TODO: test validations
    }
    
    /**
     * List Numbers
     *
     * Retrieve a list of purchased phones numbers associated with your Ytel account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void incomingphoneListnumberTest() throws ApiException {
        Integer page = null;
        Integer pageSize = null;
        String numberType = null;
        String friendlyName = null;
        String response = api.incomingphoneListnumber(page, pageSize, numberType, friendlyName);

        // TODO: test validations
    }
    
    /**
     * Bulk Release
     *
     * Remove a purchased Ytel number from your account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void incomingphoneMassreleasenumberTest() throws ApiException {
        String phoneNumber = null;
        String response = api.incomingphoneMassreleasenumber(phoneNumber);

        // TODO: test validations
    }
    
    /**
     * Bulk Update Numbers
     *
     * Update properties for a Ytel numbers that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void incomingphoneMassupdatenumberTest() throws ApiException {
        String phoneNumber = null;
        String voiceUrl = null;
        String friendlyName = null;
        String voiceMethod = null;
        String voiceFallbackUrl = null;
        String voiceFallbackMethod = null;
        String hangupCallback = null;
        String hangupCallbackMethod = null;
        String heartbeatUrl = null;
        String heartbeatMethod = null;
        String smsUrl = null;
        String smsMethod = null;
        String smsFallbackUrl = null;
        String smsFallbackMethod = null;
        String response = api.incomingphoneMassupdatenumber(phoneNumber, voiceUrl, friendlyName, voiceMethod, voiceFallbackUrl, voiceFallbackMethod, hangupCallback, hangupCallbackMethod, heartbeatUrl, heartbeatMethod, smsUrl, smsMethod, smsFallbackUrl, smsFallbackMethod);

        // TODO: test validations
    }
    
    /**
     * Release Number
     *
     * Remove a purchased Ytel number from your account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void incomingphoneReleasenumberByResponseTypePostTest() throws ApiException {
        String phoneNumber = null;
        String responseType = null;
        String response = api.incomingphoneReleasenumberByResponseTypePost(phoneNumber, responseType);

        // TODO: test validations
    }
    
    /**
     * Move Number
     *
     * Transfer phone number that has been purchased for from one account to another account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void incomingphoneTransferphonenumbersTest() throws ApiException {
        String phonenumber = null;
        String fromaccountsid = null;
        String toaccountsid = null;
        String response = api.incomingphoneTransferphonenumbers(phonenumber, fromaccountsid, toaccountsid);

        // TODO: test validations
    }
    
    /**
     * Update Number
     *
     * Update properties for a Ytel number that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void incomingphoneUpdatenumberTest() throws ApiException {
        String phoneNumber = null;
        String voiceUrl = null;
        String friendlyName = null;
        String voiceMethod = null;
        String voiceFallbackUrl = null;
        String voiceFallbackMethod = null;
        String hangupCallback = null;
        String hangupCallbackMethod = null;
        String heartbeatUrl = null;
        String heartbeatMethod = null;
        String smsUrl = null;
        String smsMethod = null;
        String smsFallbackUrl = null;
        String smsFallbackMethod = null;
        String response = api.incomingphoneUpdatenumber(phoneNumber, voiceUrl, friendlyName, voiceMethod, voiceFallbackUrl, voiceFallbackMethod, hangupCallback, hangupCallbackMethod, heartbeatUrl, heartbeatMethod, smsUrl, smsMethod, smsFallbackUrl, smsFallbackMethod);

        // TODO: test validations
    }
    
    /**
     * View Details
     *
     * Retrieve the details for a phone number by its number.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void incomingphoneViewnumberTest() throws ApiException {
        String phoneNumber = null;
        String response = api.incomingphoneViewnumber(phoneNumber);

        // TODO: test validations
    }
    
}
