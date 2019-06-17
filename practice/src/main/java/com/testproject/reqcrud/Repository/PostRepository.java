package com.testproject.reqcrud.Repository;

import com.testproject.reqcrud.Entity.PostEntity;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<PostEntity, Integer>{
}
