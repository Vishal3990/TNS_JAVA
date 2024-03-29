package com.java.vishal.shopping.framework;

public abstract class ShoppingFactory {
	public abstract PrimeAccount getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime);
	public abstract NormalAccount getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharges);

}