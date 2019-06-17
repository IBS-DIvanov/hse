package com.testproject.reqcrud.Repository;

import com.testproject.reqcrud.Entity.PatientEntity;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<PatientEntity, Integer>{
}
