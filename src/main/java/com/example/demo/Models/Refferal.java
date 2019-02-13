package com.example.demo.Models;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Refferal extends AbstractRequest {
    public Refferal(long id, String title, Date dateFrom, Date dateTo, Date dateLastUpdate) {
        super(id, title, dateFrom, dateTo, dateLastUpdate);
    }

    public Refferal() {
        super();
    }

    @Override
    public String toString() {
        return String.format("Refferal{}", this.id  );
    }
}
