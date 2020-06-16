package io.javabrains.springbootstarter.hello;
import io.javabrains.springbootstarter.mapper.TestMapper;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	private TestMapper test;

	HelloController(TestMapper test){
		this.test = test;
	}
	
	//get request
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}

	@RequestMapping("/test")
	public String getMsg() { return test.getMsgById(1); }
}
