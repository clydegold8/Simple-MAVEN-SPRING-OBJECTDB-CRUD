/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simplecrud.validator;

import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;

/**
 *
 * @author VIZI-BILL PH
 */
public class ValidateMember {

    @Size(min = 5, max = 20, message = " Username should have 5 to 20 characters")
    private String username;
    @Size(min = 5, max = 20, message = " Password should have 5 to 20 characters")
    private String password;
    @NotEmpty(message="Email Invalid")
    private String email;

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

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Username" + username + " " + "Password: " + password + " " + "Email " + email;
    }

}
