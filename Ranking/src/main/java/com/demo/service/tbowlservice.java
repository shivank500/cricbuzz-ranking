package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.tbowlentity;
import com.demo.repository.tbowlrepo;

@Service
public class tbowlservice {

	@Autowired 
    tbowlrepo trepo;
	public String add(tbowlentity oall) {
		
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
	
	public List<tbowlentity> getall(){
		return trepo.findAll();
	}
}
