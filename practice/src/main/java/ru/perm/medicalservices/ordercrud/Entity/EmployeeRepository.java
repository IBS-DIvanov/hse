package ru.perm.medicalservices.ordercrud.Entity;

import org.springframework.data.repository.CrudRepository;
import ru.perm.medicalservices.ordercrud.Entity.EmployeeEntity;

public interface EmployeeRepository extends CrudRepository<EmployeeEntity, String> {
}
