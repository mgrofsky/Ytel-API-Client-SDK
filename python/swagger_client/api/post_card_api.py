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


class PostCardApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def postcard_createpostcard(self, to, _from, attachbyid, front, back, message, setting, **kwargs):  # noqa: E501
        """Create Postcard  # noqa: E501

        Create, print, and mail a postcard to an address. The postcard front must be supplied as a PDF, image, or an HTML string. The back can be a PDF, image, HTML string, or it can be automatically generated by supplying a custom message.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async=True
        >>> thread = api.postcard_createpostcard(to, _from, attachbyid, front, back, message, setting, async=True)
        >>> result = thread.get()

        :param async bool
        :param str to: The AddressId or an object structured when creating an address by addresses/Create. (required)
        :param str _from: The AddressId or an object structured when creating an address by addresses/Create. (required)
        :param str attachbyid: Set an existing postcard by attaching its PostcardId. (required)
        :param str front: A 4.25\"x6.25\" or 6.25\"x11.25\" image to use as the front of the postcard.  This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. (required)
        :param str back: A 4.25\"x6.25\" or 6.25\"x11.25\" image to use as the back of the postcard, supplied as a URL, local file, or HTML string.  This allows you to customize your back design, but we will still insert the recipient address for you. (required)
        :param str message: The message for the back of the postcard with a maximum of 350 characters. (required)
        :param str setting: Code for the dimensions of the media to be printed. (required)
        :param str description: A description for the postcard.
        :param str htmldata: A string value that contains HTML markup.
        :return: str
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async'):
            return self.postcard_createpostcard_with_http_info(to, _from, attachbyid, front, back, message, setting, **kwargs)  # noqa: E501
        else:
            (data) = self.postcard_createpostcard_with_http_info(to, _from, attachbyid, front, back, message, setting, **kwargs)  # noqa: E501
            return data

    def postcard_createpostcard_with_http_info(self, to, _from, attachbyid, front, back, message, setting, **kwargs):  # noqa: E501
        """Create Postcard  # noqa: E501

        Create, print, and mail a postcard to an address. The postcard front must be supplied as a PDF, image, or an HTML string. The back can be a PDF, image, HTML string, or it can be automatically generated by supplying a custom message.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async=True
        >>> thread = api.postcard_createpostcard_with_http_info(to, _from, attachbyid, front, back, message, setting, async=True)
        >>> result = thread.get()

        :param async bool
        :param str to: The AddressId or an object structured when creating an address by addresses/Create. (required)
        :param str _from: The AddressId or an object structured when creating an address by addresses/Create. (required)
        :param str attachbyid: Set an existing postcard by attaching its PostcardId. (required)
        :param str front: A 4.25\"x6.25\" or 6.25\"x11.25\" image to use as the front of the postcard.  This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. (required)
        :param str back: A 4.25\"x6.25\" or 6.25\"x11.25\" image to use as the back of the postcard, supplied as a URL, local file, or HTML string.  This allows you to customize your back design, but we will still insert the recipient address for you. (required)
        :param str message: The message for the back of the postcard with a maximum of 350 characters. (required)
        :param str setting: Code for the dimensions of the media to be printed. (required)
        :param str description: A description for the postcard.
        :param str htmldata: A string value that contains HTML markup.
        :return: str
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['to', '_from', 'attachbyid', 'front', 'back', 'message', 'setting', 'description', 'htmldata']  # noqa: E501
        all_params.append('async')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method postcard_createpostcard" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'to' is set
        if ('to' not in params or
                params['to'] is None):
            raise ValueError("Missing the required parameter `to` when calling `postcard_createpostcard`")  # noqa: E501
        # verify the required parameter '_from' is set
        if ('_from' not in params or
                params['_from'] is None):
            raise ValueError("Missing the required parameter `_from` when calling `postcard_createpostcard`")  # noqa: E501
        # verify the required parameter 'attachbyid' is set
        if ('attachbyid' not in params or
                params['attachbyid'] is None):
            raise ValueError("Missing the required parameter `attachbyid` when calling `postcard_createpostcard`")  # noqa: E501
        # verify the required parameter 'front' is set
        if ('front' not in params or
                params['front'] is None):
            raise ValueError("Missing the required parameter `front` when calling `postcard_createpostcard`")  # noqa: E501
        # verify the required parameter 'back' is set
        if ('back' not in params or
                params['back'] is None):
            raise ValueError("Missing the required parameter `back` when calling `postcard_createpostcard`")  # noqa: E501
        # verify the required parameter 'message' is set
        if ('message' not in params or
                params['message'] is None):
            raise ValueError("Missing the required parameter `message` when calling `postcard_createpostcard`")  # noqa: E501
        # verify the required parameter 'setting' is set
        if ('setting' not in params or
                params['setting'] is None):
            raise ValueError("Missing the required parameter `setting` when calling `postcard_createpostcard`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}
        if 'to' in params:
            form_params.append(('to', params['to']))  # noqa: E501
        if '_from' in params:
            form_params.append(('from', params['_from']))  # noqa: E501
        if 'attachbyid' in params:
            form_params.append(('attachbyid', params['attachbyid']))  # noqa: E501
        if 'front' in params:
            form_params.append(('front', params['front']))  # noqa: E501
        if 'back' in params:
            form_params.append(('back', params['back']))  # noqa: E501
        if 'message' in params:
            form_params.append(('message', params['message']))  # noqa: E501
        if 'setting' in params:
            form_params.append(('setting', params['setting']))  # noqa: E501
        if 'description' in params:
            form_params.append(('description', params['description']))  # noqa: E501
        if 'htmldata' in params:
            form_params.append(('htmldata', params['htmldata']))  # noqa: E501

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
            '/Postcard/createpostcard.json', 'POST',
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

    def postcard_deletepostcard(self, postcardid, **kwargs):  # noqa: E501
        """Delete Postcard  # noqa: E501

        Remove a postcard object.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async=True
        >>> thread = api.postcard_deletepostcard(postcardid, async=True)
        >>> result = thread.get()

        :param async bool
        :param str postcardid: The unique identifier of a postcard object. (required)
        :return: str
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async'):
            return self.postcard_deletepostcard_with_http_info(postcardid, **kwargs)  # noqa: E501
        else:
            (data) = self.postcard_deletepostcard_with_http_info(postcardid, **kwargs)  # noqa: E501
            return data

    def postcard_deletepostcard_with_http_info(self, postcardid, **kwargs):  # noqa: E501
        """Delete Postcard  # noqa: E501

        Remove a postcard object.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async=True
        >>> thread = api.postcard_deletepostcard_with_http_info(postcardid, async=True)
        >>> result = thread.get()

        :param async bool
        :param str postcardid: The unique identifier of a postcard object. (required)
        :return: str
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['postcardid']  # noqa: E501
        all_params.append('async')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method postcard_deletepostcard" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'postcardid' is set
        if ('postcardid' not in params or
                params['postcardid'] is None):
            raise ValueError("Missing the required parameter `postcardid` when calling `postcard_deletepostcard`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}
        if 'postcardid' in params:
            form_params.append(('postcardid', params['postcardid']))  # noqa: E501

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
            '/Postcard/deletepostcard.json', 'POST',
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

    def postcard_listpostcard(self, **kwargs):  # noqa: E501
        """List Postcards  # noqa: E501

        Retrieve a list of postcard objects. The postcards objects are sorted by creation date, with the most recently created postcards appearing first.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async=True
        >>> thread = api.postcard_listpostcard(async=True)
        >>> result = thread.get()

        :param async bool
        :param int page: The page count to retrieve from the total results in the collection. Page indexing starts at 1.
        :param int pagesize: The count of objects to return per page.
        :param str postcardid: The unique identifier for a postcard object.
        :param str date_created: The date the postcard was created.
        :return: str
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async'):
            return self.postcard_listpostcard_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.postcard_listpostcard_with_http_info(**kwargs)  # noqa: E501
            return data

    def postcard_listpostcard_with_http_info(self, **kwargs):  # noqa: E501
        """List Postcards  # noqa: E501

        Retrieve a list of postcard objects. The postcards objects are sorted by creation date, with the most recently created postcards appearing first.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async=True
        >>> thread = api.postcard_listpostcard_with_http_info(async=True)
        >>> result = thread.get()

        :param async bool
        :param int page: The page count to retrieve from the total results in the collection. Page indexing starts at 1.
        :param int pagesize: The count of objects to return per page.
        :param str postcardid: The unique identifier for a postcard object.
        :param str date_created: The date the postcard was created.
        :return: str
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['page', 'pagesize', 'postcardid', 'date_created']  # noqa: E501
        all_params.append('async')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method postcard_listpostcard" % key
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
        if 'postcardid' in params:
            form_params.append(('postcardid', params['postcardid']))  # noqa: E501
        if 'date_created' in params:
            form_params.append(('dateCreated', params['date_created']))  # noqa: E501

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
            '/Postcard/listpostcard.json', 'POST',
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

    def postcard_viewpostcard(self, postcardid, **kwargs):  # noqa: E501
        """View Postcard  # noqa: E501

        Retrieve a postcard object by its PostcardId.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async=True
        >>> thread = api.postcard_viewpostcard(postcardid, async=True)
        >>> result = thread.get()

        :param async bool
        :param str postcardid: The unique identifier for a postcard object. (required)
        :return: str
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async'):
            return self.postcard_viewpostcard_with_http_info(postcardid, **kwargs)  # noqa: E501
        else:
            (data) = self.postcard_viewpostcard_with_http_info(postcardid, **kwargs)  # noqa: E501
            return data

    def postcard_viewpostcard_with_http_info(self, postcardid, **kwargs):  # noqa: E501
        """View Postcard  # noqa: E501

        Retrieve a postcard object by its PostcardId.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async=True
        >>> thread = api.postcard_viewpostcard_with_http_info(postcardid, async=True)
        >>> result = thread.get()

        :param async bool
        :param str postcardid: The unique identifier for a postcard object. (required)
        :return: str
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['postcardid']  # noqa: E501
        all_params.append('async')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method postcard_viewpostcard" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'postcardid' is set
        if ('postcardid' not in params or
                params['postcardid'] is None):
            raise ValueError("Missing the required parameter `postcardid` when calling `postcard_viewpostcard`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}
        if 'postcardid' in params:
            form_params.append(('postcardid', params['postcardid']))  # noqa: E501

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
            '/Postcard/viewpostcard.json', 'POST',
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
