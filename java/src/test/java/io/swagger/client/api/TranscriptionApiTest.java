package io.swagger.client.api;

import io.swagger.client.ApiException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TranscriptionApi
 */
@Ignore
public class TranscriptionApiTest {

    private final TranscriptionApi api = new TranscriptionApi();

    
    /**
     * Transcribe Audio URL
     *
     * Transcribe an audio recording from a file.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transcriptionsAudiourltranscriptionTest() throws ApiException {
        String audiourl = null;
        String response = api.transcriptionsAudiourltranscription(audiourl);

        // TODO: test validations
    }
    
    /**
     * List Transcriptions
     *
     * Retrieve a list of transcription objects for your Ytel account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transcriptionsListtranscriptionTest() throws ApiException {
        Integer page = null;
        Integer pagesize = null;
        String status = null;
        String dateTranscribed = null;
        String response = api.transcriptionsListtranscription(page, pagesize, status, dateTranscribed);

        // TODO: test validations
    }
    
    /**
     * Transcribe Recording
     *
     * Transcribe a recording by its RecordingSid.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transcriptionsRecordingtranscriptionTest() throws ApiException {
        String recordingSid = null;
        String response = api.transcriptionsRecordingtranscription(recordingSid);

        // TODO: test validations
    }
    
    /**
     * View Transcription
     *
     * Retrieve information about a transaction by its TranscriptionSid.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transcriptionsViewtranscriptionTest() throws ApiException {
        String transcriptionsid = null;
        String response = api.transcriptionsViewtranscription(transcriptionsid);

        // TODO: test validations
    }
    
}
