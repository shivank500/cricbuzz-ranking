package com.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.tbatentity;
import com.demo.repository.tbatrepo;

@Service
public class tbatservice {
	@Autowired 
    tbatrepo trepo;
	public String add(tbatentity oall) {
		
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
	
	public List<tbatentity> getall(){
		return trepo.findAll();
	}
	

}
