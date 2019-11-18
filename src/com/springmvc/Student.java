package com.springmvc;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	private String[] operatingSystems ;
	private String [] os = new String[3];
	
	public String[] getOs() {
		return os;
	}

	public void setOs(String[] os) {
		this.os = os;
	}

	private LinkedHashMap<String,String> countryOptions;
	
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public Student() {
		
		countryOptions = new LinkedHashMap();
		
		countryOptions.put("India", "India");
		countryOptions.put("france", "France");
		countryOptions.put("Brazil", "Brazil");
		countryOptions.put("Australia", "Australia");
		
		}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", country=" + country
				+ ", favoriteLanguage=" + favoriteLanguage + ", operatingSystems=" + Arrays.toString(operatingSystems)
				+ ", countryOptions=" + countryOptions + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	
	
	

}
