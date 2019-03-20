package ru.perm.medicalservices.ordercrud.Repository;

import org.springframework.data.repository.CrudRepository;
import ru.perm.medicalservices.ordercrud.Entity.PostEntity;

public interface PostRepository extends CrudRepository<PostEntity, Integer> {
}