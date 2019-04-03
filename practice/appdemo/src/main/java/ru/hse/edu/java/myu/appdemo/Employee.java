package ru.hse.edu.java.myu.appdemo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String lastname;
    private String firstname;
    private String patronymic;
    private Date dateofbirth;

    @ManyToOne
    private Job job;

    protected Employee() {}

    public Employee(String lastname, String firstname, String patronymic, Date dateofbirth) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.patronymic = patronymic;
        this.dateofbirth = dateofbirth;
    }

    @Override
    public String toString() {
        return String.format(
                "Employee(id=%d, lastname='%s', firstname='%s', patronymic='%s', dateofbirth='%s')",
                id, lastname, firstname, patronymic, dateofbirth);
    }

}
