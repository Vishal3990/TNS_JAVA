package com.java.vishal.abstraction2;

public class rectangle extends Shape {
		private float lenght, breadth;

		public rectangle() {
			this.lenght = 5.0f;
			this.breadth = 2.0f;
		}

		public rectangle(float width, float height) {
			this.lenght = width;
			this.breadth = height;
		}

		@Override
		void Area() {
			area=lenght*breadth;		
		}

	}
