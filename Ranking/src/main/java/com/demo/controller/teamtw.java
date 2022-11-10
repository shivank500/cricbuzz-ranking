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

import com.demo.entity.ttwentity;
import com.demo.service.ttwservice;

@CrossOrigin
@RestController
@RequestMapping("/team/t20")
public class teamtw {

	@Autowired
	ttwservice tservice;
	
	@PostMapping("/add")
	public String  add(@RequestBody ttwentity oall) {
		
		return tservice.add(oall);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		return tservice.delete(id);
	}
	
	@DeleteMapping("/deletall")
	public String deleteall() {
		return tservice.deleteall();
	}
	
	@GetMapping("/getall")
	public List<ttwentity> get(){
		return tservice.getall();
	}
}
