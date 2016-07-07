/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.simplecrud.dao;

import com.simplecrud.NewMember;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author VIZI-BILL PH
 */
@Component
public class NewMemberDao {
    
    // Injected database connection:
    @PersistenceContext private EntityManager em;
    
    // Stores a new member:
    @Transactional
    public void persist(NewMember newmember) {
        em.persist(newmember);
    }
    
}
