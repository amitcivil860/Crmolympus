package com.spring.crm.repo;

import com.spring.crm.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestRepo extends JpaRepository<User, Integer> {

}