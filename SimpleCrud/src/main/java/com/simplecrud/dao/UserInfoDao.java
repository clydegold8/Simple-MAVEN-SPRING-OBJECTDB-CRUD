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
public class UserInfoDao {

    // Injected database connection:
    @PersistenceContext
    private EntityManager em;

    /**
     *
     * @param username
     * @return
     */
    public Object getUserInfo(String username) {

        TypedQuery<NewMember> q = em.createQuery("SELECT n FROM NewMember n WHERE n.username = :username", NewMember.class);
        q.setParameter("username", username);
        return q.getSingleResult();
    }

    /**
     *
     * @param username
     * @return EMAIL
     */
    public Object getUserEmail(String username) {

        TypedQuery<NewMember> q = em.createQuery("SELECT n.email FROM NewMember n WHERE n.username = :username", NewMember.class);
        q.setParameter("username", username);
        return q.getSingleResult();
    }

    /**
     *
     * @param username
     * @return SIGNING DATE
     */
    public Object getUserSigningDate(String username) {

        TypedQuery<NewMember> q = em.createQuery("SELECT n.signingDate FROM NewMember n WHERE n.username = :username", NewMember.class);
        q.setParameter("username", username);
        return q.getSingleResult();
    }

    /**
     *
     * @param id
     * @return
     */
    public Object getUserEmailbyId(Long id) {

        TypedQuery<NewMember> q = em.createQuery("SELECT n.email FROM NewMember n WHERE n.id = :id", NewMember.class);
        q.setParameter("id", id);
        return q.getSingleResult();
    }

    /**
     *
     * @param Id
     * @return
     */
    public Object getUserSigningDatebyId(Long Id) {

        TypedQuery<NewMember> q = em.createQuery("SELECT n.signingDate FROM NewMember n WHERE n.id = :Id", NewMember.class);
        q.setParameter("Id", Id);
        return q.getSingleResult();
    }

    /**
     *
     * @param Id
     * @return
     */
    public Object getUserNamebyId(Long Id) {

        TypedQuery<NewMember> q = em.createQuery("SELECT n.username FROM NewMember n WHERE n.id = :Id", NewMember.class);
        q.setParameter("Id", Id);
        return q.getSingleResult();
    }

    public Object getUserPasswordbyId(Long Id) {

        TypedQuery<NewMember> q = em.createQuery("SELECT n.password FROM NewMember n WHERE n.id = :Id", NewMember.class);
        q.setParameter("Id", Id);
        return q.getSingleResult();
    }

    public Object updateUserInfo(long Id, String username, String password, String email) {

        TypedQuery<NewMember> q = em.createQuery("UPDATE NewMember n SET n.username = :username,n.password = :password,n.email=:email "
                + "WHERE n.id = :Id", NewMember.class);
        q.setParameter("Id", Id);
        q.setParameter("username", username);
        q.setParameter("password", password);
        q.setParameter("email", email);
        return 1;
    }

}
