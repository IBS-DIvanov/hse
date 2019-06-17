package com.testproject.reqcrud.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Type", schema = "public", catalog = "postgres")
public class TypeEntity {
    private int tId;
    private String tName;

    @Id
    @Column(name = "T_ID")
    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    @Basic
    @Column(name = "T_Name")
    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TypeEntity that = (TypeEntity) o;

        if (tId != that.tId) return false;
        if (tName != null ? !tName.equals(that.tName) : that.tName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tId;
        result = 31 * result + (tName != null ? tName.hashCode() : 0);
        return result;
    }
}
