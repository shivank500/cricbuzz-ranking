package com.demo.repository;

import com.demo.entity.oallrounderentity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface oallrounderrepo  extends JpaRepository<oallrounderentity,Integer>{

}
