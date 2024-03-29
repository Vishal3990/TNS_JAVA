package com.java.vishal.shopping.application;

import com.java.vishal.shopping.framework.PrimeAccount;
public class GSPrimeAccount extends PrimeAccount{

	public GSPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}
	
	public void bookProduct(float no) {
		if(isPrime()) {
		System.out.println("No of Items Booked with Premium Account are: Rs "+no+" With amount: Rs"+getCharges()*no);}
		else {
			float charges = getCharges()*no;
			float deliverycharges = 269f*0.7f;
			System.err.println("Upgrade to Premium Subscription for Free Delivery\n70% of delivery Charges will be apllied this time");
			System.out.println("No of Items Booked from Prime Account are: Rs "+no+" With amount: "+charges+" and delivery charges: "+deliverycharges);
			System.out.println("Total Amount: "+(charges+deliverycharges));
		}
		
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	
	
	
}
