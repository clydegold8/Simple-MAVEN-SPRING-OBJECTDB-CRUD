/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simplecrud.controller;

import com.simplecrud.FormStatus;
import com.simplecrud.NewMember;
import com.simplecrud.dao.NewMemberDao;
import com.simplecrud.validator.ValidateMember;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author VIZI-BILL PH
 */
@Controller
public class RegistrationController {

    /**
     * get registration page
     *
     * @param request
     * @param ErrorUsername
     * @param ErrorPassword
     * @param ErrorEmail
     * @param response
     * @return view
     */
    @RequestMapping(value = "/registration")
    public ModelAndView registerUser(HttpServletRequest request,
            @RequestParam(value = "ErrorUsername", required = false) String ErrorUsername,
            @RequestParam(value = "ErrorPassword", required = false) String ErrorPassword,
            @RequestParam(value = "ErrorEmail", required = false) String ErrorEmail,
            @RequestParam(value = "response", required = false) String response) {

        System.out.println(request + "Load Registration Page");

        FormStatus sFormStatus = new FormStatus();

        if ("error".equals(response)) {
            //Check for errors
            if (ErrorUsername != null) {
                sFormStatus.setsUsername(ErrorUsername);
                sFormStatus.setsUsernameInput("has-error");
            }
            if (ErrorPassword != null) {
                sFormStatus.setsPassword(ErrorPassword);
                sFormStatus.setsPasswordInput("has-error");
            }
            if (ErrorEmail != null) {
                sFormStatus.setsEmail(ErrorEmail);
                sFormStatus.setsEmailInput("has-error");
            }

            sFormStatus.setsStatus("Please fill out the form correctly");
            sFormStatus.setsInput("has-error");

        } else if ("success".equals(response)) {
            sFormStatus.setsStatus("Form Successfully Registered!");
            sFormStatus.setsInput("has-success");

        } else if ("UserAlreadyExist".equals(response)) {
            sFormStatus.setsUsernameInput("has-error");
            sFormStatus.setsPasswordInput("has-error");
            sFormStatus.setsEmailInput("has-error");

            sFormStatus.setsStatus("User is Already Exist, Please Log In");
            sFormStatus.setsInput("has-error");

        } else {
            sFormStatus.setsStatus("Please Fill out the form for New Registraion");
            sFormStatus.setsInput("has-warning");
        }

        // Prepare the result view (registrationForm.jsp):
        return new ModelAndView("registrationForm.jsp", "status", sFormStatus);
    }

    @Autowired
    private NewMemberDao newMemberDao;

    /**
     * Process Registration Data
     *
     * @param member
     * @param result
     * @param model
     * @param request
     * @return view
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ModelAndView validateUser(@Valid @ModelAttribute("newMemberForm") ValidateMember member, BindingResult result, Model model, HttpServletRequest request) {

        FormStatus sFormStatus = new FormStatus();

        //if validated form has errors
        if (result.hasErrors()) {

            //handle errors in the inputs
            List<FieldError> errors = result.getFieldErrors();
            for (FieldError error : errors) {
                System.out.println(error.getField() + " - " + error.getDefaultMessage());

                if ("username".equals(error.getField())) {
                    //set error message in username input
                    sFormStatus.setsUsername(error.getDefaultMessage());
                    sFormStatus.setsUsernameInput("has-error");
                }

                if ("password".equals(error.getField())) {
                    //set error message in password input
                    sFormStatus.setsPassword(error.getDefaultMessage());
                    sFormStatus.setsPasswordInput("has-error");
                }

                if ("email".equals(error.getField())) {
                    //set error message in email input
                    sFormStatus.setsEmail(error.getDefaultMessage());
                    sFormStatus.setsEmailInput("has-error");
                }

            }
            System.out.println(result.getFieldErrors());
            return new ModelAndView("redirect:/registration.html?"
                    + "&ErrorUsername=" + sFormStatus.getsUsername() + ""
                    + "&ErrorPassword=" + sFormStatus.getsPassword() + ""
                    + "&ErrorEmail=" + sFormStatus.getsEmail() + ""
                    + "&response=error");

        } else {

            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String email = request.getParameter("email");

            //try to save the form
            try {
                newMemberDao.persist(new NewMember(username, password, email));
                System.out.println(result + "Form Results - Valid and Saved");

                return new ModelAndView("redirect:/registration.html?response=success");

            } catch (Exception e) {
                System.out.println(e.getMessage() + "  User Already Exist");
            }
            return new ModelAndView("redirect:/registration.html?response=UserAlreadyExist");
        }

    }

}
