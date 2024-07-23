package com.demo.SpringBootJSTLBootstrapJquery;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping("/")
	public String index() {
		return "index"; // resolve to WEB-INF/views/index.jsp
	}

}
