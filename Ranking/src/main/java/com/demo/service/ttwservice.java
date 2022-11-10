package com.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.ttwentity;
import com.demo.repository.ttwrepo;

@Service
public class ttwservice {

	@Autowired
	ttwrepo trepo;
	
     public String add(ttwentity oall) {
		
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
	
	public List<ttwentity> getall(){
		return trepo.findAll();
	}
}
