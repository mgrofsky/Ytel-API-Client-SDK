package io.swagger.client.api;

import io.swagger.client.ApiException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LetterApi
 */
@Ignore
public class LetterApiTest {

    private final LetterApi api = new LetterApi();

    
    /**
     * Create Letter
     *
     * Create, print, and mail a letter to an address. The letter file must be supplied as a PDF or an HTML string.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void letterCreateTest() throws ApiException {
        String to = null;
        String from = null;
        String attachbyid = null;
        String file = null;
        String color = null;
        String description = null;
        String extraservice = null;
        String doublesided = null;
        String template = null;
        String htmldata = null;
        String response = api.letterCreate(to, from, attachbyid, file, color, description, extraservice, doublesided, template, htmldata);

        // TODO: test validations
    }
    
    /**
     * Delete Letter
     *
     * Remove a letter object by its LetterId.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void letterDeleteTest() throws ApiException {
        String lettersid = null;
        String response = api.letterDelete(lettersid);

        // TODO: test validations
    }
    
    /**
     * List Letters
     *
     * Retrieve a list of letter objects. The letter objects are sorted by creation date, with the most recently created letters appearing first.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void letterListsletterTest() throws ApiException {
        Integer page = null;
        Integer pagesize = null;
        String lettersid = null;
        String dateCreated = null;
        String response = api.letterListsletter(page, pagesize, lettersid, dateCreated);

        // TODO: test validations
    }
    
    /**
     * View Letter
     *
     * Retrieve a letter object by its LetterSid.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void letterViewletterTest() throws ApiException {
        String lettersid = null;
        String response = api.letterViewletter(lettersid);

        // TODO: test validations
    }
    
}
