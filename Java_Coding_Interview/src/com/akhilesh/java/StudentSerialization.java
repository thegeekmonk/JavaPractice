package com.akhilesh.java;

import java.io.Serializable;

public class StudentSerialization implements Serializable
{
       int id;
       String name;
       transient int age;
       
       
	public StudentSerialization(int id, String name, int age) 
	{
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
       
       
}
