package ibs_order.model;

import javax.persistence.*;

@Entity
@Table(name="order_act_table")
public class OrderActTable {

    @Id
    @Column(name="id", nullable=false, unique=true)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_order", /*table = "orders",*/ referencedColumnName = "id")
    private Order id_order;

    @ManyToOne
    @JoinColumn(name = "id_act", /*table = "acts",*/ referencedColumnName = "id")
    private Act id_act;


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

    public Act getId_act() {
        return id_act;
    }

    public void setId_act(Act id_act) {
        this.id_act = id_act;
    }
}
