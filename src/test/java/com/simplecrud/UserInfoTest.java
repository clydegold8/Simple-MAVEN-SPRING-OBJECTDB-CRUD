/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simplecrud;

import junit.framework.Assert;
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
     * Test of GetandSetUsername method, of class UserInfo.
     */
    public void testGetandSetUsername() {
        System.out.println("SetandGetUsername");
        UserInfo instance = new UserInfo();
        instance.setUsername("test");
        assertTrue("test".equals(instance.getUsername()));
    }

    /**
     * Test of GetandSetEmail method, of class UserInfo.
     */
    public void testGetandSetEmail() {
        System.out.println("getEmail");
        UserInfo instance = new UserInfo();
        instance.setEmail("test");
        assertTrue("test".equals(instance.getEmail()));
    }

    /**
     * Test of GetandSetDate method, of class UserInfo.
     */
    public void testGetandSetDate() {
        System.out.println("getDate");
        UserInfo instance = new UserInfo();
        instance.setDate("test");
        assertTrue("test".equals(instance.getDate()));
    }

    /**
     * Test of GetandSetId method, of class UserInfo.
     */
    public void testGetandSetId() {
        System.out.println("getId");
        UserInfo instance = new UserInfo();
        instance.setId(1L);
        assertTrue(1L == instance.getId());
    }

    /**
     * Test of getPassword method, of class UserInfo.
     */
    public void testGetandSetPassword() {
        System.out.println("GetandSetPassword");
        UserInfo instance = new UserInfo();
        instance.setPassword("test");
        Assert.assertTrue("test".equals(instance.getPassword()));
    }

}
