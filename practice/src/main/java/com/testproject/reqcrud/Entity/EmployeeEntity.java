package com.testproject.reqcrud.Entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Employee", schema = "public", catalog = "postgres")
public class EmployeeEntity {
    private int eId;
    private String eName;
    private Date eDob;

    @Id
    @Column(name = "E_ID")
    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    @Basic
    @Column(name = "E_Name")
    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    @Basic
    @Column(name = "E_DOB")
    public Date geteDob() {
        return eDob;
    }

    public void seteDob(Date eDob) {
        this.eDob = eDob;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeEntity that = (EmployeeEntity) o;

        if (eId != that.eId) return false;
        if (eName != null ? !eName.equals(that.eName) : that.eName != null) return false;
        if (eDob != null ? !eDob.equals(that.eDob) : that.eDob != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = eId;
        result = 31 * result + (eName != null ? eName.hashCode() : 0);
        result = 31 * result + (eDob != null ? eDob.hashCode() : 0);
        return result;
    }
}
