package com.testproject.reqcrud.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Account", schema = "public", catalog = "postgres")
public class AccountEntity {
    private String aId;
    private String aPassword;

    @Id
    @Column(name = "A_ID")
    public String getaId() {
        return aId;
    }

    public void setaId(String aId) {
        this.aId = aId;
    }

    @Basic
    @Column(name = "A_Password")
    public String getaPassword() {
        return aPassword;
    }

    public void setaPassword(String aPassword) {
        this.aPassword = aPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccountEntity that = (AccountEntity) o;

        if (aId != null ? !aId.equals(that.aId) : that.aId != null) return false;
        if (aPassword != null ? !aPassword.equals(that.aPassword) : that.aPassword != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = aId != null ? aId.hashCode() : 0;
        result = 31 * result + (aPassword != null ? aPassword.hashCode() : 0);
        return result;
    }
}
