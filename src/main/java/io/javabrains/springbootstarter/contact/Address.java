package io.javabrains.springbootstarter.contact;

public class Address {
	
	private String street;
	private String city;
	private String state;
	private String zipe;
	
	public Address() {
		super();
	}
	public Address(String st, String city, String state, String zipe) {
		super();
		this.street = st;
		this.city = city;
		this.state = state;
		this.zipe = zipe;
	}
	
	
	public String getSt() {
		return street;
	}
	public void setSt(String st) {
		this.street = st;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipe() {
		return zipe;
	}
	public void setZipe(String zipe) {
		this.zipe = zipe;
	}
	

}
