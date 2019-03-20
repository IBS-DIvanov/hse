package ru.perm.medicalservices.ordercrud.Entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Referral", schema = "public", catalog = "postgres")
public class ReferralEntity {
    private int idReferral;
    private Date refDate;
    private RequestEntity requestByIdRequest;
    private TypeEntity typeByIdType;

    @Id
    @Column(name = "ID_Referral", nullable = false)
    public int getIdReferral() {
        return idReferral;
    }

    public void setIdReferral(int idReferral) {
        this.idReferral = idReferral;
    }

    @Basic
    @Column(name = "Ref_Date", nullable = false)
    public Date getRefDate() {
        return refDate;
    }

    public void setRefDate(Date refDate) {
        this.refDate = refDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReferralEntity that = (ReferralEntity) o;

        if (idReferral != that.idReferral) return false;
        if (refDate != null ? !refDate.equals(that.refDate) : that.refDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idReferral;
        result = 31 * result + (refDate != null ? refDate.hashCode() : 0);
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
    @JoinColumn(name = "ID_Type", referencedColumnName = "ID_Type", nullable = false)
    public TypeEntity getTypeByIdType() {
        return typeByIdType;
    }

    public void setTypeByIdType(TypeEntity typeByIdType) {
        this.typeByIdType = typeByIdType;
    }
}
