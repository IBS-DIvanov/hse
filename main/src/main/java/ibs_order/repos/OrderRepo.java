package ibs_order.repos;

import ibs_order.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepo extends CrudRepository<Order, Object> {
}
