package com.java.vishal.shopping.application;

import com.java.vishal.shopping.framework.NormalAccount;

public class GSNormalAccount extends NormalAccount{
	private static final float deliveryCharges=269.0f;

	public GSNormalAccount(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
		// TODO Auto-generated constructor stub
	}
	
	public void bookProduct(float no) {
		float charges = getCharges()*no;
		System.out.println("No of Items Booked are: "+no+"With amount: "+charges+" and delivery charges: "+deliveryCharges);
		System.out.println("Total Amount: "+(charges+deliveryCharges));
	}

	@Override
	public String toString() {
		return "GSNormalAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	

}
