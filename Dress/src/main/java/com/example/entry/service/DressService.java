package com.example.entry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entry.dress.Dress;
import com.example.entry.repo.DressRepo;

@Service
public class DressService {

	@Autowired
	DressRepo dressrepo;
	
	public Dress getDetails(int id) {
		return dressrepo.findById(id).get();
	}
	public List<Dress> getAllDetails(){
		return dressrepo.findAll();
	}
	public Dress saveDetails(Dress d) {
		return dressrepo.save(d);
	}
	public Dress updateDetails(Dress d) {
		return dressrepo.save(d);
	}
	public void deleteDetails(int id) {
		dressrepo.deleteById(id);
	}
}
