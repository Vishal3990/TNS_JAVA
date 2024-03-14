package com.java.vishal;

public class Notepad {
		protected String content;

		public Notepad() {
			
			this.content = " ";
		}
		
		public void write(String text)
		{
			content+=text;
		}
		public void displayData()

		{
			System.out.println("Notepad content "+content);
		}
	}

