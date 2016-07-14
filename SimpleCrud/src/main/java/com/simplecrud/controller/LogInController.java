/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simplecrud.controller;

import com.simplecrud.FormStatus;
import com.simplecrud.dao.LogInDao;
import com.simplecrud.validator.ValidateLogIn;
import javax.persistence.NoResultException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
     * @param response
     * @param classerror
     * @return view
     */
    @RequestMapping(value = "/login")
    public ModelAndView getLogInPage(HttpServletRequest request,
            @RequestParam(value = "response", required = false) String response,
            @RequestParam(value = "classerror", required = false) String classerror) {

        System.out.println(request + "Load login Page 1  " + response + "  " + classerror + " ");

        FormStatus sFormStatus = new FormStatus();

        if ((response != null) && (classerror != null)) {
            //set error message in logging in
            sFormStatus.setsStatus(response);
            sFormStatus.setsInput(classerror);
        }

        // Prepare the oQueryresult view (logInForm.jsp):
        return new ModelAndView("logInForm.jsp", "status", sFormStatus);
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
        if (result.hasErrors()) {
            //return to login page
            return new ModelAndView("redirect:/login.html?response=Incorrect Username and Password&classerror=has-error");

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

                //Query Success Prepare view (registeredMember.jsp):
                return new ModelAndView("redirect:/registeredmember.html?id=" + lUser_id + "");

            } catch (NoResultException e) {
                System.out.println(e + "Non Entity");
            }
            //Query Failed Prepare view (logInForm.jsp):
            return new ModelAndView("redirect:/login.html?response=Incorrect Username and Password&classerror=has-error");
        }
    }
}
