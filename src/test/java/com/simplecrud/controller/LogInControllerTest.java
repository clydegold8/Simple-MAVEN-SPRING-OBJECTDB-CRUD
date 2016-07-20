/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.simplecrud.controller;

import com.simplecrud.validator.ValidateLogIn;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import junit.framework.TestCase;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author VIZI-BILL PH
 */
public class LogInControllerTest extends TestCase {
    
    public LogInControllerTest(String testName) {
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
     * Test of getLogInPage method, of class LogInController.
     */
    public void testGetLogInPage() {
        System.out.println("getLogInPage");
//        HttpServletRequest request = null;
//        String response = "";
//        String classerror = "";
//        LogInController instance = new LogInController();
//        ModelAndView expResult = null;
//        ModelAndView result = instance.getLogInPage(request, response, classerror);
//        assertEquals(expResult, result);
    }

    /**
     * Test of validateUser method, of class LogInController.
     */
    public void testValidateUser() {
        System.out.println("validateUser");
//        ValidateLogIn login = null;
//        BindingResult result_2 = null;
//        Model model = null;
//        HttpServletRequest request = null;
//        HttpSession session = null;
//        LogInController instance = new LogInController();
//        ModelAndView expResult = null;
//        ModelAndView result = instance.validateUser(login, result_2, model, request, session);
//        assertEquals(expResult, result);
    }
    
}
