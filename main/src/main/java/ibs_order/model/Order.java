package ibs_order.model;


import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="orders")
public class Order {

    @Id
    @Column(name="id", nullable=false, unique=true)
    private Integer id;

    @Column(name="number", nullable=false)
    private String number;

    @Column(name="name", nullable=false)
    private String name;

    @Column(name="registration_date", nullable=false)
    private Date registration_date;

    @Column(name="end_date")
    private Date end_date;

    @Column(name="update_date")
    private Date update_date;

    @ManyToOne
    @JoinColumn(name = "id_type", /*table = "order_types",*/ referencedColumnName = "id")
    private OrderType type;

    @ManyToOne
    @JoinColumn(name = "id_contractor", /*table = "contractors",*/ referencedColumnName = "id")
    private Contractor contractor;

    @ManyToOne
    @JoinColumn(name = "id_customer", /*table = "customers",*/ referencedColumnName = "id")
    private Customer customer;

    @Column(name="description")
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

    public OrderType getId_type() {
        return type;
    }

    public void setId_type(OrderType id_type) {
        this.type = id_type;
    }

    public Contractor getId_contractor() {
        return contractor;
    }

    public void setId_contractor(Contractor id_contractor) {
        this.contractor = id_contractor;
    }

    public Customer getId_customer() {
        return customer;
    }

    public void setId_customer(Customer id_customer) {
        this.customer = id_customer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


