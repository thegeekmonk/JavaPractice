package com.java.se.string;

public class StringTest1 
{

	public StringTest1() 
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String s1 = "Sachin";
		String s2 = new String("Sachin");
		
		String s3 = "Sachin";
		
		//comparing the content of both string using equals() method
		System.out.println("Both String are Equal : "+s1.equals(s2)); 
		
		//comparing string using '==' operator 
		System.out.println("Checking if s1 == s2 : "+(s1 == s2));
		
		//comparing string using '==' operator 
		System.out.println("Checking if s1 == s3 : "+(s1 == s3));
		
		//comparing string using compareTo() method 
		System.out.println("comparision using 'campareTo() : "+s1.compareTo(s2));
		
		
		StringBuffer sb = new StringBuffer("My name is Akhilesh");
		
		//reversing string using string buffer
		System.out.println("My name is Akhilesh reversal : "+sb.reverse());
		
		//reversing using String class test
		String st = "Hello";
		System.out.println("Hello Reversal : ");  //there is no method like reverse() in string class
		

	}

}
