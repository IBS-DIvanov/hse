package ru.perm.medicalservices.ordercrud.Entity;

import org.springframework.data.repository.CrudRepository;

public interface RequestRepository extends CrudRepository<RequestEntity, Integer> {
}