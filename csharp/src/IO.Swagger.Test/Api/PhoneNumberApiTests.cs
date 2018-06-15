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
    ///  Class for testing PhoneNumberApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class PhoneNumberApiTests
    {
        private PhoneNumberApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new PhoneNumberApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of PhoneNumberApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' PhoneNumberApi
            //Assert.IsInstanceOfType(typeof(PhoneNumberApi), instance, "instance is a PhoneNumberApi");
        }

        
        /// <summary>
        /// Test IncomingphoneAvailablenumber
        /// </summary>
        [Test]
        public void IncomingphoneAvailablenumberTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string numbertype = null;
            //string areacode = null;
            //int? pagesize = null;
            //var response = instance.IncomingphoneAvailablenumber(numbertype, areacode, pagesize);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        
        /// <summary>
        /// Test IncomingphoneBulkbuy
        /// </summary>
        [Test]
        public void IncomingphoneBulkbuyTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string numberType = null;
            //string areaCode = null;
            //string quantity = null;
            //string leftover = null;
            //var response = instance.IncomingphoneBulkbuy(numberType, areaCode, quantity, leftover);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        
        /// <summary>
        /// Test IncomingphoneBuynumber
        /// </summary>
        [Test]
        public void IncomingphoneBuynumberTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string phoneNumber = null;
            //var response = instance.IncomingphoneBuynumber(phoneNumber);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        
        /// <summary>
        /// Test IncomingphoneGetdidscore
        /// </summary>
        [Test]
        public void IncomingphoneGetdidscoreTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string phonenumber = null;
            //var response = instance.IncomingphoneGetdidscore(phonenumber);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        
        /// <summary>
        /// Test IncomingphoneListnumber
        /// </summary>
        [Test]
        public void IncomingphoneListnumberTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? page = null;
            //int? pageSize = null;
            //string numberType = null;
            //string friendlyName = null;
            //var response = instance.IncomingphoneListnumber(page, pageSize, numberType, friendlyName);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        
        /// <summary>
        /// Test IncomingphoneMassreleasenumber
        /// </summary>
        [Test]
        public void IncomingphoneMassreleasenumberTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string phoneNumber = null;
            //var response = instance.IncomingphoneMassreleasenumber(phoneNumber);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        
        /// <summary>
        /// Test IncomingphoneMassupdatenumber
        /// </summary>
        [Test]
        public void IncomingphoneMassupdatenumberTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string phoneNumber = null;
            //string voiceUrl = null;
            //string friendlyName = null;
            //string voiceMethod = null;
            //string voiceFallbackUrl = null;
            //string voiceFallbackMethod = null;
            //string hangupCallback = null;
            //string hangupCallbackMethod = null;
            //string heartbeatUrl = null;
            //string heartbeatMethod = null;
            //string smsUrl = null;
            //string smsMethod = null;
            //string smsFallbackUrl = null;
            //string smsFallbackMethod = null;
            //var response = instance.IncomingphoneMassupdatenumber(phoneNumber, voiceUrl, friendlyName, voiceMethod, voiceFallbackUrl, voiceFallbackMethod, hangupCallback, hangupCallbackMethod, heartbeatUrl, heartbeatMethod, smsUrl, smsMethod, smsFallbackUrl, smsFallbackMethod);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        
        /// <summary>
        /// Test IncomingphoneReleasenumberByResponseTypePost
        /// </summary>
        [Test]
        public void IncomingphoneReleasenumberByResponseTypePostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string phoneNumber = null;
            //string responseType = null;
            //var response = instance.IncomingphoneReleasenumberByResponseTypePost(phoneNumber, responseType);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        
        /// <summary>
        /// Test IncomingphoneTransferphonenumbers
        /// </summary>
        [Test]
        public void IncomingphoneTransferphonenumbersTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string phonenumber = null;
            //string fromaccountsid = null;
            //string toaccountsid = null;
            //var response = instance.IncomingphoneTransferphonenumbers(phonenumber, fromaccountsid, toaccountsid);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        
        /// <summary>
        /// Test IncomingphoneUpdatenumber
        /// </summary>
        [Test]
        public void IncomingphoneUpdatenumberTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string phoneNumber = null;
            //string voiceUrl = null;
            //string friendlyName = null;
            //string voiceMethod = null;
            //string voiceFallbackUrl = null;
            //string voiceFallbackMethod = null;
            //string hangupCallback = null;
            //string hangupCallbackMethod = null;
            //string heartbeatUrl = null;
            //string heartbeatMethod = null;
            //string smsUrl = null;
            //string smsMethod = null;
            //string smsFallbackUrl = null;
            //string smsFallbackMethod = null;
            //var response = instance.IncomingphoneUpdatenumber(phoneNumber, voiceUrl, friendlyName, voiceMethod, voiceFallbackUrl, voiceFallbackMethod, hangupCallback, hangupCallbackMethod, heartbeatUrl, heartbeatMethod, smsUrl, smsMethod, smsFallbackUrl, smsFallbackMethod);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        
        /// <summary>
        /// Test IncomingphoneViewnumber
        /// </summary>
        [Test]
        public void IncomingphoneViewnumberTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string phoneNumber = null;
            //var response = instance.IncomingphoneViewnumber(phoneNumber);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        
    }

}