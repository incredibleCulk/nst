/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mm.service.impl;

import com.mm.dao.IUserDao;
import com.model.User;
import com.mm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Miroslav
 */
@Service
public class UserServiceImpl implements IUserService{
    
    @Autowired
    private IUserDao userDao;
    
    @Override
    public User login(String username, String password) {
//         return userDao.login(username, password);
            return null;
    }
    
}
