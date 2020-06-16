package io.javabrains.springbootstarter.contact;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class TopicService {
	
	
	private List<Contact> contact = new ArrayList<>(Arrays.asList(
			new Contact(new Name("Hisham","Y","Juneidi"),new Address("8360 High Autumn Row","Cannon","Delaware","19797"), Arrays.asList(new Phone("302-611-9148","home"),new Phone("302-532-9427","mobile")), new Email("harold.gilkey@yahoo.com") )
			
			));
	public List<Contact> getAllContact(){
		return contact;
	}
	
	public Contact getContact(int id) {
		return contact.stream().filter(t -> t.getId() == id).findFirst().get();
	}
	
	public void addContact(Contact topic) {
		contact.add(topic);
	}
	
	public void updateContact(int id, Contact topic) {
		
		for(int i = 0; i < contact.size();i++) {
			Contact t = contact.get(i);
			if(t.getId() == id) {
				contact.set(i, topic);
				return;
			}
		}
	}
	
	public void deleteContact(int id) {
		contact.removeIf(t -> t.getId() == id);
		
	}
}
