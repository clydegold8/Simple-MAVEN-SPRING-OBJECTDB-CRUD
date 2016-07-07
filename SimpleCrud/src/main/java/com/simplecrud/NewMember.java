/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.simplecrud;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author VIZI-BILL PH
 */
@Entity
public class NewMember implements Serializable {
    private static final long serialVersionUID = 1L;
    
     // Persistent Fields:
    @Id @GeneratedValue
    Long id;
    private String username;
    private String password;
    private String email;
    private Date signingDate;
    
//    constructors
    public NewMember(){
    }
    
//    get and set the infos
    public NewMember (String username,String password,String email){
        this.username = username;
        this.password = password;
        this.email = email;
        this.signingDate = new Date(System.currentTimeMillis());
    }
    
     // String Representation:
    @Override
    public String toString() {
        return "User Id: "+ id + " " + username + " " + "Password: "+ password +" "+"Email "+ email + "  (signed on " + signingDate + ")";
    }
    
}
