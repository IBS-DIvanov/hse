package com.example.demo.Models;

import com.example.demo.Events.ItemUpdated;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Request extends AbstractRequest implements ItemUpdated {
    @Id
    @GeneratedValue(generator = "increment")
    private long id;

    private String title;
    private Date dateFrom;
    private Date dateTo;
    private Date dateLastUpdate;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private Person owner;
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private Person executor;

    private RequestType requestType;

    @OneToMany(fetch = FetchType.LAZY)
    ArrayList<Act> acts = new ArrayList<Act>();
    @OneToMany(fetch = FetchType.LAZY)
    ArrayList<Refferal> refferals = new ArrayList<Refferal> ();


    //region getters & setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        if(id!= this.id)this.itemUpdate();
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(!title.equals(this.title))this.itemUpdate();
        this.title = title;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {

        if(!dateFrom.equals(this.dateFrom))this.itemUpdate();
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {

        if(!dateTo.equals(this.dateTo))this.itemUpdate();
        this.dateTo = dateTo;
    }

    public Date getDateLastUpdate() {
        return dateLastUpdate;
    }

    public void setDateLastUpdate(Date dateLastUpdate) {

        if(!dateLastUpdate.equals(this.dateLastUpdate)) this.itemUpdate();
        this.dateLastUpdate = dateLastUpdate;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        if(!owner.equals(this.owner)) this.itemUpdate();
        this.owner = owner;
    }

    public Person getExecutor() {
        return executor;
    }

    public void setExecutor(Person executor) {
        if(!executor.equals(this.executor)) this.itemUpdate();
        this.executor = executor;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        if(!requestType.equals(this.requestType)) this.itemUpdate();
        this.requestType = requestType;
    }

    public List<Act> getActs() {
        return acts;
    }

    public void setActs(ArrayList<Act> acts) {

      if(!acts.equals(this.acts))this.itemUpdate();
      this.acts = acts;
    }
    //endregion


    public Request(long id, String title, Date dateFrom, Date dateTo, Date dateLastUpdate,  Person owner, Person executor, RequestType requestType) {
        super(id, title, dateFrom, dateTo, dateLastUpdate);

        this.owner = owner;
        this.executor = executor;
        this.requestType = requestType;
    }

    public Request() {
        super();

        owner = new Person();
        executor = new Person();
        requestType = RequestType.None;
        acts = new ArrayList<Act>() ;

    }


    @Override
    public void itemUpdate() {
        this.dateLastUpdate = new Date();
    }
}
