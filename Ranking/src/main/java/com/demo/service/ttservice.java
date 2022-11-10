package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.ttentity;
import com.demo.repository.ttrepo;

@Service
public class ttservice {

	@Autowired
	ttrepo trepo;
	
     public String add(ttentity oall) {
		
		trepo.save(oall);
		return "Ranking saved succefully";
	}
	
	public String delete(Integer id) {
		trepo.deleteById(id);
		return "deleted successfully";
		
	}
	
	public String deleteall() {
		trepo.deleteAll();
		return "all data is deleted";
	}
	
	public List<ttentity> getall(){
		return trepo.findAll();
	}
}
