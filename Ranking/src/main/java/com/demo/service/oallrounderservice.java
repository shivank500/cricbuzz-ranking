package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.oallrounderentity;
import com.demo.repository.oallrounderrepo;

@Service
public class oallrounderservice {
	
	@Autowired 
	oallrounderrepo orepo;
	public String add(oallrounderentity oall) {
		
		orepo.save(oall);
		return "Ranking saved succefully";
	}
	
	public String delete(Integer id) {
		orepo.deleteById(id);
		return "deleted successfully";
		
	}
	
	public String deleteall() {
		orepo.deleteAll();
		return "all data is deleted";
	}
	
	public List<oallrounderentity> getall(){
		return orepo.findAll();
	}

}
