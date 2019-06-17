package com.testproject.reqcrud.Entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Request", schema = "public", catalog = "postgres")
public class RequestEntity {
    private int reqId;
    private String reqName;
    private Date reqBeginDate;
    private Date reqEndDate;
    private Date reqUpdateDate;

    @Id
    @Column(name = "Req_ID")
    public int getReqId() {
        return reqId;
    }

    public void setReqId(int reqId) {
        this.reqId = reqId;
    }

    @Basic
    @Column(name = "Req_Name")
    public String getReqName() {
        return reqName;
    }

    public void setReqName(String reqName) {
        this.reqName = reqName;
    }

    @Basic
    @Column(name = "Req_Begin_Date")
    public Date getReqBeginDate() {
        return reqBeginDate;
    }

    public void setReqBeginDate(Date reqBeginDate) {
        this.reqBeginDate = reqBeginDate;
    }

    @Basic
    @Column(name = "Req_End_Date")
    public Date getReqEndDate() {
        return reqEndDate;
    }

    public void setReqEndDate(Date reqEndDate) {
        this.reqEndDate = reqEndDate;
    }

    @Basic
    @Column(name = "Req_Update_Date")
    public Date getReqUpdateDate() {
        return reqUpdateDate;
    }

    public void setReqUpdateDate(Date reqUpdateDate) {
        this.reqUpdateDate = reqUpdateDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RequestEntity that = (RequestEntity) o;

        if (reqId != that.reqId) return false;
        if (reqName != null ? !reqName.equals(that.reqName) : that.reqName != null) return false;
        if (reqBeginDate != null ? !reqBeginDate.equals(that.reqBeginDate) : that.reqBeginDate != null) return false;
        if (reqEndDate != null ? !reqEndDate.equals(that.reqEndDate) : that.reqEndDate != null) return false;
        if (reqUpdateDate != null ? !reqUpdateDate.equals(that.reqUpdateDate) : that.reqUpdateDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = reqId;
        result = 31 * result + (reqName != null ? reqName.hashCode() : 0);
        result = 31 * result + (reqBeginDate != null ? reqBeginDate.hashCode() : 0);
        result = 31 * result + (reqEndDate != null ? reqEndDate.hashCode() : 0);
        result = 31 * result + (reqUpdateDate != null ? reqUpdateDate.hashCode() : 0);
        return result;
    }
}
