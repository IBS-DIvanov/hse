package ru.perm.medicalservices.ordercrud.Repository;

import org.springframework.data.repository.CrudRepository;
import ru.perm.medicalservices.ordercrud.Entity.ActEntity;

public interface ActRepository extends CrudRepository<ActEntity, Integer> {
}