package io.swagger.client.api;

import io.swagger.client.ApiException;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SharedShortCodeApi
 */
@Ignore
public class SharedShortCodeApiTest {

    private final SharedShortCodeApi api = new SharedShortCodeApi();

    
    /**
     * List Keywords
     *
     * Retrieve a list of keywords associated with your Ytel account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void keywordListsTest() throws ApiException {
        Integer page = null;
        Integer pagesize = null;
        String keyword = null;
        Integer shortcode = null;
        String response = api.keywordLists(page, pagesize, keyword, shortcode);

        // TODO: test validations
    }
    
    /**
     * View Keyword
     *
     * View a set of properties for a single keyword.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void keywordViewTest() throws ApiException {
        String keywordid = null;
        String response = api.keywordView(keywordid);

        // TODO: test validations
    }
    
    /**
     * List Inbound SMS
     *
     * List All Inbound ShortCode
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void shortcodeGetinboundsmsTest() throws ApiException {
        Integer page = null;
        Integer pagesize = null;
        String from = null;
        String shortcode = null;
        String datecreated = null;
        String response = api.shortcodeGetinboundsms(page, pagesize, from, shortcode, datecreated);

        // TODO: test validations
    }
    
    /**
     * List Shortcodes
     *
     * Retrieve a list of shortcode assignment associated with your Ytel account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void shortcodeListshortcodeTest() throws ApiException {
        Integer page = null;
        Integer pagesize = null;
        String shortcode = null;
        String response = api.shortcodeListshortcode(page, pagesize, shortcode);

        // TODO: test validations
    }
    
    /**
     * Send SMS
     *
     * Send an SMS from a Ytel ShortCode
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void shortcodeSendsmsTest() throws ApiException {
        String shortcode = null;
        String to = null;
        UUID templateid = null;
        String data = null;
        String method = null;
        String messageStatusCallback = null;
        String response = api.shortcodeSendsms(shortcode, to, templateid, data, method, messageStatusCallback);

        // TODO: test validations
    }
    
    /**
     * Update Shortcode
     *
     * Update Assignment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void shortcodeUpdateshortcodeTest() throws ApiException {
        String shortcode = null;
        String friendlyName = null;
        String callbackUrl = null;
        String callbackMethod = null;
        String fallbackUrl = null;
        String fallbackUrlMethod = null;
        String response = api.shortcodeUpdateshortcode(shortcode, friendlyName, callbackUrl, callbackMethod, fallbackUrl, fallbackUrlMethod);

        // TODO: test validations
    }
    
    /**
     * View Shortcode
     *
     * The response returned here contains all resource properties associated with the given Shortcode.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void shortcodeViewshortcodeTest() throws ApiException {
        String shortcode = null;
        String response = api.shortcodeViewshortcode(shortcode);

        // TODO: test validations
    }
    
    /**
     * List Templates
     *
     * List Shortcode Templates by Type
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void templateListsTest() throws ApiException {
        String type = null;
        Integer page = null;
        Integer pagesize = null;
        String shortcode = null;
        String response = api.templateLists(type, page, pagesize, shortcode);

        // TODO: test validations
    }
    
    /**
     * View Template
     *
     * View a Shared ShortCode Template
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void templateViewTest() throws ApiException {
        UUID templateId = null;
        String response = api.templateView(templateId);

        // TODO: test validations
    }
    
}