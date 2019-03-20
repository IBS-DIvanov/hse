package ru.perm.medicalservices.ordercrud.Entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "Request", schema = "public", catalog = "postgres")
public class RequestEntity {
    private int idRequest;
    private String rName;
    private Date rBeginDate;
    private Date rEndDate;
    private Date rUpdateDate;
    private Collection<ActEntity> actsByIdRequest;
    private Collection<ReferralEntity> referralsByIdRequest;
    private StatusEntity statusByIdStatus;
    private PatientEntity patientByIdPatient;

    @Id
    @Column(name = "ID_Request", nullable = false)
    public int getIdRequest() {
        return idRequest;
    }

    public void setIdRequest(int idRequest) {
        this.idRequest = idRequest;
    }

    @Basic
    @Column(name = "R_Name", nullable = false, length = -1)
    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    @Basic
    @Column(name = "R_Begin_Date", nullable = false)
    public Date getrBeginDate() {
        return rBeginDate;
    }

    public void setrBeginDate(Date rBeginDate) {
        this.rBeginDate = rBeginDate;
    }

    @Basic
    @Column(name = "R_End_Date", nullable = true)
    public Date getrEndDate() {
        return rEndDate;
    }

    public void setrEndDate(Date rEndDate) {
        this.rEndDate = rEndDate;
    }

    @Basic
    @Column(name = "R_Update_Date", nullable = false)
    public Date getrUpdateDate() {
        return rUpdateDate;
    }

    public void setrUpdateDate(Date rUpdateDate) {
        this.rUpdateDate = rUpdateDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RequestEntity that = (RequestEntity) o;

        if (idRequest != that.idRequest) return false;
        if (rName != null ? !rName.equals(that.rName) : that.rName != null) return false;
        if (rBeginDate != null ? !rBeginDate.equals(that.rBeginDate) : that.rBeginDate != null) return false;
        if (rEndDate != null ? !rEndDate.equals(that.rEndDate) : that.rEndDate != null) return false;
        if (rUpdateDate != null ? !rUpdateDate.equals(that.rUpdateDate) : that.rUpdateDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRequest;
        result = 31 * result + (rName != null ? rName.hashCode() : 0);
        result = 31 * result + (rBeginDate != null ? rBeginDate.hashCode() : 0);
        result = 31 * result + (rEndDate != null ? rEndDate.hashCode() : 0);
        result = 31 * result + (rUpdateDate != null ? rUpdateDate.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "requestByIdRequest")
    public Collection<ActEntity> getActsByIdRequest() {
        return actsByIdRequest;
    }

    public void setActsByIdRequest(Collection<ActEntity> actsByIdRequest) {
        this.actsByIdRequest = actsByIdRequest;
    }

    @OneToMany(mappedBy = "requestByIdRequest")
    public Collection<ReferralEntity> getReferralsByIdRequest() {
        return referralsByIdRequest;
    }

    public void setReferralsByIdRequest(Collection<ReferralEntity> referralsByIdRequest) {
        this.referralsByIdRequest = referralsByIdRequest;
    }

    @ManyToOne
    @JoinColumn(name = "ID_Status", referencedColumnName = "ID_Status", nullable = false)
    public StatusEntity getStatusByIdStatus() {
        return statusByIdStatus;
    }

    public void setStatusByIdStatus(StatusEntity statusByIdStatus) {
        this.statusByIdStatus = statusByIdStatus;
    }

    @ManyToOne
    @JoinColumn(name = "ID_Patient", referencedColumnName = "ID_Patient")
    public PatientEntity getPatientByIdPatient() {
        return patientByIdPatient;
    }

    public void setPatientByIdPatient(PatientEntity patientByIdPatient) {
        this.patientByIdPatient = patientByIdPatient;
    }
}
