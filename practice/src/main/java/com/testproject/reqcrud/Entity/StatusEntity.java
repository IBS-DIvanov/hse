package com.testproject.reqcrud.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Status", schema = "public", catalog = "postgres")
public class StatusEntity {
    private int sId;
    private String sName;

    @Id
    @Column(name = "S_ID")
    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    @Basic
    @Column(name = "S_Name")
    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StatusEntity that = (StatusEntity) o;

        if (sId != that.sId) return false;
        if (sName != null ? !sName.equals(that.sName) : that.sName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sId;
        result = 31 * result + (sName != null ? sName.hashCode() : 0);
        return result;
    }
}
