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
public class FormStatusTest extends TestCase {

    public FormStatusTest(String testName) {
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
     * Test of getsStatus method, of class FormStatus.
     */
    public void testGetsStatus() {
        System.out.println("getsStatus");
        FormStatus instance = new FormStatus();
        instance.setsStatus("test");
        String expResult = "test";
        String result = instance.getsStatus();
        assertEquals(expResult, result);
    }

    /**
     * Test of setsStatus method, of class FormStatus.
     */
    public void testSetsStatus() {
        System.out.println("setsStatus");
        String sStatus = "test";
        FormStatus instance = new FormStatus();
        instance.setsStatus(sStatus);
    }

    /**
     * Test of getsInput method, of class FormStatus.
     */
    public void testGetsInput() {
        System.out.println("getsInput");
        FormStatus instance = new FormStatus();
        instance.setsInput("test");
        String expResult = "test";
        String result = instance.getsInput();
        assertEquals(expResult, result);
    }

    /**
     * Test of setsInput method, of class FormStatus.
     */
    public void testSetsInput() {
        System.out.println("setsInput");
        String sInput = "test";
        FormStatus instance = new FormStatus();
        instance.setsInput(sInput);
    }

    /**
     * Test of getsUsername method, of class FormStatus.
     */
    public void testGetsUsername() {
        System.out.println("getsUsername");
        FormStatus instance = new FormStatus();
        instance.setsUsername("test");
        String expResult = "test";
        String result = instance.getsUsername();
        assertEquals(expResult, result);
    }

    /**
     * Test of setsUsername method, of class FormStatus.
     */
    public void testSetsUsername() {
        System.out.println("setsUsername");
        String sUsername = "test";
        FormStatus instance = new FormStatus();
        instance.setsUsername(sUsername);
    }

    /**
     * Test of getsPassword method, of class FormStatus.
     */
    public void testGetsPassword() {
        System.out.println("getsPassword");
        FormStatus instance = new FormStatus();
        instance.setsPassword("test");
        String expResult = "test";
        String result = instance.getsPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of setsPassword method, of class FormStatus.
     */
    public void testSetsPassword() {
        System.out.println("setsPassword");
        String sPassword = "test";
        FormStatus instance = new FormStatus();
        instance.setsPassword(sPassword);
    }

    /**
     * Test of getsEmail method, of class FormStatus.
     */
    public void testGetsEmail() {
        System.out.println("getsEmail");
        FormStatus instance = new FormStatus();
        instance.setsEmail("test");
        String expResult = "test";
        String result = instance.getsEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of setsEmail method, of class FormStatus.
     */
    public void testSetsEmail() {
        System.out.println("setsEmail");
        String sEmail = "test";
        FormStatus instance = new FormStatus();
        instance.setsEmail(sEmail);
    }

    /**
     * Test of getsUsernameInput method, of class FormStatus.
     */
    public void testGetsUsernameInput() {
        System.out.println("getsUsernameInput");
        FormStatus instance = new FormStatus();
        instance.setsUsernameInput("test");
        String expResult = "test";
        String result = instance.getsUsernameInput();
        assertEquals(expResult, result);
    }

    /**
     * Test of setsUsernameInput method, of class FormStatus.
     */
    public void testSetsUsernameInput() {
        System.out.println("setsUsernameInput");
        String sUsernameInput = "test";
        FormStatus instance = new FormStatus();
        instance.setsUsernameInput(sUsernameInput);
    }

    /**
     * Test of getsPasswordInput method, of class FormStatus.
     */
    public void testGetsPasswordInput() {
        System.out.println("getsPasswordInput");
        FormStatus instance = new FormStatus();
        instance.setsPasswordInput("test");
        String expResult = "test";
        String result = instance.getsPasswordInput();
        assertEquals(expResult, result);
    }

    /**
     * Test of setsPasswordInput method, of class FormStatus.
     */
    public void testSetsPasswordInput() {
        System.out.println("setsPasswordInput");
        String sPasswordInput = "test";
        FormStatus instance = new FormStatus();
        instance.setsPasswordInput(sPasswordInput);
    }

    /**
     * Test of getsEmailInput method, of class FormStatus.
     */
    public void testGetsEmailInput() {
        System.out.println("getsEmailInput");
        FormStatus instance = new FormStatus();
        instance.setsEmailInput("test");
        String expResult = "test";
        String result = instance.getsEmailInput();
        assertEquals(expResult, result);
    }

    /**
     * Test of setsEmailInput method, of class FormStatus.
     */
    public void testSetsEmailInput() {
        System.out.println("setsEmailInput");
        String sEmailInput = "test";
        FormStatus instance = new FormStatus();
        instance.setsEmailInput(sEmailInput);
    }

    /**
     * Test of getId method, of class FormStatus.
     */
    public void testGetId() {
        System.out.println("getId");
        FormStatus instance = new FormStatus();
        instance.setId(1L);
        long expResult = 1L;
        long result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class FormStatus.
     */
    public void testSetId() {
        System.out.println("setId");
        long id = 1L;
        FormStatus instance = new FormStatus();
        instance.setId(id);
    }

}
