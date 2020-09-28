/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.kontakti.model;

import java.util.Date;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Korisnik
 */

@Entity
@Table
public class Kontakt {
    @Id
    @GeneratedValue
   private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    private Date datumUnosa;
    private String ime;
    private String prezime;
    private int broj;

    @ManyToOne
    private VrstaKontakta vrstakontakta;

    public VrstaKontakta getVrstakontakta() {
        return vrstakontakta;
    }

    public void setVrstakontakta(VrstaKontakta vrstakontakta) {
        this.vrstakontakta = vrstakontakta;
    }
    
    
    public Date getDatumUnosa() {
        return datumUnosa;
    }

    public void setDatumUnosa(Date datumUnosa) {
        this.datumUnosa = datumUnosa;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }
    
      @Override
    public String toString() {
        return ime + " " + prezime + " " + broj + " " + datumUnosa + " " + getVrstakontakta();
    }

}
