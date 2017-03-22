/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mm.dao;

import com.mm.domen.Kupac;
import com.mm.domen.Mesto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Miroslav
 */
@Repository
public interface IKupciDao extends JpaRepository<Kupac, Long>{
    
}
