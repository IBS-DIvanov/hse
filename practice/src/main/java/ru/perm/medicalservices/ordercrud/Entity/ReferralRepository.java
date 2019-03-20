package ru.perm.medicalservices.ordercrud.Entity;

import org.springframework.data.repository.CrudRepository;
import ru.perm.medicalservices.ordercrud.Entity.ReferralEntity;

public interface ReferralRepository extends CrudRepository<ReferralEntity, Integer> {
}