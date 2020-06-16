package io.javabrains.springbootstarter.contact;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class Controller {

	@Autowired
	private TopicService topicservice;
	//get request
	@RequestMapping("/contacts")
	public List<Contact> getAllTopics() {
		return topicservice.getAllContact();
	}
	
	
	@RequestMapping("/contacts/{id}")
	public Contact getTopic(@PathVariable int id) {
		return topicservice.getContact(id);
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/contacts")
	public void addTopic(@RequestBody Contact topic) {
		
		topicservice.addContact(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/contacts/{id}")
	public void updateTopic(@RequestBody Contact topic, @PathVariable int id) {
		
		topicservice.updateContact(id, topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/contacts/{id}")
	public void deleteTopic(@PathVariable int id) {
		 topicservice.deleteContact(id);
		
	}
}
