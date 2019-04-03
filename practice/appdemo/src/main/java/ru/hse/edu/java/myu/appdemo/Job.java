package ru.hse.edu.java.myu.appdemo;

import javax.persistence.*;

@Entity
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @ManyToOne
    private  Department department;

    protected Job() {}

    public Job(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format(
                "Job(id=%d, name='%s')",
                id, name);
    }

}
