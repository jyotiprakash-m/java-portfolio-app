package com.demo.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MoonController {

	@GetMapping("/contact")
	public String getContactPage() {
		return "contact";
	}
	@GetMapping("/single")
	public String getSinglePage() {
		return "single";
	}
}
