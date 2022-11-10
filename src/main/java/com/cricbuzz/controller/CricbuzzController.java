package com.cricbuzz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cricbuzz.dto.CricbuzzDTO;
import com.cricbuzz.entity.AdminLogin;
import com.cricbuzz.entity.CricbuzzEntity;
import com.cricbuzz.service.CricbuzzService;

@RestController
@CrossOrigin("*")
public class CricbuzzController {
	
	@Autowired
	CricbuzzService ser;
	
	@PostMapping("/add/profile")
	public String add(@RequestBody CricbuzzDTO dto) {
		ser.add(dto);
		return "Details added";
	}
    @GetMapping("/getall")
    public List<CricbuzzEntity> get() {
    	return ser.getall();
    	
    }
    @PostMapping("/modify")
    public String modify(@RequestBody CricbuzzDTO dto) {
    	return ser.modify(dto);	
    }
    @PostMapping("/admin")
	public String createAdmin(){
		ser.addAdmin();
		return "Details added";
	}
    @GetMapping("/admin")
    public List<AdminLogin> getAdmin() 
    {
    	return ser.getallAdmin();	
    }
}
