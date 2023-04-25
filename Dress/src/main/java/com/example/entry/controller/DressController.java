package com.example.entry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entry.dress.Dress;
import com.example.entry.service.DressService;

@RestController
public class DressController {

	@Autowired
	DressService dressService;
	
	@GetMapping("/fetch/{id}")
	public Dress getDetails(@PathVariable("id") int id) {
		return dressService.getDetails(id);
	}
	
	@GetMapping("/fetch")
	public List<Dress> getAllDetails() {
		return dressService.getAllDetails();
	}
	
	@PostMapping("/save")
	public Dress saveDetails(@RequestBody Dress d) {
		return dressService.saveDetails(d);
	}
	
	@PutMapping("/update")
	public Dress updateDetails(@RequestBody Dress d) {
		return dressService.updateDetails(d);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteDetails(@PathVariable("id") int id) {
		dressService.deleteDetails(id);
	}
}
