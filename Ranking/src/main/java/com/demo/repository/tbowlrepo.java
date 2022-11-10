package com.demo.repository;

import com.demo.entity.tbowlentity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface tbowlrepo extends JpaRepository<tbowlentity,Integer>{

}
