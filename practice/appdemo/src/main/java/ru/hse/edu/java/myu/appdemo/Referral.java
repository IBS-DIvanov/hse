package ru.hse.edu.java.myu.appdemo;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Referral {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private Date startdate;
    private Date enddate;
    private int referralsum;
    private int numberofproducts;

    @ManyToOne
    private Application application;

    @ManyToOne
    private Employee responsible;

    protected Referral() {}

    public Referral (String name, Date startdate, Date enddate, int referralsum, int numberofproducts) {
        this.name = name;
        this.startdate = startdate;
        this.enddate = enddate;
        this.referralsum = referralsum;
        this.numberofproducts = numberofproducts;
    }

    @Override
    public String toString() {
        return String.format(
                "Referral(id=%d, name='%s', startdate='%s', enddate='%s', referralsum='%s', numberofproducts='%s')",
                id, name, startdate, enddate, referralsum, numberofproducts);
    }

}
