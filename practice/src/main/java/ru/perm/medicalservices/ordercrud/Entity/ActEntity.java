package ru.perm.medicalservices.ordercrud.Entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Act", schema = "public", catalog = "postgres")
public class ActEntity {
    private int idAct;
    private String aName;
    private Date aDate;
    private RequestEntity requestByIdRequest;
    private EmployeeEntity employeeByELogin;

    @Id
    @Column(name = "ID_Act", nullable = false)
    public int getIdAct() {
        return idAct;
    }

    public void setIdAct(int idAct) {
        this.idAct = idAct;
    }

    @Basic
    @Column(name = "A_Name", nullable = false, length = -1)
    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    @Basic
    @Column(name = "A_Date", nullable = false)
    public Date getaDate() {
        return aDate;
    }

    public void setaDate(Date aDate) {
        this.aDate = aDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ActEntity actEntity = (ActEntity) o;

        if (idAct != actEntity.idAct) return false;
        if (aName != null ? !aName.equals(actEntity.aName) : actEntity.aName != null) return false;
        if (aDate != null ? !aDate.equals(actEntity.aDate) : actEntity.aDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAct;
        result = 31 * result + (aName != null ? aName.hashCode() : 0);
        result = 31 * result + (aDate != null ? aDate.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "ID_Request", referencedColumnName = "ID_Request")
    public RequestEntity getRequestByIdRequest() {
        return requestByIdRequest;
    }

    public void setRequestByIdRequest(RequestEntity requestByIdRequest) {
        this.requestByIdRequest = requestByIdRequest;
    }

    @ManyToOne
    @JoinColumn(name = "E_Login", referencedColumnName = "E_Login")
    public EmployeeEntity getEmployeeByELogin() {
        return employeeByELogin;
    }

    public void setEmployeeByELogin(EmployeeEntity employeeByELogin) {
        this.employeeByELogin = employeeByELogin;
    }
}
