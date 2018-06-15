package io.swagger.client.api;

import io.swagger.client.ApiException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SmsApi
 */
@Ignore
public class SmsApiTest {

    private final SmsApi api = new SmsApi();

    
    /**
     * List Inbound SMS
     *
     * Retrieve a list of Inbound SMS message objects.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void smsGetinboundsmsTest() throws ApiException {
        Integer page = null;
        Integer pageSize = null;
        String from = null;
        String to = null;
        String dateSent = null;
        String response = api.smsGetinboundsms(page, pageSize, from, to, dateSent);

        // TODO: test validations
    }
    
    /**
     * List SMS
     *
     * Retrieve a list of Outbound SMS message objects.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void smsListsmsTest() throws ApiException {
        Integer page = null;
        Integer pageSize = null;
        String from = null;
        String to = null;
        String dateSent = null;
        String response = api.smsListsms(page, pageSize, from, to, dateSent);

        // TODO: test validations
    }
    
    /**
     * Send SMS
     *
     * Send an SMS from a Ytel number
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void smsSendsmsTest() throws ApiException {
        String from = null;
        String to = null;
        String body = null;
        String method = null;
        String messageStatusCallback = null;
        Boolean smartsms = null;
        Boolean deliveryStatus = null;
        String response = api.smsSendsms(from, to, body, method, messageStatusCallback, smartsms, deliveryStatus);

        // TODO: test validations
    }
    
    /**
     * View SMS
     *
     * Retrieve a single SMS message object with details by its SmsSid.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void smsViewdetailsmsTest() throws ApiException {
        String messageSid = null;
        String response = api.smsViewdetailsms(messageSid);

        // TODO: test validations
    }
    
    /**
     * View SMS
     *
     * Retrieve a single SMS message object by its SmsSid.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void smsViewsmsTest() throws ApiException {
        String messageSid = null;
        String response = api.smsViewsms(messageSid);

        // TODO: test validations
    }
    
}
