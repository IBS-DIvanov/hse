package ru.hse.edu.java.myu.appdemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ApplicationType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    protected ApplicationType() {}

    public ApplicationType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format(
                "ApplicationType(id=%d, name='%s')",
                id, name);
    }

}
