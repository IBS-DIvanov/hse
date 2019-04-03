package ru.hse.edu.java.myu.appdemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    protected Department() {}

    public Department(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format(
                "Department(id=%d, name='%s')",
                id, name);
    }

}
