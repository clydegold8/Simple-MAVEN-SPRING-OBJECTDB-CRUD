/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simplecrud;

import junit.framework.TestCase;

/**
 *
 * @author VIZI-BILL PH
 */
public class UserInfoTest extends TestCase {

    public UserInfoTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getUsername method, of class UserInfo.
     */
    public void testGetUsername() {
        System.out.println("getUsername");
        UserInfo instance = new UserInfo();
        instance.setUsername("test");
        String expResult = "test";
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUsername method, of class UserInfo.
     */
    public void testSetUsername() {
        System.out.println("setUsername");
        String Username = "test";
        UserInfo instance = new UserInfo();
        instance.setUsername(Username);

    }

    /**
     * Test of getEmail method, of class UserInfo.
     */
    public void testGetEmail() {
        System.out.println("getEmail");
        UserInfo instance = new UserInfo();
        instance.setEmail("test");
        String expResult = "test";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmail method, of class UserInfo.
     */
    public void testSetEmail() {
        System.out.println("setEmail");
        String Email = "test";
        UserInfo instance = new UserInfo();
        instance.setEmail(Email);
    }

    /**
     * Test of getDate method, of class UserInfo.
     */
    public void testGetDate() {
        System.out.println("getDate");
        UserInfo instance = new UserInfo();
        instance.setDate("test");
        String expResult = "test";
        String result = instance.getDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDate method, of class UserInfo.
     */
    public void testSetDate() {
        System.out.println("setDate");
        String Date = "test";
        UserInfo instance = new UserInfo();
        instance.setDate(Date);
    }

    /**
     * Test of getId method, of class UserInfo.
     */
    public void testGetId() {
        System.out.println("getId");
        UserInfo instance = new UserInfo();
        instance.setId(1L);
        long expResult = 1L;
        long result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class UserInfo.
     */
    public void testSetId() {
        System.out.println("setId");
        Long Id = 1L;
        UserInfo instance = new UserInfo();
        instance.setId(Id);
    }

    /**
     * Test of getPassword method, of class UserInfo.
     */
    public void testGetPassword() {
        System.out.println("getPassword");
        UserInfo instance = new UserInfo();
        instance.setPassword("test");
        String expResult = "test";
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPassword method, of class UserInfo.
     */
    public void testSetPassword() {
        System.out.println("setPassword");
        String Password = "test";
        UserInfo instance = new UserInfo();
        instance.setPassword(Password);
    }

    /**
     * Test of getResponse method, of class UserInfo.
     */
    public void testGetResponse() {
        System.out.println("getResponse");
        UserInfo instance = new UserInfo();
        instance.setResponse("test");
        String expResult = "test";
        String result = instance.getResponse();
        assertEquals(expResult, result);
    }

    /**
     * Test of setResponse method, of class UserInfo.
     */
    public void testSetResponse() {
        System.out.println("setResponse");
        String Response = "test";
        UserInfo instance = new UserInfo();
        instance.setResponse(Response);
    }

    /**
     * Test of getErrorInput method, of class UserInfo.
     */
    public void testGetErrorInput() {
        System.out.println("getErrorInput");
        UserInfo instance = new UserInfo();
        instance.setErrorInput("test");
        String expResult = "test";
        String result = instance.getErrorInput();
        assertEquals(expResult, result);
    }

    /**
     * Test of setErrorInput method, of class UserInfo.
     */
    public void testSetErrorInput() {
        System.out.println("setErrorInput");
        String ErrorInput = "test";
        UserInfo instance = new UserInfo();
        instance.setErrorInput(ErrorInput);
    }

}
