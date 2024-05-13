package com.plm.test.testtask.v1.repository;

import com.plm.test.testtask.v1.model.Request;
import com.plm.test.testtask.v1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RequestRepository extends JpaRepository<Request, Long> {

    @Query("SELECT r.responsible, COUNT(r) " +
            "FROM Request r " +
            "GROUP BY r.responsible " +
            "ORDER BY COUNT(r) ASC")
    List<User> findUserWithFewestRequests();
}
