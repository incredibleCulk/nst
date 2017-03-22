package com.mm.controller;

import com.mm.dao.IUserDao;
import com.model.User;
import com.mm.service.IUserService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Milos Milic
 */
@Controller
public class HomeController {
    @Autowired
    private IUserService userServis;
    
    @RequestMapping("/")
    public ModelAndView start() {
        return new ModelAndView("prijavi_se.jsp");
    }
    @RequestMapping(value = "/action/prijavi_se",method = RequestMethod.POST)
    public ModelAndView login(HttpServletRequest request,String korisnickoIme, String korisnickaSifra) {
        User user = userServis.login(korisnickoIme, korisnickaSifra);
        
        if(user!=null){
            request.getSession().setAttribute("ulogovan_korisnik", user);
            return new ModelAndView("/WEB-INF/pocetna.jsp");
        }
        
        return new ModelAndView("prijavi_se.jsp");
    }
    
    
}
