package io.swagger.client.api;

import io.swagger.client.ApiException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CallApi
 */
@Ignore
public class CallApiTest {

    private final CallApi api = new CallApi();

    
    /**
     * Group Call
     *
     * Group Call
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callsGroupcallTest() throws ApiException {
        String from = null;
        String to = null;
        String url = null;
        String groupConfirmKey = null;
        String groupConfirmFile = null;
        String method = null;
        String statusCallBackUrl = null;
        String statusCallBackMethod = null;
        String fallBackUrl = null;
        String fallBackMethod = null;
        String heartBeatUrl = null;
        String heartBeatMethod = null;
        Integer timeout = null;
        String playDtmf = null;
        String hideCallerId = null;
        Boolean record = null;
        String recordCallBackUrl = null;
        String recordCallBackMethod = null;
        Boolean transcribe = null;
        String transcribeCallBackUrl = null;
        String response = api.callsGroupcall(from, to, url, groupConfirmKey, groupConfirmFile, method, statusCallBackUrl, statusCallBackMethod, fallBackUrl, fallBackMethod, heartBeatUrl, heartBeatMethod, timeout, playDtmf, hideCallerId, record, recordCallBackUrl, recordCallBackMethod, transcribe, transcribeCallBackUrl);

        // TODO: test validations
    }
    
    /**
     * Interrupt Call
     *
     * Interrupt the Call by Call Sid
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callsInterruptcallsTest() throws ApiException {
        String callSid = null;
        String url = null;
        String method = null;
        String status = null;
        String response = api.callsInterruptcalls(callSid, url, method, status);

        // TODO: test validations
    }
    
    /**
     * List Calls
     *
     * A list of calls associated with your Ytel account
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callsListcallsTest() throws ApiException {
        Integer page = null;
        Integer pageSize = null;
        String to = null;
        String from = null;
        String dateCreated = null;
        String response = api.callsListcalls(page, pageSize, to, from, dateCreated);

        // TODO: test validations
    }
    
    /**
     * Make Call
     *
     * You can experiment with initiating a call through Ytel and view the request response generated when doing so and get the response in json
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callsMakecallTest() throws ApiException {
        String from = null;
        String to = null;
        String url = null;
        String method = null;
        String statusCallBackUrl = null;
        String statusCallBackMethod = null;
        String fallBackUrl = null;
        String fallBackMethod = null;
        String heartBeatUrl = null;
        String heartBeatMethod = null;
        Integer timeout = null;
        String playDtmf = null;
        Boolean hideCallerId = null;
        Boolean record = null;
        String recordCallBackUrl = null;
        String recordCallBackMethod = null;
        Boolean transcribe = null;
        String transcribeCallBackUrl = null;
        String ifMachine = null;
        String ifMachineUrl = null;
        String ifMachineMethod = null;
        Boolean feedback = null;
        String surveyId = null;
        String response = api.callsMakecall(from, to, url, method, statusCallBackUrl, statusCallBackMethod, fallBackUrl, fallBackMethod, heartBeatUrl, heartBeatMethod, timeout, playDtmf, hideCallerId, record, recordCallBackUrl, recordCallBackMethod, transcribe, transcribeCallBackUrl, ifMachine, ifMachineUrl, ifMachineMethod, feedback, surveyId);

        // TODO: test validations
    }
    
    /**
     * Send RVM
     *
     * Initiate an outbound Ringless Voicemail through Ytel.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callsMakervmTest() throws ApiException {
        String from = null;
        String rvMCallerId = null;
        String to = null;
        String voiceMailURL = null;
        String method = null;
        String statusCallBackUrl = null;
        String statsCallBackMethod = null;
        String response = api.callsMakervm(from, rvMCallerId, to, voiceMailURL, method, statusCallBackUrl, statsCallBackMethod);

        // TODO: test validations
    }
    
    /**
     * Play Audio
     *
     * Play Audio from a url
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callsPlayaudiosTest() throws ApiException {
        String callSid = null;
        String audioUrl = null;
        String sayText = null;
        Integer length = null;
        String direction = null;
        Boolean mix = null;
        String response = api.callsPlayaudios(callSid, audioUrl, sayText, length, direction, mix);

        // TODO: test validations
    }
    
    /**
     * Record Call
     *
     * Start or stop recording of an in-progress voice call.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callsRecordcallsTest() throws ApiException {
        String callSid = null;
        Boolean record = null;
        String direction = null;
        Integer timeLimit = null;
        String callBackUrl = null;
        String fileformat = null;
        String response = api.callsRecordcalls(callSid, record, direction, timeLimit, callBackUrl, fileformat);

        // TODO: test validations
    }
    
    /**
     * Play DTMF
     *
     * Play Dtmf and send the Digit
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callsSenddigitsTest() throws ApiException {
        String callSid = null;
        String playDtmf = null;
        String playDtmfDirection = null;
        String response = api.callsSenddigits(callSid, playDtmf, playDtmfDirection);

        // TODO: test validations
    }
    
    /**
     * View Call
     *
     * Retrieve a single voice call’s information by its CallSid.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callsViewcalldetailTest() throws ApiException {
        String callSid = null;
        String response = api.callsViewcalldetail(callSid);

        // TODO: test validations
    }
    
    /**
     * View Call
     *
     * Retrieve a single voice call’s information by its CallSid.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callsViewcallsTest() throws ApiException {
        String callsid = null;
        String response = api.callsViewcalls(callsid);

        // TODO: test validations
    }
    
    /**
     * Voice Effect
     *
     * Add audio voice effects to the an in-progress voice call.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callsVoiceeffectTest() throws ApiException {
        String callSid = null;
        String audioDirection = null;
        Double pitchSemiTones = null;
        Double pitchOctaves = null;
        Double pitch = null;
        Double rate = null;
        Double tempo = null;
        String response = api.callsVoiceeffect(callSid, audioDirection, pitchSemiTones, pitchOctaves, pitch, rate, tempo);

        // TODO: test validations
    }
    
}
