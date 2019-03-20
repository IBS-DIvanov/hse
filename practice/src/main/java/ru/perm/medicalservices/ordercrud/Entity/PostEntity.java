package ru.perm.medicalservices.ordercrud.Entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "Post", schema = "public", catalog = "postgres")
public class PostEntity {
    private int idPost;
    private String pName;
    private Collection<EmployeeEntity> employeesByIdPost;

    @Id
    @Column(name = "ID_Post", nullable = false)
    public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    @Basic
    @Column(name = "P_Name", nullable = false, length = -1)
    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PostEntity that = (PostEntity) o;

        if (idPost != that.idPost) return false;
        if (pName != null ? !pName.equals(that.pName) : that.pName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPost;
        result = 31 * result + (pName != null ? pName.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "postByIdPost")
    public Collection<EmployeeEntity> getEmployeesByIdPost() {
        return employeesByIdPost;
    }

    public void setEmployeesByIdPost(Collection<EmployeeEntity> employeesByIdPost) {
        this.employeesByIdPost = employeesByIdPost;
    }
}
