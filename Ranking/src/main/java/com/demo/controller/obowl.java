package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.obowlentity;
import com.demo.service.obowlservice;
@CrossOrigin
@RestController
@RequestMapping("/odi/bowl")
public class obowl {
	@Autowired
	obowlservice oservice;
	
	@PostMapping("/add")
	public String  add(@RequestBody obowlentity oall) {
		
		return oservice.add(oall);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		return oservice.delete(id);
	}
	
	@DeleteMapping("/deletall")
	public String deleteall() {
		return oservice.deleteall();
	}
	
	@GetMapping("/getall")
	public List<obowlentity> get(){
		return oservice.getall();
	}

}
