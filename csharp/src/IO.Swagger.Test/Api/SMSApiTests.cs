/* 
 * Ytel API V3
 *
 * Ytel API version 3
 *
 * OpenAPI spec version: 3.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using IO.Swagger.Client;
using IO.Swagger.Api;

namespace IO.Swagger.Test
{
    /// <summary>
    ///  Class for testing SMSApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class SMSApiTests
    {
        private SMSApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new SMSApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of SMSApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' SMSApi
            //Assert.IsInstanceOfType(typeof(SMSApi), instance, "instance is a SMSApi");
        }

        
        /// <summary>
        /// Test SmsGetinboundsms
        /// </summary>
        [Test]
        public void SmsGetinboundsmsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? page = null;
            //int? pageSize = null;
            //string from = null;
            //string to = null;
            //string dateSent = null;
            //var response = instance.SmsGetinboundsms(page, pageSize, from, to, dateSent);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        
        /// <summary>
        /// Test SmsListsms
        /// </summary>
        [Test]
        public void SmsListsmsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? page = null;
            //int? pageSize = null;
            //string from = null;
            //string to = null;
            //string dateSent = null;
            //var response = instance.SmsListsms(page, pageSize, from, to, dateSent);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        
        /// <summary>
        /// Test SmsSendsms
        /// </summary>
        [Test]
        public void SmsSendsmsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string from = null;
            //string to = null;
            //string body = null;
            //string method = null;
            //string messageStatusCallback = null;
            //bool? smartsms = null;
            //bool? deliveryStatus = null;
            //var response = instance.SmsSendsms(from, to, body, method, messageStatusCallback, smartsms, deliveryStatus);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        
        /// <summary>
        /// Test SmsViewdetailsms
        /// </summary>
        [Test]
        public void SmsViewdetailsmsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string messageSid = null;
            //var response = instance.SmsViewdetailsms(messageSid);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        
        /// <summary>
        /// Test SmsViewsms
        /// </summary>
        [Test]
        public void SmsViewsmsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string messageSid = null;
            //var response = instance.SmsViewsms(messageSid);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        
    }

}
