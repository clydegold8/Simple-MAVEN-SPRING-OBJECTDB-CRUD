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
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional
    public Object updateUserInfo(long Id, String username, String password, String email) {

        //fetch user info for updating
        NewMember member = em.find(NewMember.class, Id);
        System.out.println(member + "  Result Query for update");
        //update fields
        member.setUsername(username);
        member.setPassword(password);
        member.setEmail(email);

        return "Field Succesfully Updated";
    }

}
