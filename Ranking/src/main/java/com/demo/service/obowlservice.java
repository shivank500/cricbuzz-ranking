package com.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.obowlentity;
import com.demo.repository.obowlrepo;

@Service
public class obowlservice {

	@Autowired
	obowlrepo orepo;

	public String add(obowlentity oall) {
		
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
	
	public List<obowlentity> getall(){
		return orepo.findAll();
	}
}

