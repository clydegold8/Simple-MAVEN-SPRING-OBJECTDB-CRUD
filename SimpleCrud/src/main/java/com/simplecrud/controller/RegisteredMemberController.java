/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simplecrud.controller;

import com.simplecrud.FormStatus;
import com.simplecrud.UserInfo;
import com.simplecrud.dao.UserInfoDao;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author VIZI-BILL PH
 */
@Controller
public class RegisteredMemberController {

    @Autowired
    private UserInfoDao userDao;

    /**
     *
     * @param request
     * @param id
     * @return view
     */
    @RequestMapping(value = "/registeredmember")
    public ModelAndView registeredMember(HttpServletRequest request, @RequestParam long id) {
        System.out.println(request + "Load Registered Member Page  " + id);

        Object oUser_email_id, oUser_date_id, oUser_name_id, oUser_password_id;

        //Try to Get User info
        try {
            //Get User Info
            oUser_name_id = userDao.getUserNamebyId(id);
            oUser_email_id = userDao.getUserEmailbyId(id);
            oUser_date_id = userDao.getUserSigningDatebyId(id);
            oUser_password_id = userDao.getUserPasswordbyId(id);

            //oUser_email & oUser_date & oUser_name objects convert to string
            String sUser_name_id = oUser_name_id.toString();
            String sUser_email_id = oUser_email_id.toString();
            String sUser_date_id = oUser_date_id.toString();
            String sUser_password_id = oUser_password_id.toString();

            //Set User Information
            UserInfo user = new UserInfo();
            user.setId(id);
            user.setUsername(sUser_name_id);
            user.setEmail(sUser_email_id);
            user.setDate(sUser_date_id);
            user.setPassword(sUser_password_id);

            System.out.println(oUser_name_id + "Resulted Query");

            // Prepare the result view (registeredMember.jsp):
            return new ModelAndView("registeredMember.jsp", "UserInfo", user);

        } catch (Exception e) {
            FormStatus sFormStatus = new FormStatus();

            //set error message
            sFormStatus.setsStatus("Invalid User Credetials, Please Register or Log In Again");
            sFormStatus.setsInput("has-error");

            // Prepare the result view (registeredMember.jsp):
            return new ModelAndView("logInForm.jsp", "status", sFormStatus);
        }

    }

    /**
     *
     * @param request
     * @param id
     * @param methodCall
     * @param username
     * @param email
     * @return
     */
    @RequestMapping(value = "/registeredmember/{id}/{method}", method = RequestMethod.GET)
    public ModelAndView updateMember(HttpServletRequest request,
            @PathVariable("id") long id,
            @PathVariable("method") String methodCall,
            @RequestParam(value = "username", required = false) String username,
            @RequestParam(value = "email", required = false) String email) {

        System.out.println(request + "Load Method Page... userId = " + id + " Method = " + methodCall + "");

        // Prepare the result view (registeredMember.jsp):
        return new ModelAndView("redirect:/registeredmember.html");
    }
}
