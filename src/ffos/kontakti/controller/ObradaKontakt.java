/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.kontakti.controller;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import ffos.kontakti.model.Kontakt;
import ffos.kontakti.pomocno.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Korisnik
 */
public class ObradaKontakt extends Obrada{
    
    
    
    public ObradaKontakt(){
        super();
    }
    
    
     public List<Kontakt> getKontakti(){
        Query q = session.createQuery("From Kontakt ");
        return q.list();
    }
    
    public Kontakt spremi(Kontakt o){
        
         session.beginTransaction();
         session.saveOrUpdate(o);
        session.getTransaction().commit();
        
       
        
        return o;
    }
    
    public void obrisi(Kontakt o) throws MySQLIntegrityConstraintViolationException{
         session.beginTransaction();
         session.delete(o);
        session.getTransaction().commit();
    }
    
    
    
    
}
