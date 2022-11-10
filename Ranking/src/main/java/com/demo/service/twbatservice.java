package com.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.twbatentity;
import com.demo.repository.twbatrepo;

@Service
public class twbatservice {

	@Autowired 
    twbatrepo twrepo;
	public String add(twbatentity oall) {
		
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
	
	public List<twbatentity> getall(){
		return twrepo.findAll();
	}
}
