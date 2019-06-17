package com.testproject.reqcrud.Repository;

import com.testproject.reqcrud.Entity.StatusEntity;
import org.springframework.data.repository.CrudRepository;

public interface StatusRepository extends CrudRepository<StatusEntity, Integer> {
}
