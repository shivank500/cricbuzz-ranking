package com.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.twbowlentity;
import com.demo.repository.twbowlrepo;

@Service
public class twbowlservice {

	@Autowired 
    twbowlrepo twrepo;
	public String add(twbowlentity oall) {
		
		twrepo.save(oall);
		return "Ranking saved succefully";
	}
	
	public String delete(Integer id) {
		twrepo.deleteById(id);
		return "deleted successfully";
		
	}
	
	public String deleteall() {
		twrepo.deleteAll();
		return "all data is deleted";
	}
	
	public List<twbowlentity> getall(){
		return twrepo.findAll();
	}
}
