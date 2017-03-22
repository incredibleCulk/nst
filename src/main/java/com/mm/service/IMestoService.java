/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mm.service;

import com.mm.domen.Mesto;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Miroslav
 */
public interface IMestoService {
    List<Mesto> findAll();
    void obrisi(long ptt);
    void sacuvaj(Mesto m);
}
