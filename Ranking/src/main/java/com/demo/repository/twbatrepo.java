package com.demo.repository;

import com.demo.entity.twbatentity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface twbatrepo extends JpaRepository<twbatentity,Integer> {

}
