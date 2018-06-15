package io.swagger.client.api;

import io.swagger.client.ApiException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ShortCodeApi
 */
@Ignore
public class ShortCodeApiTest {

    private final ShortCodeApi api = new ShortCodeApi();

    
    /**
     * List Inbound SMS
     *
     * Retrive a list of inbound Sms Short Code messages associated with your Ytel account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dedicatedshortcodeGetinboundsmsTest() throws ApiException {
        Integer page = null;
        Integer pagesize = null;
        String from = null;
        String shortcode = null;
        String datecreated = null;
        String response = api.dedicatedshortcodeGetinboundsms(page, pagesize, from, shortcode, datecreated);

        // TODO: test validations
    }
    
    /**
     * List Shortcodes
     *
     * Retrieve a list of Short Code assignment associated with your Ytel account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dedicatedshortcodeListshortcodeTest() throws ApiException {
        String shortcode = null;
        String page = null;
        String pagesize = null;
        String response = api.dedicatedshortcodeListshortcode(shortcode, page, pagesize);

        // TODO: test validations
    }
    
    /**
     * Send SMS
     *
     * Send Dedicated Shortcode
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dedicatedshortcodeSendsmsTest() throws ApiException {
        Integer shortcode = null;
        Double to = null;
        String body = null;
        String method = null;
        String messagestatuscallback = null;
        String response = api.dedicatedshortcodeSendsms(shortcode, to, body, method, messagestatuscallback);

        // TODO: test validations
    }
    
    /**
     * Update Shortcode
     *
     * Update a dedicated shortcode.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dedicatedshortcodeUpdateshortcodeTest() throws ApiException {
        String shortcode = null;
        String friendlyName = null;
        String callbackMethod = null;
        String callbackUrl = null;
        String fallbackMethod = null;
        String fallbackUrl = null;
        String response = api.dedicatedshortcodeUpdateshortcode(shortcode, friendlyName, callbackMethod, callbackUrl, fallbackMethod, fallbackUrl);

        // TODO: test validations
    }
    
    /**
     * View SMS
     *
     * Retrieve a single Short Code object by its shortcode assignment.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dedicatedshortcodeViewshortcodeTest() throws ApiException {
        String shortcode = null;
        String response = api.dedicatedshortcodeViewshortcode(shortcode);

        // TODO: test validations
    }
    
    /**
     * List SMS
     *
     * Retrieve a list of Short Code messages.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void shortcodeListsmsTest() throws ApiException {
        String shortcode = null;
        String to = null;
        String dateSent = null;
        Integer page = null;
        Integer pageSize = null;
        String response = api.shortcodeListsms(shortcode, to, dateSent, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * View SMS
     *
     * View a single Sms Short Code message.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void shortcodeViewsmsTest() throws ApiException {
        String messageSid = null;
        String response = api.shortcodeViewsms(messageSid);

        // TODO: test validations
    }
    
}
