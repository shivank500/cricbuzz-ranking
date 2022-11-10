package com.demo.repository;
import com.demo.entity.ttentity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ttrepo  extends JpaRepository<ttentity,Integer> {

}
