package com.java.vishal.abstraction2;

	public class Square extends Shape{
		private float side;
		public Square()
		{
			side=2.0f;
		}
		public Square(float side)
		{
			this.side=side;
		}
		
		@Override
		void Area() {
			super.area=side*side;		
		}
	}