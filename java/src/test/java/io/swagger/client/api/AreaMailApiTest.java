package io.swagger.client.api;

import io.swagger.client.ApiException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AreaMailApi
 */
@Ignore
public class AreaMailApiTest {

    private final AreaMailApi api = new AreaMailApi();

    
    /**
     * Create AreaMail
     *
     * Create a new AreaMail object.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void areamailCreateTest() throws ApiException {
        String routes = null;
        String attachbyid = null;
        String front = null;
        String back = null;
        String description = null;
        String targettype = null;
        String htmldata = null;
        String response = api.areamailCreate(routes, attachbyid, front, back, description, targettype, htmldata);

        // TODO: test validations
    }
    
    /**
     * Delete AreaMail
     *
     * Remove an AreaMail object by its AreaMailId.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void areamailDeleteTest() throws ApiException {
        String areamailid = null;
        String response = api.areamailDelete(areamailid);

        // TODO: test validations
    }
    
    /**
     * List AreaMails
     *
     * Retrieve a list of AreaMail objects.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void areamailListsTest() throws ApiException {
        Integer page = null;
        Integer pagesize = null;
        String areamailsid = null;
        String dateCreated = null;
        String response = api.areamailLists(page, pagesize, areamailsid, dateCreated);

        // TODO: test validations
    }
    
    /**
     * View AreaMail
     *
     * Retrieve an AreaMail object by its AreaMailId.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void areamailViewTest() throws ApiException {
        String areamailid = null;
        String response = api.areamailView(areamailid);

        // TODO: test validations
    }
    
}
