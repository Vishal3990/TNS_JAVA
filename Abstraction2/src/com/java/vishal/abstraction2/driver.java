package com.java.vishal.abstraction2;

public class driver {
		public static void main(String[] args) {
			Shape s;
			s = new Square(4);
			s.Area();
			s.show();
			
			s = new rectangle(5, 9);
			s.Area();
			s.show();
			
			s = new triangle(8,5);
	        s.Area();
			s.show();
		}
	}
