package com.gta.remuniration.entity;




import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity

public class Salarie  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String nomsalarie;
    private String prenom_salarie;
    private String emailsalarie;
    private String tel_salarie;
    @Temporal(TemporalType.DATE)
    private Date datenaissance_salarie;
    @Transient
    @OneToMany(mappedBy = "salarie", fetch = FetchType.LAZY,cascade=CascadeType.ALL)
    private Set<SalarieFonction> salariefonction = new HashSet<SalarieFonction>();
    @Transient
    @OneToMany(mappedBy = "salarie", fetch = FetchType.LAZY,cascade=CascadeType.ALL)
    private Set<Responsable> responsable = new HashSet<Responsable>();
    @Transient
    @OneToMany(mappedBy = "salarie", fetch = FetchType.LAZY,cascade=CascadeType.ALL)
    private Set<Appartient>  appartients = new HashSet<Appartient>();
    @Transient
    @OneToMany(mappedBy = "salarie", fetch = FetchType.LAZY,cascade=CascadeType.ALL)
    private Set<Demande> demandes = new HashSet<Demande>();
    @Transient
    @OneToMany(mappedBy = "salarie", fetch = FetchType.LAZY,cascade=CascadeType.ALL)
    private Set<User> Users = new HashSet<User>();


    public Salarie() {

    }

    public Salarie(String nom_salarie, String prenom_salarie, String email_salarie,String tel_salarie) {
        this.nomsalarie = nom_salarie;
        this.prenom_salarie = prenom_salarie;
        this.emailsalarie = email_salarie;
        this.tel_salarie=tel_salarie;
        //this.datenaissance_salarie=datenaissance_salarie;
    }


    public Set<SalarieFonction> getSalariefonction() {
        return salariefonction;
    }

    public void setSalariefonction(Set<SalarieFonction> salariefonction) {
        this.salariefonction = salariefonction;
    }
    public Set<Responsable> getResponsable() {
        return responsable;
    }

    public void setResponsable(Set<Responsable> responsable) {
        this.responsable = responsable;
    }
    public Set<Appartient> getAppartients () {
        return appartients ;
    }

    public void setAppartients (Set<Appartient> associations) {
        this.appartients  = associations;
    }
    public Set<Demande> getDemandes() {
        return demandes;
    }

    public void setDemandes(Set<Demande> demandes) {
        this.demandes = demandes;
    }

    public void setUsers(Set<User> users) {
        Users = users;
    }

    public Set<User> getUsers() {
        return Users;
    }

    /***************************get/set*************************/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomsalarie() {
        return nomsalarie;
    }

    public void setNomsalarie(String nomsalarie) {
        this.nomsalarie = nomsalarie;
    }

    public String getPrenom_salarie() {
        return prenom_salarie;
    }

    public void setPrenom_salarie(String prenom_salarie) {
        this.prenom_salarie = prenom_salarie;
    }

    public String getEmailsalarie() {
        return emailsalarie;
    }

    public void setEmailsalarie(String emailsalarie) {
        this.emailsalarie = emailsalarie;
    }

    public String getTel_salarie() {
        return tel_salarie;
    }
    public void setTel_salarie(String tel_salarie) {
        this.tel_salarie = tel_salarie;
    }


    public Date getDatenaissance_salarie() {
        return datenaissance_salarie;
    }
    public void setDatenaissance_salarie(Date datenaissance_salarie) {
        this.datenaissance_salarie = datenaissance_salarie;
    }

    @Override
    public String toString() {
        return "Salarie{" +
                "id_salarie=" + id +
                ", nom_salarie='" + nomsalarie + '\'' +
                ", prenom_salarie='" + prenom_salarie + '\'' +
                ", email_salarie='" + emailsalarie + '\'' +
                ", tel_salarie='" + tel_salarie + '\'' +
                ", datenaissance_salarie=" + datenaissance_salarie +
                '}';
    }
}

