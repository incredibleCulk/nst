/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mm.service.impl;

import com.mm.dao.IKupciDao;
import com.mm.domen.Kupac;
import com.mm.service.IKupciService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Miroslav
 */
@Service
public class KupacServiceImpl implements IKupciService{
    
    @Autowired
    private IKupciDao kupacDao;
    
    @Override
    public List<Kupac> vratiKupce() {
        return kupacDao.findAll();
    }
    
}
