package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ttwentity {

	@Id
	@GeneratedValue
	private Integer id;
	private String teamName;
	private Integer ranking;
	private Integer points;
	private Integer ratings;
	public Integer getPoints() {
		return points;
	}
	public void setPoints(Integer points) {
		this.points = points;
	}
	public Integer getRatings() {
		return ratings;
	}
	public void setRatings(Integer ratings) {
		this.ratings = ratings;
	}
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
	public ttwentity() {
		
	}
	public ttwentity(Integer id, String teamName, Integer ranking, Integer points, Integer ratings) {
		super();
		this.id = id;
		this.teamName = teamName;
		this.ranking = ranking;
		this.points = points;
		this.ratings = ratings;
	}
	
}
