package io.swagger.client.api;

import io.swagger.client.ApiException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConferenceApi
 */
@Ignore
public class ConferenceApiTest {

    private final ConferenceApi api = new ConferenceApi();

    
    /**
     * Add Participant
     *
     * Add Participant in conference 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void conferencesAddParticipantTest() throws ApiException {
        String conferenceSid = null;
        String participantNumber = null;
        Boolean muted = null;
        Boolean deaf = null;
        String response = api.conferencesAddParticipant(conferenceSid, participantNumber, muted, deaf);

        // TODO: test validations
    }
    
    /**
     * Create Conference
     *
     * Here you can experiment with initiating a conference call through Ytel and view the request response generated when doing so.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void conferencesCreateConferenceTest() throws ApiException {
        String from = null;
        String to = null;
        String url = null;
        String method = null;
        String statusCallBackUrl = null;
        String statusCallBackMethod = null;
        String fallbackUrl = null;
        String fallbackMethod = null;
        Boolean record = null;
        String recordCallBackUrl = null;
        String recordCallBackMethod = null;
        String scheduleTime = null;
        Integer timeout = null;
        String response = api.conferencesCreateConference(from, to, url, method, statusCallBackUrl, statusCallBackMethod, fallbackUrl, fallbackMethod, record, recordCallBackUrl, recordCallBackMethod, scheduleTime, timeout);

        // TODO: test validations
    }
    
    /**
     * Silence Participant
     *
     * Deaf Mute Participant
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void conferencesDeafMuteParticipantTest() throws ApiException {
        String conferenceSid = null;
        String participantSid = null;
        Boolean muted = null;
        Boolean deaf = null;
        String response = api.conferencesDeafMuteParticipant(conferenceSid, participantSid, muted, deaf);

        // TODO: test validations
    }
    
    /**
     * Hangup Participant
     *
     * Remove a participant from a conference.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void conferencesHangupParticipantTest() throws ApiException {
        String conferenceSid = null;
        String participantSid = null;
        String response = api.conferencesHangupParticipant(conferenceSid, participantSid);

        // TODO: test validations
    }
    
    /**
     * List Participants
     *
     * Retrieve a list of participants for an in-progress conference.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void conferencesListParticipantTest() throws ApiException {
        String conferenceSid = null;
        Integer page = null;
        Integer pagesize = null;
        Boolean muted = null;
        Boolean deaf = null;
        String response = api.conferencesListParticipant(conferenceSid, page, pagesize, muted, deaf);

        // TODO: test validations
    }
    
    /**
     * List Conferences
     *
     * Retrieve a list of conference objects.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void conferencesListconferenceTest() throws ApiException {
        Integer page = null;
        Integer pagesize = null;
        String friendlyName = null;
        String dateCreated = null;
        String response = api.conferencesListconference(page, pagesize, friendlyName, dateCreated);

        // TODO: test validations
    }
    
    /**
     * Play Audio
     *
     * Play an audio file during a conference.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void conferencesPlayAudioTest() throws ApiException {
        String conferenceSid = null;
        String participantSid = null;
        String audioUrl = null;
        String response = api.conferencesPlayAudio(conferenceSid, participantSid, audioUrl);

        // TODO: test validations
    }
    
    /**
     * View Participant
     *
     * Retrieve information about a participant by its ParticipantSid.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void conferencesViewParticipantTest() throws ApiException {
        String conferenceSid = null;
        String participantSid = null;
        String response = api.conferencesViewParticipant(conferenceSid, participantSid);

        // TODO: test validations
    }
    
    /**
     * View Conference
     *
     * Retrieve information about a conference by its ConferenceSid.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void conferencesViewconferenceTest() throws ApiException {
        String conferenceSid = null;
        String response = api.conferencesViewconference(conferenceSid);

        // TODO: test validations
    }
    
}