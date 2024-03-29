package com.java.vishal.shopping.application;

import com.java.vishal.shopping.framework.ShoppingFactory;
import com.java.vishal.shopping.framework.NormalAccount;
import com.java.vishal.shopping.framework.PrimeAccount;

public class GSShopFactory extends ShoppingFactory{

	@Override
	public PrimeAccount getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
		PrimeAccount primeacc = new GSPrimeAccount(accNo,accNm,charges,isPrime);
		return primeacc;
	}

	@Override
	public NormalAccount getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharges) {
		GSNormalAccount normalacc = new GSNormalAccount(accNo, accNm, charges, deliveryCharges);
		return normalacc;
	}
	

}
