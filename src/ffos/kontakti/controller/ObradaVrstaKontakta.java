/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.kontakti.controller;

import ffos.kontakti.model.VrstaKontakta;
import ffos.kontakti.pomocno.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Korisnik
 */
public class ObradaVrstaKontakta extends Obrada{

    public ObradaVrstaKontakta() {
    super();
    }
    
    public List<VrstaKontakta> getVrsteKontakta(){
        Query q = session.createQuery("From VrstaKontakta ");
        return q.list();
    }
    
    public VrstaKontakta spremi(VrstaKontakta vk){
        
         session.beginTransaction();
         session.saveOrUpdate(vk);
        session.getTransaction().commit();
        
       
        
        return vk;
    }
    
    public void obrisi(VrstaKontakta vk){
         session.beginTransaction();
         session.delete(vk);
        session.getTransaction().commit();
    }
    
    
    
}

