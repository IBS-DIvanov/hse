package ibs_order.repos;

import ibs_order.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepo extends CrudRepository<Customer, Object> {
}
