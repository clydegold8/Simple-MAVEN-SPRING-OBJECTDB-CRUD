/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simplecrud.controller;

import com.simplecrud.FormStatus;
import com.simplecrud.UserInfo;
import com.simplecrud.dao.LogInDao;
import com.simplecrud.dao.UserInfoDao;
import com.simplecrud.validator.ValidateLogIn;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author VIZI-BILL PH
 */
@Controller
public class LogInController {

    /**
     * get Log In page
     *
     * @param request
     * @return view
     */
    @RequestMapping(value = "/login")
    public ModelAndView getLogInPage(HttpServletRequest request) {
        System.out.println(request + "Load login Page 1");

        // Prepare the oQueryresult view (logInForm.jsp):
        return new ModelAndView("logInForm.jsp");
    }

    @Autowired
    private LogInDao loginDao;

    /**
     * Process Log In details
     *
     * @param login
     * @param result
     * @param model
     * @param request
     * @return view
     */
    @RequestMapping(value = "/logging")
    public ModelAndView validateUser(@Valid @ModelAttribute("LogInForm") ValidateLogIn login, BindingResult result, Model model, HttpServletRequest request) {
        System.out.println(request + "Load  login Page 2");

        FormStatus sFormStatus = new FormStatus();

        //Validate Entered Credentials
        //if validated form has errors
        if (result.hasErrors()) {

            //set error message in logging in
            sFormStatus.setsStatus("Incorrect Username and Password");
            sFormStatus.setsInput("has-error");
        } else {

            String username = request.getParameter("username");
            String password = request.getParameter("password");
            Object oUser_id;

            try {
                //get user in the db or check if exist
                oUser_id = loginDao.getUserId(username, password);
                //oUser_id Object convert to String to Long
                String sUserId = oUser_id.toString();
                Long lUser_id = Long.parseLong(sUserId);

                // Prepare the oQueryresult view (registeredMember.jsp):
                return new ModelAndView("redirect:/registeredmember.html?id=" + lUser_id + "");

            } catch (Exception e) {
                System.out.println(e + "Non Entity");

                //set error message in logging in
                sFormStatus.setsStatus("Incorrect Username and Password");
                sFormStatus.setsInput("has-error");
            }

        }
        // Prepare the oQueryresult view (logInForm.jsp):
        return new ModelAndView("logInForm.jsp", "status", sFormStatus);

    }

}
