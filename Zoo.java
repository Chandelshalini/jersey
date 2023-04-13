package com.demo.restdemo;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="zoo")
public class Zoo {
	@Id
	private int id;
	private int zooid;
	private String name;
	private String location;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getZooid() {
		return zooid;
	}
	public void setZooid(int zooid) {
		this.zooid = zooid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Zoo [id=" + id + ", zooid=" + zooid + ", name=" + name + ", location=" + location + "]";
	}
	
	

}
