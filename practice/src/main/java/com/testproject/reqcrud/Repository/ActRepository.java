package com.testproject.reqcrud.Repository;

import org.springframework.data.repository.CrudRepository;
import com.testproject.reqcrud.Entity.ActEntity;

public interface ActRepository extends CrudRepository<ActEntity, Integer> {
}
