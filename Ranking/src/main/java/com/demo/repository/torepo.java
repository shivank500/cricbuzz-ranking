package com.demo.repository;

import com.demo.entity.toentity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface torepo extends JpaRepository<toentity,Integer> {

}
