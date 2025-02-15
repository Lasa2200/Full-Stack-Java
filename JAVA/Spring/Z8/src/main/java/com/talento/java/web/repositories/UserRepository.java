package com.talento.java.web.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.talento.java.web.models.User;



@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	 User findByEmail(String email);

}
