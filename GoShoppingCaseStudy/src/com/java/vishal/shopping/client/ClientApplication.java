package com.java.vishal.shopping.client;

import com.java.vishal.shopping.framework.ShoppingFactory;
import com.java.vishal.shopping.framework.PrimeAccount;
import com.java.vishal.shopping.framework.NormalAccount;
import java.util.Scanner;
import com.java.vishal.shopping.application.GSNormalAccount;
import com.java.vishal.shopping.application.GSPrimeAccount;
import com.java.vishal.shopping.application.GSShopFactory;

public class ClientApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ShoppingFactory sf = new GSShopFactory();
		int[] prod_id = {1,2,3,4,5};
		String[] prod_name  = {"Headphones","Smartphones","SmartWatch","Backpack","Gaming Mouse"};
		float[] price = {1499,24999,5999,1999,899};
		System.out.println("Product ID\tProduct Name\tPrice");
		for(int i=0;i<5;i++) {
			System.out.println(prod_id[i]+"\t\t"+prod_name[i]+"\t"+price[i]);
		}
		

		System.out.println("Account Type: [Normal/Prime]: ");
		String type = sc.next();
		if(type.equalsIgnoreCase("prime")) {
			System.out.println("For Prime Account: ");
			System.out.println("Enter Account Number: ");
			int accno = sc.nextInt();
			System.out.println("Enter Account holder's name: ");
			String accnm = sc.next();
			System.out.println("Prime Subscription type[premium/prime]: ");
			String sub_type = sc.next();
			System.out.println("Enter Product ID to Purchase: ");
			int pid = sc.nextInt();
			System.out.println("Enter Quantity: ");
			float qty = sc.nextFloat();
			if(sub_type.equalsIgnoreCase("premium")) {
			PrimeAccount pc= new GSPrimeAccount(accno, accnm, price[pid-1], true);
			pc.bookProduct(qty);
			pc.toString();}
			else if(sub_type.equalsIgnoreCase("prime")){
				PrimeAccount pc= new GSPrimeAccount(accno, accnm, price[pid-1], false);
				pc.bookProduct(qty);
				pc.toString();
			}
			else {
				System.err.println("Not Valid");
			}
		}
		else if(type.equalsIgnoreCase("normal")) {
			System.out.println("For Normal Account: ");
			System.out.println("Enter Account Number: ");
			int accno = sc.nextInt();
			System.out.println("Enter Account holder's name: ");
			String accnm = sc.next();
			System.out.println("Enter Product ID to Purchase: ");
			int pid = sc.nextInt();
			NormalAccount nc = new GSNormalAccount(accno, accnm, price[pid-1], 269);
			System.out.println("Enter Quantity: ");
			float qty = sc.nextFloat();
			nc.bookProduct(qty);
			nc.toString();
			
		}
		else {
			System.err.println("Not Valid");
		}
		sc.close();
	}

}
