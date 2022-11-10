package com.cricbuzz.repository;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cricbuzz.entity.CricbuzzEntity;

@Repository
public interface CricbuzzRepository extends JpaRepository<CricbuzzEntity,Integer>{
Optional<CricbuzzEntity> findByNameAndDob(String name,Date dob);
}
