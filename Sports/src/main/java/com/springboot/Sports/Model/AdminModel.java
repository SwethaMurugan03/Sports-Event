package com.springboot.Sports.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Organizer", catalog = "sem")
public class AdminModel{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String SportsName;
	private String CollegeName;
	private String Location;
	public AdminModel() {
		
	}
	public AdminModel(int id, String sportsName, String collegeName, String location) {
		
		this.id = id;
		SportsName = sportsName;
		CollegeName = collegeName;
		Location = location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSportsName() {
		return SportsName;
	}
	public void setSportsName(String sportsName) {
		SportsName = sportsName;
	}
	public String getCollegeName() {
		return CollegeName;
	}
	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	
	

}