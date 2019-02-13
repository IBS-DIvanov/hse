package com.example.demo.Models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

public abstract class AbstractRequest {

    @Id
    @GeneratedValue(generator = "increment")
    protected long id;

    protected String title;
    protected Date dateFrom;
    protected Date dateTo;
    protected Date dateLastUpdate;

    protected AbstractRequest(long id, String title, Date dateFrom, Date dateTo, Date dateLastUpdate) {
        this.id = id;
        this.title = title;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.dateLastUpdate = dateLastUpdate;
    }
    protected AbstractRequest() {
        id = 0;
        title = String.format("Title {}", id);
        dateFrom = new Date();
        dateLastUpdate= new Date();
        dateTo = new Date();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public Date getDateLastUpdate() {
        return dateLastUpdate;
    }

    public void setDateLastUpdate(Date dateLastUpdate) {
        this.dateLastUpdate = dateLastUpdate;
    }
}
