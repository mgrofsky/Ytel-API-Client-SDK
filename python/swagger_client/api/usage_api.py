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


class UsageApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def usage_listusage(self, **kwargs):  # noqa: E501
        """List Usage  # noqa: E501

        Retrieve usage metrics regarding your Ytel account. The results includes inbound/outbound voice calls and inbound/outbound SMS messages as well as carrier lookup requests.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async=True
        >>> thread = api.usage_listusage(async=True)
        >>> result = thread.get()

        :param async bool
        :param str product_code: Filter usage results by product type.
        :param str start_date: Filter usage objects by start date.
        :param str end_date: Filter usage objects by end date.
        :param str include_sub_accounts: Will include all subaccount usage data
        :return: str
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async'):
            return self.usage_listusage_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.usage_listusage_with_http_info(**kwargs)  # noqa: E501
            return data

    def usage_listusage_with_http_info(self, **kwargs):  # noqa: E501
        """List Usage  # noqa: E501

        Retrieve usage metrics regarding your Ytel account. The results includes inbound/outbound voice calls and inbound/outbound SMS messages as well as carrier lookup requests.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async=True
        >>> thread = api.usage_listusage_with_http_info(async=True)
        >>> result = thread.get()

        :param async bool
        :param str product_code: Filter usage results by product type.
        :param str start_date: Filter usage objects by start date.
        :param str end_date: Filter usage objects by end date.
        :param str include_sub_accounts: Will include all subaccount usage data
        :return: str
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['product_code', 'start_date', 'end_date', 'include_sub_accounts']  # noqa: E501
        all_params.append('async')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method usage_listusage" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}
        if 'product_code' in params:
            form_params.append(('ProductCode', params['product_code']))  # noqa: E501
        if 'start_date' in params:
            form_params.append(('startDate', params['start_date']))  # noqa: E501
        if 'end_date' in params:
            form_params.append(('endDate', params['end_date']))  # noqa: E501
        if 'include_sub_accounts' in params:
            form_params.append(('IncludeSubAccounts', params['include_sub_accounts']))  # noqa: E501

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
            '/usage/listusage.json', 'POST',
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
