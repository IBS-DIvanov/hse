package com.testproject.reqcrud.Repository;

import com.testproject.reqcrud.Entity.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Integer>{
}
