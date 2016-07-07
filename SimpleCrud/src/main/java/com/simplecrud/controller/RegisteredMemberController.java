/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simplecrud.controller;

import com.simplecrud.FormStatus;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author VIZI-BILL PH
 */
@Controller
public class RegisteredMemberController {

    /**
     *
     * @param request
     * @return view
     */
    @RequestMapping(value = "/registeredmember")
    public ModelAndView registeredMember(HttpServletRequest request) {
        System.out.println(request + "Load Registered Member Page");

        // Prepare the result view (registeredMember.jsp):
        return new ModelAndView("registeredMember.jsp");
    }

}
