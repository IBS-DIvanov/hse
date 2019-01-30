package com.ibs_order.order.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="customers")
public class Customer {
    @Id
    @Column(name="id", nullable=false, unique=true)
    private Integer id;

    @Column(name="first_name", nullable=false)
    private String first_name;

    @Column(name="last_name", nullable=false)
    private String last_name;

    @ManyToOne
    @JoinColumn(name = "id_status", table = "customer_statuses", referencedColumnName = "id")
    CustomerStatuses id_status;

    @ManyToOne
    @JoinColumn(name = "id_company", table = "companies", referencedColumnName = "id")
    Company id_company;

    @Column(name="address")
    private String address;

    @Column(name="telephone")
    private String telephone;


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

    public void setId_status(CustomerStatuses id_status) {
        this.id_status = id_status;
    }

    public void setId_company(Company id_company) {
        this.id_company = id_company;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}





