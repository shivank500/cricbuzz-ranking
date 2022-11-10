package com.demo.repository;

import com.demo.entity.obatentity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface obatrepo extends JpaRepository<obatentity,Integer>{

}
