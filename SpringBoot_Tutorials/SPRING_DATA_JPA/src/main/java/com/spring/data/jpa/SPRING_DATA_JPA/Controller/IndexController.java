package com.spring.data.jpa.SPRING_DATA_JPA.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping({ "", "/", "/index" })
	public String getIndexPage() {
		return "index";
	}
}