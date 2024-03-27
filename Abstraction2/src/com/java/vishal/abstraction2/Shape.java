package com.java.vishal.abstraction2;

public abstract class Shape {
	 protected float area;
	     
	     //abstract method 
		 abstract void Area();
		 
		 //concrete method
		 void show()
		 {
			 System.out.println("Area of shape is "+area);
		 }

	}
