package com.testproject.reqcrud.Entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Patient", schema = "public", catalog = "postgres")
public class PatientEntity {
    private int patientId;
    private String patientName;
    private Date patientDob;

    @Id
    @Column(name = "Patient_ID")
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    @Basic
    @Column(name = "Patient_Name")
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    @Basic
    @Column(name = "Patient_DOB")
    public Date getPatientDob() {
        return patientDob;
    }

    public void setPatientDob(Date patientDob) {
        this.patientDob = patientDob;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PatientEntity that = (PatientEntity) o;

        if (patientId != that.patientId) return false;
        if (patientName != null ? !patientName.equals(that.patientName) : that.patientName != null) return false;
        if (patientDob != null ? !patientDob.equals(that.patientDob) : that.patientDob != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = patientId;
        result = 31 * result + (patientName != null ? patientName.hashCode() : 0);
        result = 31 * result + (patientDob != null ? patientDob.hashCode() : 0);
        return result;
    }
}
