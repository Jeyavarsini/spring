package com.example.entry2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Entry2 {
      public String name="jeya";
      @GetMapping("/setName")
      public String getName()
      {
    	  return "welcome "+name;
      }
}
