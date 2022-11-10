package com.cricbuzz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminLogin extends JpaRepository<com.cricbuzz.entity.AdminLogin,Integer> 
{

}
