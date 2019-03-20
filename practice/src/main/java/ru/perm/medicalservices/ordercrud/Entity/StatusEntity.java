package ru.perm.medicalservices.ordercrud.Entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "Status", schema = "public", catalog = "postgres")
public class StatusEntity {
    private int idStatus;
    private String sName;
    private Collection<RequestEntity> requestsByIdStatus;

    @Id
    @Column(name = "ID_Status", nullable = false)
    public int getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }

    @Basic
    @Column(name = "S_Name", nullable = false, length = -1)
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

        if (idStatus != that.idStatus) return false;
        if (sName != null ? !sName.equals(that.sName) : that.sName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idStatus;
        result = 31 * result + (sName != null ? sName.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "statusByIdStatus")
    public Collection<RequestEntity> getRequestsByIdStatus() {
        return requestsByIdStatus;
    }

    public void setRequestsByIdStatus(Collection<RequestEntity> requestsByIdStatus) {
        this.requestsByIdStatus = requestsByIdStatus;
    }
}
