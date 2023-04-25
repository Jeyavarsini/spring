package com.example.demo.program;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Program {
	@Value("${car}")
	public String mycar;
	@GetMapping("/mycar")
	@ResponseBody
	public String display()
	{
		return "my fav car"+mycar;
	}

}
