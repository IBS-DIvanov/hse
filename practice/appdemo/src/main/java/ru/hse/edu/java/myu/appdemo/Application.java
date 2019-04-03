package ru.hse.edu.java.myu.appdemo;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Date startdate;
    private Date enddate;
    private Date executiondate;
    private String receiveraddress;

    @ManyToOne
    private Employee employee;

    @ManyToOne
    private ApplicationType type;

    @ManyToOne
    private Client client;

    @ManyToOne
    private Status status;

    @ManyToMany(targetEntity = Supplier.class)
    private Set supplierSet;

    protected Application() {}

    public Application(Date startdate, Date enddate, Date executiondate, String receiveraddress) {
        this.startdate = startdate;
        this.enddate = enddate;
        this.executiondate = executiondate;
        this.receiveraddress = receiveraddress;
    }

    @Override
    public String toString() {
        return String.format(
                "Application(id=%d, startdate='%s', enddate='%s', executiondate='%s', receiveraddress='%s')",
                id, startdate, enddate, executiondate, receiveraddress);
    }

}
