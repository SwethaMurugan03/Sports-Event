package com.springboot.Sports.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "participantstudent", catalog = "sem")
public class ParticipantModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String SportsName;
	private String Name;
	private String Email;
	private int Number;
	private String Gender;
	public ParticipantModel() {
		
	}
	public ParticipantModel(int id, String sportsName, String name, String email, int number, String gender) {
		super();
		this.id = id;
		SportsName = sportsName;
		Name = name;
		Email = email;
		Number = number;
		Gender = gender;
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
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getNumber() {
		return Number;
	}
	public void setNumber(int number) {
		Number = number;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	
	

}
