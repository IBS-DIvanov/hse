package ru.perm.medicalservices.ordercrud.Entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "Password", schema = "public", catalog = "postgres")
public class PasswordEntity {
    private String pValue;
    private long idPassword;
    private Collection<EmployeeEntity> employeesByIdPassword;

    @Basic
    @Column(name = "P_Value", nullable = false, length = -1)
    public String getpValue() {
        return pValue;
    }

    public void setpValue(String pValue) {
        this.pValue = pValue;
    }

    @Id
    @Column(name = "ID_Password", nullable = false)
    public long getIdPassword() {
        return idPassword;
    }

    public void setIdPassword(long idPassword) {
        this.idPassword = idPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PasswordEntity that = (PasswordEntity) o;

        if (idPassword != that.idPassword) return false;
        if (pValue != null ? !pValue.equals(that.pValue) : that.pValue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pValue != null ? pValue.hashCode() : 0;
        result = 31 * result + (int) (idPassword ^ (idPassword >>> 32));
        return result;
    }

    @OneToMany(mappedBy = "passwordByIdPassword")
    public Collection<EmployeeEntity> getEmployeesByIdPassword() {
        return employeesByIdPassword;
    }

    public void setEmployeesByIdPassword(Collection<EmployeeEntity> employeesByIdPassword) {
        this.employeesByIdPassword = employeesByIdPassword;
    }
}
