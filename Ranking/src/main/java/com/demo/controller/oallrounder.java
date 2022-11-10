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

import com.demo.entity.oallrounderentity;
import com.demo.service.oallrounderservice;
@CrossOrigin
@RestController
@RequestMapping("/odi/allrounder")
public class oallrounder {

	@Autowired
	oallrounderservice oservice;
	
	@PostMapping("/add")
	public String  add(@RequestBody oallrounderentity oall) {
		
		return oservice.add(oall);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		return oservice.delete(id);
	}
	
	@DeleteMapping("/deleteall")
	public String deleteall() {
		return oservice.deleteall();
	}
	
	@GetMapping("/getall")
	public List<oallrounderentity> get(){
		return oservice.getall();
	}
} 
