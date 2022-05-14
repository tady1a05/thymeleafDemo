package com.toby.thymeleafDemo.Controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/demo")
	public String demo(Model model) {
		model.addAttribute("currentDate", new Date());
		return "Demo";
	}
}
