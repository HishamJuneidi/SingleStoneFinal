package io.javabrains.springbootstarter.contact;

public class Name {
	private String first;
	private String middle;
	private String last;
	
	
	
	
	public Name() {
		super();
	}
	public Name(String first, String middle, String last) {
		super();
		this.first = first;
		this.middle = middle;
		this.last = last;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getMiddle() {
		return middle;
	}
	public void setMiddle(String middle) {
		this.middle = middle;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	

}
