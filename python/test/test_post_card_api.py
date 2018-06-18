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

import unittest

import swagger_client
from swagger_client.api.post_card_api import PostCardApi  # noqa: E501
from swagger_client.rest import ApiException


class TestPostCardApi(unittest.TestCase):
    """PostCardApi unit test stubs"""

    def setUp(self):
        self.api = swagger_client.api.post_card_api.PostCardApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_postcard_createpostcard(self):
        """Test case for postcard_createpostcard

        Create Postcard  # noqa: E501
        """
        pass

    def test_postcard_deletepostcard(self):
        """Test case for postcard_deletepostcard

        Delete Postcard  # noqa: E501
        """
        pass

    def test_postcard_listpostcard(self):
        """Test case for postcard_listpostcard

        List Postcards  # noqa: E501
        """
        pass

    def test_postcard_viewpostcard(self):
        """Test case for postcard_viewpostcard

        View Postcard  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()