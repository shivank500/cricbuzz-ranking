package com.demo.repository;

import com.demo.entity.tallrounderentity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface tallrounderrepo extends JpaRepository<tallrounderentity,Integer> {

}
