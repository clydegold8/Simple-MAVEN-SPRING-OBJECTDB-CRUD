/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simplecrud;

import java.io.Serializable;
import java.sql.Date;
import javax.jdo.annotations.Unique;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author VIZI-BILL PH
 */
@Entity
public class NewMember implements Serializable {

    private static final long serialVersionUID = 1L;

    // Persistent Fields:
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Unique
    private String username;
    private String password;
    @Unique
    private String email;
    private Date signingDate;

//    constructors
    public NewMember() {
    }

    /**
     * get and set the infos
     *
     * @param username
     * @param password
     * @param email
     */
    public NewMember(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.signingDate = new Date(System.currentTimeMillis());
    }

    // String Representation:
//    @Override
//    public String toString() {
//        return username + email + signingDate;
//    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

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

}
