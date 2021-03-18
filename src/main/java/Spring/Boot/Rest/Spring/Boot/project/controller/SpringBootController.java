package Spring.Boot.Rest.Spring.Boot.project.controller;
import java.util.Date;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootController {
	@RequestMapping("/current-date")
	 public Date getCurrentDate() {
		Date date = new Date();
		return date;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/welcome")
	public String welcome(@RequestBody String name) {
		return "Welcome " + name;
		
	}
	
	

}
