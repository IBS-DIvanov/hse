package com.testproject.reqcrud.Entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Act", schema = "public", catalog = "postgres")
public class ActEntity {
    private int actId;
    private String actName;
    private Date actDate;

    @Id
    @Column(name = "Act_ID")
    public int getActId() {
        return actId;
    }

    public void setActId(int actId) {
        this.actId = actId;
    }

    @Basic
    @Column(name = "Act_Name")
    public String getActName() {
        return actName;
    }

    public void setActName(String actName) {
        this.actName = actName;
    }

    @Basic
    @Column(name = "Act_Date")
    public Date getActDate() {
        return actDate;
    }

    public void setActDate(Date actDate) {
        this.actDate = actDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ActEntity actEntity = (ActEntity) o;

        if (actId != actEntity.actId) return false;
        if (actName != null ? !actName.equals(actEntity.actName) : actEntity.actName != null) return false;
        if (actDate != null ? !actDate.equals(actEntity.actDate) : actEntity.actDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = actId;
        result = 31 * result + (actName != null ? actName.hashCode() : 0);
        result = 31 * result + (actDate != null ? actDate.hashCode() : 0);
        return result;
    }
}
