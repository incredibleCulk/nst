/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mm.service.impl;

import com.mm.dao.IMestoDao;
import com.mm.domen.Mesto;
import com.mm.service.IMestoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Miroslav
 */
@Service
public class MestoServisImpl implements IMestoService{
    @Autowired
    private IMestoDao mestoDao;
    
    @Override
    public List<Mesto> findAll() {
        return mestoDao.findAll();
    }

    @Override
    public void obrisi(long ptt) {
        mestoDao.delete(ptt);
    }

    @Override
    public void sacuvaj(Mesto m) {
        mestoDao.save(m);
    }
    
}
