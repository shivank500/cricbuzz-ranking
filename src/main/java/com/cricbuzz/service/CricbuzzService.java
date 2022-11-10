package com.cricbuzz.service;

import java.util.List;
import java.util.Optional;

import com.cricbuzz.dto.CricbuzzDTO;
import com.cricbuzz.entity.AdminLogin;
import com.cricbuzz.entity.CricbuzzEntity;
import com.cricbuzz.repository.CricbuzzRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CricbuzzService {

	@Autowired
	CricbuzzRepository crepo;

	@Autowired
	com.cricbuzz.repository.AdminLogin adminRepo;

	@Autowired
	ModelMapper mapper;

	public String add(CricbuzzDTO dto) {
		CricbuzzEntity entity = mapper.map(dto, CricbuzzEntity.class);
		crepo.save(entity);

		return "Data added";
	}

	public String modify(CricbuzzDTO dto) {
		Optional<CricbuzzEntity> entity = crepo.findById(dto.getId());
		entity.get().setBattingStyle(dto.getBattingStyle());
		entity.get().setBirthPlace(dto.getBirthPlace());
		entity.get().setBowlingStyle(dto.getBowlingStyle());
		entity.get().setDob(dto.getDob());
		entity.get().setHeight(dto.getHeight());
		entity.get().setName(dto.getName());
		entity.get().setNickname(dto.getNickname());
		entity.get().setRole(dto.getRole());
		crepo.save(entity.get());
		return "Data modified";
	}

	public List<CricbuzzEntity> getall() {
		List<CricbuzzEntity> entity = crepo.findAll();
		return entity;

	}

	public void addAdmin() {
		List<AdminLogin> size = adminRepo.findAll();
		if (size.size() == 0) {
			AdminLogin adminLogin1 = new AdminLogin();
			adminLogin1.setLogin_id("1234");
			adminLogin1.setLogin_password("1234");
			adminRepo.save(adminLogin1);

			AdminLogin adminLogin2 = new AdminLogin();
			adminLogin2.setLogin_id("4567");
			adminLogin2.setLogin_password("4567");
			adminRepo.save(adminLogin2);

			AdminLogin adminLogin3 = new AdminLogin();
			adminLogin3.setLogin_id("7890");
			adminLogin3.setLogin_password("7890");
			adminRepo.save(adminLogin3);
		}
	}

	public List<AdminLogin> getallAdmin() {
		List<AdminLogin> addAdmin = adminRepo.findAll();
		return addAdmin;
	}
}
