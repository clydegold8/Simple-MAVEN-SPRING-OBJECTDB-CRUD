/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simplecrud.controller;

import com.simplecrud.FormStatus;
import com.simplecrud.UserInfo;
import com.simplecrud.dao.UserInfoDao;
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
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author VIZI-BILL PH
 */
@Controller
@SessionAttributes("status")
public class RegisteredMemberController {

    @Autowired
    private UserInfoDao userDao;

    /**
     *
     * @param request
     * @param id
     * @param ErrorUsername
     * @param ErrorPassword
     * @param ErrorEmail
     * @param response
     * @param classerror
     * @return view
     */
    @RequestMapping(value = "/registeredmember")

    public ModelAndView registeredMember(HttpServletRequest request,
            @RequestParam(value = "id", required = false) long id,
            @RequestParam(value = "ErrorUsername", required = false) String ErrorUsername,
            @RequestParam(value = "ErrorPassword", required = false) String ErrorPassword,
            @RequestParam(value = "ErrorEmail", required = false) String ErrorEmail,
            @RequestParam(value = "response", required = false) String response,
            @RequestParam(value = "classerror", required = false) String classerror) {

        System.out.println(request + "Load Registered Member Page  " + id);

        Object oUser_email_id, oUser_date_id, oUser_name_id, oUser_password_id,oUser_role_id;
        FormStatus sFormStatus = new FormStatus();

        if ("error".equals(response)) {
            sFormStatus.setId(id);

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
                System.out.println((ErrorEmail == "null"));
                System.out.println((ErrorEmail));

                sFormStatus.setsEmail(ErrorEmail);
                sFormStatus.setsEmailInput("has-error");
            }

            sFormStatus.setsStatus("Please fill out the fields correctly");
            sFormStatus.setsInput("has-error");

            System.out.println(response + "Return error");

            ModelAndView model = new ModelAndView();
            model.addObject("status", sFormStatus);
            model.setViewName("registeredMember.jsp");

            return model;

//            return new ModelAndView("registeredMember.jsp", "status", sFormStatus);
        }

        //Try to Get User info
        try {
            //Get User Info
            oUser_name_id = userDao.getUserNamebyId(id);
            oUser_email_id = userDao.getUserEmailbyId(id);
            oUser_date_id = userDao.getUserSigningDatebyId(id);
            oUser_password_id = userDao.getUserPasswordbyId(id);
            oUser_role_id = userDao.getUserRolebyId(id);

            //oUser_email & oUser_date & oUser_name objects convert to string
            String sUser_name_id = oUser_name_id.toString();
            String sUser_email_id = oUser_email_id.toString();
            String sUser_date_id = oUser_date_id.toString();
            String sUser_password_id = oUser_password_id.toString();
            String sUser_role_id = oUser_role_id.toString();

            //Set User Information
            UserInfo user = new UserInfo();
            user.setId(id);
            user.setUsername(sUser_name_id);
            user.setEmail(sUser_email_id);
            user.setDate(sUser_date_id);
            user.setPassword(sUser_password_id);
            user.setHas_Role(sUser_role_id);
            user.setResponse(response);
            user.setErrorInput(classerror);

            System.out.println(oUser_name_id + "Resulted Query");

            // Prepare the result view (registeredMember.jsp):
            return new ModelAndView("registeredMember.jsp", "UserInfo", user);

        } catch (Exception e) {

            System.out.println(e + " Invalid Credentials");

            //set error message
            sFormStatus.setsStatus("Invalid User Credetials, Please Register or Log In Again");
            sFormStatus.setsInput("has-error");

            // Prepare the result view (registeredMember.jsp):
            return new ModelAndView("logInForm.jsp", "status", sFormStatus);
        }

    }

    /**
     *
     * @param member
     * @param result
     * @param model
     * @param request
     * @return
     */
    @RequestMapping(value = "/updateuser", method = RequestMethod.POST)
    public ModelAndView validateandUpdateUser(@Valid @ModelAttribute("UpdateMemberForm") ValidateMember member, BindingResult result, Model model, HttpServletRequest request) {

        String id = request.getParameter("id");

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
            return new ModelAndView("redirect:/registeredmember.html?"
                    + "&ErrorUsername=" + sFormStatus.getsUsername() + ""
                    + "&ErrorPassword=" + sFormStatus.getsPassword() + ""
                    + "&ErrorEmail=" + sFormStatus.getsEmail() + ""
                    + "&response=error&id=" + id + "");

        } else {

            String sUsername = request.getParameter("username");
            String sPassword = request.getParameter("password");
            String sEmail = request.getParameter("email");
            Long lUser_id = Long.parseLong(id);

            //try to save the form
            try {
                System.out.println(sUsername + " username" + sPassword + sEmail + lUser_id);
                Object update_result = userDao.updateUserInfo(lUser_id, sUsername, sPassword, sEmail);

                return new ModelAndView("redirect:/registeredmember.html?classerror=has-success&response=" + update_result + "&id=" + id + "");

            } catch (Exception e) {
                System.out.println(e.getMessage() + " Error updating form");
                return new ModelAndView("redirect:/registeredmember.html?response=The Data you have typed is already exist, try another one.&classerror=has-error&id=" + id + "");
            }

        }

    }

    /**
     *
     * @param request
     * @param id
     * @return
     */
    @RequestMapping(value = "/deleteuser")
    public ModelAndView registeredMember(HttpServletRequest request,
            @RequestParam(value = "id", required = false) long id) {

        //delete user
        try {
            Object oDelete_result = userDao.deleteUserInfo(id);
            System.out.println(oDelete_result + " Delete ok");
            return new ModelAndView("redirect:/login.html?response=User Successfully Deleted&classerror=has-success");
        } catch (Exception e) {
            System.out.println(e + " Delete error");
            return new ModelAndView("redirect:/login.html?response=Delete Error&classerror=has-error");
        }

    }

}
