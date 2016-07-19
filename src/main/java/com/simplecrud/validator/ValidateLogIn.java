/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.simplecrud.validator;

import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author VIZI-BILL PH
 */
public class ValidateLogIn {
    
    @NotEmpty(message="Username Invalid")
    private String username;
    @NotEmpty(message="Password Invalid")
    private String password;

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
}
