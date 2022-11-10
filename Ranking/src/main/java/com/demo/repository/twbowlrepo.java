package com.demo.repository;

import com.demo.entity.twbowlentity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface twbowlrepo extends JpaRepository<twbowlentity,Integer> {

}
