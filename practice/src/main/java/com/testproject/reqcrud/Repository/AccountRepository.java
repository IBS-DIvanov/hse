package com.testproject.reqcrud.Repository;

import com.testproject.reqcrud.Entity.AccountEntity;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<AccountEntity, String>{
}
