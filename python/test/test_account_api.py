# coding: utf-8

"""
    Ytel API V3

    Ytel API version 3  # noqa: E501

    OpenAPI spec version: 3.12
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import unittest

import swagger_client
from swagger_client.api.account_api import AccountApi  # noqa: E501
from swagger_client.rest import ApiException


class TestAccountApi(unittest.TestCase):
    """AccountApi unit test stubs"""

    def setUp(self):
        self.api = swagger_client.api.account_api.AccountApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_accounts_viewaccount(self):
        """Test case for accounts_viewaccount

        View Account  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
