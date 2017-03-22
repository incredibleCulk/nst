/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mm.controller;

import com.mm.domen.Mesto;
import com.mm.service.impl.MestoServisImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Miroslav
 */
@Controller
public class MestoKontroler {
    @Autowired
    private MestoServisImpl mestoServis;
    
    @RequestMapping(value = "/action/sva_mesta")
    public ModelAndView findAll(){
        List<Mesto> kolekcijaMesta = mestoServis.findAll();
        return new ModelAndView("/WEB-INF/sva_mesta.jsp","kolekcijaMesta",kolekcijaMesta);
    }
      @RequestMapping(value = "/action/obrisi_mesto")
    public ModelAndView obrisi(long ptt){
        mestoServis.obrisi(ptt);
        List<Mesto> kolekcijaMesta = mestoServis.findAll();
        return new ModelAndView("/WEB-INF/sva_mesta.jsp","kolekcijaMesta",kolekcijaMesta);
    }
    @RequestMapping(value = "/action/sacuvaj_mesto")
    public ModelAndView prikaziFormuZaMesto(Long ptt,String naziv){
        return new ModelAndView("/WEB-INF/unos_novog_mesta.jsp");
    }
    @RequestMapping(value = "/action/sacuvaj_mesto", method = RequestMethod.POST)
    public ModelAndView sacuvaj(Long ptt,String naziv){
        mestoServis.sacuvaj(new Mesto(ptt, naziv));
        List<Mesto> kolekcijaMesta = mestoServis.findAll();
        return new ModelAndView("/WEB-INF/sva_mesta.jsp","kolekcijaMesta",kolekcijaMesta);
    }
}
