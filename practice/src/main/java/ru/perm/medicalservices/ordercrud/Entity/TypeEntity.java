package ru.perm.medicalservices.ordercrud.Entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "Type", schema = "public", catalog = "postgres")
public class TypeEntity {
    private int idType;
    private String tName;
    private Collection<ReferralEntity> referralsByIdType;

    @Id
    @Column(name = "ID_Type", nullable = false)
    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    @Basic
    @Column(name = "T_Name", nullable = false, length = -1)
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

        if (idType != that.idType) return false;
        if (tName != null ? !tName.equals(that.tName) : that.tName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idType;
        result = 31 * result + (tName != null ? tName.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "typeByIdType")
    public Collection<ReferralEntity> getReferralsByIdType() {
        return referralsByIdType;
    }

    public void setReferralsByIdType(Collection<ReferralEntity> referralsByIdType) {
        this.referralsByIdType = referralsByIdType;
    }
}
