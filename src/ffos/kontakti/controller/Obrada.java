/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.kontakti.controller;

import ffos.kontakti.pomocno.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Ivana
 */
public abstract class Obrada {
    
    protected Session session;
    
    public Obrada(){
        session = HibernateUtil.getSession();
    }
    

    
}
