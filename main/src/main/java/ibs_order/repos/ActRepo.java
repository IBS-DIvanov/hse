package ibs_order.repos;

import ibs_order.model.Act;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActRepo extends CrudRepository<Act, Object> {
}
