package ru.perm.medicalservices.ordercrud.Entity;

import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<PatientEntity, Integer> {
}