package ru.hse.edu.java.myu.appdemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String lastname;
    private String firstname;
    private String patronymic;
    private Date dateofbirth;
    private String passport;
    private String address;

    protected Client() {}

    public Client(String lastname, String firstname, String patronymic, Date dateofbirth, String passport, String address) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.patronymic = patronymic;
        this.dateofbirth = dateofbirth;
        this.passport = passport;
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format(
                "Client(id=%d, lastname='%s', firstname='%s', patronymic='%s', dateofbirth='%s', passport='%s', address='%s')",
                id, lastname, firstname, patronymic, dateofbirth, passport, address);
    }

}
