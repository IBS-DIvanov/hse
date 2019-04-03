package ru.hse.edu.java.myu.appdemo;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Act {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private Date startdate;
    private Date enddate;
    private int actsum;
    private int numberofproducts;

    @ManyToOne
    private Application application;

    @ManyToOne
    private Employee executor;

    protected Act() {}

    public Act (String name, Date startdate, Date enddate, int actsum, int numberofproducts) {
        this.name = name;
        this.startdate = startdate;
        this.enddate = enddate;
        this.actsum = actsum;
        this.numberofproducts = numberofproducts;
    }

    @Override
    public String toString() {
        return String.format(
                "Act(id=%d, name='%s', startdate='%s', enddate='%s', actsum='%s', numberofproducts='%s')",
                id, name, startdate, enddate, actsum, numberofproducts);
    }

}
