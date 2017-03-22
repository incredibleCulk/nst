/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mm.dao;

import com.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Miroslav
 */
@Repository
public interface IUserDao extends JpaRepository<User, Long>{
    @Query("select u from User u where u.username=?1 and password=?2")
    User login(String username,String password);
}
