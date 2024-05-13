package com.plm.test.testtask.v1.repository;

import com.plm.test.testtask.v1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
