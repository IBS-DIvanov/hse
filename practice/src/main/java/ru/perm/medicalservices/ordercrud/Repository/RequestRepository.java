package ru.perm.medicalservices.ordercrud.Repository;

import org.springframework.data.repository.CrudRepository;
import ru.perm.medicalservices.ordercrud.Entity.RequestEntity;

public interface RequestRepository extends CrudRepository<RequestEntity, Integer> {
}