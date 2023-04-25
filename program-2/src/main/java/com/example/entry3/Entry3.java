package com.example.entry3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
 
@Controller
public class Entry3 {
      @Value("${carname:creta}")
	public String car;
	@GetMapping
	@ResponseBody
	public String displayCar()
	{
		return "My fav car "+car;
	}
}
