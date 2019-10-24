package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DoctorController {
    @GetMapping("/doctor")
	public String home(Model model,
			@RequestParam(value="doctorname",
	        		required=false,
	                defaultValue="John Smith") String doctorname,
			@RequestParam(value="num",
    		required=false,
            defaultValue="0") String num
			) {
	    		model.addAttribute("doctorname", doctorname);
	    		model.addAttribute("num", num);
	    		return "doctor";
	}
}
