package ibs_order.repos;

import ibs_order.model.CustomerStatus;
import org.springframework.data.repository.CrudRepository;

public interface CustomerStatusRepo extends CrudRepository<CustomerStatus, Object> {
}
