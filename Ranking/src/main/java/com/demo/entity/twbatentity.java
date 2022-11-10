package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class twbatentity {

	@Id 
	@GeneratedValue
	private Integer id;
	private String name;
	private Integer ranking;
	private Integer points;
	private String team;
	public twbatentity(Integer id, String name, Integer ranking, Integer points, String team) {
		super();
		this.id = id;
		this.name = name;
		this.ranking = ranking;
		this.points = points;
		this.team = team;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRanking() {
		return ranking;
	}
	public void setRanking(Integer ranking) {
		this.ranking = ranking;
	}
	
	public Integer getPoints() {
		return points;
	}
	public void setPoints(Integer points) {
		this.points = points;
	}
	public twbatentity(Integer id, String name, Integer ranking, Integer points) {
		super();
		this.id = id;
		this.name = name;
		this.ranking = ranking;
		this.points = points;
	}
	public twbatentity() {
		
	}
}
