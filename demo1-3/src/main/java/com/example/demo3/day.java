package com.example.demo3;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class day {
private int id;
@JsonIgnore
private String name;
private String age;
public day(int id,String name,String age) {
	super();
	this.id=id;
	this.name=name;
	this.age=age;
}
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
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String toString() {
	return "day[id="+id+",name="+name+",age="+age+"]";
}
}
