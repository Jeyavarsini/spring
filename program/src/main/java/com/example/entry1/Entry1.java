package com.example.entry1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class Entry1 {
	public class entry1 {
		@GetMapping("/hi")
		@ResponseBody
	 public String welcome()
	 {
		return "welcome all";
	 }
}
