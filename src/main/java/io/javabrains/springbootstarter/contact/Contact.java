package io.javabrains.springbootstarter.contact;
import java.util.List;
import java.lang.Math; 


public class Contact {

	private int id;
	private Name name;
	private Address address;
	private List<Phone> phone;
	private Email email;
	
	
	public Contact() {
		
		
	}
	
	
	public Contact(Name name, Address address, List<Phone> phone, Email email) {
		super();
		this.id = (int) (Math.random() * 1000);
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Name getName() {
		return name;
	}


	public void setName(Name name) {
		this.name = name;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public List<Phone> getPhone() {
		return phone;
	}


	public void setPhone(List<Phone> phone) {
		this.phone = phone;
	}
	
	public Email getEmail() {
		return email;
	}


	public void setEmail(Email email) {
		this.email = email;
	}
	
	
}
