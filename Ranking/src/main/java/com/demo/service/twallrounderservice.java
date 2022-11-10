package com.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.twallrounderentity;
import com.demo.repository.twallrounderrepo;

@Service
public class twallrounderservice {

	@Autowired 
    twallrounderrepo twrepo;
	public String add(twallrounderentity oall) {
		
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
	
	public List<twallrounderentity> getall(){
		return twrepo.findAll();
	}
}
