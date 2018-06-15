package io.swagger.client.api;

import io.swagger.client.ApiException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RecordingApi
 */
@Ignore
public class RecordingApiTest {

    private final RecordingApi api = new RecordingApi();

    
    /**
     * Delete Recording
     *
     * Remove a recording from your Ytel account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void recordingDeleterecordingTest() throws ApiException {
        String recordingsid = null;
        String response = api.recordingDeleterecording(recordingsid);

        // TODO: test validations
    }
    
    /**
     * List Recordings
     *
     * Retrieve a list of recording objects.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void recordingListrecordingTest() throws ApiException {
        Integer page = null;
        Integer pagesize = null;
        String datecreated = null;
        String callsid = null;
        String response = api.recordingListrecording(page, pagesize, datecreated, callsid);

        // TODO: test validations
    }
    
    /**
     * View Recording
     *
     * Retrieve the recording of a call by its RecordingSid. This resource will return information regarding the call such as start time, end time, duration, and so forth.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void recordingViewrecordingTest() throws ApiException {
        String recordingsid = null;
        String response = api.recordingViewrecording(recordingsid);

        // TODO: test validations
    }
    
}
