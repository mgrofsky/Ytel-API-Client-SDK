package io.swagger.client.api;

import io.swagger.client.ApiException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EmailApi
 */
@Ignore
public class EmailApiTest {

    private final EmailApi api = new EmailApi();

    
    /**
     * Add Email Unsubscribe
     *
     * Add an email to the unsubscribe list
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void emailAddunsubscribesemailTest() throws ApiException {
        String email = null;
        String response = api.emailAddunsubscribesemail(email);

        // TODO: test validations
    }
    
    /**
     * Remove Blocked Address
     *
     * Remove an email from blocked emails list.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void emailDeleteblocksemailTest() throws ApiException {
        String email = null;
        String response = api.emailDeleteblocksemail(email);

        // TODO: test validations
    }
    
    /**
     * Remove Bounced Email
     *
     * Remove an email address from the bounced list.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void emailDeletebouncesemailTest() throws ApiException {
        String email = null;
        String response = api.emailDeletebouncesemail(email);

        // TODO: test validations
    }
    
    /**
     * Remove Invalid Email
     *
     * Remove an email from the invalid email list.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void emailDeleteinvalidemailTest() throws ApiException {
        String email = null;
        String response = api.emailDeleteinvalidemail(email);

        // TODO: test validations
    }
    
    /**
     * Remove Spam Address
     *
     * Remove an email from the spam email list.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void emailDeletespamemailTest() throws ApiException {
        String email = null;
        String response = api.emailDeletespamemail(email);

        // TODO: test validations
    }
    
    /**
     * Remove Unsubscribed Email
     *
     * Remove an email address from the list of unsubscribed emails.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void emailDeleteunsubscribedemailTest() throws ApiException {
        String email = null;
        String response = api.emailDeleteunsubscribedemail(email);

        // TODO: test validations
    }
    
    /**
     * Blocked Emails
     *
     * Retrieve a list of emails that have been blocked.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void emailListblockemailTest() throws ApiException {
        String offset = null;
        String limit = null;
        String response = api.emailListblockemail(offset, limit);

        // TODO: test validations
    }
    
    /**
     * Bounced Emails
     *
     * Retrieve a list of emails that have bounced.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void emailListbounceemailTest() throws ApiException {
        String offset = null;
        String limit = null;
        String response = api.emailListbounceemail(offset, limit);

        // TODO: test validations
    }
    
    /**
     * Invalid Emails
     *
     * Retrieve a list of invalid email addresses.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void emailListinvalidemailTest() throws ApiException {
        String offset = null;
        String limit = null;
        String response = api.emailListinvalidemail(offset, limit);

        // TODO: test validations
    }
    
    /**
     * Spam Emails
     *
     * Retrieve a list of emails that are on the spam list.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void emailListspamemailTest() throws ApiException {
        String offset = null;
        String limit = null;
        String response = api.emailListspamemail(offset, limit);

        // TODO: test validations
    }
    
    /**
     * List Unsubscribed Emails
     *
     * Retrieve a list of email addresses from the unsubscribe list.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void emailListunsubscribedemailTest() throws ApiException {
        String offset = null;
        String limit = null;
        String response = api.emailListunsubscribedemail(offset, limit);

        // TODO: test validations
    }
    
    /**
     * Send Email
     *
     * Create and submit an email message to one or more email addresses.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void emailSendemailsTest() throws ApiException {
        String to = null;
        String type = null;
        String subject = null;
        String message = null;
        String from = null;
        String cc = null;
        String bcc = null;
        String attachment = null;
        String response = api.emailSendemails(to, type, subject, message, from, cc, bcc, attachment);

        // TODO: test validations
    }
    
}
