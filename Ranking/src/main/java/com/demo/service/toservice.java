package com.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.toentity;
import com.demo.repository.torepo;

@Service
public class toservice {
	
	@Autowired
	torepo trepo;
	
     public String add(toentity oall) {
		
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
	
	public List<toentity> getall(){
		return trepo.findAll();
	}

}
