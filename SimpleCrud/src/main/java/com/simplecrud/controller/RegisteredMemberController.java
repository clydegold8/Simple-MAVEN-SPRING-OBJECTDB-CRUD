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
import org.springframework.web.bind.annotation.RequestMapping;
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

        long lUser_id = id;
        Object oUser_email_id, oUser_date_id, oUser_name_id;

        try {
            //Get User Info
            oUser_name_id = userDao.getUserNamebyId(lUser_id);
            oUser_email_id = userDao.getUserEmailbyId(lUser_id);
            oUser_date_id = userDao.getUserSigningDatebyId(lUser_id);

            //oUser_email & oUser_date & oUser_name objects convert to string
            String sUser_name_id = oUser_name_id.toString();
            String sUser_email_id = oUser_email_id.toString();
            String sUser_date_id = oUser_date_id.toString();

            //Set User Information
            UserInfo user = new UserInfo();
            user.setId(lUser_id);
            user.setUsername(sUser_name_id);
            user.setEmail(sUser_email_id);
            user.setDate(sUser_date_id);

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

}
