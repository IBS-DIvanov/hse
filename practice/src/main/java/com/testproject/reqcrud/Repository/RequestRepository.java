package com.testproject.reqcrud.Repository;

import com.testproject.reqcrud.Entity.RequestEntity;
import org.springframework.data.repository.CrudRepository;

public interface RequestRepository extends CrudRepository<RequestEntity, Integer> {
}
