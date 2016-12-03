package com.mycompany.type;

public class Student {
	private String id;
	private String name;
	private Sex sex;
	@Override
	public String toString(){
		return "id="+id+",name="+name+",sex="+sex;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Sex getSex() {
		return sex;
	}
	public void setSex(Sex sex) {
		this.sex = sex;
	}
}
