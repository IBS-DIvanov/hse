package ru.perm.medicalservices.ordercrud.Entity;

import org.springframework.data.repository.CrudRepository;
import ru.perm.medicalservices.ordercrud.Entity.PasswordEntity;

public interface PasswordRepository extends CrudRepository<PasswordEntity, Long> {
}