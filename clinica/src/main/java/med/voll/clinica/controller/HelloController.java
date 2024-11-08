package med.voll.clinica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //esta classe é do tipo controller
@RequestMapping("/hello") //este é o endpoint do localhost
public class HelloController {
	
	@GetMapping //leia 
	@ResponseBody 
	public String hello() {
		return "hello world";
	}
	

}
