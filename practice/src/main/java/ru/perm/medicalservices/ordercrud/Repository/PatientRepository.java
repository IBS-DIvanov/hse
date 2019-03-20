package ru.perm.medicalservices.ordercrud.Repository;

import org.springframework.data.repository.CrudRepository;
import ru.perm.medicalservices.ordercrud.Entity.PatientEntity;

public interface PatientRepository extends CrudRepository<PatientEntity, Integer> {
}