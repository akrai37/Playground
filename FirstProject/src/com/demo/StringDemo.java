package com.demo; //String class are immutable.Hpowever, we can use 'StringBuilder' if we have to make changes in our original content. 

public class StringDemo {
	public static void main(String[] args) {
       
		String str1="welcome"; //it is a stack memory.
		String str2=new String("welcome"); //it is a heap memory.
		System.out.println(str1.length());
		System.out.println(str1.charAt(3));
		System.out.println(str1.substring(2,5));
		//str1.concat(str2);  --> It is gonna give error because the change will directly affect 'str1' string. We need to create another variable to store the.cont 
		String str3=str1.concat(str2); //concatination value.
		System.out.println(str3);
		
		System.out.println(str1.equals(str2)); //It checks only the characters of the strings. Here, the return value will be true.
		System.out.println(str1==str2);       //It checks both the characters and memory of the strings. Here, the return value will be false.
		
		//If we want our String objects to be mutable, then we can use 'Stringbuffer'.
		StringBuffer sb=new StringBuffer(str1);
		sb.append(" to Java");
		System.out.println(sb);
		System.out.println(sb.reverse());
	}
}

//1.If you want the methods to be synchronized, go for 'StringBuffer', if you want asynchronized methods, go for 'StringBuilder'.  
//2.Synchronization in java is the capability to control the access of multiple threads to any shared resource.
//  Java Synchronization is better option where we want to allow only one thread to access the shared resource.

