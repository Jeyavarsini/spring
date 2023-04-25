package com.example.entry.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entry.dress.Dress;

@Repository
public interface DressRepo extends JpaRepository<Dress, Integer>{
	
}
