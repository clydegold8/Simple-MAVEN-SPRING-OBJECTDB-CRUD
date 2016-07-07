/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simplecrud.dao;

import com.simplecrud.NewMember;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Component;

/**
 *
 * @author VIZI-BILL PH
 */
@Component
public class LogInDao {

    // Injected database connection:
    @PersistenceContext
    private EntityManager em;

    // Check if the user exist in db:
    public Object getSpecificUser(String username, String password) {

        // Find the user if exist in the database:
        Query q = em.createQuery("SELECT n FROM NewMember n WHERE n.username = :username AND n.password = :password");
        q.setParameter("username", username);
        q.setParameter("password", password);
        NewMember user = (NewMember) q.getSingleResult();
        return user;
    }
}
