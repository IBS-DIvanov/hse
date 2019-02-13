package com.example.demo.Models;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Person {

    @Id
    @GeneratedValue(generator = "increment")
    private long id;

    private String fName;
    private String sName;

    private Role role;

    private String login;
    private String password;


//region Getters & Setters
public long getId() {
    return id;
}

    public void setId(long id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//endregion

    @Override
    public String toString() {
        return String.format("{} {}", this.fName, this.sName);
    }
}

