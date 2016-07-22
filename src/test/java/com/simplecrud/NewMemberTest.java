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
public class NewMemberTest extends TestCase {

    public NewMemberTest(String testName) {
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
     * Test of getId method, of class NewMember.
     */
    public void testGetId() {
        System.out.println("getId");
        NewMember instance = new NewMember();
        instance.setId(1L);
        Long expResult = 1L;
        Long result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class NewMember.
     */
    public void testSetId() {
        System.out.println("setId");
        Long id = 1L;
        NewMember instance = new NewMember();
        instance.setId(id);
    }

    /**
     * Test of getUsername method, of class NewMember.
     */
    public void testGetUsername() {
        System.out.println("getUsername");
        NewMember instance = new NewMember();
        instance.setUsername("test");
        String expResult = "test";
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUsername method, of class NewMember.
     */
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "test";
        NewMember instance = new NewMember();
        instance.setUsername(username);
    }

    /**
     * Test of getPassword method, of class NewMember.
     */
    public void testGetPassword() {
        System.out.println("getPassword");
        NewMember instance = new NewMember();
        instance.setPassword("test");
        String expResult = "test";
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPassword method, of class NewMember.
     */
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "test";
        NewMember instance = new NewMember();
        instance.setPassword(password);
    }

    /**
     * Test of getEmail method, of class NewMember.
     */
    public void testGetEmail() {
        System.out.println("getEmail");
        NewMember instance = new NewMember();
        instance.setEmail("test");
        String expResult = "test";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmail method, of class NewMember.
     */
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "test";
        NewMember instance = new NewMember();
        instance.setEmail(email);
    }

    public void testNewMemberClass() {
        System.out.println("NewMemberClass");
        String username = "test";
        String password = "test";
        String email = "test";
        NewMember newMember = new NewMember(username, password, email);
    }

    /**
     * Test of SetHas_RoleClass method, of class NewMember.
     */
    public void testSetHas_RoleClass() {
        System.out.println("SetHas_RoleClass");
        NewMember instance = new NewMember();
        instance.setHas_role("test");
        String expResult = "test";
        String result = instance.getHas_role();
        assertEquals(expResult, result);

    }

    /**
     * Test of GetHas_RoleClass method, of class NewMember.
     */
    public void testGetHas_RoleClass() {
        System.out.println("GetHas_RoleClass");
        String has_role = "test";
        NewMember instance = new NewMember();
        instance.setEmail(has_role);
    }

}
