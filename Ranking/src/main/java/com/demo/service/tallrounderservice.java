package com.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.tallrounderentity;
import com.demo.repository.tallrounderrepo;

@Service
public class tallrounderservice {

	@Autowired 
	tallrounderrepo trepo;
	public String add(tallrounderentity oall) {
		
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
	
	public List<tallrounderentity> getall(){
		return trepo.findAll();
	}
}
