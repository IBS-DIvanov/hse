package ru.hse.edu.java.myu.appdemo;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int licence;
    private String inn;
    private String address;

    @ManyToMany(targetEntity = Application.class)
    private Set applicationSet;

    protected Supplier() {}

    public Supplier(String name, int licence, String inn, String address) {
        this.name = name;
        this.licence = licence;
        this.inn = inn;
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format(
                "Supplier(id=%d, name='%s', licence='%s', inn='%s', address='%s')",
                id, name, licence, inn, address);
    }

}
