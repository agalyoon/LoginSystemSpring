package com.swtraining.imvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "countries")
public class Country {

	private int id;
	private String countryName;
	private String capitalName;
	
	public Country() {
		
	}
	
	public Country(String countryName, String capitalName) {
		this.countryName = countryName;
		this.capitalName = capitalName;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "country_name", nullable = false)
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	@Column(name = "capital_name", nullable = false)
	public String getCapitalName() {
		return capitalName;
	}
	public void setCapitalName(String capitalName) {
	this.capitalName = capitalName;
	}	
	
	@Override
	public String toString() {
		return "Country [id=" + id + ", countryName=" + countryName + ", capitalName=" + capitalName
				+ "]"+'\n';
	}
	
}
