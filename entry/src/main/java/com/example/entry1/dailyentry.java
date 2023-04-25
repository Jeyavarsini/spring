package com.example.entry1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="entry")
public class dailyentry {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private int id;
	
	private String name;
	private int age;
	private String dep;
	private int time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "dailyentry [id=" + id + ", name=" + name + ", age=" + age + ", dep=" + dep + ", time=" + time + "]";
	}
	

}
