/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simplecrud;

import java.util.List;

/**
 *
 * @author VIZI-BILL PH
 */
public class UserInfo {

    private String Username;
    private String Email;
    private String Date;
    private String Password;
    private String Response;
    private String ErrorInput;
    private Long Id;
    private List<Object>  userinfo;

    /**
     * @return the Username
     */
    public String getUsername() {
        return Username;
    }

    /**
     * @param Username the Username to set
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the Date
     */
    public String getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * @return the Id
     */
    public Long getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * @return the Response
     */
    public String getResponse() {
        return Response;
    }

    /**
     * @param Response the Response to set
     */
    public void setResponse(String Response) {
        this.Response = Response;
    }

    /**
     * @return the ErrorInput
     */
    public String getErrorInput() {
        return ErrorInput;
    }

    /**
     * @param ErrorInput the ErrorInput to set
     */
    public void setErrorInput(String ErrorInput) {
        this.ErrorInput = ErrorInput;
    }

    /**
     * @return the userinfo
     */
    public List<Object> getUserinfo() {
        return userinfo;
    }

    /**
     * @param userinfo the userinfo to set
     */
    public void setUserinfo(List<Object> userinfo) {
        this.userinfo = userinfo;
    }

}
