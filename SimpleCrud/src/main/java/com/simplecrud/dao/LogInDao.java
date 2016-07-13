/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simplecrud.dao;

import com.simplecrud.NewMember;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
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
    /**
     * Find the user if exist in the database:
     *
     * @param username
     * @param password
     * @return Object
     */
    public Object getSpecificUsername(String username, String password) {

        TypedQuery<NewMember> q = em.createQuery("SELECT n.username FROM NewMember n WHERE n.username = :username AND n.password = :password", NewMember.class);
        q.setParameter("username", username);
        q.setParameter("password", password);
        return q.getSingleResult();
    }
    
    public Object getUserId(String username, String password) {

        TypedQuery<NewMember> q = em.createQuery("SELECT n.id FROM NewMember n WHERE n.username = :username AND n.password = :password", NewMember.class);
        q.setParameter("username", username);
        q.setParameter("password", password);
        return q.getSingleResult();
    }

}
