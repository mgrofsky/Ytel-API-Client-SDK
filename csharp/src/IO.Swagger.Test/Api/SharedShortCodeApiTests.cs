/* 
 * Ytel API V3
 *
 * Ytel API version 3
 *
 * OpenAPI spec version: 3.11
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
    ///  Class for testing SharedShortCodeApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class SharedShortCodeApiTests
    {
        private SharedShortCodeApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new SharedShortCodeApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of SharedShortCodeApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' SharedShortCodeApi
            //Assert.IsInstanceOfType(typeof(SharedShortCodeApi), instance, "instance is a SharedShortCodeApi");
        }

        
        /// <summary>
        /// Test KeywordLists
        /// </summary>
        [Test]
        public void KeywordListsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? page = null;
            //int? pagesize = null;
            //string keyword = null;
            //int? shortcode = null;
            //var response = instance.KeywordLists(page, pagesize, keyword, shortcode);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        
        /// <summary>
        /// Test KeywordView
        /// </summary>
        [Test]
        public void KeywordViewTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string keywordid = null;
            //var response = instance.KeywordView(keywordid);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        
        /// <summary>
        /// Test ShortcodeGetinboundsms
        /// </summary>
        [Test]
        public void ShortcodeGetinboundsmsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? page = null;
            //int? pagesize = null;
            //string from = null;
            //string shortcode = null;
            //string datecreated = null;
            //var response = instance.ShortcodeGetinboundsms(page, pagesize, from, shortcode, datecreated);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        
        /// <summary>
        /// Test ShortcodeListshortcode
        /// </summary>
        [Test]
        public void ShortcodeListshortcodeTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? page = null;
            //int? pagesize = null;
            //string shortcode = null;
            //var response = instance.ShortcodeListshortcode(page, pagesize, shortcode);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        
        /// <summary>
        /// Test ShortcodeSendsms
        /// </summary>
        [Test]
        public void ShortcodeSendsmsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string shortcode = null;
            //string to = null;
            //Guid? templateid = null;
            //string data = null;
            //string method = null;
            //string messageStatusCallback = null;
            //var response = instance.ShortcodeSendsms(shortcode, to, templateid, data, method, messageStatusCallback);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        
        /// <summary>
        /// Test ShortcodeUpdateshortcode
        /// </summary>
        [Test]
        public void ShortcodeUpdateshortcodeTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string shortcode = null;
            //string friendlyName = null;
            //string callbackUrl = null;
            //string callbackMethod = null;
            //string fallbackUrl = null;
            //string fallbackUrlMethod = null;
            //var response = instance.ShortcodeUpdateshortcode(shortcode, friendlyName, callbackUrl, callbackMethod, fallbackUrl, fallbackUrlMethod);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        
        /// <summary>
        /// Test ShortcodeViewshortcode
        /// </summary>
        [Test]
        public void ShortcodeViewshortcodeTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string shortcode = null;
            //var response = instance.ShortcodeViewshortcode(shortcode);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        
        /// <summary>
        /// Test TemplateLists
        /// </summary>
        [Test]
        public void TemplateListsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string type = null;
            //int? page = null;
            //int? pagesize = null;
            //string shortcode = null;
            //var response = instance.TemplateLists(type, page, pagesize, shortcode);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        
        /// <summary>
        /// Test TemplateView
        /// </summary>
        [Test]
        public void TemplateViewTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? templateId = null;
            //var response = instance.TemplateView(templateId);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        
    }

}
