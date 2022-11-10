package com.demo.repository;

import com.demo.entity.obowlentity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface obowlrepo extends JpaRepository<obowlentity,Integer> {

}
