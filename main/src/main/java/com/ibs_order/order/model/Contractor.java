package com.ibs_order.order.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="contractors")
public class Contractor {

    @Id
    @Column(name="id", nullable=false, unique=true)
    private Integer id;

    @Column(name="first_name", nullable=false)
    private String first_name;

    @Column(name="last_name", nullable=false)
    private String last_name;

    @Column(name="date_of_birth")
    private Date date_of_birth;



    @ManyToOne
    @JoinColumn(name = "id_company", table = "companies", referencedColumnName = "id")
    Company id_company;




    @ManyToOne
    @JoinColumn(name = "id_position", table = "positions", referencedColumnName = "id")
    Position id_position;




    public Position getId_position() {
        return id_position;
    }

    public void setId_position(Position id_position) {
        this.id_position = id_position;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public Company getId_company() {
        return id_company;
    }

    public void setId_company(Company id_company) {
        this.id_company = id_company;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public Date getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(Date phone_number) {
        this.phone_number = phone_number;
    }

    @Column(name="passport")
    private String passport;

    @Column(name="phone_number")
    private Date phone_number;




}
