package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class toentity {
	@Id
	@GeneratedValue
	private Integer id;
	private String teamName;
	private Integer ranking;
	private Integer points;
	private Integer Rating;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public Integer getRanking() {
		return ranking;
	}
	public void setRanking(Integer ranking) {
		this.ranking = ranking;
	}
	public toentity() {
		
	}
	public Integer getPoints() {
		return points;
	}
	public void setPoints(Integer points) {
		this.points = points;
	}
	public Integer getRating() {
		return Rating;
	}
	public void setRating(Integer rating) {
		Rating = rating;
	}
	public toentity(Integer id, String teamName, Integer ranking, Integer points, Integer rating) {
		super();
		this.id = id;
		this.teamName = teamName;
		this.ranking = ranking;
		this.points = points;
		Rating = rating;
	}
	

}
