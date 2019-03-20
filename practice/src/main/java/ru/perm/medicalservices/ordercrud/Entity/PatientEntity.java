package ru.perm.medicalservices.ordercrud.Entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "Patient", schema = "public", catalog = "postgres")
public class PatientEntity {
    private int idPatient;
    private String pName;
    private Date pDob;
    private Collection<RequestEntity> requestsByIdPatient;

    @Id
    @Column(name = "ID_Patient", nullable = false)
    public int getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
    }

    @Basic
    @Column(name = "P_Name", nullable = false, length = -1)
    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    @Basic
    @Column(name = "P_DOB", nullable = false)
    public Date getpDob() {
        return pDob;
    }

    public void setpDob(Date pDob) {
        this.pDob = pDob;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PatientEntity that = (PatientEntity) o;

        if (idPatient != that.idPatient) return false;
        if (pName != null ? !pName.equals(that.pName) : that.pName != null) return false;
        if (pDob != null ? !pDob.equals(that.pDob) : that.pDob != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPatient;
        result = 31 * result + (pName != null ? pName.hashCode() : 0);
        result = 31 * result + (pDob != null ? pDob.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "patientByIdPatient")
    public Collection<RequestEntity> getRequestsByIdPatient() {
        return requestsByIdPatient;
    }

    public void setRequestsByIdPatient(Collection<RequestEntity> requestsByIdPatient) {
        this.requestsByIdPatient = requestsByIdPatient;
    }
}
