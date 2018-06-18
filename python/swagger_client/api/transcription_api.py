# coding: utf-8

"""
    Ytel API V3

    Ytel API version 3  # noqa: E501

    OpenAPI spec version: 3.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from swagger_client.api_client import ApiClient


class TranscriptionApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def transcriptions_audiourltranscription(self, audiourl, **kwargs):  # noqa: E501
        """Transcribe Audio URL  # noqa: E501

        Transcribe an audio recording from a file.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async=True
        >>> thread = api.transcriptions_audiourltranscription(audiourl, async=True)
        >>> result = thread.get()

        :param async bool
        :param str audiourl: URL pointing to the location of the audio file that is to be transcribed. (required)
        :return: str
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async'):
            return self.transcriptions_audiourltranscription_with_http_info(audiourl, **kwargs)  # noqa: E501
        else:
            (data) = self.transcriptions_audiourltranscription_with_http_info(audiourl, **kwargs)  # noqa: E501
            return data

    def transcriptions_audiourltranscription_with_http_info(self, audiourl, **kwargs):  # noqa: E501
        """Transcribe Audio URL  # noqa: E501

        Transcribe an audio recording from a file.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async=True
        >>> thread = api.transcriptions_audiourltranscription_with_http_info(audiourl, async=True)
        >>> result = thread.get()

        :param async bool
        :param str audiourl: URL pointing to the location of the audio file that is to be transcribed. (required)
        :return: str
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['audiourl']  # noqa: E501
        all_params.append('async')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method transcriptions_audiourltranscription" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'audiourl' is set
        if ('audiourl' not in params or
                params['audiourl'] is None):
            raise ValueError("Missing the required parameter `audiourl` when calling `transcriptions_audiourltranscription`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}
        if 'audiourl' in params:
            form_params.append(('audiourl', params['audiourl']))  # noqa: E501

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/x-www-form-urlencoded'])  # noqa: E501

        # Authentication setting
        auth_settings = ['auth']  # noqa: E501

        return self.api_client.call_api(
            '/transcriptions/audiourltranscription.json', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='str',  # noqa: E501
            auth_settings=auth_settings,
            async=params.get('async'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def transcriptions_listtranscription(self, **kwargs):  # noqa: E501
        """List Transcriptions  # noqa: E501

        Retrieve a list of transcription objects for your Ytel account.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async=True
        >>> thread = api.transcriptions_listtranscription(async=True)
        >>> result = thread.get()

        :param async bool
        :param int page: The page count to retrieve from the total results in the collection. Page indexing starts at 1.
        :param int pagesize: The count of objects to return per page.
        :param str status: The state of the transcription.
        :param str date_transcribed: The date the transcription took place.
        :return: str
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async'):
            return self.transcriptions_listtranscription_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.transcriptions_listtranscription_with_http_info(**kwargs)  # noqa: E501
            return data

    def transcriptions_listtranscription_with_http_info(self, **kwargs):  # noqa: E501
        """List Transcriptions  # noqa: E501

        Retrieve a list of transcription objects for your Ytel account.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async=True
        >>> thread = api.transcriptions_listtranscription_with_http_info(async=True)
        >>> result = thread.get()

        :param async bool
        :param int page: The page count to retrieve from the total results in the collection. Page indexing starts at 1.
        :param int pagesize: The count of objects to return per page.
        :param str status: The state of the transcription.
        :param str date_transcribed: The date the transcription took place.
        :return: str
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['page', 'pagesize', 'status', 'date_transcribed']  # noqa: E501
        all_params.append('async')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method transcriptions_listtranscription" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}
        if 'page' in params:
            form_params.append(('page', params['page']))  # noqa: E501
        if 'pagesize' in params:
            form_params.append(('pagesize', params['pagesize']))  # noqa: E501
        if 'status' in params:
            form_params.append(('status', params['status']))  # noqa: E501
        if 'date_transcribed' in params:
            form_params.append(('dateTranscribed', params['date_transcribed']))  # noqa: E501

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/x-www-form-urlencoded'])  # noqa: E501

        # Authentication setting
        auth_settings = ['auth']  # noqa: E501

        return self.api_client.call_api(
            '/transcriptions/listtranscription.json', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='str',  # noqa: E501
            auth_settings=auth_settings,
            async=params.get('async'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def transcriptions_recordingtranscription(self, recording_sid, **kwargs):  # noqa: E501
        """Transcribe Recording  # noqa: E501

        Transcribe a recording by its RecordingSid.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async=True
        >>> thread = api.transcriptions_recordingtranscription(recording_sid, async=True)
        >>> result = thread.get()

        :param async bool
        :param str recording_sid: The unique identifier for a recording object. (required)
        :return: str
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async'):
            return self.transcriptions_recordingtranscription_with_http_info(recording_sid, **kwargs)  # noqa: E501
        else:
            (data) = self.transcriptions_recordingtranscription_with_http_info(recording_sid, **kwargs)  # noqa: E501
            return data

    def transcriptions_recordingtranscription_with_http_info(self, recording_sid, **kwargs):  # noqa: E501
        """Transcribe Recording  # noqa: E501

        Transcribe a recording by its RecordingSid.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async=True
        >>> thread = api.transcriptions_recordingtranscription_with_http_info(recording_sid, async=True)
        >>> result = thread.get()

        :param async bool
        :param str recording_sid: The unique identifier for a recording object. (required)
        :return: str
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['recording_sid']  # noqa: E501
        all_params.append('async')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method transcriptions_recordingtranscription" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'recording_sid' is set
        if ('recording_sid' not in params or
                params['recording_sid'] is None):
            raise ValueError("Missing the required parameter `recording_sid` when calling `transcriptions_recordingtranscription`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}
        if 'recording_sid' in params:
            form_params.append(('recordingSid', params['recording_sid']))  # noqa: E501

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/x-www-form-urlencoded'])  # noqa: E501

        # Authentication setting
        auth_settings = ['auth']  # noqa: E501

        return self.api_client.call_api(
            '/transcriptions/recordingtranscription.json', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='str',  # noqa: E501
            auth_settings=auth_settings,
            async=params.get('async'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def transcriptions_viewtranscription(self, transcriptionsid, **kwargs):  # noqa: E501
        """View Transcription  # noqa: E501

        Retrieve information about a transaction by its TranscriptionSid.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async=True
        >>> thread = api.transcriptions_viewtranscription(transcriptionsid, async=True)
        >>> result = thread.get()

        :param async bool
        :param str transcriptionsid: The unique identifier for a transcription object. (required)
        :return: str
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async'):
            return self.transcriptions_viewtranscription_with_http_info(transcriptionsid, **kwargs)  # noqa: E501
        else:
            (data) = self.transcriptions_viewtranscription_with_http_info(transcriptionsid, **kwargs)  # noqa: E501
            return data

    def transcriptions_viewtranscription_with_http_info(self, transcriptionsid, **kwargs):  # noqa: E501
        """View Transcription  # noqa: E501

        Retrieve information about a transaction by its TranscriptionSid.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async=True
        >>> thread = api.transcriptions_viewtranscription_with_http_info(transcriptionsid, async=True)
        >>> result = thread.get()

        :param async bool
        :param str transcriptionsid: The unique identifier for a transcription object. (required)
        :return: str
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['transcriptionsid']  # noqa: E501
        all_params.append('async')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method transcriptions_viewtranscription" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'transcriptionsid' is set
        if ('transcriptionsid' not in params or
                params['transcriptionsid'] is None):
            raise ValueError("Missing the required parameter `transcriptionsid` when calling `transcriptions_viewtranscription`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}
        if 'transcriptionsid' in params:
            form_params.append(('transcriptionsid', params['transcriptionsid']))  # noqa: E501

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/x-www-form-urlencoded'])  # noqa: E501

        # Authentication setting
        auth_settings = ['auth']  # noqa: E501

        return self.api_client.call_api(
            '/transcriptions/viewtranscription.json', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='str',  # noqa: E501
            auth_settings=auth_settings,
            async=params.get('async'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)