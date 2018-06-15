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
    ///  Class for testing LetterApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class LetterApiTests
    {
        private LetterApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new LetterApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of LetterApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' LetterApi
            //Assert.IsInstanceOfType(typeof(LetterApi), instance, "instance is a LetterApi");
        }

        
        /// <summary>
        /// Test LetterCreate
        /// </summary>
        [Test]
        public void LetterCreateTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string to = null;
            //string from = null;
            //string attachbyid = null;
            //string file = null;
            //string color = null;
            //string description = null;
            //string extraservice = null;
            //string doublesided = null;
            //string template = null;
            //string htmldata = null;
            //var response = instance.LetterCreate(to, from, attachbyid, file, color, description, extraservice, doublesided, template, htmldata);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        
        /// <summary>
        /// Test LetterDelete
        /// </summary>
        [Test]
        public void LetterDeleteTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string lettersid = null;
            //var response = instance.LetterDelete(lettersid);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        
        /// <summary>
        /// Test LetterListsletter
        /// </summary>
        [Test]
        public void LetterListsletterTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? page = null;
            //int? pagesize = null;
            //string lettersid = null;
            //string dateCreated = null;
            //var response = instance.LetterListsletter(page, pagesize, lettersid, dateCreated);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        
        /// <summary>
        /// Test LetterViewletter
        /// </summary>
        [Test]
        public void LetterViewletterTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string lettersid = null;
            //var response = instance.LetterViewletter(lettersid);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        
    }

}