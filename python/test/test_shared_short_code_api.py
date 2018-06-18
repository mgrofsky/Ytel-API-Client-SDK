# coding: utf-8

"""
    Ytel API V3

    Ytel API version 3  # noqa: E501

    OpenAPI spec version: 3.11
    
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

import unittest

import swagger_client
from swagger_client.api.shared_short_code_api import SharedShortCodeApi  # noqa: E501
from swagger_client.rest import ApiException


class TestSharedShortCodeApi(unittest.TestCase):
    """SharedShortCodeApi unit test stubs"""

    def setUp(self):
        self.api = swagger_client.api.shared_short_code_api.SharedShortCodeApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_keyword_lists(self):
        """Test case for keyword_lists

        List Keywords  # noqa: E501
        """
        pass

    def test_keyword_view(self):
        """Test case for keyword_view

        View Keyword  # noqa: E501
        """
        pass

    def test_shortcode_getinboundsms(self):
        """Test case for shortcode_getinboundsms

        List Inbound SMS  # noqa: E501
        """
        pass

    def test_shortcode_listshortcode(self):
        """Test case for shortcode_listshortcode

        List Shortcodes  # noqa: E501
        """
        pass

    def test_shortcode_sendsms(self):
        """Test case for shortcode_sendsms

        Send SMS  # noqa: E501
        """
        pass

    def test_shortcode_updateshortcode(self):
        """Test case for shortcode_updateshortcode

        Update Shortcode  # noqa: E501
        """
        pass

    def test_shortcode_viewshortcode(self):
        """Test case for shortcode_viewshortcode

        View Shortcode  # noqa: E501
        """
        pass

    def test_template_lists(self):
        """Test case for template_lists

        List Templates  # noqa: E501
        """
        pass

    def test_template_view(self):
        """Test case for template_view

        View Template  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
