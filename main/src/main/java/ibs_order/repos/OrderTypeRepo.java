package ibs_order.repos;

import ibs_order.model.OrderType;
import org.springframework.data.repository.CrudRepository;

public interface OrderTypeRepo extends CrudRepository<OrderType, Object> {
}
