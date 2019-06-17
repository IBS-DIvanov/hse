package com.testproject.reqcrud.Entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Referral", schema = "public", catalog = "postgres")
public class ReferralEntity {
    private int refId;
    private Date refDate;
    private String refAddinfo;

    @Id
    @Column(name = "Ref_ID")
    public int getRefId() {
        return refId;
    }

    public void setRefId(int refId) {
        this.refId = refId;
    }

    @Basic
    @Column(name = "Ref_Date")
    public Date getRefDate() {
        return refDate;
    }

    public void setRefDate(Date refDate) {
        this.refDate = refDate;
    }

    @Basic
    @Column(name = "ref_addinfo")
    public String getRefAddinfo() {
        return refAddinfo;
    }

    public void setRefAddinfo(String refAddinfo) {
        this.refAddinfo = refAddinfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReferralEntity that = (ReferralEntity) o;

        if (refId != that.refId) return false;
        if (refDate != null ? !refDate.equals(that.refDate) : that.refDate != null) return false;
        if (refAddinfo != null ? !refAddinfo.equals(that.refAddinfo) : that.refAddinfo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = refId;
        result = 31 * result + (refDate != null ? refDate.hashCode() : 0);
        result = 31 * result + (refAddinfo != null ? refAddinfo.hashCode() : 0);
        return result;
    }
}
