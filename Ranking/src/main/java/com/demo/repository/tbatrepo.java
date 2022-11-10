package com.demo.repository;

import com.demo.entity.tbatentity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface tbatrepo extends JpaRepository<tbatentity,Integer>{

}
