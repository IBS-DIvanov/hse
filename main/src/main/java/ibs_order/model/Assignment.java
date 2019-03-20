package ibs_order.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="assignments")
public class Assignment {

    @Id
    @Column(name="id", nullable=false, unique=true)
    private Integer id;

    @Column(name="name", nullable=false)
    private String name;

    @Column(name="registration_date", nullable=false)
    private Date registration_date;

    @Column(name="end_date")
    private Date end_date;

    @Column(name="update_date")
    private Date update_date;

    @ManyToOne
    @JoinColumn(name = "id_contractor", /*table = "contractors",*/ referencedColumnName = "id")
    private Contractor id_contractor;

    @Column(name="description")
    private String description;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRegistration_date() {
        return registration_date;
    }

    public void setRegistration_date(Date registration_date) {
        this.registration_date = registration_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public Date getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }

    public Contractor getId_contractor() {
        return id_contractor;
    }

    public void setId_contractor(Contractor id_contractor) {
        this.id_contractor = id_contractor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
