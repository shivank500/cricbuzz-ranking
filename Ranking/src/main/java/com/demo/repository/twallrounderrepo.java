package com.demo.repository;

import com.demo.entity.twallrounderentity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface twallrounderrepo extends JpaRepository<twallrounderentity,Integer> {

}
