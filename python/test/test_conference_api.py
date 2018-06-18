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
from swagger_client.api.conference_api import ConferenceApi  # noqa: E501
from swagger_client.rest import ApiException


class TestConferenceApi(unittest.TestCase):
    """ConferenceApi unit test stubs"""

    def setUp(self):
        self.api = swagger_client.api.conference_api.ConferenceApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_conferences_add_participant(self):
        """Test case for conferences_add_participant

        Add Participant  # noqa: E501
        """
        pass

    def test_conferences_create_conference(self):
        """Test case for conferences_create_conference

        Create Conference  # noqa: E501
        """
        pass

    def test_conferences_deaf_mute_participant(self):
        """Test case for conferences_deaf_mute_participant

        Silence Participant  # noqa: E501
        """
        pass

    def test_conferences_hangup_participant(self):
        """Test case for conferences_hangup_participant

        Hangup Participant  # noqa: E501
        """
        pass

    def test_conferences_list_participant(self):
        """Test case for conferences_list_participant

        List Participants  # noqa: E501
        """
        pass

    def test_conferences_listconference(self):
        """Test case for conferences_listconference

        List Conferences  # noqa: E501
        """
        pass

    def test_conferences_play_audio(self):
        """Test case for conferences_play_audio

        Play Audio  # noqa: E501
        """
        pass

    def test_conferences_view_participant(self):
        """Test case for conferences_view_participant

        View Participant  # noqa: E501
        """
        pass

    def test_conferences_viewconference(self):
        """Test case for conferences_viewconference

        View Conference  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
