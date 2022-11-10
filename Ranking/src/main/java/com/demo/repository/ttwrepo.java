package com.demo.repository;
import com.demo.entity.ttwentity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ttwrepo  extends JpaRepository<ttwentity,Integer> {

}
