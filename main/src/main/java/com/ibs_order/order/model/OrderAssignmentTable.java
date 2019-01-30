package com.ibs_order.order.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="order_assignment_table")
public class OrderAssignmentTable {

    @Id
    @Column(name="id", nullable=false, unique=true)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_order", table = "orders", referencedColumnName = "id")
    Order id_order;

    @ManyToOne
    @JoinColumn(name = "id_assignment", table = "assignments", referencedColumnName = "id")
    Assignment id_assignment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Order getId_order() {
        return id_order;
    }

    public void setId_order(Order id_order) {
        this.id_order = id_order;
    }

    public Assignment getId_assignment() {
        return id_assignment;
    }

    public void setId_assignment(Assignment id_assignment) {
        this.id_assignment = id_assignment;
    }
}


