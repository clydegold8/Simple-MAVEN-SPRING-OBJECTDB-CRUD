/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simplecrud;

import java.io.Serializable;

/**
 *
 * @author VIZI-BILL PH
 */
public class FormStatus implements Serializable {
    private static final long serialVersionUID = 1L;

    private String sStatus;
    private String sUsername;
    private String sPassword;
    private String sEmail;
    private String sInput;
    private String sUsernameInput;
    private String sPasswordInput;
    private String sEmailInput;
    private long id;

    /**
     * @return the sStatus
     */
    public String getsStatus() {
        return sStatus;
    }

    /**
     * @param sStatus the sStatus to set
     */
    public void setsStatus(String sStatus) {
        this.sStatus = sStatus;
    }

    /**
     * @return the sInput
     */
    public String getsInput() {
        return sInput;
    }

    /**
     * @param sInput the sInput to set
     */
    public void setsInput(String sInput) {
        this.sInput = sInput;
    }

    /**
     * @return the sUsername
     */
    public String getsUsername() {
        return sUsername;
    }

    /**
     * @param sUsername the sUsername to set
     */
    public void setsUsername(String sUsername) {
        this.sUsername = sUsername;
    }

    /**
     * @return the sPassword
     */
    public String getsPassword() {
        return sPassword;
    }

    /**
     * @param sPassword the sPassword to set
     */
    public void setsPassword(String sPassword) {
        this.sPassword = sPassword;
    }

    /**
     * @return the sEmail
     */
    public String getsEmail() {
        return sEmail;
    }

    /**
     * @param sEmail the sEmail to set
     */
    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    /**
     * @return the sUsernameInput
     */
    public String getsUsernameInput() {
        return sUsernameInput;
    }

    /**
     * @param sUsernameInput the sUsernameInput to set
     */
    public void setsUsernameInput(String sUsernameInput) {
        this.sUsernameInput = sUsernameInput;
    }

    /**
     * @return the sPasswordInput
     */
    public String getsPasswordInput() {
        return sPasswordInput;
    }

    /**
     * @param sPasswordInput the sPasswordInput to set
     */
    public void setsPasswordInput(String sPasswordInput) {
        this.sPasswordInput = sPasswordInput;
    }

    /**
     * @return the sEmailInput
     */
    public String getsEmailInput() {
        return sEmailInput;
    }

    /**
     * @param sEmailInput the sEmailInput to set
     */
    public void setsEmailInput(String sEmailInput) {
        this.sEmailInput = sEmailInput;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

}
