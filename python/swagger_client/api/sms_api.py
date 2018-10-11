# coding: utf-8

"""
    Ytel API V3

    Ytel API version 3  # noqa: E501

    OpenAPI spec version: 3.12
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from swagger_client.api_client import ApiClient


class SMSApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def sms_getinboundsms(self, **kwargs):  # noqa: E501
        """List Inbound SMS  # noqa: E501

        Retrieve a list of Inbound SMS message objects.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async=True
        >>> thread = api.sms_getinboundsms(async=True)
        >>> result = thread.get()

        :param async bool
        :param int page: The page count to retrieve from the total results in the collection. Page indexing starts at 1.
        :param int page_size: The count of objects to return per page.
        :param str _from: Filter SMS message objects from this valid 10-digit phone number (E.164 format).
        :param str to: Filter SMS message objects to this valid 10-digit phone number (E.164 format).
        :param str date_sent: Filter sms message objects by this date.
        :return: str
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async'):
            return self.sms_getinboundsms_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.sms_getinboundsms_with_http_info(**kwargs)  # noqa: E501
            return data

    def sms_getinboundsms_with_http_info(self, **kwargs):  # noqa: E501
        """List Inbound SMS  # noqa: E501

        Retrieve a list of Inbound SMS message objects.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async=True
        >>> thread = api.sms_getinboundsms_with_http_info(async=True)
        >>> result = thread.get()

        :param async bool
        :param int page: The page count to retrieve from the total results in the collection. Page indexing starts at 1.
        :param int page_size: The count of objects to return per page.
        :param str _from: Filter SMS message objects from this valid 10-digit phone number (E.164 format).
        :param str to: Filter SMS message objects to this valid 10-digit phone number (E.164 format).
        :param str date_sent: Filter sms message objects by this date.
        :return: str
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['page', 'page_size', '_from', 'to', 'date_sent']  # noqa: E501
        all_params.append('async')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method sms_getinboundsms" % key
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
            form_params.append(('Page', params['page']))  # noqa: E501
        if 'page_size' in params:
            form_params.append(('PageSize', params['page_size']))  # noqa: E501
        if '_from' in params:
            form_params.append(('From', params['_from']))  # noqa: E501
        if 'to' in params:
            form_params.append(('To', params['to']))  # noqa: E501
        if 'date_sent' in params:
            form_params.append(('DateSent', params['date_sent']))  # noqa: E501

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
            '/sms/getinboundsms.json', 'POST',
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

    def sms_listsms(self, **kwargs):  # noqa: E501
        """List SMS  # noqa: E501

        Retrieve a list of Outbound SMS message objects.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async=True
        >>> thread = api.sms_listsms(async=True)
        >>> result = thread.get()

        :param async bool
        :param int page: The page count to retrieve from the total results in the collection. Page indexing starts at 1.
        :param int page_size: Number of individual resources listed in the response per page
        :param str _from: Filter SMS message objects from this valid 10-digit phone number (E.164 format).
        :param str to: Filter SMS message objects to this valid 10-digit phone number (E.164 format).
        :param str date_sent: Only list SMS messages sent in the specified date range
        :return: str
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async'):
            return self.sms_listsms_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.sms_listsms_with_http_info(**kwargs)  # noqa: E501
            return data

    def sms_listsms_with_http_info(self, **kwargs):  # noqa: E501
        """List SMS  # noqa: E501

        Retrieve a list of Outbound SMS message objects.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async=True
        >>> thread = api.sms_listsms_with_http_info(async=True)
        >>> result = thread.get()

        :param async bool
        :param int page: The page count to retrieve from the total results in the collection. Page indexing starts at 1.
        :param int page_size: Number of individual resources listed in the response per page
        :param str _from: Filter SMS message objects from this valid 10-digit phone number (E.164 format).
        :param str to: Filter SMS message objects to this valid 10-digit phone number (E.164 format).
        :param str date_sent: Only list SMS messages sent in the specified date range
        :return: str
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['page', 'page_size', '_from', 'to', 'date_sent']  # noqa: E501
        all_params.append('async')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method sms_listsms" % key
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
            form_params.append(('Page', params['page']))  # noqa: E501
        if 'page_size' in params:
            form_params.append(('PageSize', params['page_size']))  # noqa: E501
        if '_from' in params:
            form_params.append(('From', params['_from']))  # noqa: E501
        if 'to' in params:
            form_params.append(('To', params['to']))  # noqa: E501
        if 'date_sent' in params:
            form_params.append(('DateSent', params['date_sent']))  # noqa: E501

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
            '/sms/listsms.json', 'POST',
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

    def sms_sendsms(self, _from, to, body, **kwargs):  # noqa: E501
        """Send SMS  # noqa: E501

        Send an SMS from a Ytel number  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async=True
        >>> thread = api.sms_sendsms(_from, to, body, async=True)
        >>> result = thread.get()

        :param async bool
        :param str _from: The 10-digit SMS-enabled Ytel number (E.164 format) in which the message is sent. (required)
        :param str to: The 10-digit phone number (E.164 format) that will receive the message. (required)
        :param str body: The body message that is to be sent in the text. (required)
        :param str method: Specifies the HTTP method used to request the required URL once SMS sent.
        :param str message_status_callback: URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished.
        :param bool smartsms: Check's 'to' number can receive sms or not using Carrier API, if wireless = true then text sms is sent, else wireless = false then call is recieved to end user with audible message.
        :param bool delivery_status: Delivery reports are a method to tell your system if the message has arrived on the destination phone.
        :return: str
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async'):
            return self.sms_sendsms_with_http_info(_from, to, body, **kwargs)  # noqa: E501
        else:
            (data) = self.sms_sendsms_with_http_info(_from, to, body, **kwargs)  # noqa: E501
            return data

    def sms_sendsms_with_http_info(self, _from, to, body, **kwargs):  # noqa: E501
        """Send SMS  # noqa: E501

        Send an SMS from a Ytel number  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async=True
        >>> thread = api.sms_sendsms_with_http_info(_from, to, body, async=True)
        >>> result = thread.get()

        :param async bool
        :param str _from: The 10-digit SMS-enabled Ytel number (E.164 format) in which the message is sent. (required)
        :param str to: The 10-digit phone number (E.164 format) that will receive the message. (required)
        :param str body: The body message that is to be sent in the text. (required)
        :param str method: Specifies the HTTP method used to request the required URL once SMS sent.
        :param str message_status_callback: URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished.
        :param bool smartsms: Check's 'to' number can receive sms or not using Carrier API, if wireless = true then text sms is sent, else wireless = false then call is recieved to end user with audible message.
        :param bool delivery_status: Delivery reports are a method to tell your system if the message has arrived on the destination phone.
        :return: str
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['_from', 'to', 'body', 'method', 'message_status_callback', 'smartsms', 'delivery_status']  # noqa: E501
        all_params.append('async')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method sms_sendsms" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter '_from' is set
        if ('_from' not in params or
                params['_from'] is None):
            raise ValueError("Missing the required parameter `_from` when calling `sms_sendsms`")  # noqa: E501
        # verify the required parameter 'to' is set
        if ('to' not in params or
                params['to'] is None):
            raise ValueError("Missing the required parameter `to` when calling `sms_sendsms`")  # noqa: E501
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `sms_sendsms`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}
        if '_from' in params:
            form_params.append(('From', params['_from']))  # noqa: E501
        if 'to' in params:
            form_params.append(('To', params['to']))  # noqa: E501
        if 'body' in params:
            form_params.append(('Body', params['body']))  # noqa: E501
        if 'method' in params:
            form_params.append(('Method', params['method']))  # noqa: E501
        if 'message_status_callback' in params:
            form_params.append(('MessageStatusCallback', params['message_status_callback']))  # noqa: E501
        if 'smartsms' in params:
            form_params.append(('Smartsms', params['smartsms']))  # noqa: E501
        if 'delivery_status' in params:
            form_params.append(('DeliveryStatus', params['delivery_status']))  # noqa: E501

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
            '/sms/sendsms.json', 'POST',
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

    def sms_viewdetailsms(self, message_sid, **kwargs):  # noqa: E501
        """View SMS  # noqa: E501

        Retrieve a single SMS message object with details by its SmsSid.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async=True
        >>> thread = api.sms_viewdetailsms(message_sid, async=True)
        >>> result = thread.get()

        :param async bool
        :param str message_sid: The unique identifier for a sms message. (required)
        :return: str
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async'):
            return self.sms_viewdetailsms_with_http_info(message_sid, **kwargs)  # noqa: E501
        else:
            (data) = self.sms_viewdetailsms_with_http_info(message_sid, **kwargs)  # noqa: E501
            return data

    def sms_viewdetailsms_with_http_info(self, message_sid, **kwargs):  # noqa: E501
        """View SMS  # noqa: E501

        Retrieve a single SMS message object with details by its SmsSid.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async=True
        >>> thread = api.sms_viewdetailsms_with_http_info(message_sid, async=True)
        >>> result = thread.get()

        :param async bool
        :param str message_sid: The unique identifier for a sms message. (required)
        :return: str
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['message_sid']  # noqa: E501
        all_params.append('async')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method sms_viewdetailsms" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'message_sid' is set
        if ('message_sid' not in params or
                params['message_sid'] is None):
            raise ValueError("Missing the required parameter `message_sid` when calling `sms_viewdetailsms`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}
        if 'message_sid' in params:
            form_params.append(('MessageSid', params['message_sid']))  # noqa: E501

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
            '/sms/viewdetailsms.json', 'POST',
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

    def sms_viewsms(self, message_sid, **kwargs):  # noqa: E501
        """View SMS  # noqa: E501

        Retrieve a single SMS message object by its SmsSid.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async=True
        >>> thread = api.sms_viewsms(message_sid, async=True)
        >>> result = thread.get()

        :param async bool
        :param str message_sid: The unique identifier for a sms message. (required)
        :return: str
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async'):
            return self.sms_viewsms_with_http_info(message_sid, **kwargs)  # noqa: E501
        else:
            (data) = self.sms_viewsms_with_http_info(message_sid, **kwargs)  # noqa: E501
            return data

    def sms_viewsms_with_http_info(self, message_sid, **kwargs):  # noqa: E501
        """View SMS  # noqa: E501

        Retrieve a single SMS message object by its SmsSid.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async=True
        >>> thread = api.sms_viewsms_with_http_info(message_sid, async=True)
        >>> result = thread.get()

        :param async bool
        :param str message_sid: The unique identifier for a sms message. (required)
        :return: str
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['message_sid']  # noqa: E501
        all_params.append('async')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method sms_viewsms" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'message_sid' is set
        if ('message_sid' not in params or
                params['message_sid'] is None):
            raise ValueError("Missing the required parameter `message_sid` when calling `sms_viewsms`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}
        if 'message_sid' in params:
            form_params.append(('MessageSid', params['message_sid']))  # noqa: E501

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
            '/sms/viewsms.json', 'POST',
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
