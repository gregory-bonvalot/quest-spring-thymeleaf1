package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
/*import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;*/
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	@GetMapping("/")
    public String home() {
        return "index";
    }
	/*@GetMapping("/doctor")
	public String home(Model model,
	                   @RequestParam(value="doctorname",
	                           required=false,
	                           defaultValue="John Smith") String doctorname
	) {
	    model.addAttribute("doctorname", doctorname);

	    return "doctor";
	} */
}
