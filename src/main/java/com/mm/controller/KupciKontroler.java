/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mm.controller;

import com.mm.domen.Kupac;
import com.mm.domen.Mesto;
import com.mm.service.IKupciService;
import com.mm.service.impl.KupacServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Miroslav
 */
@Controller
public class KupciKontroler {
    @Autowired
    private KupacServiceImpl kupacServis;
    
    @RequestMapping(value = "/action/svi_kupci")
    public ModelAndView findAll(){
        List<Kupac> kolekcijaKupaca = kupacServis.vratiKupce();
        return new ModelAndView("/WEB-INF/svi_kupci.jsp","kupacList",kolekcijaKupaca);
    }
}
