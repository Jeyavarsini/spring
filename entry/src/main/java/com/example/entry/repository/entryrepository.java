package com.example.entry.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface entryrepository extends JpaRepository<entry, Integer> {

}
