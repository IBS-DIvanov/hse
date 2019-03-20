package ru.perm.medicalservices.ordercrud.Entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "Employee", schema = "public", catalog = "postgres")
public class EmployeeEntity {
    private String eLogin;
    private String eName;
    private Date eDob;
    private Collection<ActEntity> actsByELogin;
    private PostEntity postByIdPost;
    private PasswordEntity passwordByIdPassword;

    @Id
    @Column(name = "E_Login", nullable = false, length = -1)
    public String geteLogin() {
        return eLogin;
    }

    public void seteLogin(String eLogin) {
        this.eLogin = eLogin;
    }

    @Basic
    @Column(name = "E_Name", nullable = false, length = -1)
    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    @Basic
    @Column(name = "E_DOB", nullable = false)
    public Date geteDob() {
        return eDob;
    }

    public void seteDob(Date eDob) {
        this.eDob = eDob;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeEntity that = (EmployeeEntity) o;

        if (eLogin != null ? !eLogin.equals(that.eLogin) : that.eLogin != null) return false;
        if (eName != null ? !eName.equals(that.eName) : that.eName != null) return false;
        if (eDob != null ? !eDob.equals(that.eDob) : that.eDob != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = eLogin != null ? eLogin.hashCode() : 0;
        result = 31 * result + (eName != null ? eName.hashCode() : 0);
        result = 31 * result + (eDob != null ? eDob.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "employeeByELogin")
    public Collection<ActEntity> getActsByELogin() {
        return actsByELogin;
    }

    public void setActsByELogin(Collection<ActEntity> actsByELogin) {
        this.actsByELogin = actsByELogin;
    }

    @ManyToOne
    @JoinColumn(name = "ID_Post", referencedColumnName = "ID_Post")
    public PostEntity getPostByIdPost() {
        return postByIdPost;
    }

    public void setPostByIdPost(PostEntity postByIdPost) {
        this.postByIdPost = postByIdPost;
    }

    @ManyToOne
    @JoinColumn(name = "ID_Password", referencedColumnName = "ID_Password")
    public PasswordEntity getPasswordByIdPassword() {
        return passwordByIdPassword;
    }

    public void setPasswordByIdPassword(PasswordEntity passwordByIdPassword) {
        this.passwordByIdPassword = passwordByIdPassword;
    }
}
